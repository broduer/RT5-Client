import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
	public static int anInt6305;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
	public static int anInt6306;

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
	public static int anInt6308;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "[I")
	public static final int[] anIntArray489 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Z")
	public static boolean method5634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public static void method5635() {
		@Pc(16) Class2_Sub9 local16 = (Class2_Sub9) Static226.aClass341_58.method7706(65280);
		@Pc(30) boolean local30 = Static109.aClass158_3 != null || Static460.anInt6985 > 0;
		@Pc(34) int local34 = local16.method5338();
		@Pc(38) int local38 = local16.method5340();
		if (local30) {
			Static536.anInt8172 = 1;
		}
		if (local30) {
			Static75.aClass2_Sub2_Sub16_9 = Static470.aClass2_Sub2_Sub16_10;
		} else {
			Static55.method1217(local38, Static470.aClass2_Sub2_Sub16_10, local34);
		}
	}
}
