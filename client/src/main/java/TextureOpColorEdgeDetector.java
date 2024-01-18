import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public final class TextureOpColorEdgeDetector extends TextureOp {

	@OriginalMember(owner = "client!mt", name = "I", descriptor = "I")
	private int anInt6334 = 4096;

	@OriginalMember(owner = "client!mt", name = "F", descriptor = "Z")
	private boolean aBoolean467 = true;

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
	public TextureOpColorEdgeDetector() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt6334 = buf.g2();
		} else if (code == 1) {
			this.aBoolean467 = buf.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(11) int[][] local11 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(25) int[] local25 = this.method9429(y - 1 & Static489.anInt7364, 0);
			@Pc(31) int[] local31 = this.method9429(y, 0);
			@Pc(41) int[] local41 = this.method9429(y + 1 & Static489.anInt7364, 0);
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static608.width; local55++) {
				@Pc(68) int local68 = (local41[local55] - local25[local55]) * this.anInt6334;
				@Pc(88) int local88 = this.anInt6334 * (local31[Static576.anInt8604 & local55 + 1] - local31[local55 - 1 & Static576.anInt8604]);
				@Pc(92) int local92 = local88 >> 12;
				@Pc(96) int local96 = local68 >> 12;
				@Pc(102) int local102 = local92 * local92 >> 12;
				@Pc(108) int local108 = local96 * local96 >> 12;
				@Pc(122) int local122 = (int) (Math.sqrt((float) (local108 + local102 + 4096) / 4096.0F) * 4096.0D);
				@Pc(128) int local128;
				@Pc(126) int local126;
				@Pc(130) int local130;
				if (local122 == 0) {
					local126 = 0;
					local128 = 0;
					local130 = 0;
				} else {
					local130 = 16777216 / local122;
					local126 = local68 / local122;
					local128 = local88 / local122;
				}
				if (this.aBoolean467) {
					local128 = (local128 >> 1) + 2048;
					local130 = (local130 >> 1) + 2048;
					local126 = (local126 >> 1) + 2048;
				}
				local45[local55] = local128;
				local49[local55] = local126;
				local53[local55] = local130;
			}
		}
		return local11;
	}
}
