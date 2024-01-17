import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!laa", name = "h", descriptor = "[I")
	public static final int[] anIntArray437 = new int[8];

	@OriginalMember(owner = "client!laa", name = "l", descriptor = "J")
	public static long aLong173 = -1L;

	@OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
	public static final int anInt5739 = 0;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B[I[Ljava/lang/String;)V")
	public static void method5144(@OriginalArg(1) int[] arg0, @OriginalArg(2) String[] arg1) {
		Static316.method7507(arg1, arg0, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lclient!ha;ILclient!el;ILclient!fu;I)Z")
	public static boolean method5145(@OriginalArg(0) Class19 arg0, @OriginalArg(2) Class105 arg1, @OriginalArg(4) Class2_Sub20 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray228 != null) {
			local13 = Static30.anInt5666 - (arg2.anInt3133 + arg1.anInt2597 - Static30.anInt5674) * (Static30.anInt5666 - Static30.anInt5673) / (Static30.anInt5665 - Static30.anInt5674);
			local11 = Static30.anInt5666 - (arg2.anInt3133 + arg1.anInt2603 - Static30.anInt5674) * (Static30.anInt5666 + -Static30.anInt5673) / (Static30.anInt5665 - Static30.anInt5674);
			local7 = Static30.anInt5669 + (Static30.anInt5671 - Static30.anInt5669) * (-Static30.anInt5672 + arg1.anInt2607 - -arg2.anInt3138) / (Static30.anInt5667 - Static30.anInt5672);
			local9 = Static30.anInt5669 + (arg1.anInt2623 + arg2.anInt3138 - Static30.anInt5672) * (Static30.anInt5671 - Static30.anInt5669) / (Static30.anInt5667 - Static30.anInt5672);
		}
		@Pc(102) Class23 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		if (arg1.anInt2605 != -1) {
			if (arg2.aBoolean256 && arg1.anInt2600 != -1) {
				local102 = arg1.method2431(true, arg0);
			} else {
				local102 = arg1.method2431(false, arg0);
			}
			if (local102 != null) {
				local104 = arg2.anInt3139 - (local102.method8210() + 1 >> 1);
				local106 = arg2.anInt3139 + (local102.method8210() + 1 >> 1);
				if (local7 > local104) {
					local7 = local104;
				}
				if (local106 > local9) {
					local9 = local106;
				}
				local108 = arg2.anInt3131 - (local102.method8199() + 1 >> 1);
				if (local11 > local108) {
					local11 = local108;
				}
				local110 = arg2.anInt3131 + (local102.method8199() + 1 >> 1);
				if (local110 > local13) {
					local13 = local110;
				}
			}
		}
		@Pc(209) Class329 local209 = null;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(312) int local312;
		if (arg1.aString25 != null) {
			local209 = Static390.method5500(arg1.anInt2624);
			if (local209 != null) {
				local211 = Static154.aClass383_6.method8747(Static37.aStringArray5, null, null, arg1.aString25);
				local215 = arg2.anInt3131 - arg1.anInt2626 * (Static30.anInt5666 - Static30.anInt5673) / (Static30.anInt5665 - Static30.anInt5674);
				local213 = arg1.anInt2609 * (Static30.anInt5671 - Static30.anInt5669) / (Static30.anInt5667 - Static30.anInt5672) + arg2.anInt3139;
				if (local102 == null) {
					local215 -= local211 * local209.method7545() / 2;
				} else {
					local215 -= (local102.method8199() >> 1) + (local209.method7543() * local211);
				}
				for (local312 = 0; local312 < local211; local312++) {
					@Pc(318) String local318 = Static37.aStringArray5[local312];
					if (local312 < local211 - 1) {
						local318 = local318.substring(0, local318.length() - 4);
					}
					@Pc(335) int local335 = local209.method7546(local318);
					if (local335 > local217) {
						local217 = local335;
					}
				}
				local227 = local213 - local217 / 2;
				local229 = local217 / 2 + local213;
				if (local7 > local227) {
					local7 = local227;
				}
				if (local9 < local229) {
					local9 = local229;
				}
				local231 = local215;
				local233 = local215 + local211 * local209.method7543();
				if (local11 > local231) {
					local11 = local231;
				}
				if (local233 > local13) {
					local13 = local233;
				}
			}
		}
		if (local9 < Static30.anInt5669 || Static30.anInt5671 < local7 || Static30.anInt5673 > local13 || local11 > Static30.anInt5666) {
			return true;
		}
		Static30.method5078(arg0, arg2, arg1);
		if (local102 != null) {
			if (Static320.anInt5101 > 0 && (Static475.anInt7189 != -1 && arg2.anInt3140 == Static475.anInt7189 || Static409.anInt6338 != -1 && arg1.anInt2606 == Static409.anInt6338)) {
				if (Static212.anInt3477 > 50) {
					local312 = 200 - Static212.anInt3477 * 2;
				} else {
					local312 = Static212.anInt3477 * 2;
				}
				@Pc(495) int local495 = local312 << 24 | 0xFFFF00;
				arg0.method7973(arg2.anInt3131, local495, arg2.anInt3139, local102.method8206() / 2 + 7);
				arg0.method7973(arg2.anInt3131, local495, arg2.anInt3139, local102.method8206() / 2 + 5);
				arg0.method7973(arg2.anInt3131, local495, arg2.anInt3139, local102.method8206() / 2 + 3);
				arg0.method7973(arg2.anInt3131, local495, arg2.anInt3139, local102.method8206() / 2 + 1);
				arg0.method7973(arg2.anInt3131, local495, arg2.anInt3139, local102.method8206() / 2);
			}
			local102.method8209(arg2.anInt3139 - (local102.method8210() >> 1), arg2.anInt3131 - (local102.method8199() >> 1));
		}
		if (arg1.aString25 != null && local209 != null) {
			Static720.method9403(local211, arg2, local213, arg1, local209, local217, arg0, local215);
		}
		if (arg1.anInt2605 != -1 || arg1.aString25 != null) {
			@Pc(612) Class2_Sub37 local612 = new Class2_Sub37(arg2);
			local612.anInt6205 = local229;
			local612.anInt6206 = local108;
			local612.anInt6212 = local227;
			local612.anInt6210 = local106;
			local612.anInt6211 = local110;
			local612.anInt6204 = local231;
			local612.anInt6207 = local233;
			local612.anInt6215 = local104;
			Static551.aClass341_54.method7718(local612);
		}
		return false;
	}
}
