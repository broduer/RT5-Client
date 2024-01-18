import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!lia", name = "r", descriptor = "Lclient!rt;")
	public static Class327 aClass327_4;

	@OriginalMember(owner = "client!lia", name = "p", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!lia", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Z)Lclient!fu;")
	public static Class2_Sub20 method3705() {
		if (Static30.aClass339_31 == null || Static444.aClass191_1 == null) {
			return null;
		}
		for (@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) Static444.aClass191_1.method3007(); local17 != null; local17 = (Class2_Sub20) Static444.aClass191_1.method3007()) {
			@Pc(30) Class105 local30 = Static30.aClass246_3.method3966(local17.anInt3131);
			if (local30 != null && local30.aBoolean217 && local30.method1623(Static30.anInterface23_3)) {
				return local17;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IFFILclient!tk;[BFIBFIIIF)V")
	public static void method3708(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class59 arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) float arg5, @OriginalArg(9) float arg6, @OriginalArg(12) int arg7, @OriginalArg(13) float arg8) {
		@Pc(17) float[] local17 = new float[16384];
		@Pc(22) int local22;
		@Pc(48) int local48;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			local22 = arg7;
			arg3.method953(arg0 / (float) 128, arg8 * 127.0F, local17, 0, arg6 / (float) 16, arg2, arg1 / (float) 128);
			for (local48 = 0; local48 < 16384; local48++) {
				arg4[local22] = (byte) (int) ((float) arg4[local22] + local17[local48]);
				local22++;
			}
			arg1 *= 2.0F;
			arg0 *= 2.0F;
			arg6 *= 2.0F;
			arg8 *= arg5;
		}
		local22 = arg7;
		for (local48 = 0; local48 < 16384; local48++) {
			arg4[local22] = (byte) (arg4[local22] + 127);
			local22++;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)V")
	public static void method3710() {
		if (Static135.anInt8223 == 0 || Static135.anInt8223 == 10) {
			return;
		}
		try {
			@Pc(25) short local25;
			if (Static76.anInt1601 == 0) {
				local25 = 250;
			} else {
				local25 = 2000;
			}
			if (Static299.anInt4825 != 2 || Static135.anInt8223 != 20 && Static169.anInt2855 != 42) {
				Static330.anInt5434++;
			}
			if (Static311.aBoolean384 && Static135.anInt8223 >= 6) {
				local25 = 6000;
			}
			if (local25 < Static330.anInt5434) {
				Static524.aClass153_3.method2338();
				if (Static76.anInt1601 >= 3) {
					Static135.anInt8223 = 0;
					Static342.method3099(-5);
					return;
				}
				if (Static299.anInt4825 == 2) {
					Static344.aClass229_1.method3717();
				} else {
					Static660.aClass229_4.method3717();
				}
				Static135.anInt8223 = 1;
				Static330.anInt5434 = 0;
				Static76.anInt1601++;
			}
			if (Static135.anInt8223 == 1) {
				if (Static299.anInt4825 == 2) {
					Static524.aClass153_3.aClass270_1 = Static344.aClass229_1.method3720(Static446.aClass390_6);
				} else {
					Static524.aClass153_3.aClass270_1 = Static660.aClass229_4.method3720(Static446.aClass390_6);
				}
				Static135.anInt8223 = 2;
			}
			@Pc(186) Class2_Sub19 local186;
			@Pc(203) int local203;
			@Pc(250) int local250;
			if (Static135.anInt8223 == 2) {
				if (Static524.aClass153_3.aClass270_1.anInt6789 == 2) {
					throw new IOException();
				}
				if (Static524.aClass153_3.aClass270_1.anInt6789 != 1) {
					return;
				}
				Static524.aClass153_3.aClass348_1 = Static99.method1246((Socket) Static524.aClass153_3.aClass270_1.anObject13);
				Static524.aClass153_3.aClass270_1 = null;
				Static524.aClass153_3.method2336();
				local186 = Static273.method2769();
				if (Static311.aBoolean384) {
					local186.aClass2_Sub21_Sub2_1.method5198(Static572.aClass167_64.anInt3973);
					local186.aClass2_Sub21_Sub2_1.method5182(0);
					local203 = local186.aClass2_Sub21_Sub2_1.anInt8388;
					local186.aClass2_Sub21_Sub2_1.method5151(667);
					if (Static299.anInt4825 == 2) {
						local186.aClass2_Sub21_Sub2_1.method5198(Static283.anInt4574 == 14 ? 1 : 0);
					}
					@Pc(229) Class2_Sub21 local229 = Static570.method5321();
					local229.method5198(Static129.anInt2409);
					local229.method5182((int) (Math.random() * 9.9999999E7D));
					local229.method5198(Static51.anInt1052);
					local229.method5151(Static323.anInt5121);
					for (local250 = 0; local250 < 6; local250++) {
						local229.method5151((int) (Math.random() * 9.9999999E7D));
					}
					local229.method5172(Static571.aLong269);
					local229.method5198(Static392.aClass377_4.anInt9720);
					local229.method5198((int) (Math.random() * 9.9999999E7D));
					local229.method5194(Static374.aBigInteger2, Static262.aBigInteger1);
					local186.aClass2_Sub21_Sub2_1.method5195(local229.anInt8388, local229.aByteArray93, 0);
					local186.aClass2_Sub21_Sub2_1.method5166(local186.aClass2_Sub21_Sub2_1.anInt8388 - local203);
				} else {
					local186.aClass2_Sub21_Sub2_1.method5198(Static572.aClass167_53.anInt3973);
				}
				Static524.aClass153_3.method2339(local186);
				Static524.aClass153_3.method2337();
				Static135.anInt8223 = 3;
			}
			@Pc(360) int local360;
			if (Static135.anInt8223 == 3) {
				if (!Static524.aClass153_3.aClass348_1.method5629(1)) {
					return;
				}
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				if (local360 != 0) {
					Static135.anInt8223 = 0;
					Static342.method3099(local360);
					Static524.aClass153_3.method2338();
					Static564.method5264();
					return;
				}
				if (Static311.aBoolean384) {
					Static135.anInt8223 = 4;
				} else {
					Static135.anInt8223 = 8;
				}
			}
			if (Static135.anInt8223 == 4) {
				if (!Static524.aClass153_3.aClass348_1.method5629(2)) {
					return;
				}
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 2, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5191();
				Static135.anInt8223 = 5;
			}
			if (Static135.anInt8223 == 5) {
				if (!Static524.aClass153_3.aClass348_1.method5629(Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388)) {
					return;
				}
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5164(Static219.anIntArray287);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
				@Pc(465) String local465 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5152();
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
				@Pc(473) String local473 = "opensn";
				if (!Static98.aBoolean191 || Static36.method522(Static446.aClass390_6, local465, local473, 1).anInt6789 == 2) {
					Static259.method2660(local465, local473, Static446.aClass390_6, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method5612() == 1, true);
				}
				Static135.anInt8223 = 6;
			}
			if (Static135.anInt8223 == 6) {
				if (!Static524.aClass153_3.aClass348_1.method5629(1)) {
					return;
				}
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				if ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF) == 1) {
					Static135.anInt8223 = 7;
				}
			}
			if (Static135.anInt8223 == 7) {
				if (!Static524.aClass153_3.aClass348_1.method5629(16)) {
					return;
				}
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 16, 0);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 16;
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5164(Static219.anIntArray287);
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
				Static449.aString75 = Static319.aString51 = Static287.method2862(Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5207());
				Static430.aLong209 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5207();
				Static135.anInt8223 = 8;
			}
			@Pc(618) Class2_Sub21_Sub2 local618;
			if (Static135.anInt8223 == 8) {
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
				Static524.aClass153_3.method2336();
				local186 = Static273.method2769();
				local618 = local186.aClass2_Sub21_Sub2_1;
				@Pc(646) int local646;
				@Pc(672) Class2_Sub21 local672;
				@Pc(627) Class167 local627;
				if (Static299.anInt4825 == 2) {
					if (Static311.aBoolean384) {
						local627 = Static572.aClass167_65;
					} else {
						local627 = Static572.aClass167_55;
					}
					local618.method5198(local627.anInt3973);
					local618.method5182(0);
					local250 = local618.anInt8388;
					local646 = local618.anInt8388;
					if (!Static311.aBoolean384) {
						local618.method5151(667);
						local618.method5198(Static283.anInt4574 == 14 ? 1 : 0);
						local646 = local618.anInt8388;
						local672 = Static659.method6135();
						local618.method5195(local672.anInt8388, local672.aByteArray93, 0);
						local646 = local618.anInt8388;
						local618.method5200(Static449.aString75);
					}
					local618.method5198(Static470.anInt7113);
					local618.method5198(Static36.method520(3));
					local618.method5182(Static680.anInt10289);
					local618.method5182(Static380.anInt5979);
					local618.method5198(Static400.aClass2_Sub34_28.aClass57_Sub13_1.method3038());
					Static176.method4703(local618);
					local618.method5200(Static150.aString26);
					local618.method5151(Static323.anInt5121);
					local672 = Static400.aClass2_Sub34_28.method3582();
					local618.method5198(local672.anInt8388);
					local618.method5195(local672.anInt8388, local672.aByteArray93, 0);
					Static503.aBoolean578 = true;
					@Pc(748) Class2_Sub21 local748 = new Class2_Sub21(Static292.aClass2_Sub43_2.method4748());
					Static292.aClass2_Sub43_2.method4745(local748);
					local618.method5195(local748.aByteArray93.length, local748.aByteArray93, 0);
					local618.method5151(Static334.anInt5456);
					local618.method5172(Static416.aLong208);
					local618.method5198(Static389.aString64 == null ? 0 : 1);
					if (Static389.aString64 != null) {
						local618.method5200(Static389.aString64);
					}
					local618.method5198(Static183.method1911("jagtheora") ? 1 : 0);
					local618.method5198(Static98.aBoolean191 ? 1 : 0);
					local618.method5198(Static416.aBoolean473 ? 1 : 0);
					Static169.method1789(local618);
					local618.method5175(Static219.anIntArray287, local646, local618.anInt8388);
					local618.method5166(local618.anInt8388 - local250);
				} else {
					if (Static311.aBoolean384) {
						local627 = Static572.aClass167_65;
					} else {
						local627 = Static572.aClass167_57;
					}
					local618.method5198(local627.anInt3973);
					local618.method5182(0);
					local250 = local618.anInt8388;
					local646 = local618.anInt8388;
					if (!Static311.aBoolean384) {
						local618.method5151(667);
						local672 = Static659.method6135();
						local618.method5195(local672.anInt8388, local672.aByteArray93, 0);
						local646 = local618.anInt8388;
						local618.method5200(Static449.aString75);
					}
					local618.method5198(Static392.aClass377_4.anInt9720);
					local618.method5198(Static51.anInt1052);
					Static176.method4703(local618);
					local618.method5200(Static150.aString26);
					local618.method5151(Static323.anInt5121);
					Static169.method1789(local618);
					local618.method5175(Static219.anIntArray287, local646, local618.anInt8388);
					local618.method5166(local618.anInt8388 - local250);
				}
				Static524.aClass153_3.method2339(local186);
				Static524.aClass153_3.method2337();
				Static524.aClass153_3.aClass186_1 = new Class186(Static219.anIntArray287);
				for (@Pc(938) int local938 = 0; local938 < 4; local938++) {
					Static219.anIntArray287[local938] += 50;
				}
				Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5224(Static219.anIntArray287);
				Static219.anIntArray287 = null;
				Static135.anInt8223 = 9;
			}
			if (Static135.anInt8223 == 9) {
				if (!Static524.aClass153_3.aClass348_1.method5629(1)) {
					return;
				}
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				if (local360 == 21) {
					Static135.anInt8223 = 12;
				} else if (local360 == 29 || local360 == 45) {
					Static135.anInt8223 = 18;
					Static79.anInt1634 = local360;
				} else if (local360 == 1) {
					Static135.anInt8223 = 10;
					Static342.method3099(local360);
					return;
				} else if (local360 == 2) {
					Static135.anInt8223 = 13;
				} else if (local360 == 15) {
					Static135.anInt8223 = 19;
					Static524.aClass153_3.anInt3648 = -2;
				} else if (local360 == 23 && Static76.anInt1601 < 3) {
					Static330.anInt5434 = 0;
					Static135.anInt8223 = 1;
					Static76.anInt1601++;
					Static524.aClass153_3.aClass348_1.method5623();
					Static524.aClass153_3.aClass348_1 = null;
					return;
				} else if (local360 == 42) {
					Static135.anInt8223 = 20;
					Static342.method3099(local360);
					return;
				} else if (!Static561.aBoolean640 || Static311.aBoolean384 || Static129.anInt2409 == -1 || local360 != 35) {
					Static135.anInt8223 = 0;
					Static342.method3099(local360);
					Static524.aClass153_3.aClass348_1.method5623();
					Static524.aClass153_3.aClass348_1 = null;
					Static564.method5264();
					return;
				} else {
					Static311.aBoolean384 = true;
					Static135.anInt8223 = 1;
					Static330.anInt5434 = 0;
					Static524.aClass153_3.aClass348_1.method5623();
					Static524.aClass153_3.aClass348_1 = null;
					return;
				}
			}
			if (Static135.anInt8223 == 11) {
				Static524.aClass153_3.method2336();
				local186 = Static273.method2769();
				local618 = local186.aClass2_Sub21_Sub2_1;
				local618.method5231(Static524.aClass153_3.aClass186_1);
				local618.method5227(Static572.aClass167_61.anInt3973);
				Static524.aClass153_3.method2339(local186);
				Static524.aClass153_3.method2337();
				Static135.anInt8223 = 9;
			} else if (Static135.anInt8223 == 12) {
				if (Static524.aClass153_3.aClass348_1.method5629(1)) {
					Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
					local360 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
					Static135.anInt8223 = 0;
					Static118.anInt2292 = local360 * 50;
					Static342.method3099(21);
					Static524.aClass153_3.aClass348_1.method5623();
					Static524.aClass153_3.aClass348_1 = null;
					Static564.method5264();
				}
			} else if (Static135.anInt8223 == 20) {
				if (Static524.aClass153_3.aClass348_1.method5629(2)) {
					Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 2, 0);
					Static660.anInt9837 = (Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[1] & 0xFF) + ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF) << 8);
					Static135.anInt8223 = 9;
				}
			} else if (Static135.anInt8223 == 18) {
				if (Static79.anInt1634 == 29) {
					if (!Static524.aClass153_3.aClass348_1.method5629(1)) {
						return;
					}
					Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
					Static329.anInt1749 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				} else if (Static79.anInt1634 == 45) {
					if (!Static524.aClass153_3.aClass348_1.method5629(3)) {
						return;
					}
					Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 3, 0);
					Static356.anInt5780 = (Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[2] & 0xFF) + ((Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[1] & 0xFF) << 8);
					Static329.anInt1749 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				} else {
					throw new IllegalStateException("Login step 18 not valid for pendingResponse=" + Static79.anInt1634);
				}
				Static135.anInt8223 = 0;
				Static342.method3099(Static79.anInt1634);
				Static524.aClass153_3.aClass348_1.method5623();
				Static524.aClass153_3.aClass348_1 = null;
				Static564.method5264();
			} else if (Static135.anInt8223 != 13) {
				@Pc(1435) Class2_Sub21_Sub2 local1435;
				if (Static135.anInt8223 == 14) {
					local1435 = Static524.aClass153_3.aClass2_Sub21_Sub2_2;
					if (Static299.anInt4825 == 2) {
						if (!Static524.aClass153_3.aClass348_1.method5629(Static94.anInt1961)) {
							return;
						}
						Static524.aClass153_3.aClass348_1.method5626(local1435.aByteArray93, Static94.anInt1961, 0);
						local1435.anInt8388 = 0;
						Static608.anInt9290 = local1435.method5205();
						Static38.anInt928 = local1435.method5205();
						Static389.aBoolean459 = local1435.method5205() == 1;
						Static34.aBoolean62 = local1435.method5205() == 1;
						Static298.aBoolean369 = local1435.method5205() == 1;
						Static617.aBoolean724 = local1435.method5205() == 1;
						Static312.anInt5000 = local1435.method5191();
						Static126.aBoolean200 = local1435.method5205() == 1;
						Static106.anInt2153 = local1435.method5201();
						Static174.aBoolean249 = local1435.method5205() == 1;
						Static416.aString71 = local1435.method5167();
						Static354.aClass142_4.method2154(Static174.aBoolean249);
						Static419.aClass112_1.method1683(Static174.aBoolean249);
						Static690.aClass308_2.method4965(Static174.aBoolean249);
					} else if (Static524.aClass153_3.aClass348_1.method5629(Static94.anInt1961)) {
						Static524.aClass153_3.aClass348_1.method5626(local1435.aByteArray93, Static94.anInt1961, 0);
						local1435.anInt8388 = 0;
						Static608.anInt9290 = local1435.method5205();
						Static38.anInt928 = local1435.method5205();
						Static389.aBoolean459 = local1435.method5205() == 1;
						Static34.aBoolean62 = local1435.method5205() == 1;
						Static298.aBoolean369 = local1435.method5205() == 1;
						Static416.aLong207 = local1435.method5207();
						Static94.aLong70 = Static416.aLong207 - Static588.method5469() - local1435.method5213();
						local203 = local1435.method5205();
						Static126.aBoolean200 = (local203 & 0x1) != 0;
						Static425.aBoolean482 = (local203 & 0x2) != 0;
						Static435.anInt6594 = local1435.method5158();
						Static684.aBoolean775 = local1435.method5205() == 1;
						Static134.anInt10326 = local1435.method5158();
						Static677.anInt10234 = local1435.method5191();
						Static476.anInt7175 = local1435.method5191();
						Static323.anInt5118 = local1435.method5191();
						Static392.anInt6141 = local1435.method5158();
						Static439.aClass270_4 = Static446.aClass390_6.method6423(Static392.anInt6141);
						Static335.anInt5462 = local1435.method5205();
						Static626.anInt9473 = local1435.method5191();
						Static636.anInt9527 = local1435.method5191();
						Static420.aBoolean479 = local1435.method5205() == 1;
						Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 = Static515.aString96 = local1435.method5152();
						Static639.anInt9571 = local1435.method5205();
						Static438.anInt6640 = local1435.method5158();
						Static587.aBoolean663 = local1435.method5205() == 1;
						Static668.aClass229_5 = new Class229();
						Static668.aClass229_5.anInt5856 = local1435.method5191();
						if (Static668.aClass229_5.anInt5856 == 65535) {
							Static668.aClass229_5.anInt5856 = -1;
						}
						Static668.aClass229_5.aString60 = local1435.method5152();
						if (Static446.aClass355_5 != Static2.aClass355_1) {
							Static668.aClass229_5.anInt5854 = Static668.aClass229_5.anInt5856 + 40000;
							Static668.aClass229_5.anInt5853 = Static668.aClass229_5.anInt5856 + 50000;
						}
						if (Static16.aClass355_2 != Static2.aClass355_1 && (Static2.aClass355_1 != Static713.aClass355_8 || Static608.anInt9290 < 2) && Static344.aClass229_1.method3722(Static527.aClass229_3)) {
							Static152.f();
						}
					} else {
						return;
					}
					if (Static389.aBoolean459 && !Static298.aBoolean369 || Static126.aBoolean200) {
						try {
							Static727.method54("zap", Static166.anApplet1);
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
							Static727.method54("unzap", Static166.anApplet1);
						} catch (@Pc(1879) Throwable local1879) {
						}
					}
					if (Static2.aClass355_1 == Static446.aClass355_5) {
						try {
							Static727.method54("loggedin", Static166.anApplet1);
						} catch (@Pc(1892) Throwable local1892) {
						}
					}
					if (Static299.anInt4825 != 2) {
						Static135.anInt8223 = 0;
						Static342.method3099(2);
						Static249.method2561();
						Static81.method1020(7);
						Static524.aClass153_3.aClass225_93 = null;
						return;
					}
					Static135.anInt8223 = 16;
				}
				if (Static135.anInt8223 == 16) {
					if (!Static524.aClass153_3.aClass348_1.method5629(3)) {
						return;
					}
					Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 3, 0);
					Static135.anInt8223 = 17;
				}
				if (Static135.anInt8223 == 17) {
					local1435 = Static524.aClass153_3.aClass2_Sub21_Sub2_2;
					local1435.anInt8388 = 0;
					if (local1435.method5222()) {
						if (!Static524.aClass153_3.aClass348_1.method5629(1)) {
							return;
						}
						Static524.aClass153_3.aClass348_1.method5626(local1435.aByteArray93, 1, 3);
					}
					Static524.aClass153_3.aClass225_93 = Static585.method5431()[local1435.method5230()];
					Static524.aClass153_3.anInt3648 = local1435.method5191();
					Static135.anInt8223 = 15;
				}
				if (Static135.anInt8223 == 15) {
					if (Static524.aClass153_3.aClass348_1.method5629(Static524.aClass153_3.anInt3648)) {
						Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, Static524.aClass153_3.anInt3648, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
						local360 = Static524.aClass153_3.anInt3648;
						Static135.anInt8223 = 0;
						Static342.method3099(2);
						Static254.method2608();
						Static168.method1775(Static524.aClass153_3.aClass2_Sub21_Sub2_2);
						Static62.anInt1465 = -1;
						if (Static524.aClass153_3.aClass225_93 == Static291.aClass225_123) {
							Static466.method4419();
						} else {
							Static434.method4156();
						}
						if (Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 != local360) {
							throw new RuntimeException("lswp pos:" + Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 + " psize:" + local360);
						}
						Static524.aClass153_3.aClass225_93 = null;
					}
				} else if (Static135.anInt8223 == 19) {
					if (Static524.aClass153_3.anInt3648 == -2) {
						if (!Static524.aClass153_3.aClass348_1.method5629(2)) {
							return;
						}
						Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 2, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
						Static524.aClass153_3.anInt3648 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.method5191();
					}
					if (Static524.aClass153_3.aClass348_1.method5629(Static524.aClass153_3.anInt3648)) {
						Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, Static524.aClass153_3.anInt3648, 0);
						Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 = 0;
						Static135.anInt8223 = 0;
						local360 = Static524.aClass153_3.anInt3648;
						Static342.method3099(15);
						Static94.method1191();
						Static168.method1775(Static524.aClass153_3.aClass2_Sub21_Sub2_2);
						if (local360 != Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388) {
							throw new RuntimeException("lswpr pos:" + Static524.aClass153_3.aClass2_Sub21_Sub2_2.anInt8388 + " psize:" + local360);
						}
						Static524.aClass153_3.aClass225_93 = null;
					}
				}
			} else if (Static524.aClass153_3.aClass348_1.method5629(1)) {
				Static524.aClass153_3.aClass348_1.method5626(Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93, 1, 0);
				Static94.anInt1961 = Static524.aClass153_3.aClass2_Sub21_Sub2_2.aByteArray93[0] & 0xFF;
				Static135.anInt8223 = 14;
			}
		} catch (@Pc(2184) IOException local2184) {
			Static524.aClass153_3.method2338();
			if (Static76.anInt1601 < 3) {
				if (Static299.anInt4825 == 2) {
					Static344.aClass229_1.method3717();
				} else {
					Static660.aClass229_4.method3717();
				}
				Static135.anInt8223 = 1;
				Static76.anInt1601++;
				Static330.anInt5434 = 0;
			} else {
				Static135.anInt8223 = 0;
				Static342.method3099(-4);
				Static564.method5264();
			}
		}
	}
}
