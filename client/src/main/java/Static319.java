import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!kba", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!kba", name = "R", descriptor = "I")
	public static int anInt5097;

	@OriginalMember(owner = "client!kba", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString51 = "";

	@OriginalMember(owner = "client!kba", name = "N", descriptor = "[I")
	public static final int[] anIntArray384 = new int[6];

	@OriginalMember(owner = "client!kba", name = "J", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!kba", name = "K", descriptor = "I")
	public static int anInt5095 = 0;

	@OriginalMember(owner = "client!kba", name = "H", descriptor = "[I")
	public static final int[] anIntArray385 = new int[13];

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBI)Z")
	public static boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static483.method6495(arg1, arg0) & Static340.method5019(arg1, arg0);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZIBIII)V")
	public static void method4602(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static363.anInt6955 = arg3;
		Static694.anInt10439 = arg2;
		Static674.anInt10115 = arg5;
		Static709.anInt10695 = arg4;
		Static121.anInt2342 = arg0;
		if (arg1 && Static674.anInt10115 >= 100) {
			Static170.anInt2873 = Static121.anInt2342 * 512 + 256;
			Static110.anInt2195 = Static709.anInt10695 * 512 + 256;
			Static359.anInt5821 = Static102.method2025(Static394.anInt6196, -29754, Static110.anInt2195, Static170.anInt2873) - Static363.anInt6955;
		}
		Static511.anInt7668 = 2;
		Static693.anInt10411 = -1;
		Static692.anInt10404 = -1;
	}
}
