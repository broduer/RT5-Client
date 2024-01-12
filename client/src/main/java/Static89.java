import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_9 = new Class155(2);

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!ca;IILclient!wj;Lclient!c;BI)V")
	public static void method1714(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub2_Sub1_Sub2_Sub2 arg4, @OriginalArg(5) Class54 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub51 local7 = new Class2_Sub51();
		local7.anInt9376 = arg0;
		local7.anInt9383 = arg2 << 9;
		local7.anInt9378 = arg3 << 9;
		if (arg5 != null) {
			local7.aClass54_1 = arg5;
			@Pc(173) int local173 = arg5.anInt1275;
			@Pc(176) int local176 = arg5.anInt1234;
			if (arg6 == 1 || arg6 == 3) {
				local176 = arg5.anInt1275;
				local173 = arg5.anInt1234;
			}
			local7.anInt9384 = arg5.anInt1258;
			local7.anInt9382 = arg5.anInt1249 << 9;
			local7.anInt9379 = arg5.anInt1251;
			local7.anInt9380 = arg5.anInt1224;
			local7.anInt9375 = arg3 + local176 << 9;
			local7.anInt9386 = arg5.anInt1254;
			local7.aBoolean715 = arg5.aBoolean88;
			local7.aBoolean716 = arg5.aBoolean92;
			local7.anInt9381 = arg5.anInt1226 << 9;
			local7.anInt9391 = arg5.anInt1236;
			local7.anInt9385 = arg5.anInt1273;
			local7.anIntArray718 = arg5.anIntArray116;
			local7.anInt9388 = arg2 + local173 << 9;
			if (arg5.anIntArray113 != null) {
				local7.aBoolean714 = true;
				local7.method8243();
			}
			if (local7.anIntArray718 != null) {
				local7.anInt9377 = (int) ((double) (local7.anInt9380 - local7.anInt9391) * Math.random()) + local7.anInt9391;
			}
			Static460.aClass341_40.method7718(local7);
			return;
		}
		if (arg4 != null) {
			local7.aClass8_Sub2_Sub1_Sub2_Sub2_3 = arg4;
			@Pc(37) Class270 local37 = arg4.aClass270_1;
			if (local37.anIntArray532 != null) {
				local7.aBoolean714 = true;
				local37 = local37.method5992(65535, Static34.aClass306_1);
			}
			if (local37 != null) {
				local7.anInt9388 = local37.anInt6733 + arg2 << 9;
				local7.anInt9375 = arg3 + local37.anInt6733 << 9;
				local7.anInt9379 = Static497.method6636(arg4);
				local7.anInt9381 = local37.anInt6761 << 9;
				local7.anInt9384 = local37.anInt6741;
				local7.anInt9385 = local37.anInt6749;
				local7.aBoolean715 = local37.aBoolean508;
				local7.anInt9382 = local37.anInt6762 << 9;
				local7.anInt9386 = local37.anInt6756;
			}
			Static717.aClass341_81.method7718(local7);
			return;
		}
		if (arg1 == null) {
			return;
		}
		local7.aClass8_Sub2_Sub1_Sub2_Sub1_3 = arg1;
		local7.anInt9388 = arg2 + arg1.method9309((byte) 46) << 9;
		local7.anInt9375 = arg1.method9309((byte) 77) + arg3 << 9;
		local7.anInt9379 = Static326.method4877(arg1);
		local7.anInt9382 = arg1.anInt1459 << 9;
		local7.anInt9386 = 256;
		local7.anInt9385 = 256;
		local7.anInt9384 = arg1.anInt1467;
		local7.anInt9381 = 0;
		local7.aBoolean715 = arg1.aBoolean126;
		Static113.aClass28_12.method735((long) arg1.anInt10768, local7);
		return;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "([FFIII[FFIIIII)V")
	public static void method1715(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg3 - arg10;
		@Pc(9) int local9 = arg9 - arg2;
		@Pc(20) int local20 = arg8 - arg7;
		@Pc(45) float local45 = (float) local9 * arg0[2] + arg0[1] * (float) local20 + (float) local5 * arg0[0];
		@Pc(66) float local66 = (float) local9 * arg0[5] + (float) local20 * arg0[4] + arg0[3] * (float) local5;
		@Pc(87) float local87 = arg0[6] * (float) local5 + (float) local20 * arg0[7] + arg0[8] * (float) local9;
		@Pc(98) float local98 = (float) Math.atan2((double) local45, (double) local87) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local98 *= arg6;
		}
		@Pc(112) float local112 = arg1 + local66 + 0.5F;
		@Pc(131) float local131;
		if (arg4 == 1) {
			local131 = local98;
			local98 = -local112;
			local112 = local131;
		} else if (arg4 == 2) {
			local112 = -local112;
			local98 = -local98;
		} else if (arg4 == 3) {
			local131 = local98;
			local98 = local112;
			local112 = -local131;
		}
		arg5[1] = local112;
		arg5[0] = local98;
	}
}
