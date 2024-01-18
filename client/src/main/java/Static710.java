import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static710 {

	@OriginalMember(owner = "client!wha", name = "e", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_93 = new Class345(52, 8);

	@OriginalMember(owner = "client!wha", name = "l", descriptor = "I")
	public static int anInt7554 = 0;

	@OriginalMember(owner = "client!wha", name = "h", descriptor = "Lclient!wk;")
	public static final Class403 aClass403_13 = new Class403();

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILclient!hda;Lclient!hda;)V")
	public static void method4723(@OriginalArg(1) Class158 arg0, @OriginalArg(2) Class158 arg1) {
		@Pc(15) Class2_Sub19 local15 = Static293.method3000(Static671.aClass345_117, Static405.aClass153_2.aClass186_1);
		local15.aClass2_Sub21_Sub2_1.method5182(arg1.anInt3760);
		local15.aClass2_Sub21_Sub2_1.method5171(arg0.anInt3741);
		local15.aClass2_Sub21_Sub2_1.method5202(arg0.anInt3760);
		local15.aClass2_Sub21_Sub2_1.method5159(arg0.anInt3812);
		local15.aClass2_Sub21_Sub2_1.method5171(arg1.anInt3741);
		local15.aClass2_Sub21_Sub2_1.method5156(arg1.anInt3812);
		Static405.aClass153_2.method2339(local15);
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
	public static void method4724() {
		for (@Pc(10) Class8_Sub1 local10 = (Class8_Sub1) Static149.aClass130_4.method1898(); local10 != null; local10 = (Class8_Sub1) Static149.aClass130_4.method1898()) {
			Static703.method6600(local10);
		}
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method4201() == 1) {
			local36 = 0;
			local38 = 3;
		} else {
			local38 = Static164.anInt2808;
			local36 = Static164.anInt2808;
		}
		@Pc(56) int local56;
		if (Static1.anInt10798 == 3) {
			for (local56 = local36; local56 <= local38; local56++) {
				Static84.method1074(local56);
			}
			Static84.method1072();
			return;
		}
		Static84.method1075();
		for (local56 = local36; local56 <= local38; local56++) {
			Static84.method1085();
			Static84.method1090(local56);
			Static84.method1074(local56);
		}
		Static84.method1084();
		Static84.method1072();
	}

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)Z")
	public static boolean method4726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
