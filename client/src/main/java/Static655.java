import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "[Lclient!gca;")
	public static Class140[] aClass140Array1;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_237 = new Class227(18, 4);

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public static int anInt9789 = -1;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	public static int anInt9792 = 0;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Lclient!ul;")
	public static final Class379 aClass379_7 = new Class379("game4", "Game 4", 3);

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public static int anInt9793 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!vq;ILjava/awt/Frame;)V")
	public static void method8569(@OriginalArg(0) Class392 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class272 local10 = arg0.method8996(arg1);
			while (local10.anInt6810 == 0) {
				Static638.method8402(10L);
			}
			if (local10.anInt6810 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static638.method8402(100L);
		}
	}
}
