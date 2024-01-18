import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class TextureOpPolarDistortion extends TextureOp {

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
	private int anInt3306 = 32768;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public TextureOpPolarDistortion() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(19) int[][] local19 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(29) int[] local29 = this.method9429(y, 1);
			@Pc(35) int[] local35 = this.method9429(y, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static608.width; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt3306 >> 12;
				@Pc(78) int local78 = TextureOp.COSINE[local61] * local70 >> 12;
				@Pc(86) int local86 = TextureOp.SINE[local61] * local70 >> 12;
				@Pc(95) int local95 = Static576.anInt8604 & local49 + (local78 >> 12);
				@Pc(103) int local103 = Static489.anInt7364 & (local86 >> 12) + y;
				@Pc(109) int[][] local109 = this.method9420(0, local103);
				local39[local49] = local109[0][local95];
				local43[local49] = local109[1][local95];
				local47[local49] = local109[2][local95];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3306 = buf.g2() << 4;
		} else if (code == 1) {
			super.monochrome = buf.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(19) int[] local19 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(29) int[] local29 = this.method9429(y, 1);
			@Pc(35) int[] local35 = this.method9429(y, 2);
			for (@Pc(37) int local37 = 0; local37 < Static608.width; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt3306 * local35[local37] >> 12;
				@Pc(64) int local64 = TextureOp.COSINE[local47] * local56 >> 12;
				@Pc(72) int local72 = TextureOp.SINE[local47] * local56 >> 12;
				@Pc(80) int local80 = Static576.anInt8604 & local37 + (local64 >> 12);
				@Pc(88) int local88 = y + (local72 >> 12) & Static489.anInt7364;
				@Pc(94) int[] local94 = this.method9429(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		TextureOp.createTrigonometryTables();
	}
}
