import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!cg", name = "W", descriptor = "Lclient!pc;")
	public static final Class289 aClass289_18 = new Class289(6, 16);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIILclient!kp;I)Z")
	public static boolean method9315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub2_Sub3 arg2, @OriginalArg(4) int arg3) {
		if (!Static18.aBoolean20 || !Static29.aBoolean60) {
			return false;
		} else if (Static432.anInt527 < 100) {
			return false;
		} else if (Static588.method7721(arg1, arg3, arg0)) {
			@Pc(31) int local31 = arg0 << Static52.anInt1070;
			@Pc(35) int local35 = arg1 << Static52.anInt1070;
			@Pc(45) int local45 = Static246.aClass178Array1[arg3].method7876(arg1, arg0) - 1;
			@Pc(51) int local51 = arg2.method9293(2) + local45;
			if (arg2.aShort58 == 1) {
				if (!Static172.method2674(local31, local35, local51, local51, local45, local35, Static340.anInt5606 + local35, local31, local31)) {
					return false;
				} else if (Static172.method2674(local31, local35, local51, local45, local45, local35 + Static340.anInt5606, local35 + Static340.anInt5606, local31, local31)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 2) {
				if (!Static172.method2674(local31 + Static340.anInt5606, local35 - -Static340.anInt5606, local51, local51, local45, local35 + Static340.anInt5606, Static340.anInt5606 + local35, local31, local31)) {
					return false;
				} else if (Static172.method2674(local31 + Static340.anInt5606, local35 - -Static340.anInt5606, local45, local51, local45, Static340.anInt5606 + local35, local35 + Static340.anInt5606, local31, local31 + Static340.anInt5606)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 4) {
				if (!Static172.method2674(Static340.anInt5606 + local31, local35, local51, local51, local45, local35, Static340.anInt5606 + local35, local31 - -Static340.anInt5606, Static340.anInt5606 + local31)) {
					return false;
				} else if (Static172.method2674(local31 + Static340.anInt5606, local35, local51, local45, local45, Static340.anInt5606 + local35, Static340.anInt5606 + local35, local31 + Static340.anInt5606, Static340.anInt5606 + local31)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 8) {
				if (!Static172.method2674(Static340.anInt5606 + local31, local35, local51, local51, local45, local35, local35, local31, local31)) {
					return false;
				} else if (Static172.method2674(Static340.anInt5606 + local31, local35, local45, local51, local45, local35, local35, local31, local31 + Static340.anInt5606)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 16) {
				if (Static318.method8564(Static247.anInt4004, local51, local31, Static247.anInt4004 + local35, local45, Static247.anInt4004)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 32) {
				if (Static318.method8564(Static247.anInt4004, local51, local31 + Static247.anInt4004, Static247.anInt4004 + local35, local45, Static247.anInt4004)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 == 64) {
				if (Static318.method8564(Static247.anInt4004, local51, Static247.anInt4004 + local31, local35, local45, Static247.anInt4004)) {
					Static679.anInt10306++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort58 != 128) {
				return true;
			} else if (Static318.method8564(Static247.anInt4004, local51, local31, local35, local45, Static247.anInt4004)) {
				Static679.anInt10306++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([[BBLclient!taa;)V")
	public static void method9319(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class308_Sub1 arg1) {
		@Pc(6) int local6 = arg0.length;
		@Pc(26) int local26;
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(13) byte[] local13 = arg0[local8];
			if (local13 != null) {
				@Pc(20) Buffer local20 = new Buffer(local13);
				local26 = Static89.anIntArray169[local8] >> 8;
				@Pc(32) int local32 = Static89.anIntArray169[local8] & 0xFF;
				@Pc(38) int local38 = local26 * 64 - Static691.anInt10395;
				@Pc(45) int local45 = local32 * 64 - Static116.anInt2279;
				Static557.method7338();
				arg1.method7886(local20, local45, Static577.aClass110Array1, Static116.anInt2279, Static691.anInt10395, local38);
				arg1.method7900(local45, local20, local38, Static163.aClass19_17);
			}
		}
		for (@Pc(78) int local78 = 0; local78 < local6; local78++) {
			@Pc(90) int local90 = (Static89.anIntArray169[local78] >> 8) * 64 - Static691.anInt10395;
			local26 = (Static89.anIntArray169[local78] & 0xFF) * 64 - Static116.anInt2279;
			@Pc(105) byte[] local105 = arg0[local78];
			if (local105 == null && Static525.anInt8931 < 800) {
				Static557.method7338();
				arg1.method7887(local90, local26);
			}
		}
	}
}
