import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kma")
public final class Class132_Sub2 extends Class132 implements Interface12 {

	@OriginalMember(owner = "client!kma", name = "u", descriptor = "I")
	private int anInt5601;

	@OriginalMember(owner = "client!kma", name = "<init>", descriptor = "(Lclient!qha;I[BIZ)V")
	public Class132_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5601 = arg1;
	}

	@OriginalMember(owner = "client!kma", name = "<init>", descriptor = "(Lclient!qha;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class132_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5601 = arg1;
	}

	@OriginalMember(owner = "client!kma", name = "c", descriptor = "(I)I")
	@Override
	public int method5008() {
		return this.anInt5601;
	}

	@OriginalMember(owner = "client!kma", name = "b", descriptor = "(I)J")
	@Override
	public long method5010() {
		return 0L;
	}

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(I)I")
	@Override
	public int method5011() {
		return super.anInt5592;
	}

	@OriginalMember(owner = "client!kma", name = "e", descriptor = "(I)V")
	@Override
	protected void method5006() {
		super.aClass19_Sub3_25.method6972(this);
	}

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method5009(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method5004(arg1, arg0);
		this.anInt5601 = arg2;
	}
}
