import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static682 {

	@OriginalMember(owner = "client!vka", name = "c", descriptor = "I")
	public static int anInt10323;

	@OriginalMember(owner = "client!vka", name = "h", descriptor = "B")
	public static byte aByte142;

	@OriginalMember(owner = "client!vka", name = "f", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_43 = new Class155(61);

	@OriginalMember(owner = "client!vka", name = "i", descriptor = "[I")
	public static int[] anIntArray817 = new int[2];

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "Lclient!tka;")
	public static final Class357 intbetaMode = new Class357("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8930(@OriginalArg(1) String arg0) {
		@Pc(17) String local17 = Static99.method1977(Static306.method4483(arg0, -120));
		if (local17 == null) {
			local17 = "";
		}
		return local17;
	}

	@OriginalMember(owner = "client!vka", name = "b", descriptor = "(II)V")
	public static void method8933(@OriginalArg(1) int arg0) {
		@Pc(17) SecondaryNode_Sub2 local17 = Static440.method5970(20, arg0);
		local17.method205();
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(IIIBI)V")
	public static void method8934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static448.anInt6817 != 1) {
			return;
		}
		@Pc(14) int local14 = arg2 / Static437.anInt6648;
		@Pc(18) int local18 = arg3 / Static437.anInt6648;
		@Pc(22) int local22 = arg0 / Static714.anInt10831;
		@Pc(26) int local26 = arg1 / Static714.anInt10831;
		if (local14 >= Static211.anInt5594 || local18 < 0 || local22 >= Static617.anInt9460 || local26 < 0) {
			return;
		}
		if (local14 < 0) {
			local14 = 0;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (Static617.anInt9460 <= local26) {
			local26 = Static617.anInt9460 - 1;
		}
		if (Static211.anInt5594 <= local18) {
			local18 = Static211.anInt5594 - 1;
		}
		for (@Pc(94) int local94 = local22; local94 <= local26; local94++) {
			@Pc(105) int local105 = Static719.method9125(local94 + Static482.anInt7286, Static617.anInt9460) * Static211.anInt5594;
			for (@Pc(107) int local107 = local14; local107 <= local18; local107++) {
				@Pc(117) int local117 = Static719.method9125(Static632.anInt9529 + local107, Static211.anInt5594) + local105;
				Static173.anIntArray252[local117] = Static420.anInt6456;
			}
		}
	}
}
