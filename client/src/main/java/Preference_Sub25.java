import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Preference_Sub25 extends Preference {

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Preference_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Preference_Sub25(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.anInt9515 < 0 && super.anInt9515 > 127) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)I")
	public int method7215() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 127;
	}
}
