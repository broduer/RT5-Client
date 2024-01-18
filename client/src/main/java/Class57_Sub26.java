import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public final class Class57_Sub26 extends Class57 {

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub26(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5118()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub34_34.aClass57_Sub23_1.method7061() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)I")
	public int method7470() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)Z")
	public boolean method7471() {
		return !super.aClass2_Sub34_34.method5118();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 1;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5118()) {
			super.anInt9515 = 0;
		}
		if (super.anInt9515 < 0 && super.anInt9515 > 2) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}
}
