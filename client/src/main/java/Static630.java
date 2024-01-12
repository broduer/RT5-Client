import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
	public static int anInt9520;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method8364(@OriginalArg(0) Class2_Sub2_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static246.aClass178Array1 != Static693.aClass178Array2) {
			@Pc(12) int local12 = Static706.aClass178Array3[arg1].method7885(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class178 local19 = Static706.aClass178Array3[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method7885(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method7881(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)V")
	public static void method8365() {
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() == 0 && Static164.anInt2817 != Static394.anInt6196) {
			Static684.method8938(false, Static62.anInt1472, 12, Static525.anInt8931);
		} else {
			Static106.method2046(Static163.aClass19_17);
			if (Static514.anInt7703 != Static394.anInt6196) {
				Static77.method1561();
			}
		}
	}
}
