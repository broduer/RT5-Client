import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!so", name = "Y", descriptor = "[S")
	private short[] aShortArray127;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "[S")
	private short[] aShortArray128;

	@OriginalMember(owner = "client!so", name = "P", descriptor = "[B")
	private byte[] aByteArray97 = new byte[512];

	@OriginalMember(owner = "client!so", name = "I", descriptor = "Z")
	public boolean aBoolean668 = true;

	@OriginalMember(owner = "client!so", name = "V", descriptor = "I")
	public int anInt8827 = 4;

	@OriginalMember(owner = "client!so", name = "W", descriptor = "I")
	public int anInt8829 = 4;

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "I")
	public int anInt8823 = 1638;

	@OriginalMember(owner = "client!so", name = "T", descriptor = "I")
	public int anInt8834 = 4;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	public int anInt8833 = 0;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[II)V")
	public void method7816(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(15) int local15 = this.anInt8829 * Static273.anIntArray341[arg0];
		@Pc(103) int local103;
		@Pc(117) int local117;
		@Pc(31) int local31;
		@Pc(24) short local24;
		@Pc(95) int local95;
		@Pc(37) int local37;
		@Pc(51) int local51;
		@Pc(44) int local44;
		@Pc(81) int local81;
		@Pc(55) int local55;
		@Pc(59) int local59;
		@Pc(77) int local77;
		@Pc(90) int local90;
		if (this.anInt8827 == 1) {
			local24 = this.aShortArray128[0];
			local31 = this.aShortArray127[0] << 12;
			local37 = local15 * local31 >> 12;
			local44 = this.anInt8829 * local31 >> 12;
			local51 = this.anInt8834 * local31 >> 12;
			local55 = local37 >> 12;
			local59 = local55 + 1;
			local37 &= 0xFFF;
			if (local44 <= local59) {
				local59 = 0;
			}
			local77 = this.aByteArray97[local55 & 0xFF] & 0xFF;
			local81 = Class2_Sub2_Sub19.anIntArray768[local37];
			local90 = this.aByteArray97[local59 & 0xFF] & 0xFF;
			if (this.aBoolean668) {
				for (local95 = 0; local95 < Static608.anInt9315; local95++) {
					local103 = this.anInt8834 * Static54.anIntArray92[local95];
					local117 = this.method7819(local51, local77, local31 * local103 >> 12, local37, local81, local90);
					local117 = local117 * local24 >> 12;
					arg1[local95] = (local117 >> 1) + 2048;
				}
			} else {
				for (local95 = 0; local95 < Static608.anInt9315; local95++) {
					local103 = Static54.anIntArray92[local95] * this.anInt8834;
					local117 = this.method7819(local51, local77, local31 * local103 >> 12, local37, local81, local90);
					arg1[local95] = local117 * local24 >> 12;
				}
			}
			return;
		}
		local24 = this.aShortArray128[0];
		if (local24 > 8 || local24 < -8) {
			local31 = this.aShortArray127[0] << 12;
			local51 = local31 * this.anInt8834 >> 12;
			local37 = local31 * local15 >> 12;
			local44 = this.anInt8829 * local31 >> 12;
			local55 = local37 >> 12;
			local59 = local55 + 1;
			if (local44 <= local59) {
				local59 = 0;
			}
			local37 &= 0xFFF;
			local77 = this.aByteArray97[local55 & 0xFF] & 0xFF;
			local81 = Class2_Sub2_Sub19.anIntArray768[local37];
			local90 = this.aByteArray97[local59 & 0xFF] & 0xFF;
			for (local95 = 0; local95 < Static608.anInt9315; local95++) {
				local103 = this.anInt8834 * Static54.anIntArray92[local95];
				local117 = this.method7819(local51, local77, local103 * local31 >> 12, local37, local81, local90);
				arg1[local95] = local117 * local24 >> 12;
			}
		}
		for (@Pc(301) int local301 = 1; local301 < this.anInt8827; local301++) {
			local24 = this.aShortArray128[local301];
			if (local24 > 8 || local24 < -8) {
				local31 = this.aShortArray127[local301] << 12;
				local51 = local31 * this.anInt8834 >> 12;
				local44 = local31 * this.anInt8829 >> 12;
				local37 = local31 * local15 >> 12;
				local55 = local37 >> 12;
				local59 = local55 + 1;
				local37 &= 0xFFF;
				if (local44 <= local59) {
					local59 = 0;
				}
				local90 = this.aByteArray97[local59 & 0xFF] & 0xFF;
				local81 = Class2_Sub2_Sub19.anIntArray768[local37];
				local77 = this.aByteArray97[local55 & 0xFF] & 0xFF;
				if (this.aBoolean668 && this.anInt8827 - 1 == local301) {
					for (local95 = 0; local95 < Static608.anInt9315; local95++) {
						local103 = Static54.anIntArray92[local95] * this.anInt8834;
						local117 = this.method7819(local51, local77, local103 * local31 >> 12, local37, local81, local90);
						local117 = (local117 * local24 >> 12) + arg1[local95];
						arg1[local95] = (local117 >> 1) + 2048;
					}
				} else {
					for (local95 = 0; local95 < Static608.anInt9315; local95++) {
						local103 = Static54.anIntArray92[local95] * this.anInt8834;
						local117 = this.method7819(local51, local77, local31 * local103 >> 12, local37, local81, local90);
						arg1[local95] += local117 * local24 >> 12;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(1) int arg1) {
		@Pc(9) int[] local9 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			this.method7816(arg1, local9);
		}
		return local9;
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		this.aByteArray97 = Static694.method9034(this.anInt8833);
		this.method7820();
		@Pc(19) int local19 = this.anInt8827 - 1;
		while (local19 >= 1) {
			@Pc(29) short local29 = this.aShortArray128[local19];
			if (local29 > 8) {
				return;
			}
			if (local29 < -8) {
				return;
			}
			this.anInt8827--;
			local19--;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.aBoolean668 = arg1.method7403() == 1;
		} else if (arg2 == 1) {
			this.anInt8827 = arg1.method7403();
		} else if (arg2 == 2) {
			this.anInt8823 = arg1.method7363();
			if (this.anInt8823 < 0) {
				this.aShortArray128 = new short[this.anInt8827];
				for (@Pc(103) int local103 = 0; local103 < this.anInt8827; local103++) {
					this.aShortArray128[local103] = (short) arg1.method7363();
				}
				return;
			}
		} else if (arg2 == 3) {
			this.anInt8834 = this.anInt8829 = arg1.method7403();
			return;
		} else if (arg2 == 4) {
			this.anInt8833 = arg1.method7403();
			return;
		} else if (arg2 == 5) {
			this.anInt8834 = arg1.method7403();
			return;
		} else if (arg2 == 6) {
			this.anInt8829 = arg1.method7403();
			return;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIIII)I")
	private int method7819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 >> 12;
		@Pc(11) int local11 = local7 + 1;
		@Pc(15) int local15 = arg2 & 0xFFF;
		if (arg0 <= local11) {
			local11 = 0;
		}
		local7 &= 0xFF;
		@Pc(32) int local32 = local15 - 4096;
		local11 &= 0xFF;
		@Pc(40) int local40 = arg3 - 4096;
		@Pc(44) int local44 = Class2_Sub2_Sub19.anIntArray768[local15];
		@Pc(63) int local63 = this.aByteArray97[arg1 + local7] & 0x3;
		@Pc(82) int local82;
		if (local63 <= 1) {
			local82 = local63 == 0 ? local15 + arg3 : -local15 + arg3;
		} else {
			local82 = local63 == 2 ? local15 - arg3 : -arg3 + -local15;
		}
		local63 = this.aByteArray97[local11 + arg1] & 0x3;
		@Pc(131) int local131;
		if (local63 > 1) {
			local131 = local63 == 2 ? local32 - arg3 : -arg3 + -local32;
		} else {
			local131 = local63 == 0 ? arg3 + local32 : -local32 + arg3;
		}
		local63 = this.aByteArray97[local7 + arg5] & 0x3;
		@Pc(164) int local164 = ((local131 - local82) * local44 >> 12) + local82;
		if (local63 <= 1) {
			local82 = local63 == 0 ? local40 + local15 : local40 + -local15;
		} else {
			local82 = local63 == 2 ? local15 - local40 : -local15 + -local40;
		}
		local63 = this.aByteArray97[arg5 + local11] & 0x3;
		if (local63 > 1) {
			local131 = local63 == 2 ? local32 - local40 : -local32 + -local40;
		} else {
			local131 = local63 == 0 ? local40 + local32 : -local32 + local40;
		}
		@Pc(259) int local259 = local82 + (local44 * (local131 - local82) >> 12);
		return (arg4 * (local259 - local164) >> 12) + local164;
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(I)V")
	private void method7820() {
		@Pc(17) int local17;
		if (this.anInt8823 > 0) {
			this.aShortArray127 = new short[this.anInt8827];
			this.aShortArray128 = new short[this.anInt8827];
			for (local17 = 0; local17 < this.anInt8827; local17++) {
				this.aShortArray128[local17] = (short) (int) (Math.pow((float) this.anInt8823 / 4096.0F, local17) * 4096.0D);
				this.aShortArray127[local17] = (short) (int) Math.pow(2.0D, local17);
			}
		} else if (this.aShortArray128 != null && this.anInt8827 == this.aShortArray128.length) {
			this.aShortArray127 = new short[this.anInt8827];
			for (local17 = 0; local17 < this.anInt8827; local17++) {
				this.aShortArray127[local17] = (short) (int) Math.pow(2.0D, local17);
			}
		}
	}
}
