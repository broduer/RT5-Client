import java.awt.Canvas;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!client")
public final class client extends GameShell {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/util/Random;")
	public static final Random random = new Random();

	@OriginalMember(owner = "client!jga", name = "k", descriptor = "Lclient!client;")
	public static client instance;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "Lclient!oba;")
	public static PrivilegedRequest js5SocketRequest;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!pla;")
	public static Class297 js5NetQueue;

	@OriginalMember(owner = "client!vea", name = "J", descriptor = "Lclient!nk;")
	public static ClientStream js5Socket;

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	public static int js5ConnectState = 0;

	@OriginalMember(owner = "client!vba", name = "H", descriptor = "Z")
	public static boolean clean = false;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public static int cycle = 0;

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
	public static int seed;

	@OriginalMember(owner = "client!qka", name = "f", descriptor = "Lclient!lja;")
	public static Class231 world;

	@OriginalMember(owner = "client!uu", name = "o", descriptor = "Lclient!lja;")
	public static Class231 lobby;

	@OriginalMember(owner = "client!aaa", name = "T", descriptor = "Lclient!tka;")
	public static Class357 modewhere;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "Lclient!hh;")
	public static Class162 modewhat;

	@OriginalMember(owner = "client!bma", name = "c", descriptor = "I")
	public static int lang = 0;
	@OriginalMember(owner = "client!cu", name = "gb", descriptor = "Lclient!sb;")
	public static Class332 js5Archive5;

	@OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
	public static void main(@OriginalArg(0) String[] args) {
		try {
			if (args.length != 6) {
				Static426.method1016("Argument count");
			}
			world = new Class231();
			world.id = Integer.parseInt(args[0]);
			lobby = new Class231();
			lobby.id = Integer.parseInt(args[1]);
			modewhere = Static16.localMode;
			if (args[3].equals("live")) {
				modewhat = Static523.aClass162_3;
			} else if (args[3].equals("rc")) {
				modewhat = Static519.aClass162_4;
			} else if (args[3].equals("wip")) {
				modewhat = Static225.aClass162_1;
			} else {
				Static426.method1016("modewhat");
			}
			lang = Static541.method7205(args[4]);
			if (lang == -1) {
				if (args[4].equals("english")) {
					lang = 0;
				} else if (args[4].equals("german")) {
					lang = 1;
				} else {
					Static426.method1016("language");
				}
			}
			Static464.objecttag = false;
			Static98.js = false;
			if (args[5].equals("game0")) {
				Static392.game = Static673.runescapeGame;
			} else if (args[5].equals("game1")) {
				Static392.game = Static723.aClass379_9;
			} else if (args[5].equals("game2")) {
				Static392.game = Static465.aClass379_5;
			} else if (args[5].equals("game3")) {
				Static392.game = Static655.aClass379_7;
			} else {
				Static426.method1016("game");
			}
			Static323.affid = 0;
			Static715.worldflags = 0;
			Static29.frombilling = false;
			Static508.aBoolean582 = true;
			Static126.aBoolean200 = true;
			Static473.force64mb = false;
			Static389.additionalInfo = null;
			Static338.colourid = Static392.game.id;
			Static150.settings = "";
			Static265.sskey = null;
			Static584.country = 0;
			Static416.userFlow = 0L;
			@Pc(241) client c = new client();
			instance = c;
			c.method1635(37, 667, modewhat.method3469() + 32, 768, Static392.game.name, 1024);
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(265) Exception local265) {
			TracingException.report(local265, null);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void clean() {
		Static467.aClass96_3.method2355();
		Static540.aClass79_6.method2073();
		Static68.aClass217_3.method5052();
		Static354.aClass142_4.method3064();
		Static690.aClass310_2.method7092();
		Static419.aClass112_1.method2479();
		Static25.aClass50_1.method1163();
		Static23.aClass128_1.method2698();
		Static529.aClass161_1.method3428();
		Static36.aClass262_1.method5792();
		Static628.aClass344_5.method7791();
		Static648.aClass17_1.method267();
		Static574.aClass312_2.method7122();
		Static577.aClass248_4.method5588();
		Static720.aClass365_4.method8374();
		Static386.aClass49_2.method1158();
		Static272.aClass45_1.method1096();
		Static324.aClass309_1.method7075();
		Static99.aClass78_1.method2055();
		Static48.aClass386_1.method8820();
		Static354.aClass269_1.method5977();
		Static652.aClass216_1.method5044();
		Static561.aClass222_2.method5191();
		Static559.method7421();
		Static534.method7128();
		Static402.method5587();
		Static198.method2951();
		Static194.method2907();
		Static230.aClass82_81.method2147(5);
		Static669.aClass82_215.method2147(5);
		Static541.aClass82_174.method2147(5);
		Static452.aClass82_149.method2147(5);
		Static472.aClass82_156.method2147(5);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	@Override
	public synchronized void method1641() {
		if (signlink.mainapp != null && GameShell.canvas == null && !GameShell.sign.aBoolean780) {
			try {
				@Pc(25) Class local25 = signlink.mainapp.getClass();
				@Pc(31) Field local31 = local25.getDeclaredField("canvas");
				GameShell.canvas = (Canvas) local31.get(signlink.mainapp);
				local31.set(signlink.mainapp, null);
				if (GameShell.canvas != null) {
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		super.method1641();
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	@Override
	protected void quit() {
		if (Static624.aBoolean728) {
			Static266.method6784();
		}
		Static419.method5764();
		if (Static163.aClass19_17 != null) {
			Static163.aClass19_17.method7947();
		}
		if (GameShell.fullscreenFrame != null) {
			Static655.method8569(GameShell.sign, GameShell.fullscreenFrame);
			GameShell.fullscreenFrame = null;
		}
		Static405.aClass153_2.method3274();
		Static405.aClass153_1.method3274();
		Static173.method2690();
		js5NetQueue.method6628();
		Static66.aClass174_1.method3826();
		if (Static151.aClass228_20 != null) {
			Static151.aClass228_20.method5250();
			Static151.aClass228_20 = null;
		}
		try {
			Static172.aClass245_4.method5573();
			for (@Pc(66) int local66 = 0; local66 < 37; local66++) {
				Static208.aClass245Array1[local66].method5573();
			}
			Static5.aClass245_1.method5573();
			Static690.aClass245_5.method5573();
			Static314.method4574();
		} catch (@Pc(91) Exception local91) {
		}
	}

	@OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
	private void js5Connect() {
		if (Static522.js5PrevErrors < js5NetQueue.errors) {
			Static344.aClass231_1.method5267();
			Static370.js5ConnectDelay = (js5NetQueue.errors * 50 - 50) * 5;
			if (Static370.js5ConnectDelay > 3000) {
				Static370.js5ConnectDelay = 3000;
			}
			if (js5NetQueue.errors >= 2 && js5NetQueue.response == 6) {
				this.error("js5connect_outofdate");
				Static283.anInt4588 = 16;
				return;
			}
			if (js5NetQueue.errors >= 4 && js5NetQueue.response == -1) {
				this.error("js5crc");
				Static283.anInt4588 = 16;
				return;
			}
			if (js5NetQueue.errors >= 4 && Static181.method2778(Static283.anInt4588)) {
				if (js5NetQueue.response == 7 || js5NetQueue.response == 9) {
					this.error("js5connect_full");
				} else if (js5NetQueue.response <= 0) {
					this.error("js5io");
				} else if (Static376.aString62 == null) {
					this.error("js5connect");
				} else {
					this.error("js5proxy_" + Static376.aString62.trim());
				}
				Static283.anInt4588 = 16;
				return;
			}
		}
		Static522.js5PrevErrors = js5NetQueue.errors;
		if (Static370.js5ConnectDelay > 0) {
			Static370.js5ConnectDelay--;
			return;
		}
		try {
			if (js5ConnectState == 0) {
				js5SocketRequest = Static344.aClass231_1.method5270(GameShell.sign);
				js5ConnectState++;
			}
			if (js5ConnectState == 1) {
				if (js5SocketRequest.status == 2) {
					if (js5SocketRequest.result != null) {
						Static376.aString62 = (String) js5SocketRequest.result;
					}
					this.setJs5Response(1000);
					return;
				}
				if (js5SocketRequest.status == 1) {
					js5ConnectState++;
				}
			}
			if (js5ConnectState == 2) {
				js5Socket = new ClientStream((Socket) js5SocketRequest.result, GameShell.sign, 25000);
				@Pc(251) Class2_Sub21 local251 = new Class2_Sub21(5);
				local251.method7396(Static572.aClass167_54.anInt3984);
				local251.method7349(667);
				js5Socket.method5836(0, 5, local251.aByteArray93);
				js5ConnectState++;
				Static678.js5ConnectTime = Static588.currentTimeMillis();
			}
			if (js5ConnectState == 3) {
				if (Static181.method2778(Static283.anInt4588) || js5Socket.available() > 0) {
					@Pc(296) int response = js5Socket.read();
					if (response != 0) {
						this.setJs5Response(response);
						return;
					}
					js5ConnectState++;
				} else if (Static588.currentTimeMillis() - Static678.js5ConnectTime > 30000L) {
					this.setJs5Response(1001);
					return;
				}
			}
			if (js5ConnectState == 4) {
				@Pc(356) boolean loggedOut = Static181.method2778(Static283.anInt4588) || Static41.method1027(Static283.anInt4588) || Static620.method8328(Static283.anInt4588);
				@Pc(359) Class328[] local359 = Static566.method7474();
				@Pc(367) Class2_Sub21 local367 = new Class2_Sub21(local359.length * 4);
				js5Socket.read(local367.aByteArray93.length, 0, local367.aByteArray93);
				for (@Pc(378) int i = 0; i < local359.length; i++) {
					local359[i].method7475(local367.method7356());
				}
				js5NetQueue.start(!loggedOut, js5Socket);
				js5ConnectState = 0;
				js5Socket = null;
				js5SocketRequest = null;
			}
		} catch (@Pc(417) IOException local417) {
			this.setJs5Response(1002);
		}
	}

	@OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
	private void method1658() {
		@Pc(46) int local46;
		if (Static283.anInt4588 == 7 && !Static242.method3500() || Static283.anInt4588 == 9 && Static169.anInt2864 == 42) {
			if (Static249.anInt4019 > 1) {
				Static249.anInt4019--;
				Static321.anInt5128 = Static642.anInt9625;
			}
			if (!Static400.aBoolean623) {
				Static79.method1578();
			}
			for (local46 = 0; local46 < 100 && Static236.method3451(Static405.aClass153_1); local46++) {
			}
		}
		Static35.anInt803++;
		Static449.method6121(-1, -1, null);
		Static65.method1473(-1, -1, null);
		Static443.method5988();
		Static642.anInt9625++;
		for (local46 = 0; local46 < Static416.anInt6398; local46++) {
			@Pc(97) Class8_Sub2_Sub1_Sub2_Sub2 local97 = Static592.aClass2_Sub45Array1[local46].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local97 != null) {
				@Pc(103) byte local103 = local97.aClass270_1.aByte103;
				if ((local103 & 0x1) != 0) {
					@Pc(114) int local114 = local97.method9309((byte) 48);
					@Pc(142) int local142;
					if ((local103 & 0x2) != 0 && local97.anInt10793 == 0 && Math.random() * 1000.0D < 10.0D) {
						local142 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						@Pc(150) int local150 = (int) Math.round(Math.random() * 10.0D - 5.0D);
						if (local142 != 0 || local150 != 0) {
							@Pc(166) int local166 = local142 + local97.anIntArray879[0];
							if (local166 < 0) {
								local166 = 0;
							} else if (local166 > Static720.anInt10888 - local114 - 1) {
								local166 = Static720.anInt10888 - local114 - 1;
							}
							@Pc(203) int local203 = local150 + local97.anIntArray878[0];
							if (local203 < 0) {
								local203 = 0;
							} else if (local203 > Static501.anInt7591 - local114 - 1) {
								local203 = Static501.anInt7591 - local114 - 1;
							}
							@Pc(258) int local258 = Static521.method6877(local203, local114, true, 0, local97.anIntArray879[0], local114, Static480.anIntArray583, local114, local97.anIntArray878[0], -1, Static577.aClass110Array1[local97.aByte144], Static70.anIntArray147, local166, 0);
							if (local258 > 0) {
								if (local258 > 9) {
									local258 = 9;
								}
								for (@Pc(274) int local274 = 0; local274 < local258; local274++) {
									local97.anIntArray879[local274] = Static70.anIntArray147[local258 - local274 - 1];
									local97.anIntArray878[local274] = Static480.anIntArray583[local258 - local274 - 1];
									local97.aByteArray111[local274] = 1;
								}
								local97.anInt10793 = local258;
							}
						}
					}
					Static256.method3638(local97, true);
					local142 = Static112.method2104(local97);
					Static145.method2410(local97);
					Static651.method8520(Static521.anInt7779, local142, Static524.anInt8065, local97);
					Static702.method9173(local97, Static521.anInt7779);
					Static50.method6645(local97);
				}
			}
		}
		if ((Static283.anInt4588 == 3 || Static283.anInt4588 == 9 || Static283.anInt4588 == 7) && (!Static242.method3500() || Static283.anInt4588 == 9 && Static169.anInt2864 == 42) && Static6.anInt95 == 0) {
			if (Static511.anInt7668 == 2) {
				Static592.method7768();
			} else {
				Static583.method7666();
			}
			if (Static170.anInt2873 >> 9 < 14 || Static170.anInt2873 >> 9 >= Static720.anInt10888 - 14 || Static110.anInt2195 >> 9 < 14 || Static110.anInt2195 >> 9 >= Static501.anInt7591 - 14) {
				Static54.method1179();
			}
		}
		while (true) {
			@Pc(453) Class2_Sub42 local453;
			@Pc(458) Class158 local458;
			@Pc(470) Class158 local470;
			do {
				local453 = (Class2_Sub42) Static618.aClass341_68.method7712();
				if (local453 == null) {
					while (true) {
						do {
							local453 = (Class2_Sub42) Static59.aClass341_33.method7712();
							if (local453 == null) {
								while (true) {
									do {
										local453 = (Class2_Sub42) Static521.aClass341_44.method7712();
										if (local453 == null) {
											if (Static109.aClass158_3 != null) {
												Static603.method7906();
											}
											if (cycle % 1500 == 0) {
												Static314.method4569();
											}
											if (Static283.anInt4588 == 7 && !Static242.method3500() || Static283.anInt4588 == 9 && Static169.anInt2864 == 42) {
												Static320.method4605();
											}
											Static587.method7711();
											if (Static624.aBoolean728 && Static588.currentTimeMillis() - 60000L > Static98.aLong71) {
												Static266.method6784();
											}
											for (@Pc(672) Class8_Sub4_Sub1 local672 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2790(); local672 != null; local672 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2785()) {
												if ((long) local672.anInt6453 < Static588.currentTimeMillis() / 1000L - 5L) {
													if (local672.aShort74 > 0) {
														Static44.method1072(local672.aString72 + Static32.aClass32_19.method877(lang), "", 0, "", "", 5);
													}
													if (local672.aShort74 == 0) {
														Static44.method1072(local672.aString72 + Static32.aClass32_20.method877(lang), "", 0, "", "", 5);
													}
													local672.method9281();
												}
											}
											if (Static283.anInt4588 == 7 && !Static242.method3500() || Static283.anInt4588 == 9 && Static169.anInt2864 == 42) {
												if (Static283.anInt4588 != 9 && Static405.aClass153_1.aClass350_1 == null) {
													Static233.method3409(false);
													return;
												}
												if (Static405.aClass153_1 != null) {
													Static405.aClass153_1.anInt3657++;
													if (Static405.aClass153_1.anInt3657 > 50) {
														@Pc(823) Class2_Sub19 local823 = Static293.method4342(Static415.aClass347_75, Static405.aClass153_1.aClass186_1);
														Static405.aClass153_1.method3275(local823);
													}
													try {
														Static405.aClass153_1.method3273();
														return;
													} catch (@Pc(832) IOException local832) {
														if (Static283.anInt4588 != 9) {
															Static233.method3409(false);
															return;
														}
														Static405.aClass153_1.method3274();
														return;
													}
												}
											}
											return;
										}
										local458 = local453.aClass158_14;
										if (local458.anInt3751 < 0) {
											break;
										}
										local470 = Static145.method2412(local458.anInt3753);
									} while (local470 == null || local470.aClass158Array2 == null || local470.aClass158Array2.length <= local458.anInt3751 || local470.aClass158Array2[local458.anInt3751] != local458);
									Static472.method6427(local453);
								}
							}
							local458 = local453.aClass158_14;
							if (local458.anInt3751 < 0) {
								break;
							}
							local470 = Static145.method2412(local458.anInt3753);
						} while (local470 == null || local470.aClass158Array2 == null || local470.aClass158Array2.length <= local458.anInt3751 || local458 != local470.aClass158Array2[local458.anInt3751]);
						Static472.method6427(local453);
					}
				}
				local458 = local453.aClass158_14;
				if (local458.anInt3751 < 0) {
					break;
				}
				local470 = Static145.method2412(local458.anInt3753);
			} while (local470 == null || local470.aClass158Array2 == null || local470.aClass158Array2.length <= local458.anInt3751 || local458 != local470.aClass158Array2[local458.anInt3751]);
			Static472.method6427(local453);
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	private void js5NetworkCycle() {
		@Pc(7) boolean idle = js5NetQueue.cycle();
		if (!idle) {
			this.js5Connect();
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
	@Override
	protected void reset() {
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
	private void draw() {
		if (Static283.anInt4588 == 16) {
			return;
		}
		@Pc(20) long local20 = GameShell.time() / 1000000L - Static206.aLong114;
		Static206.aLong114 = GameShell.time() / 1000000L;
		@Pc(28) boolean local28 = Static576.method7618();
		if (local28 && Static501.jingle && Static719.musicChannel != null) {
			Static719.musicChannel.method3592();
		}
		if (Static475.method6452(Static283.anInt4588)) {
			if (Static297.aLong153 != 0L && Static588.currentTimeMillis() > Static297.aLong153) {
				Static409.setWindowMode(Static36.method978(), Static560.anInt8453, false, Static433.anInt6278);
			} else if (!Static163.aClass19_17.method8008() && GameShell.replaceCanvas) {
				Static574.method7579();
			}
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (GameShell.fullscreenFrame == null) {
			@Pc(98) Container local98;
			if (GameShell.frame != null) {
				local98 = GameShell.frame;
			} else if (signlink.mainapp == null) {
				local98 = GameShell.instance;
			} else {
				local98 = signlink.mainapp;
			}
			local110 = local98.getSize().width;
			local114 = local98.getSize().height;
			if (local98 == GameShell.frame) {
				@Pc(120) Insets local120 = GameShell.frame.getInsets();
				local114 -= local120.bottom + local120.top;
				local110 -= local120.right + local120.left;
			}
			if (Static52.anInt1063 != local110 || local114 != Static54.anInt1088 || Static284.aBoolean355) {
				if (Static163.aClass19_17 == null || Static163.aClass19_17.method7990()) {
					Static712.method9336();
				} else {
					Static52.anInt1063 = local110;
					Static54.anInt1088 = local114;
				}
				Static297.aLong153 = Static588.currentTimeMillis() + 500L;
				Static284.aBoolean355 = false;
			}
		}
		if (GameShell.fullscreenFrame != null && !GameShell.focus && Static475.method6452(Static283.anInt4588)) {
			Static409.setWindowMode(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
		}
		@Pc(209) boolean local209 = false;
		if (GameShell.fullRedraw) {
			local209 = true;
			GameShell.fullRedraw = false;
		}
		if (local209) {
			Static288.method4189();
		}
		if (Static163.aClass19_17 != null && Static163.aClass19_17.method8008() || Static36.method978() != 1) {
			Static469.method6369();
		}
		if (Static181.method2778(Static283.anInt4588)) {
			Static523.method3447(local209);
		} else if (Static366.method5269(Static283.anInt4588)) {
			Static24.method680();
		} else if (Static384.method5400(Static283.anInt4588)) {
			Static24.method680();
		} else if (Static594.method7789(Static283.anInt4588)) {
			if (Static213.anInt3482 == 1) {
				if (Static593.anInt8787 > Static357.anInt6528) {
					Static357.anInt6528 = Static593.anInt8787;
				}
				local110 = (Static357.anInt6528 - Static593.anInt8787) * 50 / Static357.anInt6528;
				Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.method877(lang) + "<br>(" + local110 + "%)", true, Static694.aClass383_13, Static437.aClass14_9);
			} else if (Static213.anInt3482 == 2) {
				if (Static13.anInt150 > Static440.anInt6703) {
					Static440.anInt6703 = Static13.anInt150;
				}
				local110 = (Static440.anInt6703 - Static13.anInt150) * 50 / Static440.anInt6703 + 50;
				Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.method877(lang) + "<br>(" + local110 + "%)", true, Static694.aClass383_13, Static437.aClass14_9);
			} else {
				Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.method877(lang), true, Static694.aClass383_13, Static437.aClass14_9);
			}
		} else if (Static283.anInt4588 == 11) {
			Static686.method7937(local20);
		} else if (Static283.anInt4588 == 14) {
			Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_14.method877(lang) + "<br>" + Static32.aClass32_15.method877(lang), false, Static694.aClass383_13, Static437.aClass14_9);
		} else if (Static283.anInt4588 == 15) {
			Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_31.method877(lang), false, Static694.aClass383_13, Static437.aClass14_9);
		}
		if (Static18.anInt251 == 3) {
			for (local110 = 0; local110 < Static122.rectangles; local110++) {
				@Pc(478) Rectangle local478 = Class2_Sub1_Sub28.aRectangleArray1[local110];
				if (Static359.aBooleanArray17[local110]) {
					Static163.aClass19_17.method7952(local478.y, 0xFFFF00FF, local478.width, local478.height, local478.x);
				} else if (Static469.rectangleRedraw[local110]) {
					Static163.aClass19_17.method7952(local478.y, 0xFFFF0000, local478.width, local478.height, local478.x);
				} else {
					Static163.aClass19_17.method7952(local478.y, 0xFF00FF00, local478.width, local478.height, local478.x);
				}
			}
		}
		if (Static607.method8170()) {
			Static546.method7258(Static163.aClass19_17);
		}
		if (GameShell.sign.aBoolean780 && Static475.method6452(Static283.anInt4588) && Static18.anInt251 == 0 && Static36.method978() == 1 && !local209) {
			local110 = 0;
			for (local114 = 0; local114 < Static122.rectangles; local114++) {
				if (Static469.rectangleRedraw[local114]) {
					Static469.rectangleRedraw[local114] = false;
					Static663.aRectangleArray2[local110++] = Class2_Sub1_Sub28.aRectangleArray1[local114];
				}
			}
			try {
				if (Static137.aBoolean210) {
					Static700.method9155(local110, Static663.aRectangleArray2);
				} else {
					Static163.aClass19_17.method8012(local110, Static663.aRectangleArray2);
				}
			} catch (@Pc(629) Exception_Sub1 local629) {
			}
		} else if (!Static181.method2778(Static283.anInt4588)) {
			for (local110 = 0; local110 < Static122.rectangles; local110++) {
				Static469.rectangleRedraw[local110] = false;
			}
			try {
				if (Static137.aBoolean210) {
					Static430.method5825();
				} else {
					Static163.aClass19_17.method7991();
				}
			} catch (@Pc(666) Exception_Sub1 local666) {
				TracingException.report(local666, local666.getMessage() + " (Recovered) " + this.method1648());
				Static32.method880(0, false);
			}
		}
		Static507.method6751();
		local110 = Static400.aClass2_Sub34_28.aClass57_Sub21_1.method6367();
		if (local110 == 0) {
			ThreadUtils.sleep(15L);
		} else if (local110 == 1) {
			ThreadUtils.sleep(10L);
		} else if (local110 == 2) {
			ThreadUtils.sleep(5L);
		} else if (local110 == 3) {
			ThreadUtils.sleep(2L);
		}
		if (clean) {
			clean();
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub10_1.method3519() == 1 && Static283.anInt4588 == 3 && Static377.anInt5950 != -1) {
			Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub10_1);
			Static666.method8700(1);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
	private void setJs5Response(@OriginalArg(1) int response) {
		js5SocketRequest = null;
		js5NetQueue.response = response;
		js5Socket = null;
		js5NetQueue.errors++;
		js5ConnectState = 0;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	@Override
	protected void method1645() {
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() != 2) {
			this.updateCycle();
			return;
		}
		try {
			this.updateCycle();
		} catch (@Pc(21) ThreadDeath local21) {
			throw local21;
		} catch (@Pc(24) Throwable local24) {
			TracingException.report(local24, local24.getMessage() + " (Recovered) " + this.method1648());
			Static171.aBoolean245 = true;
			Static32.method880(0, false);
		}
	}

	@OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
	private void updateCycle() {
		if (Static283.anInt4588 == 16) {
			return;
		}
		cycle++;
		if (cycle % 1000 == 1) {
			@Pc(27) GregorianCalendar calendar = new GregorianCalendar();
			seed = calendar.get(Calendar.HOUR_OF_DAY) * 600 + calendar.get(Calendar.MINUTE) * 10 + calendar.get(Calendar.SECOND) / 6;
			random.setSeed(seed);
		}
		Static405.aClass153_2.method3271();
		Static405.aClass153_1.method3271();
		this.js5NetworkCycle();
		if (Static228.aClass264_1 != null) {
			Static228.aClass264_1.method5811();
		}
		Static601.method7872();
		Static236.method3453();
		Static334.aClass321_1.method8488();
		Static189.aClass120_1.method8848();
		if (Static163.aClass19_17 != null) {
			Static163.aClass19_17.method7984((int) Static588.currentTimeMillis());
		}
		Static711.method9279();
		Static671.anInt10053 = 0;
		Static216.anInt3540 = 0;
		for (@Pc(94) Interface27 local94 = Static334.aClass321_1.method8485(); local94 != null; local94 = Static334.aClass321_1.method8485()) {
			@Pc(102) int local102 = local94.method2668();
			if (local102 == 2 || local102 == 3) {
				@Pc(118) char local118 = local94.method2666();
				if (Static647.method8475() && (local118 == '`' || local118 == '§' || local118 == '²')) {
					if (Static607.method8170()) {
						Static129.method2279();
					} else {
						Static455.method6231();
					}
				} else if (Static671.anInt10053 < 128) {
					Static194.anInterface27Array1[Static671.anInt10053] = local94;
					Static671.anInt10053++;
				}
			} else if (local102 == 0 && Static216.anInt3540 < 75) {
				Static591.anInterface27Array2[Static216.anInt3540] = local94;
				Static216.anInt3540++;
			}
		}
		Static611.anInt9367 = 0;
		for (@Pc(214) Class2_Sub9 local214 = Static189.aClass120_1.method8858(); local214 != null; local214 = Static189.aClass120_1.method8858()) {
			@Pc(222) int local222 = local214.method5335();
			if (local222 == -1) {
				Static677.aClass341_76.method7718(local214);
			} else if (local222 == 6) {
				Static611.anInt9367 += local214.method5339();
			} else if (Static278.method4070(local222)) {
				Static226.aClass341_58.method7718(local214);
				if (Static226.aClass341_58.method7708() > 10) {
					Static226.aClass341_58.method7712();
				}
			}
		}
		if (Static607.method8170()) {
			Static668.method8710();
		}
		if (Static181.method2778(Static283.anInt4588)) {
			Static709.method9259();
			Static199.method2977();
		} else if (Static594.method7789(Static283.anInt4588)) {
			Static489.method6555();
		}
		if (Static41.method1027(Static283.anInt4588) && !Static594.method7789(Static283.anInt4588)) {
			this.method1658();
			Static76.method1555();
			Static364.method5260();
		} else if (Static620.method8328(Static283.anInt4588) && !Static594.method7789(Static283.anInt4588)) {
			this.method1658();
			Static364.method5260();
		} else if (Static283.anInt4588 == 13) {
			Static364.method5260();
		} else if (Static109.method2070(Static283.anInt4588) && !Static594.method7789(Static283.anInt4588)) {
			Static709.method9261();
		} else if (Static283.anInt4588 == 14 || Static283.anInt4588 == 15) {
			Static364.method5260();
			if (Static169.anInt2864 != -3 && Static169.anInt2864 != 2 && Static169.anInt2864 != 15) {
				if (Static283.anInt4588 == 15) {
					Static78.anInt1633 = Static169.anInt2864;
					Static673.anInt10106 = Static356.anInt5800;
					Static383.anInt6021 = Static329.anInt1756;
					if (Static718.aBoolean824) {
						Static430.method5824(Static459.aClass231_2.id, Static459.aClass231_2.address);
						Static405.aClass153_2.aClass350_1 = null;
						Static81.method1586(14);
					} else {
						Static233.method3409(Static461.aBoolean529);
					}
				} else {
					Static233.method3409(false);
				}
			}
		}
		Static369.method3851(Static163.aClass19_17);
		Static226.aClass341_58.method7712();
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	@Override
	protected void method1647() {
		if (Static473.force64mb) {
			GameShell.maxMemory = 64;
		}
		@Pc(18) Frame local18 = new Frame("Jagex");
		local18.pack();
		local18.dispose();
		Static712.method9336();
		Static66.aClass174_1 = new Class174(GameShell.sign);
		js5NetQueue = new Class297();
		Static545.method7248(new int[] { 20, 260 }, new int[] { 1000, 100 });
		if (Static446.liveMode != modewhere) {
			Static163.fakeModelCacheEntries = new byte[50][];
		}
		Static400.aClass2_Sub34_28 = Static720.method9405();
		if (modewhere == Static446.liveMode) {
			world.address = this.getCodeBase().getHost();
		} else if (Static179.method2769(modewhere)) {
			world.address = this.getCodeBase().getHost();
			world.defaultPort = world.id + 40000;
			world.alternatePort = world.id + 50000;
			lobby.defaultPort = lobby.id + 40000;
			lobby.alternatePort = lobby.id + 50000;
		} else if (Static16.localMode == modewhere) {
			world.address = "127.0.0.1";
			world.defaultPort = world.id + 40000;
			lobby.address = "127.0.0.1";
			world.alternatePort = world.id + 50000;
			lobby.defaultPort = lobby.id + 40000;
			lobby.alternatePort = lobby.id + 50000;
		}
		Static344.aClass231_1 = world;
		Static637.recolorPalette = Static419.recolorPalette = Static553.recolorPalette = Static238.recolorPalette = new short[256];
		if (Static392.game == Static673.runescapeGame) {
			Static273.aBoolean340 = false;
		}
		try {
			Static175.clipboard = instance.getToolkit().getSystemClipboard();
		} catch (@Pc(183) Exception local183) {
		}
		Static334.aClass321_1 = Static681.method8928(GameShell.canvas);
		Static189.aClass120_1 = Static70.method1513(GameShell.canvas);
		try {
			if (GameShell.sign.aClass83_2 != null) {
				Static172.aClass245_4 = new Class245(GameShell.sign.aClass83_2, 5200, 0);
				for (@Pc(205) int local205 = 0; local205 < 37; local205++) {
					Static208.aClass245Array1[local205] = new Class245(GameShell.sign.aClass83Array1[local205], 6000, 0);
				}
				Static5.aClass245_1 = new Class245(GameShell.sign.aClass83_3, 6000, 0);
				Static276.aClass9_1 = new Class9(255, Static172.aClass245_4, Static5.aClass245_1, 500000);
				Static690.aClass245_5 = new Class245(GameShell.sign.aClass83_4, 24, 0);
				GameShell.sign.aClass83_3 = null;
				GameShell.sign.aClass83Array1 = null;
				GameShell.sign.aClass83_2 = null;
				GameShell.sign.aClass83_4 = null;
			}
		} catch (@Pc(275) IOException local275) {
			Static5.aClass245_1 = null;
			Static276.aClass9_1 = null;
			Static690.aClass245_5 = null;
			Static172.aClass245_4 = null;
		}
		if (Static446.liveMode != modewhere) {
			Static105.aBoolean196 = true;
		}
		Static484.aString85 = Static32.aClass32_12.method877(lang);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(I)Ljava/lang/String;")
	@Override
	public String method1648() {
		@Pc(5) String local5 = null;
		try {
			local5 = "[1)" + Static691.anInt10395 + "," + Static116.anInt2279 + "," + Static720.anInt10888 + "," + Static501.anInt7591 + "|";
			if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 != null) {
				local5 = local5 + "2)" + Static394.anInt6196 + "," + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] + Static691.anInt10395) + "," + (Static116.anInt2279 + Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0]) + "|";
			}
			local5 = local5 + "3)" + Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() + "|";
			local5 = local5 + "4)" + Static400.aClass2_Sub34_28.aClass57_Sub13_2.method4380() + "|";
			local5 = local5 + "5)" + Static36.method978() + "|";
			local5 = local5 + "6)" + GameShell.canvasWidth + "," + GameShell.canvasHeight + "|";
			local5 = local5 + "7)" + Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7089() + "|";
			local5 = local5 + "8)" + Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371() + "|";
			local5 = local5 + "9)" + Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7470() + "|";
			local5 = local5 + "10)" + Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8363() + "|";
			local5 = local5 + "11)" + Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6115() + "|";
			local5 = local5 + "12)" + Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() + "|";
			local5 = local5 + "13)" + GameShell.maxMemory + "|";
			local5 = local5 + "14)" + Static283.anInt4588;
			if (Static292.instance != null) {
				local5 = local5 + "|15)" + Static292.instance.anInt7633;
			}
			try {
				if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 2) {
					@Pc(273) Class local273 = Class.forName("java.lang.ClassLoader");
					@Pc(279) Field local279 = local273.getDeclaredField("nativeLibraries");
					@Pc(284) Class local284 = Class.forName("java.lang.reflect.AccessibleObject");
					@Pc(296) Method local296 = local284.getDeclaredMethod("setAccessible", Boolean.TYPE);
					local296.invoke(local279, Boolean.TRUE);
					@Pc(322) Vector local322 = (Vector) local279.get((Static84.aClass5 == null ? (Static84.aClass5 = Class.forName("client")) : Static84.aClass5).getClassLoader());
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
		if (!this.isHostnameValid()) {
			return;
		}

		world = new Class231();
		world.id = Integer.parseInt(this.getParameter("worldid"));
		lobby = new Class231();
		lobby.id = Integer.parseInt(this.getParameter("lobbyid"));
		lobby.address = this.getParameter("lobbyaddress");
		modewhere = Static463.method6286(Integer.parseInt(this.getParameter("modewhere")));
		if (Static16.localMode == modewhere) {
			modewhere = Static425.wtwipMode;
		} else if (!Static179.method2769(modewhere) && Static446.liveMode != modewhere) {
			modewhere = Static446.liveMode;
		}
		modewhat = Static624.method8336(Integer.parseInt(this.getParameter("modewhat")));
		if (Static225.aClass162_1 != modewhat && modewhat != Static519.aClass162_4 && Static523.aClass162_3 != modewhat) {
			modewhat = Static523.aClass162_3;
		}
		try {
			lang = Integer.parseInt(this.getParameter("lang"));
		} catch (@Pc(110) Exception local110) {
			lang = 0;
		}
		@Pc(118) String local118 = this.getParameter("objecttag");
		if (local118 != null && local118.equals("1")) {
			Static464.objecttag = true;
		} else {
			Static464.objecttag = false;
		}
		@Pc(142) String local142 = this.getParameter("js");
		if (local142 != null && local142.equals("1")) {
			Static98.js = true;
		} else {
			Static98.js = false;
		}
		@Pc(166) String local166 = this.getParameter("advert");
		if (local166 != null && local166.equals("1")) {
			Static305.advert = true;
		} else {
			Static305.advert = false;
		}
		@Pc(190) String local190 = this.getParameter("game");
		if (local190 != null) {
			if (local190.equals("0")) {
				Static392.game = Static673.runescapeGame;
			} else if (local190.equals("1")) {
				Static392.game = Static723.aClass379_9;
			} else if (local190.equals("2")) {
				Static392.game = Static465.aClass379_5;
			} else if (local190.equals("3")) {
				Static392.game = Static655.aClass379_7;
			}
		}
		try {
			Static323.affid = Integer.parseInt(this.getParameter("affid"));
		} catch (@Pc(247) Exception local247) {
			Static323.affid = 0;
		}
		Static360.quiturl = this.getParameter("quiturl");
		Static150.settings = this.getParameter("settings");
		if (Static150.settings == null) {
			Static150.settings = "";
		}
		Static477.under = "1".equals(this.getParameter("under"));
		@Pc(281) String local281 = this.getParameter("country");
		if (local281 != null) {
			try {
				Static584.country = Integer.parseInt(local281);
			} catch (@Pc(288) Exception local288) {
				Static584.country = 0;
			}
		}
		Static338.colourid = Integer.parseInt(this.getParameter("colourid"));
		if (Static338.colourid < 0 || Static718.aColorArray3.length <= Static338.colourid) {
			Static338.colourid = 0;
		}
		if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
			Static508.aBoolean582 = true;
			Static126.aBoolean200 = true;
		}
		@Pc(336) String local336 = this.getParameter("frombilling");
		if (local336 != null && local336.equals("true")) {
			Static29.frombilling = true;
		}
		@Pc(356) String local356 = this.getParameter("sskey");
		if (local356 != null) {
			Static265.sskey = Static107.method2054(Static713.method9340(local356));
			if (Static265.sskey.length < 16) {
				Static265.sskey = null;
			}
		}
		@Pc(382) String local382 = this.getParameter("force64mb");
		if (local382 != null && local382.equals("true")) {
			Static473.force64mb = true;
		}
		@Pc(402) String local402 = this.getParameter("worldflags");
		if (local402 != null) {
			try {
				Static715.worldflags = Integer.parseInt(local402);
			} catch (@Pc(409) Exception local409) {
			}
		}
		@Pc(416) String local416 = this.getParameter("userFlow");
		if (local416 != null) {
			try {
				Static416.userFlow = Long.parseLong(local416);
			} catch (@Pc(424) NumberFormatException local424) {
			}
		}
		Static389.additionalInfo = this.getParameter("additionalInfo");
		if (Static389.additionalInfo != null && Static389.additionalInfo.length() > 50) {
			Static389.additionalInfo = null;
		}
		if (Static673.runescapeGame == Static392.game) {
			Static302.anInt4867 = 765;
			Static479.anInt7222 = 503;
		} else if (Static392.game == Static723.aClass379_9) {
			Static479.anInt7222 = 480;
			Static302.anInt4867 = 640;
		}
		@Pc(473) String local473 = this.getParameter("hc");
		if (local473 != null && local473.equals("1")) {
			Static416.hc = true;
		}
		instance = this;
		this.method1640(667, Static302.anInt4867, modewhat.method3469() + 32, Static392.game.name, 37, Static479.anInt7222);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
	@Override
	protected void drawWrapper() {
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() != 2) {
			this.draw();
			return;
		}

		try {
			this.draw();
		} catch (@Pc(21) ThreadDeath ex) {
			throw ex;
		} catch (@Pc(24) Throwable ex) {
			TracingException.report(ex, ex.getMessage() + " (Recovered) " + this.method1648());
			Static171.aBoolean245 = true;
			Static32.method880(0, false);
		}
	}
}
