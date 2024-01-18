import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	public static int anInt2643;

	@OriginalMember(owner = "client!en", name = "d", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "I")
	public static int anInt2640 = 0;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public static int anInt2641 = 0;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "Ljava/lang/String;")
	public static String settings = null;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	public static void method2455() {
		Static173.method2690();
		AudioChannel.init(Static400.aClass2_Sub34_28.aClass57_Sub17_1.method5674() == 1, 22050, 2);
		Static719.musicChannel = AudioChannel.create(GameShell.sign, 0, 22050, GameShell.canvas);
		Static697.method9127(Static48.method1100(null));
		Static559.aClass56_3 = AudioChannel.create(GameShell.sign, 1, 2048, GameShell.canvas);
		Static559.aClass56_3.setStream(Static336.aClass2_Sub6_Sub3_1);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BLclient!ge;)Lclient!hba;")
	public static Class154_Sub1 method2456(@OriginalArg(1) Buffer arg0) {
		return new Class154_Sub1(arg0.method7363(), arg0.method7363(), arg0.method7363(), arg0.method7363(), arg0.g3(), arg0.g3(), arg0.g1());
	}
}
