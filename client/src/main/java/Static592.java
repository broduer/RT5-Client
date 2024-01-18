import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!sla", name = "b", descriptor = "[Lclient!qfa;")
	public static final Node_Sub45[] aClass2_Sub45Array1 = new Node_Sub45[1024];

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(I)V")
	public static void method7768() {
		@Pc(9) int local9 = Static121.anInt2342 * 512 + 256;
		@Pc(15) int local15 = Static709.anInt10695 * 512 + 256;
		@Pc(24) int local24 = Static102.method2025(Static394.anInt6196, -29754, local15, local9) - Static363.anInt6955;
		if (Static674.anInt10115 >= 100) {
			Static170.anInt2873 = Static121.anInt2342 * 512 + 256;
			Static110.anInt2195 = Static709.anInt10695 * 512 + 256;
			Static359.anInt5821 = Static102.method2025(Static394.anInt6196, -29754, Static110.anInt2195, Static170.anInt2873) - Static363.anInt6955;
		} else {
			if (Static170.anInt2873 < local9) {
				Static170.anInt2873 += Static694.anInt10439 + (local9 - Static170.anInt2873) * Static674.anInt10115 / 1000;
				if (local9 < Static170.anInt2873) {
					Static170.anInt2873 = local9;
				}
			}
			if (local24 > Static359.anInt5821) {
				Static359.anInt5821 += Static694.anInt10439 + Static674.anInt10115 * (local24 - Static359.anInt5821) / 1000;
				if (local24 < Static359.anInt5821) {
					Static359.anInt5821 = local24;
				}
			}
			if (local9 < Static170.anInt2873) {
				Static170.anInt2873 -= Static694.anInt10439 + (Static170.anInt2873 - local9) * Static674.anInt10115 / 1000;
				if (local9 > Static170.anInt2873) {
					Static170.anInt2873 = local9;
				}
			}
			if (Static359.anInt5821 > local24) {
				Static359.anInt5821 -= Static694.anInt10439 + (Static359.anInt5821 - local24) * Static674.anInt10115 / 1000;
				if (local24 > Static359.anInt5821) {
					Static359.anInt5821 = local24;
				}
			}
			if (Static110.anInt2195 < local15) {
				Static110.anInt2195 += Static694.anInt10439 + (local15 - Static110.anInt2195) * Static674.anInt10115 / 1000;
				if (local15 < Static110.anInt2195) {
					Static110.anInt2195 = local15;
				}
			}
			if (Static110.anInt2195 > local15) {
				Static110.anInt2195 -= Static674.anInt10115 * (Static110.anInt2195 - local15) / 1000 + Static694.anInt10439;
				if (local15 > Static110.anInt2195) {
					Static110.anInt2195 = local15;
				}
			}
		}
		local15 = Static12.anInt5761 * 512 + 256;
		local9 = Static441.anInt6709 * 512 + 256;
		local24 = Static102.method2025(Static394.anInt6196, -29754, local15, local9) - Static55.anInt1129;
		@Pc(259) int local259 = local9 - Static170.anInt2873;
		@Pc(264) int local264 = local24 - Static359.anInt5821;
		@Pc(269) int local269 = local15 - Static110.anInt2195;
		@Pc(280) int local280 = (int) Math.sqrt(local269 * local269 + local259 * local259);
		@Pc(291) int local291 = (int) (Math.atan2(local264, local280) * 2607.5945876176133D) & 0x3FFF;
		@Pc(302) int local302 = (int) (-2607.5945876176133D * Math.atan2(local259, local269)) & 0x3FFF;
		if (local291 < 1024) {
			local291 = 1024;
		}
		if (local291 > 3072) {
			local291 = 3072;
		}
		if (Static598.anInt8856 < local291) {
			Static598.anInt8856 += (local291 - Static598.anInt8856 >> 3) * Static179.anInt3000 / 1000 + Static314.anInt5052 << 3;
			if (local291 < Static598.anInt8856) {
				Static598.anInt8856 = local291;
			}
		}
		if (Static598.anInt8856 > local291) {
			Static598.anInt8856 -= Static314.anInt5052 + Static179.anInt3000 * (Static598.anInt8856 - local291 >> 3) / 1000 << 3;
			if (Static598.anInt8856 < local291) {
				Static598.anInt8856 = local291;
			}
		}
		@Pc(388) int local388 = local302 - Static323.anInt5136;
		if (local388 > 8192) {
			local388 -= 16384;
		}
		if (local388 < -8192) {
			local388 += 16384;
		}
		local388 >>= 0x3;
		if (local388 > 0) {
			Static323.anInt5136 += Static314.anInt5052 + Static179.anInt3000 * local388 / 1000 << 3;
			Static323.anInt5136 &= 0x3FFF;
		}
		if (local388 < 0) {
			Static323.anInt5136 -= Static179.anInt3000 * -local388 / 1000 + Static314.anInt5052 << 3;
			Static323.anInt5136 &= 0x3FFF;
		}
		@Pc(456) int local456 = local302 - Static323.anInt5136;
		if (local456 > 8192) {
			local456 -= 16384;
		}
		if (local456 < -8192) {
			local456 += 16384;
		}
		Static81.anInt1651 = 0;
		if (local456 < 0 && local388 > 0 || local456 > 0 && local388 < 0) {
			Static323.anInt5136 = local302;
		}
	}
}
