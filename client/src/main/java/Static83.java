import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!cla", name = "a", descriptor = "(IILclient!ge;)V")
	public static void method1028(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		if (Static690.aClass243_5 == null) {
			return;
		}
		try {
			Static690.aClass243_5.method3950(0L);
			Static690.aClass243_5.method3943(arg0, 24, arg1.aByteArray93);
		} catch (@Pc(23) Exception local23) {
		}
	}
}
