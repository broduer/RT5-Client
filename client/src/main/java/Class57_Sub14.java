import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class57_Sub14 extends Class57 {

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub14(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.anInt9515 != 1 && super.anInt9515 != 0) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I")
	public int method5309() {
		return super.anInt9515;
	}
}
