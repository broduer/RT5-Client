import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray8 = new boolean[8];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Lclient!vq;ZZ)V")
	public static void method3693(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) signlink arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		if (!arg4) {
			Static637.method8389(arg0, 3, arg2);
			return;
		}
		@Pc(31) String local31;
		if (signlink.osNameLower.startsWith("win") && arg2.aBoolean782) {
			local31 = null;
			if (signlink.mainapp != null) {
				local31 = signlink.mainapp.getParameter("haveie6");
			}
			if (local31 == null || !local31.equals("1")) {
				@Pc(53) PrivilegedRequest local53 = Static637.method8389(arg0, 0, arg2);
				Static272.sign = arg2;
				Static340.aString53 = arg0;
				Static236.aPrivilegedRequest_2 = local53;
				return;
			}
		}
		if (signlink.osNameLower.startsWith("mac")) {
			local31 = null;
			if (signlink.mainapp != null) {
				local31 = signlink.mainapp.getParameter("havefirefox");
			}
			if (local31 != null && local31.equals("1") && arg3) {
				Static36.method980(arg2, arg0, arg1, 1);
				return;
			}
		}
		Static637.method8389(arg0, 2, arg2);
	}
}
