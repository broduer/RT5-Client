import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!ema", name = "k", descriptor = "I")
	public static int anInt2632;

	@OriginalMember(owner = "client!ema", name = "c", descriptor = "Lclient!fla;")
	public static final Class130 aClass130_4 = new Class130();

	@OriginalMember(owner = "client!ema", name = "i", descriptor = "I")
	public static final int anInt2639 = 1408;

	@OriginalMember(owner = "client!ema", name = "o", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2449(@OriginalArg(0) Class19 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (Static137.aBoolean210) {
			local5 = Static130.method2283();
			local7 = Static422.method5778();
		}
		@Pc(19) int local19 = Static71.anInt1583 + local5;
		@Pc(23) int local23 = local7 + Static84.anInt1783;
		@Pc(25) int local25 = Static682.anInt10323;
		@Pc(29) int local29 = Static407.anInt6308 - 3;
		@Pc(31) byte local31 = 20;
		Static87.method1693(Static682.anInt10323, Static407.anInt6308, Static32.aClass32_24.method877(client.lang), arg0, local7 + Static84.anInt1783, Static71.anInt1583 - -local5, local31);
		@Pc(55) int local55 = Static189.aClass120_1.method8860() + local5;
		@Pc(66) int local66 = local7 + Static189.aClass120_1.method8861();
		@Pc(70) int local70;
		@Pc(77) Class2_Sub2_Sub4 local77;
		@Pc(89) int local89;
		@Pc(202) int local202;
		@Pc(281) Class2_Sub2_Sub16 local281;
		@Pc(190) Class2_Sub2_Sub16 local190;
		if (Static236.aBoolean304) {
			local70 = 0;
			for (local77 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4359(); local77 != null; local77 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4357()) {
				local89 = local31 + local23 + local70 * 16 + 13;
				if (local55 > local5 + Static71.anInt1583 && local55 < local5 + Static71.anInt1583 + Static682.anInt10323 && local66 > local89 - 13 && local66 < local89 + 4 && (local77.anInt1541 > 1 || ((Class2_Sub2_Sub16) local77.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66).aBoolean552)) {
					arg0.aa(local5 + Static71.anInt1583, local89 + -12, Static682.anInt10323, 16, 255 - Static405.anInt6275 << 24 | Static183.anInt3031, 1);
				}
				local70++;
			}
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				Static87.method1693(Static85.anInt10703, Static25.anInt600, Static139.aClass2_Sub2_Sub4_1.aString10, arg0, Static493.anInt7385, Static692.anInt10403, local31);
				local70 = 0;
				for (local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass194_3.method4359(); local190 != null; local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass194_3.method4357()) {
					local202 = local31 + Static493.anInt7385 + local70 * 16 + 13;
					if (Static692.anInt10403 < local55 && Static692.anInt10403 + Static85.anInt10703 > local55 && local66 > local202 - 13 && local66 < local202 + 4 && local190.aBoolean552) {
						arg0.aa(Static692.anInt10403, local202 - 12, Static85.anInt10703, 16, 255 - Static405.anInt6275 << 24 | Static183.anInt3031, 1);
					}
					local70++;
				}
				Static292.method4611(Static493.anInt7385, arg0, Static692.anInt10403, Static85.anInt10703, local31, Static25.anInt600);
			}
		} else {
			local70 = 0;
			for (local281 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7706(65280); local281 != null; local281 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7713()) {
				local89 = (Static594.anInt8801 - local70 - 1) * 16 + local23 + local31 + 13;
				local70++;
				if (local5 + Static71.anInt1583 < local55 && local5 + Static71.anInt1583 + Static682.anInt10323 > local55 && local66 > local89 - 13 && local89 + 4 > local66 && local281.aBoolean552) {
					arg0.aa(local5 + Static71.anInt1583, local89 + -12, Static682.anInt10323, 16, Static183.anInt3031 | 255 - Static405.anInt6275 << 24, 1);
				}
			}
		}
		Static292.method4611(local7 + Static84.anInt1783, arg0, Static71.anInt1583 + local5, Static682.anInt10323, local31, Static407.anInt6308);
		if (Static236.aBoolean304) {
			local70 = 0;
			for (local77 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4359(); local77 != null; local77 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4357()) {
				local89 = local70 * 16 + local31 + local7 + Static84.anInt1783 + 13;
				if (local77.anInt1541 == 1) {
					Static232.method3387(arg0, Static682.anInt10323, Static407.anInt6308, Static84.anInt1783 + local7, local89, Static634.anInt9536 | 0xFF000000, (Class2_Sub2_Sub16) local77.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66, Static563.anInt8479 | 0xFF000000, local66, Static71.anInt1583 + local5, local55);
				} else {
					Static515.method6806(local66, Static682.anInt10323, local89, Static634.anInt9536 | 0xFF000000, arg0, local55, Static563.anInt8479 | 0xFF000000, local7 + Static84.anInt1783, local5 + Static71.anInt1583, Static407.anInt6308, local77);
				}
				local70++;
			}
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				local70 = 0;
				for (local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass194_3.method4359(); local190 != null; local190 = (Class2_Sub2_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass194_3.method4357()) {
					local202 = local31 + Static493.anInt7385 + local70 * 16 + 13;
					Static232.method3387(arg0, Static85.anInt10703, Static25.anInt600, Static493.anInt7385, local202, Static634.anInt9536 | 0xFF000000, local190, Static563.anInt8479 | 0xFF000000, local66, Static692.anInt10403, local55);
					local70++;
				}
				Static422.method5780(Static692.anInt10403, Static493.anInt7385, Static85.anInt10703, Static25.anInt600);
			}
		} else {
			local70 = 0;
			for (local281 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7706(65280); local281 != null; local281 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7713()) {
				local89 = local23 + local31 + (-local70 + -1 + Static594.anInt8801) * 16 + 13;
				local70++;
				Static232.method3387(arg0, local25, local29, local23, local89, Static634.anInt9536 | 0xFF000000, local281, Static563.anInt8479 | 0xFF000000, local66, local19, local55);
			}
		}
		Static422.method5780(Static71.anInt1583 + local5, Static84.anInt1783 - -local7, Static682.anInt10323, Static407.anInt6308);
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(I)V")
	public static void method2450() {
		Static186.aClass82_67.method2151();
	}
}
