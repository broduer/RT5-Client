import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static518 {

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "Lclient!ge;")
	public static Buffer aClass2_Sub21_18;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "Z")
	public static boolean aBoolean815 = false;

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray262 = new int[6][];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!pg;B)Ljava/lang/String;")
	public static String method9300(@OriginalArg(0) SecondaryNode_Sub16 arg0) {
		if (arg0.aString88 == null || arg0.aString88.length() == 0) {
			return arg0.aString86 == null || arg0.aString86.length() <= 0 ? arg0.aString87 : arg0.aString87 + Static32.aClass32_32.getLocalization(client.lang) + arg0.aString86;
		} else if (arg0.aString86 == null || arg0.aString86.length() <= 0) {
			return arg0.aString87 + Static32.aClass32_32.getLocalization(client.lang) + arg0.aString88;
		} else {
			return arg0.aString87 + Static32.aClass32_32.getLocalization(client.lang) + arg0.aString86 + Static32.aClass32_32.getLocalization(client.lang) + arg0.aString88;
		}
	}
}
