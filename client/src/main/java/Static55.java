import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!br", name = "B", descriptor = "I")
	public static int anInt1129;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "I")
	public static int anInt1128 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IILclient!pg;I)V")
	public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(2) SecondaryNode_Sub16 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static693.aClass341_79.sentinel) {
			return;
		}
		@Pc(16) int local16 = arg1.anInt7337;
		@Pc(19) int local19 = arg1.anInt7334;
		@Pc(22) int local22 = arg1.anInt7335;
		@Pc(26) int local26 = (int) arg1.aLong233;
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(35) long local35 = arg1.aLong233;
		if (local22 == 44) {
			@Pc(44) Class8_Sub2_Sub1_Sub2_Sub1 local44 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26];
			if (local44 != null) {
				Static481.anInt7236 = 0;
				Static676.anInt10234 = arg2;
				Static616.anInt9443 = 2;
				Static305.anInt4898 = arg0;
				@Pc(64) Node_Sub19 local64 = Static293.method4342(Static664.aClass347_115, Static405.aClass153_2.aClass186_1);
				local64.aClass2_Sub21_Sub2_1.method7369(local26);
				local64.aClass2_Sub21_Sub2_1.method7385(Static450.anInt6840);
				local64.aClass2_Sub21_Sub2_1.p2(Static162.anInt2808);
				local64.aClass2_Sub21_Sub2_1.method7415(Static334.aClass321_1.method8486(82) ? 1 : 0);
				local64.aClass2_Sub21_Sub2_1.method7377(Static77.anInt1621);
				Static405.aClass153_2.method3275(local64);
				Static147.method2419(0, local44.anIntArray878[0], local44.method9309((byte) 99), true, local44.anIntArray879[0], 0, -2, local44.method9309((byte) 110));
			}
		}
		@Pc(147) Node_Sub19 local147;
		if (local22 == 4) {
			Static616.anInt9443 = 2;
			Static305.anInt4898 = arg0;
			Static481.anInt7236 = 0;
			Static676.anInt10234 = arg2;
			local147 = Static293.method4342(Static664.aClass347_115, Static405.aClass153_2.aClass186_1);
			local147.aClass2_Sub21_Sub2_1.method7369(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10768);
			local147.aClass2_Sub21_Sub2_1.method7385(Static450.anInt6840);
			local147.aClass2_Sub21_Sub2_1.p2(Static162.anInt2808);
			local147.aClass2_Sub21_Sub2_1.method7415(Static334.aClass321_1.method8486(82) ? 1 : 0);
			local147.aClass2_Sub21_Sub2_1.method7377(Static77.anInt1621);
			Static405.aClass153_2.method3275(local147);
		}
		if (local22 == 12) {
			@Pc(197) Class158 local197 = Static15.method186(local16, local19);
			if (local197 != null) {
				Static470.method6391();
				@Pc(206) ServerActiveProperties local206 = Static84.method1661(local197);
				Static389.method5483(local206.getTargetMask(), local197, local206.targetParam);
				Static153.aString27 = Static380.method5366(local197);
				Static128.aString108 = local197.aString41 + "<col=ffffff>";
				if (Static153.aString27 == null) {
					Static153.aString27 = "Null";
				}
			}
			return;
		}
		if (local22 == 58) {
			if (Static608.anInt9316 > 0 && Static334.aClass321_1.method8486(82) && Static334.aClass321_1.method8486(81)) {
				Cheat.teleport(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, Static116.anInt2279 + local19, Static691.anInt10395 + local16);
			} else {
				local147 = Static32.method878(local16, local19, local26);
				if (local26 == 1) {
					local147.aClass2_Sub21_Sub2_1.p1(-1);
					local147.aClass2_Sub21_Sub2_1.p1(-1);
					local147.aClass2_Sub21_Sub2_1.p2((int) Static171.aFloat64);
					local147.aClass2_Sub21_Sub2_1.p1(57);
					local147.aClass2_Sub21_Sub2_1.p1(Static29.anInt726);
					local147.aClass2_Sub21_Sub2_1.p1(Static660.anInt9861);
					local147.aClass2_Sub21_Sub2_1.p1(89);
					local147.aClass2_Sub21_Sub2_1.p2(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718);
					local147.aClass2_Sub21_Sub2_1.p2(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722);
					local147.aClass2_Sub21_Sub2_1.p1(63);
				} else {
					Static305.anInt4898 = arg0;
					Static616.anInt9443 = 1;
					Static481.anInt7236 = 0;
					Static676.anInt10234 = arg2;
				}
				Static405.aClass153_2.method3275(local147);
				Static147.method2419(0, local19, 1, true, local16, 0, -4, 1);
			}
		}
		if (local22 == 10 && Static390.aClass158_9 == null) {
			Static479.method6468(local16, local19);
			Static390.aClass158_9 = Static15.method186(local16, local19);
			Static178.method2729(Static390.aClass158_9);
		}
		@Pc(389) ClientProt local389 = null;
		if (local22 == 2) {
			local389 = Static424.aClass347_79;
		} else if (local22 == 22) {
			local389 = Static53.aClass347_7;
		} else if (local22 == 52) {
			local389 = Static412.aClass347_74;
		} else if (local22 == 30) {
			local389 = Static587.aClass347_104;
		} else if (local22 == 53) {
			local389 = Static675.aClass347_118;
		} else if (local22 == 9) {
			local389 = Static173.aClass347_30;
		} else if (local22 == 51) {
			local389 = Static273.aClass347_55;
		} else if (local22 == 15) {
			local389 = Static494.aClass347_89;
		} else if (local22 == 48) {
			local389 = Static571.aClass347_103;
		} else if (local22 == 16) {
			local389 = Static470.aClass347_88;
		}
		@Pc(494) Node_Sub19 local494;
		if (local389 != null) {
			@Pc(474) Class8_Sub2_Sub1_Sub2_Sub1 local474 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local26];
			if (local474 != null) {
				Static481.anInt7236 = 0;
				Static305.anInt4898 = arg0;
				Static616.anInt9443 = 2;
				Static676.anInt10234 = arg2;
				local494 = Static293.method4342(local389, Static405.aClass153_2.aClass186_1);
				local494.aClass2_Sub21_Sub2_1.p1(Static334.aClass321_1.method8486(82) ? 1 : 0);
				local494.aClass2_Sub21_Sub2_1.p2(local26);
				Static405.aClass153_2.method3275(local494);
				Static147.method2419(0, local474.anIntArray878[0], local474.method9309((byte) 125), true, local474.anIntArray879[0], 0, -2, local474.method9309((byte) 60));
			}
		}
		@Pc(548) ClientProt local548 = null;
		if (local22 == 25) {
			local548 = Static235.aClass347_48;
		} else if (local22 == 5) {
			local548 = Static405.aClass347_73;
		} else if (local22 == 50) {
			local548 = Static631.aClass347_120;
		} else if (local22 == 6) {
			local548 = Static555.aClass347_99;
		} else if (local22 == 45) {
			local548 = Static87.aClass347_17;
		} else if (local22 == 1007) {
			local548 = Static214.aClass347_39;
		}
		if (local548 != null) {
			Static305.anInt4898 = arg0;
			Static481.anInt7236 = 0;
			Static616.anInt9443 = 2;
			Static676.anInt10234 = arg2;
			local494 = Static293.method4342(local548, Static405.aClass153_2.aClass186_1);
			local494.aClass2_Sub21_Sub2_1.method7400(local26);
			local494.aClass2_Sub21_Sub2_1.p1(Static334.aClass321_1.method8486(82) ? 1 : 0);
			local494.aClass2_Sub21_Sub2_1.p2(local19 + Static116.anInt2279);
			local494.aClass2_Sub21_Sub2_1.method7369(Static691.anInt10395 + local16);
			Static405.aClass153_2.method3275(local494);
			Static414.method5704(local19, local16);
		}
		if (local22 == 11) {
			if (Static608.anInt9316 > 0 && Static334.aClass321_1.method8486(82) && Static334.aClass321_1.method8486(81)) {
				Cheat.teleport(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, Static116.anInt2279 + local19, Static691.anInt10395 + local16);
			} else {
				Static481.anInt7236 = 0;
				Static676.anInt10234 = arg2;
				Static616.anInt9443 = 1;
				Static305.anInt4898 = arg0;
				local494 = Static293.method4342(Static512.aClass347_96, Static405.aClass153_2.aClass186_1);
				local494.aClass2_Sub21_Sub2_1.method7377(local19 + Static116.anInt2279);
				local494.aClass2_Sub21_Sub2_1.method7369(Static691.anInt10395 + local16);
				Static405.aClass153_2.method3275(local494);
			}
		}
		if (local22 == 18) {
			@Pc(741) Class158 local741 = Static15.method186(local16, local19);
			if (local741 != null) {
				Static312.method4549(local741);
			}
		}
		@Pc(750) ClientProt local750 = null;
		if (local22 == 49) {
			local750 = Static297.aClass347_59;
		} else if (local22 == 59) {
			local750 = Static546.aClass347_97;
		} else if (local22 == 47) {
			local750 = Static131.aClass347_25;
		} else if (local22 == 57) {
			local750 = Static305.aClass347_60;
		} else if (local22 == 3) {
			local750 = Static420.aClass347_78;
		} else if (local22 == 1011) {
			local750 = Static591.aClass347_107;
		}
		if (local750 != null) {
			@Pc(806) Node_Sub45 local806 = (Node_Sub45) Static18.aClass28_2.get(local26);
			if (local806 != null) {
				Static676.anInt10234 = arg2;
				@Pc(813) Class8_Sub2_Sub1_Sub2_Sub2 local813 = local806.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static616.anInt9443 = 2;
				Static305.anInt4898 = arg0;
				Static481.anInt7236 = 0;
				@Pc(831) Node_Sub19 local831 = Static293.method4342(local750, Static405.aClass153_2.aClass186_1);
				local831.aClass2_Sub21_Sub2_1.method7391(Static334.aClass321_1.method8486(82) ? 1 : 0);
				local831.aClass2_Sub21_Sub2_1.method7400(local26);
				Static405.aClass153_2.method3275(local831);
				Static147.method2419(0, local813.anIntArray878[0], local813.method9309((byte) 76), true, local813.anIntArray879[0], 0, -2, local813.method9309((byte) 103));
			}
		}
		@Pc(878) ClientProt local878 = null;
		if (local22 == 19) {
			local878 = Static57.aClass347_10;
		} else if (local22 == 13) {
			local878 = Static180.aClass347_33;
		} else if (local22 == 46) {
			local878 = Static402.aClass347_72;
		} else if (local22 == 8) {
			local878 = Static185.aClass347_35;
		} else if (local22 == 1010) {
			local878 = Static236.aClass347_50;
		} else if (local22 == 1008) {
			local878 = Static342.aClass347_61;
		}
		@Pc(949) Node_Sub19 local949;
		if (local878 != null) {
			Static305.anInt4898 = arg0;
			Static616.anInt9443 = 2;
			Static481.anInt7236 = 0;
			Static676.anInt10234 = arg2;
			local949 = Static293.method4342(local878, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method7391(Static334.aClass321_1.method8486(82) ? 1 : 0);
			local949.aClass2_Sub21_Sub2_1.method7400(Static691.anInt10395 + local16);
			local949.aClass2_Sub21_Sub2_1.method7377((int) (local35 >>> 32) & Integer.MAX_VALUE);
			local949.aClass2_Sub21_Sub2_1.method7369(local19 + Static116.anInt2279);
			Static405.aClass153_2.method3275(local949);
			Static38.method1001(local16, local35, local19);
		}
		if (local22 == 1003 || local22 == 1001 || local22 == 1006 || local22 == 1009 || local22 == 1004) {
			Static578.method7631(local16, local26, local22);
		}
		if (local22 == 21) {
			Static676.anInt10234 = arg2;
			Static616.anInt9443 = 1;
			Static305.anInt4898 = arg0;
			Static481.anInt7236 = 0;
			local949 = Static293.method4342(Static181.aClass347_34, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method7400(Static691.anInt10395 + local16);
			local949.aClass2_Sub21_Sub2_1.method7369(Static162.anInt2808);
			local949.aClass2_Sub21_Sub2_1.method7357(Static450.anInt6840);
			local949.aClass2_Sub21_Sub2_1.method7400(Static116.anInt2279 + local19);
			local949.aClass2_Sub21_Sub2_1.p2(Static77.anInt1621);
			Static405.aClass153_2.method3275(local949);
			Static147.method2419(0, local19, 1, true, local16, 0, -4, 1);
		}
		if (local22 == 17) {
			Static616.anInt9443 = 2;
			Static481.anInt7236 = 0;
			Static305.anInt4898 = arg0;
			Static676.anInt10234 = arg2;
			local949 = Static293.method4342(Static175.aClass347_31, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.p2(local16 + Static691.anInt10395);
			local949.aClass2_Sub21_Sub2_1.p2(Static116.anInt2279 + local19);
			local949.aClass2_Sub21_Sub2_1.method7377(Static162.anInt2808);
			local949.aClass2_Sub21_Sub2_1.method7354(Static450.anInt6840);
			local949.aClass2_Sub21_Sub2_1.method7369(Static77.anInt1621);
			local949.aClass2_Sub21_Sub2_1.p1(Static334.aClass321_1.method8486(82) ? 1 : 0);
			local949.aClass2_Sub21_Sub2_1.method7369(local26);
			Static405.aClass153_2.method3275(local949);
			Static414.method5704(local19, local16);
		}
		if (local22 == 23) {
			@Pc(1200) Node_Sub45 local1200 = (Node_Sub45) Static18.aClass28_2.get(local26);
			if (local1200 != null) {
				@Pc(1205) Class8_Sub2_Sub1_Sub2_Sub2 local1205 = local1200.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				Static481.anInt7236 = 0;
				Static616.anInt9443 = 2;
				Static676.anInt10234 = arg2;
				Static305.anInt4898 = arg0;
				@Pc(1223) Node_Sub19 local1223 = Static293.method4342(Static503.aClass347_94, Static405.aClass153_2.aClass186_1);
				local1223.aClass2_Sub21_Sub2_1.method7377(Static77.anInt1621);
				local1223.aClass2_Sub21_Sub2_1.method7369(Static162.anInt2808);
				local1223.aClass2_Sub21_Sub2_1.method7369(local26);
				local1223.aClass2_Sub21_Sub2_1.method7354(Static450.anInt6840);
				local1223.aClass2_Sub21_Sub2_1.p1(Static334.aClass321_1.method8486(82) ? 1 : 0);
				Static405.aClass153_2.method3275(local1223);
				Static147.method2419(0, local1205.anIntArray878[0], local1205.method9309((byte) 44), true, local1205.anIntArray879[0], 0, -2, local1205.method9309((byte) 50));
			}
		}
		if (local22 == 20 || local22 == 1002) {
			Static120.method2193(local19, local16, arg1.aString86, local26);
		}
		if (local22 == 60) {
			Static676.anInt10234 = arg2;
			Static481.anInt7236 = 0;
			Static305.anInt4898 = arg0;
			Static616.anInt9443 = 2;
			local949 = Static293.method4342(Static419.aClass347_77, Static405.aClass153_2.aClass186_1);
			local949.aClass2_Sub21_Sub2_1.method7348(Static334.aClass321_1.method8486(82) ? 1 : 0);
			local949.aClass2_Sub21_Sub2_1.method7369(Static116.anInt2279 + local19);
			local949.aClass2_Sub21_Sub2_1.method7369(Static77.anInt1621);
			local949.aClass2_Sub21_Sub2_1.method7385(Static450.anInt6840);
			local949.aClass2_Sub21_Sub2_1.method7377(Static162.anInt2808);
			local949.aClass2_Sub21_Sub2_1.method7369(local16 + Static691.anInt10395);
			local949.aClass2_Sub21_Sub2_1.method7400(Integer.MAX_VALUE & (int) (local35 >>> 32));
			Static405.aClass153_2.method3275(local949);
			Static38.method1001(local16, local35, local19);
		}
		if (Static156.aBoolean223) {
			Static470.method6391();
		}
		if (Static67.aClass158_10 != null && Static499.anInt7524 == 0) {
			Static178.method2729(Static67.aClass158_10);
		}
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(II)Z")
	public static boolean method1218(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
