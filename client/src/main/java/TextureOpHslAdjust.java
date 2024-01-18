import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class TextureOpHslAdjust extends TextureOp {

	@OriginalMember(owner = "client!fp", name = "U", descriptor = "I")
	private int anInt3087;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
	private int anInt3089;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
	private int anInt3095;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "I")
	private int anInt3097;

	@OriginalMember(owner = "client!fp", name = "W", descriptor = "I")
	private int anInt3099;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
	private int anInt3096 = 0;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
	private int anInt3101 = 0;

	@OriginalMember(owner = "client!fp", name = "V", descriptor = "I")
	private int anInt3088 = 0;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public TextureOpHslAdjust() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void decode(@OriginalArg(1) Buffer buf, @OriginalArg(2) int code) {
		if (code == 0) {
			this.anInt3101 = buf.method7363();
		} else if (code == 1) {
			this.anInt3096 = (buf.g1b() << 12) / 100;
		} else if (code == 2) {
			this.anInt3088 = (buf.g1b() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIII)V")
	private void method2841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : (arg1 + 4096) * arg2 >> 12;
		if (local31 <= 0) {
			this.anInt3095 = this.anInt3093 = this.anInt3099 = arg2;
			return;
		}
		@Pc(37) int local37 = arg0 * 6;
		@Pc(44) int local44 = arg2 + arg2 - local31;
		@Pc(52) int local52 = (local31 - local44 << 12) / local31;
		@Pc(56) int local56 = local37 >> 12;
		@Pc(63) int local63 = local37 - (local56 << 12);
		@Pc(71) int local71 = local31 * local52 >> 12;
		@Pc(77) int local77 = local63 * local71 >> 12;
		@Pc(82) int local82 = local44 + local77;
		@Pc(87) int local87 = local31 - local77;
		if (local56 == 0) {
			this.anInt3095 = local31;
			this.anInt3093 = local82;
			this.anInt3099 = local44;
			return;
		}
		if (local56 == 1) {
			this.anInt3095 = local87;
			this.anInt3099 = local44;
			this.anInt3093 = local31;
			return;
		}
		if (local56 == 2) {
			this.anInt3099 = local82;
			this.anInt3093 = local31;
			this.anInt3095 = local44;
			return;
		}
		if (local56 == 3) {
			this.anInt3099 = local31;
			this.anInt3095 = local44;
			this.anInt3093 = local87;
			return;
		}
		if (local56 == 4) {
			this.anInt3095 = local82;
			this.anInt3099 = local31;
			this.anInt3093 = local44;
			return;
		}
		if (local56 == 5) {
			this.anInt3095 = local31;
			this.anInt3099 = local87;
			this.anInt3093 = local44;
			return;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBII)V")
	private void method2845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg2 < arg0 ? arg0 : arg2;
		@Pc(25) int local25 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(33) int local33 = arg1 > local17 ? arg1 : local17;
		@Pc(45) int local45 = arg1 >= local25 ? local25 : arg1;
		this.anInt3089 = (local33 + local45) / 2;
		@Pc(57) int local57 = local33 - local45;
		if (local57 > 0) {
			@Pc(76) int local76 = (local33 - arg0 << 12) / local57;
			@Pc(85) int local85 = (local33 - arg2 << 12) / local57;
			@Pc(94) int local94 = (local33 - arg1 << 12) / local57;
			if (local33 == arg0) {
				this.anInt3097 = arg2 == local45 ? local94 + 20480 : -local85 + 4096;
			} else if (local33 == arg2) {
				this.anInt3097 = local45 == arg1 ? local76 + 4096 : -local94 + 12288;
			} else {
				this.anInt3097 = local45 == arg0 ? local85 + 12288 : -local76 + 20480;
			}
			this.anInt3097 /= 6;
		} else {
			this.anInt3097 = 0;
		}
		if (this.anInt3089 > 0 && this.anInt3089 < 4096) {
			this.anInt3087 = (local57 << 12) / (this.anInt3089 > 2048 ? 8192 - this.anInt3089 * 2 : this.anInt3089 * 2);
		} else {
			this.anInt3087 = 0;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] getColorOutput(@OriginalArg(0) int y) {
		@Pc(22) int[][] local22 = super.colorImageCache.get(y);
		if (super.colorImageCache.invalid) {
			@Pc(32) int[][] local32 = this.method9420(0, y);
			@Pc(36) int[] local36 = local32[0];
			@Pc(40) int[] local40 = local32[1];
			@Pc(44) int[] local44 = local32[2];
			@Pc(48) int[] local48 = local22[0];
			@Pc(52) int[] local52 = local22[1];
			@Pc(56) int[] local56 = local22[2];
			for (@Pc(58) int local58 = 0; local58 < Static608.width; local58++) {
				this.method2845(local36[local58], local44[local58], local40[local58]);
				this.anInt3089 += this.anInt3088;
				this.anInt3087 += this.anInt3096;
				for (this.anInt3097 += this.anInt3101; this.anInt3097 < 0; this.anInt3097 += 4096) {
				}
				while (this.anInt3097 > 4096) {
					this.anInt3097 -= 4096;
				}
				if (this.anInt3087 < 0) {
					this.anInt3087 = 0;
				}
				if (this.anInt3089 < 0) {
					this.anInt3089 = 0;
				}
				if (this.anInt3087 > 4096) {
					this.anInt3087 = 4096;
				}
				if (this.anInt3089 > 4096) {
					this.anInt3089 = 4096;
				}
				this.method2841(this.anInt3097, this.anInt3087, this.anInt3089);
				local48[local58] = this.anInt3095;
				local52[local58] = this.anInt3093;
				local56[local58] = this.anInt3099;
			}
		}
		return local22;
	}
}
