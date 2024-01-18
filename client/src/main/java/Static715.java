import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static715 {

	@OriginalMember(owner = "client!wla", name = "j", descriptor = "I")
	public static int anInt10810;

	@OriginalMember(owner = "client!wla", name = "k", descriptor = "I")
	public static int anInt10805 = 0;

	@OriginalMember(owner = "client!wla", name = "p", descriptor = "[I")
	public static final int[] anIntArray881 = new int[200];

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(BLclient!ge;)Lclient!rk;")
	public static Class138_Sub1 method6735(@OriginalArg(1) Class2_Sub21 arg0) {
		@Pc(7) Class138 local7 = Static632.method5923(arg0);
		@Pc(13) int local13 = arg0.method5191();
		@Pc(19) int local19 = arg0.method5191();
		@Pc(25) int local25 = arg0.method5191();
		@Pc(29) int local29 = arg0.method5191();
		@Pc(33) int local33 = arg0.method5191();
		@Pc(43) int local43 = arg0.method5191();
		return new Class138_Sub1(local7.aClass403_10, local7.aClass103_10, local7.anInt4423, local7.anInt4412, local7.anInt4418, local7.anInt4413, local7.anInt4416, local7.anInt4415, local7.anInt4421, local13, local19, local25, local29, local33, local43);
	}

	@OriginalMember(owner = "client!wla", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IZ)V")
	public static void method6736(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		Static311.method3168(true, arg4, -1, arg1, arg0, arg2);
		if (arg3 != 8) {
			method6736((String) null, 91, (String) null, -101, true);
		}
	}
}
