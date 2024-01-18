import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "Lclient!rt;")
	public static Class329 aClass329_4;

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)Lclient!fu;")
	public static Class2_Sub20 method5255() {
		if (Static30.aClass341_31 == null || Static444.aClass193_1 == null) {
			return null;
		}
		for (@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) Static444.aClass193_1.method4349(); local17 != null; local17 = (Class2_Sub20) Static444.aClass193_1.method4349()) {
			@Pc(30) Class105 local30 = Static30.aClass248_3.method5591(local17.anInt3140);
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
					Static660.aClass231_4.method5267();
				}
				Static135.anInt8246 = 1;
				Static330.anInt5453 = 0;
				Static76.anInt1608++;
			}
			if (Static135.anInt8246 == 1) {
				if (Static299.anInt4841 == 2) {
					Static524.aClass153_3.aClass272_1 = Static344.aClass231_1.method5270(Static446.aClass392_6);
				} else {
					Static524.aClass153_3.aClass272_1 = Static660.aClass231_4.method5270(Static446.aClass392_6);
				}
				Static135.anInt8246 = 2;
			}
			@Pc(186) Class2_Sub19 local186;
			@Pc(203) int local203;
			@Pc(250) int local250;
			if (Static135.anInt8246 == 2) {
				if (Static524.aClass153_3.aClass272_1.anInt6810 == 2) {
					throw new IOException();
				}
				if (Static524.aClass153_3.aClass272_1.anInt6810 != 1) {
					return;
				}
				Static524.aClass153_3.aClass350_1 = Static99.method1975((Socket) Static524.aClass153_3.aClass272_1.anObject13);
				Static524.aClass153_3.aClass272_1 = null;
				Static524.aClass153_3.method3272();
				local186 = Static273.method3962();
				if (Static311.aBoolean384) {
					local186.aClass2_Sub21_Sub2_1.method7396(Static572.aClass167_64.anInt3984);
					local186.aClass2_Sub21_Sub2_1.method7380(0);
					local203 = local186.aClass2_Sub21_Sub2_1.anInt8412;
					local186.aClass2_Sub21_Sub2_1.method7349(667);
					if (Static299.anInt4841 == 2) {
						local186.aClass2_Sub21_Sub2_1.method7396(Static283.anInt4588 == 14 ? 1 : 0);
					}
					@Pc(229) Class2_Sub21 local229 = Static570.method7559();
					local229.method7396(Static129.anInt2418);
					local229.method7380((int) (Math.random() * 9.9999999E7D));
					local229.method7396(Static51.anInt1056);
					local229.method7349(Static323.anInt5138);
					for (local250 = 0; local250 < 6; local250++) {
						local229.method7349((int) (Math.random() * 9.9999999E7D));
					}
					local229.method7370(Static571.aLong269);
					local229.method7396(Static392.aClass379_4.anInt9746);
					local229.method7396((int) (Math.random() * 9.9999999E7D));
					local229.method7392(Static374.aBigInteger2, Static262.aBigInteger1);
					local186.aClass2_Sub21_Sub2_1.method7393(local229.anInt8412, local229.aByteArray93, 0);
					local186.aClass2_Sub21_Sub2_1.method7364(local186.aClass2_Sub21_Sub2_1.anInt8412 - local203);
				} else {
					local186.aClass2_Sub21_Sub2_1.method7396(Static572.aClass167_53.anInt3984);
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
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
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
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 2, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7389();
				Static135.anInt8246 = 5;
			}
			if (Static135.anInt8246 == 5) {
				if (!Static524.aClass153_3.aClass350_1.method7939(Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7362(Static219.anIntArray287);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
				@Pc(465) String local465 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7350();
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
				@Pc(473) String local473 = "opensn";
				if (!Static98.aBoolean191 || Static36.method980(Static446.aClass392_6, local465, local473, 1).anInt6810 == 2) {
					Static259.method3693(local465, local473, Static446.aClass392_6, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1, true);
				}
				Static135.anInt8246 = 6;
			}
			if (Static135.anInt8246 == 6) {
				if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				if ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF) == 1) {
					Static135.anInt8246 = 7;
				}
			}
			if (Static135.anInt8246 == 7) {
				if (!Static524.aClass153_3.aClass350_1.method7939(16)) {
					return;
				}
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 16, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 16;
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7362(Static219.anIntArray287);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
				Static449.aString75 = Static319.aString51 = Static287.method4154(Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7405());
				Static430.aLong209 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7405();
				Static135.anInt8246 = 8;
			}
			@Pc(618) Class2_Sub21_Sub2 local618;
			if (Static135.anInt8246 == 8) {
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
				Static524.aClass153_3.method3272();
				local186 = Static273.method3962();
				local618 = local186.aClass2_Sub21_Sub2_1;
				@Pc(646) int local646;
				@Pc(672) Class2_Sub21 local672;
				@Pc(627) Class167 local627;
				if (Static299.anInt4841 == 2) {
					if (Static311.aBoolean384) {
						local627 = Static572.aClass167_65;
					} else {
						local627 = Static572.aClass167_55;
					}
					local618.method7396(local627.anInt3984);
					local618.method7380(0);
					local250 = local618.anInt8412;
					local646 = local618.anInt8412;
					if (!Static311.aBoolean384) {
						local618.method7349(667);
						local618.method7396(Static283.anInt4588 == 14 ? 1 : 0);
						local646 = local618.anInt8412;
						local672 = Static659.method8615();
						local618.method7393(local672.anInt8412, local672.aByteArray93, 0);
						local646 = local618.anInt8412;
						local618.method7398(Static449.aString75);
					}
					local618.method7396(Static470.anInt7134);
					local618.method7396(Static36.method978());
					local618.method7380(Static680.anInt10317);
					local618.method7380(Static380.anInt5999);
					local618.method7396(Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4380());
					Static176.method6697(local618);
					local618.method7398(Static150.aString26);
					local618.method7349(Static323.anInt5138);
					local672 = Static400.aClass2_Sub34_28.method5117();
					local618.method7396(local672.anInt8412);
					local618.method7393(local672.anInt8412, local672.aByteArray93, 0);
					Static503.aBoolean578 = true;
					@Pc(748) Class2_Sub21 local748 = new Class2_Sub21(Static292.aClass2_Sub43_2.method6752());
					Static292.aClass2_Sub43_2.method6749(local748);
					local618.method7393(local748.aByteArray93.length, local748.aByteArray93, 0);
					local618.method7349(Static334.anInt5475);
					local618.method7370(Static416.aLong208);
					local618.method7396(Static389.aString64 == null ? 0 : 1);
					if (Static389.aString64 != null) {
						local618.method7398(Static389.aString64);
					}
					local618.method7396(Static183.method2796("jagtheora") ? 1 : 0);
					local618.method7396(Static98.aBoolean191 ? 1 : 0);
					local618.method7396(Static416.aBoolean473 ? 1 : 0);
					Static169.method2647(local618);
					local618.method7373(Static219.anIntArray287, local646, local618.anInt8412);
					local618.method7364(local618.anInt8412 - local250);
				} else {
					if (Static311.aBoolean384) {
						local627 = Static572.aClass167_65;
					} else {
						local627 = Static572.aClass167_57;
					}
					local618.method7396(local627.anInt3984);
					local618.method7380(0);
					local250 = local618.anInt8412;
					local646 = local618.anInt8412;
					if (!Static311.aBoolean384) {
						local618.method7349(667);
						local672 = Static659.method8615();
						local618.method7393(local672.anInt8412, local672.aByteArray93, 0);
						local646 = local618.anInt8412;
						local618.method7398(Static449.aString75);
					}
					local618.method7396(Static392.aClass379_4.anInt9746);
					local618.method7396(Static51.anInt1056);
					Static176.method6697(local618);
					local618.method7398(Static150.aString26);
					local618.method7349(Static323.anInt5138);
					Static169.method2647(local618);
					local618.method7373(Static219.anIntArray287, local646, local618.anInt8412);
					local618.method7364(local618.anInt8412 - local250);
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
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
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
					Static524.aClass153_3.anInt3658 = -2;
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
				local618.method7425(Static572.aClass167_61.anInt3984);
				Static524.aClass153_3.method3275(local186);
				Static524.aClass153_3.method3273();
				Static135.anInt8246 = 9;
			} else if (Static135.anInt8246 == 12) {
				if (Static524.aClass153_3.aClass350_1.method7939(1)) {
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
					local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
					Static135.anInt8246 = 0;
					Static118.anInt2301 = local360 * 50;
					Static342.method4471(21);
					Static524.aClass153_3.aClass350_1.method7933();
					Static524.aClass153_3.aClass350_1 = null;
					Static564.method7472();
				}
			} else if (Static135.anInt8246 == 20) {
				if (Static524.aClass153_3.aClass350_1.method7939(2)) {
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 2, 0);
					Static660.anInt9863 = (Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[1] & 0xFF) + ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF) << 8);
					Static135.anInt8246 = 9;
				}
			} else if (Static135.anInt8246 == 18) {
				if (Static79.anInt1641 == 29) {
					if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
						return;
					}
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
					Static329.anInt1756 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				} else if (Static79.anInt1641 == 45) {
					if (!Static524.aClass153_3.aClass350_1.method7939(3)) {
						return;
					}
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 3, 0);
					Static356.anInt5800 = (Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[2] & 0xFF) + ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[1] & 0xFF) << 8);
					Static329.anInt1756 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static79.anInt1641);
				}
				Static135.anInt8246 = 0;
				Static342.method4471(Static79.anInt1641);
				Static524.aClass153_3.aClass350_1.method7933();
				Static524.aClass153_3.aClass350_1 = null;
				Static564.method7472();
			} else if (Static135.anInt8246 != 13) {
				@Pc(1435) Class2_Sub21_Sub2 local1435;
				if (Static135.anInt8246 == 14) {
					local1435 = Static524.aClass153_3.aClass2_Sub21_Sub2_2;
					if (Static299.anInt4841 == 2) {
						if (!Static524.aClass153_3.aClass350_1.method7939(Static94.anInt1970)) {
							return;
						}
						Static524.aClass153_3.aClass350_1.method7936(local1435.aByteArray93, Static94.anInt1970, 0);
						local1435.anInt8412 = 0;
						Static608.anInt9316 = local1435.method7403();
						Static38.anInt932 = local1435.method7403();
						Static389.aBoolean459 = local1435.method7403() == 1;
						Static34.aBoolean62 = local1435.method7403() == 1;
						Static298.aBoolean369 = local1435.method7403() == 1;
						Static617.aBoolean725 = local1435.method7403() == 1;
						Static312.anInt5017 = local1435.method7389();
						Static126.aBoolean200 = local1435.method7403() == 1;
						Static106.anInt2162 = local1435.method7399();
						Static174.aBoolean249 = local1435.method7403() == 1;
						Static416.aString71 = local1435.method7365();
						Static354.aClass142_4.method3059(Static174.aBoolean249);
						Static419.aClass112_1.method2485(Static174.aBoolean249);
						Static690.aClass310_2.method7097(Static174.aBoolean249);
					} else if (Static524.aClass153_3.aClass350_1.method7939(Static94.anInt1970)) {
						Static524.aClass153_3.aClass350_1.method7936(local1435.aByteArray93, Static94.anInt1970, 0);
						local1435.anInt8412 = 0;
						Static608.anInt9316 = local1435.method7403();
						Static38.anInt932 = local1435.method7403();
						Static389.aBoolean459 = local1435.method7403() == 1;
						Static34.aBoolean62 = local1435.method7403() == 1;
						Static298.aBoolean369 = local1435.method7403() == 1;
						Static416.aLong207 = local1435.method7405();
						Static94.aLong70 = Static416.aLong207 - Static588.method7722() - local1435.method7411();
						local203 = local1435.method7403();
						Static126.aBoolean200 = (local203 & 0x1) != 0;
						Static425.aBoolean482 = (local203 & 0x2) != 0;
						Static435.anInt6614 = local1435.method7356();
						Static684.aBoolean776 = local1435.method7403() == 1;
						Static134.anInt10354 = local1435.method7356();
						Static677.anInt10262 = local1435.method7389();
						Static476.anInt7196 = local1435.method7389();
						Static323.anInt5135 = local1435.method7389();
						Static392.anInt6161 = local1435.method7356();
						Static439.aClass272_4 = Static446.aClass392_6.method8989(Static392.anInt6161);
						Static335.anInt5481 = local1435.method7403();
						Static626.anInt9499 = local1435.method7389();
						Static636.anInt9553 = local1435.method7389();
						Static420.aBoolean479 = local1435.method7403() == 1;
						Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 = Static515.aString96 = local1435.method7350();
						Static639.anInt9597 = local1435.method7403();
						Static438.anInt6660 = local1435.method7356();
						Static587.aBoolean664 = local1435.method7403() == 1;
						Static668.aClass231_5 = new Class231();
						Static668.aClass231_5.anInt5876 = local1435.method7389();
						if (Static668.aClass231_5.anInt5876 == 65535) {
							Static668.aClass231_5.anInt5876 = -1;
						}
						Static668.aClass231_5.aString60 = local1435.method7350();
						if (Static446.aClass357_5 != Static2.aClass357_1) {
							Static668.aClass231_5.anInt5874 = Static668.aClass231_5.anInt5876 + 40000;
							Static668.aClass231_5.anInt5873 = Static668.aClass231_5.anInt5876 + 50000;
						}
						if (Static16.aClass357_2 != Static2.aClass357_1 && (Static2.aClass357_1 != Static713.aClass357_8 || Static608.anInt9316 < 2) && Static344.aClass231_1.method5272(Static527.aClass231_3)) {
							Static152.method9280();
						}
					} else {
						return;
					}
					if (Static389.aBoolean459 && !Static298.aBoolean369 || Static126.aBoolean200) {
						try {
							Static727.method97("zap", Static166.anApplet1);
						} catch (@Pc(1850) Throwable local1850) {
							if (Static305.aBoolean372) {
								try {
									Static166.anApplet1.getAppletContext().showDocument(new URL(Static166.anApplet1.getCodeBase(), "blank.ws"), "tbi");
								} catch (@Pc(1868) Exception local1868) {
								}
							}
						}
					} else {
						try {
							Static727.method97("unzap", Static166.anApplet1);
						} catch (@Pc(1879) Throwable local1879) {
						}
					}
					if (Static2.aClass357_1 == Static446.aClass357_5) {
						try {
							Static727.method97("loggedin", Static166.anApplet1);
						} catch (@Pc(1892) Throwable local1892) {
						}
					}
					if (Static299.anInt4841 != 2) {
						Static135.anInt8246 = 0;
						Static342.method4471(2);
						Static249.method3538();
						Static81.method1586(7);
						Static524.aClass153_3.aClass227_93 = null;
						return;
					}
					Static135.anInt8246 = 16;
				}
				if (Static135.anInt8246 == 16) {
					if (!Static524.aClass153_3.aClass350_1.method7939(3)) {
						return;
					}
					Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 3, 0);
					Static135.anInt8246 = 17;
				}
				if (Static135.anInt8246 == 17) {
					local1435 = Static524.aClass153_3.aClass2_Sub21_Sub2_2;
					local1435.anInt8412 = 0;
					if (local1435.method7420()) {
						if (!Static524.aClass153_3.aClass350_1.method7939(1)) {
							return;
						}
						Static524.aClass153_3.aClass350_1.method7936(local1435.aByteArray93, 1, 3);
					}
					Static524.aClass153_3.aClass227_93 = Static585.method7684()[local1435.method7428()];
					Static524.aClass153_3.anInt3658 = local1435.method7389();
					Static135.anInt8246 = 15;
				}
				if (Static135.anInt8246 == 15) {
					if (Static524.aClass153_3.aClass350_1.method7939(Static524.aClass153_3.anInt3658)) {
						Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, Static524.aClass153_3.anInt3658, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
						local360 = Static524.aClass153_3.anInt3658;
						Static135.anInt8246 = 0;
						Static342.method4471(2);
						Static254.method3605();
						Static168.method2633(Static524.aClass153_3.aClass2_Sub21_Sub2_2);
						Static62.anInt1472 = -1;
						if (Static524.aClass153_3.aClass227_93 == Static291.aClass227_123) {
							Static466.method6332();
						} else {
							Static434.method5862();
						}
						if (Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 != local360) {
							throw new RuntimeException("lswp pos:" + Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 + " psize:" + local360);
						}
						Static524.aClass153_3.aClass227_93 = null;
					}
				} else if (Static135.anInt8246 == 19) {
					if (Static524.aClass153_3.anInt3658 == -2) {
						if (!Static524.aClass153_3.aClass350_1.method7939(2)) {
							return;
						}
						Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 2, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
						Static524.aClass153_3.anInt3658 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method7389();
					}
					if (Static524.aClass153_3.aClass350_1.method7939(Static524.aClass153_3.anInt3658)) {
						Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, Static524.aClass153_3.anInt3658, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 = 0;
						Static135.anInt8246 = 0;
						local360 = Static524.aClass153_3.anInt3658;
						Static342.method4471(15);
						Static94.method1841();
						Static168.method2633(Static524.aClass153_3.aClass2_Sub21_Sub2_2);
						if (local360 != Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412) {
							throw new RuntimeException("lswpr pos:" + Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8412 + " psize:" + local360);
						}
						Static524.aClass153_3.aClass227_93 = null;
					}
				}
			} else if (Static524.aClass153_3.aClass350_1.method7939(1)) {
				Static524.aClass153_3.aClass350_1.method7936(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				Static94.anInt1970 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				Static135.anInt8246 = 14;
			}
		} catch (@Pc(2184) IOException local2184) {
			Static524.aClass153_3.method3274();
			if (Static76.anInt1608 < 3) {
				if (Static299.anInt4841 == 2) {
					Static344.aClass231_1.method5267();
				} else {
					Static660.aClass231_4.method5267();
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
