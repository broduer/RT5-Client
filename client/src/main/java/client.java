import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends Applet_Sub1 {

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] arg0) {
		try {
			if (arg0.length != 6) {
				Static426.method553("Argument count");
			}
			Static527.aClass229_3 = new Class229();
			Static527.aClass229_3.anInt5856 = Integer.parseInt(arg0[0]);
			Static660.aClass229_4 = new Class229();
			Static660.aClass229_4.anInt5856 = Integer.parseInt(arg0[1]);
			Static2.aClass355_1 = Static16.aClass355_2;
			if (arg0[3].equals("live")) {
				Static598.aClass162_5 = Static523.aClass162_3;
			} else if (arg0[3].equals("rc")) {
				Static598.aClass162_5 = Static519.aClass162_4;
			} else if (arg0[3].equals("wip")) {
				Static598.aClass162_5 = Static225.aClass162_1;
			} else {
				Static426.method553("modewhat");
			}
			Static51.anInt1052 = Static541.method5039(arg0[4]);
			if (Static51.anInt1052 == -1) {
				if (arg0[4].equals("english")) {
					Static51.anInt1052 = 0;
				} else if (arg0[4].equals("german")) {
					Static51.anInt1052 = 1;
				} else {
					Static426.method553("language");
				}
			}
			Static464.aBoolean533 = false;
			Static98.aBoolean191 = false;
			if (arg0[5].equals("game0")) {
				Static392.aClass377_4 = Static673.aClass377_8;
			} else if (arg0[5].equals("game1")) {
				Static392.aClass377_4 = Static723.aClass377_9;
			} else if (arg0[5].equals("game2")) {
				Static392.aClass377_4 = Static465.aClass377_5;
			} else if (arg0[5].equals("game3")) {
				Static392.aClass377_4 = Static655.aClass377_7;
			} else {
				Static426.method553("game");
			}
			Static323.anInt5121 = 0;
			Static715.anInt10805 = 0;
			Static29.aBoolean61 = false;
			Static508.aBoolean582 = true;
			Static126.aBoolean200 = true;
			Static473.aBoolean539 = false;
			Static389.aString64 = null;
			Static338.anInt5562 = Static392.aClass377_4.anInt9720;
			Static150.aString26 = "";
			Static265.aByteArray44 = null;
			Static584.anInt8634 = 0;
			Static416.aLong208 = 0L;
			@Pc(241) client local241 = new client();
			Static295.aClient1 = local241;
			local241.method1055(Static598.aClass162_5.method2502() + 32, Static392.aClass377_4.aString114);
			Static353.aFrame10.setLocation(40, 40);
		} catch (@Pc(265) Exception local265) {
			Static240.method2529(local265, (String) null);
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method1061() {
		if (Static166.anApplet1 != null && Static434.aCanvas7 == null && !Static446.aClass390_6.aBoolean779) {
			try {
				@Pc(25) Class local25 = Static166.anApplet1.getClass();
				@Pc(31) Field local31 = local25.getDeclaredField("canvas");
				Static434.aCanvas7 = (Canvas) local31.get(Static166.anApplet1);
				local31.set(Static166.anApplet1, (Object) null);
				if (Static434.aCanvas7 != null) {
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		super.method1061();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void method1053() {
		if (Static624.aBoolean727) {
			Static266.method4775();
		}
		Static419.method4063();
		if (Static163.aClass19_17 != null) {
			Static163.aClass19_17.i(-7751);
		}
		if (Static316.aFrame8 != null) {
			Static655.method6101(Static446.aClass390_6, Static316.aFrame8);
			Static316.aFrame8 = null;
		}
		Static405.aClass153_2.method2338();
		Static405.aClass153_1.method2338();
		Static173.method1827();
		Static500.aClass295_3.method4650();
		Static66.aClass174_1.method2684();
		if (Static151.aClass226_20 != null) {
			Static151.aClass226_20.method3700();
			Static151.aClass226_20 = null;
		}
		try {
			Static172.aClass243_4.method3948();
			for (@Pc(66) int local66 = 0; local66 < 37; local66++) {
				Static208.aClass243Array1[local66].method3948();
			}
			Static5.aClass243_1.method3948();
			Static690.aClass243_5.method3948();
			Static314.method3190();
		} catch (@Pc(91) Exception local91) {
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void method1076() {
		if (Static522.anInt7900 < Static500.aClass295_3.anInt7453) {
			Static344.aClass229_1.method3717();
			Static370.anInt5876 = (Static500.aClass295_3.anInt7453 * 50 - 50) * 5;
			if (Static370.anInt5876 > 3000) {
				Static370.anInt5876 = 3000;
			}
			if (Static500.aClass295_3.anInt7453 >= 2 && Static500.aClass295_3.anInt7452 == 6) {
				this.method1058("js5connect_outofdate");
				Static283.anInt4574 = 16;
				return;
			}
			if (Static500.aClass295_3.anInt7453 >= 4 && Static500.aClass295_3.anInt7452 == -1) {
				this.method1058("js5crc");
				Static283.anInt4574 = 16;
				return;
			}
			if (Static500.aClass295_3.anInt7453 >= 4 && Static181.method1893(Static283.anInt4574)) {
				if (Static500.aClass295_3.anInt7452 == 7 || Static500.aClass295_3.anInt7452 == 9) {
					this.method1058("js5connect_full");
				} else if (Static500.aClass295_3.anInt7452 <= 0) {
					this.method1058("js5io");
				} else if (Static376.aString62 == null) {
					this.method1058("js5connect");
				} else {
					this.method1058("js5proxy_" + Static376.aString62.trim());
				}
				Static283.anInt4574 = 16;
				return;
			}
		}
		Static522.anInt7900 = Static500.aClass295_3.anInt7453;
		if (Static370.anInt5876 > 0) {
			Static370.anInt5876--;
			return;
		}
		try {
			if (Static92.anInt1874 == 0) {
				Static514.aClass270_6 = Static344.aClass229_1.method3720(Static446.aClass390_6);
				Static92.anInt1874++;
			}
			if (Static92.anInt1874 == 1) {
				if (Static514.aClass270_6.anInt6789 == 2) {
					if (Static514.aClass270_6.anObject13 != null) {
						Static376.aString62 = (String) Static514.aClass270_6.anObject13;
					}
					this.method1087(1000);
					return;
				}
				if (Static514.aClass270_6.anInt6789 == 1) {
					Static92.anInt1874++;
				}
			}
			if (Static92.anInt1874 == 2) {
				Static672.aClass263_2 = new Class263((Socket) Static514.aClass270_6.anObject13, Static446.aClass390_6, 25000);
				@Pc(251) Class2_Sub21 local251 = new Class2_Sub21(5);
				local251.method5198(Static572.aClass167_54.anInt3973);
				local251.method5151(667);
				Static672.aClass263_2.method4135(5, local251.aByteArray93);
				Static92.anInt1874++;
				Static678.aLong310 = Static588.method5469();
			}
			if (Static92.anInt1874 == 3) {
				if (Static181.method1893(Static283.anInt4574) || Static672.aClass263_2.method4134() > 0) {
					@Pc(296) int local296 = Static672.aClass263_2.method4130();
					if (local296 != 0) {
						this.method1087(local296);
						return;
					}
					Static92.anInt1874++;
				} else if (Static588.method5469() - Static678.aLong310 > 30000L) {
					this.method1087(1001);
					return;
				}
			}
			if (Static92.anInt1874 == 4) {
				@Pc(356) boolean local356 = Static181.method1893(Static283.anInt4574) || Static41.method562(Static283.anInt4574) || Static620.method5890(Static283.anInt4574);
				@Pc(359) Class326[] local359 = Static566.method5266();
				@Pc(367) Class2_Sub21 local367 = new Class2_Sub21(local359.length * 4);
				Static672.aClass263_2.method4131(local367.aByteArray93.length, 0, local367.aByteArray93);
				for (@Pc(378) int local378 = 0; local378 < local359.length; local378++) {
					local359[local378].method5267(local367.method5158());
				}
				Static500.aClass295_3.method4656(!local356, Static672.aClass263_2);
				Static92.anInt1874 = 0;
				Static672.aClass263_2 = null;
				Static514.aClass270_6 = null;
			}
		} catch (@Pc(417) IOException local417) {
			this.method1087(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1078() {
		@Pc(46) int local46;
		if (Static283.anInt4574 == 7 && !Static242.method2533() || Static283.anInt4574 == 9 && Static169.anInt2855 == 42) {
			if (Static249.anInt4008 > 1) {
				Static249.anInt4008--;
				Static321.anInt5111 = Static642.anInt9599;
			}
			if (!Static400.aBoolean622) {
				Static79.method1012();
			}
			for (local46 = 0; local46 < 100 && Static236.method2489(Static405.aClass153_1); local46++) {
			}
		}
		Static35.anInt800++;
		Static449.method4256(-1, -1, (Class158) null);
		Static65.method922(-1, -1, (Class158) null);
		Static443.method4217();
		Static642.anInt9599++;
		for (local46 = 0; local46 < Static416.anInt6378; local46++) {
			@Pc(97) Class8_Sub2_Sub1_Sub2_Sub2 local97 = Static592.aClass2_Sub45Array1[local46].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local97 != null) {
				@Pc(103) byte local103 = local97.aClass268_1.aByte103;
				if ((local103 & 0x1) != 0) {
					@Pc(114) int local114 = local97.method6693((byte) 48);
					@Pc(142) int local142;
					if ((local103 & 0x2) != 0 && local97.anInt10764 == 0 && Math.random() * 1000.0D < 10.0D) {
						local142 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(150) int local150 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local142 != 0 || local150 != 0) {
							@Pc(166) int local166 = local142 + local97.anIntArray879[0];
							if (local166 < 0) {
								local166 = 0;
							} else if (local166 > Static720.anInt10859 - local114 - 1) {
								local166 = Static720.anInt10859 - local114 - 1;
							}
							@Pc(203) int local203 = local150 + local97.anIntArray878[0];
							if (local203 < 0) {
								local203 = 0;
							} else if (local203 > Static501.anInt7568 - local114 - 1) {
								local203 = Static501.anInt7568 - local114 - 1;
							}
							@Pc(258) int local258 = Static521.method4833(local203, local114, true, 0, local97.anIntArray879[0], local114, Static480.anIntArray583, local114, local97.anIntArray878[0], -1, Static577.aClass110Array1[local97.aByte144], Static70.anIntArray147, local166, 0);
							if (local258 > 0) {
								if (local258 > 9) {
									local258 = 9;
								}
								for (@Pc(274) int local274 = 0; local274 < local258; local274++) {
									local97.anIntArray879[local274] = Static70.anIntArray147[local258 - local274 - 1];
									local97.anIntArray878[local274] = Static480.anIntArray583[local258 - local274 - 1];
									local97.aByteArray111[local274] = 1;
								}
								local97.anInt10764 = local258;
							}
						}
					}
					Static256.method2636(local97, true);
					local142 = Static112.method1343(local97);
					Static145.method1608(local97);
					Static651.method6062(Static521.anInt7756, local142, Static524.anInt8042, local97);
					Static702.method6595(local97, Static521.anInt7756);
					Static50.method4667(local97);
				}
			}
		}
		if ((Static283.anInt4574 == 3 || Static283.anInt4574 == 9 || Static283.anInt4574 == 7) && (!Static242.method2533() || Static283.anInt4574 == 9 && Static169.anInt2855 == 42) && Static6.anInt95 == 0) {
			if (Static511.anInt7645 == 2) {
				Static592.method5505();
			} else {
				Static583.method5413();
			}
			if (Static170.anInt2864 >> 9 < 14 || Static170.anInt2864 >> 9 >= Static720.anInt10859 - 14 || Static110.anInt2186 >> 9 < 14 || Static110.anInt2186 >> 9 >= Static501.anInt7568 - 14) {
				Static54.method694();
			}
		}
		while (true) {
			@Pc(453) Class2_Sub42 local453;
			@Pc(458) Class158 local458;
			@Pc(470) Class158 local470;
			do {
				local453 = (Class2_Sub42) Static618.aClass339_68.method5459();
				if (local453 == null) {
					while (true) {
						do {
							local453 = (Class2_Sub42) Static59.aClass339_33.method5459();
							if (local453 == null) {
								while (true) {
									do {
										local453 = (Class2_Sub42) Static521.aClass339_44.method5459();
										if (local453 == null) {
											if (Static109.aClass158_3 != null) {
												Static603.method5596();
											}
											if (Static333.anInt5455 % 1500 == 0) {
												Static314.method3185();
											}
											if (Static283.anInt4574 == 7 && !Static242.method2533() || Static283.anInt4574 == 9 && Static169.anInt2855 == 42) {
												Static320.method3221();
											}
											Static587.method5458();
											if (Static624.aBoolean727 && Static588.method5469() - 60000L > Static98.aLong71) {
												Static266.method4775();
											}
											for (@Pc(672) Class8_Sub4_Sub1 local672 = (Class8_Sub4_Sub1) Static168.aClass130_5.method1905(); local672 != null; local672 = (Class8_Sub4_Sub1) Static168.aClass130_5.method1900()) {
												if ((long) local672.anInt6433 < Static588.method5469() / 1000L - 5L) {
													if (local672.aShort74 > 0) {
														Static44.method607(local672.aString72 + Static32.aClass32_19.method429(Static51.anInt1052), "", 0, "", "", 5);
													}
													if (local672.aShort74 == 0) {
														Static44.method607(local672.aString72 + Static32.aClass32_20.method429(Static51.anInt1052), "", 0, "", "", 5);
													}
													local672.a();
												}
											}
											if (Static283.anInt4574 == 7 && !Static242.method2533() || Static283.anInt4574 == 9 && Static169.anInt2855 == 42) {
												if (Static283.anInt4574 != 9 && Static405.aClass153_1.aClass348_1 == null) {
													Static233.method2447(false);
													return;
												}
												if (Static405.aClass153_1 != null) {
													Static405.aClass153_1.anInt3647++;
													if (Static405.aClass153_1.anInt3647 > 50) {
														@Pc(823) Class2_Sub19 local823 = Static293.method3000(Static415.aClass345_75, Static405.aClass153_1.aClass186_1);
														Static405.aClass153_1.method2339(local823);
													}
													try {
														Static405.aClass153_1.method2337();
														return;
													} catch (@Pc(832) IOException local832) {
														if (Static283.anInt4574 != 9) {
															Static233.method2447(false);
															return;
														}
														Static405.aClass153_1.method2338();
														return;
													}
												}
											}
											return;
										}
										local458 = local453.aClass158_14;
										if (local458.anInt3741 < 0) {
											break;
										}
										local470 = Static145.method1610(local458.anInt3743);
									} while (local470 == null || local470.aClass158Array2 == null || local470.aClass158Array2.length <= local458.anInt3741 || local470.aClass158Array2[local458.anInt3741] != local458);
									Static472.method4499(local453);
								}
							}
							local458 = local453.aClass158_14;
							if (local458.anInt3741 < 0) {
								break;
							}
							local470 = Static145.method1610(local458.anInt3743);
						} while (local470 == null || local470.aClass158Array2 == null || local470.aClass158Array2.length <= local458.anInt3741 || local458 != local470.aClass158Array2[local458.anInt3741]);
						Static472.method4499(local453);
					}
				}
				local458 = local453.aClass158_14;
				if (local458.anInt3741 < 0) {
					break;
				}
				local470 = Static145.method1610(local458.anInt3743);
			} while (local470 == null || local470.aClass158Array2 == null || local470.aClass158Array2.length <= local458.anInt3741 || local458 != local470.aClass158Array2[local458.anInt3741]);
			Static472.method4499(local453);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void method1079() {
		@Pc(7) boolean local7 = Static500.aClass295_3.method4653();
		if (!local7) {
			this.method1076();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void method1057() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void method1086() {
		if (Static283.anInt4574 == 16) {
			return;
		}
		@Pc(20) long local20 = Static271.method2746() / 1000000L - Static206.aLong114;
		Static206.aLong114 = Static271.method2746() / 1000000L;
		@Pc(28) boolean local28 = Static576.method5375();
		if (local28 && Static501.aBoolean575 && Static719.aClass56_5 != null) {
			Static719.aClass56_5.method2595();
		}
		if (Static475.method4514(Static283.anInt4574)) {
			if (Static297.aLong153 != 0L && Static588.method5469() > Static297.aLong153) {
				Static409.method4013(Static36.method520(3), Static560.anInt8429, false, Static433.anInt6258);
			} else if (!Static163.aClass19_17.B() && Static723.aBoolean827) {
				Static574.method5336();
			}
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (Static316.aFrame8 == null) {
			@Pc(98) Container local98;
			if (Static353.aFrame10 != null) {
				local98 = Static353.aFrame10;
			} else if (Static166.anApplet1 == null) {
				local98 = Static149.anApplet_Sub1_1;
			} else {
				local98 = Static166.anApplet1;
			}
			local110 = local98.getSize().width;
			local114 = local98.getSize().height;
			if (local98 == Static353.aFrame10) {
				@Pc(120) Insets local120 = Static353.aFrame10.getInsets();
				local114 -= local120.bottom + local120.top;
				local110 -= local120.right + local120.left;
			}
			if (Static52.anInt1059 != local110 || local114 != Static54.anInt1084 || Static284.aBoolean355) {
				if (Static163.aClass19_17 == null || Static163.aClass19_17.b()) {
					Static712.method6720((byte) 11);
				} else {
					Static52.anInt1059 = local110;
					Static54.anInt1084 = local114;
				}
				Static297.aLong153 = Static588.method5469() + 500L;
				Static284.aBoolean355 = false;
			}
		}
		if (Static316.aFrame8 != null && !Static91.aBoolean750 && Static475.method4514(Static283.anInt4574)) {
			Static409.method4013(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method934(), -1, false, -1);
		}
		@Pc(209) boolean local209 = false;
		if (Static664.aBoolean759) {
			local209 = true;
			Static664.aBoolean759 = false;
		}
		if (local209) {
			Static288.method2880();
		}
		if (Static163.aClass19_17 != null && Static163.aClass19_17.B() || Static36.method520(3) != 1) {
			Static469.method4451();
		}
		if (Static181.method1893(Static283.anInt4574)) {
			Static523.method2485(local209);
		} else if (Static366.method3719(Static283.anInt4574)) {
			Static24.method315();
		} else if (Static384.method3830(Static283.anInt4574)) {
			Static24.method315();
		} else if (Static594.method5521(Static283.anInt4574)) {
			if (Static213.anInt3472 == 1) {
				if (Static593.anInt8763 > Static357.anInt6508) {
					Static357.anInt6508 = Static593.anInt8763;
				}
				local110 = (Static357.anInt6508 - Static593.anInt8763) * 50 / Static357.anInt6508;
				Static694.method6464(Static163.aClass19_17, Static32.aClass32_12.method429(Static51.anInt1052) + "<br>(" + local110 + "%)", true, Static694.aClass381_13, Static437.aClass14_9);
			} else if (Static213.anInt3472 == 2) {
				if (Static13.anInt150 > Static440.anInt6683) {
					Static440.anInt6683 = Static13.anInt150;
				}
				local110 = (Static440.anInt6683 - Static13.anInt150) * 50 / Static440.anInt6683 + 50;
				Static694.method6464(Static163.aClass19_17, Static32.aClass32_12.method429(Static51.anInt1052) + "<br>(" + local110 + "%)", true, Static694.aClass381_13, Static437.aClass14_9);
			} else {
				Static694.method6464(Static163.aClass19_17, Static32.aClass32_12.method429(Static51.anInt1052), true, Static694.aClass381_13, Static437.aClass14_9);
			}
		} else if (Static283.anInt4574 == 11) {
			Static686.method5627(local20);
		} else if (Static283.anInt4574 == 14) {
			Static694.method6464(Static163.aClass19_17, Static32.aClass32_14.method429(Static51.anInt1052) + "<br>" + Static32.aClass32_15.method429(Static51.anInt1052), false, Static694.aClass381_13, Static437.aClass14_9);
		} else if (Static283.anInt4574 == 15) {
			Static694.method6464(Static163.aClass19_17, Static32.aClass32_31.method429(Static51.anInt1052), false, Static694.aClass381_13, Static437.aClass14_9);
		}
		if (Static18.anInt251 == 3) {
			for (local110 = 0; local110 < Static122.anInt2339; local110++) {
				@Pc(478) Rectangle local478 = Class2_Sub1_Sub28.aRectangleArray1[local110];
				if (Static359.aBooleanArray17[local110]) {
					Static163.aClass19_17.a(local478.y, -65281, local478.width, (int) local478.height, (byte) 108, local478.x);
				} else if (Static469.aBooleanArray23[local110]) {
					Static163.aClass19_17.a(local478.y, -65536, local478.width, local478.height, (byte) -57, local478.x);
				} else {
					Static163.aClass19_17.a(local478.y, -16711936, local478.width, local478.height, (byte) -69, local478.x);
				}
			}
		}
		if (Static607.method5772()) {
			Static546.method5082(Static163.aClass19_17);
		}
		if (Static446.aClass390_6.aBoolean779 && Static475.method4514(Static283.anInt4574) && Static18.anInt251 == 0 && Static36.method520(3) == 1 && !local209) {
			local110 = 0;
			for (local114 = 0; local114 < Static122.anInt2339; local114++) {
				if (Static469.aBooleanArray23[local114]) {
					Static469.aBooleanArray23[local114] = false;
					Static663.aRectangleArray2[local110++] = Class2_Sub1_Sub28.aRectangleArray1[local114];
				}
			}
			try {
				if (Static137.aBoolean210) {
					Static700.method6577(local110, Static663.aRectangleArray2);
				} else {
					Static163.aClass19_17.a(local110, (byte) -120, Static663.aRectangleArray2);
				}
			} catch (@Pc(629) Exception_Sub1 local629) {
			}
		} else if (!Static181.method1893(Static283.anInt4574)) {
			for (local110 = 0; local110 < Static122.anInt2339; local110++) {
				Static469.aBooleanArray23[local110] = false;
			}
			try {
				if (Static137.aBoolean210) {
					Static430.method4124();
				} else {
					Static163.aClass19_17.g(19088);
				}
			} catch (@Pc(666) Exception_Sub1 local666) {
				Static240.method2529(local666, local666.getMessage() + " (Recovered) " + this.method1068());
				Static32.method432(0, false);
			}
		}
		Static507.method4747();
		local110 = Static400.aClass2_Sub34_28.aClass57_Sub21_1.method4449();
		if (local110 == 0) {
			Static638.method5959(15L);
		} else if (local110 == 1) {
			Static638.method5959(10L);
		} else if (local110 == 2) {
			Static638.method5959(5L);
		} else if (local110 == 3) {
			Static638.method5959(2L);
		}
		if (Static666.aBoolean766) {
			Static614.method5824();
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub10_1.method2547() == 1 && Static283.anInt4574 == 3 && Static377.anInt5930 != -1) {
			Static400.aClass2_Sub34_28.method3576(0, Static400.aClass2_Sub34_28.aClass57_Sub10_1);
			Static666.method6200(1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void method1087(@OriginalArg(1) int arg0) {
		Static514.aClass270_6 = null;
		Static500.aClass295_3.anInt7452 = arg0;
		Static672.aClass263_2 = null;
		Static500.aClass295_3.anInt7453++;
		Static92.anInt1874 = 0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	@Override
	protected void method1065() {
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method5612() != 2) {
			this.method1088();
			return;
		}
		try {
			this.method1088();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static240.method2529(local24, local24.getMessage() + " (Recovered) " + this.method1068());
			Static171.aBoolean245 = true;
			Static32.method432(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void method1088() {
		if (Static283.anInt4574 == 16) {
			return;
		}
		Static333.anInt5455++;
		if (Static333.anInt5455 % 1000 == 1) {
			@Pc(27) GregorianCalendar local27 = new GregorianCalendar();
			Static178.anInt2947 = local27.get(11) * 600 + local27.get(12) * 10 + local27.get(13) / 6;
			Static493.aRandom1.setSeed((long) Static178.anInt2947);
		}
		Static405.aClass153_2.method2335();
		Static405.aClass153_1.method2335();
		this.method1079();
		if (Static228.aClass262_1 != null) {
			Static228.aClass262_1.method4110();
		}
		Static601.method5574();
		Static236.method2491();
		Static334.aClass319_1.method6035();
		Static189.aClass120_1.method6307();
		if (Static163.aClass19_17 != null) {
			Static163.aClass19_17.e((int) Static588.method5469());
		}
		Static711.method6686();
		Static671.anInt10026 = 0;
		Static216.anInt3530 = 0;
		for (@Pc(94) Interface27 local94 = Static334.aClass319_1.method6032(); local94 != null; local94 = Static334.aClass319_1.method6032()) {
			@Pc(102) int local102 = local94.method1805();
			if (local102 == 2 || local102 == 3) {
				@Pc(118) char local118 = local94.method1803();
				if (Static647.method6022() && (local118 == '`' || local118 == '§' || local118 == '²')) {
					if (Static607.method5772()) {
						Static129.method1482();
					} else {
						Static455.method4328();
					}
				} else if (Static671.anInt10026 < 128) {
					Static194.anInterface27Array1[Static671.anInt10026] = local94;
					Static671.anInt10026++;
				}
			} else if (local102 == 0 && Static216.anInt3530 < 75) {
				Static591.anInterface27Array2[Static216.anInt3530] = local94;
				Static216.anInt3530++;
			}
		}
		Static611.anInt9341 = 0;
		for (@Pc(214) Class2_Sub9 local214 = Static189.aClass120_1.method6317(); local214 != null; local214 = Static189.aClass120_1.method6317()) {
			@Pc(222) int local222 = local214.method3775();
			if (local222 == -1) {
				Static677.aClass339_76.method5465(local214);
			} else if (local222 == 6) {
				Static611.anInt9341 += local214.method3779();
			} else if (Static278.method2825(local222)) {
				Static226.aClass339_58.method5465(local214);
				if (Static226.aClass339_58.method5455() > 10) {
					Static226.aClass339_58.method5459();
				}
			}
		}
		if (Static607.method5772()) {
			Static668.method6210();
		}
		if (Static181.method1893(Static283.anInt4574)) {
			Static709.method6671();
			Static199.method2077();
		} else if (Static594.method5521(Static283.anInt4574)) {
			Static489.method4600();
		}
		if (Static41.method562(Static283.anInt4574) && !Static594.method5521(Static283.anInt4574)) {
			this.method1078();
			Static76.method994();
			Static364.method3710();
		} else if (Static620.method5890(Static283.anInt4574) && !Static594.method5521(Static283.anInt4574)) {
			this.method1078();
			Static364.method3710();
		} else if (Static283.anInt4574 == 13) {
			Static364.method3710();
		} else if (Static109.method1321(Static283.anInt4574) && !Static594.method5521(Static283.anInt4574)) {
			Static709.method6673();
		} else if (Static283.anInt4574 == 14 || Static283.anInt4574 == 15) {
			Static364.method3710();
			if (Static169.anInt2855 != -3 && Static169.anInt2855 != 2 && Static169.anInt2855 != 15) {
				if (Static283.anInt4574 == 15) {
					Static78.anInt1626 = Static169.anInt2855;
					Static673.anInt10079 = Static356.anInt5780;
					Static383.anInt6001 = Static329.anInt1749;
					if (Static718.aBoolean823) {
						Static430.method4123(Static459.aClass229_2.anInt5856, Static459.aClass229_2.aString60);
						Static405.aClass153_2.aClass348_1 = null;
						Static81.method1020(14);
					} else {
						Static233.method2447(Static461.aBoolean529);
					}
				} else {
					Static233.method2447(false);
				}
			}
		}
		Static369.method2709(Static163.aClass19_17);
		Static226.aClass339_58.method5459();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1067() {
		if (Static473.aBoolean539) {
			Static369.anInt4265 = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static712.method6720((byte) 11);
		Static66.aClass174_1 = new Class174(Static446.aClass390_6);
		Static500.aClass295_3 = new Class295();
		Static545.method5077(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static446.aClass355_5 != Static2.aClass355_1) {
			Static163.aByteArrayArray36 = new byte[50][];
		}
		Static400.aClass2_Sub34_28 = Static720.method6782();
		if (Static2.aClass355_1 == Static446.aClass355_5) {
			Static527.aClass229_3.aString60 = this.getCodeBase().getHost();
		} else if (Static179.method1884(Static2.aClass355_1)) {
			Static527.aClass229_3.aString60 = this.getCodeBase().getHost();
			Static527.aClass229_3.anInt5854 = Static527.aClass229_3.anInt5856 + 40000;
			Static527.aClass229_3.anInt5853 = Static527.aClass229_3.anInt5856 + 50000;
			Static660.aClass229_4.anInt5854 = Static660.aClass229_4.anInt5856 + 40000;
			Static660.aClass229_4.anInt5853 = Static660.aClass229_4.anInt5856 + 50000;
		} else if (Static16.aClass355_2 == Static2.aClass355_1) {
			Static527.aClass229_3.aString60 = "127.0.0.1";
			Static527.aClass229_3.anInt5854 = Static527.aClass229_3.anInt5856 + 40000;
			Static660.aClass229_4.aString60 = "127.0.0.1";
			Static527.aClass229_3.anInt5853 = Static527.aClass229_3.anInt5856 + 50000;
			Static660.aClass229_4.anInt5854 = Static660.aClass229_4.anInt5856 + 40000;
			Static660.aClass229_4.anInt5853 = Static660.aClass229_4.anInt5856 + 50000;
		}
		Static344.aClass229_1 = Static527.aClass229_3;
		Static637.aShortArray132 = Static419.aShortArray96 = Static553.aShortArray112 = Static238.aShortArray62 = new short[256];
		if (Static392.aClass377_4 == Static673.aClass377_8) {
			Static273.aBoolean340 = false;
		}
		try {
			Static175.aClipboard1 = Static295.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(183) Exception local183) {
		}
		Static334.aClass319_1 = Static681.method6372(Static434.aCanvas7);
		Static189.aClass120_1 = Static70.method957(Static434.aCanvas7);
		try {
			if (Static446.aClass390_6.aClass83_2 != null) {
				Static172.aClass243_4 = new Class243(Static446.aClass390_6.aClass83_2, 5200, 0);
				for (@Pc(205) int local205 = 0; local205 < 37; local205++) {
					Static208.aClass243Array1[local205] = new Class243(Static446.aClass390_6.aClass83Array1[local205], 6000, 0);
				}
				Static5.aClass243_1 = new Class243(Static446.aClass390_6.aClass83_3, 6000, 0);
				Static276.aClass9_1 = new Class9(255, Static172.aClass243_4, Static5.aClass243_1, 500000);
				Static690.aClass243_5 = new Class243(Static446.aClass390_6.aClass83_4, 24, 0);
				Static446.aClass390_6.aClass83_3 = null;
				Static446.aClass390_6.aClass83Array1 = null;
				Static446.aClass390_6.aClass83_2 = null;
				Static446.aClass390_6.aClass83_4 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static5.aClass243_1 = null;
			Static276.aClass9_1 = null;
			Static690.aClass243_5 = null;
			Static172.aClass243_4 = null;
		}
		if (Static446.aClass355_5 != Static2.aClass355_1) {
			Static105.aBoolean196 = true;
		}
		Static484.aString85 = Static32.aClass32_12.method429(Static51.anInt1052);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1068() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static691.anInt10367 + "," + Static116.anInt2270 + "," + Static720.anInt10859 + "," + Static501.anInt7568 + "|";
			if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 != null) {
				local5 = local5 + "2)" + Static394.anInt6176 + "," + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] + Static691.anInt10367) + "," + (Static116.anInt2270 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0]) + "|";
			}
			local5 = local5 + "3)" + Static400.aClass2_Sub34_28.aClass57_Sub29_1.method5612() + "|4)" + Static400.aClass2_Sub34_28.aClass57_Sub13_2.method3038() + "|5)" + Static36.method520(3) + "|6)" + Static680.anInt10289 + "," + Static380.anInt5979 + "|";
			local5 = local5 + "7)" + Static400.aClass2_Sub34_28.aClass57_Sub24_1.method4957() + "|";
			local5 = local5 + "8)" + Static400.aClass2_Sub34_28.aClass57_Sub12_1.method3029() + "|";
			local5 = local5 + "9)" + Static400.aClass2_Sub34_28.aClass57_Sub26_1.method5262() + "|";
			local5 = local5 + "10)" + Static400.aClass2_Sub34_28.aClass57_Sub30_1.method5920() + "|";
			local5 = local5 + "11)" + Static400.aClass2_Sub34_28.aClass57_Sub20_1.method4250() + "|";
			local5 = local5 + "12)" + Static400.aClass2_Sub34_28.aClass57_Sub19_2.method4201() + "|";
			local5 = local5 + "13)" + Static369.anInt4265 + "|";
			local5 = local5 + "14)" + Static283.anInt4574;
			if (Static292.aClass2_Sub43_2 != null) {
				local5 = local5 + "|15)" + Static292.aClass2_Sub43_2.anInt7610;
			}
			try {
				if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method5612() == 2) {
					@Pc(273) Class local273 = Class.forName("java.lang.ClassLoader");
					@Pc(279) Field local279 = local273.getDeclaredField("nativeLibraries");
					@Pc(284) Class local284 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(296) Method local296 = local284.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local296.invoke(local279, Boolean.TRUE);
					@Pc(322) Vector local322 = (Vector) local279.get((Static84.aClass5 == null ? (Static84.aClass5 = a("client")) : Static84.aClass5).getClassLoader());
					for (@Pc(324) int local324 = 0; local324 < local322.size(); local324++) {
						try {
							@Pc(329) Object local329 = local322.elementAt(local324);
							@Pc(336) Field local336 = local329.getClass().getDeclaredField("name");
							local296.invoke(local336, Boolean.TRUE);
							try {
								@Pc(351) String local351 = (String) local336.get(local329);
								if (local351 != null && local351.indexOf("sw3d.dll") != -1) {
									@Pc(369) Field local369 = local329.getClass().getDeclaredField("handle");
									local296.invoke(local369, Boolean.TRUE);
									local5 = local5 + "|16)" + Long.toHexString(local369.getLong(local329));
									local296.invoke(local369, Boolean.FALSE);
								}
							} catch (@Pc(407) Throwable local407) {
							}
							local296.invoke(local336, Boolean.FALSE);
						} catch (@Pc(419) Throwable local419) {
						}
					}
				}
			} catch (@Pc(431) Throwable local431) {
			}
			local5 = local5 + "]";
		} catch (@Pc(442) Throwable local442) {
		}
		return local5;
	}

	@OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
	@Override
	public void init() {
		if (!this.method1063()) {
			return;
		}
		Static527.aClass229_3 = new Class229();
		Static527.aClass229_3.anInt5856 = Integer.parseInt(this.getParameter("worldid"));
		Static660.aClass229_4 = new Class229();
		Static660.aClass229_4.anInt5856 = Integer.parseInt(this.getParameter("lobbyid"));
		Static660.aClass229_4.aString60 = this.getParameter("lobbyaddress");
		Static2.aClass355_1 = Static463.method4383(Integer.parseInt(this.getParameter("modewhere")));
		if (Static16.aClass355_2 == Static2.aClass355_1) {
			Static2.aClass355_1 = Static425.aClass355_4;
		} else if (!Static179.method1884(Static2.aClass355_1) && Static446.aClass355_5 != Static2.aClass355_1) {
			Static2.aClass355_1 = Static446.aClass355_5;
		}
		Static598.aClass162_5 = Static624.method5898(Integer.parseInt(this.getParameter("modewhat")));
		if (Static225.aClass162_1 != Static598.aClass162_5 && Static598.aClass162_5 != Static519.aClass162_4 && Static523.aClass162_3 != Static598.aClass162_5) {
			Static598.aClass162_5 = Static523.aClass162_3;
		}
		try {
			Static51.anInt1052 = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			Static51.anInt1052 = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static464.aBoolean533 = true;
		} else {
			Static464.aBoolean533 = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static98.aBoolean191 = true;
		} else {
			Static98.aBoolean191 = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static305.aBoolean372 = true;
		} else {
			Static305.aBoolean372 = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static392.aClass377_4 = Static673.aClass377_8;
			} else if (local190.equals("1")) {
				Static392.aClass377_4 = Static723.aClass377_9;
			} else if (local190.equals("2")) {
				Static392.aClass377_4 = Static465.aClass377_5;
			} else if (local190.equals("3")) {
				Static392.aClass377_4 = Static655.aClass377_7;
			}
		}
		try {
			Static323.anInt5121 = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static323.anInt5121 = 0;
		}
		Static360.aString59 = this.getParameter("quiturl");
		Static150.aString26 = this.getParameter("settings");
		if (Static150.aString26 == null) {
			Static150.aString26 = "";
		}
		Static477.aBoolean543 = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static584.anInt8634 = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static584.anInt8634 = 0;
			}
		}
		Static338.anInt5562 = Integer.parseInt(this.getParameter("colourid"));
		if (Static338.anInt5562 < 0 || Static718.aColorArray3.length <= Static338.anInt5562) {
			Static338.anInt5562 = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static508.aBoolean582 = true;
			Static126.aBoolean200 = true;
		}
		@Pc(336) String local336 = this.getParameter("frombilling");
		if (local336 != null && local336.equals("true")) {
			Static29.aBoolean61 = true;
		}
		@Pc(356) String local356 = this.getParameter("sskey");
		if (local356 != null) {
			Static265.aByteArray44 = Static107.method1310(Static713.method6724(local356));
			if (Static265.aByteArray44.length < 16) {
				Static265.aByteArray44 = null;
			}
		}
		@Pc(382) String local382 = this.getParameter("force64mb");
		if (local382 != null && local382.equals("true")) {
			Static473.aBoolean539 = true;
		}
		@Pc(402) String local402 = this.getParameter("worldflags");
		if (local402 != null) {
			try {
				Static715.anInt10805 = Integer.parseInt(local402);
			} catch (@Pc(409) Exception local409) {
			}
		}
		@Pc(416) String local416 = this.getParameter("userFlow");
		if (local416 != null) {
			try {
				Static416.aLong208 = Long.parseLong(local416);
			} catch (@Pc(424) NumberFormatException local424) {
			}
		}
		Static389.aString64 = this.getParameter("additionalInfo");
		if (Static389.aString64 != null && Static389.aString64.length() > 50) {
			Static389.aString64 = null;
		}
		if (Static673.aClass377_8 == Static392.aClass377_4) {
			Static302.anInt4851 = 765;
			Static479.anInt7201 = 503;
		} else if (Static392.aClass377_4 == Static723.aClass377_9) {
			Static479.anInt7201 = 480;
			Static302.anInt4851 = 640;
		}
		@Pc(473) String local473 = this.getParameter("hc");
		if (local473 != null && local473.equals("1")) {
			Static416.aBoolean473 = true;
		}
		Static295.aClient1 = this;
		this.method1060(Static302.anInt4851, Static598.aClass162_5.method2502() + 32, Static392.aClass377_4.aString114, Static479.anInt7201);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void method1070() {
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method5612() != 2) {
			this.method1086();
			return;
		}
		try {
			this.method1086();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			Static240.method2529(local24, local24.getMessage() + " (Recovered) " + this.method1068());
			Static171.aBoolean245 = true;
			Static32.method432(0, false);
		}
	}
}
