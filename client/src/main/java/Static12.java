import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!st;")
	public static Class23 aClass23_26;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!st;")
	public static Class23 aClass23_27;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	public static int anInt5761;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Lclient!fca;")
	public static Class123 aClass123_4;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_24 = new Class155(13);

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;IZ)I")
	public static int method5169(@OriginalArg(0) String arg0) {
		return Static269.method3908(arg0, 16);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ge;I)V")
	public static void method5171(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(20) int local20 = arg0.g1();
			if (local20 == 0) {
				Static482.anInt7249 = arg0.g2();
				Static134.anInt10358 = arg0.g2();
			} else if (local20 == 255) {
				return;
			}
		}
	}
}
