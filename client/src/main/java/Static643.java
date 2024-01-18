import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	public static int anInt9630 = -1;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
	public static boolean method8449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static710.method6720(arg1, arg0) || Static286.method4110(arg1, arg0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!d;ILjava/awt/Canvas;)Lclient!ha;")
	public static Class19 method8450(@OriginalArg(0) int arg0, @OriginalArg(2) TextureProvider arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new Class19_Sub2(arg3, arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[Lclient!hda;)V")
	public static void method8451(@OriginalArg(1) int arg0, @OriginalArg(2) Class158[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class158 local9 = arg1[local3];
			if (local9 != null && local9.anInt3753 == arg0 && !Static84.method1660(local9)) {
				if (local9.anInt3831 == 0) {
					method8451(local9.anInt3823, arg1);
					if (local9.aClass158Array1 != null) {
						method8451(local9.anInt3823, local9.aClass158Array1);
					}
					@Pc(56) Node_Sub4 local56 = (Node_Sub4) Static548.aClass28_40.get(local9.anInt3823);
					if (local56 != null) {
						Static26.method716(local56.anInt147);
					}
				}
				if (local9.anInt3831 == 6 && local9.anInt3799 != -1) {
					if (local9.aClass152_6 == null) {
						local9.aClass152_6 = new Class152_Sub1();
						local9.aClass152_6.method9120(true, local9.anInt3799);
					}
					if (local9.aClass152_6.method9119(Static35.anInt803) && local9.aClass152_6.method9109()) {
						local9.aClass152_6.method9106();
					}
				}
			}
		}
	}
}
