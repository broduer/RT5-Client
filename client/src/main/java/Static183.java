import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "[Lclient!lka;")
	public static Class233[] aClass233Array1;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public static int anInt3031;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	public static int anInt3033 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method2796(@OriginalArg(0) String arg0) {
		return Static137.nativeLibraries.containsKey(arg0);
	}
}
