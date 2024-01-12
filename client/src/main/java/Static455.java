import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static455 {

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
	public static int anInt6936 = 1;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
	public static int anInt6938 = 0;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(BII)V")
	public static void method6230(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static536.anInt8172 == 1) {
			Static55.method1217(arg1, Static75.aClass2_Sub2_Sub16_9, arg0);
		} else if (Static536.anInt8172 == 2) {
			if (Static137.aBoolean210) {
				Static572.method7883(Static422.method5778() + arg1, arg0 - -Static130.method2283());
			} else {
				Static572.method7883(arg1, arg0);
			}
		}
		Static75.aClass2_Sub2_Sub16_9 = null;
		Static536.anInt8172 = 0;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public static void method6231() {
		if (!Static647.method8475()) {
			return;
		}
		if (Static393.aStringArray32 == null) {
			Static279.method4072();
		}
		Static566.anInt8496 = 0;
		Static236.aBoolean305 = true;
	}
}
