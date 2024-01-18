import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class39_Sub4 extends Class39 {

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
	private final int anInt2541;

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
	private final int anInt2536;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
	private final int anInt2538;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
	private final int anInt2537;

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
	private final int anInt2540;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub4(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt2541 = arg0.g2();
		@Pc(11) int local11 = arg0.g4();
		this.anInt2536 = local11 >>> 16;
		this.anInt2538 = local11 & 0xFFFF;
		this.anInt2537 = arg0.g1();
		this.anInt2540 = arg0.method7367();
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static219.aClass238Array1[this.anInt2541].method5371(this.anInt2540, this.anInt2537, this.anInt2536, this.anInt2538);
	}
}
