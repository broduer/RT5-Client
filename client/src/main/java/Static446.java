import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!oaa", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!tka;")
	public static final Class357 liveMode = new Class357("LIVE", "", "", 0);

	@OriginalMember(owner = "client!oaa", name = "n", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_170 = new Class227(87, -2);

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(BI)Lclient!it;")
	public static Class184 method6098(@OriginalArg(1) int arg0) {
		@Pc(6) Class184[] local6 = Static546.method7256();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (local6[local8].anInt4589 == arg0) {
				return local6[local8];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIZIIII)V")
	public static void method6101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg5 + arg6;
		@Pc(19) int local19 = arg0 - arg5;
		for (@Pc(21) int local21 = arg6; local21 < local9; local21++) {
			Static696.method9044(arg1, arg2, arg4, Static723.anIntArrayArray266[local21]);
		}
		@Pc(45) int local45 = arg4 + arg5;
		@Pc(50) int local50 = arg1 - arg5;
		for (@Pc(52) int local52 = arg0; local52 > local19; local52--) {
			Static696.method9044(arg1, arg2, arg4, Static723.anIntArrayArray266[local52]);
		}
		for (@Pc(72) int local72 = local9; local72 <= local19; local72++) {
			@Pc(80) int[] local80 = Static723.anIntArrayArray266[local72];
			Static696.method9044(local45, arg2, arg4, local80);
			Static696.method9044(local50, arg3, local45, local80);
			Static696.method9044(arg1, arg2, local50, local80);
		}
	}
}
