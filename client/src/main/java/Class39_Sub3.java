import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	private final int anInt2347;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub3(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt2347 = arg0.method5191();
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	@Override
	public void method6590() {
		Static507.aClass394Array1[this.anInt2347].method6469();
	}
}
