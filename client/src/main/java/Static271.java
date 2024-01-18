import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!sb;")
	public static Class330 aClass330_59;

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
	public static int anInt4363;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)J")
	public static long method2746() {
		return Static600.aClass27_1.method3984();
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
	public static void method2747() {
		@Pc(10) Class2_Sub25 local10;
		for (local10 = (Class2_Sub25) Static159.aClass339_15.method5453(65280); local10 != null; local10 = (Class2_Sub25) Static159.aClass339_15.method5460()) {
			Static544.method5055(local10, false);
		}
		for (local10 = (Class2_Sub25) Static227.aClass339_18.method5453(65280); local10 != null; local10 = (Class2_Sub25) Static227.aClass339_18.method5460()) {
			Static544.method5055(local10, true);
		}
	}
}
