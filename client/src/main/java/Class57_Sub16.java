import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class57_Sub16 extends Class57 {

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub16(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)Z")
	public boolean method3901() {
		return true;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)I")
	public int method3904() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		return arg0 == 0 || super.aClass2_Sub34_34.aClass57_Sub23_1.method4929() == 1 ? 1 : 2;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		return 1;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (super.anInt9489 != 0 && super.aClass2_Sub34_34.aClass57_Sub23_1.method4929() != 1) {
			super.anInt9489 = 0;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 1) {
			super.anInt9489 = this.method5918();
		}
	}
}
