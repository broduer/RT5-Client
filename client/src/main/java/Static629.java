import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static629 {

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Lclient!da;")
	public static Class14 aClass14_11;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BLjava/io/File;)[B")
	public static byte[] method8355(@OriginalArg(1) File arg0) {
		return Static600.method7871(arg0, (int) arg0.length());
	}
}
