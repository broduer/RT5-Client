import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
	public static int[] anIntArray702 = new int[1];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method7814(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static164.method2606();
		if (arg2 == 0) {
			Static163.aClass19_17 = Static255.method3612(Static124.aClass332_20, Static56.anInterface4_3, 0, GameShell.canvas, Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4380() * 2);
			if (arg0 != null) {
				Static163.aClass19_17.GA(0);
				@Pc(36) Class383 local36 = Static74.method1535(Static539.anInt8196, Static697.aClass332_123);
				@Pc(45) Class14 local45 = Static163.aClass19_17.method8017(local36, Static735.method9382(Static721.aClass332_128, Static539.anInt8196), true);
				Static288.method4189();
				Static694.renderLoadingText(Static163.aClass19_17, arg0, true, local36, local45);
			}
		} else {
			@Pc(57) Class19 local57 = null;
			@Pc(85) Class14 local85;
			if (arg0 != null) {
				local57 = Static255.method3612(Static124.aClass332_20, Static56.anInterface4_3, 0, GameShell.canvas, 0);
				local57.GA(0);
				@Pc(76) Class383 local76 = Static74.method1535(Static539.anInt8196, Static697.aClass332_123);
				local85 = local57.method8017(local76, Static735.method9382(Static721.aClass332_128, Static539.anInt8196), true);
				Static288.method4189();
				Static694.renderLoadingText(local57, arg0, true, local76, local85);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static163.aClass19_17 = Static255.method3612(Static124.aClass332_20, Static56.anInterface4_3, arg2, GameShell.canvas, Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4380() * 2);
					if (arg0 != null) {
						local57.GA(0);
						@Pc(118) Class383 local118 = Static74.method1535(Static539.anInt8196, Static697.aClass332_123);
						@Pc(127) Class14 local127 = local57.method8017(local118, Static735.method9382(Static721.aClass332_128, Static539.anInt8196), true);
						Static288.method4189();
						Static694.renderLoadingText(local57, arg0, true, local118, local127);
					}
					if (Static163.aClass19_17.method7956()) {
						@Pc(141) boolean local141 = true;
						try {
							local141 = Static292.instance.anInt7633 > 256;
						} catch (@Pc(152) Throwable ex) {
							ex.printStackTrace();
						}
						@Pc(158) Class2_Sub13 local158;
						if (local141) {
							local158 = Static163.aClass19_17.method7968(146800640);
						} else {
							local158 = Static163.aClass19_17.method7968(104857600);
						}
						Static163.aClass19_17.method7945(local158);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(168) Throwable local168) {
					@Pc(173) int local173 = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922();
					if (local173 == 2) {
						Static171.aBoolean245 = true;
					}
					Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub29_1);
					method7814(arg0, arg1, local173);
					@Pc(194) Object local194 = null;
					var14 = false;
				} finally {
					if (var14) {
						local85 = null;
						if (local57 != null) {
							try {
								local57.method7947();
							} catch (@Pc(359) Throwable ex) {
								ex.printStackTrace();
							}
						}
					}
				}
				if (local57 != null) {
					try {
						local57.method7947();
					} catch (@Pc(339) Throwable ex) {
						ex.printStackTrace();
					}
				}
				return;
			}
			local85 = null;
			if (local57 != null) {
				try {
					local57.method7947();
				} catch (@Pc(349) Throwable ex) {
					ex.printStackTrace();
				}
			}
		}
		Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7925(!arg1);
		Static400.aClass2_Sub34_28.method5111(arg2, Static400.aClass2_Sub34_28.aClass57_Sub29_1);
		Static112.method2109();
		Static163.aClass19_17.method8010();
		Static163.aClass19_17.X(32);
		Static460.aClass73_10 = Static163.aClass19_17.method7960();
		Static59.aClass73_5 = Static163.aClass19_17.method7960();
		Static209.method3110();
		Static163.aClass19_17.method8004(Static400.aClass2_Sub34_28.aClass57_Sub9_1.method3199() == 1);
		if (Static163.aClass19_17.method7943()) {
			Static249.method3537(Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6115() == 1);
		}
		Static613.method8246(Static163.aClass19_17, Static501.anInt7591 >> 3, Static720.anInt10888 >> 3);
		Static218.method3187();
		Static284.aBoolean355 = true;
		Static679.aClass275Array1 = null;
		Static503.aBoolean578 = false;
		Static498.method6653();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IBIII)V")
	public static void method7817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static691.anInt10396;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static599.anInt8861 = arg1;
			Static691.anInt10396 = 2;
			Static435.anInt6617 = arg3;
			Static320.anInt5102 = arg0;
			Static582.anInt8653 = arg2;
		} else if (local5 == 2) {
			if (Static320.anInt5102 > arg0) {
				Static320.anInt5102 = arg0;
			}
			if (Static435.anInt6617 > arg3) {
				Static435.anInt6617 = arg3;
			}
			if (Static599.anInt8861 < arg1) {
				Static599.anInt8861 = arg1;
			}
			if (Static582.anInt8653 < arg2) {
				Static582.anInt8653 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!ge;Lclient!vfa;I)Lclient!bs;")
	public static Class52 method7818(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class384 arg1) {
		@Pc(10) Class52 local10 = new Class52(arg1);
		@Pc(14) int local14 = arg0.g1();
		@Pc(23) boolean local23 = (local14 & 0x1) != 0;
		@Pc(35) boolean local35 = (local14 & 0x2) != 0;
		@Pc(47) boolean local47 = (local14 & 0x4) != 0;
		@Pc(57) boolean local57 = (local14 & 0x8) != 0;
		if (local23) {
			local10.anIntArray97[0] = arg0.method7353();
			local10.anIntArray99[0] = arg0.method7353();
			if (arg1.anInt10129 != -1 || arg1.anInt10133 != -1) {
				local10.anIntArray97[1] = arg0.method7353();
				local10.anIntArray99[1] = arg0.method7353();
			}
			if (arg1.anInt10122 != -1 || arg1.anInt10163 != -1) {
				local10.anIntArray97[2] = arg0.method7353();
				local10.anIntArray99[2] = arg0.method7353();
			}
		}
		if (local35) {
			local10.anIntArray98[0] = arg0.method7353();
			local10.anIntArray100[0] = arg0.method7353();
			if (arg1.anInt10138 != -1 || arg1.anInt10147 != -1) {
				local10.anIntArray98[1] = arg0.method7353();
				local10.anIntArray100[1] = arg0.method7353();
			}
		}
		@Pc(178) int local178;
		@Pc(181) int[] local181;
		@Pc(213) int local213;
		if (local47) {
			local178 = arg0.g2();
			local181 = new int[] { local178 & 0xF, local178 >> 4 & 0xF, local178 >> 8 & 0xF, local178 >> 12 & 0xF };
			for (local213 = 0; local213 < 4; local213++) {
				if (local181[local213] != 15) {
					local10.aShortArray11[local181[local213]] = (short) arg0.g2();
				}
			}
		}
		if (local57) {
			local178 = arg0.g1();
			local181 = new int[] { local178 & 0xF, local178 >> 4 & 0xF };
			for (local213 = 0; local213 < 2; local213++) {
				if (local181[local213] != 15) {
					local10.aShortArray10[local181[local213]] = (short) arg0.g2();
				}
			}
		}
		return local10;
	}
}
