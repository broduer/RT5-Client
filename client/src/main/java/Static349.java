import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!kw", name = "r", descriptor = "[I")
	public static int[] anIntArray426;

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
	public static int anInt5713 = 0;

	@OriginalMember(owner = "client!kw", name = "u", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILclient!sb;IZIJB)V")
	public static void method5126(@OriginalArg(2) Class332 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) long arg3) {
		Static24.anInt597 = arg1;
		Static96.anInt10199 = 1;
		Static611.anInt9361 = 0;
		Static99.anInt2086 = arg2;
		Static497.aBoolean564 = false;
		Static190.anInt3121 = 10000;
		Static117.aClass2_Sub6_Sub1_2 = null;
		Static174.anInt2927 = 0;
		Static146.aLong95 = arg3;
		Static676.aClass332_121 = arg0;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZJ)V")
	public static void method5128(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static433.anInt6282;
		@Pc(19) int local19;
		@Pc(27) int local27;
		if (Static494.anInt7431 != local7) {
			local19 = local7 - Static494.anInt7431;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local19 < local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static494.anInt7431 += local27;
		}
		@Pc(75) int local75 = Static249.anInt4029;
		if (local75 != Static38.anInt924) {
			local19 = local75 - Static38.anInt924;
			local27 = (int) ((long) local19 * arg0 / 320L);
			if (local19 <= 0) {
				if (local27 == 0) {
					local27 = -1;
				} else if (local19 > local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = 1;
			} else if (local19 < local27) {
				local27 = local19;
			}
			Static38.anInt924 += local27;
		}
		Static171.aFloat64 += Static552.aFloat207 * (float) arg0 / 40.0F * 8.0F;
		Static479.aFloat123 += Static288.aFloat83 * (float) arg0 / 40.0F * 8.0F;
		Static723.method9458();
	}
}
