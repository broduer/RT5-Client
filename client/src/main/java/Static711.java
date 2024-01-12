import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static711 {

	@OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
	public static int anInt10712;

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(IBI)V")
	public static void method9278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static577.method7622(arg1, arg0);
	}

	@OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V")
	public static void method9279() {
		if (Static236.aClass272_2 == null) {
			return;
		}
		if (Static236.aClass272_2.anInt6810 == 1) {
			Static236.aClass272_2 = null;
			return;
		}
		if (Static236.aClass272_2.anInt6810 == 2) {
			Static637.method8389(Static340.aString53, 2, Static272.aClass392_3);
			Static236.aClass272_2 = null;
			return;
		}
	}
}
