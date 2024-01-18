import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!saa", name = "e", descriptor = "Lclient!qp;")
	public static Class312 aClass312_2;

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "[I")
	public static final int[] anIntArray683 = new int[3];

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
	public static void method7579() {
		if (Static163.aClass19_17.method7985()) {
			Static163.aClass19_17.method7979(GameShell.canvas);
			Static208.method3106();
			if (Static137.aBoolean210) {
				Static720.method9404(GameShell.canvas);
			} else {
				@Pc(26) Dimension local26 = GameShell.canvas.getSize();
				Static163.aClass19_17.method8029(GameShell.canvas, local26.width, local26.height);
			}
			Static163.aClass19_17.method8026(GameShell.canvas);
		} else {
			Static32.method880(Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922(), false);
		}
		Static469.method6369();
		Static75.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
	public static boolean method7580() {
		Static334.anInt5475++;
		Static252.aBoolean316 = true;
		return true;
	}
}
