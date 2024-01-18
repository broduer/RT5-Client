import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static723 {

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "[[I")
	public static int[][] anIntArrayArray266;

	@OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
	public static int anInt10958;

	@OriginalMember(owner = "client!wu", name = "E", descriptor = "Lclient!ul;")
	public static final Class379 aClass379_9 = new Class379("stellardawn", "Stellar Dawn", 1);

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString129 = null;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)V")
	public static void method9457() {
		Static268.aClass28_22.method737();
		Static232.aClass28_18.method737();
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V")
	public static void method9458() {
		@Pc(5) short local5 = 1024;
		@Pc(7) short local7 = 3072;
		if (Static504.aBoolean579) {
			if (Static129.aBoolean203) {
				local5 = 2048;
			}
			local7 = 4096;
		}
		if (Static479.aFloat123 < (float) local5) {
			Static479.aFloat123 = local5;
		}
		while (Static171.aFloat64 >= 16384.0F) {
			Static171.aFloat64 -= 16384.0F;
		}
		if ((float) local7 < Static479.aFloat123) {
			Static479.aFloat123 = local7;
		}
		while (Static171.aFloat64 < 0.0F) {
			Static171.aFloat64 += 16384.0F;
		}
		@Pc(59) int local59 = Static494.anInt7431 >> 9;
		@Pc(63) int local63 = Static38.anInt924 >> 9;
		@Pc(77) int local77 = Static102.method2025(Static394.anInt6196, -29754, Static38.anInt924, Static494.anInt7431);
		@Pc(79) int local79 = 0;
		@Pc(109) int local109;
		if (local59 > 3 && local63 > 3 && Static720.anInt10888 - 4 > local59 && local63 < Static501.anInt7591 - 4) {
			for (local109 = local59 - 4; local109 <= local59 + 4; local109++) {
				for (@Pc(114) int local114 = local63 - 4; local114 <= local63 + 4; local114++) {
					@Pc(117) int local117 = Static394.anInt6196;
					if (local117 < 3 && Static441.method5975(local114, local109)) {
						local117++;
					}
					@Pc(132) int local132 = 0;
					if (Static2.aClass308_Sub1_1.aByteArrayArrayArray12 != null && Static2.aClass308_Sub1_1.aByteArrayArrayArray12[local117] != null) {
						local132 = (Static2.aClass308_Sub1_1.aByteArrayArrayArray12[local117][local109][local114] & 0xFF) * 8 << 2;
					}
					if (Static246.aClass178Array1 != null && Static246.aClass178Array1[local117] != null) {
						@Pc(177) int local177 = local132 + local77 - Static246.aClass178Array1[local117].method7876(local114, local109);
						if (local79 < local177) {
							local79 = local177;
						}
					}
				}
			}
		}
		local109 = (local79 >> 2) * 1536;
		if (local109 > 786432) {
			local109 = 786432;
		}
		if (local109 < 262144) {
			local109 = 262144;
		}
		if (Static188.anInt3112 < local109) {
			Static188.anInt3112 += (local109 - Static188.anInt3112) / 24;
		} else if (Static188.anInt3112 > local109) {
			Static188.anInt3112 += (local109 - Static188.anInt3112) / 80;
		}
	}
}
