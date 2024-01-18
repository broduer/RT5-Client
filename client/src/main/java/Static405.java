import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static405 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	public static int anInt6275;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!gw;")
	public static final Class153 aClass153_1 = new Class153();

	@OriginalMember(owner = "client!mn", name = "q", descriptor = "Lclient!gw;")
	public static final Class153 aClass153_2 = new Class153();

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "[Lclient!gw;")
	public static final Class153[] aClass153Array1 = new Class153[] { aClass153_2, aClass153_1 };

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_73 = new ClientProt(55, 7);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!d;Lclient!sb;Z)V")
	public static void method5599(@OriginalArg(0) TextureProvider arg0, @OriginalArg(1) Js5 arg1) {
		Static708.anInterface4_12 = arg0;
		Static386.aClass332_80 = arg1;
	}
}
