import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!hda;B)Ljava/lang/String;")
	public static String method5366(@OriginalArg(0) Class158 arg0) {
		if (Static84.method1661(arg0).getTargetMask() == 0) {
			return null;
		} else if (arg0.aString43 == null || arg0.aString43.trim().length() == 0) {
			return Static103.aBoolean195 ? "Hidden-use" : null;
		} else {
			return arg0.aString43;
		}
	}
}
