import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static681 {

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "Lclient!lg;")
	public static Class226 aClass226_2;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[B)Z")
	public static boolean method8926(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Buffer local8 = new Buffer(arg0);
		@Pc(12) int local12 = local8.g1();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.g1() == 1;
		if (local30) {
			Static300.method4399(local8);
		}
		Static678.method8908(-1, local8);
		return true;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
	public static void method8927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) SecondaryNode_Sub2 local9 = Static440.method5970(16, arg0);
		local9.method202();
		local9.anInt197 = arg1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!rg;")
	public static Class321 method8928(@OriginalArg(1) Component arg0) {
		return new Keyboard(arg0);
	}
}
