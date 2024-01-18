import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kga")
public final class TextureOpLineNoise extends TextureOp {

	@OriginalMember(owner = "client!kga", name = "F", descriptor = "I")
	private int anInt5437 = 0;

	@OriginalMember(owner = "client!kga", name = "R", descriptor = "I")
	private int anInt5438 = 0;

	@OriginalMember(owner = "client!kga", name = "J", descriptor = "I")
	private int anInt5443 = 4096;

	@OriginalMember(owner = "client!kga", name = "H", descriptor = "I")
	private int anInt5441 = 16;

	@OriginalMember(owner = "client!kga", name = "P", descriptor = "I")
	private int anInt5439 = 2000;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "()V")
	public TextureOpLineNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt5438 = buf.g1();
		} else if (code == 1) {
			this.anInt5439 = buf.g2();
		} else if (code == 2) {
			this.anInt5441 = buf.g1();
		} else if (code == 3) {
			this.anInt5437 = buf.g2();
		} else if (code == 4) {
			this.anInt5443 = buf.g2();
		}
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(20) int local20 = this.anInt5443 >> 1;
			@Pc(25) int[][] local25 = super.monochromeImageCache.method3932();
			@Pc(32) Random local32 = new Random(this.anInt5438);
			for (@Pc(34) int local34 = 0; local34 < this.anInt5439; local34++) {
				@Pc(60) int local60 = this.anInt5443 > 0 ? this.anInt5437 + Static623.nextInt(this.anInt5443, local32) - local20 : this.anInt5437;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static623.nextInt(Static608.width, local32);
				@Pc(76) int local76 = Static623.nextInt(Static2.anInt53, local32);
				@Pc(87) int local87 = local71 + (TextureOp.COSINE[local66] * this.anInt5441 >> 12);
				@Pc(98) int local98 = local76 + (this.anInt5441 * TextureOp.SINE[local66] >> 12);
				@Pc(103) int local103 = local98 - local76;
				@Pc(108) int local108 = local87 - local71;
				if (local108 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(134) boolean local134 = local103 > local108;
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (local134) {
						local138 = local71;
						local140 = local87;
						local71 = local76;
						local87 = local98;
						local76 = local138;
						local98 = local140;
					}
					if (local71 > local87) {
						local138 = local71;
						local140 = local76;
						local71 = local87;
						local87 = local138;
						local76 = local98;
						local98 = local140;
					}
					local138 = local76;
					local140 = local87 - local71;
					@Pc(179) int local179 = local98 - local76;
					@Pc(184) int local184 = -local140 / 2;
					@Pc(188) int local188 = 2048 / local140;
					@Pc(198) int local198 = 1024 - (Static623.nextInt(4096, local32) >> 2);
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(214) int local214 = local98 > local76 ? 1 : -1;
					for (@Pc(216) int local216 = local71; local216 < local87; local216++) {
						@Pc(228) int local228 = local188 * (local216 - local71) + local198 + 1024;
						@Pc(232) int local232 = Static576.anInt8604 & local216;
						@Pc(236) int local236 = local138 & Static489.anInt7364;
						if (local134) {
							local25[local236][local232] = local228;
						} else {
							local25[local232][local236] = local228;
						}
						local184 += local179;
						if (local184 > 0) {
							local138 += local214;
							local184 += -local140;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		TextureOp.createTrigonometryTables();
	}
}
