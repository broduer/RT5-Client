import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class213 {

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
	public int anInt5494;

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	public int anInt5495;

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
	public int anInt5496;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
	private int anInt5497;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private int anInt5498;

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	private int anInt5499;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
	private int anInt5500;

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
	private int anInt5501;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt5493 = 2;

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
	private int[] anIntArray407 = new int[2];

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
	private int[] anIntArray408 = new int[2];

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class213() {
		this.anIntArray407[0] = 0;
		this.anIntArray407[1] = 65535;
		this.anIntArray408[0] = 0;
		this.anIntArray408[1] = 65535;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lclient!ge;)V")
	public void method4956(@OriginalArg(0) Buffer arg0) {
		this.anInt5493 = arg0.g1();
		this.anIntArray407 = new int[this.anInt5493];
		this.anIntArray408 = new int[this.anInt5493];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5493; local16++) {
			this.anIntArray407[local16] = arg0.g2();
			this.anIntArray408[local16] = arg0.g2();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	public void method4957() {
		this.anInt5499 = 0;
		this.anInt5497 = 0;
		this.anInt5501 = 0;
		this.anInt5498 = 0;
		this.anInt5500 = 0;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
	public int method4958(@OriginalArg(0) int arg0) {
		if (this.anInt5500 >= this.anInt5499) {
			this.anInt5498 = this.anIntArray408[this.anInt5497++] << 15;
			if (this.anInt5497 >= this.anInt5493) {
				this.anInt5497 = this.anInt5493 - 1;
			}
			this.anInt5499 = (int) ((double) this.anIntArray407[this.anInt5497] / 65536.0D * (double) arg0);
			if (this.anInt5499 > this.anInt5500) {
				this.anInt5501 = ((this.anIntArray408[this.anInt5497] << 15) - this.anInt5498) / (this.anInt5499 - this.anInt5500);
			}
		}
		this.anInt5498 += this.anInt5501;
		this.anInt5500++;
		return this.anInt5498 - this.anInt5501 >> 15;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Lclient!ge;)V")
	public void method4959(@OriginalArg(0) Buffer arg0) {
		this.anInt5496 = arg0.g1();
		this.anInt5494 = arg0.g4();
		this.anInt5495 = arg0.g4();
		this.method4956(arg0);
	}
}
