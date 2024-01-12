import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!pla", name = "E", descriptor = "Z")
	public static boolean aBoolean564;

	@OriginalMember(owner = "client!pla", name = "i", descriptor = "Lclient!av;")
	public static Class28 aClass28_35 = new Class28(64);

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method6630(@OriginalArg(1) Class19 arg0) {
		for (@Pc(6) Class8_Sub5 local6 = (Class8_Sub5) Static342.aClass130_7.method2790(); local6 != null; local6 = (Class8_Sub5) Static342.aClass130_7.method2785()) {
			if (local6.aBoolean325) {
				local6.method3646(arg0);
			}
		}
		if (false) {
			aClass28_35 = null;
		}
	}

	@OriginalMember(owner = "client!pla", name = "a", descriptor = "(ILclient!wj;)I")
	public static int method6636(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub2 arg0) {
		@Pc(6) Class270 local6 = arg0.aClass270_1;
		if (local6.anIntArray532 != null) {
			local6 = local6.method5992(65535, Static34.aClass306_1);
			if (local6 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local6.anInt6731;
		@Pc(32) Class291 local32 = arg0.method9324();
		@Pc(37) int local37 = arg0.aClass152_10.method9121();
		if (local37 == -1 || arg0.aBoolean818) {
			local22 = local6.anInt6734;
		} else if (local32.anInt7247 == local37 || local32.anInt7262 == local37 || local32.anInt7281 == local37 || local37 == local32.anInt7261) {
			local22 = local6.anInt6732;
		} else if (local32.anInt7256 == local37 || local37 == local32.anInt7283 || local32.anInt7289 == local37 || local32.anInt7260 == local37) {
			local22 = local6.anInt6744;
		}
		return local22;
	}
}
