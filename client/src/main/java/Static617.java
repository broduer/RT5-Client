import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "[I")
	public static int[] anIntArray726;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	public static int anInt9460;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "Z")
	public static boolean aBoolean725 = false;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "[F")
	public static final float[] aFloatArray70 = new float[4];

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_224 = new Class227(111, 3);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[FZ)[F")
	public static float[] method8306(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(12) float[] local12 = new float[arg0];
		Static735.method7696(arg1, 0, local12, 0, arg0);
		return local12;
	}
}
