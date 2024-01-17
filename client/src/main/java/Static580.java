import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!sea", name = "x", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!sea", name = "y", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_186 = new Class82(260);

	@OriginalMember(owner = "client!sea", name = "z", descriptor = "I")
	public static int anInt8645 = -2;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)I")
	public static int method7656(@OriginalArg(1) boolean arg0) {
		@Pc(13) int local13 = Static448.anInt6817;
		if (local13 == 0) {
			return arg0 ? 0 : Static312.anInt5018;
		} else if (local13 == 1) {
			return Static312.anInt5018;
		} else if (local13 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V")
	public static void method7658(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5970(10, arg0);
		local9.method205();
	}
}
