import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!hi;")
	public static Class164 aClass164_8;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_106 = new Class347(6, 8);

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString108 = null;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7761(@OriginalArg(1) String arg0) {
		if (Static87.aClass243Array1 == null) {
			return;
		}
		@Pc(21) Class153 local21 = Static668.method8708();
		@Pc(27) Class2_Sub19 local27 = Static293.method4342(Static436.aClass347_45, local21.aClass186_1);
		local27.aClass2_Sub21_Sub2_1.method7396(Static231.method3379(arg0));
		local27.aClass2_Sub21_Sub2_1.method7398(arg0);
		local21.method3275(local27);
	}
}
