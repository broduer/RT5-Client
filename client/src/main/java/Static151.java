import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static151 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "F")
	public static float aFloat218;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!lha;")
	public static Class228 aClass228_20 = new Class228();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	public static void method9298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static470.method6394()) {
			return;
		}
		Static470.anInt7134 = arg1;
		if (Static129.anInt2418 != arg0) {
			Static319.aString51 = "";
		}
		Static129.anInt2418 = arg0;
		Static81.method1586(6);
	}
}
