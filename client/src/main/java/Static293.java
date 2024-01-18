import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!jfa", name = "Mb", descriptor = "Ljava/lang/Class;")
	private static Class aClass10;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!hma;)V")
	public static void method4339(@OriginalArg(1) Node_Sub25 arg0) {
		if (Static334.aClass293ArrayArrayArray1 == null) {
			return;
		}
		@Pc(9) Interface25 local9 = null;
		if (arg0.anInt4022 == 0) {
			local9 = (Interface25) Static302.method4421(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017);
		}
		if (arg0.anInt4022 == 1) {
			local9 = Static114.method2134(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017);
		}
		if (arg0.anInt4022 == 2) {
			local9 = (Interface25) Static578.method7630(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017, aClass10 == null ? (aClass10 = getClass("Interface25")) : aClass10);
		}
		if (arg0.anInt4022 == 3) {
			local9 = (Interface25) Static687.method8966(arg0.anInt4021, arg0.anInt4027, arg0.anInt4017);
		}
		if (local9 == null) {
			arg0.anInt4020 = 0;
			arg0.anInt4013 = -1;
			arg0.anInt4026 = 0;
		} else {
			arg0.anInt4013 = local9.method6866(-32136);
			arg0.anInt4020 = local9.method6865();
			arg0.anInt4026 = local9.method6862(23796);
		}
	}

	static Class getClass(String name) {
		Class instance;
		try {
			instance = Class.forName(name);
		} catch (ClassNotFoundException ex) {
			throw (NoClassDefFoundError) new NoClassDefFoundError().initCause(ex);
		}
		return instance;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(III)Z")
	public static boolean method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static139.method2358(arg0, arg1) | (arg0 & 0x2000) != 0 | Static401.method5582(arg0, arg1)) & Static279.method4074(arg1, arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!ss;Lclient!iv;)Lclient!fk;")
	public static Node_Sub19 method4342(@OriginalArg(1) ClientProt arg0, @OriginalArg(2) Class186 arg1) {
		@Pc(6) Node_Sub19 local6 = Static119.method2174();
		local6.anInt2995 = arg0.length;
		local6.aClass347_32 = arg0;
		if (local6.anInt2995 == -1) {
			local6.aClass2_Sub21_Sub2_1 = new Packet(260);
		} else if (local6.anInt2995 == -2) {
			local6.aClass2_Sub21_Sub2_1 = new Packet(10000);
		} else if (local6.anInt2995 <= 18) {
			local6.aClass2_Sub21_Sub2_1 = new Packet(20);
		} else if (local6.anInt2995 <= 98) {
			local6.aClass2_Sub21_Sub2_1 = new Packet(100);
		} else {
			local6.aClass2_Sub21_Sub2_1 = new Packet(260);
		}
		local6.aClass2_Sub21_Sub2_1.method7429(arg1);
		local6.aClass2_Sub21_Sub2_1.method7425(local6.aClass347_32.getOpcode());
		local6.anInt2998 = 0;
		return local6;
	}
}
