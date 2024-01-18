import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class TextureOpVerticalGradient extends TextureOp {

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public TextureOpVerticalGradient() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(9) int[] dest = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			Static734.fill(dest, 0, Static608.width, Static273.normalizedY[y]);
		}
		return dest;
	}
}
