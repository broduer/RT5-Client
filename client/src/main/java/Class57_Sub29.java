import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Class57_Sub29 extends Class57 {

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "Z")
	public boolean aBoolean674 = false;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Z")
	private boolean aBoolean675 = true;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub29(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z")
	public boolean method5610() {
		return this.aBoolean675;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)I")
	public int method5612() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (!super.aClass2_Sub34_34.method3580().method3660()) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 5) {
			super.anInt9489 = this.method5918();
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		this.aBoolean674 = true;
		return super.aClass2_Sub34_34.method3580().method3660() ? 2 : 0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		this.aBoolean674 = false;
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)Z")
	public boolean method5614() {
		return super.aClass2_Sub34_34.method3580().method3660();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZB)V")
	public void method5615(@OriginalArg(0) boolean arg0) {
		this.aBoolean675 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method3580().method3660()) {
			return arg0 == 3 && !Static436.method2455("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}
}
