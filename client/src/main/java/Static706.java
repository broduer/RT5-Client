import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static706 {

	@OriginalMember(owner = "client!wfa", name = "W", descriptor = "F")
	public static float aFloat217;

	@OriginalMember(owner = "client!wfa", name = "U", descriptor = "[Lclient!s;")
	public static Class178[] aClass178Array3;

	@OriginalMember(owner = "client!wfa", name = "T", descriptor = "I")
	public static int anInt10661;

	@OriginalMember(owner = "client!wfa", name = "Q", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_255 = new Class227(105, -1);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IILclient!gp;III)V")
	public static void method9227(@OriginalArg(0) int arg0, @OriginalArg(2) Class150 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1 || arg2 < 1 || arg4 > Static720.anInt10888 - 2 || Static501.anInt7591 - 2 < arg2) {
			return;
		}
		if (Static334.aClass293ArrayArrayArray1 == null) {
			return;
		}
		@Pc(52) Interface25 local52 = Static2.aClass308_Sub1_1.method7903(arg4, arg2, arg3, arg0);
		if (local52 == null) {
			return;
		}
		if (local52 instanceof Class8_Sub2_Sub1_Sub4) {
			((Class8_Sub2_Sub1_Sub4) local52).method6167(arg1);
			return;
		}
		if (!(local52 instanceof Class8_Sub2_Sub2_Sub2)) {
			if (local52 instanceof Class8_Sub2_Sub3_Sub1) {
				((Class8_Sub2_Sub3_Sub1) local52).method1963(arg1);
			} else if (local52 instanceof Class8_Sub2_Sub4_Sub2) {
				((Class8_Sub2_Sub4_Sub2) local52).method6869(arg1);
				return;
			}
			return;
		}
		((Class8_Sub2_Sub2_Sub2) local52).method3581(arg1);
		return;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BLclient!bn;I)V")
	public static void method9228(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7215();
		if (arg0 == null) {
			Static100.method1988();
		}
		Static719.aClass56_5.method3592();
		Static522.method7048(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBII)Z")
	public static boolean method9231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static107.aClass73_3.method7131(arg2, arg1, arg0, Static35.anIntArray58);
		@Pc(13) int local13 = Static35.anIntArray58[2];
		if (local13 < 50) {
			return false;
		} else {
			Static35.anIntArray58[0] = Static35.anIntArray58[0] * Static1.anInt10826 / local13 + Static460.anInt6991;
			Static35.anIntArray58[2] = local13;
			Static35.anIntArray58[1] = Static407.anInt6306 + Static412.anInt6377 * Static35.anIntArray58[1] / local13;
			return true;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method9232(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static327.anInt5411 >= 200 && !Static126.aBoolean200 || Static327.anInt5411 >= 200) {
			Static67.method6105(Static32.aClass32_11.method877(Static51.anInt1056));
			return;
		}
		@Pc(34) String local34 = Static390.method5499(arg0);
		if (local34 == null) {
			return;
		}
		@Pc(81) String local81;
		for (@Pc(40) int local40 = 0; local40 < Static327.anInt5411; local40++) {
			@Pc(47) String local47 = Static390.method5499(Static330.aStringArray25[local40]);
			if (local47 != null && local47.equals(local34)) {
				Static67.method6105(arg0 + Static32.aClass32_38.method877(Static51.anInt1056));
				return;
			}
			if (Static572.aStringArray42[local40] != null) {
				local81 = Static390.method5499(Static572.aStringArray42[local40]);
				if (local81 != null && local81.equals(local34)) {
					Static67.method6105(arg0 + Static32.aClass32_38.method877(Static51.anInt1056));
					return;
				}
			}
		}
		for (@Pc(115) int local115 = 0; local115 < Static436.anInt3860; local115++) {
			local81 = Static390.method5499(Static632.aStringArray44[local115]);
			if (local81 != null && local81.equals(local34)) {
				Static67.method6105(Static32.aClass32_43.method877(Static51.anInt1056) + arg0 + Static32.aClass32_44.method877(Static51.anInt1056));
				return;
			}
			if (Static10.aStringArray1[local115] != null) {
				@Pc(161) String local161 = Static390.method5499(Static10.aStringArray1[local115]);
				if (local161 != null && local161.equals(local34)) {
					Static67.method6105(Static32.aClass32_43.method877(Static51.anInt1056) + arg0 + Static32.aClass32_44.method877(Static51.anInt1056));
					return;
				}
			}
		}
		if (Static390.method5499(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9).equals(local34)) {
			Static67.method6105(Static32.aClass32_41.method877(Static51.anInt1056));
			return;
		}
		@Pc(230) Class153 local230 = Static668.method8708();
		@Pc(236) Class2_Sub19 local236 = Static293.method4342(Static669.aClass347_116, local230.aClass186_1);
		local236.aClass2_Sub21_Sub2_1.method7396(Static231.method3379(arg0));
		local236.aClass2_Sub21_Sub2_1.method7398(arg0);
		local230.method3275(local236);
	}
}