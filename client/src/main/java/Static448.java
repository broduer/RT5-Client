import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	public static int anInt6817;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public static int anInt6822;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIFFFIIFFLclient!tk;)[B")
	public static byte[] method6113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) Class59 arg10) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg7 * arg0];
		Static314.method4572(arg4, arg8, arg5, arg3, arg0, local10, arg7, arg9, arg2, arg10, arg1);
		return local10;
	}
}
