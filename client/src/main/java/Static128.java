import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!hi;")
	public static Class164 aClass164_8;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_106 = new Class345(6, 8);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = null;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5498(@OriginalArg(1) String arg0) {
		if (Static87.aClass241Array1 == null) {
			return;
		}
		@Pc(21) Class153 local21 = Static668.method6208();
		@Pc(27) Class2_Sub19 local27 = Static293.method3000(Static436.aClass345_45, local21.aClass186_1);
		local27.aClass2_Sub21_Sub2_1.method5198(Static231.method2417(arg0));
		local27.aClass2_Sub21_Sub2_1.method5200(arg0);
		local21.method2339(local27);
	}
}
