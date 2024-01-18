import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	public static int anInt7063;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method6329(@OriginalArg(0) Class8_Sub2_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class8_Sub2_Sub1_Sub2_Sub2) {
			@Pc(5) Class8_Sub2_Sub1_Sub2_Sub2 local5 = (Class8_Sub2_Sub1_Sub2_Sub2) arg0;
			if (local5.aClass270_1 != null) {
				Static651.method8524(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 != local5.aByte144, local5);
			}
		} else if (arg0 instanceof Class8_Sub2_Sub1_Sub2_Sub1) {
			@Pc(33) Class8_Sub2_Sub1_Sub2_Sub1 local33 = (Class8_Sub2_Sub1_Sub2_Sub1) arg0;
			Static414.method5703(local33.aByte144 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, local33);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)I")
	public static int method6330() {
		if ((double) Static30.aFloat106 == 3.0D) {
			return 37;
		} else if ((double) Static30.aFloat106 == 4.0D) {
			return 50;
		} else if ((double) Static30.aFloat106 == 6.0D) {
			return 75;
		} else if ((double) Static30.aFloat106 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BIIII[I[III[IZZI[I[[[B[III)V")
	public static void method6331(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) boolean arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) byte[][][] arg13, @OriginalArg(15) int[] arg14, @OriginalArg(16) int arg15) {
		if (Static448.anInt6817 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static74.aClass19_4.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static448.anInt6817 == 1) {
			local33 = (int) ((double) Static281.anInt4580 * (double) local29 / (double) Static576.anInt8609);
			local31 = (int) ((double) Static281.anInt4580 * (double) local25 / (double) Static576.anInt8609);
		}
		if (!Static75.aBoolean521) {
			if (Static448.anInt6817 == 1) {
				Static694.method9038();
			}
			@Pc(76) int local76 = arg1 - Static354.anInt5783;
			@Pc(81) int local81 = arg3 - Static149.anInt2632;
			@Pc(86) int local86 = arg2 - Static9.anInt121;
			@Pc(108) int local108 = (int) ((Static364.aDouble17 * (double) local86 + Static398.aDouble20 * (double) local81 + Static683.aDouble24 * (double) local76) * (double) local31 / (double) arg11);
			@Pc(130) int local130 = (int) (((double) local86 * Static614.aDouble22 + (double) local81 * Static118.aDouble11 + (double) local76 * Static98.aDouble9) * (double) local33 / (double) arg11);
			@Pc(145) double local145 = Static177.aDouble12 * (double) local76 + (double) local81 * Static309.aDouble16 + Static534.aDouble21 * (double) local86;
			@Pc(152) int local152 = local108 + Static321.anInt5130 - Static601.anInt8911;
			@Pc(159) int local159 = local130 + Static702.anInt10597 - Static587.anInt8712;
			@Pc(163) int local163 = local152 + Static252.anInt4089;
			@Pc(167) int local167 = Static281.anInt4580 + local159;
			if (local152 >= 0 && local159 >= 0 && Static571.anInt8558 >= local163 && local167 <= Static576.anInt8609 || Static448.anInt6817 == 2) {
				if (Static448.anInt6817 == 2) {
					Static643.aDouble23 = -local145;
				}
				Static312.anInt5018 = local159;
				Static2.anInt45 = local152;
			} else if (local163 > 0 && local167 > 0 && Static571.anInt8558 > local152 && Static576.anInt8609 > local159) {
				@Pc(244) int local244 = local152 - Static321.anInt5130;
				@Pc(248) int local248 = local159 - Static702.anInt10597;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) double local258 = 0.0D;
				if (Static448.anInt6817 == 0) {
					local250 = local244;
					local252 = local248;
					local258 = local145 + Static643.aDouble23;
				} else if (Static448.anInt6817 == 1) {
					local256 = local248 / Static714.anInt10831;
					local254 = local244 / Static437.anInt6648;
					local252 = local256 * Static714.anInt10831;
					local250 = Static437.anInt6648 * local254;
					local258 = (double) (local244 * local250 + local252 * local248) * (local145 + Static643.aDouble23) / (double) (local248 * local248 + local244 * local244);
				}
				local258 = -local258;
				@Pc(319) int local319 = 0;
				@Pc(321) int local321 = 0;
				@Pc(323) int local323 = 0;
				@Pc(325) int local325 = 0;
				@Pc(327) int local327 = 0;
				@Pc(329) int local329 = 0;
				@Pc(340) int local340;
				@Pc(338) int local338;
				@Pc(344) int local344;
				@Pc(342) int local342;
				if (local250 >= 0) {
					local338 = Static571.anInt8558 - local250;
					local340 = 0;
					local342 = local250;
					local344 = local338;
					if (Static448.anInt6817 == 1) {
						local327 = local254;
						local323 = Static211.anInt5594 - local254;
					}
				} else {
					local340 = -local250;
					local338 = local250 + Static571.anInt8558;
					local344 = 0;
					local342 = local340;
					if (Static448.anInt6817 == 1) {
						local323 = 0;
						local327 = -local254;
					}
				}
				@Pc(386) int local386;
				@Pc(393) int local393;
				@Pc(388) int local388;
				@Pc(395) int local395;
				@Pc(397) int local397;
				if (local252 < 0) {
					local386 = -local252;
					local388 = 0;
					local393 = Static576.anInt8609 + local252;
					local395 = local386;
					local397 = local386;
					if (Static448.anInt6817 == 1) {
						local319 = 0;
						local321 = -local256;
						local325 = local321;
						local329 = Static617.anInt9460 + local256;
					}
				} else {
					local393 = Static576.anInt8609 - local252;
					local386 = 0;
					if (Static448.anInt6817 == 1) {
						local325 = 0;
						local321 = local256;
						local319 = Static617.anInt9460 - local256;
						local329 = local319;
					}
					local397 = 0;
					local395 = local252;
					local388 = local393;
				}
				@Pc(451) Class130 local451 = Static10.aClass215_1.aClass130_8;
				@Pc(465) int local465;
				for (@Pc(456) Class8_Sub7 local456 = (Class8_Sub7) local451.method2790(); local456 != null; local456 = (Class8_Sub7) local451.method2785()) {
					@Pc(461) Class8_Sub6[] local461 = local456.aClass8_Sub6Array1;
					@Pc(463) boolean local463 = true;
					for (local465 = 0; local465 < local461.length; local465++) {
						@Pc(471) Class8_Sub6 local471 = local461[local465];
						@Pc(474) int local474 = local471.anInt4518;
						@Pc(477) int local477 = local471.anInt4519;
						@Pc(480) int local480 = local471.anInt4515;
						@Pc(483) int local483 = local471.anInt4517;
						@Pc(486) int local486 = local471.anInt4516;
						@Pc(493) int local493;
						local471.anInt4519 = local493 = local477 - local252;
						@Pc(501) int local501;
						local471.anInt4517 = local501 = local483 - local252;
						@Pc(509) int local509;
						local471.anInt4518 = local509 = local474 - local250;
						@Pc(517) int local517;
						local471.anInt4515 = local517 = local480 - local250;
						if (local463) {
							@Pc(537) int local537 = (local509 >= local517 ? local517 : local509) - local486;
							if (Static571.anInt8558 >= local537) {
								@Pc(557) int local557 = (local493 < local501 ? local493 : local501) - local486;
								if (local557 <= Static576.anInt8609) {
									@Pc(573) int local573 = (local509 < local517 ? local517 : local509) + local486;
									if (local573 >= 0) {
										@Pc(592) int local592 = (local493 >= local501 ? local493 : local501) + local486;
										if (local592 >= 0) {
											local463 = false;
										}
									}
								}
							}
						}
					}
					if (local463) {
						local456.method9281();
						Static281.method4092(local456);
					}
				}
				if (Static448.anInt6817 == 0) {
					Static74.aClass19_4.method7946(Static450.anInterface9_1);
				}
				Static74.aClass19_4.F(-local250, -local252);
				Static74.aClass19_4.b(local340, local386, local338, local393, local258);
				Static278.method4068(Static643.aDouble23 + local258);
				Static246.aDouble13 = local258 + Static643.aDouble23;
				if (Static448.anInt6817 == 1) {
					Static391.anInt6154 = local21 - Static587.anInt8712 - local252;
					Static434.anInt6585 = local31;
					Static646.anInt9647 = local33;
					Static354.anInt5779 = local17 - local250 - Static601.anInt8911;
					Static74.aClass19_4.DA(Static354.anInt5779, Static391.anInt6154, Static434.anInt6585, Static646.anInt9647);
				} else {
					Static646.anInt9647 = local33;
					Static391.anInt6154 = local21 + Static702.anInt10597 - local252 - Static587.anInt8712;
					Static354.anInt5779 = Static321.anInt5130 + local17 - local250 - Static601.anInt8911;
					Static434.anInt6585 = local31;
					Static74.aClass19_4.DA(Static354.anInt5779, Static391.anInt6154, Static434.anInt6585, Static646.anInt9647);
				}
				Static119.method2170(Static10.aClass215_1);
				if (local395 > 0) {
					Static74.aClass19_4.KA(0, local388, Static571.anInt8558, local388 + local395);
					Static74.aClass19_4.ya();
					Static74.aClass19_4.GA(Static551.anInt8312);
					Static283.method4100(arg7, arg1, arg3, arg2, arg13, arg9, arg12, arg5, arg14, arg6, arg8, arg0, arg15, arg4, arg10, arg11, 1, false);
				}
				if (local342 > 0) {
					Static74.aClass19_4.KA(local344, local397, local342 + local344, local393 + local397);
					Static74.aClass19_4.ya();
					Static74.aClass19_4.GA(Static551.anInt8312);
					Static283.method4100(arg7, arg1, arg3, arg2, arg13, arg9, arg12, arg5, arg14, arg6, arg8, arg0, arg15, arg4, arg10, arg11, 1, false);
				}
				Static74.aClass19_4.la();
				Static102.method2021();
				if (Static448.anInt6817 == 0) {
					Static74.aClass19_4.method7950();
				}
				Static587.anInt8712 += local252;
				Static601.anInt8911 += local250;
				Static643.aDouble23 += local258;
				Static312.anInt5018 = Static702.anInt10597 + local130 - Static587.anInt8712;
				Static2.anInt45 = local108 + Static321.anInt5130 - Static601.anInt8911;
				if (Static448.anInt6817 == 1) {
					Static632.anInt9529 += local254;
					Static482.anInt7286 += local256;
					for (@Pc(855) int local855 = 0; local855 < Static617.anInt9460; local855++) {
						@Pc(868) int local868 = Static719.method9125(Static482.anInt7286 + local855, Static617.anInt9460) * Static211.anInt5594;
						for (local465 = 0; local465 < Static211.anInt5594; local465++) {
							@Pc(881) int local881 = Static719.method9125(local465 + Static632.anInt9529, Static211.anInt5594) + local868;
							@Pc(936) boolean local936 = local855 >= local319 && local855 < local319 + local321 || local325 <= local855 && local855 < local329 + local325 && local465 >= local323 && local465 < local327 + local323;
							Static651.anInterface9Array1[local881].method9046(local465 * Static437.anInt6648, Static714.anInt10831 * local855, Static437.anInt6648, Static714.anInt10831, local936);
						}
					}
				}
			} else {
				Static75.aBoolean521 = true;
			}
		}
		if (Static75.aBoolean521) {
			Static354.anInt5783 = arg1;
			Static601.anInt8911 = 0;
			Static9.anInt121 = arg2;
			Static643.aDouble23 = 0.0D;
			Static2.anInt45 = Static321.anInt5130;
			Static149.anInt2632 = arg3;
			Static587.anInt8712 = 0;
			Static312.anInt5018 = Static702.anInt10597;
			if (Static448.anInt6817 == 0) {
				Static74.aClass19_4.method7946(Static450.anInterface9_1);
			}
			Static74.aClass19_4.la();
			Static74.aClass19_4.ya();
			Static74.aClass19_4.GA(Static551.anInt8312);
			Static420.aClass73_7.method7142(Static354.anInt5783, Static149.anInt2632, Static9.anInt121, Static693.anInt10410, Static138.anInt2521, Static49.anInt1049);
			Static74.aClass19_4.method8007(Static420.aClass73_7);
			if (Static448.anInt6817 == 1) {
				Static354.anInt5779 = local17;
				Static391.anInt6154 = local21;
				Static434.anInt6585 = local31;
				Static646.anInt9647 = local33;
				Static74.aClass19_4.DA(Static354.anInt5779, Static391.anInt6154, Static434.anInt6585, Static646.anInt9647);
			} else {
				Static354.anInt5779 = Static321.anInt5130 + local17;
				Static434.anInt6585 = local31;
				Static646.anInt9647 = local33;
				Static391.anInt6154 = local21 + Static702.anInt10597;
				Static74.aClass19_4.DA(Static354.anInt5779, Static391.anInt6154, Static434.anInt6585, Static646.anInt9647);
			}
			Static246.aDouble13 = 0.0D;
			Static10.aClass215_1.method5017();
			Static119.method2170(Static10.aClass215_1);
			Static283.method4100(arg7, arg1, arg3, arg2, arg13, arg9, arg12, arg5, arg14, arg6, arg8, arg0, arg15, arg4, arg10, arg11, 1, false);
			Static102.method2021();
			Static75.aBoolean521 = false;
			if (Static448.anInt6817 == 0) {
				Static74.aClass19_4.method7950();
			}
			if (Static448.anInt6817 == 1) {
				Static181.method2781();
			}
		}
		if (Static448.anInt6817 == 0) {
			Static450.anInterface9_1.method9047(Static2.anInt45, Static312.anInt5018, Static252.anInt4089, Static281.anInt4580, 0, 0);
		}
		Static420.anInt6456++;
		Static278.method4068(Static643.aDouble23);
		Static294.aDouble15 = Static643.aDouble23;
		if (Static448.anInt6817 == 0 || Static448.anInt6817 == 2) {
			if (Static448.anInt6817 == 2) {
				Static74.aClass19_4.GA(Static551.anInt8312);
				Static74.aClass19_4.ya();
			}
			Static46.anInt1005 = local31;
			Static524.anInt8066 = local21 + Static702.anInt10597 - Static312.anInt5018 - Static587.anInt8712;
			Static213.anInt3479 = local17 + Static321.anInt5130 - Static2.anInt45 - Static601.anInt8911;
			Static246.anInt3997 = local33;
			Static74.aClass19_4.DA(Static213.anInt3479, Static524.anInt8066, Static46.anInt1005, Static246.anInt3997);
		} else if (Static448.anInt6817 == 1) {
			Static46.anInt1005 = local31;
			Static213.anInt3479 = local17 - Static601.anInt8911;
			Static524.anInt8066 = local21 - Static587.anInt8712;
			Static246.anInt3997 = local33;
			Static74.aClass19_4.DA(Static213.anInt3479, Static524.anInt8066, Static46.anInt1005, Static246.anInt3997);
			Static74.aClass19_4.KA(Static2.anInt45, Static312.anInt5018, Static2.anInt45 + Static252.anInt4089, Static281.anInt4580 + Static312.anInt5018);
		}
		Static283.method4100(arg7, arg1, arg3, arg2, arg13, arg9, arg12, arg5, arg14, arg6, arg8, arg0, arg15, arg4, arg10, arg11, Static448.anInt6817 == 2 ? 0 : 2, Static448.anInt6817 == 1);
		Static74.aClass19_4.la();
		Static74.aClass19_4.DA(local17, local21, local25, local29);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(Z)V")
	public static void method6332() {
		@Pc(8) Class2_Sub21_Sub2 local8 = Static405.aClass153_2.aClass2_Sub21_Sub2_2;
		@Pc(12) int local12 = local8.method7389();
		@Pc(16) int local16 = local8.method7403();
		@Pc(28) boolean local28 = local8.method7383() == 1;
		Static117.anInt2291 = local8.method7383();
		@Pc(36) int local36 = local8.method7379();
		Static165.method2607();
		Static342.method4472(local16);
		local8.method7424();
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static720.anInt10888 >> 3; local50++) {
				for (local54 = 0; local54 < Static501.anInt7591 >> 3; local54++) {
					local61 = local8.method7419(1);
					if (local61 == 1) {
						Static623.anIntArrayArrayArray19[local46][local50][local54] = local8.method7419(26);
					} else {
						Static623.anIntArrayArrayArray19[local46][local50][local54] = -1;
					}
				}
			}
		}
		local8.method7418();
		local50 = (Static405.aClass153_2.anInt3658 - local8.anInt8412) / 16;
		Static22.anIntArrayArray11 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static22.anIntArrayArray11[local54][local61] = local8.method7356();
			}
		}
		Static118.aByteArrayArray3 = new byte[local50][];
		Static177.aByteArrayArray5 = new byte[local50][];
		Static266.locGroupIds = new int[local50];
		Static376.anIntArray458 = null;
		Static89.anIntArray169 = new int[local50];
		Static298.underwaterLocGroupIds = new int[local50];
		Static421.aByteArrayArray19 = new byte[local50][];
		if (false) {
			return;
		}
		Static267.mapGroupIds = new int[local50];
		Static319.aByteArrayArray16 = new byte[local50][];
		Static363.aByteArrayArray22 = null;
		Static68.underwaterMapGroupIds = new int[local50];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(221) int local221 = 0; local221 < Static720.anInt10888 >> 3; local221++) {
				for (@Pc(225) int local225 = 0; local225 < Static501.anInt7591 >> 3; local225++) {
					@Pc(235) int local235 = Static623.anIntArrayArrayArray19[local61][local221][local225];
					if (local235 != -1) {
						@Pc(245) int local245 = local235 >> 14 & 0x3FF;
						@Pc(251) int local251 = local235 >> 3 & 0x7FF;
						@Pc(261) int local261 = local251 / 8 + (local245 / 8 << 8);
						for (@Pc(263) int local263 = 0; local263 < local50; local263++) {
							if (Static89.anIntArray169[local263] == local261) {
								local261 = -1;
								break;
							}
						}
						if (local261 != -1) {
							Static89.anIntArray169[local50] = local261;
							@Pc(299) int local299 = local261 >> 8 & 0xFF;
							@Pc(303) int local303 = local261 & 0xFF;
							Static267.mapGroupIds[local50] = client.js5Archive5.getGroupId("m" + local299 + "_" + local303);
							Static266.locGroupIds[local50] = client.js5Archive5.getGroupId("l" + local299 + "_" + local303);
							Static68.underwaterMapGroupIds[local50] = client.js5Archive5.getGroupId("um" + local299 + "_" + local303);
							Static298.underwaterLocGroupIds[local50] = client.js5Archive5.getGroupId("ul" + local299 + "_" + local303);
							local50++;
						}
					}
				}
			}
		}
		Static684.method8938(local28, local36, 12, local12);
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)Z")
	public static boolean method6333(@OriginalArg(0) int arg0) {
		return arg0 == 20 || arg0 == 18 || arg0 == 1002 || arg0 == 12 || arg0 == 10;
	}
}
