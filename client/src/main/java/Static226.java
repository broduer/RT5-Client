import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static226 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "Lclient!pu;")
	public static Class67 aClass67_9;

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "[Lclient!bl;")
	public static Class46[] aClass46Array7;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "Lclient!sia;")
	public static final LinkedList aClass341_58 = new LinkedList();

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[Lclient!pm;")
	public static final Js5CachedResourceProvider[] aClass47_Sub1Array8 = new Js5CachedResourceProvider[37];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Canvas;IILclient!d;ILclient!sb;I)Lclient!ha;")
	public static synchronized Class19 method7989(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) TextureProvider arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Js5 arg5, @OriginalArg(7) int arg6) {
		if (arg4 == 0) {
			return Static643.method8450(arg6, arg3, arg1, arg0);
		} else if (arg4 == 2) {
			return Static587.method7705(arg3, arg6, arg1, arg0);
		} else if (arg4 == 1) {
			return Static206.method3093(arg3, arg0, arg2);
		} else if (arg4 == 5) {
			return Static256.method3637(arg2, arg5, arg3, arg0);
		} else if (arg4 == 3) {
			return Static733.method7625(arg5, arg2, arg3, arg0);
		} else {
			throw new IllegalArgumentException("UM");
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FIFF)F")
	public static float method8006(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg1 + (arg0 - arg1) * arg2;
	}
}
