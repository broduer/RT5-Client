import org.openrs2.deob.annotation.OriginalMember;

public final class Static229 {

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_101 = new Class227(79, -2);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method3368() {
		if (Static473.aClass140_22 != null) {
			Static449.aClass366_1 = new Class366();
			Static449.aClass366_1.method8381(Static473.aClass140_22.anInt3280, Static473.aClass140_22.aClass32_64.method877(client.lang), Static473.aClass140_22, Static72.aLong52);
			Static242.aThread1 = new Thread(Static449.aClass366_1, "");
			Static242.aThread1.start();
		}
	}
}
