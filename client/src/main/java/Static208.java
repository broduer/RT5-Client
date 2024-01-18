import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gha", name = "u", descriptor = "Lclient!it;")
	public static final Class184 aClass184_6 = new Class184(11, 0, 1, 2);

	@OriginalMember(owner = "client!gha", name = "t", descriptor = "[Lclient!mj;")
	public static final Class245[] aClass245Array1 = new Class245[37];

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(IIIII)V")
	public static void method3105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static676.anInt10234;
		@Pc(7) int local7 = Static305.anInt4898;
		if (Static137.aBoolean210) {
			local5 += Static130.method2283();
			local7 += Static422.method5778();
		}
		@Pc(30) Class23 local30;
		if (Static616.anInt9443 == 1) {
			local30 = Static355.aClass23Array9[Static481.anInt7236 / 100];
			local30.method8209(local5 - 8, local7 + -8);
			Static682.method8934(local7 - 8, local7 - 8 - -local30.method8199(), local5 - 8, local30.method8210() + -8 + local5);
		}
		if (Static616.anInt9443 == 2) {
			local30 = Static355.aClass23Array9[Static481.anInt7236 / 100 + 4];
			local30.method8209(local5 - 8, local7 + -8);
			Static682.method8934(local7 - 8, local30.method8199() + -8 + local7, local5 - 8, local30.method8210() + local5 + -8);
		}
		Static494.method6604();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)V")
	public static void method3106() {
		Static334.aClass321_1.method8489();
		Static189.aClass120_1.method8855();
		client.instance.method1641();
		GameShell.canvas.setBackground(Color.black);
		Static470.anInt7133 = -1;
		Static334.aClass321_1 = Static681.method8928(GameShell.canvas);
		Static189.aClass120_1 = Static70.method1513(GameShell.canvas);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!eo;Z[[[BIB)Z")
	public static boolean method3107(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (!Static581.aBoolean658) {
			return false;
		}
		@Pc(9) int local9 = arg0.anInt10718 >> Static52.anInt1070;
		@Pc(11) int local11 = local9;
		@Pc(16) int local16 = arg0.anInt10722 >> Static52.anInt1070;
		@Pc(18) int local18 = local16;
		if (arg0 instanceof Class8_Sub2_Sub1) {
			local11 = ((Class8_Sub2_Sub1) arg0).aShort134;
			local18 = ((Class8_Sub2_Sub1) arg0).aShort133;
			local9 = ((Class8_Sub2_Sub1) arg0).aShort131;
			local16 = ((Class8_Sub2_Sub1) arg0).aShort132;
		}
		for (@Pc(39) int local39 = local9; local39 <= local11; local39++) {
			for (@Pc(42) int local42 = local16; local42 <= local18; local42++) {
				if (arg0.aByte143 < Static299.anInt4840 && local39 >= Static441.anInt6711 && local39 < Static77.anInt1620 && local42 >= Static220.anInt3572 && local42 < Static692.anInt10398) {
					if ((arg2 == null || arg0.aByte144 < arg3 || arg2[arg0.aByte144][local39][local42] != arg4) && arg0.method9282() && !arg0.method9291((byte) 59, Static665.aClass19_15)) {
						return false;
					}
					if (!arg1 && local39 >= Static403.anInt6266 - 16 && local39 <= Static403.anInt6266 + 16 && local42 >= Static550.anInt8294 - 16 && local42 <= Static550.anInt8294 + 16) {
						if (Static661.aBoolean457) {
							Static684.aClass304Array1[Static29.anInt704++].method6816(arg0);
							Static29.anInt704 %= Static549.anInt9450;
						} else {
							arg0.method9296(Static665.aClass19_15, -5);
						}
					}
				}
			}
		}
		return true;
	}
}
