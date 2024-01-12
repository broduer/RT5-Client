import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IBII)V")
	public static void method2243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class369 local9 = Static665.aClass369ArrayArray1[arg1][arg2];
		Static153.method2461(arg0, local9 == null ? Static556.aClass369_2 : local9);
	}
}
