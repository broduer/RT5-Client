import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static709 {

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "Lclient!sb;")
	public static Class332 aClass332_127;

	@OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
	public static int anInt10695;

	@OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
	public static int anInt10697 = 1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZIILclient!qha;)Lclient!gb;")
	public static Class93_Sub2_Sub1 method9258(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19_Sub3 arg3) {
		if (arg3.aBoolean597 || Static700.method9157(arg1) && Static700.method9157(arg0)) {
			return new Class93_Sub2_Sub1(arg3, 3553, arg2, arg1, arg0);
		} else if (arg3.aBoolean595) {
			return new Class93_Sub2_Sub1(arg3, 34037, arg2, arg1, arg0);
		} else {
			return new Class93_Sub2_Sub1(arg3, arg2, arg1, arg0, Static440.method5969(arg1), Static440.method5969(arg0));
		}
	}

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "(I)V")
	public static void method9259() {
		if (Static655.aClass140Array1 == null) {
			Static655.aClass140Array1 = Static198.method2955();
			Static473.aClass140_22 = Static655.aClass140Array1[0];
			Static72.aLong52 = Static588.currentTimeMillis();
		}
		if (Static449.aClass366_1 == null) {
			Static229.method3368();
		}
		@Pc(27) Class140 local27 = Static473.aClass140_22;
		@Pc(35) int local35 = Static523.method3448();
		if (Static473.aClass140_22 == local27) {
			Static579.aString106 = Static473.aClass140_22.aClass32_64.method877(client.lang);
			if (Static473.aClass140_22.aBoolean264) {
				Static376.anInt5939 = Static473.aClass140_22.anInt3280 + local35 * (Static473.aClass140_22.anInt3279 - Static473.aClass140_22.anInt3280) / 100;
			}
			if (Static473.aClass140_22.aBoolean263) {
				Static579.aString106 = Static579.aString106 + Static376.anInt5939 + "%";
			}
		} else if (Static198.aClass140_21 == Static473.aClass140_22) {
			Static449.aClass366_1 = null;
			Static81.method1586(3);
		} else {
			Static579.aString106 = local27.aClass32_65.method877(client.lang);
			if (Static473.aClass140_22.aBoolean263) {
				Static579.aString106 = Static579.aString106 + local27.anInt3279 + "%";
			}
			Static376.anInt5939 = local27.anInt3279;
			if (Static473.aClass140_22.aBoolean264 || local27.aBoolean264) {
				Static72.aLong52 = Static588.currentTimeMillis();
			}
		}
		if (Static449.aClass366_1 == null) {
			return;
		}
		Static449.aClass366_1.method8381(Static376.anInt5939, Static579.aString106, Static473.aClass140_22, Static72.aLong52);
		if (Static234.anInterface22Array1 == null) {
			return;
		}
		for (@Pc(157) int local157 = Static214.anInt3510 + 1; local157 < Static234.anInterface22Array1.length; local157++) {
			if (Static234.anInterface22Array1[local157].method8467() >= 100 && Static214.anInt3510 == local157 - 1 && Static283.anInt4588 >= 1 && Static449.aClass366_1.method8383()) {
				try {
					Static234.anInterface22Array1[local157].method8471();
				} catch (@Pc(197) Exception local197) {
					Static234.anInterface22Array1 = null;
					return;
				}
				Static449.aClass366_1.method8380(Static234.anInterface22Array1[local157]);
				Static214.anInt3510++;
				if (Static214.anInt3510 >= Static234.anInterface22Array1.length - 1 && Static234.anInterface22Array1.length > 1) {
					Static214.anInt3510 = Static333.aClass281_1.method6283() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)V")
	public static void method9261() {
		if (Static249.anInt4019 > 1) {
			Static249.anInt4019--;
			Static321.anInt5128 = Static642.anInt9625;
		}
		if (Static405.aClass153_2.aBoolean278) {
			Static405.aClass153_2.aBoolean278 = false;
			Static370.method5286();
			return;
		}
		if (!Static400.aBoolean623) {
			Static79.method1578();
		}
		for (@Pc(34) int local34 = 0; local34 < 100 && Static236.method3451(Static405.aClass153_2); local34++) {
		}
		if (Static283.anInt4588 != 11) {
			return;
		}
		@Pc(71) Class2_Sub19 local71;
		@Pc(80) int local80;
		while (Static232.method3400()) {
			local71 = Static293.method4342(Static632.aClass347_110, Static405.aClass153_2.aClass186_1);
			local71.aClass2_Sub21_Sub2_1.method7396(0);
			local80 = local71.aClass2_Sub21_Sub2_1.anInt8412;
			Static437.method5922(local71.aClass2_Sub21_Sub2_1);
			local71.aClass2_Sub21_Sub2_1.method7387(local71.aClass2_Sub21_Sub2_1.anInt8412 - local80);
			Static405.aClass153_2.method3275(local71);
		}
		if (Static211.aClass2_Sub12_3 == null) {
			if (Static675.aLong307 <= Static588.currentTimeMillis()) {
				Static211.aClass2_Sub12_3 = Static151.aClass228_20.method5252(Static344.aClass231_1.address);
			}
		} else if (Static211.aClass2_Sub12_3.anInt1638 != -1) {
			local71 = Static293.method4342(Static50.aClass347_90, Static405.aClass153_2.aClass186_1);
			local71.aClass2_Sub21_Sub2_1.method7380(Static211.aClass2_Sub12_3.anInt1638);
			Static405.aClass153_2.method3275(local71);
			Static211.aClass2_Sub12_3 = null;
			Static675.aLong307 = Static588.currentTimeMillis() + 30000L;
		}
		@Pc(166) Class2_Sub9 local166 = (Class2_Sub9) Static226.aClass341_58.method7706(65280);
		@Pc(181) int local181;
		@Pc(208) int local208;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(288) int local288;
		@Pc(300) int local300;
		@Pc(179) Class2_Sub19 local179;
		if (local166 != null || Static56.aLong38 < Static588.currentTimeMillis() - 2000L) {
			local179 = null;
			local181 = 0;
			for (@Pc(186) Class2_Sub9 local186 = (Class2_Sub9) Static677.aClass341_76.method7706(65280); local186 != null && (local179 == null || local179.aClass2_Sub21_Sub2_1.anInt8412 - local181 < 240); local186 = (Class2_Sub9) Static677.aClass341_76.method7713()) {
				local186.method9464();
				local208 = local186.method5340();
				if (local208 < -1) {
					local208 = -1;
				} else if (local208 > 65534) {
					local208 = 65534;
				}
				local226 = local186.method5338();
				if (local226 < -1) {
					local226 = -1;
				} else if (local226 > 65534) {
					local226 = 65534;
				}
				if (Static172.anInt2899 != local226 || local208 != Static634.anInt9542) {
					if (local179 == null) {
						local179 = Static293.method4342(Static603.aClass347_109, Static405.aClass153_2.aClass186_1);
						local179.aClass2_Sub21_Sub2_1.method7396(0);
						local181 = local179.aClass2_Sub21_Sub2_1.anInt8412;
					}
					local282 = local226 - Static172.anInt2899;
					Static172.anInt2899 = local226;
					local288 = local208 - Static634.anInt9542;
					Static634.anInt9542 = local208;
					local300 = (int) ((local186.method5341() - Static56.aLong38) / 20L);
					if (local300 < 8 && local282 >= -32 && local282 <= 31 && local288 >= -32 && local288 <= 31) {
						local282 += 32;
						local288 += 32;
						local179.aClass2_Sub21_Sub2_1.method7380((local300 << 12) + (local282 << 6) + local288);
					} else if (local300 < 32 && local282 >= -128 && local282 <= 127 && local288 >= -128 && local288 <= 127) {
						local179.aClass2_Sub21_Sub2_1.method7396(local300 + 128);
						local282 += 128;
						local288 += 128;
						local179.aClass2_Sub21_Sub2_1.method7380(local288 + (local282 << 8));
					} else if (local300 >= 32) {
						local179.aClass2_Sub21_Sub2_1.method7380(local300 + 57344);
						if (local226 == 1 || local208 == -1) {
							local179.aClass2_Sub21_Sub2_1.method7349(Integer.MIN_VALUE);
						} else {
							local179.aClass2_Sub21_Sub2_1.method7349(local226 | local208 << 16);
						}
					} else {
						local179.aClass2_Sub21_Sub2_1.method7396(local300 + 192);
						if (local226 == 1 || local208 == -1) {
							local179.aClass2_Sub21_Sub2_1.method7349(Integer.MIN_VALUE);
						} else {
							local179.aClass2_Sub21_Sub2_1.method7349(local208 << 16 | local226);
						}
					}
					Static56.aLong38 = local186.method5341();
				}
			}
			if (local179 != null) {
				local179.aClass2_Sub21_Sub2_1.method7387(local179.aClass2_Sub21_Sub2_1.anInt8412 - local181);
				Static405.aClass153_2.method3275(local179);
			}
		}
		@Pc(541) int local541;
		if (local166 != null) {
			@Pc(527) long local527 = (local166.method5341() - Static180.aLong108) / 50L;
			if (local527 > 32767L) {
				local527 = 32767L;
			}
			Static180.aLong108 = local166.method5341();
			local541 = local166.method5340();
			if (local541 < 0) {
				local541 = 0;
			} else if (local541 > 65535) {
				local541 = 65535;
			}
			local208 = local166.method5338();
			if (local208 < 0) {
				local208 = 0;
			} else if (local208 > 65535) {
				local208 = 65535;
			}
			@Pc(581) byte local581 = 0;
			if (local166.method5335() == 2) {
				local581 = 1;
			}
			local282 = (int) local527;
			@Pc(603) Class2_Sub19 local603 = Static293.method4342(Static111.aClass347_21, Static405.aClass153_2.aClass186_1);
			local603.aClass2_Sub21_Sub2_1.method7377(local581 << 15 | local282);
			local603.aClass2_Sub21_Sub2_1.method7357(local208 | local541 << 16);
			Static405.aClass153_2.method3275(local603);
		}
		@Pc(660) long local660;
		if (Static216.anInt3540 > 0) {
			local179 = Static293.method4342(Static187.aClass347_36, Static405.aClass153_2.aClass186_1);
			local179.aClass2_Sub21_Sub2_1.method7396(Static216.anInt3540 * 3);
			for (local181 = 0; local181 < Static216.anInt3540; local181++) {
				@Pc(652) Interface27 local652 = Static591.anInterface27Array2[local181];
				local660 = (local652.method2665() - Static351.aLong173) / 50L;
				if (local660 > 65535L) {
					local660 = 65535L;
				}
				Static351.aLong173 = local652.method2665();
				local179.aClass2_Sub21_Sub2_1.method7396(local652.method2664());
				local179.aClass2_Sub21_Sub2_1.method7380((int) local660);
			}
			Static405.aClass153_2.method3275(local179);
		}
		if (Static232.anInt3774 > 0) {
			Static232.anInt3774--;
		}
		if (Static273.aBoolean339 && Static232.anInt3774 <= 0) {
			Static273.aBoolean339 = false;
			Static232.anInt3774 = 20;
			local179 = Static293.method4342(Static235.aClass347_47, Static405.aClass153_2.aClass186_1);
			local179.aClass2_Sub21_Sub2_1.method7380((int) Static479.aFloat123 >> 3);
			local179.aClass2_Sub21_Sub2_1.method7380((int) Static171.aFloat64 >> 3);
			Static405.aClass153_2.method3275(local179);
		}
		if (GameShell.focus != Static50.aBoolean565) {
			Static50.aBoolean565 = GameShell.focus;
			local179 = Static293.method4342(Static621.aClass347_113, Static405.aClass153_2.aClass186_1);
			local179.aClass2_Sub21_Sub2_1.method7396(GameShell.focus ? 1 : 0);
			Static405.aClass153_2.method3275(local179);
		}
		if (!Static503.aBoolean578) {
			local179 = Static293.method4342(Static600.aClass347_108, Static405.aClass153_2.aClass186_1);
			local179.aClass2_Sub21_Sub2_1.method7396(0);
			local181 = local179.aClass2_Sub21_Sub2_1.anInt8412;
			@Pc(810) Class2_Sub21 local810 = Static400.aClass2_Sub34_28.method5117();
			local179.aClass2_Sub21_Sub2_1.method7393(local810.anInt8412, local810.aByteArray93, 0);
			local179.aClass2_Sub21_Sub2_1.method7387(local179.aClass2_Sub21_Sub2_1.anInt8412 - local181);
			Static405.aClass153_2.method3275(local179);
			Static503.aBoolean578 = true;
		}
		if (Static334.aClass293ArrayArrayArray1 != null) {
			if (Static511.anInt7668 == 2) {
				Static592.method7768();
			} else if (Static511.anInt7668 == 3) {
				Static583.method7666();
			}
		}
		if (Static494.aBoolean563) {
			Static494.aBoolean563 = false;
		} else {
			Static288.aFloat83 /= 2.0F;
		}
		if (Static15.aBoolean17) {
			Static15.aBoolean17 = false;
		} else {
			Static552.aFloat207 /= 2.0F;
		}
		Static630.method8365();
		if (Static283.anInt4588 != 11) {
			return;
		}
		Static159.method2575();
		Static271.method3930();
		Static35.method918();
		Static405.aClass153_2.anInt3656++;
		if (Static405.aClass153_2.anInt3656 > 750) {
			Static370.method5286();
			return;
		}
		if (Static1.anInt10827 == 0) {
			Static82.method1593();
			Static13.method158();
		} else {
			if (Static1.anInt10827 == 1 && Static360.method5237(Static717.anInt10846)) {
				Static266.method6781();
				Static1.anInt10827 = 2;
			}
			if (Static1.anInt10827 == 2 && Static283.anInt4588 != 12) {
				Static25.aClass28_4.method737();
				Static440.anInt6700 = 0;
				Static607.anInt9277 = client.cycle;
				Static1.anInt10827 = 3;
				Static457.method6238();
			}
			if (Static1.anInt10827 == 3) {
				local80 = client.cycle - Static607.anInt9277;
				if (Static401.aClass39Array1.length > Static440.anInt6700) {
					do {
						@Pc(982) Class39 local982 = Static401.aClass39Array1[Static440.anInt6700];
						if (local982.anInt10581 > local80) {
							break;
						}
						local982.method9168();
					} while (Static1.anInt10827 == 3 && ++Static440.anInt6700 < Static401.aClass39Array1.length);
				}
				if (Static1.anInt10827 == 3) {
					for (local181 = 0; local181 < Static219.aClass238Array1.length; local181++) {
						@Pc(1027) Class238 local1027 = Static219.aClass238Array1[local181];
						if (local1027.aBoolean455) {
							@Pc(1034) Class8_Sub2_Sub1_Sub2 local1034 = local1027.method5370();
							Static489.method6554(true, local1034);
						}
					}
				}
			}
		}
		Static90.method1733();
		if (!Static288.aBoolean356) {
			Static598.method7834();
			Static288.aBoolean356 = true;
		}
		for (local80 = Static34.aClass306_1.method6879(true); local80 != -1; local80 = Static34.aClass306_1.method6879(false)) {
			Static36.method977(local80, (byte) 108);
			Static142.anIntArray225[Static635.anInt9551++ & 0x1F] = local80;
		}
		for (@Pc(1099) Class2_Sub2_Sub2 local1099 = Static81.method1587(); local1099 != null; local1099 = Static81.method1587()) {
			local541 = local1099.method203();
			local660 = local1099.method204();
			if (local541 == 1) {
				Static511.anIntArray614[(int) local660] = local1099.anInt197;
				Static624.aBoolean728 |= Static118.aBooleanArray4[(int) local660];
				Static278.anIntArray350[Static52.anInt1069++ & 0x1F] = (int) local660;
			} else if (local541 == 2) {
				Static37.aStringArray4[(int) local660] = local1099.aString1;
				Static268.anIntArray332[Static455.anInt6938++ & 0x1F] = (int) local660;
			} else {
				@Pc(1143) Class158 local1143;
				if (local541 == 3) {
					local1143 = Static145.method2412((int) local660);
					if (!local1099.aString1.equals(local1143.aString44)) {
						local1143.aString44 = local1099.aString1;
						Static178.method2729(local1143);
					}
				} else {
					@Pc(1739) int local1739;
					if (local541 == 4) {
						local1143 = Static145.method2412((int) local660);
						local288 = local1099.anInt197;
						local300 = local1099.anInt195;
						local1739 = local1099.anInt192;
						if (local288 != local1143.anInt3834 || local300 != local1143.anInt3842 || local1739 != local1143.anInt3748) {
							local1143.anInt3748 = local1739;
							local1143.anInt3834 = local288;
							local1143.anInt3842 = local300;
							Static178.method2729(local1143);
						}
					} else if (local541 == 5) {
						local1143 = Static145.method2412((int) local660);
						if (local1143.anInt3799 != local1099.anInt197) {
							if (local1099.anInt197 == -1) {
								local1143.aClass152_6 = null;
							} else {
								if (local1143.aClass152_6 == null) {
									local1143.aClass152_6 = new Class152_Sub1();
								}
								local1143.aClass152_6.method9120(true, local1099.anInt197);
							}
							local1143.anInt3799 = local1099.anInt197;
							Static178.method2729(local1143);
						}
					} else if (local541 == 6) {
						local282 = local1099.anInt197;
						local288 = local282 >> 10 & 0x1F;
						local300 = local282 >> 5 & 0x1F;
						local1739 = local282 & 0x1F;
						@Pc(1751) int local1751 = (local300 << 11) + (local288 << 19) + (local1739 << 3);
						@Pc(1756) Class158 local1756 = Static145.method2412((int) local660);
						if (local1756.anInt3789 != local1751) {
							local1756.anInt3789 = local1751;
							Static178.method2729(local1756);
						}
					} else if (local541 == 7) {
						local1143 = Static145.method2412((int) local660);
						@Pc(1701) boolean local1701 = local1099.anInt197 == 1;
						if (local1701 != local1143.aBoolean284) {
							local1143.aBoolean284 = local1701;
							Static178.method2729(local1143);
						}
					} else if (local541 == 8) {
						local1143 = Static145.method2412((int) local660);
						if (local1099.anInt197 != local1143.anInt3818 || local1099.anInt195 != local1143.anInt3822 || local1143.anInt3804 != local1099.anInt192) {
							local1143.anInt3818 = local1099.anInt197;
							local1143.anInt3822 = local1099.anInt195;
							local1143.anInt3804 = local1099.anInt192;
							if (local1143.anInt3770 != -1) {
								if (local1143.anInt3811 > 0) {
									local1143.anInt3804 = local1143.anInt3804 * 32 / local1143.anInt3811;
								} else if (local1143.anInt3754 > 0) {
									local1143.anInt3804 = local1143.anInt3804 * 32 / local1143.anInt3754;
								}
							}
							Static178.method2729(local1143);
						}
					} else if (local541 == 9) {
						local1143 = Static145.method2412((int) local660);
						if (local1099.anInt197 != local1143.anInt3770 || local1099.anInt195 != local1143.anInt3828) {
							local1143.anInt3828 = local1099.anInt195;
							local1143.anInt3770 = local1099.anInt197;
							Static178.method2729(local1143);
						}
					} else if (local541 == 10) {
						local1143 = Static145.method2412((int) local660);
						if (local1099.anInt197 != local1143.anInt3746 || local1143.anInt3815 != local1099.anInt195 || local1099.anInt192 != local1143.anInt3747) {
							local1143.anInt3746 = local1099.anInt197;
							local1143.anInt3815 = local1099.anInt195;
							local1143.anInt3747 = local1099.anInt192;
							Static178.method2729(local1143);
						}
					} else if (local541 == 11) {
						local1143 = Static145.method2412((int) local660);
						local1143.aByte64 = 0;
						local1143.anInt3794 = local1143.anInt3819 = local1099.anInt195;
						local1143.anInt3745 = local1143.anInt3837 = local1099.anInt197;
						local1143.aByte61 = 0;
						Static178.method2729(local1143);
					} else if (local541 == 12) {
						local1143 = Static145.method2412((int) local660);
						local288 = local1099.anInt197;
						if (local1143 != null && local1143.anInt3831 == 0) {
							if (local288 > local1143.anInt3752 - local1143.anInt3756) {
								local288 = local1143.anInt3752 - local1143.anInt3756;
							}
							if (local288 < 0) {
								local288 = 0;
							}
							if (local1143.anInt3778 != local288) {
								local1143.anInt3778 = local288;
								Static178.method2729(local1143);
							}
						}
					} else if (local541 == 14) {
						local1143 = Static145.method2412((int) local660);
						local1143.anInt3821 = local1099.anInt197;
					} else if (local541 == 15) {
						Static212.anInt3476 = local1099.anInt195;
						Static266.aBoolean583 = true;
						Static675.anInt10184 = local1099.anInt197;
					} else if (local541 == 16) {
						local1143 = Static145.method2412((int) local660);
						local1143.anInt3791 = local1099.anInt197;
					} else if (local541 == 20) {
						local1143 = Static145.method2412((int) local660);
						local1143.aBoolean299 = local1099.anInt197 == 1;
					} else if (local541 == 21) {
						local1143 = Static145.method2412((int) local660);
						local1143.aBoolean295 = local1099.anInt197 == 1;
					} else if (local541 == 17) {
						local1143 = Static145.method2412((int) local660);
						local1143.anInt3755 = local1099.anInt197;
					} else if (local541 == 18) {
						local1143 = Static145.method2412((int) local660);
						local288 = (int) (local660 >> 32);
						local1143.method3406((short) local1099.anInt195, local288, (short) local1099.anInt197);
					} else if (local541 == 19) {
						local1143 = Static145.method2412((int) local660);
						local288 = (int) (local660 >> 32);
						local1143.method3388((short) local1099.anInt197, local288, (short) local1099.anInt195);
					}
				}
			}
		}
		Static35.anInt803++;
		if (Static616.anInt9443 != 0) {
			Static481.anInt7236 += 20;
			if (Static481.anInt7236 >= 400) {
				Static616.anInt9443 = 0;
			}
		}
		if (Static67.aClass158_10 != null) {
			Static499.anInt7524++;
			if (Static499.anInt7524 >= 15) {
				Static178.method2729(Static67.aClass158_10);
				Static67.aClass158_10 = null;
			}
		}
		Static210.aClass158_4 = null;
		Static343.aBoolean428 = false;
		Static702.aBoolean798 = false;
		Static327.aClass158_7 = null;
		Static65.method1473(-1, -1, null);
		if (!Static156.aBoolean223) {
			Static442.anInt6719 = -1;
		}
		Static443.method5988();
		Static642.anInt9625++;
		if (Static118.aBoolean199) {
			@Pc(1980) Class2_Sub19 local1980 = Static293.method4342(Static133.aClass347_26, Static405.aClass153_2.aClass186_1);
			local1980.aClass2_Sub21_Sub2_1.method7354(Static614.anInt9399 | Static688.anInt10384 << 28 | Static503.anInt7605 << 14);
			Static405.aClass153_2.method3275(local1980);
			Static118.aBoolean199 = false;
		}
		while (true) {
			@Pc(2006) Class2_Sub42 local2006;
			@Pc(2026) Class158 local2026;
			@Pc(2011) Class158 local2011;
			do {
				local2006 = (Class2_Sub42) Static618.aClass341_68.method7712();
				if (local2006 == null) {
					while (true) {
						do {
							local2006 = (Class2_Sub42) Static59.aClass341_33.method7712();
							if (local2006 == null) {
								while (true) {
									do {
										local2006 = (Class2_Sub42) Static521.aClass341_44.method7712();
										if (local2006 == null) {
											if (Static210.aClass158_4 == null) {
												Static460.anInt6985 = 0;
											}
											if (Static109.aClass158_3 != null) {
												Static603.method7906();
											}
											if (Static608.anInt9316 > 0 && Static334.aClass321_1.method8486(82) && Static334.aClass321_1.method8486(81) && Static611.anInt9367 != 0) {
												local541 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 - Static611.anInt9367;
												if (local541 < 0) {
													local541 = 0;
												} else if (local541 > 3) {
													local541 = 3;
												}
												Static624.method8338(local541, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0] + Static116.anInt2279, Static691.anInt10395 - -Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0]);
											}
											Static320.method4605();
											for (local541 = 0; local541 < 5; local541++) {
												@Pc(2246) int local2246 = Static194.anIntArray268[local541]++;
											}
											if (Static624.aBoolean728 && Static98.aLong71 < Static588.currentTimeMillis() - 60000L) {
												Static266.method6784();
											}
											for (@Pc(2281) Class8_Sub4_Sub1 local2281 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2790(); local2281 != null; local2281 = (Class8_Sub4_Sub1) Static168.aClass130_5.method2785()) {
												if (Static588.currentTimeMillis() / 1000L - 5L > (long) local2281.anInt6453) {
													if (local2281.aShort74 > 0) {
														Static44.method1072(local2281.aString72 + Static32.aClass32_19.method877(client.lang), "", 0, "", "", 5);
													}
													if (local2281.aShort74 == 0) {
														Static44.method1072(local2281.aString72 + Static32.aClass32_20.method877(client.lang), "", 0, "", "", 5);
													}
													local2281.method9281();
												}
											}
											Static392.anInt6163++;
											if (Static392.anInt6163 > 500) {
												Static392.anInt6163 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x2) == 2) {
													Static145.anInt2570 += Static374.anInt5926;
												}
												if ((local226 & 0x1) == 1) {
													Static508.anInt7650 += Static555.anInt8328;
												}
												if ((local226 & 0x4) == 4) {
													Static288.anInt4635 += anInt10697;
												}
											}
											if (Static508.anInt7650 < -50) {
												Static555.anInt8328 = 2;
											}
											if (Static508.anInt7650 > 50) {
												Static555.anInt8328 = -2;
											}
											if (Static145.anInt2570 < -55) {
												Static374.anInt5926 = 2;
											}
											if (Static288.anInt4635 < -40) {
												anInt10697 = 1;
											}
											if (Static145.anInt2570 > 55) {
												Static374.anInt5926 = -2;
											}
											Static439.anInt6695++;
											if (Static288.anInt4635 > 40) {
												anInt10697 = -1;
											}
											if (Static439.anInt6695 > 500) {
												Static439.anInt6695 = 0;
												local226 = (int) (Math.random() * 8.0D);
												if ((local226 & 0x1) == 1) {
													Static29.anInt726 += Static653.anInt9744;
												}
												if ((local226 & 0x2) == 2) {
													Static660.anInt9861 += Static171.anInt2896;
												}
											}
											if (Static29.anInt726 < -60) {
												Static653.anInt9744 = 2;
											}
											if (Static29.anInt726 > 60) {
												Static653.anInt9744 = -2;
											}
											if (Static660.anInt9861 < -20) {
												Static171.anInt2896 = 1;
											}
											Static405.aClass153_2.anInt3657++;
											if (Static660.anInt9861 > 10) {
												Static171.anInt2896 = -1;
											}
											if (Static405.aClass153_2.anInt3657 > 50) {
												@Pc(2571) Class2_Sub19 local2571 = Static293.method4342(Static415.aClass347_75, Static405.aClass153_2.aClass186_1);
												Static405.aClass153_2.method3275(local2571);
											}
											if (Static252.aBoolean316) {
												Static143.method3571();
												Static252.aBoolean316 = false;
											}
											try {
												Static405.aClass153_2.method3273();
												return;
											} catch (@Pc(2588) IOException local2588) {
												Static370.method5286();
												return;
											}
										}
										local2011 = local2006.aClass158_14;
										if (local2011.anInt3751 < 0) {
											break;
										}
										local2026 = Static145.method2412(local2011.anInt3753);
									} while (local2026 == null || local2026.aClass158Array2 == null || local2026.aClass158Array2.length <= local2011.anInt3751 || local2011 != local2026.aClass158Array2[local2011.anInt3751]);
									Static472.method6427(local2006);
								}
							}
							local2011 = local2006.aClass158_14;
							if (local2011.anInt3751 < 0) {
								break;
							}
							local2026 = Static145.method2412(local2011.anInt3753);
						} while (local2026 == null || local2026.aClass158Array2 == null || local2011.anInt3751 >= local2026.aClass158Array2.length || local2026.aClass158Array2[local2011.anInt3751] != local2011);
						Static472.method6427(local2006);
					}
				}
				local2011 = local2006.aClass158_14;
				if (local2011.anInt3751 < 0) {
					break;
				}
				local2026 = Static145.method2412(local2011.anInt3753);
			} while (local2026 == null || local2026.aClass158Array2 == null || local2026.aClass158Array2.length <= local2011.anInt3751 || local2026.aClass158Array2[local2011.anInt3751] != local2011);
			Static472.method6427(local2006);
		}
	}
}
