import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub2(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)Z")
	public boolean method1985() {
		return Static140.method2367(super.aClass2_Sub34_34.aClass57_Sub29_1.method7922());
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return Static140.method2367(super.aClass2_Sub34_34.aClass57_Sub29_1.method7922()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.anInt9515 < 0 || super.anInt9515 > 1) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	public int method1989() {
		return super.anInt9515;
	}
}
