import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gd", name = "H", descriptor = "Lclient!sb;")
	public static Class332 aClass332_42;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "(I)V")
	public static void method2977() {
		GameShell.timer.method5604();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static475.aLongArray16[local8] = 0L;
		}
		for (@Pc(19) int local19 = 0; local19 < 32; local19++) {
			GameShell.otim[local19] = 0L;
		}
		Static32.logicCycles = 0;
	}
}
