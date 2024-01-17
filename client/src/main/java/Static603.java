import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static603 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!taa", name = "O", descriptor = "Ljava/lang/Class;")
	public static Class aClass22;

	@OriginalMember(owner = "client!taa", name = "H", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray18 = new int[2][][];

	@OriginalMember(owner = "client!taa", name = "E", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_109 = new Class347(29, -1);

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(Z)V")
	public static void method7906() {
		Static178.method2729(Static109.aClass158_3);
		Static181.anInt3012++;
		if (Static702.aBoolean798 && Static343.aBoolean428) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static137.aBoolean210) {
				local30 = Static130.method2283();
				local32 = Static422.method5778();
			}
			@Pc(46) int local46 = local30 + Static189.aClass120_1.method8860();
			@Pc(52) int local52 = Static189.aClass120_1.method8861() + local32;
			local46 -= Static378.anInt5961;
			local52 -= Static150.anInt2640;
			if (Static123.anInt2350 > local46) {
				local46 = Static123.anInt2350;
			}
			if (Static109.aClass158_3.anInt3813 + local46 > Static123.anInt2350 - -Static354.aClass158_8.anInt3813) {
				local46 = Static354.aClass158_8.anInt3813 + Static123.anInt2350 - Static109.aClass158_3.anInt3813;
			}
			if (local52 < Static169.anInt2862) {
				local52 = Static169.anInt2862;
			}
			if (Static169.anInt2862 + Static354.aClass158_8.anInt3756 < local52 - -Static109.aClass158_3.anInt3756) {
				local52 = Static169.anInt2862 + Static354.aClass158_8.anInt3756 - Static109.aClass158_3.anInt3756;
			}
			@Pc(119) int local119 = Static354.aClass158_8.anInt3820 + local46 - Static123.anInt2350;
			@Pc(127) int local127 = Static354.aClass158_8.anInt3778 + local52 - Static169.anInt2862;
			@Pc(197) Class2_Sub42 local197;
			if (Static189.aClass120_1.method8851()) {
				if (Static109.aClass158_3.anInt3808 < Static181.anInt3012) {
					@Pc(141) int local141 = local46 - Static655.anInt9789;
					@Pc(146) int local146 = local52 - Static115.anInt2267;
					if (Static109.aClass158_3.anInt3764 < local141 || -Static109.aClass158_3.anInt3764 > local141 || Static109.aClass158_3.anInt3764 < local146 || local146 < -Static109.aClass158_3.anInt3764) {
						Static172.aBoolean246 = true;
					}
				}
				if (Static109.aClass158_3.anObjectArray30 != null && Static172.aBoolean246) {
					local197 = new Class2_Sub42();
					local197.aClass158_14 = Static109.aClass158_3;
					local197.anInt7239 = local119;
					local197.anInt7235 = local127;
					local197.anObjectArray36 = Static109.aClass158_3.anObjectArray30;
					Static472.method6427(local197);
					return;
				}
			} else {
				if (Static172.aBoolean246) {
					Static470.method6391();
					if (Static109.aClass158_3.anObjectArray5 != null) {
						local197 = new Class2_Sub42();
						local197.aClass158_13 = Static327.aClass158_7;
						local197.anInt7239 = local119;
						local197.aClass158_14 = Static109.aClass158_3;
						local197.anInt7235 = local127;
						local197.anObjectArray36 = Static109.aClass158_3.anObjectArray5;
						Static472.method6427(local197);
					}
					if (Static327.aClass158_7 != null && Static84.method1657(Static109.aClass158_3) != null) {
						Static710.method6717(Static109.aClass158_3, Static327.aClass158_7);
					}
				} else if ((Static219.anInt3559 == 1 || Static204.method3084()) && Static594.anInt8801 > 2) {
					Static455.method6230(Static378.anInt5961 + Static655.anInt9789, Static115.anInt2267 + Static150.anInt2640);
				} else if (Static77.method1559()) {
					Static455.method6230(Static655.anInt9789 + Static378.anInt5961, Static115.anInt2267 + Static150.anInt2640);
				}
				Static109.aClass158_3 = null;
			}
		} else if (Static181.anInt3012 > 1) {
			Static109.aClass158_3 = null;
		}
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLclient!fu;Lclient!ha;Lclient!el;)V")
	public static void method7909(@OriginalArg(1) Class2_Sub20 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(8) Class23 local8 = arg2.method2428(arg1);
		if (local8 == null) {
			return;
		}
		@Pc(15) int local15 = local8.method8206();
		if (local8.method8189() > local15) {
			local15 = local8.method8189();
		}
		@Pc(31) int local31 = arg0.anInt3139;
		@Pc(34) int local34 = arg0.anInt3131;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		@Pc(56) int local56;
		@Pc(78) int local78;
		if (arg2.aString25 != null) {
			local36 = Static154.aClass383_6.method8747(Static37.aStringArray5, null, null, arg2.aString25);
			for (local56 = 0; local56 < local36; local56++) {
				@Pc(61) String local61 = Static37.aStringArray5[local56];
				if (local56 < local36 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static142.aClass329_1.method7546(local61);
				if (local78 > local38) {
					local38 = local78;
				}
			}
			local40 = Static142.aClass329_1.method7543() * local36 + Static142.aClass329_1.method7545() / 2;
		}
		local56 = local15 / 2 + arg0.anInt3139;
		if (local31 < Static30.anInt5669 + local15) {
			local56 = local15 / 2 + Static30.anInt5669 + local38 / 2 + 15;
			local31 = Static30.anInt5669;
		} else if (Static30.anInt5671 - local15 < local31) {
			local31 = Static30.anInt5671 - local15;
			local56 = Static30.anInt5671 - local15 / 2 - local38 / 2 - 10 - 5;
		}
		@Pc(163) int local163 = arg0.anInt3131;
		if (local15 + Static30.anInt5673 > local34) {
			local163 = Static30.anInt5673 + local15 / 2 + 10;
			local34 = Static30.anInt5673;
		} else if (Static30.anInt5666 - local15 < local34) {
			local163 = Static30.anInt5666 - local15 / 2 - local40 - 10;
			local34 = Static30.anInt5666 - local15;
		}
		local78 = (int) (Math.atan2(local31 - arg0.anInt3139, local34 - arg0.anInt3131) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local8.method8193((float) local31 + (float) local15 / 2.0F, (float) local34 + (float) local15 / 2.0F, 4096, local78);
		@Pc(246) int local246 = -2;
		@Pc(248) int local248 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		if (arg2.aString25 != null) {
			local246 = local56 - local38 / 2 - 5;
			local248 = local163;
			local257 = local38 + local246 + 10;
			local259 = Static142.aClass329_1.method7543() * local36 + local163 + 3;
			if (arg2.anInt2614 != 0) {
				arg1.method7978(local257 - local246, local259 - local163, local163, local246, arg2.anInt2614);
			}
			if (arg2.anInt2617 != 0) {
				arg1.method7952(local163, arg2.anInt2617, local257 - local246, local259 - local163, local246);
			}
			for (@Pc(333) int local333 = 0; local333 < local36; local333++) {
				@Pc(338) String local338 = Static37.aStringArray5[local333];
				if (local36 - 1 > local333) {
					local338 = local338.substring(0, local338.length() - 4);
				}
				Static142.aClass329_1.method7547(arg1, local338, local56, local163, arg2.anInt2601);
				local163 += Static142.aClass329_1.method7543();
			}
		}
		if (arg2.anInt2605 == -1 && arg2.aString25 == null) {
			return;
		}
		local15 >>= 0x1;
		@Pc(393) Class2_Sub37 local393 = new Class2_Sub37(arg0);
		local393.anInt6210 = local15 + local31;
		local393.anInt6207 = local259;
		local393.anInt6212 = local246;
		local393.anInt6215 = local31 - local15;
		local393.anInt6211 = local34 + local15;
		local393.anInt6206 = local34 - local15;
		local393.anInt6204 = local248;
		local393.anInt6205 = local257;
		Static551.aClass341_54.method7718(local393);
	}
}
