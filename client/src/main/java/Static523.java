import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
	public static int anInt3893;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
	public static int anInt3899;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!hh;")
	public static final Class162 aClass162_3 = new Class162("LIVE", 0);

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
	public static int anInt3896 = -1;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
	public static boolean method3444(@OriginalArg(0) int arg0) {
		if (arg0 == 19 || arg0 == 13 || arg0 == 46 || arg0 == 8 || arg0 == 1010 || arg0 == 1008) {
			return true;
		} else {
			return arg0 == 60;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILclient!ge;Ljava/lang/String;)I")
	public static int method3446(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = arg0.anInt8412;
		@Pc(16) byte[] local16 = Static469.method6368(arg1);
		arg0.method7359(local16.length);
		arg0.anInt8412 += Static636.aClass199_1.method4447(arg0.anInt8412, 0, local16.length, arg0.aByteArray93, local16);
		return arg0.anInt8412 - local12;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
	public static void method3447(@OriginalArg(0) boolean arg0) {
		if (Static449.aClass366_1 == null) {
			Static229.method3368();
		}
		if (arg0) {
			Static449.aClass366_1.method8378();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)I")
	public static int method3448() {
		@Pc(12) int local12;
		if (Static400.aClass2_Sub34_28.aClass57_Sub10_1.method3519() == 0) {
			for (local12 = 0; local12 < Static671.anInt10053; local12++) {
				if (Static194.anInterface27Array1[local12].method2666() == 's' || Static194.anInterface27Array1[local12].method2666() == 'S') {
					Static400.aClass2_Sub34_28.method5111(1, Static400.aClass2_Sub34_28.aClass57_Sub10_1);
					Static416.aBoolean472 = true;
					break;
				}
			}
		}
		@Pc(74) int local74;
		if (Static198.aClass140_1 == Static473.aClass140_22) {
			@Pc(65) Runtime local65 = Runtime.getRuntime();
			local74 = (int) ((local65.totalMemory() - local65.freeMemory()) / 1024L);
			@Pc(77) long local77 = Static588.method7722();
			if (Static6.aLong8 == 0L) {
				Static6.aLong8 = local77;
			}
			if (local74 > 16384 && local77 - Static6.aLong8 < 5000L) {
				if (local77 - Static549.aLong282 > 1000L) {
					System.gc();
					Static549.aLong282 = local77;
				}
				return 0;
			}
		}
		if (Static198.aClass140_2 == Static473.aClass140_22) {
			if (Static228.aClass264_1 == null) {
				Static228.aClass264_1 = new Class264(Static500.aClass297_3, Static66.aClass174_1, Static442.aBigInteger5, Static670.aBigInteger6);
			}
			if (!Static228.aClass264_1.method5807()) {
				return 0;
			}
			Static595.method7814((String) null, true, 0);
			Static297.aBoolean368 = !Static589.method7728();
			Static177.aClass332_35 = Static109.method2069(false, Static297.aBoolean368 ? 34 : 32, 1);
			Static516.aClass332_97 = Static109.method2069(false, 33, 1);
			Static697.aClass332_123 = Static109.method2069(false, 13, 1);
		}
		@Pc(184) boolean local184;
		if (Static198.aClass140_3 == Static473.aClass140_22) {
			local184 = Static516.aClass332_97.method7598();
			local74 = Static226.aClass47_Sub1Array8[33].method6651();
			local74 += Static226.aClass47_Sub1Array8[Static297.aBoolean368 ? 34 : 32].method6651();
			local74 += Static226.aClass47_Sub1Array8[13].method6651();
			local74 += local184 ? 100 : Static516.aClass332_97.method7589();
			if (local74 != 400) {
				return local74 / 4;
			}
			Static324.anInt5146 = Static177.aClass332_35.method7583();
			Static466.anInt7063 = Static516.aClass332_97.method7583();
			Static616.method8291(Static177.aClass332_35);
			@Pc(250) int local250 = Static400.aClass2_Sub34_28.aClass57_Sub11_1.method3603();
			Static333.aClass281_1 = new Class281(Static392.aClass379_4, Static51.anInt1056, Static516.aClass332_97);
			@Pc(262) int[] local262 = Static333.aClass281_1.method6282(local250);
			if (local262.length == 0) {
				local262 = Static333.aClass281_1.method6282(0);
			}
			@Pc(276) Class400 local276 = new Class400(Static177.aClass332_35, Static697.aClass332_123);
			if (local262.length > 0) {
				Static234.anInterface22Array1 = new Interface22[local262.length];
				for (@Pc(285) int local285 = 0; local285 < Static234.anInterface22Array1.length; local285++) {
					Static234.anInterface22Array1[local285] = new Class356(Static333.aClass281_1.method6284(local262[local285]), local276);
				}
			}
		}
		if (Static198.aClass140_4 == Static473.aClass140_22) {
			Static82.method1592(Static697.aClass332_123, Static177.aClass332_35, Static52.method1159());
		}
		if (Static198.aClass140_5 == Static473.aClass140_22) {
			local12 = Static359.method5233();
			local74 = Static714.method9346();
			if (local74 > local12) {
				return local12 * 100 / local74;
			}
		}
		if (Static198.aClass140_6 == Static473.aClass140_22) {
			if (Static234.anInterface22Array1 != null && Static234.anInterface22Array1.length > 0) {
				if (Static234.anInterface22Array1[0].method8467() < 100) {
					return 0;
				}
				if (Static234.anInterface22Array1.length > 1 && Static333.aClass281_1.method6283() && Static234.anInterface22Array1[1].method8467() < 100) {
					return 0;
				}
			}
			Static570.method7556(Static163.aClass19_17);
			Static469.method6365(Static163.aClass19_17);
			Static81.method1586(1);
		}
		if (Static198.aClass140_7 == Static473.aClass140_22) {
			for (local12 = 0; local12 < 4; local12++) {
				Static577.aClass110Array1[local12] = Static125.method2219(Static720.anInt10888, Static501.anInt7591);
			}
		}
		if (Static473.aClass140_22 == Static198.aClass140_8) {
			Static721.aClass332_128 = Static109.method2069(false, 8, 1);
			Static344.aClass332_73 = Static109.method2069(false, 0, 1);
			Static142.aClass332_25 = Static109.method2069(false, 1, 1);
			Static6.aClass332_1 = Static109.method2069(false, 2, 1);
			Static554.aClass332_105 = Static109.method2069(false, 3, 1);
			Static281.aClass332_60 = Static109.method2069(false, 4, 1);
			Static93.aClass332_16 = Static109.method2069(true, 5, 1);
			Static398.aClass332_81 = Static109.method2069(true, 6, 1);
			Static190.aClass332_38 = Static109.method2069(false, 7, 1);
			Static534.aClass332_104 = Static109.method2069(false, 9, 1);
			Static463.aClass332_93 = Static109.method2069(false, 10, 1);
			Static340.aClass332_69 = Static109.method2069(false, 11, 1);
			Static31.aClass332_6 = Static109.method2069(false, 12, 1);
			Static147.aClass332_26 = Static109.method2069(false, 14, 1);
			Static405.aClass332_84 = Static109.method2069(false, 15, 1);
			Static459.aClass332_91 = Static109.method2069(false, 16, 1);
			Static20.aClass332_3 = Static109.method2069(false, 17, 1);
			Static333.aClass332_66 = Static109.method2069(false, 18, 1);
			Static380.aClass332_79 = Static109.method2069(false, 19, 1);
			Static668.aClass332_119 = Static109.method2069(false, 20, 1);
			Static271.aClass332_59 = Static109.method2069(false, 21, 1);
			Static233.aClass332_52 = Static109.method2069(false, 22, 1);
			Static120.aClass332_19 = Static109.method2069(true, 23, 1);
			Static58.aClass332_12 = Static109.method2069(false, 24, 1);
			Static244.aClass332_55 = Static109.method2069(false, 25, 1);
			Static199.aClass332_42 = Static109.method2069(true, 26, 1);
			Static88.aClass332_14 = Static109.method2069(false, 27, 1);
			Static336.aClass332_68 = Static109.method2069(true, 28, 1);
			Static140.aClass332_24 = Static109.method2069(false, 29, 1);
			Static504.aClass332_95 = Static109.method2069(true, 35, 1);
			Static614.aClass332_114 = Static109.method2069(true, 30, 1);
			Static124.aClass332_20 = Static109.method2069(true, 31, 1);
			Static709.aClass332_127 = Static109.method2069(true, 36, 2);
		}
		if (Static473.aClass140_22 == Static198.aClass140_9) {
			local12 = 0;
			for (local74 = 0; local74 < 37; local74++) {
				if (Static226.aClass47_Sub1Array8[local74] != null) {
					local12 += Static226.aClass47_Sub1Array8[local74].method6651() * Static462.anIntArray556[local74] / 100;
				}
			}
			if (local12 != 100) {
				if (Static669.anInt10023 < 0) {
					Static669.anInt10023 = local12;
				}
				return (local12 - Static669.anInt10023) * 100 / (100 - Static669.anInt10023);
			}
			Static204.method3079(Static721.aClass332_128);
			Static82.method1592(Static697.aClass332_123, Static721.aClass332_128, Static52.method1159());
		}
		if (Static473.aClass140_22 == Static198.aClass140_10) {
			@Pc(746) byte[] local746 = Static336.aClass332_68.method7596(4);
			if (local746 == null) {
				return 0;
			}
			Static9.method124(local746);
			Static674.method8813();
			Static81.method1586(2);
		}
		if (Static198.aClass140_11 == Static473.aClass140_22) {
			Static529.method7103(Static614.aClass332_114, Static446.aClass392_6);
		}
		if (Static198.aClass140_12 == Static473.aClass140_22) {
			local12 = Static460.method6273();
			if (local12 < 100) {
				return local12;
			}
			Static502.method6728(Static336.aClass332_68.method7596(1));
			Static65.aClass3_1 = new Class3(Static336.aClass332_68);
			Static76.aShortArrayArray2 = Static65.aClass3_1.aShortArrayArray1;
			Static339.aShortArrayArrayArray2 = Static65.aClass3_1.aShortArrayArrayArray1;
			Static125.aClass390_1 = new Class390(Static336.aClass332_68);
		}
		if (Static198.aClass140_13 == Static473.aClass140_22) {
			if (Static65.aClass3_1.anInt81 != -1 && !Static190.aClass332_38.method7593(0, Static65.aClass3_1.anInt81)) {
				return 99;
			}
			Static56.anInterface4_3 = new Class305(Static199.aClass332_42, Static534.aClass332_104, Static721.aClass332_128);
			Static386.aClass49_2 = new Class49(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static574.aClass312_2 = new Class312(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1, Static125.aClass390_1);
			Static354.aClass269_1 = new Class269(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1, Static721.aClass332_128);
			Static619.aClass389_2 = new Class389(Static392.aClass379_4, Static51.anInt1056, Static20.aClass332_3);
			Static467.aClass96_3 = new Class96(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static540.aClass79_6 = new Class79(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static561.aClass222_2 = new Class222(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1, Static721.aClass332_128);
			Static68.aClass217_3 = new Class217(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1, Static190.aClass332_38);
			Static503.aClass337_1 = new Class337(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static48.aClass386_1 = new Class386(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static354.aClass142_4 = new Class142(Static392.aClass379_4, Static51.anInt1056, true, Static459.aClass332_91, Static190.aClass332_38);
			Static577.aClass248_4 = new Class248(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1, Static721.aClass332_128);
			Static720.aClass365_4 = new Class365(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1, Static721.aClass332_128);
			Static690.aClass310_2 = new Class310(Static392.aClass379_4, Static51.anInt1056, true, Static333.aClass332_66, Static190.aClass332_38);
			Static419.aClass112_1 = new Class112(Static392.aClass379_4, Static51.anInt1056, true, Static386.aClass49_2, Static380.aClass332_79, Static190.aClass332_38);
			Static272.aClass45_1 = new Class45(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static25.aClass50_1 = new Class50(Static392.aClass379_4, Static51.anInt1056, Static668.aClass332_119, Static344.aClass332_73, Static142.aClass332_25);
			Static324.aClass309_1 = new Class309(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static99.aClass78_1 = new Class78(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static23.aClass128_1 = new Class128(Static392.aClass379_4, Static51.anInt1056, Static271.aClass332_59, Static190.aClass332_38);
			Static652.aClass216_1 = new Class216(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static718.aClass176_1 = new Class176(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static691.aClass212_1 = new Class212(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static529.aClass161_1 = new Class161(Static392.aClass379_4, Static51.anInt1056, Static233.aClass332_52);
			Static36.aClass262_1 = new Class262(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static628.aClass344_5 = new Class344(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static648.aClass17_1 = new Class17(Static392.aClass379_4, Static51.anInt1056, Static6.aClass332_1);
			Static444.method5994(Static554.aClass332_105, Static697.aClass332_123, Static721.aClass332_128, Static190.aClass332_38);
			Static110.method2081(Static140.aClass332_24);
			Static68.aClass151_3 = new Class151(Static51.anInt1056, Static58.aClass332_12, Static244.aClass332_55);
			Static288.aClass139_2 = new Class139(Static51.anInt1056, Static58.aClass332_12, Static244.aClass332_55, new Class253());
			Static412.method5700();
			Static354.aClass142_4.method3061(Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() == 0);
			Static34.aClass306_1 = new Class306();
			Static296.method4369();
			Static44.method1074(Static25.aClass50_1);
			Static187.method2844(Static88.aClass332_14);
			Static405.method5599(Static56.anInterface4_3, Static190.aClass332_38);
			@Pc(1119) Class199 local1119 = new Class199(Static463.aClass332_93.method7607("huffman", ""));
			Static342.method4469(local1119);
			try {
				jagmisc.init();
			} catch (@Pc(1126) Throwable local1126) {
			}
			Static600.aClass27_1 = Static570.method7557();
			Static292.aClass2_Sub43_2 = new Class2_Sub43(true, Static446.aClass392_6);
		}
		if (Static198.aClass140_15 == Static473.aClass140_22) {
			local12 = Static188.method2860(Static721.aClass332_128) + Static372.method5298(true);
			local74 = Static688.method8981() + Static714.method9346();
			if (local12 < local74) {
				return local12 * 100 / local74;
			}
		}
		if (Static198.aClass140_16 == Static473.aClass140_22) {
			Static30.method5072(Static120.aClass332_19, Static467.aClass96_3, Static540.aClass79_6, Static354.aClass142_4, Static577.aClass248_4, Static720.aClass365_4, Static34.aClass306_1);
		}
		if (Static198.aClass140_17 == Static473.aClass140_22) {
			Static37.aStringArray4 = new String[Static718.aClass176_1.anInt4278];
			Static511.anIntArray614 = new int[Static691.aClass212_1.anInt5492];
			Static118.aBooleanArray4 = new boolean[Static691.aClass212_1.anInt5492];
			for (local12 = 0; local12 < Static691.aClass212_1.anInt5492; local12++) {
				if (Static691.aClass212_1.method4954(local12).anInt7195 == 0) {
					Static118.aBooleanArray4[local12] = true;
					Static319.anInt5095++;
				}
				Static511.anIntArray614[local12] = -1;
			}
			Static218.method3189();
			Static93.aClass332_16.method7582(false);
			Static398.aClass332_81.method7582(true);
			Static721.aClass332_128.method7582(true);
			Static697.aClass332_123.method7582(true);
			Static463.aClass332_93.method7582(true);
			Static6.aClass332_1.anInt8579 = 2;
			Static666.aBoolean767 = true;
			Static20.aClass332_3.anInt8579 = 2;
			Static459.aClass332_91.anInt8579 = 2;
			Static333.aClass332_66.anInt8579 = 2;
			Static380.aClass332_79.anInt8579 = 2;
			Static668.aClass332_119.anInt8579 = 2;
			Static271.aClass332_59.anInt8579 = 2;
		}
		if (Static473.aClass140_22 == Static198.aClass140_18) {
			if (!Static571.method7573(Static65.aClass3_1.anInt88)) {
				return 0;
			}
			local184 = true;
			for (local74 = 0; local74 < Static453.aClass158ArrayArray2[Static65.aClass3_1.anInt88].length; local74++) {
				@Pc(1315) Class158 local1315 = Static453.aClass158ArrayArray2[Static65.aClass3_1.anInt88][local74];
				if (local1315.anInt3831 == 5 && local1315.anInt3821 != -1 && !Static721.aClass332_128.method7593(0, local1315.anInt3821)) {
					local184 = false;
				}
			}
			if (!local184) {
				return 0;
			}
		}
		if (Static198.aClass140_19 == Static473.aClass140_22) {
			Static456.method6235(true);
		}
		if (Static198.aClass140_20 == Static473.aClass140_22) {
			Static449.aClass366_1.method8379();
			try {
				Static242.aThread1.join();
			} catch (@Pc(1370) InterruptedException local1370) {
				return 0;
			}
			Static234.anInterface22Array1 = null;
			Static449.aClass366_1 = null;
			Static177.aClass332_35 = null;
			Static516.aClass332_97 = null;
			Static242.aThread1 = null;
			Static333.aClass281_1 = null;
			Static9.method123();
			Static3.aBoolean4 = Static400.aClass2_Sub34_28.aClass57_Sub10_1.method3519() == 1;
			Static400.aClass2_Sub34_28.method5111(1, Static400.aClass2_Sub34_28.aClass57_Sub10_1);
			if (Static3.aBoolean4) {
				Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
			} else if (Static400.aClass2_Sub34_28.aClass57_Sub29_2.aBoolean675 && Static292.aClass2_Sub43_2.anInt7633 < 512 && Static292.aClass2_Sub43_2.anInt7633 != 0) {
				Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
			}
			Static666.method8700(1);
			if (Static3.aBoolean4) {
				Static32.method880(0, false);
			} else {
				Static32.method880(Static400.aClass2_Sub34_28.aClass57_Sub29_2.method7922(), false);
			}
			Static409.method5664(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
			Static570.method7556(Static163.aClass19_17);
			Static469.method6365(Static163.aClass19_17);
			Static239.method3472(Static721.aClass332_128, Static163.aClass19_17);
			Static331.method4932(Static679.aClass23Array14);
		}
		return Static694.method9037();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZLclient!hda;)V")
	public static void method3449(@OriginalArg(1) Class158 arg0) {
		if (Static376.anInt5941 != arg0.anInt3817) {
			return;
		}
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9 == null) {
			arg0.anInt3842 = 0;
			arg0.anInt3748 = 0;
			return;
		}
		arg0.anInt3818 = 150;
		arg0.anInt3822 = (int) (Math.sin((double) Static333.anInt5474 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt3834 = 5;
		arg0.anInt3842 = Static312.anInt5017;
		arg0.anInt3748 = Static214.method3157(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9);
		@Pc(55) Class152 local55 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass152_10;
		if (local55 == null) {
			arg0.aClass152_6 = null;
			return;
		}
		if (arg0.aClass152_6 == null) {
			arg0.aClass152_6 = new Class152_Sub1();
		}
		arg0.anInt3799 = local55.method9121();
		arg0.aClass152_6.method9103(local55);
	}
}
