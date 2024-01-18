import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!jea", name = "m", descriptor = "Lclient!pw;")
	public static Class2_Sub43 instance;

	@OriginalMember(owner = "client!jea", name = "t", descriptor = "J")
	public static long aLong163;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "[I")
	public static int[] anIntArray387 = new int[1];

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!ha;IIIBI)V")
	public static void method4611(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg6) {
		if ((Static26.aClass23_5 == null || Static63.aClass23_8 == null || Static261.aClass23_18 == null) && Static721.aClass332_128.method7588(Static337.anInt5581) && Static721.aClass332_128.method7588(Static176.anInt7555) && Static721.aClass332_128.method7588(Static282.anInt4432)) {
			@Pc(46) Class409 local46 = Static735.method9389(Static721.aClass332_128, Static176.anInt7555, 0);
			Static63.aClass23_8 = arg1.method7955(local46, true);
			local46.method9395();
			Static542.aClass23_33 = arg1.method7955(local46, true);
			Static26.aClass23_5 = arg1.method7955(Static735.method9389(Static721.aClass332_128, Static337.anInt5581, 0), true);
			@Pc(71) Class409 local71 = Static735.method9389(Static721.aClass332_128, Static282.anInt4432, 0);
			Static261.aClass23_18 = arg1.method7955(local71, true);
			local71.method9395();
			Static561.aClass23_34 = arg1.method7955(local71, true);
		}
		if (Static26.aClass23_5 == null || Static63.aClass23_8 == null || Static261.aClass23_18 == null) {
			return;
		}
		@Pc(103) int local103 = (arg3 - Static261.aClass23_18.method8206() * 2) / Static26.aClass23_5.method8206();
		for (@Pc(105) int local105 = 0; local105 < local103; local105++) {
			Static26.aClass23_5.method8209(Static261.aClass23_18.method8206() + arg2 + Static26.aClass23_5.method8206() * local105, -Static26.aClass23_5.method8189() + arg6 + arg0);
		}
		@Pc(145) int local145 = (arg6 - arg4 - Static261.aClass23_18.method8189()) / Static63.aClass23_8.method8189();
		for (@Pc(147) int local147 = 0; local147 < local145; local147++) {
			Static63.aClass23_8.method8209(arg2, arg4 + arg0 + Static63.aClass23_8.method8189() * local147);
			Static542.aClass23_33.method8209(arg3 + arg2 - Static542.aClass23_33.method8206(), arg0 - -arg4 + Static63.aClass23_8.method8189() * local147);
		}
		Static261.aClass23_18.method8209(arg2, arg0 + arg6 - Static261.aClass23_18.method8189());
		Static561.aClass23_34.method8209(arg3 + arg2 - Static261.aClass23_18.method8206(), arg6 + (arg0 - Static261.aClass23_18.method8189()));
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(IIIIIIII)V")
	public static void method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = local7 * (Static502.aShort97 - Static228.aShort45) / 100 + Static228.aShort45;
		Static582.anInt8651 = Static582.anInt8654 * local33 >> 8;
		@Pc(45) int local45 = local33 * arg1 >> 8;
		@Pc(52) int local52 = 16384 - arg0 & 0x3FFF;
		@Pc(65) int local65 = 16384 - arg4 & 0x3FFF;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = local45;
		if (local52 != 0) {
			local69 = Class363.anIntArray741[local52] * -local45 >> 14;
			local71 = local45 * Class363.anIntArray740[local52] >> 14;
		}
		if (local65 != 0) {
			local67 = local71 * Class363.anIntArray741[local65] >> 14;
			local71 = Class363.anIntArray740[local65] * local71 >> 14;
		}
		Static598.anInt8856 = arg0;
		Static110.anInt2195 = arg5 - local71;
		Static170.anInt2873 = arg3 - local67;
		Static359.anInt5821 = arg6 - local69;
		Static81.anInt1651 = 0;
		Static323.anInt5136 = arg4;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
	public static void method4622() {
		Static470.anInt7134 = -1;
		Static524.aClass153_3 = Static405.aClass153_1;
		Static299.anInt4841 = 1;
		@Pc(16) String local16 = null;
		if (Static265.sskey != null) {
			@Pc(23) Packet local23 = new Packet(Static265.sskey);
			local16 = Static287.method4154(local23.g8());
			Static430.aLong209 = local23.g8();
		}
		if (local16 == null) {
			Static342.method4471(35);
		} else {
			Static238.method3471(false, local16, true, "");
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method4625(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static246.aClass178Array1 == Static693.aClass178Array2) {
			return;
		}
		@Pc(10) int local10 = Static706.aClass178Array3[arg1].method7885(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class178 local25 = Static706.aClass178Array3[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method7885(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}
}
