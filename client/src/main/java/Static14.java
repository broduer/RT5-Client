import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static14 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ai", name = "G", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_5 = new Class225(64, 3);

	@OriginalMember(owner = "client!ai", name = "L", descriptor = "[I")
	public static int[] anIntArray25 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method117(@OriginalArg(1) String arg0) {
		return Static93.method1188(aClass1 == null ? (aClass1 = Class2_Sub1_Sub2.a("sca")) : aClass1, arg0);
	}
}
