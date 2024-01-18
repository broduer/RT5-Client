import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString96;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "Lclient!kda;")
	public static final Class206 aClass206_10 = new Class206(0, 1);

	@OriginalMember(owner = "client!qda", name = "x", descriptor = "Lclient!mia;")
	public static final Class244 aClass244_12 = new Class244("", 13);

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Lclient!nka;")
	public static final Class22 aClass22_1 = Static433.method5602();

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIIIILclient!ha;IIIIILclient!cba;)V")
	public static void method6806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) SecondaryNode_Sub4 arg10) {
		if (arg8 < arg5 && arg5 < arg1 + arg8 && arg2 - 13 < arg0 && arg0 < arg2 + 3) {
			arg6 = arg3;
		}
		@Pc(41) String local41 = Static192.method2874(arg10);
		Static180.aClass14_3.method8834(arg6, arg2, local41, arg8 + 3, Static186.aClass23Array5, Static460.anIntArray554);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BILclient!ha;III)V")
	public static void method6808(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg3, arg4, arg3 + arg0, arg2 + arg4);
		arg1.method7978(arg0, arg2, arg4, arg3, 0xFF000000);
		if (Static273.anInt4416 < 100) {
			return;
		}
		@Pc(44) float local44 = (float) Static30.anInt5664 / (float) Static30.anInt5670;
		@Pc(46) int local46 = arg0;
		@Pc(48) int local48 = arg2;
		if (local44 < 1.0F) {
			local48 = (int) (local44 * (float) arg0);
		} else {
			local46 = (int) ((float) arg2 / local44);
		}
		@Pc(75) int local75 = arg3 + (arg0 - local46) / 2;
		@Pc(84) int local84 = arg4 + (arg2 - local48) / 2;
		if (Static13.aClass23_4 == null || Static13.aClass23_4.method8206() != arg0 || Static13.aClass23_4.method8189() != arg2) {
			Static30.method5069(Static30.anInt5675, Static30.anInt5668 + Static30.anInt5664, Static30.anInt5670 + Static30.anInt5675, Static30.anInt5668, local75, local84, local75 + local46, local84 - -local48);
			Static30.method5067(arg1);
			Static13.aClass23_4 = arg1.method7971(local75, local84, local46, local48, false);
		}
		Static13.aClass23_4.method8209(local75, local84);
		@Pc(138) int local138 = local46 * Static329.anInt1757 / Static30.anInt5670;
		@Pc(144) int local144 = Static588.anInt8714 * local48 / Static30.anInt5664;
		@Pc(152) int local152 = Static534.anInt8134 * local46 / Static30.anInt5670 + local75;
		@Pc(166) int local166 = local48 + local84 - local144 - Static510.anInt7662 * local48 / Static30.anInt5664;
		@Pc(168) int local168 = -1996554240;
		if (client.game == Static723.aClass379_9) {
			local168 = -1996488705;
		}
		arg1.aa(local152, local166, local138, local144, local168, 1);
		arg1.method7983(local152, local166, local138, local144, local168, 0);
		if (Static320.anInt5101 <= 0) {
			return;
		}
		@Pc(202) int local202;
		if (Static212.anInt3477 > 50) {
			local202 = (100 - Static212.anInt3477) * 5;
		} else {
			local202 = Static212.anInt3477 * 5;
		}
		for (@Pc(213) MapElement local213 = (MapElement) Static30.aClass341_31.head(); local213 != null; local213 = (MapElement) Static30.aClass341_31.next()) {
			@Pc(221) MelType local221 = Static30.aClass248_3.method5591(local213.anInt3140);
			if (Static408.method5641(local221)) {
				@Pc(256) int local256;
				@Pc(269) int local269;
				if (Static475.anInt7189 == local213.anInt3140) {
					local256 = local75 + local213.anInt3138 * local46 / Static30.anInt5670;
					local269 = local84 + local48 * (Static30.anInt5664 - local213.anInt3133) / Static30.anInt5664;
					arg1.method7978(4, 4, local269 - 2, local256 - 2, local202 << 24 | 0xFFFF00);
				} else if (Static409.anInt6338 != -1 && Static409.anInt6338 == local221.anInt2606) {
					local256 = local75 + local46 * local213.anInt3138 / Static30.anInt5670;
					local269 = local84 + (Static30.anInt5664 - local213.anInt3133) * local48 / Static30.anInt5664;
					arg1.method7978(4, 4, local269 - 2, local256 + -2, local202 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZIII)V")
	public static void method6809(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static106.aClass28_11.get(arg1) != null) {
			return;
		}
		if (Static234.aBoolean303) {
			@Pc(34) Node_Sub5 local34 = new Node_Sub5(arg1, new Class224_Sub1(4096, client.js5Archive36, arg1), arg2, arg0);
			local34.aClass224_Sub1_1.method9190(Static384.aStringArray31[client.lang]);
			Static106.aClass28_11.put(arg1, local34);
		} else {
			Static635.method8387(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ge;B)Lclient!no;")
	public static Class160 method6810(@OriginalArg(0) Buffer arg0) {
		@Pc(15) int local15 = arg0.g2();
		@Pc(22) Class405 local22 = Static33.method882()[arg0.g1()];
		@Pc(29) Class103 local29 = Static313.method4551()[arg0.g1()];
		@Pc(35) int local35 = arg0.method7363();
		@Pc(39) int local39 = arg0.method7363();
		return new Class160(local15, local22, local29, local35, local39);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
	public static boolean method6811(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static77.method1560(arg0, arg1) || Static519.method6839(-97, arg1, arg0);
	}
}
