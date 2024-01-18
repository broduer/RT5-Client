import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class TextureOpMonochrome extends TextureOp {

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	public TextureOpMonochrome() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(17) int[] local17 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(27) int[][] local27 = this.method9420(0, y);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			for (@Pc(41) int local41 = 0; local41 < Static608.width; local41++) {
				local17[local41] = (local39[local41] + local31[local41] + local35[local41]) / 3;
			}
		}
		return local17;
	}
}
