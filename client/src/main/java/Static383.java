import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
	public static int anInt6021 = -1;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!rka;I)Z")
	public static boolean method5386(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		@Pc(18) int local18 = arg1.method7419(2);
		@Pc(45) int local45;
		@Pc(50) int local50;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(137) int local137;
		if (local18 == 0) {
			if (arg1.method7419(1) != 0) {
				method5386(arg0, arg1);
			}
			local45 = arg1.method7419(6);
			local50 = arg1.method7419(6);
			@Pc(63) boolean local63 = arg1.method7419(1) == 1;
			if (local63) {
				Static321.anIntArray388[Static652.anInt9739++] = arg0;
			}
			if (Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(91) Class352 local91 = Static246.aClass352Array1[arg0];
			@Pc(99) Class8_Sub2_Sub1_Sub2_Sub1 local99 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[arg0] = new Class8_Sub2_Sub1_Sub2_Sub1();
			local99.anInt10768 = arg0;
			if (Static462.aClass2_Sub21Array1[arg0] != null) {
				local99.method1420(Static462.aClass2_Sub21Array1[arg0]);
			}
			local99.method9305(local91.anInt9352, true);
			local99.anInt10750 = local91.anInt9348;
			local127 = local91.anInt9350;
			local131 = local127 >> 28;
			local137 = local127 >> 14 & 0xFF;
			@Pc(141) int local141 = local127 & 0xFF;
			@Pc(149) int local149 = (local137 << 6) + (local45 - Static691.anInt10395);
			local99.aBoolean125 = local91.aBoolean713;
			@Pc(161) int local161 = (local141 << 6) + local50 - Static116.anInt2279;
			local99.aBoolean128 = local91.aBoolean712;
			local99.aByteArray111[0] = Static139.aByteArray30[arg0];
			local99.aByte144 = local99.aByte143 = (byte) local131;
			if (Static441.method5975(local161, local149)) {
				local99.aByte143++;
			}
			local99.method1419(local149, local161);
			local99.aBoolean127 = false;
			Static246.aClass352Array1[arg0] = null;
			return true;
		} else if (local18 == 1) {
			local45 = arg1.method7419(2);
			local50 = Static246.aClass352Array1[arg0].anInt9350;
			Static246.aClass352Array1[arg0].anInt9350 = (((local50 >> 28) + local45 & 0x3) << 28) + (local50 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(257) int local257;
			@Pc(262) int local262;
			@Pc(271) int local271;
			if (local18 != 2) {
				local45 = arg1.method7419(18);
				local50 = local45 >> 16;
				local257 = local45 >> 8 & 0xFF;
				local262 = local45 & 0xFF;
				local271 = Static246.aClass352Array1[arg0].anInt9350;
				local127 = local50 + (local271 >> 28) & 0x3;
				local131 = local257 + (local271 >> 14) & 0xFF;
				local137 = local271 + local262 & 0xFF;
				Static246.aClass352Array1[arg0].anInt9350 = local137 + (local131 << 14) + (local127 << 28);
				return false;
			}
			local45 = arg1.method7419(5);
			local50 = local45 >> 3;
			local257 = local45 & 0x7;
			local262 = Static246.aClass352Array1[arg0].anInt9350;
			local271 = (local262 >> 28) + local50 & 0x3;
			local127 = local262 >> 14 & 0xFF;
			local131 = local262 & 0xFF;
			if (local257 == 0) {
				local131--;
				local127--;
			}
			if (local257 == 1) {
				local131--;
			}
			if (local257 == 2) {
				local127++;
				local131--;
			}
			if (local257 == 3) {
				local127--;
			}
			if (local257 == 4) {
				local127++;
			}
			if (local257 == 5) {
				local127--;
				local131++;
			}
			if (local257 == 6) {
				local131++;
			}
			if (local257 == 7) {
				local127++;
				local131++;
			}
			Static246.aClass352Array1[arg0].anInt9350 = local131 + (local127 << 14) + (local271 << 28);
			return false;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)Z")
	public static boolean method5388(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static555.method7304(arg1, arg0) || Static519.method6839(0xFFFFFF9F ^ 0x5, arg1, arg0);
	}
}
