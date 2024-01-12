import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "[S")
	public static short[] aShortArray63;

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "Lclient!it;")
	public static final Class184 aClass184_10 = new Class184(14, 0, 4, 1);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILclient!sb;Lclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class19 method3637(@OriginalArg(0) int arg0, @OriginalArg(2) Class332 arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) Canvas arg3) {
		if (!Static651.method8523()) {
			throw new RuntimeException("");
		} else if (Static14.method179("jaggl")) {
			@Pc(28) OpenGL local28 = new OpenGL();
			@Pc(38) long local38 = local28.init(arg3, 8, 8, 8, 24, 0, arg0);
			if (local38 == 0L) {
				throw new RuntimeException("");
			}
			@Pc(58) Class19_Sub1_Sub2 local58 = new Class19_Sub1_Sub2(local28, arg3, local38, arg2, arg1, arg0);
			local58.method8141();
			return local58;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLclient!cg;Z)V")
	public static void method3638(@OriginalArg(1) Class8_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class291 local9 = arg0.method9324();
		if (arg0.anInt10793 == 0) {
			arg0.anInt10792 = 0;
			Static524.anInt8065 = 0;
			Static521.anInt7779 = -1;
			return;
		}
		if (arg0.aClass152_11.method9116() && !arg0.aClass152_11.method9113()) {
			@Pc(41) Class69 local41 = arg0.aClass152_11.method9114();
			if (arg0.anInt10791 > 0 && local41.anInt1649 == 0) {
				Static524.anInt8065 = 0;
				Static521.anInt7779 = -1;
				arg0.anInt10792++;
				return;
			}
			if (arg0.anInt10791 <= 0 && local41.anInt1661 == 0) {
				Static521.anInt7779 = -1;
				arg0.anInt10792++;
				Static524.anInt8065 = 0;
				return;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.aClass201Array3.length; local86++) {
			if (arg0.aClass201Array3[local86].anInt4947 != -1 && arg0.aClass201Array3[local86].aClass152_7.method9113()) {
				@Pc(117) Class229 local117 = Static23.aClass128_1.method2694(arg0.aClass201Array3[local86].anInt4947);
				if (local117.aBoolean448 && local117.anInt5862 != -1) {
					@Pc(133) Class69 local133 = Static25.aClass50_1.method1162(local117.anInt5862);
					if (arg0.anInt10791 > 0 && local133.anInt1649 == 0) {
						Static521.anInt7779 = -1;
						arg0.anInt10792++;
						Static524.anInt8065 = 0;
						return;
					}
					if (arg0.anInt10791 <= 0 && local133.anInt1661 == 0) {
						Static521.anInt7779 = -1;
						arg0.anInt10792++;
						Static524.anInt8065 = 0;
						return;
					}
				}
			}
		}
		@Pc(186) int local186 = arg0.anInt10718;
		@Pc(189) int local189 = arg0.anInt10722;
		@Pc(206) int local206 = arg0.anIntArray879[arg0.anInt10793 - 1] * 512 + arg0.method9309((byte) 76) * 256;
		@Pc(222) int local222 = arg0.anIntArray878[arg0.anInt10793 - 1] * 512 + arg0.method9309((byte) 105) * 256;
		if (local186 < local206) {
			if (local189 < local222) {
				arg0.method9312(10240);
			} else if (local222 < local189) {
				arg0.method9312(14336);
			} else {
				arg0.method9312(12288);
			}
		} else if (local206 >= local186) {
			if (local189 < local222) {
				arg0.method9312(8192);
			} else if (local222 < local189) {
				arg0.method9312(0);
			}
		} else if (local222 > local189) {
			arg0.method9312(6144);
		} else if (local222 < local189) {
			arg0.method9312(2048);
		} else {
			arg0.method9312(4096);
		}
		@Pc(348) byte local348 = arg0.aByteArray111[arg0.anInt10793 - 1];
		if (!arg1 && (local206 - local186 > 1024 || local206 - local186 < -1024 || local222 - local189 > 1024 || local222 - local189 < -1024)) {
			arg0.anInt10722 = local222;
			arg0.anInt10718 = local206;
			arg0.method9305(arg0.anInt10785, false);
			Static524.anInt8065 = 0;
			if (arg0.anInt10791 > 0) {
				arg0.anInt10791--;
			}
			Static521.anInt7779 = -1;
			arg0.anInt10793--;
			return;
		}
		@Pc(422) int local422 = 16;
		@Pc(424) boolean local424 = true;
		if (arg0 instanceof Class8_Sub2_Sub1_Sub2_Sub2) {
			local424 = ((Class8_Sub2_Sub1_Sub2_Sub2) arg0).aClass270_1.aBoolean501;
		}
		@Pc(468) int local468;
		if (local424) {
			local468 = arg0.anInt10785 - arg0.aClass126_7.anInt2898;
			if (local468 != 0 && arg0.anInt10750 == -1 && arg0.anInt10786 != 0) {
				local422 = 8;
			}
			if (!arg1 && arg0.anInt10793 > 2) {
				local422 = 24;
			}
			if (!arg1 && arg0.anInt10793 > 3) {
				local422 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt10793 > 1) {
				local422 = 24;
			}
			if (!arg1 && arg0.anInt10793 > 2) {
				local422 = 32;
			}
		}
		if (arg0.anInt10792 > 0 && arg0.anInt10793 > 1) {
			arg0.anInt10792--;
			local422 = 32;
		}
		if (local348 == 2) {
			local422 <<= 0x1;
		} else if (local348 == 0) {
			local422 >>= 0x1;
		}
		if (local9.anInt7250 != -1) {
			local422 <<= 0x9;
			if (arg0.anInt10793 == 1) {
				local468 = arg0.anInt10794 * arg0.anInt10794;
				@Pc(642) int local642 = (local206 >= arg0.anInt10718 ? local206 - arg0.anInt10718 : arg0.anInt10718 - local206) << 9;
				@Pc(661) int local661 = (arg0.anInt10722 <= local222 ? local222 - arg0.anInt10722 : arg0.anInt10722 + -local222) << 9;
				@Pc(673) int local673 = local642 > local661 ? local642 : local661;
				@Pc(680) int local680 = local673 * local9.anInt7250 * 2;
				if (local680 < local468) {
					arg0.anInt10794 /= 2;
				} else if (local468 / 2 > local673) {
					arg0.anInt10794 -= local9.anInt7250;
					if (arg0.anInt10794 < 0) {
						arg0.anInt10794 = 0;
					}
				} else if (local422 > arg0.anInt10794) {
					arg0.anInt10794 += local9.anInt7250;
					if (arg0.anInt10794 > local422) {
						arg0.anInt10794 = local422;
					}
				}
			} else if (local422 > arg0.anInt10794) {
				arg0.anInt10794 += local9.anInt7250;
				if (local422 < arg0.anInt10794) {
					arg0.anInt10794 = local422;
				}
			} else if (arg0.anInt10794 > 0) {
				arg0.anInt10794 -= local9.anInt7250;
				if (arg0.anInt10794 < 0) {
					arg0.anInt10794 = 0;
				}
			}
			local422 = arg0.anInt10794 >> 9;
			if (local422 < 1) {
				local422 = 1;
			}
		}
		Static524.anInt8065 = 0;
		if (local206 == local186 && local189 == local222) {
			Static521.anInt7779 = -1;
		} else {
			if (local206 > local186) {
				arg0.anInt10718 += local422;
				Static524.anInt8065 |= 0x4;
				if (arg0.anInt10718 > local206) {
					arg0.anInt10718 = local206;
				}
			} else if (local206 < local186) {
				arg0.anInt10718 -= local422;
				Static524.anInt8065 |= 0x8;
				if (local206 > arg0.anInt10718) {
					arg0.anInt10718 = local206;
				}
			}
			if (local422 >= 32) {
				Static521.anInt7779 = 2;
			} else {
				Static521.anInt7779 = local348;
			}
			if (local222 > local189) {
				Static524.anInt8065 |= 0x1;
				arg0.anInt10722 += local422;
				if (local222 < arg0.anInt10722) {
					arg0.anInt10722 = local222;
				}
			} else if (local222 < local189) {
				arg0.anInt10722 -= local422;
				Static524.anInt8065 |= 0x2;
				if (local222 > arg0.anInt10722) {
					arg0.anInt10722 = local222;
				}
			}
		}
		if (arg0.anInt10718 != local206 || local222 != arg0.anInt10722) {
			return;
		}
		arg0.anInt10793--;
		if (arg0.anInt10791 > 0) {
			arg0.anInt10791--;
			return;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!da;Ljava/lang/String;Lclient!ve;IIIZLclient!hda;Lclient!aa;III)V")
	public static void method3639(@OriginalArg(0) Class14 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class383 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class158 arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static511.anInt7668 == 4) {
			local11 = (int) Static171.aFloat64 & 0x3FFF;
		} else {
			local11 = (int) Static171.aFloat64 + Static29.anInt726 & 0x3FFF;
		}
		@Pc(33) int local33 = Math.max(arg6.anInt3813 / 2, arg6.anInt3756 / 2) + 10;
		@Pc(59) int local59 = arg8 * arg8 + arg10 * arg10;
		if (local33 * local33 < local59) {
			return;
		}
		@Pc(74) int local74 = Class363.anIntArray741[local11];
		@Pc(78) int local78 = Class363.anIntArray740[local11];
		if (Static511.anInt7668 != 4) {
			local74 = local74 * 256 / (Static660.anInt9861 + 256);
			local78 = local78 * 256 / (Static660.anInt9861 + 256);
		}
		@Pc(107) int local107 = local78 * arg10 + arg8 * local74 >> 14;
		@Pc(118) int local118 = arg8 * local78 - arg10 * local74 >> 14;
		@Pc(125) int local125 = arg2.method8748((Class23[]) null, arg1, 100);
		@Pc(131) int local131 = local107 - local125 / 2;
		@Pc(139) int local139 = arg2.method8752(100, 0, arg1, (Class23[]) null);
		if (local131 >= -arg6.anInt3813 && arg6.anInt3813 >= local131 && local118 >= -arg6.anInt3756 && arg6.anInt3756 >= local118) {
			arg0.method8833(arg9, (int[]) null, arg4, arg1, arg7, (Class23[]) null, arg6.anInt3756 / 2 + arg9 - local118 - arg5 - local139, 0, arg3, 1, arg6.anInt3813 / 2 + local131 + arg3, 0, 0, local125, 50);
		}
	}
}
