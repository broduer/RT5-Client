import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
	public static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
	public static int anInt9487 = -1;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Lclient!hh;")
	public static Class162 method8336(@OriginalArg(1) int arg0) {
		@Pc(15) Class162[] local15 = Static660.method8626();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class162 local23 = local15[local17];
			if (local23.anInt3933 == arg0) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIIIB)V")
	public static void method8337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static180.anInt3004 <= arg1 && Static111.anInt2228 >= arg0 && arg4 >= Static724.anInt10959 && Static273.anInt4408 >= arg3) {
			Static561.method7444(arg4, arg2, arg1, arg3, arg0);
		} else {
			Static230.method3370(arg1, arg0, arg2, arg4, arg3);
		}
	}

}
