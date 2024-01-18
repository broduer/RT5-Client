import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class TextureOpTiledSprite extends TextureOpSprite {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(20) int[][] local20 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid && this.method7245()) {
			@Pc(34) int[] local34 = local20[0];
			@Pc(38) int[] local38 = local20[1];
			@Pc(42) int[] local42 = local20[2];
			@Pc(50) int local50 = super.anInt8254 * (y % super.anInt8254);
			for (@Pc(52) int local52 = 0; local52 < Static608.width; local52++) {
				@Pc(64) int local64 = super.anIntArray641[local52 % super.anInt8251 + local50];
				local42[local52] = (local64 & 0xFF) << 4;
				local38[local52] = local64 >> 4 & 0xFF0;
				local34[local52] = local64 >> 12 & 0xFF0;
			}
		}
		return local20;
	}
}
