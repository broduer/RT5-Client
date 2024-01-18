import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!hla", name = "d", descriptor = "I")
	public static int anInt3993;

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "(ILclient!ca;)V")
	public static void method2551(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Class2_Sub51 local16 = (Class2_Sub51) Static113.aClass28_12.method373((long) arg0.anInt10740);
		if (local16 == null) {
			Static89.method1124(arg0.aByte144, arg0, arg0.anIntArray879[0], arg0.anIntArray878[0], (Class8_Sub2_Sub1_Sub2_Sub2) null, (Class54) null, 0);
		} else {
			local16.method5815();
		}
	}

	@OriginalMember(owner = "client!hla", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
	public static Object method2552(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static132.aBoolean208) {
			try {
				@Pc(25) Class175 local25 = (Class175) Class.forName("id").getDeclaredConstructor().newInstance();
				local25.method2707(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static132.aBoolean208 = true;
			}
		}
		return arg0;
	}
}
