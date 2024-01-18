import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public final class Preference_Sub18 extends Preference {

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Preference_Sub18(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Preference_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)I")
	public int method5774() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5118()) {
			super.anInt9515 = 2;
		}
		if (super.anInt9515 < 0 || super.anInt9515 > 2) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		if (super.aClass2_Sub34_34.method5118()) {
			return 2;
		} else if (super.aClass2_Sub34_34.aClass57_Sub29_1.method7920() && Static463.method6287(super.aClass2_Sub34_34.aClass57_Sub29_1.method7922())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Z")
	public boolean method5775() {
		return !super.aClass2_Sub34_34.method5118();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub34_34.method5118() ? 3 : 1;
	}
}
