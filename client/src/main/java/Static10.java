import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!afa", name = "p", descriptor = "Lclient!kn;")
	public static final Class215 aClass215_1 = new Class215(true);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[100];

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class293 local7 = Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(14) Class288 local14 = local7.aClass288_2; local14 != null; local14 = local14.aClass288_1) {
			@Pc(18) Class8_Sub2_Sub1 local18 = local14.aClass8_Sub2_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort131 == arg1 && local18.aShort132 == arg2) {
				Static549.method8300(local18, false);
				return;
			}
		}
	}
}
