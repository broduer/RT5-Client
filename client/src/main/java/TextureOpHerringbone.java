import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class TextureOpHerringbone extends TextureOp {

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
	private int anInt10921 = 1;

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
	private int anInt10922 = 204;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
	private int anInt10924 = 1;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public TextureOpHerringbone() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt10924 = buf.g1();
		} else if (code == 1) {
			this.anInt10921 = buf.g1();
		} else if (code == 2) {
			this.anInt10922 = buf.g2();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			for (@Pc(17) int local17 = 0; local17 < Static608.width; local17++) {
				@Pc(23) int local23 = Static54.normalizedX[local17];
				@Pc(27) int local27 = Static273.normalizedY[y];
				@Pc(34) int local34 = local23 * this.anInt10924 >> 12;
				@Pc(41) int local41 = local27 * this.anInt10921 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt10924) * this.anInt10924;
				@Pc(61) int local61 = this.anInt10921 * (local27 % (4096 / this.anInt10921));
				if (local61 < this.anInt10922) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt10922) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt10922) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
