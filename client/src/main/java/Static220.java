import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public static int anInt3572;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method3197(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBIII)V")
	public static void method3198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Node_Sub51 local6 = (Node_Sub51) Static460.aClass341_40.head(); local6 != null; local6 = (Node_Sub51) Static460.aClass341_40.next()) {
			Static632.method8373(arg0, local6, arg3, arg2, arg1);
		}
		if (-123 <= -127) {
			return;
		}
		@Pc(154) int local154;
		@Pc(198) boolean local198;
		for (@Pc(42) Node_Sub51 local42 = (Node_Sub51) Static717.aClass341_81.head(); local42 != null; local42 = (Node_Sub51) Static717.aClass341_81.next()) {
			@Pc(46) byte local46 = 1;
			@Pc(51) BasType local51 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.method9324();
			@Pc(57) int local57 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.aClass152_10.method9121();
			if (local57 == -1 || local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.aBoolean818) {
				local46 = 0;
			} else if (local57 == local51.anInt7247 || local57 == local51.anInt7262 || local57 == local51.anInt7281 || local51.anInt7261 == local57) {
				local46 = 2;
			} else if (local51.anInt7256 == local57 || local57 == local51.anInt7283 || local51.anInt7289 == local57 || local57 == local51.anInt7260) {
				local46 = 3;
			}
			if (local42.anInt9390 != local46) {
				local154 = Static497.method6636(local42.aClass8_Sub2_Sub1_Sub2_Sub2_3);
				@Pc(158) Class270 local158 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.aClass270_1;
				if (local158.anIntArray532 != null) {
					local158 = local158.method5992(65535, Static34.aClass306_1);
				}
				if (local158 == null || local154 == -1) {
					local42.anInt9390 = local46;
					local42.aBoolean715 = false;
					local42.anInt9379 = -1;
				} else if (local154 == local42.anInt9379 && local42.aBoolean715 == local158.aBoolean508) {
					local42.anInt9390 = local46;
					local42.anInt9384 = local158.anInt6741;
				} else {
					local198 = false;
					if (local42.aClass2_Sub6_Sub2_4 == null) {
						local198 = true;
					} else {
						local42.anInt9384 -= 512;
						if (local42.anInt9384 <= 0) {
							Static336.aClass2_Sub6_Sub3_1.method5890(local42.aClass2_Sub6_Sub2_4);
							local198 = true;
							local42.aClass2_Sub6_Sub2_4 = null;
						}
					}
					if (local198) {
						local42.aClass2_Sub53_3 = null;
						local42.aClass2_Sub49_Sub1_4 = null;
						local42.aBoolean715 = local158.aBoolean508;
						local42.anInt9384 = local158.anInt6741;
						local42.anInt9390 = local46;
						local42.anInt9379 = local154;
					}
				}
			}
			local42.anInt9383 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.anInt10718;
			local42.anInt9388 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.anInt10718 + (local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.method9309((byte) 53) << 8);
			local42.anInt9378 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.anInt10722;
			local42.anInt9375 = local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.anInt10722 + (local42.aClass8_Sub2_Sub1_Sub2_Sub2_3.method9309((byte) 68) << 8);
			Static632.method8373(arg0, local42, arg3, arg2, arg1);
		}
		for (@Pc(329) Node_Sub51 local329 = (Node_Sub51) Static113.aClass28_12.method736(); local329 != null; local329 = (Node_Sub51) Static113.aClass28_12.method740()) {
			@Pc(333) byte local333 = 1;
			@Pc(338) BasType local338 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.method9324();
			local154 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.aClass152_10.method9121();
			if (local154 == -1 || local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.aBoolean818) {
				local333 = 0;
			} else if (local154 == local338.anInt7247 || local154 == local338.anInt7262 || local338.anInt7281 == local154 || local154 == local338.anInt7261) {
				local333 = 2;
			} else if (local338.anInt7256 == local154 || local154 == local338.anInt7283 || local338.anInt7289 == local154 || local154 == local338.anInt7260) {
				local333 = 3;
			}
			if (local333 != local329.anInt9390) {
				@Pc(448) int local448 = Static326.method4877(local329.aClass8_Sub2_Sub1_Sub2_Sub1_3);
				if (local329.anInt9379 == local448 && local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.aBoolean126 == local329.aBoolean715) {
					local329.anInt9390 = local333;
					local329.anInt9384 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt1467;
				} else {
					local198 = false;
					if (local329.aClass2_Sub6_Sub2_4 == null) {
						local198 = true;
					} else {
						local329.anInt9384 -= 512;
						if (local329.anInt9384 <= 0) {
							Static336.aClass2_Sub6_Sub3_1.method5890(local329.aClass2_Sub6_Sub2_4);
							local329.aClass2_Sub6_Sub2_4 = null;
							local198 = true;
						}
					}
					if (local198) {
						local329.aBoolean715 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.aBoolean126;
						local329.anInt9379 = local448;
						local329.anInt9384 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt1467;
						local329.aClass2_Sub49_Sub1_4 = null;
						local329.anInt9390 = local333;
						local329.aClass2_Sub53_3 = null;
					}
				}
			}
			local329.anInt9383 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt10718;
			local329.anInt9388 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt10718 + (local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.method9309((byte) 127) << 8);
			local329.anInt9378 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt10722;
			local329.anInt9375 = local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.anInt10722 + (local329.aClass8_Sub2_Sub1_Sub2_Sub1_3.method9309((byte) 62) << 8);
			Static632.method8373(arg0, local329, arg3, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZIZI[Lclient!hda;I)V")
	public static void method3200(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class158[] arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = 0; local5 < arg3.length; local5++) {
			@Pc(14) Class158 local14 = arg3[local5];
			if (local14 != null && local14.anInt3753 == arg4) {
				Static507.method6750(arg1, arg2, arg0, local14);
				Static470.method6390(local14, arg0, arg2, -8525);
				if (local14.anInt3779 - local14.anInt3813 < local14.anInt3820) {
					local14.anInt3820 = local14.anInt3779 - local14.anInt3813;
				}
				if (local14.anInt3820 < 0) {
					local14.anInt3820 = 0;
				}
				if (local14.anInt3752 - local14.anInt3756 < local14.anInt3778) {
					local14.anInt3778 = local14.anInt3752 - local14.anInt3756;
				}
				if (local14.anInt3778 < 0) {
					local14.anInt3778 = 0;
				}
				if (local14.anInt3831 == 0) {
					Static134.method8963(local14, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!cd;Lclient!sb;Lclient!sb;Lclient!sb;ILclient!bd;)Z")
	public static boolean method3201(@OriginalArg(0) AudioChannel arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(5) MidiPcmStream arg4) {
		Static581.aClass2_Sub6_Sub1_3 = arg4;
		Static296.aClass332_61 = arg1;
		Static91.aClass332_117 = arg2;
		Static286.anIntArray358 = new int[16];
		Static426.aClass56_2 = arg0;
		Static86.aClass332_13 = arg3;
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static286.anIntArray358[local25] = 255;
		}
		return true;
	}
}
