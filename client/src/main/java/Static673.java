import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "B")
	public static byte aByte140;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "Lclient!ul;")
	public static final Class379 aClass379_8 = new Class379("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	public static int anInt10106 = -1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!vq;Z)[Lclient!oga;")
	public static Class275[] method8794(@OriginalArg(0) Class392 arg0, @OriginalArg(1) boolean arg1) {
		if (!arg0.method8997()) {
			return new Class275[0];
		}
		@Pc(15) Class272 local15 = arg0.method8991();
		while (local15.anInt6810 == 0) {
			Static638.method8402(10L);
		}
		if (local15.anInt6810 == 2) {
			return new Class275[0];
		}
		@Pc(38) int[] local38 = (int[]) local15.anObject13;
		@Pc(44) Class275[] local44 = new Class275[local38.length >> 2];
		for (@Pc(46) int local46 = 0; local46 < local44.length; local46++) {
			@Pc(51) Class275 local51 = new Class275();
			local44[local46] = local51;
			local51.anInt6939 = local38[local46 << 2];
			local51.anInt6933 = local38[(local46 << 2) + 1];
			local51.anInt6934 = local38[(local46 << 2) + 2];
			local51.anInt6932 = local38[(local46 << 2) + 3];
		}
		return arg1 ? local44 : null;
	}
}
