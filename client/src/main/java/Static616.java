import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static616 {

	@OriginalMember(owner = "client!tia", name = "R", descriptor = "I")
	public static int anInt9443 = 0;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
	public static void method8290(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static470.anInt7134 = -1;
		if (true) {
			// 2011scape compatibility
			Static524.aClass153_3 = Static405.aClass153_2;
			Static299.anInt4841 = 2;
		} else {
			 Static524.aClass153_3 = Static405.aClass153_1;
			 Static299.anInt4841 = 1;
		}
		Static238.method3471(false, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLclient!sb;)V")
	public static void method8291(@OriginalArg(1) Js5 arg0) {
		Static662.anInt9871 = arg0.getGroupId("p11_full");
		Static539.anInt8196 = arg0.getGroupId("p12_full");
		Static634.anInt9545 = arg0.getGroupId("b12_full");
	}
}
