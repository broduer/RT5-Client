import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static703 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public static int anInt10599 = 0;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Z")
	public static final boolean aBoolean799 = true;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!sb;)V")
	public static void method9176(@OriginalArg(1) Class332 arg0) {
		Static409.aClass332_85 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!aea;I)V")
	public static void method9178(@OriginalArg(0) Class8_Sub1 arg0) {
		arg0.aClass8_Sub2_Sub1_Sub2_1 = null;
		if (Static6.anInt94 < 20) {
			Static129.aClass130_3.method2787(arg0);
			Static6.anInt94++;
		}
	}
}