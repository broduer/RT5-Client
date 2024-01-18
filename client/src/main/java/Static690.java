import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static690 {

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "J")
	public static long aLong318;

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "Lclient!mj;")
	public static Class245 aClass245_5;

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Lclient!dfa;")
	public static final Class77 aClass77_7 = new Class77();

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
	public static void method9003(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static507.anInt7641 = arg0;
		Static81.aClass8_Sub5Array1 = new Class8_Sub5[Static190.anIntArray265[Static507.anInt7641] + 1];
		Static295.anInt4797 = 0;
		Static349.anInt5713 = 0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method9005() {
		return Static400.aBoolean623 || Static470.aClass2_Sub2_Sub16_10 == null ? "" : Static470.aClass2_Sub2_Sub16_10.aString87;
	}
}
