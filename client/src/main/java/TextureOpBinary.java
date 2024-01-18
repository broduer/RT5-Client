import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cma")
public final class TextureOpBinary extends TextureOp {

	@OriginalMember(owner = "client!cma", name = "K", descriptor = "I")
	private int anInt1808 = 0;

	@OriginalMember(owner = "client!cma", name = "F", descriptor = "I")
	private int anInt1810 = 4096;

	@OriginalMember(owner = "client!cma", name = "<init>", descriptor = "()V")
	public TextureOpBinary() {
		super(1, true);
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.method9429(y, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.width; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt1808 <= local29 && this.anInt1810 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cma", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt1808 = buf.g2();
		} else if (code == 1) {
			this.anInt1810 = buf.g2();
		}
	}
}
