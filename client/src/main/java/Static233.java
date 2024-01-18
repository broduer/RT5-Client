import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!sb;")
	public static Class330 aClass330_52;

	@OriginalMember(owner = "client!he", name = "c", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_17 = new Class155(16);

	@OriginalMember(owner = "client!he", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray90 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!he", name = "g", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_104 = new Class225(115, 8);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)V")
	public static void method2445(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(14) Class254[] local14 = Static527.aClass254Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class254 local22 = local14[local16];
			if (local22 != null && local22.anInt6363 == 2) {
				Static143.method2576(local22.anInt6365 * 2, local22.anInt6369, arg0 >> 1, local22.anInt6362, local22.anInt6368, arg3 >> 1);
				if (Static215.anIntArray284[0] > -1 && Static333.anInt5455 % 20 < 10) {
					@Pc(76) Class23 local76 = Static28.aClass23Array1[local22.anInt6367];
					@Pc(84) int local84 = arg2 + Static215.anIntArray284[0] - 12;
					@Pc(92) int local92 = Static215.anIntArray284[1] + arg1 - 28;
					local76.a(local84, local92);
					Static682.method6378(local92, local76.a() + local92, local84, local76.b() + local84);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	public static void method2447(@OriginalArg(1) boolean arg0) {
		@Pc(12) Class153[] local12 = Static405.aClass153Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class153 local19 = local12[local14];
			local19.method2338();
		}
		Static707.method6651();
		Static352.method3642();
		Static563.method5260();
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static577.aClass110Array1[local36].method1665();
		}
		Static668.method6207(false);
		System.gc();
		Static312.method3171();
		Static588.anInt8692 = -1;
		Static501.aBoolean575 = false;
		Static550.method5095();
		Static609.method5797(true);
		Static300.method3053();
		Static723.method6829();
		Static187.method1952();
		if (arg0) {
			Static81.method1020(13);
			return;
		}
		Static81.method1020(3);
		try {
			Static727.method54("loggedout", Static166.anApplet1);
		} catch (@Pc(86) Throwable local86) {
		}
	}
}
