import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!iba;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!ok;")
	public static Class280 method1487(@OriginalArg(1) int arg0) {
		@Pc(10) Class280 local10 = (Class280) Static713.aClass82_231.method2156(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static309.aClass332_62.method7602(arg0, 1);
		local10 = new Class280();
		local10.anInt7001 = arg0;
		if (local21 != null) {
			local10.method6281(new Class2_Sub21(local21));
		}
		local10.method6280();
		if (local10.anInt7003 == 2 && Static503.aClass28_38.method738(arg0) == null) {
			Static503.aClass28_38.method735(arg0, new Class2_Sub38(Static370.anInt5901));
			Static367.aClass280Array1[Static370.anInt5901++] = local10;
		}
		Static713.aClass82_231.method2150(local10, arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public static void method1488() {
		if (Static135.anInt8246 == 10) {
			Static135.anInt8246 = 11;
		}
	}
}
