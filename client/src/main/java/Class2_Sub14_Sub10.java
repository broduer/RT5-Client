import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class2_Sub14_Sub10 extends Class2_Sub14 {

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
	private int anInt7611;

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
	private int anInt7613;

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	private int anInt7614;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
	private int anInt7612 = -1;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8624(@OriginalArg(0) Class164 arg0) {
		arg0.method3475(this.anInt7611, this.anInt7612, this.anInt7613, this.anInt7614);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8622(@OriginalArg(1) Packet arg0) {
		this.anInt7612 = arg0.g2();
		this.anInt7611 = arg0.g4();
		this.anInt7614 = arg0.g1();
		this.anInt7613 = arg0.g1();
	}
}
