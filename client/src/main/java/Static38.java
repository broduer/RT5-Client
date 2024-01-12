import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
	public static int anInt924;

	@OriginalMember(owner = "client!bea", name = "i", descriptor = "I")
	public static int anInt926 = 0;

	@OriginalMember(owner = "client!bea", name = "f", descriptor = "I")
	public static int anInt932 = 0;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IIJI)V")
	public static void method1001(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static147.method2419(local17, arg2, 0, true, arg0, 0, local10, 0);
			return;
		}
		@Pc(62) Class54 local62 = Static354.aClass142_4.method3063(local29, 63);
		@Pc(75) int local75;
		@Pc(78) int local78;
		if (local17 == 0 || local17 == 2) {
			local75 = local62.anInt1275;
			local78 = local62.anInt1234;
		} else {
			local75 = local62.anInt1234;
			local78 = local62.anInt1275;
		}
		@Pc(88) int local88 = local62.anInt1266;
		if (local17 != 0) {
			local88 = (local88 << local17 & 0xF) + (local88 >> 4 - local17);
		}
		Static147.method2419(0, arg2, local78, true, arg0, local88, 0, local75);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(IZ)J")
	public static long method1003(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
