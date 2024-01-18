import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class228 implements Runnable {

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "Lclient!sia;")
	private final Class341 aClass341_32 = new Class341();

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "Ljava/lang/Thread;")
	private Thread aThread4 = new Thread(this);

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "()V")
	public Class228() {
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!lha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class341 local8 = this.aClass341_32;
			@Pc(43) Class2_Sub12 local43;
			synchronized (this.aClass341_32) {
				@Pc(15) Node local15;
				for (local15 = this.aClass341_32.method7712(); local15 == null; local15 = this.aClass341_32.method7712()) {
					try {
						this.aClass341_32.wait();
					} catch (@Pc(23) InterruptedException local23) {
					}
				}
				if (!(local15 instanceof Class2_Sub12)) {
					return;
				}
				local43 = (Class2_Sub12) local15;
			}
			@Pc(69) int local69;
			try {
				@Pc(54) byte[] local54 = InetAddress.getByName(local43.aString14).getAddress();
				local69 = jagmisc.ping(local54[0], local54[1], local54[2], local54[3], 1000L);
			} catch (@Pc(71) Throwable local71) {
				local69 = 1000;
			}
			local43.anInt1638 = local69;
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I)V")
	public void method5250() {
		if (this.aThread4 == null) {
			return;
		}
		this.method5251(new Node());
		try {
			this.aThread4.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread4 = null;
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!ie;)V")
	private void method5251(@OriginalArg(1) Node arg0) {
		@Pc(2) Class341 local2 = this.aClass341_32;
		synchronized (this.aClass341_32) {
			this.aClass341_32.method7718(arg0);
			this.aClass341_32.notify();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(BLjava/lang/String;)Lclient!cja;")
	public Class2_Sub12 method5252(@OriginalArg(1) String arg0) {
		if (this.aThread4 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(32) Class2_Sub12 local32 = new Class2_Sub12(arg0);
			this.method5251(local32);
			return local32;
		}
	}
}
