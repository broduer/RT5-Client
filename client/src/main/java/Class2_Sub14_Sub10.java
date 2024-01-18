import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class2_Sub14_Sub10 extends Class2_Sub14 {

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
	private int anInt7588;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
	private int anInt7590;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	private int anInt7591;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
	private int anInt7589 = -1;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method6139(@OriginalArg(0) Class164 arg0) {
		arg0.method2508(this.anInt7588, this.anInt7589, this.anInt7590, this.anInt7591);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method6137(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt7589 = arg0.method5191();
		this.anInt7588 = arg0.method5158();
		this.anInt7591 = arg0.method5205();
		this.anInt7590 = arg0.method5205();
	}
}
