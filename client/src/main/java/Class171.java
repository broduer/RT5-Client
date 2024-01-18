import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class171 {

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "I")
	public int anInt4043;

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public int anInt4044;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "I")
	public int anInt4045;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	public int anInt4046;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "B")
	private byte aByte69;

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "I")
	public int anInt4051;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class171() {
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class171(@OriginalArg(0) Buffer arg0) {
		this.aByte69 = arg0.g1b();
		this.anInt4044 = arg0.g2();
		this.anInt4051 = arg0.g4();
		this.anInt4045 = arg0.g4();
		this.anInt4046 = arg0.g4();
		this.anInt4043 = arg0.g4();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)I")
	public int method3547() {
		return (this.aByte69 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public int method3548() {
		return this.aByte69 & 0x7;
	}
}
