import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "Lclient!gh;")
	public static final Class145 aClass145_1 = Static638.method5960();

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)V")
	public static void method4217() {
		if (Static377.anInt5930 == -1) {
			return;
		}
		@Pc(13) int local13 = Static189.aClass120_1.method6319();
		@Pc(22) int local22 = Static189.aClass120_1.method6320();
		@Pc(27) Class2_Sub9 local27 = (Class2_Sub9) Static226.aClass339_58.method5453(65280);
		if (local27 != null) {
			local13 = local27.method3778();
			local22 = local27.method3780();
		}
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		if (Static137.aBoolean210) {
			local44 = Static130.method1486();
			local46 = Static422.method4077();
		}
		Static431.method4128(local46 + Static380.anInt5979, local46, local46, local22, local22 + local46, local44 + Static680.anInt10289, local44, Static377.anInt5930, local13, local44 + local13, local44);
		if (Static210.aClass158_4 != null) {
			Static509.method4757(local13 + local44, local22 - -local46);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!hda;II)Ljava/lang/String;")
	public static String method4218(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		if (!Static84.method1081(arg0).method4325(arg1) && arg0.anObjectArray15 == null) {
			return null;
		} else if (arg0.aStringArray17 == null || arg1 >= arg0.aStringArray17.length || arg0.aStringArray17[arg1] == null || arg0.aStringArray17[arg1].trim().length() == 0) {
			return Static103.aBoolean195 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray17[arg1];
		}
	}
}
