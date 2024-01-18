import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class ClientStream implements Runnable {

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!oba;")
	private PrivilegedRequest thread;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "[B")
	private byte[] buffer;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Z")
	private boolean closed = false;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	private int writePointer = 0;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
	private int readPointer = 0;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Z")
	private boolean error = false;

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Lclient!vq;")
	private final signlink sign;

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket socket;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "Ljava/io/InputStream;")
	private InputStream in;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream out;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vq;I)V")
	public ClientStream(@OriginalArg(0) Socket socket, @OriginalArg(1) signlink sign, @OriginalArg(2) int capacity) throws IOException {
		this.sign = sign;
		this.socket = socket;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.in = this.socket.getInputStream();
		this.out = this.socket.getOutputStream();
		this.capacity = capacity;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	public void method5830() throws IOException {
		if (!this.closed && this.error) {
			this.error = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)I")
	public int read() throws IOException {
		return this.closed ? 0 : this.in.read();
	}

	@OriginalMember(owner = "client!nk", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				close: {
					@Pc(38) int len;
					@Pc(26) int off;
					synchronized (this) {
						if (this.readPointer == this.writePointer) {
							if (this.closed) {
								break close;
							}
							try {
								this.wait();
							} catch (@Pc(22) InterruptedException ignored) {
							}
						}
						off = this.readPointer;
						if (this.writePointer >= this.readPointer) {
							len = this.writePointer - this.readPointer;
						} else {
							len = this.capacity - this.readPointer;
						}
					}
					if (len <= 0) {
						continue;
					}
					try {
						this.out.write(this.buffer, off, len);
					} catch (@Pc(66) IOException ignored) {
						this.error = true;
					}
					this.readPointer = (this.readPointer + len) % this.capacity;
					try {
						if (this.writePointer == this.readPointer) {
							this.out.flush();
						}
					} catch (@Pc(89) IOException ignored) {
						this.error = true;
					}
					continue;
				}
				try {
					if (this.in != null) {
						this.in.close();
					}
					if (this.out != null) {
						this.out.close();
					}
					if (this.socket != null) {
						this.socket.close();
					}
				} catch (@Pc(117) IOException ignored) {
				}
				this.buffer = null;
				break;
			}
		} catch (@Pc(122) Exception ex) {
			TracingException.report(ex, null);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBI[B)V")
	public void read(@OriginalArg(0) int len, @OriginalArg(2) int off, @OriginalArg(3) byte[] src) throws IOException {
		if (this.closed) {
			return;
		}
		while (len > 0) {
			@Pc(22) int n = this.in.read(src, off, len);
			if (n <= 0) {
				throw new EOFException();
			}
			off += n;
			len -= n;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	public void method5833() {
		if (!this.closed) {
			this.in = new BrokenInputStream();
			this.out = new BrokenOutputStream();
		}
	}

	@OriginalMember(owner = "client!nk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.close();
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
	public int available() throws IOException {
		return this.closed ? 0 : this.in.available();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[BB)V")
	public void method5836(@OriginalArg(0) int off, @OriginalArg(1) int len, @OriginalArg(2) byte[] src) throws IOException {
		if (this.closed) {
			return;
		}
		if (this.error) {
			this.error = false;
			throw new IOException();
		}
		if (this.buffer == null) {
			this.buffer = new byte[this.capacity];
		}
		synchronized (this) {
			for (@Pc(40) int i = 0; i < len; i++) {
				this.buffer[this.writePointer] = src[off + i];
				this.writePointer = (this.writePointer + 1) % this.capacity;
				if ((this.capacity + this.readPointer - 100) % this.capacity == this.writePointer) {
					throw new IOException();
				}
			}
			if (this.thread == null) {
				this.thread = this.sign.startThread(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(I)V")
	public void close() {
		if (this.closed) {
			return;
		}
		synchronized (this) {
			this.closed = true;
			this.notifyAll();
		}
		if (this.thread != null) {
			while (this.thread.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (this.thread.status == 1) {
				try {
					((Thread) this.thread.result).join();
				} catch (@Pc(60) InterruptedException ignored) {
				}
			}
		}
		this.thread = null;
	}
}
