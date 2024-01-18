import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray36;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "[I")
	private static int[] anIntArray580;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "Lclient!hda;")
	private static Class158 aClass158_11;

	@OriginalMember(owner = "client!ou", name = "i", descriptor = "[J")
	private static long[] aLongArray15;

	@OriginalMember(owner = "client!ou", name = "H", descriptor = "Lclient!an;")
	private static Class21 aClass21_1;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "Lclient!rfa;")
	private static Class2_Sub47 aClass2_Sub47_2;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "Lclient!hi;")
	private static Class164 aClass164_7;

	@OriginalMember(owner = "client!ou", name = "k", descriptor = "Lclient!hda;")
	private static Class158 aClass158_12;

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "[J")
	private static final long[] aLongArray14 = new long[1000];

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "[I")
	private static final int[] intStack = new int[1000];

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
	private static int anInt7160 = 0;

	@OriginalMember(owner = "client!ou", name = "t", descriptor = "[Lclient!gf;")
	private static final Class143[] aClass143Array1 = new Class143[50];

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
	private static int anInt7161 = 0;

	@OriginalMember(owner = "client!ou", name = "f", descriptor = "[I")
	private static final int[] anIntArray579 = new int[3];

	@OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
	private static int isp = 0;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray37 = new String[1000];

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "[[I")
	private static final int[][] anIntArrayArray177 = new int[5][5000];

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
	private static int anInt7173 = 0;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "[I")
	private static final int[] anIntArray581 = new int[5];

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_156 = new Class82(4);

	@OriginalMember(owner = "client!ou", name = "q", descriptor = "Z")
	public static boolean aBoolean538 = false;

	@OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
	private static int anInt7174 = 0;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString76 = null;

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)I")
	public static int method6418(@OriginalArg(0) int arg0) {
		@Pc(4) Class343 local4 = Static648.aClass17_1.method263(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass164_7.method3495(Static392.game.id << 16 | local4.anInt8769, local4.anInt8770, local4.anInt8766);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)I")
	public static int method6419(@OriginalArg(0) int arg0) {
		@Pc(4) Class343 local4 = Static648.aClass17_1.method263(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass164_7.method3490(Static392.game.id << 16 | arg0);
		if (local24 == null) {
			return local4.aChar7 == 'i' || local4.aChar7 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)J")
	public static long method6420(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass164_7.method3478(Static392.game.id << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
	public static void method6421(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static571.method7573(arg0)) {
			return;
		}
		@Pc(14) Class158[] local14 = Static453.aClass158ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class158 local21 = local14[local16];
			if (local21.anObjectArray13 != null) {
				@Pc(28) Class2_Sub42 local28 = new Class2_Sub42();
				local28.aClass158_14 = local21;
				local28.anObjectArray36 = local21.anObjectArray13;
				method6429(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(Lclient!hda;)V")
	public static void method6422(@OriginalArg(0) Class158 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class158[] local71;
		if (arg0.anInt3751 == -1) {
			@Pc(119) int local119 = arg0.anInt3823 >>> 16;
			@Pc(123) Class158[] local123 = Static148.aClass158ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static453.aClass158ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static148.aClass158ArrayArray1[local119] = new Class158[local132];
				Static734.method7698(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static734.method7698(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class158 local12 = Static145.method2412(arg0.anInt3753);
		if (local12 == null) {
			return;
		}
		if (local12.aClass158Array1 == local12.aClass158Array2) {
			local12.aClass158Array1 = new Class158[local12.aClass158Array2.length];
			local12.aClass158Array1[local12.aClass158Array1.length - 1] = arg0;
			Static734.method7698(local12.aClass158Array2, 0, local12.aClass158Array1, 0, arg0.anInt3751);
			Static734.method7698(local12.aClass158Array2, arg0.anInt3751 + 1, local12.aClass158Array1, arg0.anInt3751, local12.aClass158Array2.length - arg0.anInt3751 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass158Array1;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static734.method7698(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass158Array1.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V")
	public static void method6423(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class158 local220;
		@Pc(27) int local27;
		@Pc(21) int local21;
		@Pc(38) Class158 local38;
		@Pc(72) int local72;
		@Pc(303) Class158 local303;
		@Pc(15) int local15;
		@Pc(248) Class158 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				isp -= 3;
				local15 = intStack[isp];
				local21 = intStack[isp + 1];
				local27 = intStack[isp + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static145.method2412(local15);
				if (local38.aClass158Array2 == null) {
					local38.aClass158Array2 = new Class158[local27 + 1];
					local38.aClass158Array1 = local38.aClass158Array2;
				}
				if (local38.aClass158Array2.length <= local27) {
					@Pc(70) Class158[] local70;
					if (local38.aClass158Array2 == local38.aClass158Array1) {
						local70 = new Class158[local27 + 1];
						for (local72 = 0; local72 < local38.aClass158Array2.length; local72++) {
							local70[local72] = local38.aClass158Array2[local72];
						}
						local38.aClass158Array2 = local38.aClass158Array1 = local70;
					} else {
						local70 = new Class158[local27 + 1];
						@Pc(104) Class158[] local104 = new Class158[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass158Array2.length; local106++) {
							local70[local106] = local38.aClass158Array2[local106];
							local104[local106] = local38.aClass158Array1[local106];
						}
						local38.aClass158Array2 = local70;
						local38.aClass158Array1 = local104;
					}
				}
				if (local27 > 0 && local38.aClass158Array2[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class158 local166 = new Class158();
				local166.anInt3831 = local21;
				local166.anInt3753 = local166.anInt3823 = local38.anInt3823;
				local166.anInt3751 = local27;
				local38.aClass158Array2[local27] = local166;
				if (local38.aClass158Array1 != local38.aClass158Array2) {
					local38.aClass158Array1[local27] = local166;
				}
				if (arg1) {
					aClass158_12 = local166;
				} else {
					aClass158_11 = local166;
				}
				Static178.method2729(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass158_12 : aClass158_11;
				if (local220.anInt3751 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static145.method2412(local220.anInt3823);
				local248.aClass158Array2[local220.anInt3751] = null;
				Static178.method2729(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static145.method2412(intStack[--isp]);
				local220.aClass158Array2 = null;
				local220.aClass158Array1 = null;
				Static178.method2729(local220);
				return;
			}
			if (arg0 == 200) {
				isp -= 2;
				local15 = intStack[isp];
				local21 = intStack[isp + 1];
				local303 = Static15.method186(local21, local15);
				if (local303 != null && local21 != -1) {
					intStack[isp++] = 1;
					if (arg1) {
						aClass158_12 = local303;
						return;
					}
					aClass158_11 = local303;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = intStack[--isp];
				local248 = Static145.method2412(local15);
				if (local248 != null) {
					intStack[isp++] = 1;
					if (arg1) {
						aClass158_12 = local248;
						return;
					}
					aClass158_11 = local248;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (arg0 == 202 || arg0 == 204) {
				if (arg0 == 202) {
					local21 = intStack[--isp];
					local220 = Static145.method2412(local21);
				} else {
					local220 = arg1 ? aClass158_12 : aClass158_11;
				}
				method6422(local220);
				return;
			}
			if (arg0 == 203 || arg0 == 205) {
				if (arg0 == 203) {
					local21 = intStack[--isp];
					local220 = Static145.method2412(local21);
				} else {
					local220 = arg1 ? aClass158_12 : aClass158_11;
				}
				method6424(local220);
				return;
			}
		} else {
			@Pc(506) int local506;
			@Pc(575) boolean local575;
			if (arg0 < 500) {
				if (arg0 == 403) {
					isp -= 2;
					local15 = intStack[isp];
					local21 = intStack[isp + 1];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static698.anIntArray831.length; local27++) {
						if (Static698.anIntArray831[local27] == local15) {
							Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.method4555(local21, Static68.aClass217_3, local27);
							return;
						}
					}
					for (local506 = 0; local506 < Static540.anIntArray594.length; local506++) {
						if (Static540.anIntArray594[local506] == local15) {
							Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.method4555(local21, Static68.aClass217_3, local506);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					isp -= 2;
					local15 = intStack[isp];
					local21 = intStack[isp + 1];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 == null) {
						return;
					}
					Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.method4556(local15, local21);
					return;
				}
				if (arg0 == 410) {
					local575 = intStack[--isp] != 0;
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 == null) {
						return;
					}
					Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.method4554(local575);
					return;
				}
				if (arg0 == 411) {
					isp -= 2;
					local15 = intStack[isp];
					local21 = intStack[isp + 1];
					if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 == null) {
						return;
					}
					Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.method4558(local21, local15, Static419.aClass112_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1791) String local1791;
				@Pc(1394) String local1394;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static145.method2412(intStack[--isp]);
					} else {
						local220 = arg1 ? aClass158_12 : aClass158_11;
					}
					if (arg0 == 1100) {
						isp -= 2;
						local220.anInt3820 = intStack[isp];
						if (local220.anInt3820 > local220.anInt3779 - local220.anInt3813) {
							local220.anInt3820 = local220.anInt3779 - local220.anInt3813;
						}
						if (local220.anInt3820 < 0) {
							local220.anInt3820 = 0;
						}
						local220.anInt3778 = intStack[isp + 1];
						if (local220.anInt3778 > local220.anInt3752 - local220.anInt3756) {
							local220.anInt3778 = local220.anInt3752 - local220.anInt3756;
						}
						if (local220.anInt3778 < 0) {
							local220.anInt3778 = 0;
						}
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static435.method5869(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1101) {
						local220.anInt3789 = intStack[--isp];
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static633.method9432(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1102) {
						local220.aBoolean294 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1103) {
						local220.anInt3790 = intStack[--isp];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1104) {
						local220.anInt3788 = intStack[--isp];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1105) {
						local21 = intStack[--isp];
						if (local220.anInt3821 != local21) {
							local220.anInt3821 = local21;
							Static178.method2729(local220);
						}
						if (local220.anInt3751 == -1) {
							Static236.method3450(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1106) {
						local220.anInt3775 = intStack[--isp];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1107) {
						local220.aBoolean301 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1108) {
						local220.anInt3834 = 1;
						local220.anInt3842 = intStack[--isp];
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1109) {
						isp -= 6;
						local220.anInt3746 = intStack[isp];
						local220.anInt3815 = intStack[isp + 1];
						local220.anInt3818 = intStack[isp + 2];
						local220.anInt3822 = intStack[isp + 3];
						local220.anInt3747 = intStack[isp + 4];
						local220.anInt3804 = intStack[isp + 5];
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static77.method1558(local220.anInt3823);
							Static580.method7658(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = intStack[--isp];
						if (local21 != local220.anInt3799) {
							if (local21 == -1) {
								local220.aClass152_6 = null;
							} else {
								if (local220.aClass152_6 == null) {
									local220.aClass152_6 = new Class152_Sub1();
								}
								local220.aClass152_6.method9120(true, local21);
							}
							local220.anInt3799 = local21;
							Static178.method2729(local220);
						}
						if (local220.anInt3751 == -1) {
							Static62.method1423(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1111) {
						local220.aBoolean285 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1112) {
						local1394 = aStringArray37[--anInt7160];
						if (!local1394.equals(local220.aString44)) {
							local220.aString44 = local1394;
							Static178.method2729(local220);
						}
						if (local220.anInt3751 == -1) {
							Static611.method8234(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1113) {
						local220.anInt3791 = intStack[--isp];
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static273.method3959(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1114) {
						isp -= 3;
						local220.anInt3829 = intStack[isp];
						local220.anInt3825 = intStack[isp + 1];
						local220.anInt3758 = intStack[isp + 2];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1115) {
						local220.aBoolean286 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1116) {
						local220.anInt3783 = intStack[--isp];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1117) {
						local220.anInt3809 = intStack[--isp];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1118) {
						local220.aBoolean291 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1119) {
						local220.aBoolean293 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1120) {
						isp -= 2;
						local220.anInt3779 = intStack[isp];
						local220.anInt3752 = intStack[isp + 1];
						Static178.method2729(local220);
						if (local220.anInt3831 == 0) {
							Static134.method8963(local220, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local220.aBoolean292 = intStack[--isp] == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1123) {
						local220.anInt3804 = intStack[--isp];
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static77.method1558(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = intStack[--isp];
						local220.aBoolean287 = local21 == 1;
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1125) {
						isp -= 2;
						local220.anInt3765 = intStack[isp];
						local220.anInt3810 = intStack[isp + 1];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1126) {
						local220.anInt3798 = intStack[--isp];
						Static178.method2729(local220);
						return;
					}
					@Pc(1756) Class298 local1756;
					if (arg0 == 1127) {
						isp -= 2;
						local21 = intStack[isp];
						local27 = intStack[isp + 1];
						local1756 = Static386.aClass49_2.method1161(local21);
						if (local27 != local1756.anInt7532) {
							local220.method3385(local21, local27);
							return;
						}
						local220.method3402(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = intStack[--isp];
						local1791 = aStringArray37[--anInt7160];
						local1756 = Static386.aClass49_2.method1161(local21);
						if (!local1756.aString89.equals(local1791)) {
							local220.method3396(local1791, local21);
							return;
						}
						local220.method3402(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = intStack[--isp];
						if ((local220.anInt3831 == 5 || arg0 != 1129) && (local220.anInt3831 == 4 || arg0 != 1130)) {
							if (local220.anInt3755 != local21) {
								local220.anInt3755 = local21;
								Static178.method2729(local220);
							}
							if (local220.anInt3751 == -1) {
								Static80.method1583(local220.anInt3823);
							}
							return;
						}
						return;
					}
					@Pc(1899) short local1899;
					@Pc(1892) short local1892;
					if (arg0 == 1131) {
						isp -= 3;
						local21 = intStack[isp];
						local1892 = (short) intStack[isp + 1];
						local1899 = (short) intStack[isp + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method3406(local1899, local21, local1892);
							Static178.method2729(local220);
							if (local220.anInt3751 == -1) {
								Static321.method4626(local220.anInt3823, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						isp -= 3;
						local21 = intStack[isp];
						local1892 = (short) intStack[isp + 1];
						local1899 = (short) intStack[isp + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method3388(local1892, local21, local1899);
							Static178.method2729(local220);
							if (local220.anInt3751 == -1) {
								Static693.method9020(local220.anInt3823, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1133) {
						local220.aBoolean299 = intStack[--isp] == 1;
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static682.method8933(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1134) {
						isp -= 2;
						local21 = intStack[isp];
						local27 = intStack[isp + 1];
						local1756 = Static386.aClass49_2.method1161(local21);
						if (local27 != local1756.anInt7532) {
							local220.method3385(local21, local27);
							return;
						}
						local220.method3402(local21);
						return;
					}
					if (arg0 == 1135) {
						local220.aBoolean295 = intStack[--isp] == 1;
						Static178.method2729(local220);
						if (local220.anInt3751 == -1) {
							Static71.method1523(local220.anInt3823);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static145.method2412(intStack[--isp]);
					} else {
						local220 = arg1 ? aClass158_12 : aClass158_11;
					}
					Static178.method2729(local220);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						isp -= 2;
						local21 = intStack[isp];
						local27 = intStack[isp + 1];
						if (local220.anInt3751 == -1) {
							Static329.method1631(local220.anInt3823);
							Static77.method1558(local220.anInt3823);
							Static580.method7658(local220.anInt3823);
						}
						if (local21 == -1) {
							local220.anInt3834 = 1;
							local220.anInt3842 = -1;
							local220.anInt3770 = -1;
							return;
						}
						local220.anInt3770 = local21;
						local220.anInt3828 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local220.aBoolean288 = true;
						} else {
							local220.aBoolean288 = false;
						}
						@Pc(2236) Class384 local2236 = Static419.aClass112_1.method2486(local21);
						local220.anInt3818 = local2236.anInt10134;
						local220.anInt3822 = local2236.anInt10123;
						local220.anInt3747 = local2236.anInt10121;
						local220.anInt3746 = local2236.anInt10154;
						local220.anInt3815 = local2236.anInt10126;
						local220.anInt3804 = local2236.anInt10125;
						if (arg0 == 1205 || arg0 == 1209) {
							local220.anInt3767 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local220.anInt3767 = 1;
						} else {
							local220.anInt3767 = 2;
						}
						if (local220.anInt3811 > 0) {
							local220.anInt3804 = local220.anInt3804 * 32 / local220.anInt3811;
							return;
						}
						if (local220.anInt3754 > 0) {
							local220.anInt3804 = local220.anInt3804 * 32 / local220.anInt3754;
						}
						return;
					}
					if (arg0 == 1201) {
						local220.anInt3834 = 2;
						local220.anInt3842 = intStack[--isp];
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1202) {
						local220.anInt3834 = 3;
						local220.anInt3842 = -1;
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1203) {
						local220.anInt3834 = 6;
						local220.anInt3842 = intStack[--isp];
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1204) {
						local220.anInt3834 = 5;
						local220.anInt3842 = intStack[--isp];
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1206) {
						isp -= 4;
						local220.anInt3835 = intStack[isp];
						local220.anInt3773 = intStack[isp + 1];
						local220.anInt3807 = intStack[isp + 2];
						local220.anInt3792 = intStack[isp + 3];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1207) {
						isp -= 2;
						local220.anInt3826 = intStack[isp];
						local220.anInt3796 = intStack[isp + 1];
						Static178.method2729(local220);
						return;
					}
					if (arg0 == 1210) {
						isp -= 4;
						local220.anInt3842 = intStack[isp];
						local220.anInt3748 = intStack[isp + 1];
						if (intStack[isp + 2] == 1) {
							local220.anInt3834 = 9;
						} else {
							local220.anInt3834 = 8;
						}
						if (intStack[isp + 3] == 1) {
							local220.aBoolean288 = true;
						} else {
							local220.aBoolean288 = false;
						}
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
					if (arg0 == 1211) {
						local220.anInt3834 = 5;
						local220.anInt3842 = Static312.anInt5017;
						local220.anInt3748 = 0;
						if (local220.anInt3751 == -1) {
							Static96.method8826(local220.anInt3823);
						}
						return;
					}
				} else {
					@Pc(2978) int local2978;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static145.method2412(intStack[--isp]);
						} else {
							local220 = arg1 ? aClass158_12 : aClass158_11;
						}
						if (arg0 == 1300) {
							local21 = intStack[--isp] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local220.method3391(aStringArray37[--anInt7160], local21);
								return;
							}
							anInt7160--;
							return;
						}
						if (arg0 == 1301) {
							isp -= 2;
							local21 = intStack[isp];
							local27 = intStack[isp + 1];
							if (local21 == -1 && local27 == -1) {
								local220.aClass158_6 = null;
								return;
							}
							local220.aClass158_6 = Static15.method186(local27, local21);
							return;
						}
						if (arg0 == 1302) {
							local21 = intStack[--isp];
							if (local21 != Static351.anInt5739 && local21 != Static137.anInt2519 && local21 != Static237.anInt6544) {
								return;
							}
							local220.anInt3841 = local21;
							return;
						}
						if (arg0 == 1303) {
							local220.anInt3764 = intStack[--isp];
							return;
						}
						if (arg0 == 1304) {
							local220.anInt3808 = intStack[--isp];
							return;
						}
						if (arg0 == 1305) {
							local220.aString41 = aStringArray37[--anInt7160];
							return;
						}
						if (arg0 == 1306) {
							local220.aString43 = aStringArray37[--anInt7160];
							return;
						}
						if (arg0 == 1307) {
							local220.aStringArray17 = null;
							return;
						}
						if (arg0 == 1308) {
							local220.anInt3830 = intStack[--isp];
							local220.anInt3759 = intStack[--isp];
							return;
						}
						if (arg0 == 1309) {
							local21 = intStack[--isp];
							local27 = intStack[--isp];
							if (local27 >= 1 && local27 <= 10) {
								local220.method3397(local27 - 1, local21);
							}
							return;
						}
						if (arg0 == 1310) {
							local220.aString42 = aStringArray37[--anInt7160];
							return;
						}
						if (arg0 == 1311) {
							local220.anInt3786 = intStack[--isp];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								isp -= 3;
								local21 = intStack[isp] - 1;
								local27 = intStack[isp + 1];
								local506 = intStack[isp + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								isp -= 2;
								local21 = 10;
								local27 = intStack[isp];
								local506 = intStack[isp + 1];
							}
							if (local220.aByteArray37 == null) {
								if (local27 == 0) {
									return;
								}
								local220.aByteArray37 = new byte[11];
								local220.aByteArray36 = new byte[11];
								local220.anIntArray293 = new int[11];
							}
							local220.aByteArray37[local21] = (byte) local27;
							if (local27 == 0) {
								local220.aBoolean296 = false;
								for (local2978 = 0; local2978 < local220.aByteArray37.length; local2978++) {
									if (local220.aByteArray37[local2978] != 0) {
										local220.aBoolean296 = true;
										break;
									}
								}
							} else {
								local220.aBoolean296 = true;
							}
							local220.aByteArray36[local21] = (byte) local506;
							return;
						}
						if (arg0 == 1314) {
							local220.anInt3793 = intStack[--isp];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static145.method2412(intStack[--isp]);
						} else {
							local220 = arg1 ? aClass158_12 : aClass158_11;
						}
						if (arg0 == 1499) {
							local220.method3399();
							return;
						}
						local1394 = aStringArray37[--anInt7160];
						@Pc(3077) int[] local3077 = null;
						if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
							local506 = intStack[--isp];
							if (local506 > 0) {
								local3077 = new int[local506];
								while (local506-- > 0) {
									local3077[local506] = intStack[--isp];
								}
							}
							local1394 = local1394.substring(0, local1394.length() - 1);
						}
						@Pc(3131) Object[] local3131 = new Object[local1394.length() + 1];
						for (local2978 = local3131.length - 1; local2978 >= 1; local2978--) {
							if (local1394.charAt(local2978 - 1) == 's') {
								local3131[local2978] = aStringArray37[--anInt7160];
							} else if (local1394.charAt(local2978 - 1) == '§') {
								local3131[local2978] = Long.valueOf(aLongArray14[--anInt7173]);
							} else {
								local3131[local2978] = Integer.valueOf(intStack[--isp]);
							}
						}
						local72 = intStack[--isp];
						if (local72 == -1) {
							local3131 = null;
						} else {
							local3131[0] = Integer.valueOf(local72);
						}
						if (arg0 == 1400) {
							local220.anObjectArray17 = local3131;
						} else if (arg0 == 1401) {
							local220.anObjectArray32 = local3131;
						} else if (arg0 == 1402) {
							local220.anObjectArray1 = local3131;
						} else if (arg0 == 1403) {
							local220.anObjectArray4 = local3131;
						} else if (arg0 == 1404) {
							local220.anObjectArray26 = local3131;
						} else if (arg0 == 1405) {
							local220.anObjectArray30 = local3131;
						} else if (arg0 == 1406) {
							local220.anObjectArray16 = local3131;
						} else if (arg0 == 1407) {
							local220.anObjectArray25 = local3131;
							local220.anIntArray300 = local3077;
						} else if (arg0 == 1408) {
							local220.anObjectArray3 = local3131;
						} else if (arg0 == 1409) {
							local220.anObjectArray15 = local3131;
						} else if (arg0 == 1410) {
							local220.anObjectArray5 = local3131;
						} else if (arg0 == 1411) {
							local220.anObjectArray24 = local3131;
						} else if (arg0 == 1412) {
							local220.anObjectArray28 = local3131;
						} else if (arg0 == 1414) {
							local220.anObjectArray8 = local3131;
							local220.anIntArray299 = local3077;
						} else if (arg0 == 1415) {
							local220.anObjectArray21 = local3131;
							local220.anIntArray295 = local3077;
						} else if (arg0 == 1416) {
							local220.anObjectArray14 = local3131;
						} else if (arg0 == 1417) {
							local220.anObjectArray11 = local3131;
						} else if (arg0 == 1418) {
							local220.anObjectArray7 = local3131;
						} else if (arg0 == 1419) {
							local220.anObjectArray22 = local3131;
						} else if (arg0 == 1420) {
							local220.anObjectArray29 = local3131;
						} else if (arg0 == 1421) {
							local220.anObjectArray27 = local3131;
						} else if (arg0 == 1422) {
							local220.anObjectArray34 = local3131;
						} else if (arg0 == 1423) {
							local220.anObjectArray20 = local3131;
						} else if (arg0 == 1424) {
							local220.anObjectArray6 = local3131;
						} else if (arg0 == 1425) {
							local220.anObjectArray9 = local3131;
						} else if (arg0 == 1426) {
							local220.anObjectArray31 = local3131;
						} else if (arg0 == 1427) {
							local220.anObjectArray19 = local3131;
						} else if (arg0 == 1428) {
							local220.anObjectArray2 = local3131;
							local220.anIntArray298 = local3077;
						} else if (arg0 == 1429) {
							local220.anObjectArray18 = local3131;
							local220.anIntArray296 = local3077;
						} else if (arg0 == 1430) {
							local220.anObjectArray10 = local3131;
						} else if (arg0 == 1431) {
							local220.anObjectArray23 = local3131;
						} else if (arg0 == 1432) {
							local220.anObjectArray12 = local3131;
						} else if (arg0 == 1433) {
							local220.anObjectArray33 = local3131;
						}
						local220.aBoolean297 = true;
						return;
					} else if (arg0 < 1600) {
						local220 = arg1 ? aClass158_12 : aClass158_11;
						if (arg0 == 1500) {
							intStack[isp++] = local220.anInt3745;
							return;
						}
						if (arg0 == 1501) {
							intStack[isp++] = local220.anInt3794;
							return;
						}
						if (arg0 == 1502) {
							intStack[isp++] = local220.anInt3813;
							return;
						}
						if (arg0 == 1503) {
							intStack[isp++] = local220.anInt3756;
							return;
						}
						if (arg0 == 1504) {
							intStack[isp++] = local220.aBoolean284 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							intStack[isp++] = local220.anInt3753;
							return;
						}
						if (arg0 == 1506) {
							local248 = Static556.method7306(local220);
							intStack[isp++] = local248 == null ? -1 : local248.anInt3823;
							return;
						}
						if (arg0 == 1507) {
							intStack[isp++] = local220.anInt3789;
							return;
						}
					} else {
						@Pc(3848) Class298 local3848;
						if (arg0 < 1700) {
							local220 = arg1 ? aClass158_12 : aClass158_11;
							if (arg0 == 1600) {
								intStack[isp++] = local220.anInt3820;
								return;
							}
							if (arg0 == 1601) {
								intStack[isp++] = local220.anInt3778;
								return;
							}
							if (arg0 == 1602) {
								aStringArray37[anInt7160++] = local220.aString44;
								return;
							}
							if (arg0 == 1603) {
								intStack[isp++] = local220.anInt3779;
								return;
							}
							if (arg0 == 1604) {
								intStack[isp++] = local220.anInt3752;
								return;
							}
							if (arg0 == 1605) {
								intStack[isp++] = local220.anInt3804;
								return;
							}
							if (arg0 == 1606) {
								intStack[isp++] = local220.anInt3818;
								return;
							}
							if (arg0 == 1607) {
								intStack[isp++] = local220.anInt3747;
								return;
							}
							if (arg0 == 1608) {
								intStack[isp++] = local220.anInt3822;
								return;
							}
							if (arg0 == 1609) {
								intStack[isp++] = local220.anInt3790;
								return;
							}
							if (arg0 == 1610) {
								intStack[isp++] = local220.anInt3746;
								return;
							}
							if (arg0 == 1611) {
								intStack[isp++] = local220.anInt3815;
								return;
							}
							if (arg0 == 1612) {
								intStack[isp++] = local220.anInt3821;
								return;
							}
							if (arg0 == 1613) {
								local21 = intStack[--isp];
								local3848 = Static386.aClass49_2.method1161(local21);
								if (local3848.method6679()) {
									aStringArray37[anInt7160++] = local220.method3389(local3848.aString89, local21);
									return;
								}
								intStack[isp++] = local220.method3404(local3848.anInt7532, local21);
								return;
							}
							if (arg0 == 1614) {
								intStack[isp++] = local220.anInt3775;
								return;
							}
							if (arg0 == 2614) {
								intStack[isp++] = local220.anInt3834 == 1 ? local220.anInt3842 : -1;
								return;
							}
							if (arg0 == 1618) {
								intStack[isp++] = local220.anInt3791;
								return;
							}
						} else if (arg0 < 1800) {
							local220 = arg1 ? aClass158_12 : aClass158_11;
							if (arg0 == 1700) {
								intStack[isp++] = local220.anInt3770;
								return;
							}
							if (arg0 == 1701) {
								if (local220.anInt3770 != -1) {
									intStack[isp++] = local220.anInt3828;
									return;
								}
								intStack[isp++] = 0;
								return;
							}
							if (arg0 == 1702) {
								intStack[isp++] = local220.anInt3751;
								return;
							}
						} else if (arg0 < 1900) {
							local220 = arg1 ? aClass158_12 : aClass158_11;
							if (arg0 == 1800) {
								intStack[isp++] = Static84.method1661(local220).method6223();
								return;
							}
							if (arg0 == 1801) {
								local21 = intStack[--isp];
								local21--;
								if (local220.aStringArray17 != null && local21 < local220.aStringArray17.length && local220.aStringArray17[local21] != null) {
									aStringArray37[anInt7160++] = local220.aStringArray17[local21];
									return;
								}
								aStringArray37[anInt7160++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local220.aString41 == null) {
									aStringArray37[anInt7160++] = "";
									return;
								}
								aStringArray37[anInt7160++] = local220.aString41;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local220 = Static145.method2412(intStack[--isp]);
								arg0 -= 1000;
							} else {
								local220 = arg1 ? aClass158_12 : aClass158_11;
							}
							if (anInt7174 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local220.anObjectArray19 == null) {
									return;
								}
								@Pc(4169) Class2_Sub42 local4169 = new Class2_Sub42();
								local4169.aClass158_14 = local220;
								local4169.anObjectArray36 = local220.anObjectArray19;
								local4169.anInt7241 = anInt7174 + 1;
								Static521.aClass341_44.method7718(local4169);
								return;
							}
						} else if (arg0 < 2600) {
							local220 = Static145.method2412(intStack[--isp]);
							if (arg0 == 2500) {
								intStack[isp++] = local220.anInt3745;
								return;
							}
							if (arg0 == 2501) {
								intStack[isp++] = local220.anInt3794;
								return;
							}
							if (arg0 == 2502) {
								intStack[isp++] = local220.anInt3813;
								return;
							}
							if (arg0 == 2503) {
								intStack[isp++] = local220.anInt3756;
								return;
							}
							if (arg0 == 2504) {
								intStack[isp++] = local220.aBoolean284 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								intStack[isp++] = local220.anInt3753;
								return;
							}
							if (arg0 == 2506) {
								local248 = Static556.method7306(local220);
								intStack[isp++] = local248 == null ? -1 : local248.anInt3823;
								return;
							}
							if (arg0 == 2507) {
								intStack[isp++] = local220.anInt3789;
								return;
							}
						} else if (arg0 < 2700) {
							local220 = Static145.method2412(intStack[--isp]);
							if (arg0 == 2600) {
								intStack[isp++] = local220.anInt3820;
								return;
							}
							if (arg0 == 2601) {
								intStack[isp++] = local220.anInt3778;
								return;
							}
							if (arg0 == 2602) {
								aStringArray37[anInt7160++] = local220.aString44;
								return;
							}
							if (arg0 == 2603) {
								intStack[isp++] = local220.anInt3779;
								return;
							}
							if (arg0 == 2604) {
								intStack[isp++] = local220.anInt3752;
								return;
							}
							if (arg0 == 2605) {
								intStack[isp++] = local220.anInt3804;
								return;
							}
							if (arg0 == 2606) {
								intStack[isp++] = local220.anInt3818;
								return;
							}
							if (arg0 == 2607) {
								intStack[isp++] = local220.anInt3747;
								return;
							}
							if (arg0 == 2608) {
								intStack[isp++] = local220.anInt3822;
								return;
							}
							if (arg0 == 2609) {
								intStack[isp++] = local220.anInt3790;
								return;
							}
							if (arg0 == 2610) {
								intStack[isp++] = local220.anInt3746;
								return;
							}
							if (arg0 == 2611) {
								intStack[isp++] = local220.anInt3815;
								return;
							}
							if (arg0 == 2612) {
								intStack[isp++] = local220.anInt3821;
								return;
							}
							if (arg0 == 2613) {
								intStack[isp++] = local220.anInt3775;
								return;
							}
							if (arg0 == 2614) {
								intStack[isp++] = local220.anInt3834 == 1 ? local220.anInt3842 : -1;
								return;
							}
							if (arg0 == 2617) {
								intStack[isp++] = local220.anInt3791;
								return;
							}
						} else {
							@Pc(4760) Class2_Sub4 local4760;
							@Pc(4653) Class2_Sub4 local4653;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local220 = Static145.method2412(intStack[--isp]);
									intStack[isp++] = local220.anInt3770;
									return;
								}
								if (arg0 == 2701) {
									local220 = Static145.method2412(intStack[--isp]);
									if (local220.anInt3770 != -1) {
										intStack[isp++] = local220.anInt3828;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local15 = intStack[--isp];
									local4653 = (Class2_Sub4) Static548.aClass28_40.method738(local15);
									if (local4653 != null) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local220 = Static145.method2412(intStack[--isp]);
									if (local220.aClass158Array2 == null) {
										intStack[isp++] = 0;
										return;
									}
									local21 = local220.aClass158Array2.length;
									for (local27 = 0; local27 < local220.aClass158Array2.length; local27++) {
										if (local220.aClass158Array2[local27] == null) {
											local21 = local27;
											break;
										}
									}
									intStack[isp++] = local21;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									isp -= 2;
									local15 = intStack[isp];
									local21 = intStack[isp + 1];
									local4760 = (Class2_Sub4) Static548.aClass28_40.method738(local15);
									if (local4760 != null && local4760.anInt147 == local21) {
										intStack[isp++] = 1;
										return;
									}
									intStack[isp++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local220 = Static145.method2412(intStack[--isp]);
								if (arg0 == 2800) {
									intStack[isp++] = Static84.method1661(local220).method6223();
									return;
								}
								if (arg0 == 2801) {
									local21 = intStack[--isp];
									local21--;
									if (local220.aStringArray17 != null && local21 < local220.aStringArray17.length && local220.aStringArray17[local21] != null) {
										aStringArray37[anInt7160++] = local220.aStringArray17[local21];
										return;
									}
									aStringArray37[anInt7160++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local220.aString41 == null) {
										aStringArray37[anInt7160++] = "";
										return;
									}
									aStringArray37[anInt7160++] = local220.aString41;
									return;
								}
							} else {
								@Pc(5005) Class2_Sub19 local5005;
								@Pc(4911) String local4911;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4911 = aStringArray37[--anInt7160];
										Static695.method9272(local4911);
										return;
									}
									if (arg0 == 3101) {
										isp -= 2;
										Static550.method7267(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2, intStack[isp + 1], intStack[isp]);
										return;
									}
									if (arg0 == 3103) {
										Static77.method1557();
										return;
									}
									if (arg0 == 3104) {
										local4911 = aStringArray37[--anInt7160];
										local21 = 0;
										if (Static467.method6357(local4911)) {
											local21 = Static647.method8480(local4911);
										}
										@Pc(4974) Class2_Sub19 local4974 = Static293.method4342(Static330.aClass347_66, Static405.aClass153_2.aClass186_1);
										local4974.aClass2_Sub21_Sub2_1.p4(local21);
										Static405.aClass153_2.method3275(local4974);
										return;
									}
									if (arg0 == 3105) {
										local4911 = aStringArray37[--anInt7160];
										local5005 = Static293.method4342(Static276.aClass347_56, Static405.aClass153_2.aClass186_1);
										local5005.aClass2_Sub21_Sub2_1.p1(local4911.length() + 1);
										local5005.aClass2_Sub21_Sub2_1.pjstr(local4911);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3106) {
										local4911 = aStringArray37[--anInt7160];
										local5005 = Static293.method4342(Static137.aClass347_28, Static405.aClass153_2.aClass186_1);
										local5005.aClass2_Sub21_Sub2_1.p1(local4911.length() + 1);
										local5005.aClass2_Sub21_Sub2_1.pjstr(local4911);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3107) {
										local15 = intStack[--isp];
										local1394 = aStringArray37[--anInt7160];
										Static242.method3504(local1394, local15);
										return;
									}
									if (arg0 == 3108) {
										isp -= 3;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										local27 = intStack[isp + 2];
										local38 = Static145.method2412(local27);
										Static597.method7831(local21, local38, local15);
										return;
									}
									if (arg0 == 3109) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										local303 = arg1 ? aClass158_12 : aClass158_11;
										Static597.method7831(local21, local303, local15);
										return;
									}
									if (arg0 == 3110) {
										local15 = intStack[--isp];
										local5005 = Static293.method4342(Static209.aClass347_37, Static405.aClass153_2.aClass186_1);
										local5005.aClass2_Sub21_Sub2_1.p2(local15);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3111) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										local4760 = (Class2_Sub4) Static548.aClass28_40.method738(local15);
										if (local4760 != null) {
											Static449.method6122(true, local4760.anInt147 != local21, local4760);
										}
										Static163.method8857(3, local21, local15, true);
										return;
									}
									if (arg0 == 3112) {
										isp--;
										local15 = intStack[isp];
										local4653 = (Class2_Sub4) Static548.aClass28_40.method738(local15);
										if (local4653 != null && local4653.anInt146 == 3) {
											Static449.method6122(true, true, local4653);
										}
										return;
									}
									if (arg0 == 3113) {
										Static57.method1231(aStringArray37[--anInt7160]);
										return;
									}
									if (arg0 == 3114) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										local1791 = aStringArray37[--anInt7160];
										Static44.method1072(local1791, "", local21, "", "", local15);
										return;
									}
									if (arg0 == 3115) {
										isp -= 11;
										@Pc(5320) Class405[] local5320 = Static33.method882();
										@Pc(5323) Class103[] local5323 = Static313.method4551();
										Static124.method2216(intStack[isp + 7], intStack[isp + 2], intStack[isp + 9], intStack[isp + 4], local5323[intStack[isp + 1]], intStack[isp + 5], intStack[isp + 8], intStack[isp + 6], intStack[isp + 3], local5320[intStack[isp]], intStack[isp + 10]);
										return;
									}
									if (arg0 == 3116) {
										local15 = intStack[--isp];
										local5005 = Static293.method4342(Static436.aClass347_44, Static405.aClass153_2.aClass186_1);
										local5005.aClass2_Sub21_Sub2_1.p2(local15);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
									if (arg0 == 3117) {
										local4911 = aStringArray37[--anInt7160];
										local5005 = Static293.method4342(Static357.aClass347_82, Static405.aClass153_2.aClass186_1);
										local5005.aClass2_Sub21_Sub2_1.p1(local4911.length() + 1);
										local5005.aClass2_Sub21_Sub2_1.pjstr(local4911);
										Static405.aClass153_2.method3275(local5005);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										isp -= 3;
										Static161.method2586(256, intStack[isp + 2], intStack[isp], intStack[isp + 1], 255);
										return;
									}
									if (arg0 == 3201) {
										Static63.method1427(255, intStack[--isp], 50);
										return;
									}
									if (arg0 == 3202) {
										isp -= 2;
										Static482.method6488(255, intStack[isp], intStack[isp + 1]);
										return;
									}
									if (arg0 == 3203) {
										isp -= 4;
										Static161.method2586(256, intStack[isp + 2], intStack[isp], intStack[isp + 1], intStack[isp + 3]);
										return;
									}
									if (arg0 == 3204) {
										isp -= 3;
										Static63.method1427(intStack[isp + 1], intStack[isp], intStack[isp + 2]);
										return;
									}
									if (arg0 == 3205) {
										isp -= 3;
										Static482.method6488(intStack[isp + 2], intStack[isp], intStack[isp + 1]);
										return;
									}
									if (arg0 == 3206) {
										isp -= 4;
										Static186.method2818(intStack[isp], intStack[isp + 1], 256, intStack[isp + 2], intStack[isp + 3], false);
										return;
									}
									if (arg0 == 3207) {
										isp -= 4;
										Static186.method2818(intStack[isp], intStack[isp + 1], 256, intStack[isp + 2], intStack[isp + 3], true);
										return;
									}
									if (arg0 == 3208) {
										isp -= 5;
										Static161.method2586(intStack[isp + 4], intStack[isp + 2], intStack[isp], intStack[isp + 1], intStack[isp + 3]);
										return;
									}
									if (arg0 == 3209) {
										isp -= 5;
										Static186.method2818(intStack[isp], intStack[isp + 1], intStack[isp + 4], intStack[isp + 2], intStack[isp + 3], false);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										intStack[isp++] = client.cycle;
										return;
									}
									if (arg0 == 3301) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static597.method7829(local15, local21, false);
										return;
									}
									if (arg0 == 3302) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static536.method7176(local21, false, local15);
										return;
									}
									if (arg0 == 3303) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static67.method6106(local21, local15, false);
										return;
									}
									if (arg0 == 3304) {
										local15 = intStack[--isp];
										intStack[isp++] = Static503.aClass337_1.method7664(local15).anInt2081;
										return;
									}
									if (arg0 == 3305) {
										local15 = intStack[--isp];
										intStack[isp++] = Static581.anIntArray688[local15];
										return;
									}
									if (arg0 == 3306) {
										local15 = intStack[--isp];
										intStack[isp++] = Static498.anIntArray604[local15];
										return;
									}
									if (arg0 == 3307) {
										local15 = intStack[--isp];
										intStack[isp++] = Static237.anIntArray518[local15];
										return;
									}
									if (arg0 == 3308) {
										@Pc(5929) byte local5929 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144;
										local21 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >> 9) + Static691.anInt10395;
										local27 = (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >> 9) + Static116.anInt2279;
										intStack[isp++] = (local5929 << 28) + (local21 << 14) + local27;
										return;
									}
									if (arg0 == 3309) {
										local15 = intStack[--isp];
										intStack[isp++] = local15 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local15 = intStack[--isp];
										intStack[isp++] = local15 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local15 = intStack[--isp];
										intStack[isp++] = local15 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										intStack[isp++] = Static174.aBoolean249 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static597.method7829(local15, local21, true);
										return;
									}
									if (arg0 == 3314) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static536.method7176(local21, true, local15);
										return;
									}
									if (arg0 == 3315) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static67.method6106(local21, local15, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static608.anInt9316 >= 2) {
											intStack[isp++] = Static608.anInt9316;
											return;
										}
										intStack[isp++] = 0;
										return;
									}
									if (arg0 == 3317) {
										intStack[isp++] = Static249.anInt4019;
										return;
									}
									if (arg0 == 3318) {
										intStack[isp++] = Static344.aClass231_1.id;
										return;
									}
									if (arg0 == 3321) {
										intStack[isp++] = Static703.anInt10599;
										return;
									}
									if (arg0 == 3322) {
										intStack[isp++] = Static494.anInt7425;
										return;
									}
									if (arg0 == 3323) {
										if (Static38.anInt932 >= 5 && Static38.anInt932 <= 9) {
											intStack[isp++] = 1;
											return;
										}
										intStack[isp++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static38.anInt932 >= 5 && Static38.anInt932 <= 9) {
											intStack[isp++] = Static38.anInt932;
											return;
										}
										intStack[isp++] = 0;
										return;
									}
									if (arg0 == 3325) {
										intStack[isp++] = Static126.aBoolean200 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										intStack[isp++] = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451;
										return;
									}
									if (arg0 == 3327) {
										intStack[isp++] = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 != null && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.aBoolean385 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										intStack[isp++] = Static617.aBoolean725 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local15 = intStack[--isp];
										intStack[isp++] = Static46.method1082(local15);
										return;
									}
									if (arg0 == 3331) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static390.method5501(false, local21, local15);
										return;
									}
									if (arg0 == 3332) {
										isp -= 2;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										intStack[isp++] = Static390.method5501(true, local21, local15);
										return;
									}
									if (arg0 == 3333) {
										intStack[isp++] = Static696.method9041();
										return;
									}
									if (arg0 == 3335) {
										intStack[isp++] = client.lang;
										return;
									}
									if (arg0 == 3336) {
										isp -= 4;
										local15 = intStack[isp];
										local21 = intStack[isp + 1];
										local27 = intStack[isp + 2];
										local506 = intStack[isp + 3];
										local15 += local21 << 14;
										local15 += local27 << 28;
										local15 += local506;
										intStack[isp++] = local15;
										return;
									}
									if (arg0 == 3337) {
										intStack[isp++] = Static323.affid;
										return;
									}
									if (arg0 == 3338) {
										intStack[isp++] = Static65.method1470();
										return;
									}
									if (arg0 == 3339) {
										intStack[isp++] = 0;
										return;
									}
									if (arg0 == 3340) {
										intStack[isp++] = GameShell.focus ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										intStack[isp++] = Static29.frombilling ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										intStack[isp++] = Static189.aClass120_1.method8860();
										return;
									}
									if (arg0 == 3343) {
										intStack[isp++] = Static189.aClass120_1.method8861();
										return;
									}
									if (arg0 == 3344) {
										aStringArray37[anInt7160++] = Static130.method2281();
										return;
									}
									if (arg0 == 3345) {
										aStringArray37[anInt7160++] = Static690.method9005();
										return;
									}
									if (arg0 == 3346) {
										intStack[isp++] = Static338.method5002();
										return;
									}
									if (arg0 == 3347) {
										intStack[isp++] = Static470.anInt7133;
										return;
									}
									if (arg0 == 3349) {
										intStack[isp++] = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass126_7.method2673(16383) >> 3;
										return;
									}
									if (arg0 == 3350) {
										local4911 = aStringArray37[--anInt7160];
										if (Static416.aString71 != null && Static416.aString71.equalsIgnoreCase(local4911)) {
											intStack[isp++] = 1;
											return;
										}
										intStack[isp++] = 0;
										return;
									}
									if (arg0 == 3351) {
										intStack[isp++] = Static189.aClass120_1.method8849() ? 1 : 0;
										intStack[isp++] = Static189.aClass120_1.method8854() ? 1 : 0;
										intStack[isp++] = Static189.aClass120_1.method8850() ? 1 : 0;
										return;
									}
								} else {
									@Pc(7345) String local7345;
									if (arg0 < 3500) {
										@Pc(6822) Class53 local6822;
										if (arg0 == 3400) {
											isp -= 2;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local6822 = Static619.aClass389_2.method8932(local15);
											aStringArray37[anInt7160++] = local6822.method1229(local21);
											return;
										}
										@Pc(6868) Class53 local6868;
										if (arg0 == 3408) {
											isp -= 4;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local27 = intStack[isp + 2];
											local506 = intStack[isp + 3];
											local6868 = Static619.aClass389_2.method8932(local27);
											if (local6868.aChar2 == local15 && local6868.aChar1 == local21) {
												if (local21 == 115) {
													aStringArray37[anInt7160++] = local6868.method1229(local506);
													return;
												}
												intStack[isp++] = local6868.method1227(local506);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
										}
										@Pc(6963) Class53 local6963;
										if (arg0 == 3409) {
											isp -= 3;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local27 = intStack[isp + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											local6963 = Static619.aClass389_2.method8932(local21);
											if (local6963.aChar1 != local15) {
												throw new RuntimeException("C3409-1");
											}
											intStack[isp++] = local6963.method1233(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = intStack[--isp];
											local1394 = aStringArray37[--anInt7160];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6822 = Static619.aClass389_2.method8932(local15);
											if (local6822.aChar1 != 's') {
												throw new RuntimeException("C3410-1");
											}
											intStack[isp++] = local6822.method1221(local1394) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = intStack[--isp];
											@Pc(7072) Class53 local7072 = Static619.aClass389_2.method8932(local15);
											intStack[isp++] = local7072.method1228();
											return;
										}
										if (arg0 == 3412) {
											isp -= 3;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local27 = intStack[isp + 2];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6963 = Static619.aClass389_2.method8932(local21);
											if (local6963.aChar1 != local15) {
												throw new RuntimeException();
											}
											@Pc(7133) Class2_Sub40 local7133 = local6963.method1223(local27);
											local72 = 0;
											if (local7133 != null) {
												local72 = local7133.anIntArray531.length;
											}
											intStack[isp++] = local72;
											return;
										}
										if (arg0 == 3413) {
											local15 = intStack[--isp];
											local1394 = aStringArray37[--anInt7160];
											if (local15 == -1) {
												throw new RuntimeException();
											}
											local6822 = Static619.aClass389_2.method8932(local15);
											if (local6822.aChar1 != 's') {
												throw new RuntimeException();
											}
											@Pc(7196) Class2_Sub26 local7196 = local6822.method1237(local1394);
											local2978 = 0;
											if (local7196 != null) {
												local2978 = local7196.anIntArray318.length;
											}
											intStack[isp++] = local2978;
											return;
										}
										if (arg0 == 3414) {
											isp -= 5;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local27 = intStack[isp + 2];
											local506 = intStack[isp + 3];
											local2978 = intStack[isp + 4];
											if (local27 == -1) {
												throw new RuntimeException();
											}
											@Pc(7261) Class53 local7261 = Static619.aClass389_2.method8932(local27);
											if (local7261.aChar2 != local21) {
												throw new RuntimeException();
											}
											if (local7261.aChar1 != local15) {
												throw new RuntimeException();
											}
											@Pc(7284) Class2_Sub40 local7284 = local7261.method1223(local506);
											if (local2978 >= 0 && local7284 != null && local7284.anIntArray531.length > local2978) {
												intStack[isp++] = local7284.anIntArray531[local2978];
												return;
											}
											throw new RuntimeException();
										}
										if (arg0 == 3415) {
											isp -= 3;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local27 = intStack[isp + 2];
											local7345 = aStringArray37[--anInt7160];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6868 = Static619.aClass389_2.method8932(local21);
											if (local6868.aChar2 != local15) {
												throw new RuntimeException();
											}
											if (local6868.aChar1 != 's') {
												throw new RuntimeException();
											}
											@Pc(7381) Class2_Sub26 local7381 = local6868.method1237(local7345);
											if (local27 >= 0 && local7381 != null && local7381.anIntArray318.length > local27) {
												intStack[isp++] = local7381.anIntArray318[local27];
												return;
											}
											throw new RuntimeException();
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static251.anInt4047 == 0) {
												intStack[isp++] = -2;
												return;
											}
											if (Static251.anInt4047 == 1) {
												intStack[isp++] = -1;
												return;
											}
											intStack[isp++] = Static327.anInt5411;
											return;
										}
										if (arg0 == 3601) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 == 2 && local15 < Static327.anInt5411) {
												aStringArray37[anInt7160++] = Static330.aStringArray25[local15];
												if (Static572.aStringArray42[local15] != null) {
													aStringArray37[anInt7160++] = Static572.aStringArray42[local15];
													return;
												}
												aStringArray37[anInt7160++] = "";
												return;
											}
											aStringArray37[anInt7160++] = "";
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 == 2 && local15 < Static327.anInt5411) {
												intStack[isp++] = Static371.anIntArray455[local15];
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 == 2 && local15 < Static327.anInt5411) {
												intStack[isp++] = Static715.anIntArray881[local15];
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4911 = aStringArray37[--anInt7160];
											local21 = intStack[--isp];
											Static430.method5826(local4911, local21);
											return;
										}
										if (arg0 == 3605) {
											local4911 = aStringArray37[--anInt7160];
											Static706.method9232(local4911);
											return;
										}
										if (arg0 == 3606) {
											local4911 = aStringArray37[--anInt7160];
											Static545.method7249(local4911);
											return;
										}
										if (arg0 == 3607) {
											local4911 = aStringArray37[--anInt7160];
											Static231.method3382(false, local4911);
											return;
										}
										if (arg0 == 3608) {
											local4911 = aStringArray37[--anInt7160];
											Static726.method9470(local4911);
											return;
										}
										if (arg0 == 3609) {
											local4911 = aStringArray37[--anInt7160];
											if (local4911.startsWith("<img=0>") || local4911.startsWith("<img=1>")) {
												local4911 = local4911.substring(7);
											}
											intStack[isp++] = Static362.method5248(0, local4911) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 == 2 && local15 < Static327.anInt5411) {
												aStringArray37[anInt7160++] = Static419.aStringArray33[local15];
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static723.aString129 != null) {
												aStringArray37[anInt7160++] = Static682.method8930(Static723.aString129);
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static723.aString129 != null) {
												intStack[isp++] = Static706.anInt10661;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = intStack[--isp];
											if (Static723.aString129 != null && local15 < Static706.anInt10661) {
												aStringArray37[anInt7160++] = Static87.aClass243Array1[local15].aString67;
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = intStack[--isp];
											if (Static723.aString129 != null && local15 < Static706.anInt10661) {
												intStack[isp++] = Static87.aClass243Array1[local15].anInt6168;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = intStack[--isp];
											if (Static723.aString129 != null && local15 < Static706.anInt10661) {
												intStack[isp++] = Static87.aClass243Array1[local15].aByte99;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3616) {
											intStack[isp++] = Static673.aByte140;
											return;
										}
										if (arg0 == 3617) {
											local4911 = aStringArray37[--anInt7160];
											Static128.method7761(local4911);
											return;
										}
										if (arg0 == 3618) {
											intStack[isp++] = Static682.aByte142;
											return;
										}
										if (arg0 == 3619) {
											local4911 = aStringArray37[--anInt7160];
											Static698.method9131(local4911);
											return;
										}
										if (arg0 == 3620) {
											Static396.method5558();
											return;
										}
										if (arg0 == 3621) {
											if (Static251.anInt4047 == 0) {
												intStack[isp++] = -1;
												return;
											}
											intStack[isp++] = Static436.anInt3860;
											return;
										}
										if (arg0 == 3622) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 != 0 && local15 < Static436.anInt3860) {
												aStringArray37[anInt7160++] = Static632.aStringArray44[local15];
												if (Static10.aStringArray1[local15] != null) {
													aStringArray37[anInt7160++] = Static10.aStringArray1[local15];
													return;
												}
												aStringArray37[anInt7160++] = "";
												return;
											}
											aStringArray37[anInt7160++] = "";
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4911 = aStringArray37[--anInt7160];
											if (local4911.startsWith("<img=0>") || local4911.startsWith("<img=1>")) {
												local4911 = local4911.substring(7);
											}
											intStack[isp++] = Static71.method1524(local4911) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = intStack[--isp];
											if (Static87.aClass243Array1 != null && local15 < Static706.anInt10661 && Static87.aClass243Array1[local15].aString66.equalsIgnoreCase(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9)) {
												intStack[isp++] = 1;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static158.aString28 != null) {
												aStringArray37[anInt7160++] = Static158.aString28;
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = intStack[--isp];
											if (Static723.aString129 != null && local15 < Static706.anInt10661) {
												aStringArray37[anInt7160++] = Static87.aClass243Array1[local15].aString65;
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 == 2 && local15 >= 0 && local15 < Static327.anInt5411) {
												intStack[isp++] = Static623.aBooleanArray30[local15] ? 1 : 0;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4911 = aStringArray37[--anInt7160];
											if (local4911.startsWith("<img=0>") || local4911.startsWith("<img=1>")) {
												local4911 = local4911.substring(7);
											}
											intStack[isp++] = Static664.method8665(local4911);
											return;
										}
										if (arg0 == 3629) {
											intStack[isp++] = Static584.country;
											return;
										}
										if (arg0 == 3630) {
											local4911 = aStringArray37[--anInt7160];
											Static231.method3382(true, local4911);
											return;
										}
										if (arg0 == 3631) {
											local15 = intStack[--isp];
											intStack[isp++] = Static65.aBooleanArray2[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = intStack[--isp];
											if (Static723.aString129 != null && local15 < Static706.anInt10661) {
												aStringArray37[anInt7160++] = Static87.aClass243Array1[local15].aString66;
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 != 0 && local15 < Static436.anInt3860) {
												aStringArray37[anInt7160++] = Static446.aStringArray35[local15];
												return;
											}
											aStringArray37[anInt7160++] = "";
											return;
										}
										if (arg0 == 3634) {
											local15 = intStack[--isp];
											if (Static251.anInt4047 == 2 && local15 < Static327.anInt5411) {
												intStack[isp++] = Static429.aBooleanArray21[local15] ? 1 : 0;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static91.aClass164_9 != null) {
												intStack[isp++] = 1;
												aClass164_7 = Static91.aClass164_9;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static128.aClass164_8 != null) {
												intStack[isp++] = 1;
												aClass164_7 = Static128.aClass164_8;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray37[anInt7160++] = aClass164_7.aString45;
											return;
										}
										if (arg0 == 3703) {
											intStack[isp++] = aClass164_7.aBoolean307 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											intStack[isp++] = aClass164_7.aByte68;
											return;
										}
										if (arg0 == 3705) {
											intStack[isp++] = aClass164_7.aByte67;
											return;
										}
										if (arg0 == 3706) {
											intStack[isp++] = aClass164_7.aByte66;
											return;
										}
										if (arg0 == 3707) {
											intStack[isp++] = aClass164_7.aByte65;
											return;
										}
										if (arg0 == 3709) {
											intStack[isp++] = aClass164_7.anInt3950;
											return;
										}
										if (arg0 == 3710) {
											local15 = intStack[--isp];
											aStringArray37[anInt7160++] = aClass164_7.aStringArray18[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = intStack[--isp];
											intStack[isp++] = aClass164_7.aByteArray40[local15];
											return;
										}
										if (arg0 == 3712) {
											intStack[isp++] = aClass164_7.anInt3952;
											return;
										}
										if (arg0 == 3713) {
											local15 = intStack[--isp];
											aStringArray37[anInt7160++] = aClass164_7.aStringArray19[local15];
											return;
										}
										if (arg0 == 3714) {
											isp -= 3;
											local15 = intStack[isp];
											local21 = intStack[isp + 1];
											local27 = intStack[isp + 2];
											intStack[isp++] = aClass164_7.method3497(local21, local27, local15);
											return;
										}
										if (arg0 == 3715) {
											intStack[isp++] = aClass164_7.anInt3967;
											return;
										}
										if (arg0 == 3716) {
											intStack[isp++] = aClass164_7.anInt3958;
											return;
										}
										if (arg0 == 3717) {
											intStack[isp++] = aClass164_7.method3479(aStringArray37[--anInt7160]);
											return;
										}
										if (arg0 == 3718) {
											intStack[isp - 1] = aClass164_7.method3487()[intStack[isp - 1]];
											return;
										}
										if (arg0 == 3719) {
											Static180.method2775(intStack[--isp]);
											return;
										}
										if (arg0 == 3720) {
											local15 = intStack[--isp];
											intStack[isp++] = aClass164_7.anIntArray308[local15];
											return;
										}
										if (arg0 == 3750) {
											if (Static674.aClass2_Sub47_3 != null) {
												intStack[isp++] = 1;
												aClass2_Sub47_2 = Static674.aClass2_Sub47_3;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static45.aClass2_Sub47_1 != null) {
												intStack[isp++] = 1;
												aClass2_Sub47_2 = Static45.aClass2_Sub47_1;
												return;
											}
											intStack[isp++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray37[anInt7160++] = aClass2_Sub47_2.aString101;
											return;
										}
										if (arg0 == 3753) {
											intStack[isp++] = aClass2_Sub47_2.aByte127;
											return;
										}
										if (arg0 == 3754) {
											intStack[isp++] = aClass2_Sub47_2.aByte128;
											return;
										}
										if (arg0 == 3755) {
											intStack[isp++] = aClass2_Sub47_2.anInt8309;
											return;
										}
										if (arg0 == 3756) {
											local15 = intStack[--isp];
											aStringArray37[anInt7160++] = aClass2_Sub47_2.aClass34Array1[local15].aString2;
											return;
										}
										if (arg0 == 3757) {
											local15 = intStack[--isp];
											intStack[isp++] = aClass2_Sub47_2.aClass34Array1[local15].aByte9;
											return;
										}
										if (arg0 == 3758) {
											local15 = intStack[--isp];
											intStack[isp++] = aClass2_Sub47_2.aClass34Array1[local15].anInt786;
											return;
										}
										if (arg0 == 3759) {
											local15 = intStack[--isp];
											Static525.method7893(aClass2_Sub47_2 == Static45.aClass2_Sub47_1, local15);
											return;
										}
										if (arg0 == 3760) {
											intStack[isp++] = aClass2_Sub47_2.method7285(aStringArray37[--anInt7160]);
											return;
										}
										if (arg0 == 3761) {
											intStack[isp - 1] = aClass2_Sub47_2.method7279()[intStack[isp - 1]];
											return;
										}
										if (arg0 == 3790) {
											intStack[isp++] = Static279.anObjectArray35 == null ? 0 : 1;
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = intStack[--isp];
											intStack[isp++] = Static105.aClass171Array1[local15].method3547();
											return;
										}
										if (arg0 == 3904) {
											local15 = intStack[--isp];
											intStack[isp++] = Static105.aClass171Array1[local15].anInt4044;
											return;
										}
										if (arg0 == 3905) {
											local15 = intStack[--isp];
											intStack[isp++] = Static105.aClass171Array1[local15].anInt4051;
											return;
										}
										if (arg0 == 3906) {
											local15 = intStack[--isp];
											intStack[isp++] = Static105.aClass171Array1[local15].anInt4045;
											return;
										}
										if (arg0 == 3907) {
											local15 = intStack[--isp];
											intStack[isp++] = Static105.aClass171Array1[local15].anInt4046;
											return;
										}
										if (arg0 == 3908) {
											local15 = intStack[--isp];
											intStack[isp++] = Static105.aClass171Array1[local15].anInt4043;
											return;
										}
										if (arg0 == 3910) {
											local15 = intStack[--isp];
											local21 = Static105.aClass171Array1[local15].method3548();
											intStack[isp++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = intStack[--isp];
											local21 = Static105.aClass171Array1[local15].method3548();
											intStack[isp++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = intStack[--isp];
											local21 = Static105.aClass171Array1[local15].method3548();
											intStack[isp++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = intStack[--isp];
											local21 = Static105.aClass171Array1[local15].method3548();
											intStack[isp++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(9705) long local9705;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = intStack[--isp];
												intStack[isp++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = intStack[--isp];
												intStack[isp++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												isp -= 5;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local27 = intStack[isp + 2];
												local506 = intStack[isp + 3];
												local2978 = intStack[isp + 4];
												intStack[isp++] = local15 + (local21 - local15) * (local2978 - local27) / (local506 - local27);
												return;
											}
											@Pc(9712) long local9712;
											if (arg0 == 4007) {
												isp -= 2;
												local9705 = intStack[isp];
												local9712 = intStack[isp + 1];
												intStack[isp++] = (int) (local9705 + local9705 * local9712 / 100L);
												return;
											}
											if (arg0 == 4008) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												if (local15 == 0) {
													intStack[isp++] = 0;
													return;
												}
												intStack[isp++] = (int) Math.pow(local15, local21);
												return;
											}
											if (arg0 == 4013) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												if (local15 == 0) {
													intStack[isp++] = 0;
													return;
												}
												if (local21 == 0) {
													intStack[isp++] = Integer.MAX_VALUE;
													return;
												}
												intStack[isp++] = (int) Math.pow(local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												intStack[isp++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												isp -= 3;
												local9705 = intStack[isp];
												local9712 = intStack[isp + 1];
												@Pc(10099) long local10099 = intStack[isp + 2];
												intStack[isp++] = (int) (local9705 * local10099 / local9712);
												return;
											}
											if (arg0 == 4019) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												if (local15 > 700 || local21 > 700) {
													intStack[isp++] = 256;
												}
												@Pc(10162) double local10162 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												intStack[isp++] = (int) (Math.pow(2.0D, local10162) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = intStack[--isp];
												intStack[isp++] = Static323.anIntArray389[Static105.method2043(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4911 = aStringArray37[--anInt7160];
												local21 = intStack[--isp];
												aStringArray37[anInt7160++] = local4911 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt7160 -= 2;
												local4911 = aStringArray37[anInt7160];
												local1394 = aStringArray37[anInt7160 + 1];
												aStringArray37[anInt7160++] = local4911 + local1394;
												return;
											}
											if (arg0 == 4102) {
												local4911 = aStringArray37[--anInt7160];
												local21 = intStack[--isp];
												aStringArray37[anInt7160++] = local4911 + Static593.method7787(true, local21);
												return;
											}
											if (arg0 == 4103) {
												local4911 = aStringArray37[--anInt7160];
												aStringArray37[anInt7160++] = local4911.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray37[anInt7160++] = Static522.method7001(client.lang, Static38.method1003(intStack[--isp]));
												return;
											}
											if (arg0 == 4105) {
												anInt7160 -= 2;
												local4911 = aStringArray37[anInt7160];
												local1394 = aStringArray37[anInt7160 + 1];
												if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 != null && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1.aBoolean385) {
													aStringArray37[anInt7160++] = local1394;
													return;
												}
												aStringArray37[anInt7160++] = local4911;
												return;
											}
											if (arg0 == 4106) {
												local15 = intStack[--isp];
												aStringArray37[anInt7160++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt7160 -= 2;
												intStack[isp++] = Static540.method6545(aStringArray37[anInt7160 + 1], client.lang, aStringArray37[anInt7160]);
												return;
											}
											@Pc(10482) Class383 local10482;
											if (arg0 == 4108) {
												local4911 = aStringArray37[--anInt7160];
												isp -= 2;
												local21 = intStack[isp];
												local27 = intStack[isp + 1];
												local10482 = Static74.method1535(local27, Static697.aClass332_123);
												intStack[isp++] = local10482.method8746(local4911, Static679.aClass23Array14, local21);
												return;
											}
											if (arg0 == 4109) {
												local4911 = aStringArray37[--anInt7160];
												isp -= 2;
												local21 = intStack[isp];
												local27 = intStack[isp + 1];
												local10482 = Static74.method1535(local27, Static697.aClass332_123);
												intStack[isp++] = local10482.method8748(Static679.aClass23Array14, local4911, local21);
												return;
											}
											if (arg0 == 4110) {
												anInt7160 -= 2;
												local4911 = aStringArray37[anInt7160];
												local1394 = aStringArray37[anInt7160 + 1];
												if (intStack[--isp] == 1) {
													aStringArray37[anInt7160++] = local4911;
													return;
												}
												aStringArray37[anInt7160++] = local1394;
												return;
											}
											if (arg0 == 4111) {
												local4911 = aStringArray37[--anInt7160];
												aStringArray37[anInt7160++] = Static130.method2280(local4911);
												return;
											}
											if (arg0 == 4112) {
												local4911 = aStringArray37[--anInt7160];
												local21 = intStack[--isp];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray37[anInt7160++] = local4911 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = intStack[--isp];
												intStack[isp++] = method6430((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = intStack[--isp];
												intStack[isp++] = Static596.method7822((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = intStack[--isp];
												intStack[isp++] = Static245.method8635((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = intStack[--isp];
												intStack[isp++] = Static277.method4043((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4911 = aStringArray37[--anInt7160];
												if (local4911 != null) {
													intStack[isp++] = local4911.length();
													return;
												}
												intStack[isp++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4911 = aStringArray37[--anInt7160];
												isp -= 2;
												local21 = intStack[isp];
												local27 = intStack[isp + 1];
												aStringArray37[anInt7160++] = local4911.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4911 = aStringArray37[--anInt7160];
												@Pc(10848) StringBuffer local10848 = new StringBuffer(local4911.length());
												@Pc(10850) boolean local10850 = false;
												for (local506 = 0; local506 < local4911.length(); local506++) {
													@Pc(10857) char local10857 = local4911.charAt(local506);
													if (local10857 == '<') {
														local10850 = true;
													} else if (local10857 == '>') {
														local10850 = false;
													} else if (!local10850) {
														local10848.append(local10857);
													}
												}
												aStringArray37[anInt7160++] = local10848.toString();
												return;
											}
											if (arg0 == 4120) {
												local4911 = aStringArray37[--anInt7160];
												isp -= 2;
												local21 = intStack[isp];
												local27 = intStack[isp + 1];
												intStack[isp++] = local4911.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt7160 -= 2;
												local4911 = aStringArray37[anInt7160];
												local1394 = aStringArray37[anInt7160 + 1];
												local27 = intStack[--isp];
												intStack[isp++] = local4911.indexOf(local1394, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = intStack[--isp];
												intStack[isp++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = intStack[--isp];
												intStack[isp++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local575 = intStack[--isp] != 0;
												local21 = intStack[--isp];
												aStringArray37[anInt7160++] = Static573.method7578(client.lang, local575, local21, 0);
												return;
											}
											if (arg0 == 4125) {
												local4911 = aStringArray37[--anInt7160];
												local21 = intStack[--isp];
												@Pc(11077) Class383 local11077 = Static74.method1535(local21, Static697.aClass332_123);
												intStack[isp++] = local11077.method8749(Static679.aClass23Array14, local4911);
												return;
											}
											if (arg0 == 4126) {
												aStringArray37[anInt7160++] = Static647.method8481((long) intStack[--isp] * 60000L, client.lang) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local9705 = aLongArray14[--anInt7173];
												aStringArray37[anInt7160++] = local9705 == -1L ? "" : Long.toString(local9705, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = intStack[--isp];
												aStringArray37[anInt7160++] = Static419.aClass112_1.method2486(local15).aString118;
												return;
											}
											@Pc(11206) Class384 local11206;
											if (arg0 == 4201) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local11206 = Static419.aClass112_1.method2486(local15);
												if (local21 >= 1 && local21 <= 5 && local11206.aStringArray46[local21 - 1] != null) {
													aStringArray37[anInt7160++] = local11206.aStringArray46[local21 - 1];
													return;
												}
												aStringArray37[anInt7160++] = "";
												return;
											}
											if (arg0 == 4202) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local11206 = Static419.aClass112_1.method2486(local15);
												if (local21 >= 1 && local21 <= 5 && local11206.aStringArray45[local21 - 1] != null) {
													aStringArray37[anInt7160++] = local11206.aStringArray45[local21 - 1];
													return;
												}
												aStringArray37[anInt7160++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = intStack[--isp];
												intStack[isp++] = Static419.aClass112_1.method2486(local15).anInt10170;
												return;
											}
											if (arg0 == 4204) {
												local15 = intStack[--isp];
												intStack[isp++] = Static419.aClass112_1.method2486(local15).anInt10142 == 1 ? 1 : 0;
												return;
											}
											@Pc(11380) Class384 local11380;
											if (arg0 == 4205) {
												local15 = intStack[--isp];
												local11380 = Static419.aClass112_1.method2486(local15);
												if (local11380.anInt10114 == -1 && local11380.anInt10137 >= 0) {
													intStack[isp++] = local11380.anInt10137;
													return;
												}
												intStack[isp++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = intStack[--isp];
												local11380 = Static419.aClass112_1.method2486(local15);
												if (local11380.anInt10114 >= 0 && local11380.anInt10137 >= 0) {
													intStack[isp++] = local11380.anInt10137;
													return;
												}
												intStack[isp++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = intStack[--isp];
												intStack[isp++] = Static419.aClass112_1.method2486(local15).aBoolean771 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6679()) {
													aStringArray37[anInt7160++] = Static419.aClass112_1.method2486(local15).method8807(local3848.aString89, local21);
													return;
												}
												intStack[isp++] = Static419.aClass112_1.method2486(local15).method8801(local21, local3848.anInt7532);
												return;
											}
											if (arg0 == 4209) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1] - 1;
												local11206 = Static419.aClass112_1.method2486(local15);
												if (local11206.anInt10150 == local21) {
													intStack[isp++] = local11206.anInt10116;
													return;
												}
												if (local11206.anInt10120 == local21) {
													intStack[isp++] = local11206.anInt10118;
													return;
												}
												intStack[isp++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4911 = aStringArray37[--anInt7160];
												local21 = intStack[--isp];
												Static331.method4931(local21 == 1, local4911);
												intStack[isp++] = Static606.anInt8971;
												return;
											}
											if (arg0 == 4211) {
												if (Static256.aShortArray63 != null && Static143.anInt4065 < Static606.anInt8971) {
													intStack[isp++] = Static256.aShortArray63[Static143.anInt4065++] & 0xFFFF;
													return;
												}
												intStack[isp++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static143.anInt4065 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = intStack[--isp];
												intStack[isp++] = Static419.aClass112_1.method2486(local15).anInt10130;
												return;
											}
											if (arg0 == 4214) {
												local4911 = aStringArray37[--anInt7160];
												isp -= 3;
												local21 = intStack[isp];
												local27 = intStack[isp + 1];
												local506 = intStack[isp + 2];
												Static263.method3855(local21 == 1, local506, local27, local4911);
												intStack[isp++] = Static606.anInt8971;
												return;
											}
											if (arg0 == 4215) {
												anInt7160 -= 2;
												isp -= 2;
												local4911 = aStringArray37[anInt7160];
												local21 = intStack[isp];
												local27 = intStack[isp + 1];
												local7345 = aStringArray37[anInt7160 + 1];
												Static715.method9354(local4911, local27, local7345, 8, local21 == 1);
												intStack[isp++] = Static606.anInt8971;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6679()) {
													aStringArray37[anInt7160++] = Static690.aClass310_2.method7099(local15).method5998(local3848.aString89, local21);
													return;
												}
												intStack[isp++] = Static690.aClass310_2.method7099(local15).method6002(local21, local3848.anInt7532);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6679()) {
													aStringArray37[anInt7160++] = Static354.aClass142_4.method3063(local15, 46).method1297(local3848.aString89, local21);
													return;
												}
												intStack[isp++] = Static354.aClass142_4.method3063(local15, 59).method1316(local3848.anInt7532, local21);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												isp -= 2;
												local15 = intStack[isp];
												local21 = intStack[isp + 1];
												local3848 = Static386.aClass49_2.method1161(local21);
												if (local3848.method6679()) {
													aStringArray37[anInt7160++] = Static652.aClass216_1.method5045(local15).method91(local21, local3848.aString89);
													return;
												}
												intStack[isp++] = Static652.aClass216_1.method5045(local15).method89(local3848.anInt7532, local21);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = intStack[--isp];
												@Pc(12037) Class291 local12037 = Static574.aClass312_2.method7125(local15);
												if (local12037.anIntArray587 != null && local12037.anIntArray587.length > 0) {
													local27 = 0;
													local506 = local12037.anIntArray589[0];
													for (local2978 = 1; local2978 < local12037.anIntArray587.length; local2978++) {
														if (local12037.anIntArray589[local2978] > local506) {
															local27 = local2978;
															local506 = local12037.anIntArray589[local2978];
														}
													}
													intStack[isp++] = local12037.anIntArray587[local27];
													return;
												}
												intStack[isp++] = local12037.anInt7253;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												intStack[isp++] = Static587.aBoolean664 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4911 = aStringArray37[--anInt7160];
												if (Static283.anInt4588 == 7 && !Static242.method3500()) {
													if (local4911.length() > 20) {
														Static486.aByte115 = -4;
														return;
													}
													Static486.aByte115 = -1;
													local5005 = Static293.method4342(Static429.aClass347_81, Static405.aClass153_1.aClass186_1);
													local5005.aClass2_Sub21_Sub2_1.p1(0);
													local27 = local5005.aClass2_Sub21_Sub2_1.pos;
													local5005.aClass2_Sub21_Sub2_1.pjstr(local4911);
													local5005.aClass2_Sub21_Sub2_1.method7387(local5005.aClass2_Sub21_Sub2_1.pos - local27);
													Static405.aClass153_1.method3275(local5005);
													return;
												}
												Static486.aByte115 = -5;
												return;
											}
											if (arg0 == 4702) {
												intStack[isp++] = Static486.aByte115;
												if (Static486.aByte115 != -1) {
													Static486.aByte115 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static145.method2412(intStack[--isp]);
				} else {
					local220 = arg1 ? aClass158_12 : aClass158_11;
				}
				if (arg0 == 1000) {
					isp -= 4;
					local220.anInt3837 = intStack[isp];
					local220.anInt3819 = intStack[isp + 1];
					local21 = intStack[isp + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = intStack[isp + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local220.aByte61 = (byte) local21;
					local220.aByte64 = (byte) local27;
					Static178.method2729(local220);
					Static44.method1073(local220);
					if (local220.anInt3751 == -1) {
						Static415.method5705(local220.anInt3823);
					}
					return;
				}
				if (arg0 == 1001) {
					isp -= 4;
					local220.anInt3754 = intStack[isp];
					local220.anInt3772 = intStack[isp + 1];
					local220.anInt3811 = 0;
					local220.anInt3836 = 0;
					local21 = intStack[isp + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = intStack[isp + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local220.aByte63 = (byte) local21;
					local220.aByte62 = (byte) local27;
					Static178.method2729(local220);
					Static44.method1073(local220);
					if (local220.anInt3831 == 0) {
						Static134.method8963(local220, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(834) boolean local834 = intStack[--isp] == 1;
					if (local220.aBoolean284 != local834) {
						local220.aBoolean284 = local834;
						Static178.method2729(local220);
					}
					if (local220.anInt3751 == -1) {
						Static550.method7272(local220.anInt3823);
					}
					return;
				}
				if (arg0 == 1004) {
					isp -= 2;
					local220.anInt3806 = intStack[isp];
					local220.anInt3760 = intStack[isp + 1];
					Static178.method2729(local220);
					Static44.method1073(local220);
					if (local220.anInt3831 == 0) {
						Static134.method8963(local220, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local220.aBoolean300 = intStack[--isp] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!hda;)V")
	public static void method6424(@OriginalArg(0) Class158 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class158[] local69;
		if (arg0.anInt3751 == -1) {
			@Pc(106) int local106 = arg0.anInt3823 >>> 16;
			@Pc(110) Class158[] local110 = Static148.aClass158ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static453.aClass158ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static148.aClass158ArrayArray1[local106] = new Class158[local119];
				Static734.method7698(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static734.method7698(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class158 local12 = Static145.method2412(arg0.anInt3753);
		if (local12 == null) {
			return;
		}
		if (local12.aClass158Array1 == local12.aClass158Array2) {
			local12.aClass158Array1 = new Class158[local12.aClass158Array2.length];
			local12.aClass158Array1[0] = arg0;
			Static734.method7698(local12.aClass158Array2, 0, local12.aClass158Array1, 1, arg0.anInt3751);
			Static734.method7698(local12.aClass158Array2, arg0.anInt3751 + 1, local12.aClass158Array1, arg0.anInt3751 + 1, local12.aClass158Array2.length - arg0.anInt3751 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass158Array1;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static734.method7698(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(IZ)V")
	public static void method6425() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!fj;I)V")
	public static void method6426(@OriginalArg(0) Class2_Sub2_Sub10 arg0, @OriginalArg(1) int arg1) {
		isp = 0;
		anInt7160 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray254;
		@Pc(11) int[] local11 = arg0.anIntArray255;
		@Pc(13) byte local13 = -1;
		anInt7161 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label381: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean538 && (aString76 == null || arg0.aString31 != null && arg0.aString31.indexOf(aString76) != -1)) {
					System.out.println(arg0.aString31 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method6423(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method6428(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					intStack[isp++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						intStack[isp++] = Static34.aClass306_1.anIntArray621[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static34.aClass306_1.method6873(local96, intStack[--isp]);
					} else if (local34 == 3) {
						aStringArray37[anInt7160++] = arg0.aStringArray14[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						isp -= 2;
						if (intStack[isp] != intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						isp -= 2;
						if (intStack[isp] == intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						isp -= 2;
						if (intStack[isp] < intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						isp -= 2;
						if (intStack[isp] > intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt7161 == 0) {
							return;
						}
						@Pc(270) Class143 local270 = aClass143Array1[--anInt7161];
						arg0 = local270.aClass2_Sub2_Sub10_1;
						local8 = arg0.anIntArray254;
						local11 = arg0.anIntArray255;
						local5 = local270.anInt3401;
						anIntArray580 = local270.anIntArray276;
						aStringArray36 = local270.aStringArray16;
						aLongArray15 = local270.aLongArray5;
					} else if (local34 == 25) {
						local96 = local11[local5];
						intStack[isp++] = Static34.aClass306_1.method6871(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static34.aClass306_1.method6875(intStack[--isp], local96);
					} else if (local34 == 31) {
						isp -= 2;
						if (intStack[isp] <= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						isp -= 2;
						if (intStack[isp] >= intStack[isp + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						intStack[isp++] = anIntArray580[local11[local5]];
					} else if (local34 == 34) {
						anIntArray580[local11[local5]] = intStack[--isp];
					} else if (local34 == 35) {
						aStringArray37[anInt7160++] = aStringArray36[local11[local5]];
					} else if (local34 == 36) {
						aStringArray36[local11[local5]] = aStringArray37[--anInt7160];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt7160 -= local96;
							local465 = Static142.method2381(local96, anInt7160, aStringArray37);
							aStringArray37[anInt7160++] = local465;
						} else if (local34 == 38) {
							isp--;
						} else if (local34 == 39) {
							anInt7160--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class2_Sub2_Sub10 local503 = Static488.method6532(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt2957];
							@Pc(518) String[] local518 = new String[local503.anInt2959];
							@Pc(522) long[] local522 = new long[local503.anInt2958];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt2960; local524++) {
								local514[local524] = intStack[isp + local524 - local503.anInt2960];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt2962; local543++) {
								local518[local543] = aStringArray37[anInt7160 + local543 - local503.anInt2962];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt2963; local562++) {
								local522[local562] = aLongArray14[anInt7173 + local562 - local503.anInt2963];
							}
							isp -= local503.anInt2960;
							anInt7160 -= local503.anInt2962;
							anInt7173 -= local503.anInt2963;
							@Pc(598) Class143 local598 = new Class143();
							local598.aClass2_Sub2_Sub10_1 = arg0;
							local598.anInt3401 = local5;
							local598.anIntArray276 = anIntArray580;
							local598.aStringArray16 = aStringArray36;
							local598.aLongArray5 = aLongArray15;
							if (anInt7161 >= aClass143Array1.length) {
								throw new RuntimeException();
							}
							aClass143Array1[anInt7161++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray254;
							local11 = local503.anIntArray255;
							local5 = -1;
							anIntArray580 = local514;
							aStringArray36 = local518;
							aLongArray15 = local522;
						} else if (local34 == 42) {
							intStack[isp++] = Static511.anIntArray614[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static511.anIntArray614[local96] = intStack[--isp];
							Static135.method7246(local96);
							Static624.aBoolean728 |= Static118.aBooleanArray4[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = intStack[--isp];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray581[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray177[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = intStack[--isp];
							if (local706 < 0 || local706 >= anIntArray581[local96]) {
								throw new RuntimeException();
							}
							intStack[isp++] = anIntArrayArray177[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							isp -= 2;
							local706 = intStack[isp];
							if (local706 < 0 || local706 >= anIntArray581[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray177[local96][local706] = intStack[isp + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static37.aStringArray4[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray37[anInt7160++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static37.aStringArray4[local96] = aStringArray37[--anInt7160];
							Static85.method9269(local96);
						} else if (local34 == 51) {
							@Pc(889) Class28 local889 = arg0.aClass28Array1[local11[local5]];
							@Pc(902) Class2_Sub38 local902 = (Class2_Sub38) local889.method738(intStack[--isp]);
							if (local902 != null) {
								local5 += local902.anInt6399;
							}
						} else if (local34 == 54) {
							aLongArray14[anInt7173++] = arg0.aLongArray4[local5];
						} else if (local34 == 55) {
							anInt7173--;
						} else if (local34 == 66) {
							aLongArray14[anInt7173++] = aLongArray15[local11[local5]];
						} else if (local34 == 67) {
							aLongArray15[local11[local5]] = aLongArray14[--anInt7173];
						} else if (local34 == 68) {
							anInt7173 -= 2;
							if (aLongArray14[anInt7173] != aLongArray14[anInt7173 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt7173 -= 2;
							if (aLongArray14[anInt7173] == aLongArray14[anInt7173 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt7173 -= 2;
							if (aLongArray14[anInt7173] < aLongArray14[anInt7173 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt7173 -= 2;
							if (aLongArray14[anInt7173] > aLongArray14[anInt7173 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt7173 -= 2;
							if (aLongArray14[anInt7173] <= aLongArray14[anInt7173 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt7173 -= 2;
							if (aLongArray14[anInt7173] >= aLongArray14[anInt7173 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (intStack[--isp] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (intStack[--isp] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static279.anObjectArray35[local96];
							if (local1178 == null) {
								@Pc(1185) Class122 local1185 = Static628.aClass344_5.method7792(local96);
								if (local1185.aChar3 == 'i' || local1185.aChar3 == '1') {
									intStack[isp++] = 0;
								} else {
									intStack[isp++] = -1;
								}
							} else {
								intStack[isp++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class122 local1236 = Static628.aClass344_5.method7792(local96);
							if (local1236.aChar3 != '\u0001') {
								intStack[isp++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static279.anObjectArray35[local1236.anInt2825];
							if (local1256 == null) {
								intStack[isp++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt2826 == 31 ? -1 : (0x1 << local1236.anInt2826 + 1) - 1;
								intStack[isp++] = (local1256 & local1284) >>> local1236.anInt2821;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static279.anObjectArray35[local96];
							if (local1311 == null) {
								aLongArray14[anInt7173++] = -1L;
							} else {
								aLongArray14[anInt7173++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static279.anObjectArray35[local96];
							if (local465 == null) {
								aStringArray37[anInt7160++] = "";
							} else {
								aStringArray37[anInt7160++] = local465;
							}
						} else if (local34 == 112) {
							intStack[isp++] = method6419(local11[local5]);
						} else if (local34 == 113) {
							intStack[isp++] = method6418(local11[local5]);
						} else if (local34 == 114) {
							aLongArray14[anInt7173++] = method6420(local11[local5]);
						} else if (local34 == 115) {
							aStringArray37[anInt7160++] = method6432(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.key).append(" ");
			for (local706 = anInt7161 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass143Array1[local706].aClass2_Sub2_Sub10_1.key).append(" ");
			}
			local1484.append("op: ").append(local13);
			TracingException.report(local1479, local1484.toString());
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!pd;)V")
	public static void method6427(@OriginalArg(0) Class2_Sub42 arg0) {
		method6429(arg0, 200000);
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(IZ)V")
	public static void method6428(@OriginalArg(0) int opcode, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (opcode < 5100) {
			if (opcode == 5000) {
				intStack[isp++] = Static133.anInt2467;
				return;
			}
			@Pc(57) Class153 local57;
			@Pc(63) Class2_Sub19 local63;
			if (opcode == 5001) {
				isp -= 3;
				Static133.anInt2467 = intStack[isp];
				Static726.aClass282_7 = Static189.method2864(intStack[isp + 1]);
				if (Static726.aClass282_7 == null) {
					Static726.aClass282_7 = Static137.aClass282_4;
				}
				Static87.anInt1814 = intStack[isp + 2];
				local57 = Static668.method8708();
				local63 = Static293.method4342(Static98.aClass347_20, local57.aClass186_1);
				local63.aClass2_Sub21_Sub2_1.p1(Static133.anInt2467);
				local63.aClass2_Sub21_Sub2_1.p1(Static726.aClass282_7.anInt7060);
				local63.aClass2_Sub21_Sub2_1.p1(Static87.anInt1814);
				local57.method3275(local63);
				return;
			}
			if (opcode == 5002) {
				anInt7160 -= 2;
				local95 = aStringArray37[anInt7160];
				local101 = aStringArray37[anInt7160 + 1];
				isp -= 2;
				local109 = intStack[isp];
				local115 = intStack[isp + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class153 local135 = Static668.method8708();
				@Pc(141) Class2_Sub19 local141 = Static293.method4342(Static245.aClass347_114, local135.aClass186_1);
				local141.aClass2_Sub21_Sub2_1.p1(Static231.method3379(local95) + Static231.method3379(local101) + 2);
				local141.aClass2_Sub21_Sub2_1.pjstr(local95);
				local141.aClass2_Sub21_Sub2_1.p1(local109 - 1);
				local141.aClass2_Sub21_Sub2_1.p1(local115);
				local141.aClass2_Sub21_Sub2_1.pjstr(local101);
				local135.method3275(local141);
				return;
			}
			@Pc(196) Class285 local196;
			if (opcode == 5003) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString78 != null) {
					local198 = local196.aString78;
				}
				aStringArray37[anInt7160++] = local198;
				return;
			}
			if (opcode == 5004) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7187;
				}
				intStack[isp++] = local109;
				return;
			}
			if (opcode == 5005) {
				if (Static726.aClass282_7 == null) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Static726.aClass282_7.anInt7060;
				return;
			}
			@Pc(295) Class2_Sub19 local295;
			@Pc(289) Class153 local289;
			if (opcode == 5006) {
				local192 = intStack[--isp];
				local289 = Static668.method8708();
				local295 = Static293.method4342(Static356.aClass347_67, local289.aClass186_1);
				local295.aClass2_Sub21_Sub2_1.p1(local192);
				local289.method3275(local295);
				return;
			}
			if (opcode == 5008) {
				local95 = aStringArray37[--anInt7160];
				method6433(local95, opcode);
				return;
			}
			if (opcode == 5009) {
				anInt7160 -= 2;
				local95 = aStringArray37[anInt7160];
				local101 = aStringArray37[anInt7160 + 1];
				if (Static608.anInt9316 != 0 || (!Static389.aBoolean459 || Static34.aBoolean62) && !Static617.aBoolean725) {
					@Pc(360) Class153 local360 = Static668.method8708();
					@Pc(366) Class2_Sub19 local366 = Static293.method4342(ClientProt.aClass347_52, local360.aClass186_1);
					local366.aClass2_Sub21_Sub2_1.p2(0);
					local375 = local366.aClass2_Sub21_Sub2_1.pos;
					local366.aClass2_Sub21_Sub2_1.pjstr(local95);
					Static523.method3446(local366.aClass2_Sub21_Sub2_1, local101);
					local366.aClass2_Sub21_Sub2_1.psize2(local366.aClass2_Sub21_Sub2_1.pos - local375);
					local360.method3275(local366);
					return;
				}
				return;
			}
			if (opcode == 5010) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString81 != null) {
					local198 = local196.aString81;
				}
				aStringArray37[anInt7160++] = local198;
				return;
			}
			if (opcode == 5011) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString79 != null) {
					local198 = local196.aString79;
				}
				aStringArray37[anInt7160++] = local198;
				return;
			}
			if (opcode == 5012) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7188;
				}
				intStack[isp++] = local109;
				return;
			}
			if (opcode == 5015) {
				if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == null || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 == null) {
					local95 = "";
				} else {
					local95 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method1424(false);
				}
				aStringArray37[anInt7160++] = local95;
				return;
			}
			if (opcode == 5016) {
				intStack[isp++] = Static87.anInt1814;
				return;
			}
			if (opcode == 5017) {
				intStack[isp++] = Static402.method5585();
				return;
			}
			if (opcode == 5018) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt7192;
				}
				intStack[isp++] = local109;
				return;
			}
			if (opcode == 5019) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString80 != null) {
					local198 = local196.aString80;
				}
				aStringArray37[anInt7160++] = local198;
				return;
			}
			if (opcode == 5020) {
				if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 == null || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString8 == null) {
					local95 = "";
				} else {
					local95 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method1422();
				}
				aStringArray37[anInt7160++] = local95;
				return;
			}
			if (opcode == 5023) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7184;
				}
				intStack[isp++] = local109;
				return;
			}
			if (opcode == 5024) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt7185;
				}
				intStack[isp++] = local109;
				return;
			}
			if (opcode == 5025) {
				local192 = intStack[--isp];
				local196 = Static8.method122(local192);
				local198 = "";
				if (local196 != null && local196.aString77 != null) {
					local198 = local196.aString77;
				}
				aStringArray37[anInt7160++] = local198;
				return;
			}
			if (opcode == 5050) {
				local192 = intStack[--isp];
				aStringArray37[anInt7160++] = Static68.aClass151_3.method3234(local192).aString4;
				return;
			}
			@Pc(793) Class2_Sub2_Sub3 local793;
			if (opcode == 5051) {
				local192 = intStack[--isp];
				local793 = Static68.aClass151_3.method3234(local192);
				if (local793.anIntArray93 == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local793.anIntArray93.length;
				return;
			}
			if (opcode == 5052) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				@Pc(839) Class2_Sub2_Sub3 local839 = Static68.aClass151_3.method3234(local192);
				local115 = local839.anIntArray93[local834];
				intStack[isp++] = local115;
				return;
			}
			if (opcode == 5053) {
				local192 = intStack[--isp];
				local793 = Static68.aClass151_3.method3234(local192);
				if (local793.anIntArray94 == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local793.anIntArray94.length;
				return;
			}
			if (opcode == 5054) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				intStack[isp++] = Static68.aClass151_3.method3234(local192).anIntArray94[local834];
				return;
			}
			if (opcode == 5055) {
				local192 = intStack[--isp];
				aStringArray37[anInt7160++] = Static288.aClass139_2.method2950(local192).method3906();
				return;
			}
			if (opcode == 5056) {
				local192 = intStack[--isp];
				@Pc(966) Class2_Sub2_Sub12 local966 = Static288.aClass139_2.method2950(local192);
				if (local966.anIntArray333 == null) {
					intStack[isp++] = 0;
					return;
				}
				intStack[isp++] = local966.anIntArray333.length;
				return;
			}
			if (opcode == 5057) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				intStack[isp++] = Static288.aClass139_2.method2950(local192).anIntArray333[local834];
				return;
			}
			if (opcode == 5058) {
				aClass21_1 = new Class21();
				aClass21_1.anInt523 = intStack[--isp];
				aClass21_1.aClass2_Sub2_Sub12_1 = Static288.aClass139_2.method2950(aClass21_1.anInt523);
				aClass21_1.anIntArray29 = new int[aClass21_1.aClass2_Sub2_Sub12_1.method3901()];
				return;
			}
			if (opcode == 5059) {
				local57 = Static668.method8708();
				local63 = Static293.method4342(Static456.aClass347_85, local57.aClass186_1);
				local63.aClass2_Sub21_Sub2_1.p1(0);
				local109 = local63.aClass2_Sub21_Sub2_1.pos;
				local63.aClass2_Sub21_Sub2_1.p1(0);
				local63.aClass2_Sub21_Sub2_1.p2(aClass21_1.anInt523);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aClass2_Sub21_Sub2_1, aClass21_1.anIntArray29);
				local63.aClass2_Sub21_Sub2_1.method7387(local63.aClass2_Sub21_Sub2_1.pos - local109);
				local57.method3275(local63);
				return;
			}
			if (opcode == 5060) {
				local95 = aStringArray37[--anInt7160];
				local289 = Static668.method8708();
				local295 = Static293.method4342(Static234.aClass347_46, local289.aClass186_1);
				local295.aClass2_Sub21_Sub2_1.p1(0);
				local115 = local295.aClass2_Sub21_Sub2_1.pos;
				local295.aClass2_Sub21_Sub2_1.pjstr(local95);
				local295.aClass2_Sub21_Sub2_1.p2(aClass21_1.anInt523);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local295.aClass2_Sub21_Sub2_1, aClass21_1.anIntArray29);
				local295.aClass2_Sub21_Sub2_1.method7387(local295.aClass2_Sub21_Sub2_1.pos - local115);
				local289.method3275(local295);
				return;
			}
			if (opcode == 5061) {
				local57 = Static668.method8708();
				local63 = Static293.method4342(Static456.aClass347_85, local57.aClass186_1);
				local63.aClass2_Sub21_Sub2_1.p1(0);
				local109 = local63.aClass2_Sub21_Sub2_1.pos;
				local63.aClass2_Sub21_Sub2_1.p1(1);
				local63.aClass2_Sub21_Sub2_1.p2(aClass21_1.anInt523);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aClass2_Sub21_Sub2_1, aClass21_1.anIntArray29);
				local63.aClass2_Sub21_Sub2_1.method7387(local63.aClass2_Sub21_Sub2_1.pos - local109);
				local57.method3275(local63);
				return;
			}
			if (opcode == 5062) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				intStack[isp++] = Static68.aClass151_3.method3234(local192).aCharArray2[local834];
				return;
			}
			if (opcode == 5063) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				intStack[isp++] = Static68.aClass151_3.method3234(local192).aCharArray3[local834];
				return;
			}
			if (opcode == 5064) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				if (local834 == -1) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Static68.aClass151_3.method3234(local192).method1185((char) local834);
				return;
			}
			if (opcode == 5065) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				if (local834 == -1) {
					intStack[isp++] = -1;
					return;
				}
				intStack[isp++] = Static68.aClass151_3.method3234(local192).method1184((char) local834);
				return;
			}
			if (opcode == 5066) {
				local192 = intStack[--isp];
				intStack[isp++] = Static288.aClass139_2.method2950(local192).method3901();
				return;
			}
			if (opcode == 5067) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				local109 = Static288.aClass139_2.method2950(local192).method3898(local834).anInt4589;
				intStack[isp++] = local109;
				return;
			}
			if (opcode == 5068) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				aClass21_1.anIntArray29[local192] = local834;
				return;
			}
			if (opcode == 5069) {
				isp -= 2;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				aClass21_1.anIntArray29[local192] = local834;
				return;
			}
			if (opcode == 5070) {
				isp -= 3;
				local192 = intStack[isp];
				local834 = intStack[isp + 1];
				local109 = intStack[isp + 2];
				@Pc(1526) Class2_Sub2_Sub12 local1526 = Static288.aClass139_2.method2950(local192);
				if (local1526.method3898(local834).anInt4589 != 0) {
					throw new RuntimeException("bad command");
				}
				intStack[isp++] = local1526.method3900(local834, local109);
				return;
			}
			if (opcode == 5071) {
				local95 = aStringArray37[--anInt7160];
				local1578 = intStack[--isp] == 1;
				Static494.method6606(local95, local1578);
				intStack[isp++] = Static606.anInt8971;
				return;
			}
			if (opcode == 5072) {
				if (Static256.aShortArray63 != null && Static143.anInt4065 < Static606.anInt8971) {
					intStack[isp++] = Static256.aShortArray63[Static143.anInt4065++] & 0xFFFF;
					return;
				}
				intStack[isp++] = -1;
				return;
			}
			if (opcode == 5073) {
				Static143.anInt4065 = 0;
				return;
			}
			if (opcode == 5074) {
				local57 = Static668.method8708();
				local63 = Static293.method4342(Static456.aClass347_85, local57.aClass186_1);
				local63.aClass2_Sub21_Sub2_1.p1(0);
				local109 = local63.aClass2_Sub21_Sub2_1.pos;
				local63.aClass2_Sub21_Sub2_1.p1(2);
				local63.aClass2_Sub21_Sub2_1.p2(aClass21_1.anInt523);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aClass2_Sub21_Sub2_1, aClass21_1.anIntArray29);
				local63.aClass2_Sub21_Sub2_1.method7387(local63.aClass2_Sub21_Sub2_1.pos - local109);
				local57.method3275(local63);
				return;
			}
			if (opcode == 5075) {
				local57 = Static668.method8708();
				local63 = Static293.method4342(Static456.aClass347_85, local57.aClass186_1);
				local63.aClass2_Sub21_Sub2_1.p1(0);
				local109 = local63.aClass2_Sub21_Sub2_1.pos;
				local63.aClass2_Sub21_Sub2_1.p1(3);
				local63.aClass2_Sub21_Sub2_1.p2(aClass21_1.anInt523);
				aClass21_1.aClass2_Sub2_Sub12_1.method3904(local63.aClass2_Sub21_Sub2_1, aClass21_1.anIntArray29);
				local63.aClass2_Sub21_Sub2_1.method7387(local63.aClass2_Sub21_Sub2_1.pos - local109);
				local57.method3275(local63);
				return;
			}
		} else if (opcode < 5200) {
			if (opcode == 5100) {
				if (Static334.aClass321_1.method8486(86)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 5101) {
				if (Static334.aClass321_1.method8486(82)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
			if (opcode == 5102) {
				if (Static334.aClass321_1.method8486(81)) {
					intStack[isp++] = 1;
					return;
				}
				intStack[isp++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (opcode < 5300) {
				if (opcode == 5200) {
					Static2.method65(intStack[--isp]);
					return;
				}
				if (opcode == 5201) {
					intStack[isp++] = Static466.method6330();
					return;
				}
				if (opcode == 5205) {
					Static60.method1293(intStack[--isp], false, -1, -1, -11493);
					return;
				}
				@Pc(1908) Class2_Sub2_Sub13 local1908;
				if (opcode == 5206) {
					local192 = intStack[--isp];
					local1908 = Static30.method5085(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1908.anInt4577;
					return;
				}
				@Pc(1942) Class2_Sub2_Sub13 local1942;
				if (opcode == 5207) {
					local1942 = Static30.method5066(intStack[--isp]);
					if (local1942 != null && local1942.aString49 != null) {
						aStringArray37[anInt7160++] = local1942.aString49;
						return;
					}
					aStringArray37[anInt7160++] = "";
					return;
				}
				if (opcode == 5208) {
					intStack[isp++] = Static329.anInt1757;
					intStack[isp++] = Static588.anInt8714;
					return;
				}
				if (opcode == 5209) {
					intStack[isp++] = Static164.anInt2818 + Static30.anInt5675;
					intStack[isp++] = Static615.anInt9415 + Static30.anInt5668;
					return;
				}
				if (opcode == 5210) {
					local192 = intStack[--isp];
					local1908 = Static30.method5066(local192);
					if (local1908 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1908.anInt4570 >> 14 & 0x3FFF;
					intStack[isp++] = local1908.anInt4570 & 0x3FFF;
					return;
				}
				if (opcode == 5211) {
					local192 = intStack[--isp];
					local1908 = Static30.method5066(local192);
					if (local1908 == null) {
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						return;
					}
					intStack[isp++] = local1908.anInt4566 - local1908.anInt4574;
					intStack[isp++] = local1908.anInt4576 - local1908.anInt4573;
					return;
				}
				@Pc(2139) Class2_Sub20 local2139;
				if (opcode == 5212) {
					local2139 = Static122.method2207();
					if (local2139 == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local2139.anInt3140;
					local834 = local2139.anInt3134 << 28 | local2139.anInt3138 + Static30.anInt5675 << 14 | local2139.anInt3133 + Static30.anInt5668;
					intStack[isp++] = local834;
					return;
				}
				if (opcode == 5213) {
					local2139 = Static364.method5255();
					if (local2139 == null) {
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local2139.anInt3140;
					local834 = local2139.anInt3134 << 28 | local2139.anInt3138 + Static30.anInt5675 << 14 | local2139.anInt3133 + Static30.anInt5668;
					intStack[isp++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (opcode == 5214) {
					local192 = intStack[--isp];
					local1908 = Static186.method2819();
					if (local1908 != null) {
						local2289 = local1908.method4088(anIntArray579, local192 & 0x3FFF, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF);
						if (local2289) {
							Static106.method2048(anIntArray579[1], anIntArray579[2]);
						}
					}
					return;
				}
				if (opcode == 5215) {
					isp -= 2;
					local192 = intStack[isp];
					local834 = intStack[isp + 1];
					@Pc(2329) Class194 local2329 = Static30.method5083(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class2_Sub2_Sub13 local2336 = (Class2_Sub2_Sub13) local2329.method4359(); local2336 != null; local2336 = (Class2_Sub2_Sub13) local2329.method4357()) {
						if (local2336.anInt4577 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						intStack[isp++] = 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (opcode == 5218) {
					local192 = intStack[--isp];
					local1908 = Static30.method5066(local192);
					if (local1908 == null) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local1908.anInt4578;
					return;
				}
				if (opcode == 5220) {
					intStack[isp++] = Static273.anInt4416 == 100 ? 1 : 0;
					return;
				}
				if (opcode == 5221) {
					local192 = intStack[--isp];
					Static106.method2048(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (opcode == 5222) {
					local1942 = Static186.method2819();
					if (local1942 != null) {
						local1578 = local1942.method4091(Static615.anInt9415 + Static30.anInt5668, Static164.anInt2818 + Static30.anInt5675, anIntArray579);
						if (local1578) {
							intStack[isp++] = anIntArray579[1];
							intStack[isp++] = anIntArray579[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (opcode == 5223) {
					isp -= 2;
					local192 = intStack[isp];
					local834 = intStack[isp + 1];
					Static60.method1293(local192, false, local834 & 0x3FFF, local834 >> 14 & 0x3FFF, -11493);
					return;
				}
				if (opcode == 5224) {
					local192 = intStack[--isp];
					local1908 = Static186.method2819();
					if (local1908 != null) {
						local2289 = local1908.method4088(anIntArray579, local192 & 0x3FFF, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF);
						if (local2289) {
							intStack[isp++] = anIntArray579[1];
							intStack[isp++] = anIntArray579[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (opcode == 5225) {
					local192 = intStack[--isp];
					local1908 = Static186.method2819();
					if (local1908 != null) {
						local2289 = local1908.method4091(local192 & 0x3FFF, local192 >> 14 & 0x3FFF, anIntArray579);
						if (local2289) {
							intStack[isp++] = anIntArray579[1];
							intStack[isp++] = anIntArray579[2];
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = -1;
					intStack[isp++] = -1;
					return;
				}
				if (opcode == 5226) {
					Static688.method8982(intStack[--isp]);
					return;
				}
				if (opcode == 5227) {
					isp -= 2;
					local192 = intStack[isp];
					local834 = intStack[isp + 1];
					Static60.method1293(local192, true, local834 & 0x3FFF, local834 >> 14 & 0x3FFF, -11493);
					return;
				}
				if (opcode == 5228) {
					Static178.aBoolean251 = intStack[--isp] == 1;
					return;
				}
				if (opcode == 5229) {
					intStack[isp++] = Static178.aBoolean251 ? 1 : 0;
					return;
				}
				if (opcode == 5230) {
					local192 = intStack[--isp];
					Static170.method2653(local192);
					return;
				}
				@Pc(2867) Node local2867;
				if (opcode == 5231) {
					isp -= 2;
					local192 = intStack[isp];
					local1578 = intStack[isp + 1] == 1;
					if (Static232.aClass28_18 != null) {
						local2867 = Static232.aClass28_18.method738(local192);
						if (local2867 != null && !local1578) {
							local2867.unlink();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Node();
							Static232.aClass28_18.method735(local192, local2867);
						}
					}
					return;
				}
				@Pc(2914) Node local2914;
				if (opcode == 5232) {
					local192 = intStack[--isp];
					if (Static232.aClass28_18 != null) {
						local2914 = Static232.aClass28_18.method738(local192);
						intStack[isp++] = local2914 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (opcode == 5233) {
					isp -= 2;
					local192 = intStack[isp];
					local1578 = intStack[isp + 1] == 1;
					if (Static268.aClass28_22 != null) {
						local2867 = Static268.aClass28_22.method738(local192);
						if (local2867 != null && !local1578) {
							local2867.unlink();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Node();
							Static268.aClass28_22.method735(local192, local2867);
						}
					}
					return;
				}
				if (opcode == 5234) {
					local192 = intStack[--isp];
					if (Static268.aClass28_22 != null) {
						local2914 = Static268.aClass28_22.method738(local192);
						intStack[isp++] = local2914 == null ? 0 : 1;
						return;
					}
					intStack[isp++] = 0;
					return;
				}
				if (opcode == 5235) {
					intStack[isp++] = Static30.aClass2_Sub2_Sub13_3 == null ? -1 : Static30.aClass2_Sub2_Sub13_3.anInt4577;
					return;
				}
				if (opcode == 5236) {
					isp -= 2;
					local192 = intStack[isp];
					local834 = intStack[isp + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static687.method8964(local192, local115, local109);
					if (local375 < 0) {
						intStack[isp++] = -1;
						return;
					}
					intStack[isp++] = local375;
					return;
				}
				if (opcode == 5237) {
					Static322.method9448();
					return;
				}
			} else if (opcode < 5400) {
				if (opcode == 5300) {
					isp -= 2;
					local192 = intStack[isp];
					local834 = intStack[isp + 1];
					Static409.setWindowMode(3, local192, false, local834);
					intStack[isp++] = GameShell.fullscreenFrame == null ? 0 : 1;
					return;
				}
				if (opcode == 5301) {
					if (GameShell.fullscreenFrame != null) {
						Static409.setWindowMode(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
					}
					return;
				}
				if (opcode == 5302) {
					@Pc(3186) Class275[] local3186 = Static587.method7717();
					intStack[isp++] = local3186.length;
					return;
				}
				if (opcode == 5303) {
					local192 = intStack[--isp];
					@Pc(3210) Class275[] local3210 = Static587.method7717();
					intStack[isp++] = local3210[local192].anInt6939;
					intStack[isp++] = local3210[local192].anInt6933;
					return;
				}
				if (opcode == 5305) {
					local192 = Static328.anInt5446;
					local834 = Static110.anInt2198;
					local109 = -1;
					@Pc(3245) Class275[] local3245 = Static587.method7717();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class275 local3252 = local3245[local375];
						if (local3252.anInt6939 == local192 && local3252.anInt6933 == local834) {
							local109 = local375;
							break;
						}
					}
					intStack[isp++] = local109;
					return;
				}
				if (opcode == 5306) {
					intStack[isp++] = Static36.method978();
					return;
				}
				if (opcode == 5307) {
					local192 = intStack[--isp];
					if (local192 >= 1 && local192 <= 2) {
						Static409.setWindowMode(local192, -1, false, -1);
						return;
					}
					return;
				}
				if (opcode == 5308) {
					intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485();
					return;
				}
				if (opcode == 5309) {
					local192 = intStack[--isp];
					if (local192 >= 1 && local192 <= 2) {
						Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub1_1);
						Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub1_2);
						Static666.method8700(1);
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (opcode < 5500) {
					if (opcode == 5400) {
						anInt7160 -= 2;
						local95 = aStringArray37[anInt7160];
						local101 = aStringArray37[anInt7160 + 1];
						local109 = intStack[--isp];
						@Pc(3411) Class153 local3411 = Static668.method8708();
						@Pc(3417) Class2_Sub19 local3417 = Static293.method4342(Static563.aClass347_102, local3411.aClass186_1);
						local3417.aClass2_Sub21_Sub2_1.p1(Static231.method3379(local95) + Static231.method3379(local101) + 1);
						local3417.aClass2_Sub21_Sub2_1.pjstr(local95);
						local3417.aClass2_Sub21_Sub2_1.pjstr(local101);
						local3417.aClass2_Sub21_Sub2_1.p1(local109);
						local3411.method3275(local3417);
						return;
					}
					if (opcode == 5401) {
						isp -= 2;
						Static637.recolorPalette[intStack[isp]] = (short) Static166.method2616(intStack[isp + 1]);
						Static419.aClass112_1.method2482();
						Static419.aClass112_1.method2484();
						Static690.aClass310_2.method7098();
						Static469.method6369();
						return;
					}
					if (opcode == 5405) {
						isp -= 2;
						local192 = intStack[isp];
						local834 = intStack[isp + 1];
						if (local192 >= 0 && local192 < 2) {
							Static603.anIntArrayArrayArray18[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (opcode == 5406) {
						isp -= 7;
						local192 = intStack[isp];
						local834 = intStack[isp + 1] << 1;
						local109 = intStack[isp + 2];
						local115 = intStack[isp + 3];
						local375 = intStack[isp + 4];
						local3561 = intStack[isp + 5];
						@Pc(3567) int local3567 = intStack[isp + 6];
						if (local192 >= 0 && local192 < 2 && Static603.anIntArrayArrayArray18[local192] != null && local834 >= 0 && local834 < Static603.anIntArrayArrayArray18[local192].length) {
							Static603.anIntArrayArrayArray18[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static603.anIntArrayArrayArray18[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (opcode == 5407) {
						local192 = Static603.anIntArrayArrayArray18[intStack[--isp]].length >> 1;
						intStack[isp++] = local192;
						return;
					}
					if (opcode == 5411) {
						if (GameShell.fullscreenFrame != null) {
							Static409.setWindowMode(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
						}
						if (GameShell.frame != null) {
							Static266.method6784();
							System.exit(0);
							return;
						}
						local95 = Static360.quiturl == null ? Static659.method8612() : Static360.quiturl;
						Static664.method8662(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1, local95, false, GameShell.sign);
						return;
					}
					if (opcode == 5419) {
						local95 = "";
						if (Static439.aPrivilegedRequest_4 != null) {
							if (Static439.aPrivilegedRequest_4.result == null) {
								local95 = Static419.method5763(Static439.aPrivilegedRequest_4.anInt6809);
							} else {
								local95 = (String) Static439.aPrivilegedRequest_4.result;
							}
						}
						aStringArray37[anInt7160++] = local95;
						return;
					}
					if (opcode == 5420) {
						intStack[isp++] = GameShell.sign.aBoolean782 ? 0 : 1;
						return;
					}
					if (opcode == 5421) {
						if (GameShell.fullscreenFrame != null) {
							Static409.setWindowMode(Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, false, -1);
						}
						local95 = aStringArray37[--anInt7160];
						local1578 = intStack[--isp] == 1;
						local198 = Static659.method8612() + local95;
						Static664.method8662(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 1, local198, local1578, GameShell.sign);
						return;
					}
					if (opcode == 5422) {
						anInt7160 -= 2;
						local95 = aStringArray37[anInt7160];
						local101 = aStringArray37[anInt7160 + 1];
						local109 = intStack[--isp];
						if (local95.length() > 0) {
							if (Static685.aStringArray47 == null) {
								Static685.aStringArray47 = new String[Static390.anIntArray476[Static392.game.id]];
							}
							Static685.aStringArray47[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static377.aStringArray30 == null) {
								Static377.aStringArray30 = new String[Static390.anIntArray476[Static392.game.id]];
							}
							Static377.aStringArray30[local109] = local101;
						}
						return;
					}
					if (opcode == 5423) {
						System.out.println(aStringArray37[--anInt7160]);
						return;
					}
					if (opcode == 5424) {
						isp -= 11;
						Static719.anInt10532 = intStack[isp];
						Static514.anInt7700 = intStack[isp + 1];
						Static183.anInt3031 = intStack[isp + 2];
						Static405.anInt6275 = intStack[isp + 3];
						Static63.anInt1481 = intStack[isp + 4];
						Static282.anInt4430 = intStack[isp + 5];
						Static337.anInt5581 = intStack[isp + 6];
						Static176.anInt7555 = intStack[isp + 7];
						Static282.anInt4432 = intStack[isp + 8];
						Static563.anInt8479 = intStack[isp + 9];
						Static634.anInt9536 = intStack[isp + 10];
						Static721.aClass332_128.method7588(Static63.anInt1481);
						Static721.aClass332_128.method7588(Static282.anInt4430);
						Static721.aClass332_128.method7588(Static337.anInt5581);
						Static721.aClass332_128.method7588(Static176.anInt7555);
						Static721.aClass332_128.method7588(Static282.anInt4432);
						Static26.aClass23_5 = null;
						Static561.aClass23_34 = null;
						Static261.aClass23_18 = null;
						Static608.aClass23_41 = null;
						Static1.aClass23_42 = null;
						Static459.aClass23_31 = null;
						Static542.aClass23_33 = null;
						Static63.aClass23_8 = null;
						Static60.aBoolean87 = true;
						return;
					}
					if (opcode == 5425) {
						Static329.method1649();
						Static60.aBoolean87 = false;
						return;
					}
					if (opcode == 5426) {
						isp -= 2;
						Static277.anInt4500 = intStack[isp];
						Static39.anInt954 = intStack[isp + 1];
						return;
					}
					if (opcode == 5427) {
						isp -= 2;
						return;
					}
					if (opcode == 5428) {
						isp -= 2;
						local192 = intStack[isp];
						local834 = intStack[isp + 1];
						intStack[isp++] = Static251.method3549(local192, local834) ? 1 : 0;
						return;
					}
					if (opcode == 5429) {
						Static231.method3381(false, false, aStringArray37[--anInt7160]);
						return;
					}
					if (opcode == 5430) {
						try {
							BrowserControl.call("accountcreated", signlink.mainapp);
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (opcode == 5431) {
						try {
							BrowserControl.call("accountcreatestarted", signlink.mainapp);
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (opcode == 5432) {
						local95 = "";
						if (Static175.clipboard != null) {
							@Pc(4173) Transferable local4173 = Static175.clipboard.getContents(null);
							if (local4173 != null) {
								try {
									local95 = (String) local4173.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4186) Exception local4186) {
								}
							}
						}
						aStringArray37[anInt7160++] = local95;
						return;
					}
					if (opcode == 5433) {
						Static143.anInt4070 = intStack[--isp];
						return;
					}
					if (opcode == 5435) {
						intStack[isp++] = Static98.js ? 1 : 0;
						return;
					}
					if (opcode == 5436) {
						if (Static292.instance.javaRelease < 6) {
							intStack[isp++] = 0;
						} else if (Static292.instance.javaRelease == 6 && Static292.instance.javaUpdate < 10) {
							intStack[isp++] = 0;
						} else {
							intStack[isp++] = 1;
						}
						return;
					}
				} else if (opcode < 5600) {
					if (opcode == 5500) {
						isp -= 4;
						local192 = intStack[isp];
						local834 = intStack[isp + 1];
						local109 = intStack[isp + 2];
						local115 = intStack[isp + 3];
						Static319.method4602((local192 >> 14 & 0x3FFF) - Static691.anInt10395, false, local109, local834 << 2, (local192 & 0x3FFF) - Static116.anInt2279, local115);
						return;
					}
					if (opcode == 5501) {
						isp -= 4;
						local192 = intStack[isp];
						local834 = intStack[isp + 1];
						local109 = intStack[isp + 2];
						local115 = intStack[isp + 3];
						Static638.method8404(local109, (local192 & 0x3FFF) - Static116.anInt2279, (local192 >> 14 & 0x3FFF) - Static691.anInt10395, local834 << 2, local115);
						return;
					}
					if (opcode == 5502) {
						isp -= 6;
						local192 = intStack[isp];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static197.anInt3269 = local192;
						local834 = intStack[isp + 1];
						if (local834 + 1 >= Static603.anIntArrayArrayArray18[Static197.anInt3269].length >> 1) {
							throw new RuntimeException();
						}
						Static303.anInt4884 = local834;
						Static260.anInt4256 = 0;
						Static71.anInt1588 = intStack[isp + 2];
						Static410.anInt6342 = intStack[isp + 3];
						local109 = intStack[isp + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static374.anInt5927 = local109;
						local115 = intStack[isp + 5];
						if (local115 + 1 >= Static603.anIntArrayArrayArray18[Static374.anInt5927].length >> 1) {
							throw new RuntimeException();
						}
						Static591.anInt8763 = local115;
						Static511.anInt7668 = 3;
						Static693.anInt10411 = -1;
						Static692.anInt10404 = -1;
						return;
					}
					if (opcode == 5503) {
						Static693.method9019();
						return;
					}
					if (opcode == 5504) {
						isp -= 2;
						Static471.method6415(intStack[isp + 1], intStack[isp]);
						return;
					}
					if (opcode == 5505) {
						intStack[isp++] = (int) Static479.aFloat123 >> 3;
						return;
					}
					if (opcode == 5506) {
						intStack[isp++] = (int) Static171.aFloat64 >> 3;
						return;
					}
					if (opcode == 5507) {
						Static599.method7842();
						return;
					}
					if (opcode == 5508) {
						Static494.method6603();
						return;
					}
					if (opcode == 5509) {
						Static254.method3606();
						return;
					}
					if (opcode == 5510) {
						Static470.method6393();
						return;
					}
					if (opcode == 5511) {
						local192 = intStack[--isp];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static691.anInt10395;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static720.anInt10888) {
							local834 = Static720.anInt10888;
						}
						local109 -= Static116.anInt2279;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static501.anInt7591) {
							local109 = Static501.anInt7591;
						}
						Static433.anInt6282 = (local834 << 9) + 256;
						Static249.anInt4029 = (local109 << 9) + 256;
						Static511.anInt7668 = 4;
						Static693.anInt10411 = -1;
						Static692.anInt10404 = -1;
						return;
					}
					if (opcode == 5512) {
						Static145.method2409();
						return;
					}
					if (opcode == 5514) {
						Static582.anInt8654 = intStack[--isp];
						return;
					}
					if (opcode == 5516) {
						intStack[isp++] = Static582.anInt8654;
						return;
					}
					if (opcode == 5517) {
						local192 = intStack[--isp];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static691.anInt10395;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static720.anInt10888) {
								local834 = Static720.anInt10888;
							}
							local109 -= Static116.anInt2279;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static501.anInt7591) {
								local109 = Static501.anInt7591;
							}
							Static692.anInt10404 = (local834 << 9) + 256;
							Static693.anInt10411 = (local109 << 9) + 256;
							return;
						}
						Static692.anInt10404 = -1;
						Static693.anInt10411 = -1;
						return;
					}
					if (opcode == 5547) {
						intStack[isp++] = Static511.anInt7668 == 1 ? 1 : 0;
						return;
					}
				} else if (opcode < 5700) {
					if (opcode == 5600) {
						anInt7160 -= 2;
						local95 = aStringArray37[anInt7160];
						local101 = aStringArray37[anInt7160 + 1];
						local109 = intStack[--isp];
						Static57.method1232(local109, local101, local95);
						return;
					}
					if (opcode == 5601) {
						Static66.method1488();
						return;
					}
					if (opcode == 5602) {
						if (!Static242.method3500()) {
							Static707.method9234();
						}
						return;
					}
					if (opcode == 5604) {
						anInt7160--;
						if (Static283.anInt4588 != 3) {
							return;
						}
						if (!Static242.method3500() && Static6.anInt95 == 0) {
							Static104.method2029(aStringArray37[anInt7160]);
							return;
						}
						return;
					}
					if (opcode == 5605) {
						anInt7160 -= 2;
						isp -= 2;
						if (Static283.anInt4588 != 3) {
							return;
						}
						if (!Static242.method3500() && Static6.anInt95 == 0) {
							Static81.method1591(aStringArray37[anInt7160], intStack[isp], aStringArray37[anInt7160 + 1], intStack[isp + 1] == 1);
							return;
						}
						return;
					}
					if (opcode == 5606) {
						if (Static6.anInt95 == 0) {
							Static580.anInt8645 = -2;
						}
						return;
					}
					if (opcode == 5607) {
						intStack[isp++] = Static169.anInt2864;
						return;
					}
					if (opcode == 5608) {
						intStack[isp++] = Static118.anInt2301;
						return;
					}
					if (opcode == 5609) {
						intStack[isp++] = Static580.anInt8645;
						return;
					}
					if (opcode == 5611) {
						intStack[isp++] = Static329.anInt1756;
						return;
					}
					if (opcode == 5612) {
						local192 = intStack[--isp];
						Static674.method8796(local192);
						return;
					}
					if (opcode == 5613) {
						intStack[isp++] = Static169.anInt2864;
						return;
					}
					if (opcode == 5615) {
						anInt7160 -= 2;
						local95 = aStringArray37[anInt7160];
						local101 = aStringArray37[anInt7160 + 1];
						Static218.method3188(local101, local95);
						return;
					}
					if (opcode == 5616) {
						Static233.method3409(false);
						return;
					}
					if (opcode == 5617) {
						intStack[isp++] = Static284.anInt4597;
						return;
					}
					if (opcode == 5618) {
						isp--;
						return;
					}
					if (opcode == 5619) {
						isp--;
						return;
					}
					if (opcode == 5620) {
						intStack[isp++] = 0;
						return;
					}
					if (opcode == 5621) {
						anInt7160 -= 2;
						isp -= 2;
						return;
					}
					if (opcode == 5622) {
						return;
					}
					if (opcode == 5623) {
						if (Static265.sskey != null) {
							intStack[isp++] = 1;
							return;
						}
						intStack[isp++] = 0;
						return;
					}
					if (opcode == 5624) {
						intStack[isp++] = (int) (Static416.userFlow >> 32);
						intStack[isp++] = (int) (Static416.userFlow & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (opcode == 5625) {
						intStack[isp++] = Static477.under ? 1 : 0;
						return;
					}
					if (opcode == 5626) {
						Static477.under = true;
						Static358.method9197();
						return;
					}
					if (opcode == 5627) {
						intStack[isp++] = Static78.anInt1633;
						intStack[isp++] = Static383.anInt6021;
						intStack[isp++] = Static673.anInt10106;
						Static78.anInt1633 = -2;
						Static383.anInt6021 = -1;
						Static673.anInt10106 = -1;
						return;
					}
					if (opcode == 5628) {
						intStack[isp++] = Static242.method3500() ? 1 : 0;
						return;
					}
					if (opcode == 5629) {
						intStack[isp++] = Static660.anInt9863;
						return;
					}
					if (opcode == 5630) {
						Static56.method1220();
						return;
					}
					if (opcode == 5631) {
						isp -= 2;
						local192 = intStack[isp];
						local834 = intStack[isp + 1];
						Static151.method9298(local192, local834);
						return;
					}
					if (opcode == 5632) {
						local192 = intStack[--isp];
						Static303.method4435(local192);
						return;
					}
					if (opcode == 5633) {
						intStack[isp++] = Static356.anInt5800;
						return;
					}
				} else if (opcode < 6100) {
					if (opcode == 6001) {
						local192 = intStack[--isp];
						Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub22_1);
						Static449.method6123();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					@Pc(5337) boolean local5337;
					if (opcode == 6002) {
						local5337 = intStack[--isp] == 1;
						Static400.aClass2_Sub34_28.method5111(local5337 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub19_1);
						Static400.aClass2_Sub34_28.method5111(local5337 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
						Static449.method6123();
						Static77.method1561();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6003) {
						local5337 = intStack[--isp] == 1;
						Static400.aClass2_Sub34_28.method5111(local5337 ? 2 : 1, Static400.aClass2_Sub34_28.aClass57_Sub4_1);
						Static400.aClass2_Sub34_28.method5111(local5337 ? 2 : 1, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
						Static77.method1561();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6005) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub6_1);
						Static449.method6123();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6007) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub27_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6008) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub8_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6010) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub7_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6011) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub12_1);
						Static449.method6123();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6012) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub24_1);
						Static296.method4369();
						Static218.method3187();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6014) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 2 : 0, Static400.aClass2_Sub34_28.aClass57_Sub26_1);
						Static449.method6123();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6015) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub16_1);
						Static449.method6123();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6016) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub13_1);
						Static32.method880(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922(), false);
						Static666.method8700(1);
						return;
					}
					if (opcode == 6017) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub17_1);
						Static150.method2455();
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6018) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub25_4);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6019) {
						local192 = intStack[--isp];
						local834 = Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7215();
						if (local192 != local834) {
							if (Static109.method2070(Static283.anInt4588)) {
								if (local834 == 0 && Static588.anInt8716 != -1) {
									Static611.method8236(Static588.anInt8716, local192, Static398.aClass332_81);
									Static550.method7273();
									Static501.jingle = false;
								} else if (local192 == 0) {
									Static100.method1988();
									Static501.jingle = false;
								} else {
									Static126.method2226(local192);
								}
							}
							Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub25_2);
							Static666.method8700(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
					if (opcode == 6020) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub25_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6021) {
						local192 = Static400.aClass2_Sub34_28.aClass57_Sub4_1.method2143();
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 0 : local192, Static400.aClass2_Sub34_28.aClass57_Sub4_2);
						Static77.method1561();
						return;
					}
					if (opcode == 6023) {
						local192 = intStack[--isp];
						Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub28_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6024) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub13_2);
						Static666.method8700(1);
						return;
					}
					if (opcode == 6025) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub5_1);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6027) {
						local192 = intStack[--isp];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static249.method3537(local192 == 1);
						return;
					}
					if (opcode == 6028) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 0 ? 0 : 1, Static400.aClass2_Sub34_28.aClass57_Sub14_1);
						Static666.method8700(1);
						return;
					}
					if (opcode == 6029) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub27_1);
						Static666.method8700(1);
						return;
					}
					if (opcode == 6030) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 0 ? 0 : 1, Static400.aClass2_Sub34_28.aClass57_Sub23_1);
						Static666.method8700(1);
						Static449.method6123();
						return;
					}
					if (opcode == 6031) {
						local192 = intStack[--isp];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static32.method880(local192, false);
						return;
					}
					if (opcode == 6032) {
						isp -= 2;
						local192 = intStack[isp];
						local1578 = intStack[isp + 1] == 1;
						Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub29_2);
						if (!local1578) {
							Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
						}
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6033) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub21_1);
						Static666.method8700(1);
						return;
					}
					if (opcode == 6034) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub30_1);
						Static666.method8700(1);
						Static296.method4369();
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6035) {
						local192 = Static400.aClass2_Sub34_28.aClass57_Sub19_1.method5967();
						Static400.aClass2_Sub34_28.method5111(intStack[--isp] == 1 ? 1 : local192, Static400.aClass2_Sub34_28.aClass57_Sub19_2);
						Static449.method6123();
						Static77.method1561();
						return;
					}
					if (opcode == 6036) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub18_1);
						Static666.method8700(1);
						Static284.aBoolean355 = true;
						return;
					}
					if (opcode == 6037) {
						Static400.aClass2_Sub34_28.method5111(intStack[--isp], Static400.aClass2_Sub34_28.aClass57_Sub25_3);
						Static666.method8700(1);
						Static503.aBoolean578 = false;
						return;
					}
					if (opcode == 6038) {
						local192 = intStack[--isp];
						local834 = Static400.aClass2_Sub34_28.aClass57_Sub25_5.method7215();
						if (local192 != local834 && Static588.anInt8716 == Static597.anInt8845) {
							if (!Static109.method2070(Static283.anInt4588)) {
								if (local834 == 0) {
									Static611.method8236(Static588.anInt8716, local192, Static398.aClass332_81);
									Static550.method7273();
									Static501.jingle = false;
								} else if (local192 == 0) {
									Static100.method1988();
									Static501.jingle = false;
								} else {
									Static126.method2226(local192);
								}
							}
							Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub25_5);
							Static666.method8700(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
					if (opcode == 6039) {
						local192 = intStack[--isp];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static400.aClass2_Sub34_28.aClass57_Sub11_1.method3603()) {
							Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub11_1);
							Static666.method8700(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
					if (opcode == 6040) {
						local192 = intStack[--isp];
						if (local192 != Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120()) {
							Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub3_1);
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							Static498.method6653();
						}
						return;
					}
					if (opcode == 6041) {
						local192 = intStack[--isp];
						if (local192 != Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989()) {
							Static400.aClass2_Sub34_28.method5111(local192, Static400.aClass2_Sub34_28.aClass57_Sub2_1);
							Static666.method8700(1);
							Static503.aBoolean578 = false;
						}
						return;
					}
				} else if (opcode < 6200) {
					if (opcode == 6101) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub22_1.method6776();
						return;
					}
					if (opcode == 6102) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub19_1.method5967() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6103) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub4_1.method2143() == 2 ? 1 : 0;
						return;
					}
					if (opcode == 6105) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2714() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6107) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub27_1.method7674();
						return;
					}
					if (opcode == 6108) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub8_1.method3176() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6110) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2905() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6111) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371();
						return;
					}
					if (opcode == 6112) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7089() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6114) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7470() == 2 ? 1 : 0;
						return;
					}
					if (opcode == 6115) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub16_1.method5514() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6116) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub13_1.method4380();
						return;
					}
					if (opcode == 6117) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub17_1.method5674() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6118) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub25_4.method7215();
						return;
					}
					if (opcode == 6119) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub25_2.method7215();
						return;
					}
					if (opcode == 6120) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub25_1.method7215();
						return;
					}
					if (opcode == 6123) {
						intStack[isp++] = Static436.method3416();
						return;
					}
					if (opcode == 6124) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub13_2.method4380();
						return;
					}
					if (opcode == 6125) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub5_1.method2172();
						return;
					}
					if (opcode == 6127) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6115() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6128) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub14_1.method5309() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6129) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub27_1.method7674();
						return;
					}
					if (opcode == 6130) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method7061() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6131) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922();
						return;
					}
					if (opcode == 6132) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub29_2.method7922();
						return;
					}
					if (opcode == 6133) {
						intStack[isp++] = GameShell.sign.aBoolean782 && !GameShell.sign.aBoolean780 ? 1 : 0;
						return;
					}
					if (opcode == 6135) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub21_1.method6367();
						return;
					}
					if (opcode == 6136) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8363() == 1 ? 1 : 0;
						return;
					}
					if (opcode == 6138) {
						intStack[isp++] = Static363.method6242(200, Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922());
						return;
					}
					if (opcode == 6139) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method5774();
						return;
					}
					if (opcode == 6142) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub25_3.method7215();
						return;
					}
					if (opcode == 6143) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub25_5.method7215();
						return;
					}
					if (opcode == 6144) {
						intStack[isp++] = Static3.aBoolean4 ? 1 : 0;
						return;
					}
					if (opcode == 6145) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub11_1.method3603();
						return;
					}
					if (opcode == 6146) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2120();
						return;
					}
					if (opcode == 6147) {
						intStack[isp++] = Static292.instance.anInt7633 < 512 || Static3.aBoolean4 || Static171.aBoolean245 ? 1 : 0;
						return;
					}
					if (opcode == 6148) {
						intStack[isp++] = Static416.aBoolean472 ? 1 : 0;
						return;
					}
					if (opcode == 6149) {
						intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1989();
						return;
					}
				} else if (opcode < 6300) {
					if (opcode == 6200) {
						isp -= 2;
						Static640.aShort122 = (short) intStack[isp];
						if (Static640.aShort122 <= 0) {
							Static640.aShort122 = 256;
						}
						Static640.aShort121 = (short) intStack[isp + 1];
						if (Static640.aShort121 <= 0) {
							Static640.aShort121 = 205;
						}
						return;
					}
					if (opcode == 6201) {
						isp -= 2;
						Static228.aShort45 = (short) intStack[isp];
						if (Static228.aShort45 <= 0) {
							Static228.aShort45 = 256;
						}
						Static502.aShort97 = (short) intStack[isp + 1];
						if (Static502.aShort97 <= 0) {
							Static502.aShort97 = 320;
						}
						return;
					}
					if (opcode == 6202) {
						isp -= 4;
						Static25.aShort1 = (short) intStack[isp];
						if (Static25.aShort1 <= 0) {
							Static25.aShort1 = 1;
						}
						Static598.aShort120 = (short) intStack[isp + 1];
						if (Static598.aShort120 <= 0) {
							Static598.aShort120 = 32767;
						} else if (Static598.aShort120 < Static25.aShort1) {
							Static598.aShort120 = Static25.aShort1;
						}
						Static552.aShort123 = (short) intStack[isp + 2];
						if (Static552.aShort123 <= 0) {
							Static552.aShort123 = 1;
						}
						Static306.aShort59 = (short) intStack[isp + 3];
						if (Static306.aShort59 <= 0) {
							Static306.aShort59 = 32767;
							return;
						}
						if (Static306.aShort59 < Static552.aShort123) {
							Static306.aShort59 = Static552.aShort123;
						}
						return;
					}
					if (opcode == 6203) {
						Static498.method6650(0, false, 0, Static610.aClass158_16.anInt3756, Static610.aClass158_16.anInt3813);
						intStack[isp++] = Static242.anInt3982;
						intStack[isp++] = Static200.anInt3314;
						return;
					}
					if (opcode == 6204) {
						intStack[isp++] = Static228.aShort45;
						intStack[isp++] = Static502.aShort97;
						return;
					}
					if (opcode == 6205) {
						intStack[isp++] = Static640.aShort122;
						intStack[isp++] = Static640.aShort121;
						return;
					}
				} else if (opcode < 6400) {
					if (opcode == 6300) {
						intStack[isp++] = (int) (Static588.currentTimeMillis() / 60000L);
						return;
					}
					if (opcode == 6301) {
						intStack[isp++] = (int) (Static588.currentTimeMillis() / 86400000L) - 11745;
						return;
					}
					if (opcode == 6302) {
						isp -= 3;
						local192 = intStack[isp];
						local834 = intStack[isp + 1];
						local109 = intStack[isp + 2];
						@Pc(7384) long local7384 = Static40.method1026(local834, local109, local192);
						local3561 = Static68.method3585(local7384);
						if (local109 < 1970) {
							local3561--;
						}
						intStack[isp++] = local3561;
						return;
					}
					if (opcode == 6303) {
						intStack[isp++] = Static614.method8249(Static588.currentTimeMillis());
						return;
					}
					if (opcode == 6304) {
						local192 = intStack[--isp];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						intStack[isp++] = local1578 ? 1 : 0;
						return;
					}
					if (opcode == 6305) {
						local192 = intStack[--isp];
						@Pc(7512) int[] local7512 = Static212.method3135(local192);
						Static734.method7702(local7512, 0, intStack, isp, 3);
						isp += 3;
						return;
					}
					if (opcode == 6306) {
						local192 = intStack[--isp];
						intStack[isp++] = (int) (Static38.method1003(local192) / 60000L);
						return;
					}
				} else if (opcode < 6500) {
					if (opcode == 6405) {
						intStack[isp++] = Static21.method8126() ? 1 : 0;
						return;
					}
					if (opcode == 6406) {
						intStack[isp++] = Static385.method5428() ? 1 : 0;
						return;
					}
				} else if (opcode < 6600) {
					if (opcode == 6500) {
						if (Static283.anInt4588 == 7 && !Static242.method3500() && Static6.anInt95 == 0) {
							if (Static149.aBoolean221) {
								intStack[isp++] = 0;
								return;
							}
							if (Static363.aLong219 > Static588.currentTimeMillis() - 1000L) {
								intStack[isp++] = 1;
								return;
							}
							Static149.aBoolean221 = true;
							@Pc(7662) Class2_Sub19 local7662 = Static293.method4342(Static231.aClass347_41, Static405.aClass153_1.aClass186_1);
							local7662.aClass2_Sub21_Sub2_1.p4(Static379.anInt5988);
							Static405.aClass153_1.method3275(local7662);
							intStack[isp++] = 0;
							return;
						}
						intStack[isp++] = 1;
						return;
					}
					@Pc(7719) Class65 local7719;
					@Pc(7686) Class299_Sub1 local7686;
					if (opcode == 6501) {
						local7686 = Static724.method9459();
						if (local7686 != null) {
							intStack[isp++] = local7686.anInt7592;
							intStack[isp++] = local7686.anInt7586;
							aStringArray37[anInt7160++] = local7686.aString91;
							local7719 = local7686.method6724();
							intStack[isp++] = local7719.anInt1617;
							aStringArray37[anInt7160++] = local7719.aString13;
							intStack[isp++] = local7686.anInt7584;
							intStack[isp++] = local7686.anInt7593;
							aStringArray37[anInt7160++] = local7686.aString90;
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						return;
					}
					if (opcode == 6502) {
						local7686 = Static557.method7340();
						if (local7686 != null) {
							intStack[isp++] = local7686.anInt7592;
							intStack[isp++] = local7686.anInt7586;
							aStringArray37[anInt7160++] = local7686.aString91;
							local7719 = local7686.method6724();
							intStack[isp++] = local7719.anInt1617;
							aStringArray37[anInt7160++] = local7719.aString13;
							intStack[isp++] = local7686.anInt7584;
							intStack[isp++] = local7686.anInt7593;
							aStringArray37[anInt7160++] = local7686.aString90;
							return;
						}
						intStack[isp++] = -1;
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						return;
					}
					if (opcode == 6503) {
						local192 = intStack[--isp];
						local101 = aStringArray37[--anInt7160];
						if (Static283.anInt4588 == 7 && !Static242.method3500() && Static6.anInt95 == 0) {
							intStack[isp++] = Static430.method5824(local192, local101) ? 1 : 0;
							return;
						}
						intStack[isp++] = 0;
						return;
					}
					if (opcode == 6506) {
						local192 = intStack[--isp];
						@Pc(8053) Class299_Sub1 local8053 = Static615.method8267(local192);
						if (local8053 != null) {
							intStack[isp++] = local8053.anInt7586;
							aStringArray37[anInt7160++] = local8053.aString91;
							@Pc(8077) Class65 local8077 = local8053.method6724();
							intStack[isp++] = local8077.anInt1617;
							aStringArray37[anInt7160++] = local8077.aString13;
							intStack[isp++] = local8053.anInt7584;
							intStack[isp++] = local8053.anInt7593;
							aStringArray37[anInt7160++] = local8053.aString90;
							return;
						}
						intStack[isp++] = -1;
						aStringArray37[anInt7160++] = "";
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						intStack[isp++] = 0;
						intStack[isp++] = 0;
						aStringArray37[anInt7160++] = "";
						return;
					}
					if (opcode == 6507) {
						isp -= 4;
						local192 = intStack[isp];
						local1578 = intStack[isp + 1] == 1;
						local109 = intStack[isp + 2];
						local2331 = intStack[isp + 3] == 1;
						Static210.method3119(local1578, local109, local192, local2331);
						return;
					}
					if (opcode == 6508) {
						Static152.method9280();
						return;
					}
					if (opcode == 6509) {
						if (Static283.anInt4588 != 7) {
							return;
						}
						Static60.aBoolean86 = intStack[--isp] == 1;
						return;
					}
					if (opcode == 6510) {
						intStack[isp++] = Static715.worldflags;
						return;
					}
				} else if (opcode >= 6700) {
					if (opcode < 6800 && client.modewhat == Static225.aClass162_1) {
						if (opcode == 6700) {
							local192 = Static548.aClass28_40.method739();
							if (Static377.anInt5950 != -1) {
								local192++;
							}
							intStack[isp++] = local192;
							return;
						}
						if (opcode == 6701) {
							local192 = intStack[--isp];
							if (Static377.anInt5950 != -1) {
								if (local192 == 0) {
									intStack[isp++] = Static377.anInt5950;
									return;
								}
								local192--;
							}
							@Pc(8344) Class2_Sub4 local8344 = (Class2_Sub4) Static548.aClass28_40.method736();
							while (local192-- > 0) {
								local8344 = (Class2_Sub4) Static548.aClass28_40.method740();
							}
							intStack[isp++] = local8344.anInt147;
							return;
						}
						if (opcode == 6702) {
							local192 = intStack[--isp];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								aStringArray37[anInt7160++] = "";
								return;
							}
							local101 = Static453.aClass158ArrayArray2[local192][0].aString40;
							if (local101 == null) {
								aStringArray37[anInt7160++] = "";
								return;
							}
							aStringArray37[anInt7160++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (opcode == 6703) {
							local192 = intStack[--isp];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static453.aClass158ArrayArray2[local192].length;
							return;
						}
						if (opcode == 6704) {
							isp -= 2;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								aStringArray37[anInt7160++] = "";
								return;
							}
							local198 = Static453.aClass158ArrayArray2[local192][local834].aString40;
							if (local198 == null) {
								aStringArray37[anInt7160++] = "";
								return;
							}
							aStringArray37[anInt7160++] = local198;
							return;
						}
						if (opcode == 6705) {
							isp -= 2;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							if (Static453.aClass158ArrayArray2[local192] == null) {
								intStack[isp++] = 0;
								return;
							}
							intStack[isp++] = Static453.aClass158ArrayArray2[local192][local834].anInt3784;
							return;
						}
						if (opcode == 6706) {
							return;
						}
						if (opcode == 6707) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 1);
							return;
						}
						if (opcode == 6708) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 2);
							return;
						}
						if (opcode == 6709) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 3);
							return;
						}
						if (opcode == 6710) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 4);
							return;
						}
						if (opcode == 6711) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 5);
							return;
						}
						if (opcode == 6712) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 6);
							return;
						}
						if (opcode == 6713) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 7);
							return;
						}
						if (opcode == 6714) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 8);
							return;
						}
						if (opcode == 6715) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 9);
							return;
						}
						if (opcode == 6716) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							Static120.method2193(local192 << 16 | local834, local109, "", 10);
							return;
						}
						if (opcode == 6717) {
							isp -= 3;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							local109 = intStack[isp + 2];
							@Pc(8940) Class158 local8940 = Static15.method186(local109, local192 << 16 | local834);
							Static470.method6391();
							@Pc(8945) Class2_Sub41 local8945 = Static84.method1661(local8940);
							Static389.method5483(local8945.method6223(), local8940, local8945.anInt6925);
							return;
						}
					} else if (opcode < 6900) {
						@Pc(8975) Class105 local8975;
						if (opcode == 6800) {
							local192 = intStack[--isp];
							local8975 = Static577.aClass248_4.method5591(local192);
							if (local8975.aString25 == null) {
								aStringArray37[anInt7160++] = "";
								return;
							}
							aStringArray37[anInt7160++] = local8975.aString25;
							return;
						}
						if (opcode == 6801) {
							local192 = intStack[--isp];
							local8975 = Static577.aClass248_4.method5591(local192);
							intStack[isp++] = local8975.anInt2605;
							return;
						}
						if (opcode == 6802) {
							local192 = intStack[--isp];
							local8975 = Static577.aClass248_4.method5591(local192);
							intStack[isp++] = local8975.anInt2624;
							return;
						}
						if (opcode == 6803) {
							local192 = intStack[--isp];
							local8975 = Static577.aClass248_4.method5591(local192);
							intStack[isp++] = local8975.anInt2606;
							return;
						}
						if (opcode == 6804) {
							isp -= 2;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							@Pc(9098) Class298 local9098 = Static386.aClass49_2.method1161(local834);
							if (local9098.method6679()) {
								aStringArray37[anInt7160++] = Static577.aClass248_4.method5591(local192).method2426(local834, local9098.aString89);
								return;
							}
							intStack[isp++] = Static577.aClass248_4.method5591(local192).method2427(local9098.anInt7532, local834);
							return;
						}
					} else if (opcode < 7000) {
						if (opcode == 6900) {
							intStack[isp++] = Static389.aBoolean459 && !Static34.aBoolean62 ? 1 : 0;
							return;
						}
						if (opcode == 6901) {
							intStack[isp++] = (int) (Static416.aLong207 / 60000L);
							intStack[isp++] = (int) ((Static416.aLong207 - Static588.currentTimeMillis() - Static94.aLong70) / 60000L);
							intStack[isp++] = Static425.aBoolean482 ? 1 : 0;
							return;
						}
						if (opcode == 6902) {
							intStack[isp++] = Static677.anInt10262;
							return;
						}
						if (opcode == 6903) {
							intStack[isp++] = Static476.anInt7196;
							return;
						}
						if (opcode == 6904) {
							intStack[isp++] = Static323.anInt5135;
							return;
						}
						if (opcode == 6905) {
							local95 = "";
							if (Static439.aPrivilegedRequest_4 != null) {
								if (Static439.aPrivilegedRequest_4.result == null) {
									local95 = Static419.method5763(Static439.aPrivilegedRequest_4.anInt6809);
								} else {
									local95 = (String) Static439.aPrivilegedRequest_4.result;
								}
							}
							aStringArray37[anInt7160++] = local95;
							return;
						}
						if (opcode == 6906) {
							intStack[isp++] = Static335.anInt5481;
							return;
						}
						if (opcode == 6907) {
							intStack[isp++] = Static626.anInt9499;
							return;
						}
						if (opcode == 6908) {
							intStack[isp++] = Static636.anInt9553;
							return;
						}
						if (opcode == 6909) {
							intStack[isp++] = Static420.aBoolean479 ? 1 : 0;
							return;
						}
						if (opcode == 6910) {
							intStack[isp++] = Static106.anInt2162;
							return;
						}
						if (opcode == 6911) {
							intStack[isp++] = Static639.anInt9597;
							return;
						}
						if (opcode == 6912) {
							intStack[isp++] = Static438.anInt6660;
							return;
						}
						if (opcode == 6913) {
							intStack[isp++] = Static435.anInt6614;
							return;
						}
						if (opcode == 6914) {
							intStack[isp++] = Static684.aBoolean776 ? 1 : 0;
							return;
						}
						if (opcode == 6915) {
							intStack[isp++] = Static134.anInt10354;
							return;
						}
					} else if (opcode < 7100) {
						if (opcode == 7000) {
							local192 = Static519.method6838();
							intStack[isp++] = Static165.anInt2819 = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922();
							intStack[isp++] = local192;
							Static449.method6123();
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (opcode == 7001) {
							Static395.method9169();
							Static449.method6123();
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (opcode == 7002) {
							Static133.method2316();
							Static449.method6123();
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (opcode == 7003) {
							Static75.method6246();
							Static449.method6123();
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (opcode == 7004) {
							Static468.method7650();
							Static449.method6123();
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (opcode == 7005) {
							Static400.aClass2_Sub34_28.method5111(0, Static400.aClass2_Sub34_28.aClass57_Sub15_1);
							Static666.method8700(1);
							Static503.aBoolean578 = false;
							return;
						}
						if (opcode == 7006) {
							if (Static165.anInt2819 == 2) {
								Static449.aBoolean511 = true;
								return;
							}
							if (Static165.anInt2819 == 1) {
								Static698.aBoolean793 = true;
								return;
							}
							if (Static165.anInt2819 == 3) {
								Static78.aBoolean139 = true;
							}
							return;
						}
						if (opcode == 7007) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub15_1.method5327();
							return;
						}
					} else if (opcode < 7200) {
						if (opcode == 7100) {
							isp -= 2;
							local192 = intStack[isp];
							local834 = intStack[isp + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static515.method6809(false, local192, local834);
							}
							return;
						}
						if (opcode == 7101) {
							local192 = intStack[--isp];
							if (local192 != -1) {
								Static121.method2199(local192);
							}
							return;
						}
						if (opcode == 7102) {
							local192 = intStack[--isp];
							if (local192 != -1) {
								Static695.method9274(local192);
							}
							return;
						}
						if (opcode == 7103) {
							intStack[isp++] = Static183.method2796("jagtheora") ? 1 : 0;
							return;
						}
					} else if (opcode < 7300) {
						if (opcode == 7201) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method2715() ? 1 : 0;
							return;
						}
						if (opcode == 7202) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2906() ? 1 : 0;
							return;
						}
						if (opcode == 7203) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4367() ? 1 : 0;
							return;
						}
						if (opcode == 7204) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7471() ? 1 : 0;
							return;
						}
						if (opcode == 7205) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub13_2.method4379() && Static163.aClass19_17.method8022() ? 1 : 0;
							return;
						}
						if (opcode == 7206) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub28_1.method7844() ? 1 : 0;
							return;
						}
						if (opcode == 7207) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub5_1.method2173() ? 1 : 0;
							return;
						}
						if (opcode == 7208) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub20_1.method6114() && Static163.aClass19_17.method7943() ? 1 : 0;
							return;
						}
						if (opcode == 7209) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method7060() ? 1 : 0;
							return;
						}
						if (opcode == 7210) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8362() ? 1 : 0;
							return;
						}
						if (opcode == 7211) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method5775() ? 1 : 0;
							return;
						}
						if (opcode == 7212) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub16_1.method5511() ? 1 : 0;
							return;
						}
						if (opcode == 7213) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method2117() ? 1 : 0;
							return;
						}
						if (opcode == 7214) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub29_2.method7924() ? 1 : 0;
							return;
						}
						if (opcode == 7215) {
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub2_1.method1985() ? 1 : 0;
							return;
						}
					} else if (opcode < 7400) {
						if (opcode == 7301) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub6_1.method8359(local192);
							return;
						}
						if (opcode == 7302) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub7_1.method8359(local192);
							return;
						}
						if (opcode == 7303) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method8359(local192);
							return;
						}
						if (opcode == 7304) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method8359(local192);
							return;
						}
						if (opcode == 7305) {
							local192 = intStack[--isp];
							if (!Static163.aClass19_17.method8022()) {
								intStack[isp++] = 3;
								return;
							}
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub13_2.method8359(local192);
							return;
						}
						if (opcode == 7306) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub28_1.method8359(local192);
							return;
						}
						if (opcode == 7307) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub5_1.method8359(local192);
							return;
						}
						if (opcode == 7308) {
							local192 = intStack[--isp];
							if (!Static163.aClass19_17.method7943()) {
								intStack[isp++] = 3;
								return;
							}
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub20_1.method8359(local192);
							return;
						}
						if (opcode == 7309) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method8359(local192);
							return;
						}
						if (opcode == 7310) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8359(local192);
							return;
						}
						if (opcode == 7311) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method8359(local192);
							return;
						}
						if (opcode == 7312) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub16_1.method8359(local192);
							return;
						}
						if (opcode == 7313) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub3_1.method8359(local192);
							return;
						}
						if (opcode == 7314) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub29_2.method8359(local192);
							return;
						}
						if (opcode == 7315) {
							local192 = intStack[--isp];
							intStack[isp++] = Static400.aClass2_Sub34_28.aClass57_Sub2_1.method8359(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(opcode));
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!pd;I)V")
	public static void method6429(@OriginalArg(0) Class2_Sub42 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub2_Sub10 local12 = Static488.method6532(local8);
		if (local12 == null) {
			return;
		}
		anIntArray580 = new int[local12.anInt2957];
		@Pc(22) int local22 = 0;
		aStringArray36 = new String[local12.anInt2959];
		@Pc(28) int local28 = 0;
		aLongArray15 = new long[local12.anInt2958];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt7239;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt7235;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass158_14 == null ? -1 : arg0.aClass158_14.anInt3823;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt7240;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass158_14 == null ? -1 : arg0.aClass158_14.anInt3751;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass158_13 == null ? -1 : arg0.aClass158_13.anInt3823;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass158_13 == null ? -1 : arg0.aClass158_13.anInt3751;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt7237;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt7242;
				}
				anIntArray580[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString84;
				}
				aStringArray36[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray15[local34++] = local180;
			}
		}
		anInt7174 = arg0.anInt7241;
		method6426(local12, arg1);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(C)I")
	public static int method6430(@OriginalArg(0) char arg0) {
		return Static604.method7912(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method6432(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass164_7.method3484(Static392.game.id << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6433(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static608.anInt9316 == 0 && (Static389.aBoolean459 && !Static34.aBoolean62 || Static617.aBoolean725)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static32.aClass32_47.method877(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static32.aClass32_47.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_48.method877(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static32.aClass32_48.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_49.method877(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static32.aClass32_49.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_50.method877(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static32.aClass32_50.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_51.method877(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static32.aClass32_51.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_52.method877(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static32.aClass32_52.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_53.method877(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static32.aClass32_53.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_54.method877(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static32.aClass32_54.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_55.method877(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static32.aClass32_55.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_56.method877(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static32.aClass32_56.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_57.method877(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static32.aClass32_57.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_58.method877(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static32.aClass32_58.method877(0).length());
		} else if (client.lang != 0) {
			if (local18.startsWith(Static32.aClass32_47.method877(client.lang))) {
				local20 = 0;
				arg0 = arg0.substring(Static32.aClass32_47.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_48.method877(client.lang))) {
				local20 = 1;
				arg0 = arg0.substring(Static32.aClass32_48.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_49.method877(client.lang))) {
				local20 = 2;
				arg0 = arg0.substring(Static32.aClass32_49.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_50.method877(client.lang))) {
				local20 = 3;
				arg0 = arg0.substring(Static32.aClass32_50.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_51.method877(client.lang))) {
				local20 = 4;
				arg0 = arg0.substring(Static32.aClass32_51.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_52.method877(client.lang))) {
				local20 = 5;
				arg0 = arg0.substring(Static32.aClass32_52.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_53.method877(client.lang))) {
				local20 = 6;
				arg0 = arg0.substring(Static32.aClass32_53.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_54.method877(client.lang))) {
				local20 = 7;
				arg0 = arg0.substring(Static32.aClass32_54.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_55.method877(client.lang))) {
				local20 = 8;
				arg0 = arg0.substring(Static32.aClass32_55.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_56.method877(client.lang))) {
				local20 = 9;
				arg0 = arg0.substring(Static32.aClass32_56.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_57.method877(client.lang))) {
				local20 = 10;
				arg0 = arg0.substring(Static32.aClass32_57.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_58.method877(client.lang))) {
				local20 = 11;
				arg0 = arg0.substring(Static32.aClass32_58.method877(client.lang).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static32.aClass32_59.method877(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static32.aClass32_59.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_60.method877(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static32.aClass32_60.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_61.method877(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static32.aClass32_61.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_62.method877(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static32.aClass32_62.method877(0).length());
		} else if (local18.startsWith(Static32.aClass32_63.method877(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static32.aClass32_63.method877(0).length());
		} else if (client.lang != 0) {
			if (local18.startsWith(Static32.aClass32_59.method877(client.lang))) {
				local460 = 1;
				arg0 = arg0.substring(Static32.aClass32_59.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_60.method877(client.lang))) {
				local460 = 2;
				arg0 = arg0.substring(Static32.aClass32_60.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_61.method877(client.lang))) {
				local460 = 3;
				arg0 = arg0.substring(Static32.aClass32_61.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_62.method877(client.lang))) {
				local460 = 4;
				arg0 = arg0.substring(Static32.aClass32_62.method877(client.lang).length());
			} else if (local18.startsWith(Static32.aClass32_63.method877(client.lang))) {
				local460 = 5;
				arg0 = arg0.substring(Static32.aClass32_63.method877(client.lang).length());
			}
		}
		@Pc(650) Class153 local650 = Static668.method8708();
		@Pc(656) Class2_Sub19 local656 = Static293.method4342(Static278.aClass347_57, local650.aClass186_1);
		local656.aClass2_Sub21_Sub2_1.p1(0);
		@Pc(665) int local665 = local656.aClass2_Sub21_Sub2_1.pos;
		local656.aClass2_Sub21_Sub2_1.p1(local20);
		local656.aClass2_Sub21_Sub2_1.p1(local460);
		Static523.method3446(local656.aClass2_Sub21_Sub2_1, arg0);
		local656.aClass2_Sub21_Sub2_1.method7387(local656.aClass2_Sub21_Sub2_1.pos - local665);
		local650.method3275(local656);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6434(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub10 local5 = Static537.method7196(Static42.aClass244_4, arg0, -1);
		if (local5 == null) {
			return;
		}
		anIntArray580 = new int[local5.anInt2957];
		aStringArray36 = new String[local5.anInt2959];
		aStringArray36[0] = arg1;
		anIntArray580[0] = arg2;
		method6426(local5, 200000);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
	public static void method6435() {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lclient!mia;II)V")
	public static void method6436(@OriginalArg(0) Class244 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub2_Sub10 local5 = Static537.method7196(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray580 = new int[local5.anInt2957];
		aStringArray36 = new String[local5.anInt2959];
		if (local5.aClass244_5 == Static5.aClass244_1 || local5.aClass244_5 == Static639.aClass244_13 || local5.aClass244_5 == Static280.aClass244_7) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static210.aClass158_4 != null) {
				local35 = Static210.aClass158_4.anInt3745;
				local37 = Static210.aClass158_4.anInt3794;
			}
			anIntArray580[0] = Static189.aClass120_1.method8860() - local35;
			anIntArray580[1] = Static189.aClass120_1.method8861() - local37;
		}
		method6426(local5, 200000);
	}
}
