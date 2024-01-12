import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!dka", name = "d", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!dka", name = "b", descriptor = "I")
	public static int anInt2267 = -1;

	@OriginalMember(owner = "client!dka", name = "e", descriptor = "I")
	public static int anInt2268 = -1;

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(II)V")
	public static void method2136(@OriginalArg(1) int arg0) {
		if (Static400.aClass2_Sub34_28.aClass57_Sub14_1.method5309() == 0) {
			arg0 = -1;
		}
		if (arg0 == Static470.anInt7133) {
			return;
		}
		if (arg0 != -1) {
			@Pc(28) Class391 local28 = Static354.aClass269_1.method5980(arg0);
			@Pc(32) Class409 local32 = local28.method8941();
			if (local32 == null) {
				arg0 = -1;
			} else {
				Static446.aClass392_6.method9002(local32.method9391(), local32.method9390(), Static434.aCanvas7, new Point(local28.anInt10331, local28.anInt10336), local32.method9385());
				Static470.anInt7133 = arg0;
			}
		}
		if (arg0 == -1 && Static470.anInt7133 != -1) {
			Static446.aClass392_6.method9002(-1, (int[]) null, Static434.aCanvas7, new Point(), -1);
			Static470.anInt7133 = -1;
		}
	}
}
