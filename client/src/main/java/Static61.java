import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILclient!eia;)V")
	public static void method1299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8_Sub2_Sub2 arg3) {
		@Pc(4) Class293 local4 = Static347.method5102(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass8_Sub2_Sub2_1 = arg3;
		@Pc(19) int local19 = Static246.aClass178Array1 == Static693.aClass178Array2 ? 1 : 0;
		if (arg3.method9290()) {
			if (arg3.method9289(0)) {
				arg3.aClass8_Sub2_25 = Static398.aClass8_Sub2Array7[local19];
				Static398.aClass8_Sub2Array7[local19] = arg3;
				return;
			}
			arg3.aClass8_Sub2_25 = Static576.aClass8_Sub2Array9[local19];
			Static576.aClass8_Sub2Array9[local19] = arg3;
			Static75.aBoolean521 = true;
			return;
		}
		arg3.aClass8_Sub2_25 = Static468.aClass8_Sub2Array10[local19];
		Static468.aClass8_Sub2Array10[local19] = arg3;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([J[Ljava/lang/Object;Z)V")
	public static void method1308(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static542.method7207(arg1, arg0, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
	public static int method1313(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
