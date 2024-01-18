import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class57_Sub12 extends Class57 {

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub12(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z")
	public boolean method4367() {
		if (super.aClass2_Sub34_34.method5118()) {
			return false;
		} else {
			return super.aClass2_Sub34_34.aClass57_Sub30_1.method8363() != 0;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 2;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I")
	public int method4371() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5118()) {
			return 3;
		} else if (super.aClass2_Sub34_34.aClass57_Sub30_1.method8363() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5118()) {
			super.anInt9515 = 0;
		}
		if (super.aClass2_Sub34_34.aClass57_Sub30_1.method8363() == 0) {
			super.anInt9515 = 0;
		}
		if (super.anInt9515 < 0 || super.anInt9515 > 2) {
			super.anInt9515 = this.method8361();
		}
	}
}
