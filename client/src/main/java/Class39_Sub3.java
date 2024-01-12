import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	private final int anInt2356;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub3(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt2356 = arg0.method7389();
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static507.aClass396Array1[this.anInt2356].method9040();
	}
}
