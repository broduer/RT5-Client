import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class2_Sub14_Sub1 extends Class2_Sub14 {

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
	private int anInt1849;

	@OriginalMember(owner = "client!cq", name = "o", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method6139(@OriginalArg(0) Class164 arg0) {
		arg0.method2521(this.anInt1849, this.aLong65);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method6137(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt1849 = arg0.method5158();
		this.aLong65 = arg0.method5207();
	}
}
