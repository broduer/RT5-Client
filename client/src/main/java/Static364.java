import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "Lclient!rt;")
	public static WorldMapFont aClass329_4;

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)Lclient!fu;")
	public static MapElement method5255() {
		if (Static30.aClass341_31 == null || Static444.aClass193_1 == null) {
			return null;
		}
		for (@Pc(17) MapElement local17 = (MapElement) Static444.aClass193_1.method4349(); local17 != null; local17 = (MapElement) Static444.aClass193_1.method4349()) {
			@Pc(30) MelType local30 = Static30.aClass248_3.method5591(local17.anInt3140);
			if (local30 != null && local30.aBoolean217 && local30.method2425(Static30.anInterface23_3)) {
				return local17;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IFFILclient!tk;[BFIBFIIIF)V")
	public static void method5258(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class59 arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) float arg13) {
		@Pc(7) int local7 = arg0 * arg10;
		@Pc(17) float[] local17 = new float[local7];
		@Pc(22) int local22;
		@Pc(48) int local48;
		for (@Pc(19) int local19 = 0; local19 < arg11; local19++) {
			local22 = arg12;
			arg4.method1509(arg1 / (float) arg0, arg13 * 127.0F, arg10, local17, 0, arg9 / (float) arg7, arg3, arg2 / (float) arg10, arg7, arg0);
			for (local48 = 0; local48 < local7; local48++) {
				arg5[local22] = (byte) (int) ((float) arg5[local22] + local17[local48]);
				local22++;
			}
			arg2 *= 2.0F;
			arg1 *= 2.0F;
			arg9 *= 2.0F;
			arg13 *= arg6;
		}
		local22 = arg12;
		for (local48 = 0; local48 < local7; local48++) {
			arg5[local22] = (byte) (arg5[local22] + 127);
			local22++;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V")
	public static void method5260() {
		if (Static135.anInt8246 == 0 || Static135.anInt8246 == 10) {
			return;
		}
		try {
			@Pc(25) short local25;
			if (Static76.anInt1608 == 0) {
				local25 = 250;
			} else {
				local25 = 2000;
			}
			if (Static299.anInt4841 != 2 || Static135.anInt8246 != 20 && Static169.anInt2864 != 42) {
				Static330.anInt5453++;
			}
			if (Static311.aBoolean384 && Static135.anInt8246 >= 6) {
				local25 = 6000;
			}
			if (local25 < Static330.anInt5453) {
				Static524.aClass153_3.method3274();
				if (Static76.anInt1608 >= 3) {
					Static135.anInt8246 = 0;
					Static342.method4471(-5);
					return;
				}
				if (Static299.anInt4841 == 2) {
					Static344.aClass231_1.method5267();
				} else {
					client.lobby.method5267();
				}
				Static135.anInt8246 = 1;
				Static330.anInt5453 = 0;
				Static76.anInt1608++;
			}
			if (Static135.anInt8246 == 1) {
				if (Static299.anInt4841 == 2) {
					Static524.aClass153_3.aPrivilegedRequest_1 = Static344.aClass231_1.method5270(GameShell.sign);
				} else {
					Static524.aClass153_3.aPrivilegedRequest_1 = client.lobby.method5270(GameShell.sign);
				}
				Static135.anInt8246 = 2;
			}
			@Pc(186) Node_Sub19 local186;
			@Pc(203) int local203;
			@Pc(250) int local250;
			if (Static135.anInt8246 == 2) {
				if (Static524.aClass153_3.aPrivilegedRequest_1.status == 2) {
					throw new IOException();
				}
				if (Static524.aClass153_3.aPrivilegedRequest_1.status != 1) {
					return;
				}
				Static524.aClass153_3.aClass350_1 = Static99.method1975((Socket) Static524.aClass153_3.aPrivilegedRequest_1.result);
				Static524.aClass153_3.aPrivilegedRequest_1 = null;
				Static524.aClass153_3.method3272();
				local186 = Static273.method3962();
				if (Static311.aBoolean384) {
					local186.aClass2_Sub21_Sub2_1.p1(LoginProt.OPCODE_29.opcode);
					local186.aClass2_Sub21_Sub2_1.p2(0);
					local203 = local186.aClass2_Sub21_Sub2_1.pos;
					local186.aClass2_Sub21_Sub2_1.p4(667);
					if (Static299.anInt4841 == 2) {
						local186.aClass2_Sub21_Sub2_1.p1(Static283.anInt4588 == 14 ? 1 : 0);
					}
					@Pc(229) Buffer local229 = Static570.method7559();
					local229.p1(Static129.anInt2418);
					local229.p2((int) (Math.random() * 9.9999999E7D));
					local229.p1(client.lang);
					local229.p4(Static323.affid);
					for (local250 = 0; local250 < 6; local250++) {
						local229.p4((int) (Math.random() * 9.9999999E7D));
					}
					local229.p8(Static571.aLong269);
					local229.p1(client.game.id);
					local229.p1((int) (Math.random() * 9.9999999E7D));
					local229.rsaenc(Static374.aBigInteger2, Static262.aBigInteger1);
					local186.aClass2_Sub21_Sub2_1.pdata(local229.pos, local229.data, 0);
					local186.aClass2_Sub21_Sub2_1.psize2(local186.aClass2_Sub21_Sub2_1.pos - local203);
				} else {
					local186.aClass2_Sub21_Sub2_1.p1(LoginProt.OPCODE_14.opcode);
				}
				Static524.aClass153_3.method3275(local186);
				Static524.aClass153_3.method3273();
				Static135.anInt8246 = 3;
			}
			@Pc(360) int local360;
			if (Static135.anInt8246 == 3) {
				if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 1, 0);
				local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF;
				if (local360 != 0) {
					Static135.anInt8246 = 0;
					Static342.method4471(local360);
					Static524.aClass153_3.method3274();
					Static564.method7472();
					return;
				}
				if (Static311.aBoolean384) {
					Static135.anInt8246 = 4;
				} else {
					Static135.anInt8246 = 8;
				}
			}
			if (Static135.anInt8246 == 4) {
				if (!Static524.aClass153_3.aClass350_1.method7939(2)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 2, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = Static524.aClass153_3.aClass2_Sub21_Sub2_2.g2();
				Static135.anInt8246 = 5;
			}
			if (Static135.anInt8246 == 5) {
				if (!Static524.aClass153_3.aClass350_1.method7939(Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7362(Static219.anIntArray287);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
				@Pc(465) String local465 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.gjstr2();
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
				@Pc(473) String local473 = "opensn";
				if (!Static98.js || Static36.method980(GameShell.sign, local465, local473, 1).status == 2) {
					Static259.method3693(local465, local473, GameShell.sign, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1, true);
				}
				Static135.anInt8246 = 6;
			}
			if (Static135.anInt8246 == 6) {
				if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 1, 0);
				if ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF) == 1) {
					Static135.anInt8246 = 7;
				}
			}
			if (Static135.anInt8246 == 7) {
				if (!Static524.aClass153_3.aClass350_1.method7939(16)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 16, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 16;
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7362(Static219.anIntArray287);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
				Static449.aString75 = Static319.aString51 = Static287.method4154(Static524.aClass153_3.aClass2_Sub21_Sub2_2.g8());
				Static430.aLong209 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.g8();
				Static135.anInt8246 = 8;
			}
			@Pc(618) Packet local618;
			if (Static135.anInt8246 == 8) {
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
				Static524.aClass153_3.method3272();
				local186 = Static273.method3962();
				local618 = local186.aClass2_Sub21_Sub2_1;
				@Pc(646) int local646;
				@Pc(672) Buffer local672;
				@Pc(627) LoginProt local627;
				if (Static299.anInt4841 == 2) {
					if (Static311.aBoolean384) {
						local627 = LoginProt.OPCODE_30;
					} else {
						local627 = LoginProt.OPCODE_16;
					}
					local618.p1(local627.opcode);
					local618.p2(0);
					local250 = local618.pos;
					local646 = local618.pos;
					if (!Static311.aBoolean384) {
						local618.p4(667);
						local618.p1(Static283.anInt4588 == 14 ? 1 : 0);
						local646 = local618.pos;
						local672 = Static659.method8615();
						local618.pdata(local672.pos, local672.data, 0);
						local646 = local618.pos;
						local618.pjstr(Static449.aString75);
					}
					local618.p1(Static470.anInt7134);
					local618.p1(Static36.method978());
					local618.p2(GameShell.canvasWidth);
					local618.p2(GameShell.canvasHeight);
					local618.p1(Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4380());
					Static176.method6697(local618);
					local618.pjstr(Static150.settings);
					local618.p4(Static323.affid);
					local672 = Static400.aClass2_Sub34_28.encode();
					local618.p1(local672.pos);
					local618.pdata(local672.pos, local672.data, 0);
					Static503.aBoolean578 = true;
					@Pc(748) Buffer local748 = new Buffer(Static292.instance.method6752());
					Static292.instance.method6749(local748);
					local618.pdata(local748.data.length, local748.data, 0);
					local618.p4(Static334.anInt5475);
					local618.p8(Static416.userFlow);
					local618.p1(Static389.additionalInfo == null ? 0 : 1);
					if (Static389.additionalInfo != null) {
						local618.pjstr(Static389.additionalInfo);
					}
					local618.p1(Static183.method2796("jagtheora") ? 1 : 0);
					local618.p1(Static98.js ? 1 : 0);
					local618.p1(Static416.hc ? 1 : 0);
					Static169.method2647(local618);
					local618.method7373(Static219.anIntArray287, local646, local618.pos);
					local618.psize2(local618.pos - local250);
				} else {
					if (Static311.aBoolean384) {
						local627 = LoginProt.OPCODE_30;
					} else {
						local627 = LoginProt.OPCODE_19;
					}
					local618.p1(local627.opcode);
					local618.p2(0);
					local250 = local618.pos;
					local646 = local618.pos;
					if (!Static311.aBoolean384) {
						local618.p4(667);
						local672 = Static659.method8615();
						local618.pdata(local672.pos, local672.data, 0);
						local646 = local618.pos;
						local618.pjstr(Static449.aString75);
					}
					local618.p1(client.game.id);
					local618.p1(client.lang);
					Static176.method6697(local618);
					local618.pjstr(Static150.settings);
					local618.p4(Static323.affid);
					Static169.method2647(local618);
					local618.method7373(Static219.anIntArray287, local646, local618.pos);
					local618.psize2(local618.pos - local250);
				}
				Static524.aClass153_3.method3275(local186);
				Static524.aClass153_3.method3273();
				Static524.aClass153_3.aClass186_1 = new Class186(Static219.anIntArray287);
				for (@Pc(938) int local938 = 0; local938 < 4; local938++) {
					Static219.anIntArray287[local938] += 50;
				}
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7422(Static219.anIntArray287);
				Static219.anIntArray287 = null;
				Static135.anInt8246 = 9;
			}
			if (Static135.anInt8246 == 9) {
				if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 1, 0);
				local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF;
				if (local360 == 21) {
					Static135.anInt8246 = 12;
				} else if (local360 == 29 || local360 == 45) {
					Static135.anInt8246 = 18;
					Static79.anInt1641 = local360;
				} else if (local360 == 1) {
					Static135.anInt8246 = 10;
					Static342.method4471(local360);
					return;
				} else if (local360 == 2) {
					Static135.anInt8246 = 13;
				} else if (local360 == 15) {
					Static135.anInt8246 = 19;
					Static524.aClass153_3.length = -2;
				} else if (local360 == 23 && Static76.anInt1608 < 3) {
					Static330.anInt5453 = 0;
					Static135.anInt8246 = 1;
					Static76.anInt1608++;
					Static524.aClass153_3.aClass350_1.method7933();
					Static524.aClass153_3.aClass350_1 = null;
					return;
				} else if (local360 == 42) {
					Static135.anInt8246 = 20;
					Static342.method4471(local360);
					return;
				} else if (!Static561.aBoolean641 || Static311.aBoolean384 || Static129.anInt2418 == -1 || local360 != 35) {
					Static135.anInt8246 = 0;
					Static342.method4471(local360);
					Static524.aClass153_3.aClass350_1.method7933();
					Static524.aClass153_3.aClass350_1 = null;
					Static564.method7472();
					return;
				} else {
					Static311.aBoolean384 = true;
					Static135.anInt8246 = 1;
					Static330.anInt5453 = 0;
					Static524.aClass153_3.aClass350_1.method7933();
					Static524.aClass153_3.aClass350_1 = null;
					return;
				}
			}
			if (Static135.anInt8246 == 11) {
				Static524.aClass153_3.method3272();
				local186 = Static273.method3962();
				local618 = local186.aClass2_Sub21_Sub2_1;
				local618.method7429(Static524.aClass153_3.aClass186_1);
				local618.method7425(LoginProt.OPCODE_26.opcode);
				Static524.aClass153_3.method3275(local186);
				Static524.aClass153_3.method3273();
				Static135.anInt8246 = 9;
			} else if (Static135.anInt8246 == 12) {
				if (Static524.aClass153_3.aClass350_1.method7939(1)) {
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 1, 0);
					local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF;
					Static135.anInt8246 = 0;
					Static118.anInt2301 = local360 * 50;
					Static342.method4471(21);
					Static524.aClass153_3.aClass350_1.method7933();
					Static524.aClass153_3.aClass350_1 = null;
					Static564.method7472();
				}
			} else if (Static135.anInt8246 == 20) {
				if (Static524.aClass153_3.aClass350_1.method7939(2)) {
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 2, 0);
					Static660.anInt9863 = (Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[1] & 0xFF) + ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF) << 8);
					Static135.anInt8246 = 9;
				}
			} else if (Static135.anInt8246 == 18) {
				if (Static79.anInt1641 == 29) {
					if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
						return;
					}
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 1, 0);
					Static329.anInt1756 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF;
				} else if (Static79.anInt1641 == 45) {
					if (!Static524.aClass153_3.aClass350_1.method7939(3)) {
						return;
					}
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 3, 0);
					Static356.anInt5800 = (Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[2] & 0xFF) + ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[1] & 0xFF) << 8);
					Static329.anInt1756 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF;
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static79.anInt1641);
				}
				Static135.anInt8246 = 0;
				Static342.method4471(Static79.anInt1641);
				Static524.aClass153_3.aClass350_1.method7933();
				Static524.aClass153_3.aClass350_1 = null;
				Static564.method7472();
			} else if (Static135.anInt8246 != 13) {
				@Pc(1435) Packet local1435;
				if (Static135.anInt8246 == 14) {
					local1435 = Static524.aClass153_3.aClass2_Sub21_Sub2_2;
					if (Static299.anInt4841 == 2) {
						if (!Static524.aClass153_3.aClass350_1.method7939(Static94.anInt1970)) {
							return;
						}
						Static524.aClass153_3.aClass350_1.method7936(local1435.data, Static94.anInt1970, 0);
						local1435.pos = 0;
						Static608.anInt9316 = local1435.g1();
						Static38.anInt932 = local1435.g1();
						Static389.aBoolean459 = local1435.g1() == 1;
						Static34.aBoolean62 = local1435.g1() == 1;
						Static298.aBoolean369 = local1435.g1() == 1;
						Static617.aBoolean725 = local1435.g1() == 1;
						Static312.anInt5017 = local1435.g2();
						Static126.aBoolean200 = local1435.g1() == 1;
						Static106.anInt2162 = local1435.g3s();
						Static174.aBoolean249 = local1435.g1() == 1;
						Static416.aString71 = local1435.gstr();
						client.locTypeList.method3059(Static174.aBoolean249);
						client.objTypeList.method2485(Static174.aBoolean249);
						client.npcTypeList.method7097(Static174.aBoolean249);
					} else if (Static524.aClass153_3.aClass350_1.method7939(Static94.anInt1970)) {
						Static524.aClass153_3.aClass350_1.method7936(local1435.data, Static94.anInt1970, 0);
						local1435.pos = 0;
						Static608.anInt9316 = local1435.g1();
						Static38.anInt932 = local1435.g1();
						Static389.aBoolean459 = local1435.g1() == 1;
						Static34.aBoolean62 = local1435.g1() == 1;
						Static298.aBoolean369 = local1435.g1() == 1;
						Static416.aLong207 = local1435.g8();
						Static94.aLong70 = Static416.aLong207 - Static588.currentTimeMillis() - local1435.method7411();
						local203 = local1435.g1();
						Static126.aBoolean200 = (local203 & 0x1) != 0;
						Static425.aBoolean482 = (local203 & 0x2) != 0;
						Static435.anInt6614 = local1435.g4();
						Static684.aBoolean776 = local1435.g1() == 1;
						Static134.anInt10354 = local1435.g4();
						Static677.anInt10262 = local1435.g2();
						Static476.anInt7196 = local1435.g2();
						Static323.anInt5135 = local1435.g2();
						Static392.anInt6161 = local1435.g4();
						Static439.aPrivilegedRequest_4 = GameShell.sign.method8989(Static392.anInt6161);
						Static335.anInt5481 = local1435.g1();
						Static626.anInt9499 = local1435.g2();
						Static636.anInt9553 = local1435.g2();
						Static420.aBoolean479 = local1435.g1() == 1;
						Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 = Static515.aString96 = local1435.gjstr2();
						Static639.anInt9597 = local1435.g1();
						Static438.anInt6660 = local1435.g4();
						Static587.aBoolean664 = local1435.g1() == 1;
						Static668.aClass231_5 = new Class231();
						Static668.aClass231_5.id = local1435.g2();
						if (Static668.aClass231_5.id == 65535) {
							Static668.aClass231_5.id = -1;
						}
						Static668.aClass231_5.address = local1435.gjstr2();
						if (Static446.liveMode != client.modewhere) {
							Static668.aClass231_5.defaultPort = Static668.aClass231_5.id + 40000;
							Static668.aClass231_5.alternatePort = Static668.aClass231_5.id + 50000;
						}
						if (Static16.localMode != client.modewhere && (client.modewhere != Static713.wtqaMode || Static608.anInt9316 < 2) && Static344.aClass231_1.method5272(client.world)) {
							Static152.method9280();
						}
					} else {
						return;
					}
					if (Static389.aBoolean459 && !Static298.aBoolean369 || Static126.aBoolean200) {
						try {
							BrowserControl.call("zap", signlink.mainapp);
						} catch (@Pc(1850) Throwable local1850) {
							if (Static305.advert) {
								try {
									signlink.mainapp.getAppletContext().showDocument(new URL(signlink.mainapp.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1868) Exception local1868) {
								}
							}
						}
					} else {
						try {
							BrowserControl.call("unzap", signlink.mainapp);
						} catch (@Pc(1879) Throwable local1879) {
						}
					}
					if (client.modewhere == Static446.liveMode) {
						try {
							BrowserControl.call("loggedin", signlink.mainapp);
						} catch (@Pc(1892) Throwable local1892) {
						}
					}
					if (Static299.anInt4841 != 2) {
						Static135.anInt8246 = 0;
						Static342.method4471(2);
						Static249.method3538();
						Static81.method1586(7);
						Static524.aClass153_3.packetType = null;
						return;
					}
					Static135.anInt8246 = 16;
				}
				if (Static135.anInt8246 == 16) {
					if (!Static524.aClass153_3.aClass350_1.method7939(3)) {
						return;
					}
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 3, 0);
					Static135.anInt8246 = 17;
				}
				if (Static135.anInt8246 == 17) {
					local1435 = Static524.aClass153_3.aClass2_Sub21_Sub2_2;
					local1435.pos = 0;
					if (local1435.method7420()) {
						if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
							return;
						}
						Static524.aClass153_3.aClass350_1.method7936(local1435.data, 1, 3);
					}
					Static524.aClass153_3.packetType = Static585.method7684()[local1435.method7428()];
					Static524.aClass153_3.length = local1435.g2();
					Static135.anInt8246 = 15;
				}
				if (Static135.anInt8246 == 15) {
					if (Static524.aClass153_3.aClass350_1.method7939(Static524.aClass153_3.length)) {
						Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, Static524.aClass153_3.length, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
						local360 = Static524.aClass153_3.length;
						Static135.anInt8246 = 0;
						Static342.method4471(2);
						Static254.method3605();
						Static168.method2633(Static524.aClass153_3.aClass2_Sub21_Sub2_2);
						Static62.anInt1472 = -1;
						if (Static524.aClass153_3.packetType == ServerProt.OPCODE_128) {
							Static466.method6332();
						} else {
							GameShell.method5862();
						}
						if (Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos != local360) {
							throw new RuntimeException("lswp pos:" + Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos + " psize:" + local360);
						}
						Static524.aClass153_3.packetType = null;
					}
				} else if (Static135.anInt8246 == 19) {
					if (Static524.aClass153_3.length == -2) {
						if (!Static524.aClass153_3.aClass350_1.method7939(2)) {
							return;
						}
						Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 2, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
						Static524.aClass153_3.length = Static524.aClass153_3.aClass2_Sub21_Sub2_2.g2();
					}
					if (Static524.aClass153_3.aClass350_1.method7939(Static524.aClass153_3.length)) {
						Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, Static524.aClass153_3.length, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
						Static135.anInt8246 = 0;
						local360 = Static524.aClass153_3.length;
						Static342.method4471(15);
						Static94.method1841();
						Static168.method2633(Static524.aClass153_3.aClass2_Sub21_Sub2_2);
						if (local360 != Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos) {
							throw new RuntimeException("lswpr pos:" + Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos + " psize:" + local360);
						}
						Static524.aClass153_3.packetType = null;
					}
				}
			} else if (Static524.aClass153_3.aClass350_1.method7939(1)) {
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.data, 1, 0);
				Static94.anInt1970 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.data[0] & 0xFF;
				Static135.anInt8246 = 14;
			}
		} catch (@Pc(2184) IOException local2184) {
			Static524.aClass153_3.method3274();
			if (Static76.anInt1608 < 3) {
				if (Static299.anInt4841 == 2) {
					Static344.aClass231_1.method5267();
				} else {
					client.lobby.method5267();
				}
				Static135.anInt8246 = 1;
				Static76.anInt1608++;
				Static330.anInt5453 = 0;
			} else {
				Static135.anInt8246 = 0;
				Static342.method4471(-4);
				Static564.method7472();
			}
		}
	}
}
