import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static679 {

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
	public static int anInt10301;

	@OriginalMember(owner = "client!vj", name = "E", descriptor = "[Lclient!qf;")
	public static Class8_Sub2_Sub1[] aClass8_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
	public static int anInt10306;

	@OriginalMember(owner = "client!vj", name = "H", descriptor = "[Lclient!oga;")
	public static Class275[] aClass275Array1;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array14;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Lclient!eba;")
	public static final Class92 aClass92_15 = new Class92(1);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)I")
	public static int method8916() {
		if (Static109.aClass158_3 == null) {
			if (!Static400.aBoolean623 && Static470.aClass2_Sub2_Sub16_10 != null) {
				return Static470.aClass2_Sub2_Sub16_10.anInt7339;
			}
			@Pc(28) int local28 = Static189.aClass120_1.method8860();
			@Pc(37) int local37 = Static189.aClass120_1.method8861();
			@Pc(53) int local53;
			@Pc(55) int local55;
			@Pc(71) int local71;
			@Pc(134) Class2_Sub2_Sub16 local134;
			if (Static236.aBoolean304) {
				@Pc(262) Class301 local262;
				if (Static71.anInt1583 < local28 && Static71.anInt1583 + Static682.anInt10323 > local28) {
					local53 = -1;
					for (local55 = 0; local55 < Static31.anInt770; local55++) {
						if (Static60.aBoolean87) {
							local71 = Static84.anInt1783 + local55 * 16 + 33;
							if (local37 > local71 - 13 && local37 <= local71 + 3) {
								local53 = local55;
							}
						} else {
							local71 = Static84.anInt1783 + local55 * 16 + 31;
							if (local37 > local71 - 13 && local71 + 3 >= local37) {
								local53 = local55;
							}
						}
					}
					if (local53 != -1) {
						local71 = 0;
						local262 = new Class301(Static350.aClass194_8);
						for (@Pc(368) Class2_Sub2_Sub4 local368 = (Class2_Sub2_Sub4) local262.method6731(); local368 != null; local368 = (Class2_Sub2_Sub4) local262.method6730()) {
							if (local71++ == local53) {
								return ((Class2_Sub2_Sub16) local368.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66).anInt7339;
							}
						}
					}
				} else if (Static139.aClass2_Sub2_Sub4_1 != null && Static692.anInt10403 < local28 && local28 < Static85.anInt10703 + Static692.anInt10403) {
					local53 = -1;
					for (local55 = 0; local55 < Static139.aClass2_Sub2_Sub4_1.anInt1541; local55++) {
						if (Static60.aBoolean87) {
							local71 = local55 * 16 + Static493.anInt7385 + 33;
							if (local71 - 13 < local37 && local71 + 3 >= local37) {
								local53 = local55;
							}
						} else {
							local71 = Static493.anInt7385 + local55 * 16 + 31;
							if (local37 > local71 - 13 && local37 <= local71 + 3) {
								local53 = local55;
							}
						}
					}
					if (local53 != -1) {
						local71 = 0;
						local262 = new Class301(Static139.aClass2_Sub2_Sub4_1.aClass194_3);
						for (local134 = (Class2_Sub2_Sub16) local262.method6731(); local134 != null; local134 = (Class2_Sub2_Sub16) local262.method6730()) {
							if (local71++ == local53) {
								return local134.anInt7339;
							}
						}
					}
				}
			} else if (local28 > Static71.anInt1583 && Static71.anInt1583 + Static682.anInt10323 > local28) {
				local53 = -1;
				for (local55 = 0; local55 < Static594.anInt8801; local55++) {
					if (Static60.aBoolean87) {
						local71 = (Static594.anInt8801 - local55 - 1) * 16 + Static84.anInt1783 + 33;
						if (local37 > local71 - 13 && local71 + 3 >= local37) {
							local53 = local55;
						}
					} else {
						local71 = Static84.anInt1783 + (-local55 + Static594.anInt8801 + -1) * 16 + 31;
						if (local37 > local71 - 13 && local71 + 3 >= local37) {
							local53 = local55;
						}
					}
				}
				if (local53 != -1) {
					local71 = 0;
					@Pc(129) Class193 local129 = new Class193(Static693.aClass341_79);
					for (local134 = (Class2_Sub2_Sub16) local129.method4350(); local134 != null; local134 = (Class2_Sub2_Sub16) local129.method4349()) {
						if (local53 == local71++) {
							return local134.anInt7339;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ILclient!pg;)V")
	public static void method8918(@OriginalArg(1) Class2_Sub2_Sub16 arg0) {
		if (Static400.aBoolean623) {
			return;
		}
		arg0.method9464();
		Static594.anInt8801--;
		if (!arg0.aBoolean551) {
			@Pc(79) long local79 = arg0.aLong234;
			@Pc(85) Class2_Sub2_Sub4 local85;
			for (local85 = (Class2_Sub2_Sub4) Static490.aClass28_34.method738(local79); local85 != null && !local85.aString10.equals(arg0.aString86); local85 = (Class2_Sub2_Sub4) Static490.aClass28_34.method744()) {
			}
			if (local85 != null && local85.method1469(arg0)) {
				Static385.method5431(local85);
			}
			return;
		}
		for (@Pc(22) Class2_Sub2_Sub4 local22 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4359(); local22 != null; local22 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4357()) {
			if (local22.aString10.equals(arg0.aString86)) {
				@Pc(31) boolean local31 = false;
				for (@Pc(37) Class2_Sub2_Sub16 local37 = (Class2_Sub2_Sub16) local22.aClass194_3.method4359(); local37 != null; local37 = (Class2_Sub2_Sub16) local22.aClass194_3.method4357()) {
					if (local37 == arg0) {
						local31 = true;
						if (local22.method1469(arg0)) {
							Static385.method5431(local22);
						}
						break;
					}
				}
				if (local31) {
					break;
				}
			}
		}
	}
}
