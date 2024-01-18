import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class TextureOpWaveform extends TextureOp {

	@OriginalMember(owner = "client!bu", name = "F", descriptor = "I")
	private int anInt1173 = 1;

	@OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
	private int anInt1178 = 0;

	@OriginalMember(owner = "client!bu", name = "P", descriptor = "I")
	private int anInt1177 = 0;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public TextureOpWaveform() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] local19 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(27) int local27 = Static273.normalizedY[y];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static608.width; local35++) {
				@Pc(41) int local41 = Static54.normalizedX[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(58) int local58;
				if (this.anInt1178 == 0) {
					local58 = this.anInt1173 * (local41 - local27);
				} else {
					@Pc(70) int local70 = local47 * local47 + local33 * local33 >> 12;
					local58 = (int) (Math.sqrt((float) local70 / 4096.0F) * 4096.0D);
					local58 = (int) ((double) (local58 * this.anInt1173) * 3.141592653589793D);
				}
				local58 -= local58 & 0xFFFFF000;
				if (this.anInt1177 == 0) {
					local58 = TextureOp.SINE[local58 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1177 == 2) {
					local58 -= 2048;
					if (local58 < 0) {
						local58 = -local58;
					}
					local58 = 2048 - local58 << 1;
				}
				local19[local35] = local58;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		TextureOp.createTrigonometryTables();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt1178 = buf.g1();
		} else if (code == 1) {
			this.anInt1177 = buf.g1();
		} else if (code == 3) {
			this.anInt1173 = buf.g1();
		}
	}
}
