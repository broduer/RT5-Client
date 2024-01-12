import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
	public static int anInt6479 = 0;

	@OriginalMember(owner = "client!nga", name = "b", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_79 = new Class347(14, 3);

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
	public static void method5786() {
		@Pc(1) Class82 local1 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			Static580.aClass82_186.method2151();
		}
		local1 = Static54.aClass82_25;
		synchronized (Static54.aClass82_25) {
			Static54.aClass82_25.method2151();
		}
	}
}
