import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "J")
	public static long aLong205;

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_75 = new Class347(16, 0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	public static void method5705(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2_Sub2 local16 = Static440.method5970(11, (long) arg0);
		local16.method205();
	}
}
