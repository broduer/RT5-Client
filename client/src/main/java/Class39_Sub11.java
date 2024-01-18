import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class39_Sub11 extends Class39 {

	@OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
	private final int anInt4266;

	@OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
	private final int anInt4265;

	@OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
	private final int anInt4264;

	@OriginalMember(owner = "client!ica", name = "k", descriptor = "I")
	private final int anInt4262;

	@OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
	private final int anInt4263;

	@OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub11(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt4266 = arg0.g2();
		this.anInt4265 = arg0.g2();
		this.anInt4264 = arg0.g2();
		this.anInt4262 = arg0.g2();
		this.anInt4263 = arg0.g2();
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static319.method4602(this.anInt4266, false, 100, this.anInt4265, this.anInt4264, 100);
		Static471.method6415(this.anInt4263, this.anInt4262);
		Static421.aBoolean480 = true;
	}
}
