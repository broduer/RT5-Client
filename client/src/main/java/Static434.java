import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!nla", name = "Q", descriptor = "I")
	public static int anInt6585;

	@OriginalMember(owner = "client!nla", name = "V", descriptor = "I")
	public static int anInt6599;

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(IB)I")
	public static int bitCount(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(ILclient!eq;IIIIIIIIII)Z")
	public static boolean method5861(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg5;
		@Pc(16) int local16 = arg2 - 64;
		Static352.anIntArrayArray141[64][64] = 99;
		@Pc(27) int local27 = arg5 - 64;
		Static668.anIntArrayArray244[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static507.anIntArray610[0] = arg2;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local35 + 1;
		Static428.anIntArray517[0] = arg5;
		@Pc(49) int[][] local49 = arg1.anIntArrayArray65;
		while (true) {
			label282: while (true) {
				@Pc(74) int local74;
				@Pc(69) int local69;
				@Pc(79) int local79;
				@Pc(85) int local85;
				@Pc(264) int local264;
				@Pc(318) int local318;
				do {
					do {
						do {
							label259: do {
								if (local44 == local41) {
									Static407.anInt6305 = local7;
									Static594.anInt8799 = local5;
									return false;
								}
								local7 = Static428.anIntArray517[local41];
								local5 = Static507.anIntArray610[local41];
								local41 = local41 + 1 & 0xFFF;
								local69 = local7 - local27;
								local74 = local5 - local16;
								local79 = local5 - arg1.anInt2656;
								local85 = local7 - arg1.anInt2654;
								if (arg4 == -4) {
									if (local5 == arg7 && arg8 == local7) {
										Static407.anInt6305 = local7;
										Static594.anInt8799 = local5;
										return true;
									}
								} else if (arg4 == -3) {
									if (Static275.method3979(arg7, arg9, local5, arg3, arg10, local7, arg8, arg9)) {
										Static407.anInt6305 = local7;
										Static594.anInt8799 = local5;
										return true;
									}
								} else if (arg4 == -2) {
									if (arg1.method2460(arg9, arg8, arg9, local5, arg7, arg6, arg10, local7, arg3)) {
										Static407.anInt6305 = local7;
										Static594.anInt8799 = local5;
										return true;
									}
								} else if (arg4 == -1) {
									if (arg1.method2464(arg8, arg6, arg7, local5, arg9, arg10, arg3, local7)) {
										Static407.anInt6305 = local7;
										Static594.anInt8799 = local5;
										return true;
									}
								} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
									if (arg1.method2465(arg9, arg4, arg8, local7, local5, arg7, arg0)) {
										Static407.anInt6305 = local7;
										Static594.anInt8799 = local5;
										return true;
									}
								} else if (arg1.method2458(local5, arg4, arg7, arg8, arg0, local7, arg9)) {
									Static407.anInt6305 = local7;
									Static594.anInt8799 = local5;
									return true;
								}
								local264 = Static668.anIntArrayArray244[local74][local69] + 1;
								if (local74 > 0 && Static352.anIntArrayArray141[local74 - 1][local69] == 0 && (local49[local79 - 1][local85] & 0x43A40000) == 0 && (local49[local79 - 1][arg9 + local85 - 1] & 0x4E240000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg9 - 1) {
											Static507.anIntArray610[local44] = local5 - 1;
											Static428.anIntArray517[local44] = local7;
											local44 = local44 + 1 & 0xFFF;
											Static352.anIntArrayArray141[local74 - 1][local69] = 2;
											Static668.anIntArrayArray244[local74 - 1][local69] = local264;
											break;
										}
										if ((local49[local79 - 1][local85 + local318] & 0x4FA40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (128 - arg9 > local74 && Static352.anIntArrayArray141[local74 + 1][local69] == 0 && (local49[local79 + arg9][local85] & 0x60E40000) == 0 && (local49[local79 + arg9][local85 + arg9 - 1] & 0x78240000) == 0) {
									local318 = 1;
									while (true) {
										if (arg9 - 1 <= local318) {
											Static507.anIntArray610[local44] = local5 + 1;
											Static428.anIntArray517[local44] = local7;
											Static352.anIntArrayArray141[local74 + 1][local69] = 8;
											local44 = local44 + 1 & 0xFFF;
											Static668.anIntArrayArray244[local74 + 1][local69] = local264;
											break;
										}
										if ((local49[arg9 + local79][local318 + local85] & 0x78E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local69 > 0 && Static352.anIntArrayArray141[local74][local69 - 1] == 0 && (local49[local79][local85 - 1] & 0x43A40000) == 0 && (local49[local79 + arg9 - 1][local85 - 1] & 0x60E40000) == 0) {
									local318 = 1;
									while (true) {
										if (arg9 - 1 <= local318) {
											Static507.anIntArray610[local44] = local5;
											Static428.anIntArray517[local44] = local7 - 1;
											local44 = local44 + 1 & 0xFFF;
											Static352.anIntArrayArray141[local74][local69 - 1] = 1;
											Static668.anIntArrayArray244[local74][local69 - 1] = local264;
											break;
										}
										if ((local49[local318 + local79][local85 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (128 - arg9 > local69 && Static352.anIntArrayArray141[local74][local69 + 1] == 0 && (local49[local79][local85 + arg9] & 0x4E240000) == 0 && (local49[local79 + arg9 - 1][arg9 + local85] & 0x78240000) == 0) {
									local318 = 1;
									while (true) {
										if (arg9 - 1 <= local318) {
											Static507.anIntArray610[local44] = local5;
											Static428.anIntArray517[local44] = local7 + 1;
											local44 = local44 + 1 & 0xFFF;
											Static352.anIntArrayArray141[local74][local69 + 1] = 4;
											Static668.anIntArrayArray244[local74][local69 + 1] = local264;
											break;
										}
										if ((local49[local318 + local79][arg9 + local85] & 0x7E240000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local74 > 0 && local69 > 0 && Static352.anIntArrayArray141[local74 - 1][local69 - 1] == 0 && (local49[local79 - 1][local85 - 1] & 0x43A40000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg9) {
											Static507.anIntArray610[local44] = local5 - 1;
											Static428.anIntArray517[local44] = local7 - 1;
											Static352.anIntArrayArray141[local74 - 1][local69 - 1] = 3;
											local44 = local44 + 1 & 0xFFF;
											Static668.anIntArrayArray244[local74 - 1][local69 - 1] = local264;
											break;
										}
										if ((local49[local79 - 1][local318 + local85 - 1] & 0x4FA40000) != 0 || (local49[local79 + local318 - 1][local85 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (128 - arg9 > local74 && local69 > 0 && Static352.anIntArrayArray141[local74 + 1][local69 - 1] == 0 && (local49[local79 + arg9][local85 - 1] & 0x60E40000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg9) {
											Static507.anIntArray610[local44] = local5 + 1;
											Static428.anIntArray517[local44] = local7 - 1;
											Static352.anIntArrayArray141[local74 + 1][local69 - 1] = 9;
											local44 = local44 + 1 & 0xFFF;
											Static668.anIntArrayArray244[local74 + 1][local69 - 1] = local264;
											break;
										}
										if ((local49[local79 + arg9][local318 + local85 - 1] & 0x78E40000) != 0 || (local49[local318 + local79][local85 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local74 > 0 && local69 < 128 - arg9 && Static352.anIntArrayArray141[local74 - 1][local69 + 1] == 0 && (local49[local79 - 1][arg9 + local85] & 0x4E240000) == 0) {
									for (local318 = 1; local318 < arg9; local318++) {
										if ((local49[local79 - 1][local85 + local318] & 0x4FA40000) != 0 || (local49[local318 + local79 - 1][arg9 + local85] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static507.anIntArray610[local44] = local5 - 1;
									Static428.anIntArray517[local44] = local7 + 1;
									Static352.anIntArrayArray141[local74 - 1][local69 + 1] = 6;
									local44 = local44 + 1 & 0xFFF;
									Static668.anIntArrayArray244[local74 - 1][local69 + 1] = local264;
								}
							} while (local74 >= 128 - arg9);
						} while (local69 >= 128 - arg9);
					} while (Static352.anIntArrayArray141[local74 + 1][local69 + 1] != 0);
				} while ((local49[arg9 + local79][arg9 + local85] & 0x78240000) != 0);
				for (local318 = 1; local318 < arg9; local318++) {
					if ((local49[local318 + local79][local85 + arg9] & 0x7E240000) != 0 || (local49[local79 + arg9][local85 + local318] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static507.anIntArray610[local44] = local5 + 1;
				Static428.anIntArray517[local44] = local7 + 1;
				Static352.anIntArrayArray141[local74 + 1][local69 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static668.anIntArrayArray244[local74 + 1][local69 + 1] = local264;
			}
		}
	}

}
