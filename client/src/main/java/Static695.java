import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static695 {

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "[I")
	public static int[] anIntArray868;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6679(@OriginalArg(0) String arg0) {
		Static44.method607(arg0, "", 0, "", "", 0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V")
	public static void method6680() {
		Static470.anInt7113 = -1;
		Static299.anInt4825 = 1;
		Static524.aClass153_3 = Static405.aClass153_1;
		Static238.method2504(Static319.aString51.equals(""), Static319.aString51, true, "");
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IZ)V")
	public static void method6681(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub5 local10 = (Class2_Sub5) Static106.aClass28_11.method373((long) arg0);
		if (local10 != null) {
			local10.aBoolean16 = !local10.aBoolean16;
			local10.aClass222_Sub1_1.method6603(local10.aBoolean16);
		}
	}
}
