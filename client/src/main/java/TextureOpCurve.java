import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class TextureOpCurve extends TextureOp {

	@OriginalMember(owner = "client!wfa", name = "K", descriptor = "[[I")
	private int[][] anIntArrayArray259;

	@OriginalMember(owner = "client!wfa", name = "M", descriptor = "[I")
	private int[] anIntArray860;

	@OriginalMember(owner = "client!wfa", name = "G", descriptor = "[I")
	private int[] anIntArray861;

	@OriginalMember(owner = "client!wfa", name = "O", descriptor = "[S")
	private final short[] aShortArray147 = new short[257];

	@OriginalMember(owner = "client!wfa", name = "R", descriptor = "I")
	private int anInt10666 = 0;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	public TextureOpCurve() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "(I)V")
	private void method9225(@OriginalArg(0) int arg0) {
		@Pc(8) int[] local8 = this.anIntArrayArray259[0];
		@Pc(13) int[] local13 = this.anIntArrayArray259[1];
		@Pc(22) int[] local22 = this.anIntArrayArray259[arg0 + this.anIntArrayArray259.length];
		@Pc(31) int[] local31 = this.anIntArrayArray259[this.anIntArrayArray259.length - 1];
		this.anIntArray861 = new int[] { local8[0] + local8[0] - local13[0], -local13[1] - -local8[1] + local8[1] };
		this.anIntArray860 = new int[] { local22[0] + local22[0] - local31[0], local22[1] + -local31[1] + local22[1] };
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		if (this.anIntArrayArray259 == null) {
			this.anIntArrayArray259 = new int[][] { new int[2], { 4096, 4096 } };
		}
		if (this.anIntArrayArray259.length < 2) {
			throw new RuntimeException("Curve operation requires at least two markers");
		}
		if (this.anInt10666 == 2) {
			this.method9225(7 ^ 0xFFFFFFF9);
		}
		TextureOp.createTrigonometryTables();
		this.method9229();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(21) int[] local21 = this.method9429(y, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.width; local23++) {
				@Pc(31) int local31 = local21[local23] >> 4;
				if (local31 < 0) {
					local31 = 0;
				}
				if (local31 > 256) {
					local31 = 256;
				}
				local11[local23] = this.aShortArray147[local31];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code != 0) {
			return;
		}
		this.anInt10666 = buf.g1();
		this.anIntArrayArray259 = new int[buf.g1()][2];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray259.length; local31++) {
			this.anIntArrayArray259[local31][0] = buf.g2();
			this.anIntArrayArray259[local31][1] = buf.g2();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V")
	private void method9229() {
		@Pc(8) int local8 = this.anInt10666;
		@Pc(30) int local30;
		@Pc(28) int local28;
		@Pc(69) int[] local69;
		@Pc(74) int[] local74;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(100) int local100;
		if (local8 == 2) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; this.anIntArrayArray259.length - 1 > local30 && local28 >= this.anIntArrayArray259[local30][0]; local30++) {
				}
				local69 = this.anIntArrayArray259[local30 - 1];
				local74 = this.anIntArrayArray259[local30];
				local83 = this.method9230(local30 - 2)[1];
				local87 = local69[1];
				local91 = local74[1];
				local100 = this.method9230(local30 + 1)[1];
				@Pc(118) int local118 = (local28 - local69[0] << 12) / (local74[0] - local69[0]);
				@Pc(124) int local124 = local118 * local118 >> 12;
				@Pc(133) int local133 = local100 + local87 - local83 - local91;
				@Pc(141) int local141 = local83 - local87 - local133;
				@Pc(145) int local145 = local91 - local83;
				@Pc(157) int local157 = local124 * (local133 * local118 >> 12) >> 12;
				@Pc(163) int local163 = local124 * local141 >> 12;
				@Pc(169) int local169 = local145 * local118 >> 12;
				@Pc(177) int local177 = local169 + local163 + local157 + local87;
				if (local177 <= -32768) {
					local177 = -32767;
				}
				if (local177 >= 32768) {
					local177 = 32767;
				}
				this.aShortArray147[local8] = (short) local177;
			}
		} else if (local8 == 1) {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << 4;
				for (local30 = 1; local30 < this.anIntArrayArray259.length - 1 && this.anIntArrayArray259[local30][0] <= local28; local30++) {
				}
				local69 = this.anIntArrayArray259[local30 - 1];
				local74 = this.anIntArrayArray259[local30];
				local83 = (local28 - local69[0] << 12) / (local74[0] - local69[0]);
				local87 = 4096 - TextureOp.COSINE[local83 >> 5 & 0xFF] >> 1;
				local91 = 4096 - local87;
				local100 = local87 * local74[1] + local91 * local69[1] >> 12;
				if (local100 <= -32768) {
					local100 = -32767;
				}
				if (local100 >= 32768) {
					local100 = 32767;
				}
				this.aShortArray147[local8] = (short) local100;
			}
		} else {
			for (local8 = 0; local8 < 257; local8++) {
				local28 = local8 << -1753698556;
				for (local30 = 1; local30 < this.anIntArrayArray259.length - 1 && local28 >= this.anIntArrayArray259[local30][0]; local30++) {
				}
				local69 = this.anIntArrayArray259[local30 - 1];
				local74 = this.anIntArrayArray259[local30];
				local83 = (local28 - local69[0] << 12) / (local74[0] - local69[0]);
				local87 = 4096 - local83;
				local91 = local83 * local74[1] + local87 * local69[1] >> 12;
				if (local91 <= -32768) {
					local91 = -32767;
				}
				if (local91 >= 32768) {
					local91 = 32767;
				}
				this.aShortArray147[local8] = (short) local91;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)[I")
	private int[] method9230(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return this.anIntArray861;
		} else if (arg0 >= this.anIntArrayArray259.length) {
			return this.anIntArray860;
		} else {
			return this.anIntArrayArray259[arg0];
		}
	}
}
