import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!pg;")
	public static SecondaryNode_Sub16 aClass2_Sub2_Sub16_13;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt10199 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
	public static void method8826(@OriginalArg(1) int arg0) {
		@Pc(18) SecondaryNode_Sub2 local18 = Static440.method5970(4, arg0);
		local18.method205();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIB)V")
	public static void method8842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static111.anInt2228 = arg1;
		Static273.anInt4408 = arg0;
		Static180.anInt3004 = 0;
		Static724.anInt10959 = 0;
	}
}
