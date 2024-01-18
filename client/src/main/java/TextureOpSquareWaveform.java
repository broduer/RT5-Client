import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tia")
public final class TextureOpSquareWaveform extends TextureOp {

	@OriginalMember(owner = "client!tia", name = "S", descriptor = "[Ljava/awt/Rectangle;")
	public static Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!tia", name = "F", descriptor = "[I")
	private int[] anIntArray724;

	@OriginalMember(owner = "client!tia", name = "O", descriptor = "[I")
	private int[] anIntArray725;

	@OriginalMember(owner = "client!tia", name = "K", descriptor = "I")
	private int anInt9434 = 2048;

	@OriginalMember(owner = "client!tia", name = "Q", descriptor = "I")
	private int anInt9435 = 0;

	@OriginalMember(owner = "client!tia", name = "N", descriptor = "I")
	private int anInt9441 = 10;

	static {
		for (@Pc(87) int local87 = 0; local87 < 100; local87++) {
			aRectangleArray1[local87] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "()V")
	public TextureOpSquareWaveform() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt9441 = buf.g1();
		} else if (code == 1) {
			this.anInt9434 = buf.g2();
		} else if (code == 2) {
			this.anInt9435 = buf.g1();
		}
	}

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V")
	private void method8289() {
		this.anIntArray725 = new int[this.anInt9441 + 1];
		this.anIntArray724 = new int[this.anInt9441 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt9441;
		@Pc(33) int local33 = local26 * this.anInt9434 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9441; local35++) {
			this.anIntArray724[local35] = local21;
			this.anIntArray725[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray724[this.anInt9441] = 4096;
		this.anIntArray725[this.anInt9441] = this.anIntArray725[0] + 4096;
	}

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(II)[I")
	@Override
	public int[] getMonochromeOutput(@OriginalArg(1) int y) {
		@Pc(11) int[] local11 = super.monochromeImageCache.get(y);
		if (super.monochromeImageCache.invalid) {
			@Pc(26) int local26 = Static273.normalizedY[y];
			@Pc(35) int local35;
			if (this.anInt9435 == 0) {
				@Pc(153) short local153 = 0;
				for (local35 = 0; local35 < this.anInt9441; local35++) {
					if (this.anIntArray724[local35] <= local26 && this.anIntArray724[local35 + 1] > local26) {
						if (this.anIntArray725[local35] > local26) {
							local153 = 4096;
						}
						break;
					}
				}
				Static734.fill(local11, 0, Static608.width, local153);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static608.width; local31++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static54.normalizedX[local31];
					@Pc(44) int local44 = this.anInt9435;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local41 + local26 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local26 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt9441; local44++) {
						if (local35 >= this.anIntArray724[local44] && local35 < this.anIntArray724[local44 + 1]) {
							if (this.anIntArray725[local44] > local35) {
								local37 = 4096;
							}
							break;
						}
					}
					local11[local31] = local37;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tia", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		this.method8289();
	}
}
