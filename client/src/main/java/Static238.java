import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[I")
	public static final int[] anIntArray306 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[S")
	public static short[] aShortArray62 = new short[256];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	public static final int[] anIntArray307 = new int[4];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILclient!sb;)Lclient!ve;")
	public static Class383 method3468(@OriginalArg(1) int arg0, @OriginalArg(2) Class332 arg1) {
		@Pc(8) byte[] local8 = arg1.method7596(arg0);
		return local8 == null ? null : new Class383(local8);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLjava/lang/String;ZZLjava/lang/String;)V")
	public static void method3471(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg2) {
			Static129.anInt2418 = -1;
		}
		Static59.aString63 = arg3;
		Static449.aString75 = arg1;
		Static311.aBoolean384 = arg0;
		Static561.aBoolean641 = arg2;
		if (!Static561.aBoolean641 && (Static449.aString75.equals("") || Static59.aString63.equals(""))) {
			Static342.method4471(3);
			return;
		}
		Static524.aClass153_3.aBoolean278 = false;
		if (Static299.anInt4841 != 1) {
			Static118.anInt2301 = 0;
			Static329.anInt1756 = -1;
			Static356.anInt5800 = -1;
		}
		Static342.method4471(-3);
		Static135.anInt8246 = 1;
		Static330.anInt5453 = 0;
		Static76.anInt1608 = 0;
	}
}
