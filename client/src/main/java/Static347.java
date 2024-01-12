import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_146 = new Class227(47, 4);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)V")
	public static void method5101(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static132.aBooleanArray5[arg0]) {
			Static666.aClass332_118.method7612(arg0);
			Static453.aClass158ArrayArray2[arg0] = null;
			Static148.aClass158ArrayArray1[arg0] = null;
			Static132.aBooleanArray5[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Lclient!pha;")
	public static Class293 method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static334.aClass293ArrayArrayArray1[0][arg1][arg2] != null && Static334.aClass293ArrayArrayArray1[0][arg1][arg2].aClass293_1 != null;
			if (local33 && arg0 >= Static299.anInt4840 - 1) {
				return null;
			}
			Static527.method7091(arg0, arg1, arg2);
		}
		return Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
	}
}
