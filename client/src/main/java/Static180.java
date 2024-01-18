import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!fka", name = "l", descriptor = "Lclient!da;")
	public static Class14 aClass14_3;

	@OriginalMember(owner = "client!fka", name = "o", descriptor = "Lclient!wk;")
	public static Class405 aClass405_3;

	@OriginalMember(owner = "client!fka", name = "q", descriptor = "I")
	public static int anInt3004 = 0;

	@OriginalMember(owner = "client!fka", name = "j", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_33 = new ClientProt(2, 7);

	@OriginalMember(owner = "client!fka", name = "n", descriptor = "J")
	public static long aLong108 = -1L;

	@OriginalMember(owner = "client!fka", name = "g", descriptor = "I")
	public static int anInt3010 = -1;

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)V")
	public static void method2775(@OriginalArg(1) int arg0) {
		if (Static45.aClass2_Sub47_1 == null || (arg0 < 0 || arg0 >= Static45.aClass2_Sub47_1.anInt8309)) {
			return;
		}
		@Pc(29) Class34 local29 = Static45.aClass2_Sub47_1.aClass34Array1[arg0];
		if (local29.aByte9 != -1) {
			return;
		}
		@Pc(45) Class153 local45 = Static668.method8708();
		@Pc(53) Node_Sub19 local53 = Static293.method4342(Static507.aClass347_95, local45.aClass186_1);
		local53.aClass2_Sub21_Sub2_1.p1(Static231.method3379(local29.aString2) + 2);
		local53.aClass2_Sub21_Sub2_1.p2(arg0);
		local53.aClass2_Sub21_Sub2_1.pjstr(local29.aString2);
		local45.method3275(local53);
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIBIII)V")
	public static void method2776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg3) {
			Static142.method2379(arg2, arg1, arg4, arg3);
		} else if (arg4 - arg3 >= anInt3004 && arg3 + arg4 <= Static111.anInt2228 && Static724.anInt10959 <= arg2 - arg0 && Static273.anInt4408 >= arg2 + arg0) {
			Static211.method5007(arg2, arg0, arg3, arg1, arg4);
		} else {
			Static619.method1508(arg2, arg3, arg0, arg4, arg1);
		}
	}
}
