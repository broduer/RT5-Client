import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!o", name = "rb", descriptor = "I")
	public static int anInt6772;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_145 = new Class82(4);

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "Lclient!jg;")
	public static final Class193 aClass193_1 = new Class193();

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!sb;Lclient!sb;Lclient!sb;BLclient!sb;)V")
	public static void method5994(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(4) Class332 arg3) {
		Static262.aClass332_56 = arg2;
		Static666.aClass332_118 = arg0;
		Static607.aClass332_113 = arg3;
		Static453.aClass158ArrayArray2 = new Class158[Static666.aClass332_118.method7604()][];
		Static132.aBooleanArray5 = new boolean[Static666.aClass332_118.method7604()];
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	public static void method5995() {
		@Pc(13) Class2_Sub2_Sub2 local13 = Static440.method5970(15, 0L);
		local13.method205();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Lclient!vaa;")
	public static Class381 method6001(@OriginalArg(1) int arg0) {
		@Pc(10) Class381 local10 = (Class381) Static289.aClass82_100.method2156(arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static409.aClass332_85.method7602(arg0, 0);
		local10 = new Class381();
		if (local21 != null) {
			local10.method8663(new Packet(local21));
		}
		local10.method8661();
		Static289.aClass82_100.method2150(local10, arg0);
		return local10;
	}
}
