import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public static int anInt2342;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_49 = new Class227(5, 7);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method2199(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub5 local17 = (Class2_Sub5) Static106.aClass28_11.method738(arg0);
		if (local17 != null) {
			local17.aClass224_Sub1_1.method9188();
			Static635.method8387(local17.anInt182, local17.aBoolean15);
			local17.method9464();
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILclient!sb;)Lclient!dv;")
	public static Class88 method2201(@OriginalArg(0) int arg0, @OriginalArg(3) Class332 arg1) {
		@Pc(9) byte[] local9 = arg1.method7602(0, arg0);
		return local9 == null ? null : new Class88(local9);
	}
}
