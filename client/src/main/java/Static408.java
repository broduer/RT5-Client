import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
	public static void method5639() {
		client.instance.method1634();
		Static524.aClass153_3.method3272();
		Static524.aClass153_3.anInt3656 = 0;
		Static249.anInt4019 = 0;
		Static524.aClass153_3.lastPacketType3 = null;
		Static524.aClass153_3.lastPacketType2 = null;
		Static524.aClass153_3.lastPacketType = null;
		Static524.aClass153_3.aClass2_Sub21_Sub2_2.pos = 0;
		Static102.method2022();
		Static251.anInt4047 = 0;
		Static723.aString129 = null;
		Static327.anInt5411 = 0;
		Static91.aClass164_9 = null;
		Static128.aClass164_8 = null;
		Static706.anInt10661 = 0;
		Static87.aClass243Array1 = null;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLclient!el;)Z")
	public static boolean method5641(@OriginalArg(1) MelType arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean214) {
			return false;
		} else if (!arg0.method2425(Static30.anInterface23_3)) {
			return false;
		} else if (Static268.aClass28_22.get(arg0.anInt2599) == null) {
			return Static232.aClass28_18.get(arg0.anInt2606) == null;
		} else {
			return false;
		}
	}
}
