import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class TextureOpVoronoiNoise extends TextureOp {

	@OriginalMember(owner = "client!or", name = "ab", descriptor = "I")
	private int anInt7120 = 2048;

	@OriginalMember(owner = "client!or", name = "G", descriptor = "I")
	private int anInt7125 = 2;

	@OriginalMember(owner = "client!or", name = "T", descriptor = "I")
	private int anInt7126 = 5;

	@OriginalMember(owner = "client!or", name = "I", descriptor = "[S")
	private short[] aShortArray104 = new short[512];

	@OriginalMember(owner = "client!or", name = "M", descriptor = "I")
	private int anInt7124 = 1;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "[B")
	private byte[] aByteArray84 = new byte[512];

	@OriginalMember(owner = "client!or", name = "V", descriptor = "I")
	private int anInt7131 = 5;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "I")
	private int anInt7127 = 0;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public TextureOpVoronoiNoise() {
		super(0, true);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)V")
	private void method6389() {
		@Pc(12) Random local12 = new Random(this.anInt7127);
		this.aShortArray104 = new short[512];
		if (this.anInt7120 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray104[local31] = (short) Static623.nextInt(this.anInt7120, local12);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt7126 = this.anInt7131 = buf.g1();
		} else if (code == 1) {
			this.anInt7127 = buf.g1();
		} else if (code == 2) {
			this.anInt7120 = buf.g2();
		} else if (code == 3) {
			this.anInt7125 = buf.g1();
		} else if (code == 4) {
			this.anInt7124 = buf.g1();
		} else if (code == 5) {
			this.anInt7126 = buf.g1();
		} else if (code == 6) {
			this.anInt7131 = buf.g1();
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		this.aByteArray84 = TextureOp.getPermutation(this.anInt7127);
		this.method6389();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(34) int local34 = Static273.normalizedY[y] * this.anInt7131 + 2048;
			@Pc(38) int local38 = local34 >> 12;
			@Pc(42) int local42 = local38 + 1;
			for (@Pc(44) int local44 = 0; local44 < Static608.width; local44++) {
				Static162.anInt2807 = Integer.MAX_VALUE;
				Static109.anInt2187 = Integer.MAX_VALUE;
				Static417.anInt6422 = Integer.MAX_VALUE;
				Static143.anInt4067 = Integer.MAX_VALUE;
				@Pc(63) int local63 = this.anInt7126 * Static54.normalizedX[local44] + 2048;
				@Pc(67) int local67 = local63 >> 12;
				@Pc(71) int local71 = local67 + 1;
				@Pc(163) int local163;
				for (@Pc(75) int local75 = local38 - 1; local75 <= local42; local75++) {
					@Pc(99) int local99 = this.aByteArray84[(this.anInt7131 > local75 ? local75 : local75 - this.anInt7131) & 0xFF] & 0xFF;
					for (@Pc(103) int local103 = local67 - 1; local103 <= local71; local103++) {
						@Pc(135) int local135 = (this.aByteArray84[local99 + (local103 >= this.anInt7126 ? local103 - this.anInt7126 : local103) & 0xFF] & 0xFF) * 2;
						@Pc(139) int local139 = -(local103 << 12);
						@Pc(143) int local143 = local135 + 1;
						@Pc(148) int local148 = local139 + local63 - this.aShortArray104[local135];
						@Pc(160) int local160 = local34 - (local75 << 12) - this.aShortArray104[local143];
						local163 = this.anInt7124;
						@Pc(206) int local206;
						if (local163 == 1) {
							local206 = local148 * local148 + local160 * local160 >> 12;
						} else if (local163 == 3) {
							local148 = local148 >= 0 ? local148 : -local148;
							local160 = local160 >= 0 ? local160 : -local160;
							local206 = local148 <= local160 ? local160 : local148;
						} else if (local163 == 4) {
							local148 = (int) (Math.sqrt((float) (local148 < 0 ? -local148 : local148) / 4096.0F) * 4096.0D);
							local160 = (int) (Math.sqrt((float) (local160 < 0 ? -local160 : local160) / 4096.0F) * 4096.0D);
							local206 = local160 + local148;
							local206 = local206 * local206 >> 12;
						} else if (local163 == 5) {
							local160 *= local160;
							local148 *= local148;
							local206 = (int) (Math.sqrt(Math.sqrt((float) (local160 + local148) / 1.6777216E7F)) * 4096.0D);
						} else if (local163 == 2) {
							local206 = (local148 >= 0 ? local148 : -local148) + (local160 < 0 ? -local160 : local160);
						} else {
							local206 = (int) (Math.sqrt((float) (local160 * local160 + local148 * local148) / 1.6777216E7F) * 4096.0D);
						}
						if (local206 < Static143.anInt4067) {
							Static162.anInt2807 = Static109.anInt2187;
							Static109.anInt2187 = Static417.anInt6422;
							Static417.anInt6422 = Static143.anInt4067;
							Static143.anInt4067 = local206;
						} else if (local206 < Static417.anInt6422) {
							Static162.anInt2807 = Static109.anInt2187;
							Static109.anInt2187 = Static417.anInt6422;
							Static417.anInt6422 = local206;
						} else if (local206 < Static109.anInt2187) {
							Static162.anInt2807 = Static109.anInt2187;
							Static109.anInt2187 = local206;
						} else if (local206 < Static162.anInt2807) {
							Static162.anInt2807 = local206;
						}
					}
				}
				local163 = this.anInt7125;
				if (local163 == 0) {
					local11[local44] = Static143.anInt4067;
				} else if (local163 == 1) {
					local11[local44] = Static417.anInt6422;
				} else if (local163 == 3) {
					local11[local44] = Static109.anInt2187;
				} else if (local163 == 4) {
					local11[local44] = Static162.anInt2807;
				} else if (local163 == 2) {
					local11[local44] = Static417.anInt6422 - Static143.anInt4067;
				}
			}
		}
		return local11;
	}
}
