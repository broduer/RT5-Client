import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!lla", name = "e", descriptor = "[B")
	public static byte[] aByteArray43;

	@OriginalMember(owner = "client!lla", name = "f", descriptor = "I")
	public static int anInt4275;

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "I")
	public static int anInt4277 = 64;

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(I)V")
	public static void method3847() {
		@Pc(11) int local11 = Static363.aByteArrayArray22.length;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			if (Static363.aByteArrayArray22[local13] != null) {
				@Pc(20) int local20 = -1;
				for (@Pc(22) int local22 = 0; local22 < Static183.anInt3033; local22++) {
					if (Static89.anIntArray169[local13] == Static119.anIntArray199[local22]) {
						local20 = local22;
						break;
					}
				}
				if (local20 == -1) {
					Static119.anIntArray199[Static183.anInt3033] = Static89.anIntArray169[local13];
					local20 = Static183.anInt3033++;
				}
				@Pc(66) Class2_Sub21 local66 = new Class2_Sub21(Static363.aByteArrayArray22[local13]);
				@Pc(68) int local68 = 0;
				while (Static363.aByteArrayArray22[local13].length > local66.anInt8412 && local68 < 511 && Static390.anInt6146 < 1023) {
					@Pc(88) int local88 = local20 | local68++ << 6;
					@Pc(94) int local94 = local66.method7389();
					@Pc(98) int local98 = local94 >> 14;
					@Pc(104) int local104 = local94 >> 7 & 0x3F;
					@Pc(108) int local108 = local94 & 0x3F;
					@Pc(121) int local121 = local104 + (Static89.anIntArray169[local13] >> 8) * 64 - Static691.anInt10395;
					@Pc(135) int local135 = (Static89.anIntArray169[local13] & 0xFF) * 64 + local108 - Static116.anInt2279;
					@Pc(142) Class270 local142 = Static690.aClass310_2.method7099(local66.method7389());
					@Pc(149) Class2_Sub45 local149 = (Class2_Sub45) Static18.aClass28_2.method738((long) local88);
					if (local149 == null && (local142.aByte103 & 0x1) > 0 && local98 == Static164.anInt2817 && local121 >= 0 && local142.anInt6733 + local121 < Static720.anInt10888 && local135 >= 0 && local135 + local142.anInt6733 < Static501.anInt7591) {
						@Pc(197) Class8_Sub2_Sub1_Sub2_Sub2 local197 = new Class8_Sub2_Sub1_Sub2_Sub2();
						local197.anInt10768 = local88;
						@Pc(205) Class2_Sub45 local205 = new Class2_Sub45(local197);
						Static18.aClass28_2.method735((long) local88, local205);
						Static592.aClass2_Sub45Array1[Static416.anInt6398++] = local205;
						Static103.anIntArray187[Static390.anInt6146++] = local88;
						local197.anInt10780 = Static333.anInt5474;
						local197.method9335(local142);
						local197.method9317(local197.aClass270_1.anInt6733);
						local197.anInt10786 = local197.aClass270_1.anInt6768 << 3;
						local197.method9305((local197.aClass270_1.aByte110 + 4 & 0x80600007) << 11, true);
						local197.method9333(true, local135, local121, local98, local197.method9309((byte) 119));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lla", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method3851(@OriginalArg(0) Class19 arg0) {
		if (Static133.aClass341_13.method7708() == 0) {
			return;
		}
		@Pc(31) Class2_Sub36 local31;
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 0) {
			for (local31 = (Class2_Sub36) Static133.aClass341_13.method7706(65280); local31 != null; local31 = (Class2_Sub36) Static133.aClass341_13.method7713()) {
				Static419.aClass112_1.method2478(local31.anInt5913, arg0, arg0, local31.aBoolean451 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 : null, false, local31.anInt5911, local31.anInt5908, false, local31.anInt5910, Static665.aClass14_12, local31.anInt5915);
				local31.method9464();
			}
			Static469.method6369();
			return;
		}
		if (Static158.aClass19_5 == null) {
			@Pc(85) Canvas local85 = new Canvas();
			local85.setSize(36, 32);
			Static158.aClass19_5 = Static255.method3612(Static124.aClass332_20, Static56.anInterface4_3, 0, local85, 0);
			Static629.aClass14_11 = Static158.aClass19_5.method8017(Static74.method1535(Static662.anInt9871, Static697.aClass332_123), Static736.method9382(Static721.aClass332_128, Static662.anInt9871), true);
		}
		for (local31 = (Class2_Sub36) Static133.aClass341_13.method7706(65280); local31 != null; local31 = (Class2_Sub36) Static133.aClass341_13.method7713()) {
			Static419.aClass112_1.method2478(local31.anInt5913, Static158.aClass19_5, arg0, local31.aBoolean451 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aClass203_1 : null, false, local31.anInt5911, local31.anInt5908, false, local31.anInt5910, Static629.aClass14_11, local31.anInt5915);
			local31.method9464();
		}
	}

	@OriginalMember(owner = "client!lla", name = "b", descriptor = "(B)V")
	public static void method3852() {
		if (Static265.aByteArray44 != null) {
			Static292.method4622();
		} else if (Static129.anInt2418 == -1) {
			Static616.method8290(Static59.aString63, Static449.aString75);
		} else {
			Static695.method9273();
		}
	}
}
