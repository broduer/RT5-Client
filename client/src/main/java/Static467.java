import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "[I")
	public static int[] anIntArray568;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "Lclient!ef;")
	public static Class96 aClass96_3;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "Lclient!vn;")
	public static Class350 aClass350_2;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method6357(@OriginalArg(1) String arg0) {
		return Static702.method9174(arg0);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)Lclient!pba;")
	public static Class288 method6358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass288_2;
	}
}
