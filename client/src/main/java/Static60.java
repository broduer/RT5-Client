import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!bw", name = "J", descriptor = "Lclient!nga;")
	public static final Class261 aClass261_3 = new Class261();

	@OriginalMember(owner = "client!bw", name = "Q", descriptor = "Z")
	public static boolean aBoolean86 = false;

	@OriginalMember(owner = "client!bw", name = "I", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!bw", name = "H", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method1292(@OriginalArg(1) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg0;
			return Static585.method7681(arg1, local14);
		} else if (arg0 instanceof Class175) {
			@Pc(32) Class175 local32 = (Class175) arg0;
			return local32.method3848(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZIII)V")
	public static void method1293(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922() == 0) {
			Static668.method8707(false);
		} else {
			Static114.anInt2265 = Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922();
			Static32.method880(0, true);
		}
		Static696.aBoolean785 = arg1;
		Static529.anInt8112 = arg2;
		Static227.anInt3704 = arg3;
		Static30.method5079(arg0);
		if (arg4 != -11493) {
			aBoolean86 = false;
		}
	}
}
