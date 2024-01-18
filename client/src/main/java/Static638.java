import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	public static void method8400() {
		synchronized (Class43.aClass130Array1) {
			for (@Pc(9) int local9 = 0; local9 < Class43.aClass130Array1.length; local9++) {
				Class43.aClass130Array1[local9] = new Class130();
				Static159.anIntArray245[local9] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)Lclient!gh;")
	public static Class145 method8403() {
		try {
			return (Class145) Class.forName("Class145_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
	public static void method8404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static12.anInt5761 = arg1;
		Static55.anInt1129 = arg3;
		Static314.anInt5052 = arg0;
		Static179.anInt3000 = arg4;
		Static441.anInt6709 = arg2;
		if (Static179.anInt3000 >= 100) {
			@Pc(22) int local22 = Static441.anInt6709 * 512 + 256;
			@Pc(28) int local28 = Static12.anInt5761 * 512 + 256;
			@Pc(36) int local36 = Static102.method2025(Static394.anInt6196, -29754, local28, local22) - Static55.anInt1129;
			@Pc(41) int local41 = local22 - Static170.anInt2873;
			@Pc(46) int local46 = local36 - Static359.anInt5821;
			@Pc(51) int local51 = local28 - Static110.anInt2195;
			@Pc(62) int local62 = (int) Math.sqrt(local51 * local51 + local41 * local41);
			Static598.anInt8856 = (int) (Math.atan2(local46, local62) * 2607.5945876176133D) & 0x3FFF;
			Static323.anInt5136 = (int) (-2607.5945876176133D * Math.atan2(local41, local51)) & 0x3FFF;
			if (Static598.anInt8856 < 1024) {
				Static598.anInt8856 = 1024;
			}
			Static81.anInt1651 = 0;
			if (Static598.anInt8856 > 3072) {
				Static598.anInt8856 = 3072;
			}
		}
		Static693.anInt10411 = -1;
		Static692.anInt10404 = -1;
		Static511.anInt7668 = 2;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Lclient!nda;")
	public static Class8_Sub2_Sub5 method8405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class8_Sub2_Sub5 local15 = local7.aClass8_Sub2_Sub5_1;
			local7.aClass8_Sub2_Sub5_1 = null;
			Static109.method2068(local15);
			return local15;
		}
	}
}
