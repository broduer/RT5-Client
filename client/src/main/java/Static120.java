import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "Lclient!sb;")
	public static Class332 aClass332_19;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILjava/lang/String;I)V")
	public static void method2193(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class158 local8 = Static15.method186(arg1, arg0);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray15 != null) {
			@Pc(19) Class2_Sub42 local19 = new Class2_Sub42();
			local19.anObjectArray36 = local8.anObjectArray15;
			local19.anInt7240 = arg3;
			local19.aString84 = arg2;
			local19.aClass158_14 = local8;
			Static472.method6427(local19);
		}
		if (Static283.anInt4588 != 11 || !Static84.method1661(local8).method6228(arg3 - 1)) {
			return;
		}
		@Pc(64) Class2_Sub19 local64;
		if (arg3 == 1) {
			local64 = Static293.method4342(Static546.aClass347_98, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local64, arg1);
			Static405.aClass153_2.method3275(local64);
		}
		if (arg3 == 2) {
			local64 = Static293.method4342(Static323.aClass347_65, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local64, arg1);
			Static405.aClass153_2.method3275(local64);
		}
		if (arg3 == 3) {
			local64 = Static293.method4342(Static255.aClass347_54, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local64, arg1);
			Static405.aClass153_2.method3275(local64);
		}
		@Pc(148) Class2_Sub19 local148;
		if (arg3 == 4) {
			local148 = Static293.method4342(Static710.aClass347_93, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 5) {
			local148 = Static293.method4342(Static693.aClass347_121, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 6) {
			local148 = Static293.method4342(Static126.aClass347_23, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 7) {
			local148 = Static293.method4342(Static358.aClass347_124, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 8) {
			local148 = Static293.method4342(Static700.aClass347_123, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 9) {
			local148 = Static293.method4342(Static372.aClass347_69, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
		if (arg3 == 10) {
			local148 = Static293.method4342(Static713.aClass347_125, Static405.aClass153_2.aClass186_1);
			Static277.method4040(arg0, local8.anInt3770, local148, arg1);
			Static405.aClass153_2.method3275(local148);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIJI)Ljava/lang/String;")
	public static String method2198(@OriginalArg(2) long arg0, @OriginalArg(3) int arg1) {
		Static356.method5203(arg0);
		@Pc(10) Calendar local10 = Static260.aCalendar1;
		@Pc(20) int local20 = local10.get(Calendar.DATE);
		@Pc(26) int local26 = local10.get(Calendar.MONTH) + 1;
		@Pc(38) int local38 = local10.get(Calendar.YEAR);
		@Pc(42) int local42 = local10.get(Calendar.HOUR_OF_DAY);
		@Pc(46) int local46 = local10.get(Calendar.MINUTE);
		return Integer.toString(local20 / 10) + local20 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local38 % 100 / 10 + local38 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
