import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public final class Preference_Sub29 extends Preference {

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "Z")
	public boolean aBoolean675 = false;

	@OriginalMember(owner = "client!tba", name = "k", descriptor = "Z")
	private boolean aBoolean676 = true;

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Preference_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Preference_Sub29(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)Z")
	public boolean method7920() {
		return this.aBoolean676;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)I")
	public int method7922() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (!super.aClass2_Sub34_34.method5115().method5210()) {
			super.anInt9515 = 0;
		}
		if (super.anInt9515 < 0 || super.anInt9515 > 5) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		this.aBoolean675 = true;
		return super.aClass2_Sub34_34.method5115().method5210() ? 2 : 0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		this.aBoolean675 = false;
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(B)Z")
	public boolean method7924() {
		return super.aClass2_Sub34_34.method5115().method5210();
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZB)V")
	public void method7925(@OriginalArg(0) boolean arg0) {
		this.aBoolean676 = arg0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub34_34.method5115().method5210()) {
			return arg0 == 3 && !Static436.method3417("jagdx") ? 3 : 2;
		} else {
			return 3;
		}
	}
}
