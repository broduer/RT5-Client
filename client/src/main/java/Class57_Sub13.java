import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public final class Class57_Sub13 extends Class57 {

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub13(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		return Static140.method1565(super.aClass2_Sub34_34.aClass57_Sub29_1.method5612()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (super.aClass2_Sub34_34.aClass57_Sub29_1.method5610() && !Static140.method1565(super.aClass2_Sub34_34.aClass57_Sub29_1.method5612())) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 2) {
			super.anInt9489 = this.method5918();
		}
	}

	@OriginalMember(owner = "client!jha", name = "c", descriptor = "(B)Z")
	public boolean method3037() {
		return Static140.method1565(super.aClass2_Sub34_34.aClass57_Sub29_1.method5612());
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Z)I")
	public int method3038() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		return 0;
	}
}
