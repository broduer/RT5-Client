import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!in", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray109;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "I")
	private int anInt4543;

	@OriginalMember(owner = "client!in", name = "S", descriptor = "[I")
	private int[] anIntArray349;

	@OriginalMember(owner = "client!in", name = "ab", descriptor = "I")
	private int anInt4547;

	@OriginalMember(owner = "client!in", name = "Z", descriptor = "I")
	private int anInt4552;

	@OriginalMember(owner = "client!in", name = "T", descriptor = "[[I")
	private int[][] anIntArrayArray110;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	private int anInt4539 = 204;

	@OriginalMember(owner = "client!in", name = "V", descriptor = "I")
	private int anInt4549 = 1024;

	@OriginalMember(owner = "client!in", name = "db", descriptor = "I")
	private int anInt4542 = 81;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "I")
	private int anInt4546 = 1024;

	@OriginalMember(owner = "client!in", name = "P", descriptor = "I")
	private int anInt4545 = 0;

	@OriginalMember(owner = "client!in", name = "X", descriptor = "I")
	private int anInt4541 = 8;

	@OriginalMember(owner = "client!in", name = "bb", descriptor = "I")
	private int anInt4553 = 409;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "I")
	private int anInt4554 = 4;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V")
	private void method4069(@OriginalArg(0) int arg0) {
		@Pc(12) Random local12 = new Random(this.anInt4541);
		this.anInt4543 = 4096 / this.anInt4554;
		this.anInt4552 = 4096 / this.anInt4541;
		this.anInt4547 = this.anInt4542 / 2;
		@Pc(35) int local35 = this.anInt4543 / 2;
		this.anIntArrayArray109 = new int[this.anInt4541][this.anInt4554 + 1];
		if (arg0 != 25428) {
			Static278.anIntArray351 = null;
		}
		this.anIntArray349 = new int[this.anInt4541 + 1];
		@Pc(63) int local63 = this.anInt4552 / 2;
		this.anIntArrayArray110 = new int[this.anInt4541][this.anInt4554];
		this.anIntArray349[0] = 0;
		for (@Pc(77) int local77 = 0; local77 < this.anInt4541; local77++) {
			@Pc(86) int local86;
			@Pc(98) int local98;
			if (local77 > 0) {
				local86 = this.anInt4552;
				local98 = (Static623.method8333(4096, local12) - 2048) * this.anInt4539 >> 12;
				@Pc(106) int local106 = local86 + (local98 * local63 >> 12);
				this.anIntArray349[local77] = this.anIntArray349[local77 - 1] + local106;
			}
			this.anIntArrayArray109[local77][0] = 0;
			for (local86 = 0; local86 < this.anInt4554; local86++) {
				if (local86 > 0) {
					local98 = this.anInt4543;
					@Pc(152) int local152 = (Static623.method8333(4096, local12) - 2048) * this.anInt4553 >> 12;
					local98 += local35 * local152 >> 12;
					this.anIntArrayArray109[local77][local86] = local98 + this.anIntArrayArray109[local77][local86 - 1];
				}
				this.anIntArrayArray110[local77][local86] = this.anInt4546 > 0 ? 4096 - Static623.method8333(this.anInt4546, local12) : 4096;
			}
			this.anIntArrayArray109[local77][this.anInt4554] = 4096;
		}
		this.anIntArray349[this.anInt4541] = 4096;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt4554 = arg1.g1();
		} else if (arg2 == 1) {
			this.anInt4541 = arg1.g1();
		} else if (arg2 == 2) {
			this.anInt4553 = arg1.g2();
		} else if (arg2 == 3) {
			this.anInt4539 = arg1.g2();
		} else if (arg2 == 4) {
			this.anInt4549 = arg1.g2();
		} else if (arg2 == 5) {
			this.anInt4545 = arg1.g2();
		} else if (arg2 == 6) {
			this.anInt4542 = arg1.g2();
		} else if (arg2 == 7) {
			this.anInt4546 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		this.method4069(25428);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(1) int arg1) {
		@Pc(18) int[] local18 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = this.anInt4545 + Static273.anIntArray341[arg1]; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local24 < this.anInt4541 && this.anIntArray349[local24] <= local31) {
				local24++;
			}
			@Pc(79) int local79 = local24 - 1;
			@Pc(90) boolean local90 = (local24 & 0x1) == 0;
			@Pc(95) int local95 = this.anIntArray349[local24];
			@Pc(102) int local102 = this.anIntArray349[local24 - 1];
			if (this.anInt4547 + local102 < local31 && local31 < local95 - this.anInt4547) {
				for (@Pc(123) int local123 = 0; local123 < Static608.anInt9315; local123++) {
					@Pc(127) int local127 = 0;
					@Pc(137) int local137 = local90 ? this.anInt4549 : -this.anInt4549;
					@Pc(148) int local148;
					for (local148 = Static54.anIntArray92[local123] + (local137 * this.anInt4543 >> 12); local148 < 0; local148 += 4096) {
					}
					while (local148 > 4096) {
						local148 -= 4096;
					}
					while (local127 < this.anInt4554 && this.anIntArrayArray109[local79][local127] <= local148) {
						local127++;
					}
					@Pc(199) int local199 = local127 - 1;
					@Pc(206) int local206 = this.anIntArrayArray109[local79][local127];
					@Pc(213) int local213 = this.anIntArrayArray109[local79][local199];
					if (local148 > this.anInt4547 + local213 && local148 < local206 - this.anInt4547) {
						local18[local123] = this.anIntArrayArray110[local79][local199];
					} else {
						local18[local123] = 0;
					}
				}
			} else {
				Static734.method7697(local18, 0, Static608.anInt9315, 0);
			}
		}
		return local18;
	}
}
