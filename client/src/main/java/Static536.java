import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
	public static int anInt8171 = 0;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	public static int anInt8172 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZBI)I")
	public static int method7176(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Node_Sub22 local8 = Static556.method7310(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && local8.anIntArray279.length > arg0) {
			return local8.anIntArray279[arg0];
		} else {
			return 0;
		}
	}
}
