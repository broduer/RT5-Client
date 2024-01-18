import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Preference_Sub28 extends Preference {

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Preference_Sub28(@OriginalArg(0) Preferences arg0) {
		super(arg0);
		Static690.method9003(super.anInt9515);
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Preference_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
		Static690.method9003(super.anInt9515);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return super.aClass2_Sub34_34.method5115().method5204() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub34_34.method5115().method5204() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
		Static690.method9003(super.anInt9515);
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(B)Z")
	public boolean method7844() {
		return super.aClass2_Sub34_34.method5115().method5204() >= 96;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)I")
	public int method7845() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5115().method5204() < 96) {
			super.anInt9515 = 0;
		}
		if (super.anInt9515 < 0 || super.anInt9515 > 2) {
			super.anInt9515 = this.method8361();
		}
	}
}
