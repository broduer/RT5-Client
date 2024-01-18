import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub1(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return super.aClass2_Sub34_34.method5115().method5205() ? 3 : 2;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	public int method1485() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.anInt9515 < 1 || super.anInt9515 > 3) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}
}
