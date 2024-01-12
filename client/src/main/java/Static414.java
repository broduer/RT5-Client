import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;

public final class Static414 {

	@OriginalMember(owner = "client!nba", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!nba", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!nba", name = "i", descriptor = "Lclient!wp;")
	public static Class409 aClass409_2;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "[F")
	public static final float[] aFloatArray44 = new float[2];

	static {
		@Pc(63) String local63 = "Unknown";
		try {
			local63 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(71) Exception local71) {
		}
		local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(86) Exception local86) {
		}
		local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(101) Exception local101) {
		}
		aString70 = local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(116) Exception local116) {
		}
		aString69 = local63.toLowerCase();
		local63 = "Unknown";
		try {
			local63 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(131) Exception local131) {
		}
		local63.toLowerCase();
		local63 = "~/";
		try {
			local63 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(146) Exception local146) {
		}
		new File(local63);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZLclient!ca;I)V")
	public static void method5703(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg1) {
		if (Static594.anInt8801 >= 400) {
			return;
		}
		if (arg1 != Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2) {
			@Pc(177) String local177;
			if (arg1.anInt1443 == 0) {
				@Pc(63) boolean local63 = true;
				if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1478 != -1 && arg1.anInt1478 != -1) {
					@Pc(91) int local91 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1478 < arg1.anInt1478 ? Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1478 : arg1.anInt1478;
					@Pc(98) int local98 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451 - arg1.anInt1451;
					if (local98 < 0) {
						local98 = -local98;
					}
					if (local98 > local91) {
						local63 = false;
					}
				}
				@Pc(129) String local129 = Static723.aClass379_9 == Static392.aClass379_4 ? Static32.aClass32_30.method877(Static51.anInt1056) : Static32.aClass32_28.method877(Static51.anInt1056);
				if (arg1.anInt1451 >= arg1.anInt1444) {
					local177 = arg1.method1424(false) + (local63 ? Static693.method9016(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451, arg1.anInt1451) : "<col=ffffff>") + " (" + local129 + arg1.anInt1451 + ")";
				} else {
					local177 = arg1.method1424(false) + (local63 ? Static693.method9016(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451, arg1.anInt1451) : "<col=ffffff>") + " (" + local129 + arg1.anInt1451 + "+" + (arg1.anInt1444 - arg1.anInt1451) + ")";
				}
			} else if (arg1.anInt1443 == -1) {
				local177 = arg1.method1424(false);
			} else {
				local177 = arg1.method1424(false) + " (" + Static32.aClass32_29.method877(Static51.anInt1056) + arg1.anInt1443 + ")";
			}
			if (Static156.aBoolean223 && !arg0 && (Static717.anInt10851 & 0x8) != 0) {
				Static416.method5714(false, -1, (long) arg1.anInt10768, 0, 0, Static153.aString27, 44, true, Static369.anInt4275, Static128.aString108 + " -> <col=ffffff>" + local177, (long) arg1.anInt10768, false);
			}
			if (arg0) {
				Static416.method5714(true, 0, 0L, 0, 0, "<col=cccccc>" + local177, -1, false, -1, "", (long) arg1.anInt10768, false);
			} else {
				for (@Pc(318) int local318 = 7; local318 >= 0; local318--) {
					if (Static297.aStringArray24[local318] != null) {
						@Pc(325) short local325 = 0;
						if (Static392.aClass379_4 == Static673.aClass379_8 && Static297.aStringArray24[local318].equalsIgnoreCase(Static32.aClass32_23.method877(Static51.anInt1056))) {
							if (Static324.aBoolean388 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1451 < arg1.anInt1451) {
								local325 = 2000;
							}
							if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1440 == 0 || arg1.anInt1440 == 0) {
								if (arg1.aBoolean125) {
									local325 = 2000;
								}
							} else if (arg1.anInt1440 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt1440) {
								local325 = 2000;
							} else {
								local325 = 0;
							}
						} else if (Static601.aBooleanArray28[local318]) {
							local325 = 2000;
						}
						@Pc(403) short local403 = (short) (local325 + Static187.aShortArray52[local318]);
						@Pc(416) int local416 = Static147.anIntArray227[local318] == -1 ? Static39.anInt954 : Static147.anIntArray227[local318];
						Static416.method5714(false, -1, (long) arg1.anInt10768, 0, 0, Static297.aStringArray24[local318], local403, true, local416, "<col=ffffff>" + local177, (long) arg1.anInt10768, false);
					}
				}
			}
			if (!arg0) {
				for (@Pc(484) Class2_Sub2_Sub16 local484 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7706(65280); local484 != null; local484 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7713()) {
					if (local484.anInt7335 == 58) {
						local484.aString88 = "<col=ffffff>" + local177;
						return;
					}
				}
			}
		} else if (Static156.aBoolean223 && (Static717.anInt10851 & 0x10) != 0) {
			Static416.method5714(false, -1, 0L, 0, 0, Static153.aString27, 4, true, Static369.anInt4275, Static128.aString108 + " -> <col=ffffff>" + Static32.aClass32_37.method877(Static51.anInt1056), (long) arg1.anInt10768, false);
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V")
	public static void method5704(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static392.aClass379_4 == Static723.aClass379_9) {
			if (!Static147.method2419(0, arg0, 1, false, arg1, 0, -2, 1)) {
				Static147.method2419(0, arg0, 1, false, arg1, 0, -3, 1);
			}
		} else if (!Static147.method2419(0, arg0, 1, false, arg1, 0, -3, 1)) {
			Static147.method2419(0, arg0, 1, false, arg1, 0, -2, 1);
		}
	}
}
