import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
	public static int anInt2333;

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_49 = new Class225(5, 7);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V")
	public static void method1428(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub5 local17 = (Class2_Sub5) Static106.aClass28_11.method373((long) arg0);
		if (local17 != null) {
			local17.aClass222_Sub1_1.method6610();
			Static635.method5944(local17.anInt182, local17.aBoolean15);
			local17.a((byte) 83);
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIILclient!sb;)Lclient!dv;")
	public static Class88 method1430(@OriginalArg(0) int arg0, @OriginalArg(3) Class330 arg1) {
		@Pc(9) byte[] local9 = arg1.method5359(0, arg0);
		return local9 == null ? null : new Class88(local9);
	}
}
