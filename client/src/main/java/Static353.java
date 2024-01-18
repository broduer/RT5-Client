import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "Z")
	public static boolean aBoolean735 = false;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "[I")
	public static final int[] anIntArray748 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!ge;B)Lclient!fw;")
	public static Class138_Sub1_Sub1 method8437(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(7) Class138_Sub1 local7 = Static715.method9353(arg0);
		@Pc(20) int local20 = arg0.method7363();
		return new Class138_Sub1_Sub1(local7.aClass405_10, local7.aClass103_10, local7.anInt4436, local7.anInt4425, local7.anInt4431, local7.anInt4426, local7.anInt4429, local7.anInt4428, local7.anInt4434, local7.anInt3197, local7.anInt3199, local7.anInt3198, local7.anInt3194, local7.anInt3192, local7.anInt3191, local20);
	}
}
