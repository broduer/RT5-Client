import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt8431;

	@OriginalMember(owner = "client!ge", name = "Ab", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_206 = new Class227(136, 6);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ie;Lclient!ie;)V")
	public static void method7375(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_345 != null) {
			arg1.method9464();
		}
		arg1.aClass2_346 = arg0;
		arg1.aClass2_345 = arg0.aClass2_345;
		arg1.aClass2_345.aClass2_346 = arg1;
		arg1.aClass2_346.aClass2_345 = arg1;
	}
}
