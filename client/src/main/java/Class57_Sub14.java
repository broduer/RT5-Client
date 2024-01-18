import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class57_Sub14 extends Class57 {

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub14(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		return 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (super.anInt9489 != 1 && super.anInt9489 != 0) {
			super.anInt9489 = this.method5918();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I")
	public int method3754() {
		return super.anInt9489;
	}
}
