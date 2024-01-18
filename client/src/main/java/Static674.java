import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static674 {

	@OriginalMember(owner = "client!vfa", name = "o", descriptor = "I")
	public static int anInt10115;

	@OriginalMember(owner = "client!vfa", name = "X", descriptor = "I")
	public static int anInt10156;

	@OriginalMember(owner = "client!vfa", name = "Gb", descriptor = "Lclient!rfa;")
	public static ClanChannel aClass2_Sub47_3;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(II)V")
	public static void method8796(@OriginalArg(0) int arg0) {
		if (Static283.anInt4588 == 7 && (Static135.anInt8246 == 0 && Static6.anInt95 == 0)) {
			Static470.anInt7134 = arg0;
			Static81.method1586(9);
		}
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
	public static void method8813() {
		AudioChannel.init(Static400.aClass2_Sub34_28.aClass57_Sub17_1.method5674() == 1, 22050, 2);
		Static719.musicChannel = AudioChannel.create(GameShell.sign, 0, 22050, GameShell.canvas);
		Static697.method9127(Static48.method1100(null));
		Static559.aClass56_3 = AudioChannel.create(GameShell.sign, 1, 2048, GameShell.canvas);
		Static336.aClass2_Sub6_Sub3_1 = new MixerPcmStream();
		Static559.aClass56_3.setStream(Static336.aClass2_Sub6_Sub3_1);
		Static681.aClass226_2 = new Class226(22050, AudioChannel.globalSampleRate);
		Static550.method7273();
	}
}
