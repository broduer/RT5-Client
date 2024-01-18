import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class VorbisResidue {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	private final int type = VorbisSound.readBits(16);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	private final int begin = VorbisSound.readBits(24);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	private final int end = VorbisSound.readBits(24);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "I")
	private final int partitionSize = VorbisSound.readBits(24) + 1;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	private final int classifications = VorbisSound.readBits(6) + 1;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	private final int classBook = VorbisSound.readBits(8);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
	private final int[] books;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public VorbisResidue() {
		@Pc(33) int[] local33 = new int[this.classifications];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.classifications; local35++) {
			local38 = 0;
			@Pc(41) int local41 = VorbisSound.readBits(3);
			@Pc(47) boolean local47 = VorbisSound.readBit() != 0;
			if (local47) {
				local38 = VorbisSound.readBits(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.books = new int[this.classifications * 8];
		for (local38 = 0; local38 < this.classifications * 8; local38++) {
			this.books[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : VorbisSound.readBits(8);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([FIZ)V")
	public void method5129(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = VorbisSound.codebooks[this.classBook].anInt6824;
		@Pc(25) int local25 = this.end - this.begin;
		@Pc(30) int local30 = local25 / this.partitionSize;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = VorbisSound.codebooks[this.classBook].method6118();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.classifications;
						}
						local47 /= this.classifications;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.books[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.begin + local38 * this.partitionSize;
						@Pc(104) VorbisCodebook local104 = VorbisSound.codebooks[local90];
						@Pc(113) int local113;
						if (this.type == 0) {
							local113 = this.partitionSize / local104.anInt6824;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method6119();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt6824; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.partitionSize) {
								@Pc(153) float[] local153 = local104.method6119();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt6824; local155++) {
									arg0[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}
