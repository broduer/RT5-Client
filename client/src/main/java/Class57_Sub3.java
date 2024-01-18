import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public final class Class57_Sub3 extends Class57 {

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub3(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "(B)Z")
	public boolean method2117() {
		return true;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (this.method2118()) {
			if (super.aClass2_Sub34_34.aClass57_Sub29_1.method7920() && !Static386.method5443(super.aClass2_Sub34_34.aClass57_Sub29_1.method7922())) {
				super.anInt9515 = 1;
			}
			if (super.aClass2_Sub34_34.aClass57_Sub1_2.method1485() == 1) {
				super.anInt9515 = 1;
			}
		}
		if (super.anInt9515 == 3) {
			super.anInt9515 = 2;
		}
		if (super.anInt9515 < 0 || super.anInt9515 > 3) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(B)Z")
	public boolean method2118() {
		return Static356.method5209(super.anInt9515);
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		if (Static356.method5209(arg0)) {
			if (super.aClass2_Sub34_34.aClass57_Sub29_1.method7920() && !Static386.method5443(super.aClass2_Sub34_34.aClass57_Sub29_1.method7922())) {
				return 3;
			}
			if (super.aClass2_Sub34_34.aClass57_Sub1_2.method1485() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static356.method5209(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 0;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(Z)I")
	public int method2120() {
		return super.anInt9515;
	}
}
