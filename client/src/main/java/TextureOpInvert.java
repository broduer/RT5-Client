import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class TextureOpInvert extends TextureOp {

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	public TextureOpInvert() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.method9429(y, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.width; local23++) {
				local11[local23] = 4096 - local21[local23];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] local18 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(28) int[][] local28 = this.method9420(0, y);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static608.width; local54++) {
				local44[local54] = 4096 - local32[local54];
				local48[local54] = 4096 - local36[local54];
				local52[local54] = 4096 - local40[local54];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			super.monochrome = buf.g1() == 1;
		}
	}
}
