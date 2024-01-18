import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!un", name = "K", descriptor = "[Lclient!gca;")
	public static Class140[] aClass140Array1;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public static int anInt9789 = -1;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	public static int anInt9792 = 0;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "Lclient!ul;")
	public static final Class379 aClass379_7 = new Class379("game4", "Game 4", 3);

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public static int anInt9793 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!vq;ILjava/awt/Frame;)V")
	public static void method8569(@OriginalArg(0) signlink arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) PrivilegedRequest local10 = arg0.method8996(arg1);
			while (local10.status == 0) {
				ThreadUtils.sleep(10L);
			}
			if (local10.status == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			ThreadUtils.sleep(100L);
		}
	}
}
