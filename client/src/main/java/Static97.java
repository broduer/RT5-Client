import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static97 {

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
	public static int anInt2001 = 0;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(IZIIILclient!ha;II)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) Class19 arg3, @OriginalArg(7) int arg4) {
		arg3.a(arg4, arg2, arg0, (byte) 116, (int) arg1, -10660793);
		arg3.a(arg4 - 2, 16, arg0 + 1, (byte) 116, (int) (arg1 + 1), -16777216);
		arg3.a(arg0 + 18, -16777216, arg4 - 2, arg2 - 19, (byte) -78, arg1 + 1);
	}
}
