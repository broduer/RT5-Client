import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	public static int anInt1125;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!pg;I)V")
	public static void method732(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static693.aClass339_79.aClass2_271) {
			return;
		}
		@Pc(16) int local16 = arg1.anInt7316;
		@Pc(19) int local19 = arg1.anInt7313;
		@Pc(22) int local22 = arg1.anInt7314;
		@Pc(26) int local26 = (int) arg1.aLong233;
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(35) long local35 = arg1.aLong233;
		if (local22 == 44) {
			@Pc(44) Class8_Sub2_Sub1_Sub2_Sub1 local44 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26];
			if (local44 != null) {
				Static481.anInt7215 = 0;
				Static676.anInt10206 = arg2;
				Static616.anInt9417 = 2;
				Static305.anInt4882 = arg0;
				@Pc(64) Class2_Sub19 local64 = Static293.method3000(Static664.aClass345_115, Static405.aClass153_2.aClass186_1);
				local64.aClass2_Sub21_Sub2_1.method5171(local26);
				local64.aClass2_Sub21_Sub2_1.method5187(Static450.anInt6819);
				local64.aClass2_Sub21_Sub2_1.method5182(Static162.anInt2799);
				local64.aClass2_Sub21_Sub2_1.method5217(Static334.aClass319_1.method6033(82) ? 1 : 0);
				local64.aClass2_Sub21_Sub2_1.method5179(Static77.anInt1614);
				Static405.aClass153_2.method2339(local64);
				Static147.method1617(0, local44.anIntArray878[0], local44.method6693((byte) 99), true, local44.anIntArray879[0], 0, -2, local44.method6693((byte) 110));
			}
		}
		@Pc(147) Class2_Sub19 local147;
		if (local22 == 4) {
			Static616.anInt9417 = 2;
			Static305.anInt4882 = arg0;
			Static481.anInt7215 = 0;
			Static676.anInt10206 = arg2;
			local147 = Static293.method3000(Static664.aClass345_115, Static405.aClass153_2.aClass186_1);
			local147.aClass2_Sub21_Sub2_1.method5171(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10740);
			local147.aClass2_Sub21_Sub2_1.method5187(Static450.anInt6819);
			local147.aClass2_Sub21_Sub2_1.method5182(Static162.anInt2799);
			local147.aClass2_Sub21_Sub2_1.method5217(Static334.aClass319_1.method6033(82) ? 1 : 0);
			local147.aClass2_Sub21_Sub2_1.method5179(Static77.anInt1614);
			Static405.aClass153_2.method2339(local147);
		}
		if (local22 == 12) {
			@Pc(197) Class158 local197 = Static15.method119(local16, local19);
			if (local197 != null) {
				Static470.method4468();
				@Pc(206) Class2_Sub41 local206 = Static84.method1081(local197);
				Static389.method3878(local206.method4320(), local197, local206.anInt6904);
				Static153.aString27 = Static380.method3801(local197);
				Static128.aString108 = local197.aString41 + "<col=ffffff>";
				if (Static153.aString27 == null) {
					Static153.aString27 = "Null";
				}
			}
			return;
		}
		if (local22 == 58) {
			if (Static608.anInt9290 > 0 && Static334.aClass319_1.method6033(82) && Static334.aClass319_1.method6033(81)) {
				Static624.method5900(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, Static116.anInt2270 + local19, Static691.anInt10367 + local16);
			} else {
				local147 = Static32.method430(local16, local19, local26);
				if (local26 == 1) {
					local147.aClass2_Sub21_Sub2_1.method5198(-1);
					local147.aClass2_Sub21_Sub2_1.method5198(-1);
					local147.aClass2_Sub21_Sub2_1.method5182((int) Static171.aFloat64);
					local147.aClass2_Sub21_Sub2_1.method5198(57);
					local147.aClass2_Sub21_Sub2_1.method5198(Static29.anInt723);
					local147.aClass2_Sub21_Sub2_1.method5198(Static660.anInt9835);
					local147.aClass2_Sub21_Sub2_1.method5198(89);
					local147.aClass2_Sub21_Sub2_1.method5182(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690);
					local147.aClass2_Sub21_Sub2_1.method5182(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694);
					local147.aClass2_Sub21_Sub2_1.method5198(63);
				} else {
					Static305.anInt4882 = arg0;
					Static616.anInt9417 = 1;
					Static481.anInt7215 = 0;
					Static676.anInt10206 = arg2;
				}
				Static405.aClass153_2.method2339(local147);
				Static147.method1617(0, local19, 1, true, local16, 0, -4, 1);
			}
		}
		if (local22 == 10 && Static390.aClass158_9 == null) {
			Static479.method4530(local16, local19);
			Static390.aClass158_9 = Static15.method119(local16, local19);
			Static178.method1859(Static390.aClass158_9);
		}
		@Pc(389) Class345 local389 = null;
		if (local22 == 2) {
			local389 = Static424.aClass345_79;
		} else if (local22 == 22) {
			local389 = Static53.aClass345_7;
		} else if (local22 == 52) {
			local389 = Static412.aClass345_74;
		} else if (local22 == 30) {
			local389 = Static587.aClass345_104;
		} else if (local22 == 53) {
			local389 = Static675.aClass345_118;
		} else if (local22 == 9) {
			local389 = Static173.aClass345_30;
		} else if (local22 == 51) {
			local389 = Static273.aClass345_55;
		} else if (local22 == 15) {
			local389 = Static494.aClass345_89;
		} else if (local22 == 48) {
			local389 = Static571.aClass345_103;
		} else if (local22 == 16) {
			local389 = Static470.aClass345_88;
		}
		@Pc(494) Class2_Sub19 local494;
		if (local389 != null) {
			@Pc(474) Class8_Sub2_Sub1_Sub2_Sub1 local474 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26];
			if (local474 != null) {
				Static481.anInt7215 = 0;
				Static305.anInt4882 = arg0;
				Static616.anInt9417 = 2;
				Static676.anInt10206 = arg2;
				local494 = Static293.method3000(local389, Static405.aClass153_2.aClass186_1);
				local494.aClass2_Sub21_Sub2_1.method5198(Static334.aClass319_1.method6033(82) ? 1 : 0);
				local494.aClass2_Sub21_Sub2_1.method5182(local26);
				Static405.aClass153_2.method2339(local494);
				Static147.method1617(0, local474.anIntArray878[0], local474.method6693((byte) 125), true, local474.anIntArray879[0], 0, -2, local474.method6693((byte) 60));
			}
		}
		@Pc(548) Class345 local548 = null;
		if (local22 == 25) {
			local548 = Static235.aClass345_48;
		} else if (local22 == 5) {
			local548 = Static405.aClass345_73;
		} else if (local22 == 50) {
			local548 = Static631.aClass345_120;
		} else if (local22 == 6) {
			local548 = Static555.aClass345_99;
		} else if (local22 == 45) {
			local548 = Static87.aClass345_17;
		} else if (local22 == 1007) {
			local548 = Static214.aClass345_39;
		}
		if (local548 != null) {
			Static305.anInt4882 = arg0;
			Static481.anInt7215 = 0;
			Static616.anInt9417 = 2;
			Static676.anInt10206 = arg2;
			local494 = Static293.method3000(local548, Static405.aClass153_2.aClass186_1);
			local494.aClass2_Sub21_Sub2_1.method5202(local26);
			local494.aClass2_Sub21_Sub2_1.method5198(Static334.aClass319_1.method6033(82) ? 1 : 0);
			local494.aClass2_Sub21_Sub2_1.method5182(local19 + Static116.anInt2270);
			local494.aClass2_Sub21_Sub2_1.method5171(Static691.anInt10367 + local16);
			Static405.aClass153_2.method2339(local494);
			Static414.method4030(local19, local16);
		}
		if (local22 == 11) {
			if (Static608.anInt9290 > 0 && Static334.aClass319_1.method6033(82) && Static334.aClass319_1.method6033(81)) {
				Static624.method5900(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, Static116.anInt2270 + local19, Static691.anInt10367 + local16);
			} else {
				Static481.anInt7215 = 0;
				Static676.anInt10206 = arg2;
				Static616.anInt9417 = 1;
				Static305.anInt4882 = arg0;
				local494 = Static293.method3000(Static512.aClass345_96, Static405.aClass153_2.aClass186_1);
				local494.aClass2_Sub21_Sub2_1.method5179(local19 + Static116.anInt2270);
				local494.aClass2_Sub21_Sub2_1.method5171(Static691.anInt10367 + local16);
				Static405.aClass153_2.method2339(local494);
			}
		}
		if (local22 == 18) {
			@Pc(741) Class158 local741 = Static15.method119(local16, local19);
			if (local741 != null) {
				Static312.method3172(local741);
			}
		}
		@Pc(750) Class345 local750 = null;
		if (local22 == 49) {
			local750 = Static297.aClass345_59;
		} else if (local22 == 59) {
			local750 = Static546.aClass345_97;
		} else if (local22 == 47) {
			local750 = Static131.aClass345_25;
		} else if (local22 == 57) {
			local750 = Static305.aClass345_60;
		} else if (local22 == 3) {
			local750 = Static420.aClass345_78;
		} else if (local22 == 1011) {
			local750 = Static591.aClass345_107;
		}
		if (local750 != null) {
			@Pc(806) Class2_Sub45 local806 = (Class2_Sub45) Static18.aClass28_2.method373((long) local26);
			if (local806 != null) {
				Static676.anInt10206 = arg2;
				@Pc(813) Class8_Sub2_Sub1_Sub2_Sub2 local813 = local806.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static616.anInt9417 = 2;
				Static305.anInt4882 = arg0;
				Static481.anInt7215 = 0;
				@Pc(831) Class2_Sub19 local831 = Static293.method3000(local750, Static405.aClass153_2.aClass186_1);
				local831.aClass2_Sub21_Sub2_1.method5193(Static334.aClass319_1.method6033(82) ? 1 : 0);
				local831.aClass2_Sub21_Sub2_1.method5202(local26);
				Static405.aClass153_2.method2339(local831);
				Static147.method1617(0, local813.anIntArray878[0], local813.method6693((byte) 76), true, local813.anIntArray879[0], 0, -2, local813.method6693((byte) 103));
			}
		}
		@Pc(878) Class345 local878 = null;
		if (local22 == 19) {
			local878 = Static57.aClass345_10;
		} else if (local22 == 13) {
			local878 = Static180.aClass345_33;
		} else if (local22 == 46) {
			local878 = Static402.aClass345_72;
		} else if (local22 == 8) {
			local878 = Static185.aClass345_35;
		} else if (local22 == 1010) {
			local878 = Static236.aClass345_50;
		} else if (local22 == 1008) {
			local878 = Static342.aClass345_61;
		}
		@Pc(949) Class2_Sub19 local949;
		if (local878 != null) {
			Static305.anInt4882 = arg0;
			Static616.anInt9417 = 2;
			Static481.anInt7215 = 0;
			Static676.anInt10206 = arg2;
			local949 = Static293.method3000(local878, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method5193(Static334.aClass319_1.method6033(82) ? 1 : 0);
			local949.aClass2_Sub21_Sub2_1.method5202(Static691.anInt10367 + local16);
			local949.aClass2_Sub21_Sub2_1.method5179((int) (local35 >>> 32) & Integer.MAX_VALUE);
			local949.aClass2_Sub21_Sub2_1.method5171(local19 + Static116.anInt2270);
			Static405.aClass153_2.method2339(local949);
			Static38.method538(local16, local35, local19);
		}
		if (local22 == 1003 || local22 == 1001 || local22 == 1006 || local22 == 1009 || local22 == 1004) {
			Static578.method5388(local16, local26, local22);
		}
		if (local22 == 21) {
			Static676.anInt10206 = arg2;
			Static616.anInt9417 = 1;
			Static305.anInt4882 = arg0;
			Static481.anInt7215 = 0;
			local949 = Static293.method3000(Static181.aClass345_34, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method5202(Static691.anInt10367 + local16);
			local949.aClass2_Sub21_Sub2_1.method5171(Static162.anInt2799);
			local949.aClass2_Sub21_Sub2_1.method5159(Static450.anInt6819);
			local949.aClass2_Sub21_Sub2_1.method5202(Static116.anInt2270 + local19);
			local949.aClass2_Sub21_Sub2_1.method5182(Static77.anInt1614);
			Static405.aClass153_2.method2339(local949);
			Static147.method1617(0, local19, 1, true, local16, 0, -4, 1);
		}
		if (local22 == 17) {
			Static616.anInt9417 = 2;
			Static481.anInt7215 = 0;
			Static305.anInt4882 = arg0;
			Static676.anInt10206 = arg2;
			local949 = Static293.method3000(Static175.aClass345_31, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method5182(local16 + Static691.anInt10367);
			local949.aClass2_Sub21_Sub2_1.method5182(Static116.anInt2270 + local19);
			local949.aClass2_Sub21_Sub2_1.method5179(Static162.anInt2799);
			local949.aClass2_Sub21_Sub2_1.method5156(Static450.anInt6819);
			local949.aClass2_Sub21_Sub2_1.method5171(Static77.anInt1614);
			local949.aClass2_Sub21_Sub2_1.method5198(Static334.aClass319_1.method6033(82) ? 1 : 0);
			local949.aClass2_Sub21_Sub2_1.method5171(local26);
			Static405.aClass153_2.method2339(local949);
			Static414.method4030(local19, local16);
		}
		if (local22 == 23) {
			@Pc(1200) Class2_Sub45 local1200 = (Class2_Sub45) Static18.aClass28_2.method373((long) local26);
			if (local1200 != null) {
				@Pc(1205) Class8_Sub2_Sub1_Sub2_Sub2 local1205 = local1200.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static481.anInt7215 = 0;
				Static616.anInt9417 = 2;
				Static676.anInt10206 = arg2;
				Static305.anInt4882 = arg0;
				@Pc(1223) Class2_Sub19 local1223 = Static293.method3000(Static503.aClass345_94, Static405.aClass153_2.aClass186_1);
				local1223.aClass2_Sub21_Sub2_1.method5179(Static77.anInt1614);
				local1223.aClass2_Sub21_Sub2_1.method5171(Static162.anInt2799);
				local1223.aClass2_Sub21_Sub2_1.method5171(local26);
				local1223.aClass2_Sub21_Sub2_1.method5156(Static450.anInt6819);
				local1223.aClass2_Sub21_Sub2_1.method5198(Static334.aClass319_1.method6033(82) ? 1 : 0);
				Static405.aClass153_2.method2339(local1223);
				Static147.method1617(0, local1205.anIntArray878[0], local1205.method6693((byte) 44), true, local1205.anIntArray879[0], 0, -2, local1205.method6693((byte) 50));
			}
		}
		if (local22 == 20 || local22 == 1002) {
			Static120.method1422(local19, local16, arg1.aString86, local26);
		}
		if (local22 == 60) {
			Static676.anInt10206 = arg2;
			Static481.anInt7215 = 0;
			Static305.anInt4882 = arg0;
			Static616.anInt9417 = 2;
			local949 = Static293.method3000(Static419.aClass345_77, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method5150(Static334.aClass319_1.method6033(82) ? 1 : 0);
			local949.aClass2_Sub21_Sub2_1.method5171(Static116.anInt2270 + local19);
			local949.aClass2_Sub21_Sub2_1.method5171(Static77.anInt1614);
			local949.aClass2_Sub21_Sub2_1.method5187(Static450.anInt6819);
			local949.aClass2_Sub21_Sub2_1.method5179(Static162.anInt2799);
			local949.aClass2_Sub21_Sub2_1.method5171(local16 + Static691.anInt10367);
			local949.aClass2_Sub21_Sub2_1.method5202(Integer.MAX_VALUE & (int) (local35 >>> 32));
			Static405.aClass153_2.method2339(local949);
			Static38.method538(local16, local35, local19);
		}
		if (Static156.aBoolean223) {
			Static470.method4468();
		}
		if (Static67.aClass158_10 != null && Static499.anInt7501 == 0) {
			Static178.method1859(Static67.aClass158_10);
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)Z")
	public static boolean method733(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
