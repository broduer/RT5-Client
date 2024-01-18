import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	public static void method2272() {
		Static584.aBoolean658 = true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method2273(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (arg1.length() > 320 || !Static470.method4471()) {
			return;
		}
		Static405.aClass153_1.method2338();
		Static367.method3725();
		Static59.aString63 = arg0;
		Static449.aString75 = arg1;
		Static81.method1020(5);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public static void method2274() {
		@Pc(7) Class83 local7 = null;
		try {
			@Pc(13) Class270 local13 = Static446.aClass390_6.method6422("2");
			while (local13.anInt6789 == 0) {
				Static638.method5959(1L);
			}
			if (local13.anInt6789 == 1) {
				local7 = (Class83) local13.anObject13;
				@Pc(41) byte[] local41 = new byte[(int) local7.method1395()];
				@Pc(57) int local57;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local57) {
					local57 = local7.method1397(local41.length - local43, local41, local43);
					if (local57 == -1) {
						throw new IOException("EOF");
					}
				}
				Static618.method5886(new Class2_Sub21(local41));
			}
		} catch (@Pc(88) Exception local88) {
		}
		try {
			if (local7 != null) {
				local7.method1392();
			}
		} catch (@Pc(100) Exception local100) {
		}
	}
}
