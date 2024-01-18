import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class TextureOpRange extends TextureOp {

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "I")
	private int anInt4968 = 1024;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "I")
	private int anInt4973 = 2048;

	@OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
	private int anInt4971 = 3072;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public TextureOpRange() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		this.anInt4973 = this.anInt4971 - this.anInt4968;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(21) int[][] local21 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(31) int[][] local31 = this.method9420(0, y);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static608.width; local57++) {
				local47[local57] = this.anInt4968 + (local35[local57] * this.anInt4973 >> 12);
				local51[local57] = (this.anInt4973 * local39[local57] >> 12) + this.anInt4968;
				local55[local57] = (this.anInt4973 * local43[local57] >> 12) + this.anInt4968;
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.method9429(y, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.width; local23++) {
				local11[local23] = (this.anInt4973 * local21[local23] >> 12) + this.anInt4968;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt4968 = buf.g2();
		} else if (code == 1) {
			this.anInt4971 = buf.g2();
		} else if (code == 2) {
			super.monochrome = buf.g1() == 1;
		}
	}
}
