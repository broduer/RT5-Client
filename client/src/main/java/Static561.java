import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!rla", name = "e", descriptor = "Lclient!ld;")
	public static Class222 aClass222_2;

	@OriginalMember(owner = "client!rla", name = "f", descriptor = "Lclient!st;")
	public static Class23 aClass23_34;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rla", name = "o", descriptor = "Ljava/lang/Class;")
	private static Class aClass20;

	@OriginalMember(owner = "client!rla", name = "c", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(IIII)Z")
	public static boolean method7441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface25 local11 = (Interface25) Static302.method4421(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static449.method6125(local11) & true;
		}
		local11 = (Interface25) Static578.method7630(arg2, arg0, arg1, aClass20 == null ? (aClass20 = Class326.a("uv")) : aClass20);
		if (local11 != null) {
			local5 &= Static449.method6125(local11);
		}
		local11 = (Interface25) Static687.method8966(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static449.method6125(local11);
		}
		return local5;
	}

	@OriginalMember(owner = "client!rla", name = "b", descriptor = "(I)V")
	public static void method7443() {
		Static289.aClass82_100.method2157();
	}

	@OriginalMember(owner = "client!rla", name = "a", descriptor = "(IIIIII)V")
	public static void method7444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(15) int local15 = arg0; local15 <= arg3; local15++) {
			Static696.method9044(arg4, arg1, arg2, Static723.anIntArrayArray266[local15]);
		}
	}
}