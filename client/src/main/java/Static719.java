import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static719 {

	@OriginalMember(owner = "client!wq", name = "V", descriptor = "Lclient!cd;")
	public static Class56 aClass56_5;

	@OriginalMember(owner = "client!wq", name = "T", descriptor = "I")
	public static int anInt10532;

	@OriginalMember(owner = "client!wq", name = "S", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_45 = new Class155(60);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!d;Lclient!ha;Z)V")
	public static void method9124(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class19 arg1) {
		if (Static30.aClass2_Sub2_Sub13_3 == null) {
			return;
		}
		if (Static273.anInt4416 < 10) {
			if (!Static30.aClass332_74.method7605(Static30.aClass2_Sub2_Sub13_3.aString48)) {
				Static273.anInt4416 = Static120.aClass332_19.method7600(Static30.aClass2_Sub2_Sub13_3.aString48) / 10;
				return;
			}
			Static700.method9159();
			Static273.anInt4416 = 10;
		}
		if (Static273.anInt4416 == 10) {
			Static30.anInt5675 = Static30.aClass2_Sub2_Sub13_3.anInt4574 >> 6 << 6;
			Static30.anInt5668 = Static30.aClass2_Sub2_Sub13_3.anInt4573 >> 6 << 6;
			Static30.anInt5670 = (Static30.aClass2_Sub2_Sub13_3.anInt4566 >> 6 << 6) - (Static30.anInt5675 - 64);
			Static30.anInt5664 = (Static30.aClass2_Sub2_Sub13_3.anInt4576 >> 6 << 6) + 64 - Static30.anInt5668;
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static30.aClass2_Sub2_Sub13_3.method4088(local77, Static116.anInt2279 + (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >> 9), Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144, (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >> 9) + Static691.anInt10395)) {
				local79 = local77[1] - Static30.anInt5675;
				local81 = local77[2] - Static30.anInt5668;
			}
			if (!Static696.aBoolean785 && local79 >= 0 && Static30.anInt5670 > local79 && local81 >= 0 && local81 < Static30.anInt5664) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static164.anInt2818 = local79;
				Static615.anInt9415 = local81;
			} else if (Static227.anInt3704 == -1 || Static529.anInt8112 == -1) {
				Static30.aClass2_Sub2_Sub13_3.method4085(Static30.aClass2_Sub2_Sub13_3.anInt4570 >> 14 & 0x3FFF, Static30.aClass2_Sub2_Sub13_3.anInt4570 & 0x3FFF, local77);
				Static615.anInt9415 = local77[2] - Static30.anInt5668;
				Static164.anInt2818 = local77[1] - Static30.anInt5675;
			} else {
				Static30.aClass2_Sub2_Sub13_3.method4085(Static227.anInt3704, Static529.anInt8112, local77);
				if (local77 != null) {
					Static615.anInt9415 = local77[2] - Static30.anInt5668;
					Static164.anInt2818 = local77[1] - Static30.anInt5675;
				}
				Static696.aBoolean785 = false;
				Static529.anInt8112 = -1;
				Static227.anInt3704 = -1;
			}
			if (Static30.aClass2_Sub2_Sub13_3.anInt4578 == 37) {
				Static30.aFloat105 = 3.0F;
				Static30.aFloat106 = 3.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4578 == 50) {
				Static30.aFloat105 = 4.0F;
				Static30.aFloat106 = 4.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4578 == 75) {
				Static30.aFloat105 = 6.0F;
				Static30.aFloat106 = 6.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4578 == 100) {
				Static30.aFloat105 = 8.0F;
				Static30.aFloat106 = 8.0F;
			} else if (Static30.aClass2_Sub2_Sub13_3.anInt4578 == 200) {
				Static30.aFloat105 = 16.0F;
				Static30.aFloat106 = 16.0F;
			} else {
				Static30.aFloat105 = 8.0F;
				Static30.aFloat106 = 8.0F;
			}
			Static30.anInt5663 = (int) Static30.aFloat105 >> 1;
			Static30.aByteArrayArrayArray5 = Static640.method8444(Static30.anInt5663);
			Static387.method5447();
			Static30.method5076();
			Static551.aClass341_54 = new Class341();
			Static30.anInt5661 += (int) (Math.random() * 5.0D) - 2;
			if (Static30.anInt5661 < -8) {
				Static30.anInt5661 = -8;
			}
			Static30.anInt5662 += (int) (Math.random() * 5.0D) - 2;
			if (Static30.anInt5661 > 8) {
				Static30.anInt5661 = 8;
			}
			if (Static30.anInt5662 < -16) {
				Static30.anInt5662 = -16;
			}
			if (Static30.anInt5662 > 16) {
				Static30.anInt5662 = 16;
			}
			Static30.method5074(arg0, Static30.anInt5661 >> 2 << 10, Static30.anInt5662 >> 1);
			Static30.aClass248_3.method5590(1024, 256);
			Static30.aClass365_3.method8372(256, 256);
			Static30.aClass142_3.method3062(4096);
			Static529.aClass161_1.method3420(256);
			Static273.anInt4416 = 20;
		} else if (Static273.anInt4416 == 20) {
			Static314.method4575(true);
			Static30.method5087(arg1, Static30.anInt5661, Static30.anInt5662);
			Static273.anInt4416 = 60;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 60) {
			if (Static30.aClass332_74.method7594(Static30.aClass2_Sub2_Sub13_3.aString48 + "_staticelements")) {
				if (!Static30.aClass332_74.method7605(Static30.aClass2_Sub2_Sub13_3.aString48 + "_staticelements")) {
					return;
				}
				Static30.aClass257_3 = Static284.method4103(Static174.aBoolean249, Static30.aClass332_74, Static30.aClass2_Sub2_Sub13_3.aString48 + "_staticelements");
			} else {
				Static30.aClass257_3 = new Class257(0);
			}
			Static30.method5086();
			Static273.anInt4416 = 70;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 70) {
			Static559.aClass329_7 = new Class329(arg1, 11, true, Static434.aCanvas7);
			Static273.anInt4416 = 73;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 73) {
			Static484.aClass329_6 = new Class329(arg1, 12, true, Static434.aCanvas7);
			Static273.anInt4416 = 76;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 76) {
			Static142.aClass329_1 = new Class329(arg1, 14, true, Static434.aCanvas7);
			Static273.anInt4416 = 79;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 79) {
			Static651.aClass329_8 = new Class329(arg1, 17, true, Static434.aCanvas7);
			Static273.anInt4416 = 82;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 82) {
			Static275.aClass329_2 = new Class329(arg1, 19, true, Static434.aCanvas7);
			Static273.anInt4416 = 85;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 85) {
			Static390.aClass329_5 = new Class329(arg1, 22, true, Static434.aCanvas7);
			Static273.anInt4416 = 88;
			Static314.method4575(true);
			Static199.method2977();
		} else if (Static273.anInt4416 == 88) {
			Static364.aClass329_4 = new Class329(arg1, 26, true, Static434.aCanvas7);
			Static273.anInt4416 = 91;
			Static314.method4575(true);
			Static199.method2977();
		} else {
			Static359.aClass329_3 = new Class329(arg1, 30, true, Static434.aCanvas7);
			Static273.anInt4416 = 100;
			Static314.method4575(true);
			Static199.method2977();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)I")
	public static int method9125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 16939) {
			aClass56_5 = null;
		}
		@Pc(18) int local18 = arg2 - 1 & arg0 >> 31;
		return local18 + (arg0 + (arg0 >>> 31)) % arg2;
	}
}
