import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Z")
	public static boolean aBoolean625 = false;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!hma;ZI)V")
	public static void method7221(@OriginalArg(0) Class2_Sub25 arg0, @OriginalArg(1) boolean arg1) {
		if (arg0.aBoolean309) {
			if (arg0.anInt4013 < 0 || Static235.method3424(arg0.anInt4013, arg0.anInt4020)) {
				if (arg1) {
					Static706.method9227(arg0.anInt4022, null, arg0.anInt4017, arg0.anInt4021, arg0.anInt4027);
				} else {
					Static235.method3421(arg0.anInt4017, arg0.anInt4020, arg0.anInt4026, arg0.anInt4027, -1, arg0.anInt4022, arg0.anInt4021, arg0.anInt4013);
				}
				arg0.unlink();
			}
		} else if (arg0.aBoolean310 && arg0.anInt4027 >= 1 && arg0.anInt4017 >= 1 && Static720.anInt10888 - 2 >= arg0.anInt4027 && Static501.anInt7591 - 2 >= arg0.anInt4017 && (arg0.anInt4025 < 0 || Static235.method3424(arg0.anInt4025, arg0.anInt4024))) {
			if (arg1) {
				Static706.method9227(arg0.anInt4022, arg0.aClass150_1, arg0.anInt4017, arg0.anInt4021, arg0.anInt4027);
			} else {
				Static235.method3421(arg0.anInt4017, arg0.anInt4024, arg0.anInt4023, arg0.anInt4027, -1, arg0.anInt4022, arg0.anInt4021, arg0.anInt4025);
			}
			arg0.aBoolean310 = false;
			if (!arg1 && arg0.anInt4013 == arg0.anInt4025 && arg0.anInt4013 == -1) {
				arg0.unlink();
			} else if (!arg1 && arg0.anInt4013 == arg0.anInt4025 && arg0.anInt4023 == arg0.anInt4026 && arg0.anInt4024 == arg0.anInt4020) {
				arg0.unlink();
			}
		}
	}
}
