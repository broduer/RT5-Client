import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static593 {

	@OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
	public static int anInt8787 = 0;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "(I)I")
	public static int method7786() {
		return Static448.anInt6817 == 1 ? Static571.anInt8558 : Static252.anInt4089;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method7787(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static102.method2027(false, arg1, 10, arg0) : Integer.toString(arg1);
	}

}
