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

import jagex3.jagmisc.jagmisc;
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
	public static Js5NetQueue js5NetQueue;

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
	public static Js5 js5Archive5;
	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public static int js5ConnectDelay = 0;
	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ul;")
	public static ModeGame game = null;
	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!sb;")
	public static Js5 js5Archive2;
	@OriginalMember(owner = "client!ws", name = "I", descriptor = "Lclient!sb;")
	public static Js5 js5Archive8;
	@OriginalMember(owner = "client!kr", name = "g", descriptor = "Lclient!sb;")
	public static Js5 js5Archive0;
	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!sb;")
	public static Js5 js5Archive1;
	@OriginalMember(owner = "client!rha", name = "c", descriptor = "Lclient!sb;")
	public static Js5 js5Archive3;
	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!sb;")
	public static Js5 js5Archive4;
	@OriginalMember(owner = "client!mj", name = "u", descriptor = "Lclient!sb;")
	public static Js5 js5Archive6;
	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Lclient!sb;")
	public static Js5 js5Archive7;
	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Lclient!sb;")
	public static Js5 js5Archive9;
	@OriginalMember(owner = "client!oka", name = "l", descriptor = "Lclient!sb;")
	public static Js5 js5Archive10;
	@OriginalMember(owner = "client!kn", name = "g", descriptor = "Lclient!sb;")
	public static Js5 js5Archive11;
	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!sb;")
	public static Js5 js5Archive12;
	@OriginalMember(owner = "client!eka", name = "l", descriptor = "Lclient!sb;")
	public static Js5 js5Archive14;
	@OriginalMember(owner = "client!oia", name = "r", descriptor = "Lclient!sb;")
	public static Js5 js5Archive16;
	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!sb;")
	public static Js5 js5Archive15;
	@OriginalMember(owner = "client!ala", name = "b", descriptor = "Lclient!sb;")
	public static Js5 js5Archive17;
	@OriginalMember(owner = "client!kj", name = "a", descriptor = "Lclient!sb;")
	public static Js5 js5Archive18;
	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!sb;")
	public static Js5 js5Archive19;
	@OriginalMember(owner = "client!vca", name = "o", descriptor = "Lclient!sb;")
	public static Js5 js5Archive20;
	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!sb;")
	public static Js5 js5Archive21;
	@OriginalMember(owner = "client!he", name = "k", descriptor = "Lclient!sb;")
	public static Js5 js5Archive22;
	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!sb;")
	public static Js5 js5Archive23;
	@OriginalMember(owner = "client!bu", name = "O", descriptor = "Lclient!sb;")
	public static Js5 js5Archive24;
	@OriginalMember(owner = "client!hk", name = "n", descriptor = "Lclient!sb;")
	public static Js5 js5Archive25;
	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!sb;")
	public static Js5 js5Archive26;
	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!sb;")
	public static Js5 js5Archive27;
	@OriginalMember(owner = "client!kka", name = "c", descriptor = "Lclient!sb;")
	public static Js5 js5Archive28;
	@OriginalMember(owner = "client!ega", name = "p", descriptor = "Lclient!sb;")
	public static Js5 js5Archive29;
	@OriginalMember(owner = "client!pt", name = "s", descriptor = "Lclient!sb;")
	public static Js5 js5Archive35;
	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!sb;")
	public static Js5 js5Archive30;
	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!sb;")
	public static Js5 js5Archive31;
	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Lclient!sb;")
	public static Js5 js5Archive36;
	@OriginalMember(owner = "client!mba", name = "F", descriptor = "Lclient!bo;")
	public static ParamTypeList paramTypeList;
	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!qp;")
	public static BasTypeList basTypeList;
	@OriginalMember(owner = "client!bs", name = "i", descriptor = "Lclient!d;")
	public static TextureProvider textureProvider;
	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!nv;")
	public static CursorTypeList cursorTypeList;
	@OriginalMember(owner = "client!tk", name = "d", descriptor = "Lclient!vka;")
	public static EnumTypeList enumTypeList;
	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Lclient!ef;")
	public static FloTypeList floTypeList;
	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!dh;")
	public static FluTypeList fluTypeList;
	@OriginalMember(owner = "client!rla", name = "e", descriptor = "Lclient!ld;")
	public static HitmarkTypeList hitmarkTypeList;
	@OriginalMember(owner = "client!cd", name = "r", descriptor = "Lclient!kr;")
	public static IdkTypeList idkTypeList;
	@OriginalMember(owner = "client!cd", name = "c", descriptor = "Lclient!gt;")
	public static QuickChatCatTypeList quickChatCatTypeList;
	@OriginalMember(owner = "client!ps", name = "d", descriptor = "Lclient!sfa;")
	public static InvTypeList invTypeList;
	@OriginalMember(owner = "client!bka", name = "k", descriptor = "Lclient!vga;")
	public static LightTypeList lightTypeList;
	@OriginalMember(owner = "client!ld", name = "b", descriptor = "Lclient!gea;")
	public static LocTypeList locTypeList;
	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!ml;")
	public static MelTypeList melTypeList;
	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!u;")
	public static MsiTypeList msiTypeList;
	@OriginalMember(owner = "client!vr", name = "b", descriptor = "Lclient!ql;")
	public static NpcTypeList npcTypeList;
	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!es;")
	public static ObjTypeList objTypeList;
	@OriginalMember(owner = "client!ija", name = "m", descriptor = "Lclient!bka;")
	public static QuestTypeList questTypeList;
	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!bp;")
	public static SeqTypeList seqTypeList;
	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!qk;")
	public static SkyBoxTypeList skyboxTypeList;
	@OriginalMember(owner = "client!dba", name = "x", descriptor = "Lclient!dg;")
	public static SkyBoxSphereTypeList skyboxsphereTypeList;
	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!fh;")
	public static SpotAnimTypeList spotanimTypeList;
	@OriginalMember(owner = "client!uka", name = "x", descriptor = "Lclient!kq;")
	public static StructTypeList structTypeList;
	@OriginalMember(owner = "client!wo", name = "A", descriptor = "Lclient!ida;")
	public static VarcstrTypeList varcstrTypeList;
	@OriginalMember(owner = "client!vs", name = "t", descriptor = "Lclient!kka;")
	public static VarclientTypeList varclientTypeList;
	@OriginalMember(owner = "client!qla", name = "a", descriptor = "Lclient!hf;")
	public static VarbitTypeList varbitTypeList;
	@OriginalMember(owner = "client!bda", name = "E", descriptor = "Lclient!nh;")
	public static VarpTypeList varpTypeList;
	@OriginalMember(owner = "client!tt", name = "a", descriptor = "Lclient!sn;")
	public static VarclanTypeList varclanTypeList;
	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Lclient!al;")
	public static VarclansettingTypeList varclansettingTypeList;

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
				game = Static673.runescapeGame;
			} else if (args[5].equals("game1")) {
				game = Static723.aClass379_9;
			} else if (args[5].equals("game2")) {
				game = Static465.aClass379_5;
			} else if (args[5].equals("game3")) {
				game = Static655.aClass379_7;
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
			Static338.colourid = game.id;
			Static150.settings = "";
			Static265.sskey = null;
			Static584.country = 0;
			Static416.userFlow = 0L;
			@Pc(241) client c = new client();
			instance = c;
			c.method1635(37, 667, modewhat.method3469() + 32, 768, game.name, 1024);
			GameShell.frame.setLocation(40, 40);
		} catch (@Pc(265) Exception local265) {
			TracingException.report(local265, null);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void clean() {
		floTypeList.method2355();
		fluTypeList.method2073();
		idkTypeList.method5052();
		locTypeList.method3064();
		npcTypeList.method7092();
		objTypeList.method2479();
		seqTypeList.method1163();
		spotanimTypeList.method2698();
		varbitTypeList.method3428();
		varpTypeList.method5792();
		varclanTypeList.method7791();
		varclansettingTypeList.method267();
		basTypeList.method7122();
		melTypeList.method5588();
		msiTypeList.method8374();
		paramTypeList.method1158();
		questTypeList.method1096();
		skyboxTypeList.method7075();
		skyboxsphereTypeList.method2055();
		lightTypeList.method8820();
		cursorTypeList.method5977();
		structTypeList.method5044();
		hitmarkTypeList.method5191();
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
			@Pc(77) long local77 = Static588.currentTimeMillis();
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
				Static228.aClass264_1 = new Js5MasterIndex(js5NetQueue, Static66.aClass174_1, Static442.aBigInteger5, Static670.aBigInteger6);
			}
			if (!Static228.aClass264_1.method5807()) {
				return 0;
			}
			Static595.method7814(null, true, 0);
			Static297.aBoolean368 = !Static589.method7728();
			Static177.aClass332_35 = createJs5(false, Static297.aBoolean368 ? 34 : 32, 1);
			Static516.aClass332_97 = createJs5(false, 33, 1);
			Static697.aClass332_123 = createJs5(false, 13, 1);
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
			Static333.aClass281_1 = new Class281(game, lang, Static516.aClass332_97);
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
			js5Archive8 = createJs5(false, 8, 1);
			js5Archive0 = createJs5(false, 0, 1);
			js5Archive1 = createJs5(false, 1, 1);
			js5Archive2 = createJs5(false, 2, 1);
			js5Archive3 = createJs5(false, 3, 1);
			js5Archive4 = createJs5(false, 4, 1);
			js5Archive5 = createJs5(true, 5, 1);
			js5Archive6 = createJs5(true, 6, 1);
			js5Archive7 = createJs5(false, 7, 1);
			js5Archive9 = createJs5(false, 9, 1);
			js5Archive10 = createJs5(false, 10, 1);
			js5Archive11 = createJs5(false, 11, 1);
			js5Archive12 = createJs5(false, 12, 1);
			js5Archive14 = createJs5(false, 14, 1);
			js5Archive15 = createJs5(false, 15, 1);
			js5Archive16 = createJs5(false, 16, 1);
			js5Archive17 = createJs5(false, 17, 1);
			js5Archive18 = createJs5(false, 18, 1);
			js5Archive19 = createJs5(false, 19, 1);
			js5Archive20 = createJs5(false, 20, 1);
			js5Archive21 = createJs5(false, 21, 1);
			js5Archive22 = createJs5(false, 22, 1);
			js5Archive23 = createJs5(true, 23, 1);
			js5Archive24 = createJs5(false, 24, 1);
			js5Archive25 = createJs5(false, 25, 1);
			js5Archive26 = createJs5(true, 26, 1);
			js5Archive27 = createJs5(false, 27, 1);
			js5Archive28 = createJs5(true, 28, 1);
			js5Archive29 = createJs5(false, 29, 1);
			js5Archive35 = createJs5(true, 35, 1);
			js5Archive30 = createJs5(true, 30, 1);
			js5Archive31 = createJs5(true, 31, 1);
			js5Archive36 = createJs5(true, 36, 2);
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
			Static204.method3079(js5Archive8);
			Static82.method1592(Static697.aClass332_123, js5Archive8, Static52.method1159());
		}
		if (Static473.aClass140_22 == Static198.aClass140_10) {
			@Pc(746) byte[] local746 = js5Archive28.method7596(4);
			if (local746 == null) {
				return 0;
			}
			Static9.method124(local746);
			Static674.method8813();
			Static81.method1586(2);
		}
		if (Static198.aClass140_11 == Static473.aClass140_22) {
			Static529.method7103(js5Archive30, sign);
		}
		if (Static198.aClass140_12 == Static473.aClass140_22) {
			local12 = Static460.method6273();
			if (local12 < 100) {
				return local12;
			}
			Static502.method6728(js5Archive28.method7596(1));
			Static65.aClass3_1 = new Class3(js5Archive28);
			Static76.aShortArrayArray2 = Static65.aClass3_1.aShortArrayArray1;
			Static339.aShortArrayArrayArray2 = Static65.aClass3_1.aShortArrayArrayArray1;
			Static125.aClass390_1 = new Class390(js5Archive28);
		}
		if (Static198.aClass140_13 == Static473.aClass140_22) {
			if (Static65.aClass3_1.anInt81 != -1 && !js5Archive7.method7593(0, Static65.aClass3_1.anInt81)) {
				return 99;
			}

			textureProvider = new Js5TextureProvider(js5Archive26, js5Archive9, js5Archive8);

			paramTypeList = new ParamTypeList(game, lang, js5Archive2);
			basTypeList = new BasTypeList(game, lang, js5Archive2, Static125.aClass390_1);
			cursorTypeList = new CursorTypeList(game, lang, js5Archive2, js5Archive8);
			enumTypeList = new EnumTypeList(game, lang, js5Archive17);
			floTypeList = new FloTypeList(game, lang, js5Archive2);
			fluTypeList = new FluTypeList(game, lang, js5Archive2);
			hitmarkTypeList = new HitmarkTypeList(game, lang, js5Archive2, js5Archive8);
			idkTypeList = new IdkTypeList(game, lang, js5Archive2, js5Archive7);
			invTypeList = new InvTypeList(game, lang, js5Archive2);
			lightTypeList = new LightTypeList(game, lang, js5Archive2);
			locTypeList = new LocTypeList(game, lang, true, js5Archive16, js5Archive7);
			melTypeList = new MelTypeList(game, lang, js5Archive2, js5Archive8);
			msiTypeList = new MsiTypeList(game, lang, js5Archive2, js5Archive8);
			npcTypeList = new NpcTypeList(game, lang, true, js5Archive18, js5Archive7);
			objTypeList = new ObjTypeList(game, lang, true, paramTypeList, js5Archive19, js5Archive7);
			questTypeList = new QuestTypeList(game, lang, js5Archive2);
			seqTypeList = new SeqTypeList(game, lang, js5Archive20, js5Archive0, js5Archive1);
			skyboxTypeList = new SkyBoxTypeList(game, lang, js5Archive2);
			skyboxsphereTypeList = new SkyBoxSphereTypeList(game, lang, js5Archive2);
			spotanimTypeList = new SpotAnimTypeList(game, lang, js5Archive21, js5Archive7);
			structTypeList = new StructTypeList(game, lang, js5Archive2);
			varcstrTypeList = new VarcstrTypeList(game, lang, js5Archive2);
			varclientTypeList = new VarclientTypeList(game, lang, js5Archive2);
			varbitTypeList = new VarbitTypeList(game, lang, js5Archive22);
			varpTypeList = new VarpTypeList(game, lang, js5Archive2);
			varclanTypeList = new VarclanTypeList(game, lang, js5Archive2);
			varclansettingTypeList = new VarclansettingTypeList(game, lang, js5Archive2);

			Static444.method5994(js5Archive3, Static697.aClass332_123, js5Archive8, js5Archive7);
			Static110.method2081(js5Archive29);
			quickChatCatTypeList = new QuickChatCatTypeList(lang, js5Archive24, js5Archive25);
			Static288.quickChatPhraseTypeList = new QuickChatPhraseTypeList(lang, js5Archive24, js5Archive25, new Js5QuickChatCommandDecoder());
			Static412.method5700();
			locTypeList.method3061(Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() == 0);
			Static34.aClass306_1 = new Class306();
			Static296.method4369();
			Static44.method1074(seqTypeList);
			Static187.method2844(js5Archive27);
			Static405.method5599(textureProvider, js5Archive7);
			@Pc(1119) HuffmanCodec codec = new HuffmanCodec(js5Archive10.fetchFile("huffman", ""));
			Static342.method4469(codec);
			try {
				jagmisc.init();
			} catch (@Pc(1126) Throwable local1126) {
			}
			timer = Static570.create();
			Static292.instance = new Node_Sub43(true, sign);
		}
		if (Static198.aClass140_15 == Static473.aClass140_22) {
			local12 = Static188.method2860(js5Archive8) + Static372.method5298(true);
			local74 = Static688.method8981() + Static714.method9346();
			if (local12 < local74) {
				return local12 * 100 / local74;
			}
		}
		if (Static198.aClass140_16 == Static473.aClass140_22) {
			Static30.method5072(js5Archive23, floTypeList, fluTypeList, locTypeList, melTypeList, msiTypeList, Static34.aClass306_1);
		}
		if (Static198.aClass140_17 == Static473.aClass140_22) {
			Static37.aStringArray4 = new String[varcstrTypeList.anInt4278];
			Static511.anIntArray614 = new int[varclientTypeList.anInt5492];
			Static118.aBooleanArray4 = new boolean[varclientTypeList.anInt5492];
			for (local12 = 0; local12 < varclientTypeList.anInt5492; local12++) {
				if (varclientTypeList.method4954(local12).anInt7195 == 0) {
					Static118.aBooleanArray4[local12] = true;
					Static319.anInt5095++;
				}
				Static511.anIntArray614[local12] = -1;
			}
			Static218.method3189();
			js5Archive5.method7582(false);
			js5Archive6.method7582(true);
			js5Archive8.method7582(true);
			Static697.aClass332_123.method7582(true);
			js5Archive10.method7582(true);
			js5Archive2.discardUnpacked = 2;
			clean = true;
			js5Archive17.discardUnpacked = 2;
			js5Archive16.discardUnpacked = 2;
			js5Archive18.discardUnpacked = 2;
			js5Archive19.discardUnpacked = 2;
			js5Archive20.discardUnpacked = 2;
			js5Archive21.discardUnpacked = 2;
		}
		if (Static473.aClass140_22 == Static198.aClass140_18) {
			if (!Static571.method7573(Static65.aClass3_1.anInt88)) {
				return 0;
			}
			local184 = true;
			for (local74 = 0; local74 < Static453.aClass158ArrayArray2[Static65.aClass3_1.anInt88].length; local74++) {
				@Pc(1315) Class158 local1315 = Static453.aClass158ArrayArray2[Static65.aClass3_1.anInt88][local74];
				if (local1315.anInt3831 == 5 && local1315.anInt3821 != -1 && !js5Archive8.method7593(0, local1315.anInt3821)) {
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
			} else if (Static400.aClass2_Sub34_28.aClass57_Sub29_2.aBoolean675 && Static292.instance.anInt7633 < 512 && Static292.instance.anInt7633 != 0) {
				Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
			}
			Static666.method8700(1);
			if (Static3.aBoolean4) {
				Static32.method880(0, false);
			} else {
				Static32.method880(Static400.aClass2_Sub34_28.aClass57_Sub29_2.method7922(), false);
			}
			Static409.setWindowMode(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
			Static570.method7556(Static163.aClass19_17);
			Static469.method6365(Static163.aClass19_17);
			Static239.method3472(js5Archive8, Static163.aClass19_17);
			Static331.method4932(Static679.aClass23Array14);
		}
		return Static694.method9037();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZIII)Lclient!sb;")
	public static Js5 createJs5(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Cache local5 = null;
		if (Static172.aClass245_4 != null) {
			local5 = new Cache(arg1, Static172.aClass245_4, Static208.aClass245Array1[arg1], 1000000);
		}
		Static226.aClass47_Sub1Array8[arg1] = Static228.aClass264_1.method5808(local5, arg1, Static276.aClass9_1);
		Static226.aClass47_Sub1Array8[arg1].prefetchAll();
		return new Js5(Static226.aClass47_Sub1Array8[arg1], arg0, arg2);
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
			js5ConnectDelay = (js5NetQueue.errors * 50 - 50) * 5;
			if (js5ConnectDelay > 3000) {
				js5ConnectDelay = 3000;
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
		if (js5ConnectDelay > 0) {
			js5ConnectDelay--;
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
				@Pc(251) Buffer local251 = new Buffer(5);
				local251.p1(LoginProt.OPCODE_15.opcode);
				local251.p4(667);
				js5Socket.method5836(0, 5, local251.data);
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
				@Pc(367) Buffer local367 = new Buffer(local359.length * 4);
				js5Socket.read(local367.data.length, 0, local367.data);
				for (@Pc(378) int i = 0; i < local359.length; i++) {
					local359[i].method7475(local367.g4());
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
			@Pc(453) Node_Sub42 local453;
			@Pc(458) Class158 local458;
			@Pc(470) Class158 local470;
			do {
				local453 = (Node_Sub42) Static618.aClass341_68.removeHead();
				if (local453 == null) {
					while (true) {
						do {
							local453 = (Node_Sub42) Static59.aClass341_33.removeHead();
							if (local453 == null) {
								while (true) {
									do {
										local453 = (Node_Sub42) Static521.aClass341_44.removeHead();
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
														Static44.method1072(local672.aString72 + Static32.aClass32_19.getLocalization(lang), "", 0, "", "", 5);
													}
													if (local672.aShort74 == 0) {
														Static44.method1072(local672.aString72 + Static32.aClass32_20.getLocalization(lang), "", 0, "", "", 5);
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
														@Pc(823) Node_Sub19 local823 = Static293.method4342(Static415.aClass347_75, Static405.aClass153_1.aClass186_1);
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
				Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.getLocalization(lang) + "<br>(" + local110 + "%)", true, Static694.aClass383_13, Static437.aClass14_9);
			} else if (Static213.anInt3482 == 2) {
				if (Static13.anInt150 > Static440.anInt6703) {
					Static440.anInt6703 = Static13.anInt150;
				}
				local110 = (Static440.anInt6703 - Static13.anInt150) * 50 / Static440.anInt6703 + 50;
				Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.getLocalization(lang) + "<br>(" + local110 + "%)", true, Static694.aClass383_13, Static437.aClass14_9);
			} else {
				Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.getLocalization(lang), true, Static694.aClass383_13, Static437.aClass14_9);
			}
		} else if (Static283.anInt4588 == 11) {
			Static686.method7937(local20);
		} else if (Static283.anInt4588 == 14) {
			Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_14.getLocalization(lang) + "<br>" + Static32.aClass32_15.getLocalization(lang), false, Static694.aClass383_13, Static437.aClass14_9);
		} else if (Static283.anInt4588 == 15) {
			Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_31.getLocalization(lang), false, Static694.aClass383_13, Static437.aClass14_9);
		}
		if (Static18.anInt251 == 3) {
			for (local110 = 0; local110 < Static122.rectangles; local110++) {
				@Pc(478) Rectangle local478 = TextureOpSquareWaveform.aRectangleArray1[local110];
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
					Static663.aRectangleArray2[local110++] = TextureOpSquareWaveform.aRectangleArray1[local114];
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
		for (@Pc(214) Node_Sub9 local214 = Static189.aClass120_1.method8858(); local214 != null; local214 = Static189.aClass120_1.method8858()) {
			@Pc(222) int local222 = local214.method5335();
			if (local222 == -1) {
				Static677.aClass341_76.insertBefore(local214);
			} else if (local222 == 6) {
				Static611.anInt9367 += local214.method5339();
			} else if (Static278.method4070(local222)) {
				Static226.aClass341_58.insertBefore(local214);
				if (Static226.aClass341_58.method7708() > 10) {
					Static226.aClass341_58.removeHead();
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
		Static226.aClass341_58.removeHead();
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
		Static66.aClass174_1 = new Js5CacheQueue(GameShell.sign);
		js5NetQueue = new Js5NetQueue();
		Buffer.method7248(new int[] { 20, 260 }, new int[] { 1000, 100 });
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
		if (game == Static673.runescapeGame) {
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
				Static276.aClass9_1 = new Cache(255, Static172.aClass245_4, Static5.aClass245_1, 500000);
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
		Static484.aString85 = Static32.aClass32_12.getLocalization(lang);
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
				game = Static673.runescapeGame;
			} else if (local190.equals("1")) {
				game = Static723.aClass379_9;
			} else if (local190.equals("2")) {
				game = Static465.aClass379_5;
			} else if (local190.equals("3")) {
				game = Static655.aClass379_7;
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
		if (Static673.runescapeGame == game) {
			Static302.anInt4867 = 765;
			Static479.anInt7222 = 503;
		} else if (game == Static723.aClass379_9) {
			Static479.anInt7222 = 480;
			Static302.anInt4867 = 640;
		}
		@Pc(473) String local473 = this.getParameter("hc");
		if (local473 != null && local473.equals("1")) {
			Static416.hc = true;
		}
		instance = this;
		this.method1640(667, Static302.anInt4867, modewhat.method3469() + 32, game.name, 37, Static479.anInt7222);
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
