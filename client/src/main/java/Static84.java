import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
	public static int anInt1783;

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "Ljava/lang/Class;")
	public static Class aClass5;

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "Lclient!pc;")
	public static final Class289 aClass289_6 = new Class289(11, 8);

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_36 = new Class227(28, 4);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1652() {
		@Pc(1) int local1 = Static338.anInt5584;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(9) int local9;
		if (Static1.anInt10827 == 3) {
			local9 = Static219.aClass238Array1.length;
		} else {
			local9 = Static353.aBoolean735 ? local1 : local1 + Static390.anInt6146;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class8_Sub2_Sub1_Sub2 local36;
			if (Static1.anInt10827 == 3) {
				@Pc(29) Class238 local29 = Static219.aClass238Array1[local21];
				if (!local29.aBoolean455) {
					continue;
				}
				local36 = local29.method5370();
			} else {
				if (local21 < local1) {
					local36 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local21]];
				} else {
					local36 = ((Class2_Sub45) Static18.aClass28_2.method738(Static103.anIntArray187[local21 - local1])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
				if (local36.anInt10767 < 0) {
					continue;
				}
			}
			@Pc(68) int local68 = local36.method9309((byte) 81);
			if ((local68 & 0x1) == 0) {
				if ((local36.anInt10718 & 0x1FF) == 0 && (local36.anInt10722 & 0x1FF) == 0) {
					continue;
				}
			} else if ((local36.anInt10718 & 0x1FF) == 256 && (local36.anInt10722 & 0x1FF) == 256) {
				continue;
			}
			local36.anInt10719 = Static102.method2025(local36.aByte144, -29754, local36.anInt10722, local36.anInt10718);
			Static102.method2026(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1654(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static338.anInt5584;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(9) int local9;
		if (Static1.anInt10827 == 3) {
			local9 = Static219.aClass238Array1.length;
		} else {
			local9 = Static353.aBoolean735 ? local1 : local1 + Static390.anInt6146;
		}
		for (@Pc(21) int local21 = 0; local21 < local9; local21++) {
			@Pc(36) Class8_Sub2_Sub1_Sub2 local36;
			if (Static1.anInt10827 == 3) {
				@Pc(29) Class238 local29 = Static219.aClass238Array1[local21];
				if (!local29.aBoolean455) {
					continue;
				}
				local36 = local29.method5370();
			} else {
				if (local21 < local1) {
					local36 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local21]];
				} else {
					local36 = ((Class2_Sub45) Static18.aClass28_2.method738(Static103.anIntArray187[local21 - local1])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
				if (local36.aByte144 != arg0) {
					continue;
				}
				if (local36.anInt10767 < 0) {
					local36.aBoolean817 = false;
					continue;
				}
			}
			local36.anInt10763 = 0;
			@Pc(80) int local80 = local36.method9309((byte) 121);
			if ((local80 & 0x1) == 0) {
				if ((local36.anInt10718 & 0x1FF) != 0 || (local36.anInt10722 & 0x1FF) != 0) {
					local36.aBoolean817 = false;
					continue;
				}
			} else if ((local36.anInt10718 & 0x1FF) != 256 || (local36.anInt10722 & 0x1FF) != 256) {
				local36.aBoolean817 = false;
				continue;
			}
			if (Static1.anInt10827 != 3) {
				@Pc(135) int local135;
				@Pc(140) int local140;
				@Pc(166) int local166;
				if (local80 == 1) {
					local135 = local36.anInt10718 >> 9;
					local140 = local36.anInt10722 >> 9;
					if (local36.anInt10767 != Static341.anIntArrayArray133[local135][local140]) {
						local36.aBoolean817 = true;
						continue;
					}
					if (Static148.anIntArrayArray64[local135][local140] > 1) {
						local166 = Static148.anIntArrayArray64[local135][local140]--;
						local36.aBoolean817 = true;
						continue;
					}
				} else {
					local135 = (local80 - 1) * 256 + 252;
					local140 = local36.anInt10718 - local135 >> 9;
					@Pc(196) int local196 = local36.anInt10722 - local135 >> 9;
					@Pc(203) int local203 = local36.anInt10718 + local135 >> 9;
					@Pc(210) int local210 = local36.anInt10722 + local135 >> 9;
					if (!Static426.method1017(local203, local210, local140, local196, local36.anInt10767)) {
						for (@Pc(221) int local221 = local140; local221 <= local203; local221++) {
							for (@Pc(224) int local224 = local196; local224 <= local210; local224++) {
								if (local36.anInt10767 == Static341.anIntArrayArray133[local221][local224]) {
									local166 = Static148.anIntArrayArray64[local221][local224]--;
								}
							}
						}
						local36.aBoolean817 = true;
						continue;
					}
				}
			}
			local36.aBoolean817 = false;
			local36.anInt10719 = Static102.method2025(local36.aByte144, -29754, local36.anInt10722, local36.anInt10718);
			Static102.method2026(local36, true);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1655() {
		@Pc(1) int local1 = Static338.anInt5584;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(8) int local8 = Static400.aClass2_Sub34_28.aClass57_Sub27_1.method7674();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class8_Sub2_Sub1_Sub2_Sub1 local39 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local32]];
			if (!local39.method1417()) {
				local39.anInt10767 = -1;
			} else if (local39.aBoolean124) {
				local39.anInt10767 = -1;
			} else {
				local39.method9301();
				if (local39.aShort131 >= 0 && local39.aShort132 >= 0 && local39.aShort134 < Static720.anInt10888 && local39.aShort133 < Static501.anInt7591) {
					local39.aBoolean129 = local39.aBoolean818 ? local30 : false;
					if (local39 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2) {
						local39.anInt10767 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean817) {
							local103++;
						}
						if (local39.anInt10776 > Static333.anInt5474) {
							local103 += 2;
						}
						local103 += 5 - local39.method9309((byte) 67) << 2;
						if (local39.aBoolean128 || local39.aBoolean125) {
							local103 += 512;
						} else {
							if (Static150.anInt2641 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt10767 = local103 + 1;
					}
				} else {
					local39.anInt10767 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static390.anInt6146; local155++) {
			@Pc(166) Class8_Sub2_Sub1_Sub2_Sub2 local166 = ((Class2_Sub45) Static18.aClass28_2.method738(Static103.anIntArray187[local155])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local166.method9329() && local166.aClass270_1.method6003(Static34.aClass306_1)) {
				local166.method9301();
				if (local166.aShort131 >= 0 && local166.aShort132 >= 0 && local166.aShort134 < Static720.anInt10888 && local166.aShort133 < Static501.anInt7591) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean817) {
						local213++;
					}
					if (local166.anInt10776 > Static333.anInt5474) {
						local213 += 2;
					}
					local213 += 5 - local166.method9309((byte) 88) << 2;
					if (Static150.anInt2641 == 0) {
						if (local166.aClass270_1.aBoolean504) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static150.anInt2641 == 1) {
						if (local166.aClass270_1.aBoolean504) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass270_1.aBoolean502) {
						local213 += 1024;
					} else if (!local166.aClass270_1.aBoolean503) {
						local213 += 256;
					}
					local166.anInt10767 = local213 + 1;
				} else {
					local166.anInt10767 = -1;
				}
			} else {
				local166.anInt10767 = -1;
			}
		}
		for (local103 = 0; local103 < Static527.aClass256Array1.length; local103++) {
			@Pc(292) Class256 local292 = Static527.aClass256Array1[local103];
			if (local292 != null) {
				if (local292.anInt6383 == 1) {
					@Pc(308) Class2_Sub45 local308 = (Class2_Sub45) Static18.aClass28_2.method738(local292.anInt6386);
					if (local308 != null) {
						@Pc(313) Class8_Sub2_Sub1_Sub2_Sub2 local313 = local308.aClass8_Sub2_Sub1_Sub2_Sub2_2;
						if (local313.anInt10767 >= 0) {
							local313.anInt10767 += 2048;
						}
					}
				} else if (local292.anInt6383 == 10) {
					@Pc(333) Class8_Sub2_Sub1_Sub2_Sub1 local333 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local292.anInt6386];
					if (local333 != null && local333 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 && local333.anInt10767 >= 0) {
						local333.anInt10767 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hda;)Lclient!hda;")
	public static Class158 method1657(@OriginalArg(0) Class158 arg0) {
		@Pc(4) int local4 = method1661(arg0).method6225();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static145.method2412(arg0.anInt3753);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hda;)Z")
	public static boolean method1660(@OriginalArg(0) Class158 arg0) {
		if (Static103.aBoolean195) {
			if (method1661(arg0).anInt6930 != 0) {
				return false;
			}
			if (arg0.anInt3831 == 0) {
				return false;
			}
		}
		return arg0.aBoolean284;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!hda;)Lclient!ofa;")
	public static Class2_Sub41 method1661(@OriginalArg(0) Class158 arg0) {
		@Pc(13) Class2_Sub41 local13 = (Class2_Sub41) Static291.aClass28_24.method738(((long) arg0.anInt3823 << 32) + (long) arg0.anInt3751);
		return local13 == null ? arg0.aClass2_Sub41_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BLclient!pg;)V")
	public static void method1662(@OriginalArg(1) Class2_Sub2_Sub16 arg0) {
		if (arg0 == null) {
			return;
		}
		Static693.aClass341_79.method7718(arg0);
		Static594.anInt8801++;
		@Pc(33) Class2_Sub2_Sub4 local33;
		if (arg0.aBoolean551 || "".equals(arg0.aString86)) {
			local33 = new Class2_Sub2_Sub4(arg0.aString86);
			Static31.anInt770++;
		} else {
			@Pc(41) long local41 = arg0.aLong234;
			for (local33 = (Class2_Sub2_Sub4) Static490.aClass28_34.method738(local41); local33 != null && !local33.aString10.equals(arg0.aString86); local33 = (Class2_Sub2_Sub4) Static490.aClass28_34.method744()) {
			}
			if (local33 == null) {
				local33 = (Class2_Sub2_Sub4) Static717.aClass82_232.method2156(local41);
				if (local33 != null && !local33.aString10.equals(arg0.aString86)) {
					local33 = null;
				}
				if (local33 == null) {
					local33 = new Class2_Sub2_Sub4(arg0.aString86);
				}
				Static490.aClass28_34.method735(local41, local33);
				Static31.anInt770++;
			}
		}
		if (local33.method1471(arg0)) {
			Static385.method5431(local33);
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hda;II)V")
	public static void method1663(@OriginalArg(0) Class158[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(11) Class158 local11 = arg0[local1];
			if (local11 != null) {
				if (local11.anInt3831 == 0) {
					if (local11.aClass158Array1 != null) {
						method1663(local11.aClass158Array1, arg1);
					}
					@Pc(38) Class2_Sub4 local38 = (Class2_Sub4) Static548.aClass28_40.method738(local11.anInt3823);
					if (local38 != null) {
						Static145.method2411(arg1, local38.anInt147);
					}
				}
				@Pc(58) Class2_Sub42 local58;
				if (arg1 == 0 && local11.anObjectArray20 != null) {
					local58 = new Class2_Sub42();
					local58.aClass158_14 = local11;
					local58.anObjectArray36 = local11.anObjectArray20;
					Static472.method6427(local58);
				}
				if (arg1 == 1 && local11.anObjectArray6 != null) {
					if (local11.anInt3751 >= 0) {
						@Pc(88) Class158 local88 = Static145.method2412(local11.anInt3823);
						if (local88 == null || local88.aClass158Array2 == null || local88.aClass158Array2.length <= local11.anInt3751 || local88.aClass158Array2[local11.anInt3751] != local11) {
							continue;
						}
					}
					local58 = new Class2_Sub42();
					local58.aClass158_14 = local11;
					local58.anObjectArray36 = local11.anObjectArray6;
					Static472.method6427(local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1664() {
		Static172.anInt2902 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static390.anInt6146; local3++) {
			@Pc(14) Class8_Sub2_Sub1_Sub2_Sub2 local14 = ((Class2_Sub45) Static18.aClass28_2.method738(Static103.anIntArray187[local3])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local14.aBoolean817 && local14.method9311((byte) -123) != -1) {
				@Pc(34) int local34 = (local14.method9309((byte) 63) - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt10718 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt10722 - local34 >> 9;
				@Pc(55) Class8_Sub2_Sub1_Sub2 local55 = Static184.method2798(local41, local48, local14.aByte144);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt10768;
					if (local55 instanceof Class8_Sub2_Sub1_Sub2_Sub2) {
						local60 += 2048;
					}
					if (local55.anInt10763 == 0 && local55.method9311((byte) -121) != -1) {
						Static324.anIntArray390[Static172.anInt2902] = local60;
						Static212.anIntArray283[Static172.anInt2902] = local60;
						Static172.anInt2902++;
						local55.anInt10763++;
					}
					Static324.anIntArray390[Static172.anInt2902] = local60;
					Static212.anIntArray283[Static172.anInt2902] = local14.anInt10768 + 2048;
					Static172.anInt2902++;
					local55.anInt10763++;
				}
			}
		}
		Static163.method8859(Static212.anIntArray283, Static172.anInt2902 - 1, Static324.anIntArray390, 0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1665() {
		for (@Pc(1) int local1 = 0; local1 < Static720.anInt10888; local1++) {
			@Pc(6) int[] local6 = Static341.anIntArrayArray133[local1];
			for (@Pc(8) int local8 = 0; local8 < Static501.anInt7591; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hda;IIIIIIIIIII)V")
	public static void method1669(@OriginalArg(0) Class158[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label908: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class158 local6 = arg0[local1];
			if (local6 != null && local6.anInt3753 == arg1) {
				@Pc(19) int local19 = local6.anInt3745 + arg6;
				@Pc(24) int local24 = local6.anInt3794 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt3831 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt3813;
					local47 = local24 + local6.anInt3756;
					if (local6.anInt3831 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt3831 == 0 || local6.aBoolean297 || method1661(local6).anInt6930 != 0 || local6 == Static354.aClass158_8 || local6.anInt3817 == Static496.anInt7455 || local6.anInt3817 == Static625.anInt9497 || local6.anInt3817 == Static188.anInt3113 || local6.anInt3817 == Static190.anInt3122) {
					if (!method1660(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static137.aBoolean210) {
							local42 = Static130.method2283();
							local47 = Static422.method5778();
						}
						if (local6 == Static109.aClass158_3 && Static582.method7665(Static109.aClass158_3) != null) {
							Static702.aBoolean798 = true;
							Static655.anInt9789 = local19;
							Static115.anInt2267 = local24;
						}
						if (local6.aBoolean296 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean300 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(220) Class2_Sub42 local220 = (Class2_Sub42) Static521.aClass341_44.method7706(65280); local220 != null; local220 = (Class2_Sub42) Static521.aClass341_44.method7713()) {
									if (local220.aBoolean544) {
										local220.method9464();
										local220.aClass158_14.aBoolean298 = false;
									}
								}
								if (Static181.anInt3012 == 0) {
									Static109.aClass158_3 = null;
									Static354.aClass158_8 = null;
								}
								Static460.anInt6985 = 0;
								Static95.aBoolean184 = false;
								Static118.aBoolean199 = false;
								if (!Static400.aBoolean623) {
									Static79.method1578();
								}
							}
							@Pc(308) boolean local308 = local6.aBoolean295 && local6.anInt3831 == 5 && local6.anInt3790 == 0 && local6.anInt3835 < 0 && local6.anInt3770 == -1 && local6.anInt3755 == -1 && !local6.aBoolean301 && local6.anInt3775 == 0;
							@Pc(310) boolean local310 = false;
							@Pc(402) int local402;
							if (Static189.aClass120_1.method8860() + local42 >= local30 && Static189.aClass120_1.method8861() + local47 >= local32 && Static189.aClass120_1.method8860() + local42 < local34 && Static189.aClass120_1.method8861() + local47 < local36) {
								if (local308) {
									@Pc(353) Class159 local353 = local6.method3393(Static163.aClass19_17);
									if (local353 != null && local353.anInt3843 == local6.anInt3813 && local353.anInt3844 == local6.anInt3756) {
										@Pc(380) int local380 = Static189.aClass120_1.method8860() + local42 - local19;
										@Pc(388) int local388 = Static189.aClass120_1.method8861() + local47 - local24;
										if (local388 >= 0 && local388 < local353.anIntArray303.length) {
											local402 = local353.anIntArray303[local388];
											if (local380 >= local402 && local380 <= local402 + local353.anIntArray302[local388]) {
												local310 = true;
											}
										}
									} else {
										local310 = true;
									}
								} else {
									local310 = true;
								}
							}
							if (!Static156.aBoolean223 && local310) {
								if (local6.anInt3793 >= 0) {
									Static442.anInt6719 = local6.anInt3793;
								} else if (local6.aBoolean300) {
									Static442.anInt6719 = -1;
								}
							}
							if (!Static400.aBoolean623 && local310) {
								Static420.method5765(local6, arg10 - local19, arg10 - local24);
							}
							@Pc(462) boolean local462 = false;
							if (Static189.aClass120_1.method8849() && local310) {
								local462 = true;
							}
							@Pc(474) boolean local474 = false;
							@Pc(479) Class2_Sub9 local479 = (Class2_Sub9) Static226.aClass341_58.method7706(65280);
							@Pc(549) int local549;
							@Pc(555) int local555;
							@Pc(569) int local569;
							@Pc(524) Class159 local524;
							if (local479 != null && local479.method5335() == 0 && local479.method5338() >= local30 && local479.method5340() >= local32 && local479.method5338() < local34 && local479.method5340() < local36) {
								if (local308) {
									local524 = local6.method3393(Static163.aClass19_17);
									if (local524 != null && local524.anInt3843 == local6.anInt3813 && local524.anInt3844 == local6.anInt3756) {
										local549 = local479.method5338() - local19;
										local555 = local479.method5340() - local24;
										if (local555 >= 0 && local555 < local524.anIntArray303.length) {
											local569 = local524.anIntArray303[local555];
											if (local549 >= local569 && local549 <= local569 + local524.anIntArray302[local555]) {
												local474 = true;
											}
										}
									} else {
										local474 = true;
									}
								} else {
									local474 = true;
								}
							}
							if (local6.aByteArray37 != null && !Static607.method8170()) {
								for (local402 = 0; local402 < local6.aByteArray37.length; local402++) {
									if (Static334.aClass321_1.method8486(local6.aByteArray37[local402])) {
										if (local6.anIntArray294 == null || Static333.anInt5474 >= local6.anIntArray294[local402]) {
											@Pc(634) byte local634 = local6.aByteArray36[local402];
											if (local634 == 0 || ((local634 & 0x8) == 0 || !Static334.aClass321_1.method8486(86) && !Static334.aClass321_1.method8486(82) && !Static334.aClass321_1.method8486(81)) && ((local634 & 0x2) == 0 || Static334.aClass321_1.method8486(86)) && ((local634 & 0x1) == 0 || Static334.aClass321_1.method8486(82)) && ((local634 & 0x4) == 0 || Static334.aClass321_1.method8486(81))) {
												if (local402 < 10) {
													Static120.method2193(local6.anInt3823, -1, "", local402 + 1);
												} else if (local402 == 10) {
													Static470.method6391();
													@Pc(726) Class2_Sub41 local726 = method1661(local6);
													Static389.method5483(local726.method6223(), local6, local726.anInt6925);
													Static153.aString27 = Static380.method5366(local6);
													if (Static153.aString27 == null) {
														Static153.aString27 = "Null";
													}
													Static128.aString108 = local6.aString41 + "<col=ffffff>";
												}
												local555 = local6.anIntArray293[local402];
												if (local6.anIntArray294 == null) {
													local6.anIntArray294 = new int[local6.aByteArray37.length];
												}
												if (local555 == 0) {
													local6.anIntArray294[local402] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray294[local402] = Static333.anInt5474 + local555;
												}
											}
										}
									} else if (local6.anIntArray294 != null) {
										local6.anIntArray294[local402] = 0;
									}
								}
							}
							if (local474) {
								Static597.method7831(local47 + local479.method5340() - local24, local6, local42 + local479.method5338() - local19);
							}
							if (Static109.aClass158_3 != null && Static109.aClass158_3 != local6 && local310 && method1661(local6).method6227()) {
								Static327.aClass158_7 = local6;
							}
							if (local6 == Static354.aClass158_8) {
								Static343.aBoolean428 = true;
								Static123.anInt2350 = local19;
								Static169.anInt2862 = local24;
							}
							if (local6.aBoolean297 || local6.anInt3817 != 0) {
								@Pc(877) Class2_Sub42 local877;
								if (local310 && Static611.anInt9367 != 0 && local6.anObjectArray11 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7235 = Static611.anInt9367;
									local877.anObjectArray36 = local6.anObjectArray11;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static109.aClass158_3 != null) {
									local474 = false;
									local462 = false;
								} else if (Static400.aBoolean623 || local6.anInt3817 != Static58.anInt1181 && Static460.anInt6985 > 0) {
									local474 = false;
									local462 = false;
									local310 = false;
								}
								if (local6.anInt3817 != 0) {
									if (local6.anInt3817 == Static188.anInt3113 || local6.anInt3817 == Static190.anInt3122) {
										Static610.aClass158_16 = local6;
										if (Static456.aClass148_3 != null) {
											Static456.aClass148_3.method3168(Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989(), local6.anInt3756, Static163.aClass19_17);
										}
										if (local6.anInt3817 == Static188.anInt3113) {
											if (Static400.aBoolean623 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static147.method2417(arg9, arg8, Static163.aClass19_17);
											@Pc(991) Class8_Sub1 local991 = (Class8_Sub1) Static149.aClass130_4.method2790();
											while (true) {
												if (local991 == null) {
													continue label908;
												}
												if (arg10 >= local991.anInt108 && arg10 < local991.anInt109 && arg11 >= local991.anInt112 && arg11 < local991.anInt111) {
													Static79.method1578();
													Static466.method6329(local991.aClass8_Sub2_Sub1_Sub2_1);
												}
												local991 = (Class8_Sub1) Static149.aClass130_4.method2785();
											}
										}
									}
									if (local6.anInt3817 == Static496.anInt7455) {
										local524 = local6.method3393(Static163.aClass19_17);
										if (local524 == null || Static578.anInt8619 != 0 && Static578.anInt8619 != 3 || Static400.aBoolean623 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local549 = arg10 - local19;
										local555 = arg11 - local24;
										local569 = local524.anIntArray303[local555];
										if (local549 < local569 || local549 > local569 + local524.anIntArray302[local555]) {
											continue;
										}
										local549 -= local6.anInt3813 / 2;
										local555 -= local6.anInt3756 / 2;
										@Pc(1125) int local1125;
										if (Static511.anInt7668 == 4) {
											local1125 = (int) Static171.aFloat64 & 0x3FFF;
										} else {
											local1125 = (int) Static171.aFloat64 + Static29.anInt726 & 0x3FFF;
										}
										@Pc(1137) int local1137 = Class363.anIntArray741[local1125];
										@Pc(1141) int local1141 = Class363.anIntArray740[local1125];
										if (Static511.anInt7668 != 4) {
											local1137 = local1137 * (Static660.anInt9861 + 256) >> 8;
											local1141 = local1141 * (Static660.anInt9861 + 256) >> 8;
										}
										@Pc(1170) int local1170 = local555 * local1137 + local549 * local1141 >> 14;
										@Pc(1180) int local1180 = local555 * local1141 - local549 * local1137 >> 14;
										@Pc(1191) int local1191;
										@Pc(1199) int local1199;
										if (Static511.anInt7668 == 4) {
											local1191 = (Static433.anInt6282 >> 9) + (local1170 >> 2);
											local1199 = (Static249.anInt4029 >> 9) - (local1180 >> 2);
										} else {
											@Pc(1208) int local1208 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9309((byte) 83) - 1) * 256;
											local1191 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 - local1208 >> 9) + (local1170 >> 2);
											local1199 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 - local1208 >> 9) - (local1180 >> 2);
										}
										if (Static156.aBoolean223 && (Static717.anInt10851 & 0x40) != 0) {
											@Pc(1243) Class158 local1243 = Static15.method186(Static77.anInt1621, Static450.anInt6840);
											if (local1243 == null) {
												Static470.method6391();
											} else {
												Static416.method5714(false, local6.anInt3770, 1L, local1191, local1199, Static153.aString27, 21, true, Static369.anInt4275, " ->", local6.anInt3751 << 0 | local6.anInt3823, true);
											}
											continue;
										}
										if (Static392.aClass379_4 == Static723.aClass379_9) {
											Static416.method5714(false, -1, 1L, local1191, local1199, Static32.aClass32_27.method877(Static51.anInt1056), 11, true, -1, "", 0L, true);
										}
										Static416.method5714(false, -1, 1L, local1191, local1199, Static331.aString52, 58, true, Static331.anInt5458, "", 0L, true);
										continue;
									}
									if (local6.anInt3817 == Static58.anInt1181) {
										Static210.aClass158_4 = local6;
										if (local310) {
											Static95.aBoolean184 = true;
										}
										if (local474) {
											local402 = (int) ((double) (local42 + local479.method5338() - local19 - local6.anInt3813 / 2) * 2.0D / (double) Static30.aFloat105);
											local549 = (int) -((double) (local47 + local479.method5340() - local24 - local6.anInt3756 / 2) * 2.0D / (double) Static30.aFloat105);
											local555 = Static164.anInt2818 + local402 + Static30.anInt5675;
											local569 = Static615.anInt9415 + local549 + Static30.anInt5668;
											@Pc(1383) Class2_Sub2_Sub13 local1383 = Static186.method2819();
											if (local1383 == null) {
												continue;
											}
											@Pc(1388) int[] local1388 = new int[3];
											local1383.method4091(local569, local555, local1388);
											if (local1388 != null) {
												if (Static334.aClass321_1.method8486(82) && Static608.anInt9316 > 0) {
													Static624.method8338(local1388[0], local1388[2], local1388[1]);
													continue;
												}
												Static118.aBoolean199 = true;
												Static688.anInt10384 = local1388[0];
												Static503.anInt7605 = local1388[1];
												Static614.anInt9399 = local1388[2];
											}
											Static460.anInt6985 = 1;
											Static1.aBoolean822 = false;
											Static378.anInt5961 = Static189.aClass120_1.method8860();
											Static150.anInt2640 = Static189.aClass120_1.method8861();
											continue;
										}
										if (local462 && Static460.anInt6985 > 0) {
											if (Static460.anInt6985 == 1 && (Static378.anInt5961 != Static189.aClass120_1.method8860() || Static150.anInt2640 != Static189.aClass120_1.method8861())) {
												Static661.anInt6075 = Static164.anInt2818;
												Static417.anInt6419 = Static615.anInt9415;
												Static460.anInt6985 = 2;
											}
											if (Static460.anInt6985 == 2) {
												Static1.aBoolean822 = true;
												Static669.method8718(Static661.anInt6075 + (int) ((double) (Static378.anInt5961 - Static189.aClass120_1.method8860()) * 2.0D / (double) Static30.aFloat106));
												Static182.method2786(Static417.anInt6419 - (int) ((double) (Static150.anInt2640 - Static189.aClass120_1.method8861()) * 2.0D / (double) Static30.aFloat106));
											}
											continue;
										}
										if (Static460.anInt6985 > 0 && !Static1.aBoolean822) {
											if ((Static219.anInt3559 == 1 || Static204.method3084()) && Static594.anInt8801 > 2) {
												Static455.method6230(Static378.anInt5961, Static150.anInt2640);
											} else if (Static77.method1559()) {
												Static455.method6230(Static378.anInt5961, Static150.anInt2640);
											}
										}
										Static460.anInt6985 = 0;
										continue;
									}
									if (local6.anInt3817 == Static146.anInt2576) {
										if (local462) {
											Static203.method3069(local6.anInt3813, local42 + Static189.aClass120_1.method8860() - local19, local47 + Static189.aClass120_1.method8861() - local24, local6.anInt3756);
										}
										continue;
									}
									if (local6.anInt3817 == Static625.anInt9497) {
										Static65.method1473(local19, local24, local6);
										continue;
									}
								}
								if (!local6.aBoolean290 && local474) {
									local6.aBoolean290 = true;
									if (local6.anObjectArray17 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7239 = local42 + local479.method5338() - local19;
										local877.anInt7235 = local47 + local479.method5340() - local24;
										local877.anObjectArray36 = local6.anObjectArray17;
										Static521.aClass341_44.method7718(local877);
									}
								}
								if (local6.aBoolean290 && local462 && local6.anObjectArray24 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7239 = local42 + Static189.aClass120_1.method8860() - local19;
									local877.anInt7235 = local47 + Static189.aClass120_1.method8861() - local24;
									local877.anObjectArray36 = local6.anObjectArray24;
									Static521.aClass341_44.method7718(local877);
								}
								if (local6.aBoolean290 && !local462) {
									local6.aBoolean290 = false;
									if (local6.anObjectArray1 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7239 = local42 + Static189.aClass120_1.method8860() - local19;
										local877.anInt7235 = local47 + Static189.aClass120_1.method8861() - local24;
										local877.anObjectArray36 = local6.anObjectArray1;
										Static59.aClass341_33.method7718(local877);
									}
								}
								if (local462 && local6.anObjectArray32 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7239 = local42 + Static189.aClass120_1.method8860() - local19;
									local877.anInt7235 = local47 + Static189.aClass120_1.method8861() - local24;
									local877.anObjectArray36 = local6.anObjectArray32;
									Static521.aClass341_44.method7718(local877);
								}
								if (!local6.aBoolean298 && local310) {
									local6.aBoolean298 = true;
									if (local6.anObjectArray4 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7239 = local42 + Static189.aClass120_1.method8860() - local19;
										local877.anInt7235 = local47 + Static189.aClass120_1.method8861() - local24;
										local877.anObjectArray36 = local6.anObjectArray4;
										Static521.aClass341_44.method7718(local877);
									}
								}
								if (local6.aBoolean298 && local310 && local6.anObjectArray28 != null) {
									local877 = new Class2_Sub42();
									local877.aBoolean544 = true;
									local877.aClass158_14 = local6;
									local877.anInt7239 = local42 + Static189.aClass120_1.method8860() - local19;
									local877.anInt7235 = local47 + Static189.aClass120_1.method8861() - local24;
									local877.anObjectArray36 = local6.anObjectArray28;
									Static521.aClass341_44.method7718(local877);
								}
								if (local6.aBoolean298 && !local310) {
									local6.aBoolean298 = false;
									if (local6.anObjectArray26 != null) {
										local877 = new Class2_Sub42();
										local877.aBoolean544 = true;
										local877.aClass158_14 = local6;
										local877.anInt7239 = local42 + Static189.aClass120_1.method8860() - local19;
										local877.anInt7235 = local47 + Static189.aClass120_1.method8861() - local24;
										local877.anObjectArray36 = local6.anObjectArray26;
										Static59.aClass341_33.method7718(local877);
									}
								}
								if (local6.anObjectArray3 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray3;
									Static618.aClass341_68.method7718(local877);
								}
								@Pc(2022) Class2_Sub42 local2022;
								if (local6.anObjectArray2 != null && Static52.anInt1069 > local6.anInt3816) {
									if (local6.anIntArray298 == null || Static52.anInt1069 - local6.anInt3816 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray2;
										Static521.aClass341_44.method7718(local877);
									} else {
										label768: for (local402 = local6.anInt3816; local402 < Static52.anInt1069; local402++) {
											local549 = Static278.anIntArray350[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray298.length; local555++) {
												if (local6.anIntArray298[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray2;
													Static521.aClass341_44.method7718(local2022);
													break label768;
												}
											}
										}
									}
									local6.anInt3816 = Static52.anInt1069;
								}
								if (local6.anObjectArray18 != null && Static455.anInt6938 > local6.anInt3812) {
									if (local6.anIntArray296 == null || Static455.anInt6938 - local6.anInt3812 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray18;
										Static521.aClass341_44.method7718(local877);
									} else {
										label744: for (local402 = local6.anInt3812; local402 < Static455.anInt6938; local402++) {
											local549 = Static268.anIntArray332[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray296.length; local555++) {
												if (local6.anIntArray296[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray18;
													Static521.aClass341_44.method7718(local2022);
													break label744;
												}
											}
										}
									}
									local6.anInt3812 = Static455.anInt6938;
								}
								if (local6.anObjectArray25 != null && Static635.anInt9551 > local6.anInt3771) {
									if (local6.anIntArray300 == null || Static635.anInt9551 - local6.anInt3771 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray25;
										Static521.aClass341_44.method7718(local877);
									} else {
										label720: for (local402 = local6.anInt3771; local402 < Static635.anInt9551; local402++) {
											local549 = Static142.anIntArray225[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray300.length; local555++) {
												if (local6.anIntArray300[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray25;
													Static521.aClass341_44.method7718(local2022);
													break label720;
												}
											}
										}
									}
									local6.anInt3771 = Static635.anInt9551;
								}
								if (local6.anObjectArray8 != null && Static451.anInt6872 > local6.anInt3785) {
									if (local6.anIntArray299 == null || Static451.anInt6872 - local6.anInt3785 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray8;
										Static521.aClass341_44.method7718(local877);
									} else {
										label696: for (local402 = local6.anInt3785; local402 < Static451.anInt6872; local402++) {
											local549 = Static322.anIntArray889[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray299.length; local555++) {
												if (local6.anIntArray299[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray8;
													Static521.aClass341_44.method7718(local2022);
													break label696;
												}
											}
										}
									}
									local6.anInt3785 = Static451.anInt6872;
								}
								if (local6.anObjectArray21 != null && Static366.anInt5878 > local6.anInt3814) {
									if (local6.anIntArray295 == null || Static366.anInt5878 - local6.anInt3814 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray21;
										Static521.aClass341_44.method7718(local877);
									} else {
										label672: for (local402 = local6.anInt3814; local402 < Static366.anInt5878; local402++) {
											local549 = Static395.anIntArray833[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray295.length; local555++) {
												if (local6.anIntArray295[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray21;
													Static521.aClass341_44.method7718(local2022);
													break label672;
												}
											}
										}
									}
									local6.anInt3814 = Static366.anInt5878;
								}
								if (local6.anObjectArray33 != null && Static710.anInt7577 > local6.anInt3801) {
									if (local6.anIntArray297 == null || Static710.anInt7577 - local6.anInt3801 > 32) {
										local877 = new Class2_Sub42();
										local877.aClass158_14 = local6;
										local877.anObjectArray36 = local6.anObjectArray33;
										Static521.aClass341_44.method7718(local877);
									} else {
										label648: for (local402 = local6.anInt3801; local402 < Static710.anInt7577; local402++) {
											local549 = Static265.anIntArray328[local402 & 0x1F];
											for (local555 = 0; local555 < local6.anIntArray297.length; local555++) {
												if (local6.anIntArray297[local555] == local549) {
													local2022 = new Class2_Sub42();
													local2022.aClass158_14 = local6;
													local2022.anObjectArray36 = local6.anObjectArray33;
													Static521.aClass341_44.method7718(local2022);
													break label648;
												}
											}
										}
									}
									local6.anInt3801 = Static710.anInt7577;
								}
								if (Static716.anInt10844 > local6.anInt3803 && local6.anObjectArray7 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray7;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static344.anInt5641 > local6.anInt3803 && local6.anObjectArray29 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray29;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static352.anInt5774 > local6.anInt3803 && local6.anObjectArray27 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray27;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static400.anInt8125 > local6.anInt3803 && local6.anObjectArray23 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray23;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static39.anInt953 > local6.anInt3803 && local6.anObjectArray12 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray12;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static526.anInt8090 > local6.anInt3803 && local6.anObjectArray9 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray9;
									Static521.aClass341_44.method7718(local877);
								}
								if (Static321.anInt5128 > local6.anInt3803 && local6.anObjectArray34 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray34;
									Static521.aClass341_44.method7718(local877);
								}
								local6.anInt3803 = Static642.anInt9625;
								if (local6.anObjectArray22 != null) {
									for (local402 = 0; local402 < Static671.anInt10053; local402++) {
										@Pc(2682) Class2_Sub42 local2682 = new Class2_Sub42();
										local2682.aClass158_14 = local6;
										local2682.anInt7237 = Static194.anInterface27Array1[local402].method2664();
										local2682.anInt7242 = Static194.anInterface27Array1[local402].method2666();
										local2682.anObjectArray36 = local6.anObjectArray22;
										Static521.aClass341_44.method7718(local2682);
									}
								}
								if (Static272.aBoolean337 && local6.anObjectArray31 != null) {
									local877 = new Class2_Sub42();
									local877.aClass158_14 = local6;
									local877.anObjectArray36 = local6.anObjectArray31;
									Static521.aClass341_44.method7718(local877);
								}
							}
							if (local6.anInt3831 == 5 && local6.anInt3835 != -1) {
								local6.method3405(Static99.aClass78_1, Static324.aClass309_1).method3168(Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989(), local6.anInt3756, Static163.aClass19_17);
							}
							Static542.method7209(local6);
							if (local6.anInt3831 == 0) {
								method1669(arg0, local6.anInt3823, local30, local32, local34, local36, local19 - local6.anInt3820, local24 - local6.anInt3778, arg8, arg9, arg10, arg11);
								if (local6.aClass158Array1 != null) {
									method1669(local6.aClass158Array1, local6.anInt3823, local30, local32, local34, local36, local19 - local6.anInt3820, local24 - local6.anInt3778, arg8, arg9, arg10, arg11);
								}
								@Pc(2824) Class2_Sub4 local2824 = (Class2_Sub4) Static548.aClass28_40.method738(local6.anInt3823);
								if (local2824 != null) {
									if (Static392.aClass379_4 == Static673.aClass379_8 && local2824.anInt146 == 0 && !Static400.aBoolean623 && local310 && !Static103.aBoolean195) {
										Static79.method1578();
									}
									Static431.method5829(local36, local24, local32, arg9, arg11, local34, local19, local2824.anInt147, arg8, arg10, local30);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static542.method7209(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1670(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static338.anInt5584;
		@Pc(3) int[] local3 = Static210.anIntArray280;
		@Pc(9) int local9;
		if (Static1.anInt10827 == 3) {
			local9 = Static219.aClass238Array1.length;
		} else {
			local9 = local1 + Static390.anInt6146;
		}
		for (@Pc(16) int local16 = 0; local16 < local9; local16++) {
			@Pc(31) Class8_Sub2_Sub1_Sub2 local31;
			if (Static1.anInt10827 == 3) {
				@Pc(24) Class238 local24 = Static219.aClass238Array1[local16];
				if (!local24.aBoolean455) {
					continue;
				}
				local31 = local24.method5370();
			} else {
				if (local16 < local1) {
					local31 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local3[local16]];
				} else {
					local31 = ((Class2_Sub45) Static18.aClass28_2.method738(Static103.anIntArray187[local16 - local1])).aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
				if (local31.aByte144 != arg0 || local31.anInt10767 < 0) {
					continue;
				}
			}
			@Pc(69) int local69 = local31.method9309((byte) 102);
			if ((local69 & 0x1) == 0) {
				if ((local31.anInt10718 & 0x1FF) != 0 || (local31.anInt10722 & 0x1FF) != 0) {
					continue;
				}
			} else if ((local31.anInt10718 & 0x1FF) != 256 || (local31.anInt10722 & 0x1FF) != 256) {
				continue;
			}
			@Pc(113) int local113;
			@Pc(118) int local118;
			@Pc(155) int local155;
			if (local69 == 1) {
				local113 = local31.anInt10718 >> 9;
				local118 = local31.anInt10722 >> 9;
				if (local31.anInt10767 > Static341.anIntArrayArray133[local113][local118]) {
					Static341.anIntArrayArray133[local113][local118] = local31.anInt10767;
					Static148.anIntArrayArray64[local113][local118] = 1;
				} else if (local31.anInt10767 == Static341.anIntArrayArray133[local113][local118]) {
					local155 = Static148.anIntArrayArray64[local113][local118]++;
				}
			} else {
				local113 = (local69 - 1) * 256 + 60;
				local118 = local31.anInt10718 - local113 >> 9;
				@Pc(182) int local182 = local31.anInt10722 - local113 >> 9;
				@Pc(189) int local189 = local31.anInt10718 + local113 >> 9;
				@Pc(196) int local196 = local31.anInt10722 + local113 >> 9;
				for (@Pc(198) int local198 = local118; local198 <= local189; local198++) {
					for (@Pc(201) int local201 = local182; local201 <= local196; local201++) {
						if (local31.anInt10767 > Static341.anIntArrayArray133[local198][local201]) {
							Static341.anIntArrayArray133[local198][local201] = local31.anInt10767;
							Static148.anIntArrayArray64[local198][local201] = 1;
						} else if (local31.anInt10767 == Static341.anIntArrayArray133[local198][local201]) {
							local155 = Static148.anIntArrayArray64[local198][local201]++;
						}
					}
				}
			}
		}
	}
}
