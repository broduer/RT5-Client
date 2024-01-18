import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cka", name = "x", descriptor = "[Lclient!hv;")
	public static Class8_Sub5[] aClass8_Sub5Array1;

	@OriginalMember(owner = "client!cka", name = "q", descriptor = "I")
	public static int anInt1644;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)V")
	public static void method1020(@OriginalArg(0) int arg0) {
		if (Static283.anInt4574 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static670.method6232();
		}
		if (arg0 != 14 && Static467.aClass348_2 != null) {
			Static467.aClass348_2.method5623();
			Static467.aClass348_2 = null;
		}
		if (arg0 == 3) {
			Static456.method4332(Static65.aClass3_1.anInt88 != Static377.anInt5930);
		}
		if (arg0 == 7) {
			Static25.method323(Static65.aClass3_1.anInt82 != Static377.anInt5930);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static369.method2710();
		} else if (arg0 == 6 || arg0 == 9 && Static283.anInt4574 != 10) {
			Static670.method6232();
		}
		if (Static594.method5521(Static283.anInt4574)) {
			Static6.aClass330_1.anInt8555 = 2;
			Static20.aClass330_3.anInt8555 = 2;
			Static459.aClass330_91.anInt8555 = 2;
			Static333.aClass330_66.anInt8555 = 2;
			Static380.aClass330_79.anInt8555 = 2;
			Static668.aClass330_119.anInt8555 = 2;
			Static271.aClass330_59.anInt8555 = 2;
		}
		if (Static594.method5521(arg0)) {
			Static593.anInt8763 = 0;
			Static357.anInt6508 = 1;
			Static440.anInt6683 = 1;
			Static213.anInt3472 = 0;
			Static13.anInt150 = 0;
			Static668.method6207(true);
			Static6.aClass330_1.anInt8555 = 1;
			Static20.aClass330_3.anInt8555 = 1;
			Static459.aClass330_91.anInt8555 = 1;
			Static333.aClass330_66.anInt8555 = 1;
			Static380.aClass330_79.anInt8555 = 1;
			Static668.aClass330_119.anInt8555 = 1;
			Static271.aClass330_59.anInt8555 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static314.method3185();
		}
		@Pc(213) boolean local213 = arg0 == 2 || Static41.method562(arg0) || Static620.method5890(arg0);
		@Pc(235) boolean local235 = Static283.anInt4574 == 2 || Static41.method562(Static283.anInt4574) || Static620.method5890(Static283.anInt4574);
		if (local235 != local213) {
			if (local213) {
				Static588.anInt8692 = Static597.anInt8821;
				if (Static400.aClass2_Sub34_28.aClass57_Sub25_4.method5049() == 0) {
					Static312.method3171();
				} else {
					Static57.method740(Static597.anInt8821, Static400.aClass2_Sub34_28.aClass57_Sub25_4.method5049(), Static398.aClass330_81);
					Static550.method5095();
				}
				Static500.aClass295_3.method4655(false);
			} else {
				Static312.method3171();
				Static500.aClass295_3.method4655(true);
			}
		}
		if (Static594.method5521(arg0) || arg0 == 14 || arg0 == 15) {
			Static163.aClass19_17.h();
		}
		Static283.anInt4574 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Lclient!aj;")
	public static Class2_Sub2_Sub2 method1021() {
		@Pc(17) Class2_Sub2_Sub2 local17 = (Class2_Sub2_Sub2) Static138.aClass192_6.method3017();
		if (local17 != null) {
			local17.a((byte) 73);
			local17.method6674();
			return local17;
		}
		do {
			local17 = (Class2_Sub2_Sub2) Static59.aClass192_9.method3017();
			if (local17 == null) {
				return null;
			}
			if (local17.method129() > Static588.method5469()) {
				return null;
			}
			local17.a((byte) 114);
			local17.method6674();
		} while ((local17.aLong325 & Long.MIN_VALUE) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
	public static void method1023() {
		Static345.method3531();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V")
	public static void method1025(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class2_Sub19 local8 = Static273.method2769();
		local8.aClass2_Sub21_Sub2_1.method5198(Static572.aClass167_58.anInt3973);
		local8.aClass2_Sub21_Sub2_1.method5182(0);
		@Pc(25) int local25 = local8.aClass2_Sub21_Sub2_1.anInt8388;
		local8.aClass2_Sub21_Sub2_1.method5182(667);
		@Pc(38) int[] local38 = Static664.method6169(local8);
		@Pc(42) int local42 = local8.aClass2_Sub21_Sub2_1.anInt8388;
		local8.aClass2_Sub21_Sub2_1.method5200(arg0);
		local8.aClass2_Sub21_Sub2_1.method5182(Static323.anInt5121);
		local8.aClass2_Sub21_Sub2_1.method5200(arg2);
		local8.aClass2_Sub21_Sub2_1.method5172(Static416.aLong208);
		local8.aClass2_Sub21_Sub2_1.method5198(Static51.anInt1052);
		local8.aClass2_Sub21_Sub2_1.method5198(Static392.aClass377_4.anInt9720);
		Static176.method4703(local8.aClass2_Sub21_Sub2_1);
		@Pc(81) String local81 = Static389.aString64;
		local8.aClass2_Sub21_Sub2_1.method5198(local81 == null ? 0 : 1);
		if (local81 != null) {
			local8.aClass2_Sub21_Sub2_1.method5200(local81);
		}
		local8.aClass2_Sub21_Sub2_1.method5198(arg1);
		local8.aClass2_Sub21_Sub2_1.method5198(arg3 ? 1 : 0);
		local8.aClass2_Sub21_Sub2_1.anInt8388 += 7;
		local8.aClass2_Sub21_Sub2_1.method5175(local38, local42, local8.aClass2_Sub21_Sub2_1.anInt8388);
		local8.aClass2_Sub21_Sub2_1.method5166(local8.aClass2_Sub21_Sub2_1.anInt8388 - local25);
		Static405.aClass153_1.method2339(local8);
		Static720.anInt10865 = 0;
		Static580.anInt8621 = -3;
		Static654.anInt9739 = 0;
		Static6.anInt95 = 1;
		if (arg1 < 13) {
			Static477.aBoolean543 = true;
			Static358.method6619();
		}
	}
}
