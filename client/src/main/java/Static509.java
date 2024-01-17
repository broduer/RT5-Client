import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "Lclient!sb;")
	public static Class332 aClass332_96;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	public static final int anInt7657 = 4;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BII)V")
	public static void method6766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static30.aFloat106 > Static30.aFloat105) {
			Static30.aFloat105 = (float) ((double) Static30.aFloat105 + (double) Static30.aFloat105 / 30.0D);
			if (Static30.aFloat106 < Static30.aFloat105) {
				Static30.aFloat105 = Static30.aFloat106;
			}
			Static387.method5447();
			Static30.anInt5663 = (int) Static30.aFloat105 >> 1;
			Static30.aByteArrayArrayArray5 = Static640.method8444(Static30.anInt5663);
		} else if (Static30.aFloat105 > Static30.aFloat106) {
			Static30.aFloat105 = (float) ((double) Static30.aFloat105 - (double) Static30.aFloat105 / 30.0D);
			if (Static30.aFloat106 > Static30.aFloat105) {
				Static30.aFloat105 = Static30.aFloat106;
			}
			Static387.method5447();
			Static30.anInt5663 = (int) Static30.aFloat105 >> 1;
			Static30.aByteArrayArrayArray5 = Static640.method8444(Static30.anInt5663);
		}
		if (Static180.anInt3010 != -1 && Static558.anInt3190 != -1) {
			@Pc(101) int local101 = Static180.anInt3010 - Static164.anInt2818;
			if (local101 < 2 || local101 > 2) {
				local101 /= 8;
			}
			@Pc(120) int local120 = Static558.anInt3190 - Static615.anInt9415;
			Static164.anInt2818 += local101;
			if (local120 < 2 || local120 > 2) {
				local120 /= 8;
			}
			if (local101 == 0 && local120 == 0) {
				Static558.anInt3190 = -1;
				Static180.anInt3010 = -1;
			}
			Static615.anInt9415 -= -local120;
			Static387.method5447();
		}
		if (Static320.anInt5101 > 0) {
			Static212.anInt3477--;
			if (Static212.anInt3477 == 0) {
				Static320.anInt5101--;
				Static212.anInt3477 = 100;
			}
		} else {
			Static475.anInt7189 = -1;
			Static409.anInt6338 = -1;
		}
		if (!Static95.aBoolean184 || Static551.aClass341_54 == null) {
			return;
		}
		for (@Pc(197) Class2_Sub37 local197 = (Class2_Sub37) Static551.aClass341_54.method7706(65280); local197 != null; local197 = (Class2_Sub37) Static551.aClass341_54.method7713()) {
			@Pc(206) Class105 local206 = Static30.aClass248_3.method5591(local197.aClass2_Sub20_1.anInt3140);
			if (local197.method5560(arg0, arg1)) {
				if (local206.aStringArray9 != null) {
					if (local206.aStringArray9[4] != null) {
						Static416.method5714(false, -1, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606, 0, local206.aStringArray9[4], 1004, true, -1, local206.aString24, local197.aClass2_Sub20_1.anInt3140, false);
					}
					if (local206.aStringArray9[3] != null) {
						Static416.method5714(false, -1, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606, 0, local206.aStringArray9[3], 1009, true, -1, local206.aString24, local197.aClass2_Sub20_1.anInt3140, false);
					}
					if (local206.aStringArray9[2] != null) {
						Static416.method5714(false, -1, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606, 0, local206.aStringArray9[2], 1006, true, -1, local206.aString24, local197.aClass2_Sub20_1.anInt3140, false);
					}
					if (local206.aStringArray9[1] != null) {
						Static416.method5714(false, -1, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606, 0, local206.aStringArray9[1], 1001, true, -1, local206.aString24, local197.aClass2_Sub20_1.anInt3140, false);
					}
					if (local206.aStringArray9[0] != null) {
						Static416.method5714(false, -1, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606, 0, local206.aStringArray9[0], 1003, true, -1, local206.aString24, local197.aClass2_Sub20_1.anInt3140, false);
					}
				}
				if (!local197.aClass2_Sub20_1.aBoolean256) {
					local197.aClass2_Sub20_1.aBoolean256 = true;
					Static472.method6436(Static5.aClass244_1, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606);
				}
				if (local197.aClass2_Sub20_1.aBoolean256) {
					Static472.method6436(Static639.aClass244_13, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606);
				}
			} else if (local197.aClass2_Sub20_1.aBoolean256) {
				local197.aClass2_Sub20_1.aBoolean256 = false;
				Static472.method6436(Static280.aClass244_7, local197.aClass2_Sub20_1.anInt3140, local206.anInt2606);
			}
		}
	}
}
