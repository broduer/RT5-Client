import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public abstract class Class120 {

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[16384];

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[16384];

	static {
		@Pc(70) double local70 = 3.834951969714103E-4D;
		for (@Pc(72) int local72 = 0; local72 < 16384; local72++) {
			aFloatArray79[local72] = (float) Math.sin(local70 * (double) local72);
			aFloatArray80[local72] = (float) Math.cos(local70 * (double) local72);
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class120() {
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
	public abstract void method6307();

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Z")
	public abstract boolean method6308();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
	public abstract boolean method6309();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Z")
	public final boolean method6310() {
		return this.method6308() || this.method6313() || this.method6309();
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Z")
	public abstract boolean method6313();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public abstract void method6314();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!bv;")
	public abstract Class2_Sub9 method6317();

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)I")
	public abstract int method6319();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I")
	public abstract int method6320();
}
