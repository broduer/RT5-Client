import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class ThreadUtils {
	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(JZ)V")
	public static void sleep(@OriginalArg(0) long millis) {
		if (millis <= 0L) {
			return;
		}
		if (millis % 10L == 0L) {
			sleepUninterruptibly(millis - 1L);
			sleepUninterruptibly(1L);
		} else {
			sleepUninterruptibly(millis);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JB)V")
	public static void sleepUninterruptibly(@OriginalArg(0) long millis) {
		try {
			Thread.sleep(millis);
		} catch (@Pc(12) InterruptedException ignored) {
		}
	}
}
