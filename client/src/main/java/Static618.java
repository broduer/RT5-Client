import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!tja", name = "B", descriptor = "I")
	public static int anInt9475;

	@OriginalMember(owner = "client!tja", name = "I", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_226 = new Class227(141, 2);

	@OriginalMember(owner = "client!tja", name = "G", descriptor = "Lclient!sia;")
	public static final Class341 aClass341_68 = new Class341();

	@OriginalMember(owner = "client!tja", name = "z", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_227 = new Class227(81, 12);

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(III)Z")
	public static boolean method8323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static335.method4953(arg2, arg1) | (arg1 & 0x60000) != 0 || Static69.method6340(arg1, arg2);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(BLclient!ge;)V")
	public static void method8324(@OriginalArg(1) Class2_Sub21 arg0) {
		if (arg0.aByteArray93.length - arg0.anInt8412 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method7403();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray93.length - arg0.anInt8412 < 2) {
			return;
		}
		@Pc(62) int local62 = arg0.method7389();
		if (local62 * 6 > arg0.aByteArray93.length - arg0.anInt8412) {
			return;
		}
		for (@Pc(80) int local80 = 0; local80 < local62; local80++) {
			@Pc(86) int local86 = arg0.method7389();
			@Pc(90) int local90 = arg0.method7356();
			if (local86 < Static511.anIntArray614.length && Static118.aBooleanArray4[local86] && (Static691.aClass212_1.method4954(local86).aChar5 != '1' || local90 >= -1 && local90 <= 1)) {
				Static511.anIntArray614[local86] = local90;
			}
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lclient!sb;IZIIIZ)V")
	public static void method8325(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= 0) {
			Static611.method8236(arg2, arg1, arg0);
			return;
		}
		Static24.anInt597 = arg1;
		Static96.anInt10199 = 1;
		Static676.aClass332_121 = arg0;
		Static497.aBoolean564 = false;
		Static117.aClass2_Sub6_Sub1_2 = null;
		Static99.anInt2086 = arg2;
		Static174.anInt2927 = 0;
		Static190.anInt3121 = Static581.aClass2_Sub6_Sub1_3.method948() / arg3;
		if (Static190.anInt3121 < 1) {
			Static190.anInt3121 = 1;
		}
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Lclient!rka;B)V")
	public static void method8326(@OriginalArg(0) Class2_Sub21_Sub2 arg0) {
		for (@Pc(10) int local10 = 0; local10 < Static652.anInt9739; local10++) {
			@Pc(18) int local18 = Static321.anIntArray388[local10];
			@Pc(22) Class8_Sub2_Sub1_Sub2_Sub1 local22 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local18];
			@Pc(26) int local26 = arg0.method7403();
			if ((local26 & 0x80) != 0) {
				local26 += arg0.method7403() << 8;
			}
			if ((local26 & 0x800) != 0) {
				local26 += arg0.method7403() << 16;
			}
			Static161.method2585(local22, local18, arg0, local26);
		}
		anInt9475++;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ILclient!ka;IIIIZLclient!ha;ILclient!gu;III)Lclient!ka;")
	public static Class114 method8327(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class19 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class152 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg1 == null) {
			return null;
		}
		@Pc(12) int local12 = 2055;
		if (arg8 != null) {
			local12 = arg8.method9108() | 0x807;
			local12 &= 0xFFFFFDFF;
		}
		@Pc(58) long local58 = ((long) arg3 << 48) + ((long) arg11 << 32) + (long) (arg5 + (arg7 << 16) + (arg0 << 24));
		@Pc(60) Class82 local60 = Static354.aClass82_120;
		@Pc(68) Class114 local68;
		synchronized (Static354.aClass82_120) {
			local68 = (Class114) Static354.aClass82_120.method2156(local58);
		}
		if (local68 == null || arg6.method7967(local68.ua(), local12) != 0) {
			if (local68 != null) {
				local12 = arg6.method8020(local12, local68.ua());
			}
			@Pc(106) byte local106;
			if (arg5 == 1) {
				local106 = 9;
			} else if (arg5 == 2) {
				local106 = 12;
			} else if (arg5 == 3) {
				local106 = 15;
			} else if (arg5 == 4) {
				local106 = 18;
			} else {
				local106 = 21;
			}
			@Pc(143) int[] local143 = new int[] { 64, 96, 128 };
			@Pc(162) Class88 local162 = new Class88(local106 * 3 + 1, -local106 + local106 * 6, 0);
			@Pc(169) int local169 = local162.method2230(0, 0, 0);
			@Pc(173) int[][] local173 = new int[3][local106];
			@Pc(181) int local181;
			@Pc(185) int local185;
			@Pc(187) int local187;
			@Pc(211) int local211;
			for (@Pc(175) int local175 = 0; local175 < 3; local175++) {
				local181 = local143[local175];
				local185 = local143[local175];
				for (local187 = 0; local187 < local106; local187++) {
					@Pc(195) int local195 = (local187 << 14) / local106;
					@Pc(203) int local203 = Class363.anIntArray741[local195] * local181 >> 14;
					local211 = local185 * Class363.anIntArray740[local195] >> 14;
					local173[local175][local187] = local162.method2230(local211, 0, local203);
				}
			}
			for (local181 = 0; local181 < 3; local181++) {
				local185 = (local181 * 256 + 128) / 3;
				local187 = 256 - local185;
				@Pc(265) byte local265 = (byte) (arg0 * local185 + arg7 * local187 >> 8);
				@Pc(310) short local310 = (short) ((local185 * (arg3 & 0x7F) + local187 * (arg11 & 0x7F) & 0x7F00) + ((arg11 & 0x380) * local187 + (arg3 & 0x380) * local185 & 0x38000) + ((arg11 & 0xFC00) * local187 + (arg3 & 0xFC00) * local185 & 0xFC0000) >> 8);
				for (local211 = 0; local211 < local106; local211++) {
					if (local181 == 0) {
						local162.method2231(local169, local173[0][local211], local173[0][(local211 + 1) % local106], local310, (short) -1, local265, (byte) 1, (byte) -1);
					} else {
						local162.method2231(local173[local181 - 1][local211], local173[local181][(local211 + 1) % local106], local173[local181 - 1][(local211 + 1) % local106], local310, (short) -1, local265, (byte) 1, (byte) -1);
						local162.method2231(local173[local181 - 1][local211], local173[local181][local211], local173[local181][(local211 + 1) % local106], local310, (short) -1, local265, (byte) 1, (byte) -1);
					}
				}
			}
			local68 = arg6.method7959(local162, local12, Static722.anInt10934, 64, 768);
			@Pc(440) Class82 local440 = Static354.aClass82_120;
			synchronized (Static354.aClass82_120) {
				Static354.aClass82_120.method2150(local68, local58);
			}
		}
		@Pc(456) int local456 = arg1.V();
		@Pc(459) int local459 = arg1.RA();
		@Pc(462) int local462 = arg1.HA();
		@Pc(465) int local465 = arg1.G();
		if (arg8 == null) {
			local68 = local68.method7502((byte) 3, local12, true);
			local68.O(local459 - local456 >> 1, 128, local465 - local462 >> 1);
			local68.H(local459 + local456 >> 1, 0, local465 + local462 >> 1);
		} else {
			local68 = local68.method7502((byte) 3, local12, true);
			local68.O(local459 - local456 >> 1, 128, local465 - local462 >> 1);
			local68.H(local459 + local456 >> 1, 0, local462 + local465 >> 1);
			arg8.method9112(local68);
		}
		if (arg9 != 0) {
			local68.FA(arg9);
		}
		if (arg2 != 0) {
			local68.VA(arg2);
		}
		if (arg4 != 0) {
			local68.H(0, arg4, 0);
		}
		return local68;
	}
}