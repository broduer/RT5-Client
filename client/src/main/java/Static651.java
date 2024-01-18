import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static651 {

	@OriginalMember(owner = "client!uja", name = "j", descriptor = "Lclient!rt;")
	public static WorldMapFont aClass329_8;

	@OriginalMember(owner = "client!uja", name = "p", descriptor = "[Lclient!gaa;")
	public static Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(BILclient!ha;)Lclient!st;")
	public static Class23 method8519(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(18) Node_Sub5 local18 = (Node_Sub5) Static106.aClass28_11.get(arg0);
		if (local18 != null) {
			@Pc(25) Node_Sub28_Sub3 local25 = local18.aClass224_Sub1_1.method9194();
			local18.aBoolean18 = true;
			if (local25 != null) {
				return local25.method5498(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IIIILclient!cg;)V")
	public static void method8520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class8_Sub2_Sub1_Sub2 arg3) {
		@Pc(9) BasType local9 = arg3.method9324();
		@Pc(19) Class152 local19 = arg3.aClass152_10;
		@Pc(29) int local29 = arg3.anInt10785 - arg3.aClass126_7.anInt2898 & 0x3FFF;
		if (arg0 == -1) {
			if (local29 == 0 && arg3.anInt10778 <= 25) {
				if (!arg3.aBoolean818 || !local9.method6486(local19.method9121())) {
					local19.method9120(true, local9.method6484());
					arg3.aBoolean818 = local19.method9116();
				}
			} else if (arg1 < 0 && local9.anInt7285 != -1) {
				local19.method9120(true, local9.anInt7285);
				arg3.aBoolean818 = false;
			} else if (arg1 > 0 && local9.anInt7264 != -1) {
				local19.method9120(true, local9.anInt7264);
				arg3.aBoolean818 = false;
			} else if (!arg3.aBoolean818 || !local9.method6486(local19.method9121())) {
				local19.method9120(true, local9.method6484());
				arg3.aBoolean818 = arg3.aClass152_10.method9116();
			}
		} else if (arg3.anInt10750 != -1 && (local29 >= 10240 || local29 <= 2048)) {
			@Pc(172) int local172 = Static464.anIntArray561[arg2] - arg3.aClass126_7.anInt2898 & 0x3FFF;
			if (arg0 == 2 && local9.anInt7247 != -1) {
				if (local172 > 2048 && local172 <= 6144 && local9.anInt7281 != -1) {
					local19.method9120(true, local9.anInt7281);
				} else if (local172 >= 10240 && local172 < 14336 && local9.anInt7261 != -1) {
					local19.method9120(true, local9.anInt7261);
				} else if (local172 <= 6144 || local172 >= 10240 || local9.anInt7262 == -1) {
					local19.method9120(true, local9.anInt7247);
				} else {
					local19.method9120(true, local9.anInt7262);
				}
			} else if (arg0 == 0 && local9.anInt7256 != -1) {
				if (local172 > 2048 && local172 <= 6144 && local9.anInt7289 != -1) {
					local19.method9120(true, local9.anInt7289);
				} else if (local172 >= 10240 && local172 < 14336 && local9.anInt7260 != -1) {
					local19.method9120(true, local9.anInt7260);
				} else if (local172 <= 6144 || local172 >= 10240 || local9.anInt7283 == -1) {
					local19.method9120(true, local9.anInt7256);
				} else {
					local19.method9120(true, local9.anInt7283);
				}
			} else if (local172 > 2048 && local172 <= 6144 && local9.anInt7275 != -1) {
				local19.method9120(true, local9.anInt7275);
			} else if (local172 >= 10240 && local172 < 14336 && local9.anInt7287 != -1) {
				local19.method9120(true, local9.anInt7287);
			} else if (local172 <= 6144 || local172 >= 10240 || local9.anInt7274 == -1) {
				local19.method9120(true, local9.anInt7266);
			} else {
				local19.method9120(true, local9.anInt7274);
			}
			arg3.aBoolean818 = false;
		} else if (local29 == 0 && arg3.anInt10778 <= 25) {
			if (arg0 == 2 && local9.anInt7247 != -1) {
				local19.method9120(true, local9.anInt7247);
			} else if (arg0 == 0 && local9.anInt7256 != -1) {
				local19.method9120(true, local9.anInt7256);
			} else {
				local19.method9120(true, local9.anInt7266);
			}
			arg3.aBoolean818 = false;
		} else {
			if (arg0 == 2 && local9.anInt7247 != -1) {
				if (arg1 < 0 && local9.anInt7270 != -1) {
					local19.method9120(true, local9.anInt7270);
				} else if (arg1 <= 0 || local9.anInt7248 == -1) {
					local19.method9120(true, local9.anInt7247);
				} else {
					local19.method9120(true, local9.anInt7248);
				}
			} else if (arg0 == 0 && local9.anInt7256 != -1) {
				if (arg1 < 0 && local9.anInt7265 != -1) {
					local19.method9120(true, local9.anInt7265);
				} else if (arg1 <= 0 || local9.anInt7254 == -1) {
					local19.method9120(true, local9.anInt7256);
				} else {
					local19.method9120(true, local9.anInt7254);
				}
			} else if (arg1 < 0 && local9.anInt7284 != -1) {
				local19.method9120(true, local9.anInt7284);
			} else if (arg1 <= 0 || local9.anInt7290 == -1) {
				local19.method9120(true, local9.anInt7266);
			} else {
				local19.method9120(true, local9.anInt7290);
			}
			arg3.aBoolean818 = false;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "([IIZLclient!cg;I)V")
	public static void method8522(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class8_Sub2_Sub1_Sub2 arg3) {
		@Pc(8) boolean local8;
		@Pc(10) int local10;
		if (arg3.anIntArray869 != null) {
			local8 = true;
			for (local10 = 0; local10 < arg3.anIntArray869.length; local10++) {
				if (arg0[local10] != arg3.anIntArray869[local10]) {
					local8 = false;
					break;
				}
			}
			@Pc(31) Class152 local31 = arg3.aClass152_11;
			if (local8 && local31.method9116()) {
				@Pc(44) SeqType local44 = arg3.aClass152_11.method9114();
				@Pc(47) int local47 = local44.anInt1653;
				if (local47 == 1) {
					local31.method9100(arg1);
				}
				if (local47 == 2) {
					local31.method9122();
				}
			}
		}
		local8 = true;
		for (local10 = 0; local10 < arg0.length; local10++) {
			if (arg0[local10] != -1) {
				local8 = false;
			}
			if (arg3.anIntArray869 == null || arg3.anIntArray869[local10] == -1 || client.seqTypeList.method1162(arg0[local10]).anInt1656 >= client.seqTypeList.method1162(arg3.anIntArray869[local10]).anInt1656) {
				arg3.anIntArray869 = arg0;
				arg3.aClass152_11.method9098(arg1);
				if (arg2) {
					arg3.anInt10791 = arg3.anInt10793;
				}
			}
		}
		if (!local8) {
			return;
		}
		arg3.anIntArray869 = arg0;
		arg3.aClass152_11.method9098(arg1);
		if (arg2) {
			arg3.anInt10791 = arg3.anInt10793;
			return;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)Z")
	public static boolean method8523() {
		return Static14.method179("jaclib") ? Static14.method179("hw3d") : false;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IZLclient!wj;)V")
	public static void method8524(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class8_Sub2_Sub1_Sub2_Sub2 arg1) {
		if (Static594.anInt8801 >= 400) {
			return;
		}
		@Pc(21) Class270 local21 = arg1.aClass270_1;
		@Pc(24) String local24 = arg1.aString128;
		if (local21.anIntArray532 != null) {
			local21 = local21.method5992(65535, Static34.aClass306_1);
			if (local21 == null) {
				return;
			}
			local24 = local21.aString73;
		}
		if (!local21.aBoolean505) {
			return;
		}
		if (arg1.anInt10820 != 0) {
			@Pc(67) String local67 = Static723.aClass379_9 == client.game ? Static32.aClass32_30.getLocalization(client.lang) : Static32.aClass32_28.getLocalization(client.lang);
			local24 = local24 + Static693.method9016(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451, arg1.anInt10820) + " (" + local67 + arg1.anInt10820 + ")";
		}
		if (Static156.aBoolean223 && !arg0) {
			@Pc(113) ParamType local113 = Static610.anInt9355 == -1 ? null : client.paramTypeList.method1161(Static610.anInt9355);
			if ((Static717.anInt10851 & 0x2) != 0 && (local113 == null || local21.method6002(Static610.anInt9355, local113.anInt7532) != local113.anInt7532)) {
				Static416.method5714(false, -1, arg1.anInt10768, 0, 0, Static153.aString27, 23, true, Static369.anInt4275, Static128.aString108 + " -> <col=ffff00>" + local24, arg1.anInt10768, false);
			}
		}
		if (arg0) {
			return;
		}
		@Pc(176) String[] local176 = local21.aStringArray34;
		if (Static187.aBoolean255) {
			local176 = Static246.method3522(local176);
		}
		if (local176 == null) {
			return;
		}
		for (@Pc(189) int local189 = local176.length - 1; local189 >= 0; local189--) {
			if (local176[local189] != null && (local21.aByte107 == 0 || !local176[local189].equalsIgnoreCase(Static32.aClass32_23.getLocalization(client.lang)) && !local176[local189].equalsIgnoreCase(Static32.aClass32_22.getLocalization(client.lang)))) {
				@Pc(226) short local226 = 0;
				@Pc(228) int local228 = Static39.anInt954;
				if (local189 == 0) {
					local226 = 49;
				}
				if (local189 == 1) {
					local226 = 59;
				}
				if (local189 == 2) {
					local226 = 47;
				}
				if (local189 == 3) {
					local226 = 57;
				}
				if (local189 == 4) {
					local226 = 3;
				}
				if (local189 == 5) {
					local226 = 1011;
				}
				if (local189 == local21.anInt6736) {
					local228 = local21.anInt6759;
				}
				if (local21.anInt6757 == local189) {
					local228 = local21.anInt6773;
				}
				Static416.method5714(false, -1, arg1.anInt10768, 0, 0, local176[local189], local226, true, local176[local189].equalsIgnoreCase(Static32.aClass32_23.getLocalization(client.lang)) ? local21.anInt6760 : local228, "<col=ffff00>" + local24, arg1.anInt10768, false);
			}
		}
		if (local21.aByte107 != 1) {
			return;
		}
		for (@Pc(341) int local341 = 0; local341 < local176.length; local341++) {
			if (local176[local341] != null && (local176[local341].equalsIgnoreCase(Static32.aClass32_23.getLocalization(client.lang)) || local176[local341].equalsIgnoreCase(Static32.aClass32_22.getLocalization(client.lang)))) {
				@Pc(372) short local372 = 0;
				if (arg1.anInt10820 > Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451) {
					local372 = 2000;
				}
				@Pc(385) short local385 = 0;
				@Pc(387) int local387 = Static39.anInt954;
				if (local341 == 0) {
					local385 = 49;
				}
				if (local341 == 1) {
					local385 = 59;
				}
				if (local341 == 2) {
					local385 = 47;
				}
				if (local341 == 3) {
					local385 = 57;
				}
				if (local341 == 4) {
					local385 = 3;
				}
				if (local341 == 5) {
					local385 = 1011;
				}
				if (local21.anInt6736 == local341) {
					local387 = local21.anInt6759;
				}
				if (local385 != 0) {
					local385 += local372;
				}
				if (local21.anInt6757 == local341) {
					local387 = local21.anInt6773;
				}
				Static416.method5714(false, -1, arg1.anInt10768, 0, 0, local176[local341], local385, true, local176[local341].equalsIgnoreCase(Static32.aClass32_23.getLocalization(client.lang)) ? local21.anInt6760 : local387, "<col=ffff00>" + local24, arg1.anInt10768, false);
			}
		}
		return;
	}
}
