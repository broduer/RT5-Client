import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	public static int anInt7236 = 0;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_178 = new Class227(17, 0);

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!pc;")
	public static final Class289 aClass289_15 = new Class289(1, 8);

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	public static int anInt7243 = 0;

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void method6482() {
		if (Static222.anIntArray289 != null && Static24.anIntArray33 != null) {
			return;
		}
		Static24.anIntArray33 = new int[256];
		Static222.anIntArray289 = new int[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(31) double local31 = (double) local22 / 255.0D * 6.283185307179586D;
			Static222.anIntArray289[local22] = (int) (Math.sin(local31) * 4096.0D);
			Static24.anIntArray33[local22] = (int) (Math.cos(local31) * 4096.0D);
		}
	}
}