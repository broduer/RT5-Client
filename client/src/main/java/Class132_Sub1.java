import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public final class Class132_Sub1 extends Class132 implements Interface1 {

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
	private int anInt3057;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!qha;I[BIZ)V")
	public Class132_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt3057 = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method9362(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5004(arg0, arg1);
		this.anInt3057 = 5123;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)I")
	@Override
	public int method9361() {
		return this.anInt3057;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
	@Override
	public int method9360() {
		return super.anInt5592;
	}

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "(I)V")
	@Override
	protected void method5006() {
		super.aClass19_Sub3_25.method7009(this);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)J")
	@Override
	public long method9359() {
		return 0L;
	}
}
