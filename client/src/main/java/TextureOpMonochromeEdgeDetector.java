import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ola")
public final class TextureOpMonochromeEdgeDetector extends TextureOp {

	@OriginalMember(owner = "client!ola", name = "G", descriptor = "I")
	private int anInt7055 = 4096;

	@OriginalMember(owner = "client!ola", name = "<init>", descriptor = "()V")
	public TextureOpMonochromeEdgeDetector() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
	}

	@OriginalMember(owner = "client!ola", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(18) int[] local18 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(32) int[] local32 = this.method9429(Static489.anInt7364 & y - 1, 0);
			@Pc(38) int[] local38 = this.method9429(y, 0);
			@Pc(48) int[] local48 = this.method9429(y + 1 & Static489.anInt7364, 0);
			for (@Pc(50) int local50 = 0; local50 < Static608.width; local50++) {
				@Pc(63) int local63 = (local48[local50] - local32[local50]) * this.anInt7055;
				@Pc(83) int local83 = (local38[local50 + 1 & Static576.anInt8604] - local38[Static576.anInt8604 & local50 - 1]) * this.anInt7055;
				@Pc(87) int local87 = local83 >> 12;
				@Pc(91) int local91 = local63 >> 12;
				@Pc(97) int local97 = local87 * local87 >> 12;
				@Pc(103) int local103 = local91 * local91 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((float) (local97 + local103 + 4096) / 4096.0F) * 4096.0D);
				@Pc(130) int local130 = local118 == 0 ? 0 : 16777216 / local118;
				local18[local50] = 4096 - local130;
			}
		}
		return local18;
	}
}
