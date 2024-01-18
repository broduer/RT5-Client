import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class2_Sub30_Sub3 extends Class2_Sub30 {

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "I")
	private int anInt7702 = -1;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!ge;I)V")
	@Override
	public void method7654(@OriginalArg(0) Packet arg0) {
		this.anInt7702 = arg0.g2();
		arg0.g1();
		if (arg0.g1() != 255) {
			arg0.pos--;
			arg0.g8();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!rfa;I)V")
	@Override
	public void method7649(@OriginalArg(0) Class2_Sub47 arg0) {
		arg0.method7284(this.anInt7702);
	}
}
