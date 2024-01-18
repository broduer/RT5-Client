import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static697 {

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lclient!sb;")
	public static Js5 aClass332_123;

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "I")
	public static final int anInt10535 = 1405;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZILclient!bd;)V")
	public static void method9127(@OriginalArg(2) MidiPcmStream arg0) {
		Static719.musicChannel.setStream(arg0);
		Static220.method3201(Static719.musicChannel, client.js5Archive14, client.js5Archive4, client.js5Archive15, arg0);
	}
}
