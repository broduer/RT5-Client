import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class AudioThread implements Runnable {

	@OriginalMember(owner = "client!faa", name = "g", descriptor = "Lclient!vq;")
	public signlink sign;

	@OriginalMember(owner = "client!faa", name = "f", descriptor = "[Lclient!cd;")
	public final AudioChannel[] channels = new AudioChannel[2];

	@OriginalMember(owner = "client!faa", name = "h", descriptor = "Z")
	public volatile boolean stop = false;

	@OriginalMember(owner = "client!faa", name = "e", descriptor = "Z")
	public volatile boolean running = false;

	@OriginalMember(owner = "client!faa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.running = true;
		try {
			while (!this.stop) {
				for (@Pc(12) int i = 0; i < 2; i++) {
					@Pc(21) AudioChannel channel = this.channels[i];
					if (channel != null) {
						channel.cycle();
					}
				}
				ThreadUtils.sleep(10L);
				GameShell.flush(this.sign, null);
			}
		} catch (@Pc(49) Exception ex) {
			TracingException.report(ex, null);
		} finally {
			@Pc(59) Object local59 = null;
			this.running = false;
		}
	}
}
