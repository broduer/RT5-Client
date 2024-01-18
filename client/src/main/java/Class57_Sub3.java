import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub3(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(B)Z")
	public boolean method1356() {
		return true;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
		if (this.method1357()) {
			if (super.aClass2_Sub34_34.aClass57_Sub29_1.method5610() && !Static386.method3848(super.aClass2_Sub34_34.aClass57_Sub29_1.method5612())) {
				super.anInt9489 = 1;
			}
			if (super.aClass2_Sub34_34.aClass57_Sub1_2.method934() == 1) {
				super.anInt9489 = 1;
			}
		}
		if (super.anInt9489 == 3) {
			super.anInt9489 = 2;
		}
		if (super.anInt9489 < 0 || super.anInt9489 > 3) {
			super.anInt9489 = this.method5918();
		}
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(B)Z")
	public boolean method1357() {
		return Static356.method3659(super.anInt9489);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		if (Static356.method3659(arg0)) {
			if (super.aClass2_Sub34_34.aClass57_Sub29_1.method5610() && !Static386.method3848(super.aClass2_Sub34_34.aClass57_Sub29_1.method5612())) {
				return 3;
			}
			if (super.aClass2_Sub34_34.aClass57_Sub1_2.method934() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static356.method3659(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		return 0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Z)I")
	public int method1359() {
		return super.anInt9489;
	}
}
