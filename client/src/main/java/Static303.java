import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!jka", name = "l", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_126 = new Class227(9, 10);

	@OriginalMember(owner = "client!jka", name = "r", descriptor = "I")
	public static int anInt4884 = 0;

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IB)V")
	public static void method4435(@OriginalArg(0) int arg0) {
		if (!Static470.method6394()) {
			return;
		}
		if (Static129.anInt2418 != arg0) {
			Static319.aString51 = "";
		}
		Static129.anInt2418 = arg0;
		Static405.aClass153_1.method3274();
		Static81.method1586(5);
	}

	@OriginalMember(owner = "client!jka", name = "g", descriptor = "(I)I")
	public static int method4436() {
		@Pc(13) Class82 local13 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			return Static580.aClass82_186.method2148();
		}
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(Lclient!ge;B)Lclient!gha;")
	public static Class138_Sub2 method4437(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(15) Class138 local15 = Static632.method8366(arg0);
		@Pc(19) int local19 = arg0.method7356();
		@Pc(23) int local23 = arg0.method7356();
		@Pc(27) int local27 = arg0.method7389();
		return new Class138_Sub2(local15.aClass405_10, local15.aClass103_10, local15.anInt4436, local15.anInt4425, local15.anInt4431, local15.anInt4426, local15.anInt4429, local15.anInt4428, local15.anInt4434, local19, local23, local27);
	}
}
