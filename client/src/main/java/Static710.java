import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static710 {

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_93 = new ClientProt(52, 8);

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
	public static int anInt7577 = 0;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "Lclient!wk;")
	public static final Class405 aClass405_13 = new Class405();

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!hda;Lclient!hda;)V")
	public static void method6717(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(15) Class2_Sub19 local15 = Static293.method4342(Static671.aClass347_117, Static405.aClass153_2.aClass186_1);
		local15.aClass2_Sub21_Sub2_1.p2(arg1.anInt3770);
		local15.aClass2_Sub21_Sub2_1.method7369(arg0.anInt3751);
		local15.aClass2_Sub21_Sub2_1.method7400(arg0.anInt3770);
		local15.aClass2_Sub21_Sub2_1.method7357(arg0.anInt3823);
		local15.aClass2_Sub21_Sub2_1.method7369(arg1.anInt3751);
		local15.aClass2_Sub21_Sub2_1.method7354(arg1.anInt3823);
		Static405.aClass153_2.method3275(local15);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public static void method6718() {
		for (@Pc(10) Class8_Sub1 local10 = (Class8_Sub1) Static149.aClass130_4.method2783(); local10 != null; local10 = (Class8_Sub1) Static149.aClass130_4.method2783()) {
			Static703.method9178(local10);
		}
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() == 1) {
			local36 = 0;
			local38 = 3;
		} else {
			local38 = Static164.anInt2817;
			local36 = Static164.anInt2817;
		}
		@Pc(56) int local56;
		if (Static1.anInt10827 == 3) {
			for (local56 = local36; local56 <= local38; local56++) {
				Static84.method1654(local56);
			}
			Static84.method1652();
			return;
		}
		Static84.method1655();
		for (local56 = local36; local56 <= local38; local56++) {
			Static84.method1665();
			Static84.method1670(local56);
			Static84.method1654(local56);
		}
		Static84.method1664();
		Static84.method1652();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)Z")
	public static boolean method6720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
