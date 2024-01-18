import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class39_Sub14 extends Class39 {

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "I")
	private final int anInt5892;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	private final int anInt5900;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	private final int anInt5899;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
	private final int anInt5894;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub14(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt5892 = arg0.g2();
		this.anInt5900 = arg0.g1();
		this.anInt5899 = arg0.g1();
		this.anInt5894 = arg0.g1();
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static161.method2586(this.anInt5899, 0, this.anInt5892, this.anInt5894, this.anInt5900);
	}
}
