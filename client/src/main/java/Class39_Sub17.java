import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class39_Sub17 extends Class39 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	private final int anInt7645;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[I")
	private final int[] anIntArray611;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	private final int anInt7647;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	private final int anInt7648;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub17(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt7645 = arg0.g2();
		this.anIntArray611 = new int[4];
		this.anInt7647 = arg0.method7353();
		Static734.fill(this.anIntArray611, 0, this.anIntArray611.length, this.anInt7647);
		this.anInt7648 = arg0.g4();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		@Pc(10) Class8_Sub2_Sub1_Sub2 local10 = Static219.aClass238Array1[this.anInt7645].method5370();
		if (this.anInt7648 == 0) {
			Static651.method8522(this.anIntArray611, 0, false, local10);
		} else {
			Static310.method4512(new int[] { this.anInt7648 }, new int[] { this.anInt7647 }, new int[1], local10);
		}
	}
}
