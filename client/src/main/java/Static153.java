import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "[I")
	public static final int[] anIntArray234 = new int[13];

	@OriginalMember(owner = "client!eq", name = "w", descriptor = "Lclient!dla;")
	public static final SoftLruHashTable aClass82_56 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "[I")
	public static int[] anIntArray235 = new int[2];

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString27 = null;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!uc;I)V")
	public static void method2461(@OriginalArg(0) int arg0, @OriginalArg(1) Class369 arg1) {
		if (Static584.aBoolean659) {
			arg0 = 0;
			Static584.aBoolean659 = false;
		}
		if (Static346.aClass369_1 != null && Static346.aClass369_1.method8395(arg1)) {
			return;
		}
		Static346.aClass369_1 = arg1;
		Static344.aLong169 = Static588.currentTimeMillis();
		Static173.anInt2922 = arg0;
		Static587.anInt8697 = arg0;
		if (Static587.anInt8697 == 0) {
			Static506.method8320();
			return;
		}
		Static74.aClass148_1 = Static456.aClass148_3;
		Static600.aFloat179 = Static151.aFloat218;
		Static671.aFloat214 = Static683.aFloat215;
		Static386.anInt6082 = Static448.anInt6822;
		Static203.aFloat69 = Static57.aFloat29;
		Static74.aClass67_3 = Static425.aClass67_6;
		Static538.aFloat174 = Static133.aFloat63;
		Static360.anInt5840 = Static251.anInt4048;
		Static659.aFloat213 = Static688.aFloat216;
		Static620.aFloat197 = Static318.aFloat210;
		Static679.anInt10301 = Static171.anInt2891;
		if (Static456.aClass148_3 == null) {
			return;
		}
		if (Static456.aClass148_3.method3165()) {
			Static74.aClass148_1 = Static456.aClass148_3.method3167();
			Static456.aClass148_3 = Static74.aClass148_1;
		}
		if (Static456.aClass148_3 != null && Static346.aClass369_1.aClass148_5 != Static456.aClass148_3) {
			Static456.aClass148_3.method3163(Static346.aClass369_1.aClass148_5);
		}
	}
}
