import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public final class Class39_Sub9 extends Class39 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private final int anInt3705;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private final int anInt3702;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub9(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt3705 = arg0.g2();
		this.anInt3702 = arg0.g1();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static482.method6488(this.anInt3702, this.anInt3705, 0);
	}
}
