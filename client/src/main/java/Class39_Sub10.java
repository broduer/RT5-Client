import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class39_Sub10 extends Class39 {

	@OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
	private final int anInt4131;

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
	private final int anInt4130;

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	private final int anInt4136;

	@OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
	private final int anInt4134;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	private final int anInt4137;

	@OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
	private final int anInt4133;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub10(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt4131 = arg0.g2();
		@Pc(13) int local13 = arg0.g1();
		if ((local13 & 0x1) == 0) {
			this.anInt4130 = -1;
			this.anInt4136 = -1;
		} else {
			this.anInt4130 = arg0.g2();
			this.anInt4136 = arg0.g2();
		}
		if ((local13 & 0x2) == 0) {
			this.anInt4137 = -1;
			this.anInt4134 = -1;
		} else {
			this.anInt4134 = arg0.g2();
			this.anInt4137 = arg0.g2();
		}
		if ((local13 & 0x4) == 0) {
			this.anInt4133 = -1;
		} else {
			@Pc(84) int local84 = arg0.g2();
			@Pc(88) int local88 = arg0.g2();
			@Pc(94) int local94 = local84 * 255 / local88;
			if (local84 > 0 && local94 < 1) {
				local94 = 1;
			}
			this.anInt4133 = local94;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static219.aClass238Array1[this.anInt4131].method5370().method9308(this.anInt4137, 0, this.anInt4133, this.anInt4136, client.cycle, this.anInt4134, this.anInt4130);
	}
}
