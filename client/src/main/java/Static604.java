import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
	public static final int[] anIntArray708 = new int[16];

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(JI)V")
	public static void method7910(@OriginalArg(0) long arg0) {
		@Pc(9) int local9 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 + Static508.anInt7650;
		@Pc(15) int local15 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 + Static145.anInt2570;
		if (Static494.anInt7431 - local9 < -2000 || Static494.anInt7431 - local9 > 2000 || Static38.anInt924 - local15 < -2000 || Static38.anInt924 - local15 > 2000) {
			Static38.anInt924 = local15;
			Static494.anInt7431 = local9;
		}
		@Pc(68) int local68;
		@Pc(76) int local76;
		if (local9 != Static494.anInt7431) {
			local68 = local9 - Static494.anInt7431;
			local76 = (int) (arg0 * (long) local68 / 320L);
			if (local68 <= 0) {
				if (local76 == 0) {
					local76 = -1;
				} else if (local76 < local68) {
					local76 = local68;
				}
			} else if (local76 == 0) {
				local76 = 1;
			} else if (local68 < local76) {
				local76 = local68;
			}
			Static494.anInt7431 += local76;
		}
		if (local15 != Static38.anInt924) {
			local68 = local15 - Static38.anInt924;
			local76 = (int) ((long) local68 * arg0 / 320L);
			if (local68 > 0) {
				if (local76 == 0) {
					local76 = 1;
				} else if (local76 > local68) {
					local76 = local68;
				}
			} else if (local76 == 0) {
				local76 = -1;
			} else if (local68 > local76) {
				local76 = local68;
			}
			Static38.anInt924 += local76;
		}
		Static479.aFloat123 += Static288.aFloat83 * (float) arg0 / 6.0F;
		Static171.aFloat64 += (float) arg0 * Static552.aFloat207 / 6.0F;
		Static723.method9458();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
	public static boolean method7911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BC)Z")
	public static boolean method7912(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
