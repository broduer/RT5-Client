import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public static int anInt3744;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_1 = new Class157(0, 3, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_2 = new Class157(1, 3, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_3 = new Class157(2, 4, Static702.aClass399_16);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_4 = new Class157(3, 1, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_5 = new Class157(4, 2, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_6 = new Class157(5, 3, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Lclient!hd;")
	public static final Class157 aClass157_7 = new Class157(6, 4, Static702.aClass399_20);

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public static final int anInt3743 = Static434.bitCount(16);

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_41 = new ClientProt(34, 4);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method3375() {
		if (Static163.aClass19_17 == null) {
			return;
		}
		if (Static137.aBoolean210) {
			Static164.method2606();
		}
		Static514.aClass215_2.method5017();
		Static563.method7468();
		Static244.method3512();
		Static329.method1649();
		Static638.method8400();
		Static65.method1472();
		Static81.method1589();
		Static352.method5187();
		Static203.method3068();
		Static143.method3572();
		Static668.method8707(false);
		for (@Pc(34) int local34 = 0; local34 < 2048; local34++) {
			@Pc(39) Class8_Sub2_Sub1_Sub2_Sub1 local39 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local34];
			if (local39 != null) {
				for (@Pc(43) int local43 = 0; local43 < local39.aClass114Array3.length; local43++) {
					local39.aClass114Array3[local43] = null;
				}
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static416.anInt6398; local65++) {
			@Pc(71) Class8_Sub2_Sub1_Sub2_Sub2 local71 = Static592.aClass2_Sub45Array1[local65].aClass8_Sub2_Sub1_Sub2_Sub2_2;
			if (local71 != null) {
				for (@Pc(75) int local75 = 0; local75 < local71.aClass114Array3.length; local75++) {
					local71.aClass114Array3[local75] = null;
				}
			}
		}
		Static59.aClass73_5 = null;
		Static460.aClass73_10 = null;
		Static163.aClass19_17.method7947();
		Static163.aClass19_17 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)Lclient!hd;")
	public static Class157 method3377(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return aClass157_1;
		} else if (arg0 == 1) {
			return aClass157_2;
		} else if (arg0 == 2) {
			return aClass157_3;
		} else if (arg0 == 3) {
			return aClass157_4;
		} else if (arg0 == 4) {
			return aClass157_5;
		} else if (arg0 == 5) {
			return aClass157_6;
		} else if (arg0 == 6) {
			return aClass157_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIII)V")
	public static void method3378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) SecondaryNode_Sub2 local9 = Static440.method5970(8, arg2);
		local9.method202();
		local9.anInt195 = arg3;
		local9.anInt192 = arg1;
		local9.anInt197 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3379(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZLjava/lang/String;B)V")
	public static void method3382(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static436.anInt3860 >= 100) {
			Static67.method6105(Static32.aClass32_39.getLocalization(client.lang));
			return;
		}
		@Pc(27) String local27 = Static390.method5499(arg1);
		if (local27 == null) {
			return;
		}
		@Pc(76) String local76;
		for (@Pc(33) int local33 = 0; local33 < Static436.anInt3860; local33++) {
			@Pc(40) String local40 = Static390.method5499(Static632.aStringArray44[local33]);
			if (local40 != null && local40.equals(local27)) {
				Static67.method6105(arg1 + Static32.aClass32_40.getLocalization(client.lang));
				return;
			}
			if (Static10.aStringArray1[local33] != null) {
				local76 = Static390.method5499(Static10.aStringArray1[local33]);
				if (local76 != null && local76.equals(local27)) {
					Static67.method6105(arg1 + Static32.aClass32_40.getLocalization(client.lang));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static327.anInt5411; local106++) {
			local76 = Static390.method5499(Static330.aStringArray25[local106]);
			if (local76 != null && local76.equals(local27)) {
				Static67.method6105(Static32.aClass32_45.getLocalization(client.lang) + arg1 + Static32.aClass32_46.getLocalization(client.lang));
				return;
			}
			if (Static572.aStringArray42[local106] != null) {
				@Pc(154) String local154 = Static390.method5499(Static572.aStringArray42[local106]);
				if (local154 != null && local154.equals(local27)) {
					Static67.method6105(Static32.aClass32_45.getLocalization(client.lang) + arg1 + Static32.aClass32_46.getLocalization(client.lang));
					return;
				}
			}
		}
		if (Static390.method5499(Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aString9).equals(local27)) {
			Static67.method6105(Static32.aClass32_42.getLocalization(client.lang));
			return;
		}
		@Pc(216) Class153 local216 = Static668.method8708();
		@Pc(222) Node_Sub19 local222 = Static293.method4342(Static113.aClass347_22, local216.aClass186_1);
		local222.aClass2_Sub21_Sub2_1.p1(method3379(arg1) + 1);
		local222.aClass2_Sub21_Sub2_1.pjstr(arg1);
		local222.aClass2_Sub21_Sub2_1.p1(arg0 ? 1 : 0);
		local216.method3275(local222);
	}
}
