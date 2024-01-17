import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ica", name = "m", descriptor = "Lclient!sb;")
	public static Class332 aClass332_56;

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "[I")
	public static final int[] anIntArray326 = new int[13];

	@OriginalMember(owner = "client!ica", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(Z)V")
	public static void method3839() {
		@Pc(8) Class2_Sub21_Sub2 local8 = Static405.aClass153_2.aClass2_Sub21_Sub2_2;
		local8.method7424();
		@Pc(16) int local16 = local8.method7419(8);
		@Pc(21) int local21;
		if (Static390.anInt6146 > local16) {
			for (local21 = local16; local21 < Static390.anInt6146; local21++) {
				Static118.anIntArray197[Static78.anInt1629++] = Static103.anIntArray187[local21];
			}
		}
		if (local16 > Static390.anInt6146) {
			throw new RuntimeException("gnpov1");
		}
		Static390.anInt6146 = 0;
		for (local21 = 0; local21 < local16; local21++) {
			@Pc(73) int local73 = Static103.anIntArray187[local21];
			@Pc(81) Class8_Sub2_Sub1_Sub2_Sub2 local81 = ((Class2_Sub45) Static18.aClass28_2.method738(local73)).aClass8_Sub2_Sub1_Sub2_Sub2_2;
			@Pc(86) int local86 = local8.method7419(1);
			if (local86 == 0) {
				Static103.anIntArray187[Static390.anInt6146++] = local73;
				local81.anInt10780 = Static572.anInt8920;
			} else {
				@Pc(108) int local108 = local8.method7419(2);
				if (local108 == 0) {
					Static103.anIntArray187[Static390.anInt6146++] = local73;
					local81.anInt10780 = Static572.anInt8920;
					Static458.anIntArray553[Static86.anInt1806++] = local73;
				} else {
					@Pc(156) int local156;
					@Pc(166) int local166;
					if (local108 == 1) {
						Static103.anIntArray187[Static390.anInt6146++] = local73;
						local81.anInt10780 = Static572.anInt8920;
						local156 = local8.method7419(3);
						local81.method9332(1, local156);
						local166 = local8.method7419(1);
						if (local166 == 1) {
							Static458.anIntArray553[Static86.anInt1806++] = local73;
						}
					} else if (local108 == 2) {
						Static103.anIntArray187[Static390.anInt6146++] = local73;
						local81.anInt10780 = Static572.anInt8920;
						if (local8.method7419(1) == 1) {
							local156 = local8.method7419(3);
							local81.method9332(2, local156);
							local166 = local8.method7419(3);
							local81.method9332(2, local166);
						} else {
							local156 = local8.method7419(3);
							local81.method9332(0, local156);
						}
						local156 = local8.method7419(1);
						if (local156 == 1) {
							Static458.anIntArray553[Static86.anInt1806++] = local73;
						}
					} else if (local108 == 3) {
						Static118.anIntArray197[Static78.anInt1629++] = local73;
					}
				}
			}
		}
	}
}
