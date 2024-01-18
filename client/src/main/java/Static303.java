import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!jka", name = "l", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_126 = new Class225(9, 10);

	@OriginalMember(owner = "client!jka", name = "r", descriptor = "I")
	public static int anInt4868 = 0;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)V")
	public static void method3083(@OriginalArg(0) int arg0) {
		if (!Static470.method4471()) {
			return;
		}
		if (Static129.anInt2409 != arg0) {
			Static319.aString51 = "";
		}
		Static129.anInt2409 = arg0;
		Static405.aClass153_1.method2338();
		Static81.method1020(5);
	}

	@OriginalMember(owner = "client!jka", name = "g", descriptor = "(I)I")
	public static int method3084() {
		@Pc(13) Class82 local13 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			return Static580.aClass82_186.method1382();
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!ge;B)Lclient!gha;")
	public static Class138_Sub2 method3085(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(15) Class138 local15 = Static632.method5923(arg0);
		@Pc(19) int local19 = arg0.method5158();
		@Pc(23) int local23 = arg0.method5158();
		@Pc(27) int local27 = arg0.method5191();
		return new Class138_Sub2(local15.aClass403_10, local15.aClass103_10, local15.anInt4423, local15.anInt4412, local15.anInt4418, local15.anInt4413, local15.anInt4416, local15.anInt4415, local15.anInt4421, local19, local23, local27);
	}
}
