import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Class57_Sub18 extends Class57 {

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub18(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)I")
	public int method4073() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (super.aClass2_Sub34_34.method3583()) {
			super.anInt9489 = 2;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 2) {
			super.anInt9489 = this.method5918();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		if (super.aClass2_Sub34_34.method3583()) {
			return 2;
		} else if (super.aClass2_Sub34_34.aClass57_Sub29_1.method5610() && Static463.method4384(super.aClass2_Sub34_34.aClass57_Sub29_1.method5612())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Z")
	public boolean method4074() {
		return !super.aClass2_Sub34_34.method3583();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub34_34.method3583() ? 3 : 1;
	}
}
