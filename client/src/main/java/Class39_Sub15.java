import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class39_Sub15 extends Class39 {

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	private final int anInt6010;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	private final int anInt6012;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	private final int anInt6013;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "I")
	private final int anInt6014;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub15(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt6010 = arg0.g2();
		this.anInt6012 = arg0.g1();
		this.anInt6013 = arg0.g1();
		this.anInt6014 = arg0.g1();
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static186.method2818(this.anInt6010, this.anInt6014, this.anInt6013, 0, this.anInt6012, false);
	}
}
