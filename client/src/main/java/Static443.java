import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Lclient!gh;")
	public static final Class145 aClass145_1 = Static638.method8403();

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	public static void method5988() {
		if (Static377.anInt5950 == -1) {
			return;
		}
		@Pc(13) int local13 = Static189.aClass120_1.method8860();
		@Pc(22) int local22 = Static189.aClass120_1.method8861();
		@Pc(27) Class2_Sub9 local27 = (Class2_Sub9) Static226.aClass341_58.method7706(65280);
		if (local27 != null) {
			local13 = local27.method5338();
			local22 = local27.method5340();
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		if (Static137.aBoolean210) {
			local44 = Static130.method2283();
			local46 = Static422.method5778();
		}
		Static431.method5829(local46 + Static380.anInt5999, local46, local46, local22, local22 + local46, local44 + Static680.anInt10317, local44, Static377.anInt5950, local13, local44 + local13, local44);
		if (Static210.aClass158_4 != null) {
			Static509.method6766(local13 + local44, local22 - -local46);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!hda;II)Ljava/lang/String;")
	public static String method5989(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		if (!Static84.method1661(arg0).method6228(arg1) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aStringArray17 == null || arg1 >= arg0.aStringArray17.length || arg0.aStringArray17[arg1] == null || arg0.aStringArray17[arg1].trim().length() == 0) {
			return Static103.aBoolean195 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray17[arg1];
		}
	}
}
