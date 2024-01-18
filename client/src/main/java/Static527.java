import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!qka", name = "i", descriptor = "[Lclient!nba;")
	public static final Class256[] aClass256Array1 = new Class256[8];

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(IBIII)V")
	public static void method7088(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static232.anInt3840 = arg1;
		Static240.anInt3966 = arg2;
		Static275.anInt4437 = arg0;
		Static168.anInt2851 = arg3;
	}

	@OriginalMember(owner = "client!qka", name = "c", descriptor = "(I)V")
	public static void method7090() {
		for (@Pc(15) Class2_Sub2_Sub15 local15 = (Class2_Sub2_Sub15) Static505.aClass341_77.method7706(65280); local15 != null; local15 = (Class2_Sub2_Sub15) Static505.aClass341_77.method7713()) {
			@Pc(20) Class8_Sub2_Sub1_Sub1 local20 = local15.aClass8_Sub2_Sub1_Sub1_1;
			if (client.cycle > local20.anInt699) {
				local15.unlink();
				local20.method815();
			} else if (client.cycle >= local20.anInt725) {
				local20.method816();
				if (local20.anInt714 > 0) {
					if (Static1.anInt10827 == 3) {
						@Pc(61) Class8_Sub2_Sub1_Sub2 local61 = Static219.aClass238Array1[local20.anInt714 - 1].method5370();
						if (local61 != null && local61.anInt10718 >= 0 && local61.anInt10718 < Static720.anInt10888 * 512 && local61.anInt10722 >= 0 && local61.anInt10722 < Static501.anInt7591 * 512) {
							local20.method813(Static102.method2025(local20.aByte144, -29754, local61.anInt10722, local61.anInt10718) - local20.anInt712, client.cycle, local61.anInt10722, local61.anInt10718);
						}
					} else {
						@Pc(130) Class2_Sub45 local130 = (Class2_Sub45) Static18.aClass28_2.method738(local20.anInt714 - 1);
						if (local130 != null) {
							@Pc(135) Class8_Sub2_Sub1_Sub2_Sub2 local135 = local130.aClass8_Sub2_Sub1_Sub2_Sub2_2;
							if (local135.anInt10718 >= 0 && local135.anInt10718 < Static720.anInt10888 * 512 && local135.anInt10722 >= 0 && local135.anInt10722 < Static501.anInt7591 * 512) {
								local20.method813(Static102.method2025(local20.aByte144, -29754, local135.anInt10722, local135.anInt10718) - local20.anInt712, client.cycle, local135.anInt10722, local135.anInt10718);
							}
						}
					}
				}
				if (local20.anInt714 < 0) {
					@Pc(193) int local193 = -local20.anInt714 - 1;
					@Pc(198) Class8_Sub2_Sub1_Sub2_Sub1 local198;
					if (local193 == Static312.anInt5017) {
						local198 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
					} else {
						local198 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local193];
					}
					if (local198 != null && local198.anInt10718 >= 0 && Static720.anInt10888 * 512 > local198.anInt10718 && local198.anInt10722 >= 0 && Static501.anInt7591 * 512 > local198.anInt10722) {
						local20.method813(Static102.method2025(local20.aByte144, -29754, local198.anInt10722, local198.anInt10718) - local20.anInt712, client.cycle, local198.anInt10722, local198.anInt10718);
					}
				}
				local20.method819(Static35.anInt803);
				Static102.method2026(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!qka", name = "a", descriptor = "(III)V")
	public static void method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static334.aClass293ArrayArrayArray1[0][arg1][arg2] != null && Static334.aClass293ArrayArrayArray1[0][arg1][arg2].aClass293_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static334.aClass293ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(47) Class293 local47 = Static334.aClass293ArrayArrayArray1[local25][arg1][arg2] = new Class293(local25);
				if (local23) {
					local47.aByte116++;
				}
			}
		}
	}
}
