import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dha", name = "y", descriptor = "I")
	public static int anInt2195;

	@OriginalMember(owner = "client!dha", name = "s", descriptor = "I")
	public static int anInt2198;

	@OriginalMember(owner = "client!dha", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString19 = "";

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IZ)V")
	public static void method2079(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = client.cycle - Static212.anInt3478;
		if (local7 >= 100) {
			Static693.anInt10411 = -1;
			Static692.anInt10404 = -1;
			Static511.anInt7668 = 1;
			return;
		}
		@Pc(28) int local28 = (int) Static479.aFloat123;
		if (Static188.anInt3112 >> 8 > local28) {
			local28 = Static188.anInt3112 >> 8;
		}
		if (Static572.aBooleanArray29[4] && local28 < Static140.anIntArray222[4] + 128) {
			local28 = Static140.anIntArray222[4] + 128;
		}
		@Pc(63) int local63 = (int) Static171.aFloat64 + Static288.anInt4635 & 0x3FFF;
		Static292.method4613(local28, (local28 >> 3) * 3 + 600 << 2, arg0, Static494.anInt7431, local63, Static38.anInt924, Static102.method2025(Static394.anInt6196, -29754, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718) - 200);
		@Pc(107) float local107 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static170.anInt2873 = (int) ((float) Static70.anInt1576 + (float) (Static170.anInt2873 - Static70.anInt1576) * local107);
		Static359.anInt5821 = (int) ((float) (Static359.anInt5821 - Static302.anInt4870) * local107 + (float) Static302.anInt4870);
		anInt2195 = (int) (local107 * (float) (anInt2195 - Static411.anInt6349) + (float) Static411.anInt6349);
		Static598.anInt8856 = (int) ((float) (Static598.anInt8856 - Static340.anInt5604) * local107 + (float) Static340.anInt5604);
		@Pc(160) int local160 = Static323.anInt5136 - Static225.anInt3651;
		if (local160 > 8192) {
			local160 -= 16384;
		} else if (local160 < -8192) {
			local160 += 16384;
		}
		Static323.anInt5136 = (int) ((float) Static225.anInt3651 + (float) local160 * local107);
		Static323.anInt5136 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!sb;I)V")
	public static void method2081(@OriginalArg(0) Class332 arg0) {
		Static331.aClass332_65 = arg0;
	}

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lclient!da;)V")
	public static void method2082(@OriginalArg(0) Class14 arg0) {
		Static242.aClass14_7 = arg0;
	}
}
