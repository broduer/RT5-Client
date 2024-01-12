import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "[I")
	public static int[] anIntArray288;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[Lclient!lw;")
	public static Class238[] aClass238Array1;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	public static int anInt3559 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILclient!dda;)Z")
	public static boolean method3190(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		Static107.aClass73_3.method7131(arg1.anIntArray185[arg0], arg1.anIntArray186[arg0], arg1.anIntArray188[arg0], Static35.anIntArray58);
		@Pc(22) int local22 = Static35.anIntArray58[2];
		if (local22 < 50) {
			return false;
		} else {
			arg1.aShortArray17[arg0] = (short) (Static1.anInt10826 * Static35.anIntArray58[0] / local22 + Static460.anInt6991);
			arg1.aShortArray18[arg0] = (short) (Static35.anIntArray58[1] * Static412.anInt6377 / local22 + Static407.anInt6306);
			arg1.aShortArray19[arg0] = (short) local22;
			return true;
		}
	}
}
