import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class TextureOpFlip extends TextureOp {

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "Z")
	private boolean aBoolean811 = true;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "Z")
	private boolean aBoolean810 = true;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
	public TextureOpFlip() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.aBoolean810 = buf.g1() == 1;
		} else if (code == 1) {
			this.aBoolean811 = buf.g1() == 1;
		} else if (code == 2) {
			super.monochrome = buf.g1() == 1;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(18) int[][] local18 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(39) int[][] local39 = this.method9420(0, this.aBoolean811 ? Static489.anInt7364 - y : y);
			@Pc(43) int[] local43 = local39[0];
			@Pc(47) int[] local47 = local39[1];
			@Pc(51) int[] local51 = local39[2];
			@Pc(55) int[] local55 = local18[0];
			@Pc(59) int[] local59 = local18[1];
			@Pc(63) int[] local63 = local18[2];
			@Pc(68) int local68;
			if (this.aBoolean810) {
				for (local68 = 0; local68 < Static608.width; local68++) {
					local55[local68] = local43[Static576.anInt8604 - local68];
					local59[local68] = local47[Static576.anInt8604 - local68];
					local63[local68] = local51[Static576.anInt8604 - local68];
				}
			} else {
				for (local68 = 0; local68 < Static608.width; local68++) {
					local55[local68] = local43[local68];
					local59[local68] = local47[local68];
					local63[local68] = local51[local68];
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(37) int[] local37 = this.method9429(this.aBoolean811 ? Static489.anInt7364 - y : y, 0);
			if (this.aBoolean810) {
				for (@Pc(52) int local52 = 0; local52 < Static608.width; local52++) {
					local11[local52] = local37[Static576.anInt8604 - local52];
				}
			} else {
				Static734.method7702(local37, 0, local11, 0, Static608.width);
			}
		}
		return local11;
	}
}
