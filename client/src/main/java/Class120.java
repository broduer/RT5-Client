import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public abstract class Class120 {

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[F")
	public static final float[] aFloatArray80 = new float[16384];

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "[F")
	public static final float[] aFloatArray81 = new float[16384];

	static {
		@Pc(70) double local70 = 3.834951969714103E-4D;
		for (@Pc(72) int local72 = 0; local72 < 16384; local72++) {
			aFloatArray80[local72] = (float) Math.sin(local70 * (double) local72);
			aFloatArray81[local72] = (float) Math.cos(local70 * (double) local72);
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class120() {
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
	public abstract void method8848();

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)Z")
	public abstract boolean method8849();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
	public abstract boolean method8850();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Z")
	public final boolean method8851() {
		return this.method8849() || this.method8854() || this.method8850();
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Z")
	public abstract boolean method8854();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public abstract void method8855();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lclient!bv;")
	public abstract Class2_Sub9 method8858();

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)I")
	public abstract int method8860();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)I")
	public abstract int method8861();
}
