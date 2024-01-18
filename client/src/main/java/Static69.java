import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(III)Z")
	public static boolean method4422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static335.method3461(arg1, arg0) & Static652.method6076(arg0, arg1);
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(III)Z")
	public static boolean method4424(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
