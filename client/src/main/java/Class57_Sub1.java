import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub1(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		return super.aClass2_Sub34_34.method3580().method3655() ? 3 : 2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public int method934() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (super.anInt9489 < 1 || super.anInt9489 > 3) {
			super.anInt9489 = this.method5918();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}
}
