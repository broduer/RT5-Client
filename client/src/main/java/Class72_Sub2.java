import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ula")
public final class Class72_Sub2 extends Class72 implements Interface20 {

	@OriginalMember(owner = "client!ula", name = "x", descriptor = "Lclient!wda;")
	private final Class399 aClass399_10;

	@OriginalMember(owner = "client!ula", name = "<init>", descriptor = "(Lclient!tca;Lclient!wda;Z)V")
	public Class72_Sub2(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class399 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass399_10 = arg1;
	}

	@OriginalMember(owner = "client!ula", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method8554() {
		return super.method8551(super.aClass19_Sub1_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ula", name = "a", descriptor = "(B)I")
	@Override
	public int method8543() {
		return super.method8543();
	}

	@OriginalMember(owner = "client!ula", name = "a", descriptor = "(I)Lclient!wda;")
	@Override
	public Class399 method8555() {
		return this.aClass399_10;
	}

	@OriginalMember(owner = "client!ula", name = "a", descriptor = "(II)V")
	@Override
	public void method8550(@OriginalArg(1) int arg0) {
		super.method8550(this.aClass399_10.anInt10596 * arg0);
	}

	@OriginalMember(owner = "client!ula", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8553() {
		return super.method8548(super.aClass19_Sub1_Sub2_11.aMapBuffer1);
	}

	@OriginalMember(owner = "client!ula", name = "a", descriptor = "(Z)V")
	@Override
	public void method8545() {
		super.method8545();
	}
}
