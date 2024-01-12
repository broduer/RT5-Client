import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)I")
	public static int method8964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static273.anInt4416 < 100) {
			return -2;
		}
		@Pc(13) int local13 = -2;
		@Pc(15) int local15 = Integer.MAX_VALUE;
		@Pc(19) int local19 = arg2 - Static30.anInt5675;
		@Pc(23) int local23 = arg1 - Static30.anInt5668;
		for (@Pc(34) Class2_Sub20 local34 = (Class2_Sub20) Static30.aClass341_31.method7706(65280); local34 != null; local34 = (Class2_Sub20) Static30.aClass341_31.method7713()) {
			if (local34.anInt3140 == arg0) {
				@Pc(46) int local46 = local34.anInt3138;
				@Pc(49) int local49 = local34.anInt3133;
				@Pc(59) int local59 = Static30.anInt5668 + local49 | Static30.anInt5675 + local46 << 14;
				@Pc(78) int local78 = (local23 - local49) * (local23 - local49) + (local19 - local46) * (-local46 + local19);
				if (local13 < 0 || local15 > local78) {
					local15 = local78;
					local13 = local59;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBII)V")
	public static void method8965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 != 8 && arg2 != 16) {
			@Pc(28) Class293 local28 = Static334.aClass293ArrayArrayArray1[arg1][arg0][arg3];
			if (local28 != null) {
				if (arg2 == 1) {
					local28.aShort84 = 0;
				} else if (arg2 == 2) {
					local28.aShort83 = 0;
				}
			}
			Static416.method5712();
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < Static150.anInt2643; local61++) {
			@Pc(67) Class75 local67 = Static285.aClass75Array1[local61];
			if (local67.aByte43 == arg2 && arg0 == local67.aShort26 && arg3 == local67.aShort23 || local67.aShort24 == arg0 && arg3 == local67.aShort23) {
				if (local61 != Static150.anInt2643) {
					Static734.method7698(Static285.aClass75Array1, local61 + 1, Static285.aClass75Array1, local61, Static285.aClass75Array1.length - local61 - 1);
				}
				Static150.anInt2643--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)Lclient!eia;")
	public static Class8_Sub2_Sub2 method8966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass8_Sub2_Sub2_1 == null ? null : local7.aClass8_Sub2_Sub2_1;
	}
}
