import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	private Class22_Sub1() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!pv;I)Lclient!pv;")
	@Override
	public SecondaryNode_Sub11 method593(@OriginalArg(0) SecondaryNode_Sub11 arg0) {
		return new SecondaryNode_Sub11_Sub1(arg0.anInterface24_3, arg0.method8318(), arg0.anInt9471);
	}
}
