import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class2_Sub1_Sub23 extends Class2_Sub1 {

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
	public Class2_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(B)V")
	private void method6389() {
		@Pc(12) Random local12 = new Random((long) this.anInt7127);
		this.aShortArray104 = new short[512];
		if (this.anInt7120 > 0) {
			for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
				this.aShortArray104[local31] = (short) Static623.method8333(-5208, this.anInt7120, local12);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			return;
		}
		if (arg2 == 0) {
			this.anInt7126 = this.anInt7131 = arg1.method7403();
		} else if (arg2 == 1) {
			this.anInt7127 = arg1.method7403();
		} else if (arg2 == 2) {
			this.anInt7120 = arg1.method7389();
		} else if (arg2 == 3) {
			this.anInt7125 = arg1.method7403();
		} else if (arg2 == 4) {
			this.anInt7124 = arg1.method7403();
		} else if (arg2 == 5) {
			this.anInt7126 = arg1.method7403();
		} else if (arg2 == 6) {
			this.anInt7131 = arg1.method7403();
		}
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)V")
	@Override
	public void method9428(@OriginalArg(0) int arg0) {
		this.aByteArray84 = Static694.method9034(this.anInt7127);
		if (arg0 != 7) {
			this.anInt7131 = 6;
		}
		this.method6389();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (arg0 <= 107) {
			Static470.method6390((Class158) null, -42, 121, -79);
		}
		if (super.aClass180_41.aBoolean338) {
			@Pc(34) int local34 = Static273.anIntArray341[arg1] * this.anInt7131 + 2048;
			@Pc(38) int local38 = local34 >> 12;
			@Pc(42) int local42 = local38 + 1;
			for (@Pc(44) int local44 = 0; local44 < Static608.anInt9315; local44++) {
				Static162.anInt2807 = Integer.MAX_VALUE;
				Static109.anInt2187 = Integer.MAX_VALUE;
				Static417.anInt6422 = Integer.MAX_VALUE;
				Static143.anInt4067 = Integer.MAX_VALUE;
				@Pc(63) int local63 = this.anInt7126 * Static54.anIntArray92[local44] + 2048;
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
							local148 = (int) (Math.sqrt((double) ((float) (local148 < 0 ? -local148 : local148) / 4096.0F)) * 4096.0D);
							local160 = (int) (Math.sqrt((double) ((float) (local160 < 0 ? -local160 : local160) / 4096.0F)) * 4096.0D);
							local206 = local160 + local148;
							local206 = local206 * local206 >> 12;
						} else if (local163 == 5) {
							local160 *= local160;
							local148 *= local148;
							local206 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local160 + local148) / 1.6777216E7F))) * 4096.0D);
						} else if (local163 == 2) {
							local206 = (local148 >= 0 ? local148 : -local148) + (local160 < 0 ? -local160 : local160);
						} else {
							local206 = (int) (Math.sqrt((double) ((float) (local160 * local160 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
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
