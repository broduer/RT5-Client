import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public final class Class57_Sub11 extends Class57 {

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub11(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)I")
	public int method2606() {
		return super.anInt9489;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)I")
	@Override
	protected int method5918() {
		return 0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I")
	@Override
	public int method5916(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method5917(@OriginalArg(1) int arg0) {
		super.anInt9489 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
	@Override
	public void method5914() {
	}
}
