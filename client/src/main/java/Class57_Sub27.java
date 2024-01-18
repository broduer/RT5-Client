import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public final class Class57_Sub27 extends Class57 {

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub27(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5112() == Static723.aClass379_9) {
			super.anInt9515 = 2;
		}
		if (super.anInt9515 < 0 || super.anInt9515 > 2) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)I")
	public int method7674() {
		return super.anInt9515;
	}
}
