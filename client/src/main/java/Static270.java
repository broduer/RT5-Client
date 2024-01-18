import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!iia", name = "q", descriptor = "I")
	public static int anInt4367;

	@OriginalMember(owner = "client!iia", name = "n", descriptor = "I")
	public static int anInt4368;

	@OriginalMember(owner = "client!iia", name = "m", descriptor = "Lclient!fca;")
	public static Class123 aClass123_2 = null;

	@OriginalMember(owner = "client!iia", name = "o", descriptor = "Lclient!od;")
	public static final Class274 aClass274_1 = new Class274();

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(ZI)V")
	public static void method3920(@OriginalArg(0) boolean arg0) {
		if (Static110.aString19.length() == 0) {
			return;
		}
		Static79.method1579("--> " + Static110.aString19);
		Cheat.execute(false, arg0, Static110.aString19);
		Static625.anInt9498 = 0;
		if (!arg0) {
			Static594.anInt8800 = 0;
			Static110.aString19 = "";
		}
	}
}
