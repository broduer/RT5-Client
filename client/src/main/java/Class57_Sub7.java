import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class57_Sub7 extends Class57 {

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub7(@OriginalArg(0) Preferences arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Preferences arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)I")
	public int method2905() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Z")
	public boolean method2906() {
		return !super.aClass2_Sub34_34.method5118();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return 1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		if (super.aClass2_Sub34_34.method5118()) {
			super.anInt9515 = 0;
		}
		if (super.anInt9515 != 1 && super.anInt9515 != 0) {
			super.anInt9515 = this.method8361();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub34_34.method5118() ? 3 : 1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}
}
