import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!via")
public final class TextureOpMandelbrot extends TextureOp {

	@OriginalMember(owner = "client!via", name = "K", descriptor = "I")
	private int anInt10283 = 1365;

	@OriginalMember(owner = "client!via", name = "I", descriptor = "I")
	private int anInt10282 = 20;

	@OriginalMember(owner = "client!via", name = "G", descriptor = "I")
	private int anInt10284 = 0;

	@OriginalMember(owner = "client!via", name = "L", descriptor = "I")
	private int anInt10286 = 0;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "()V")
	public TextureOpMandelbrot() {
		super(0, true);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt10283 = buf.g2();
		} else if (code == 1) {
			this.anInt10282 = buf.g2();
		} else if (code == 2) {
			this.anInt10284 = buf.g2();
		} else if (code == 3) {
			this.anInt10286 = buf.g2();
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			for (@Pc(17) int local17 = 0; local17 < Static608.width; local17++) {
				@Pc(31) int local31 = this.anInt10284 + (Static54.normalizedX[local17] << 12) / this.anInt10283;
				@Pc(43) int local43 = (Static273.normalizedY[y] << 12) / this.anInt10283 + this.anInt10286;
				@Pc(49) int local49 = local31;
				@Pc(51) int local51 = local43;
				@Pc(57) int local57 = local31 * local31 >> 12;
				@Pc(63) int local63 = local43 * local43 >> 12;
				@Pc(65) int local65 = 0;
				while (local57 + local63 < 16384 && this.anInt10282 > local65) {
					local51 = local43 + (local51 * local49 >> 12) * 2;
					local49 = local31 + local57 - local63;
					local65++;
					local57 = local49 * local49 >> 12;
					local63 = local51 * local51 >> 12;
				}
				local11[local17] = local65 >= this.anInt10282 - 1 ? 0 : (local65 << 12) / this.anInt10282;
			}
		}
		return local11;
	}
}
