import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class39_Sub16 extends Class39 {

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private final int anInt7294;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	private final int anInt7296;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	private final int anInt7299;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
	private final int anInt7301;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	private final int anInt7300;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub16(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt7294 = arg0.g2();
		@Pc(11) int local11 = arg0.g4();
		this.anInt7296 = local11 & 0xFFFF;
		this.anInt7299 = local11 >>> 16;
		this.anInt7301 = arg0.g1();
		this.anInt7300 = arg0.g1();
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static507.aClass396Array1[this.anInt7294].method9045(this.anInt7299, this.anInt7300, this.anInt7296, this.anInt7301);
	}
}
