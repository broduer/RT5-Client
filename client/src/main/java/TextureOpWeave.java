import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class TextureOpWeave extends TextureOp {

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
	private int anInt9598 = 585;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public TextureOpWeave() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt9598 = buf.g2();
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(25) int[] local25 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(33) int local33 = Static273.normalizedY[y];
			for (@Pc(35) int local35 = 0; local35 < Static608.width; local35++) {
				@Pc(41) int local41 = Static54.normalizedX[local35];
				@Pc(80) int local80;
				if (local41 > this.anInt9598 && local41 < 4096 - this.anInt9598 && local33 > 2048 - this.anInt9598 && local33 < this.anInt9598 + 2048) {
					local80 = 2048 - local41;
					local80 = local80 >= 0 ? local80 : -local80;
					local80 <<= 0xC;
					local80 /= 2048 - this.anInt9598;
					local25[local35] = 4096 - local80;
				} else if (2048 - this.anInt9598 < local41 && local41 < this.anInt9598 + 2048) {
					local80 = local33 - 2048;
					local80 = local80 < 0 ? -local80 : local80;
					local80 -= this.anInt9598;
					local80 <<= 0xC;
					local25[local35] = local80 / (2048 - this.anInt9598);
				} else if (this.anInt9598 > local33 || local33 > 4096 - this.anInt9598) {
					local80 = local41 - 2048;
					@Pc(200) int local200 = local80 < 0 ? -local80 : local80;
					@Pc(205) int local205 = local200 - this.anInt9598;
					@Pc(209) int local209 = local205 << 12;
					local25[local35] = local209 / (2048 - this.anInt9598);
				} else if (this.anInt9598 <= local41 && local41 <= 4096 - this.anInt9598) {
					local25[local35] = 0;
				} else {
					local80 = 2048 - local33;
					local80 = local80 >= 0 ? local80 : -local80;
					local80 <<= 0xC;
					local80 /= 2048 - this.anInt9598;
					local25[local35] = 4096 - local80;
				}
			}
		}
		return local25;
	}
}
