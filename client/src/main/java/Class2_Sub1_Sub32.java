import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
	private int anInt10043 = 3216;

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
	private int anInt10044 = 3216;

	@OriginalMember(owner = "client!vda", name = "P", descriptor = "I")
	private int anInt10042 = 4096;

	@OriginalMember(owner = "client!vda", name = "S", descriptor = "[I")
	private final int[] anIntArray789 = new int[3];

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt10042 = arg1.method7389();
		} else if (arg2 == 1) {
			this.anInt10043 = arg1.method7389();
		} else if (arg2 == 2) {
			this.anInt10044 = arg1.method7389();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(22) int local22 = Static675.anInt10185 * this.anInt10042 >> 12;
			@Pc(32) int[] local32 = this.method9429(Static489.anInt7364 & arg1 - 1, 0);
			@Pc(38) int[] local38 = this.method9429(arg1, 0);
			@Pc(48) int[] local48 = this.method9429(arg1 + 1 & Static489.anInt7364, 0);
			for (@Pc(50) int local50 = 0; local50 < Static608.anInt9315; local50++) {
				@Pc(65) int local65 = local22 * (local48[local50] - local32[local50]) >> 12;
				@Pc(86) int local86 = (local38[Static576.anInt8604 & local50 - 1] - local38[Static576.anInt8604 & local50 + 1]) * local22 >> 12;
				@Pc(90) int local90 = local86 >> 4;
				if (local90 < 0) {
					local90 = -local90;
				}
				@Pc(99) int local99 = local65 >> 4;
				if (local90 > 255) {
					local90 = 255;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(133) int local133 = Class2_Sub28.aByteArray103[local90 + ((local99 + 1) * local99 >> 1)] & 0xFF;
				@Pc(139) int local139 = local86 * local133 >> 8;
				@Pc(145) int local145 = local65 * local133 >> 8;
				@Pc(151) int local151 = local133 * 4096 >> 8;
				@Pc(160) int local160 = this.anIntArray789[0] * local139 >> 12;
				@Pc(169) int local169 = this.anIntArray789[1] * local145 >> 12;
				@Pc(178) int local178 = local151 * this.anIntArray789[2] >> 12;
				local11[local50] = local178 + local169 + local160;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)V")
	private void method8741() {
		@Pc(11) double local11 = Math.cos((float) this.anInt10044 / 4096.0F);
		this.anIntArray789[0] = (int) (local11 * Math.sin((float) this.anInt10043 / 4096.0F) * 4096.0D);
		this.anIntArray789[1] = (int) (local11 * 4096.0D * Math.cos((float) this.anInt10043 / 4096.0F));
		this.anIntArray789[2] = (int) (Math.sin((float) this.anInt10044 / 4096.0F) * 4096.0D);
		@Pc(76) int local76 = this.anIntArray789[0] * this.anIntArray789[0] >> 12;
		@Pc(88) int local88 = this.anIntArray789[1] * this.anIntArray789[1] >> 12;
		@Pc(100) int local100 = this.anIntArray789[2] * this.anIntArray789[2] >> 12;
		@Pc(113) int local113 = (int) (Math.sqrt(local76 + local88 + local100 >> 12) * 4096.0D);
		if (local113 != 0) {
			this.anIntArray789[0] = (this.anIntArray789[0] << 12) / local113;
			this.anIntArray789[1] = (this.anIntArray789[1] << 12) / local113;
			this.anIntArray789[2] = (this.anIntArray789[2] << 12) / local113;
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		this.method8741();
	}
}
