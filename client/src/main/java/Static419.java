import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Lclient!es;")
	public static Class112 aClass112_1;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[200];

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_77 = new Class347(42, 15);

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	public static int anInt6454 = 0;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "[S")
	public static short[] recolorPalette = new short[256];

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method5763(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method5764() {
		if (Static449.aClass366_1 != null) {
			Static449.aClass366_1.method8379();
		}
		if (Static242.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static242.aThread1.join();
				return;
			} catch (@Pc(26) InterruptedException local26) {
			}
		}
	}
}
