import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class8_Sub8 extends Class8 {

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public int anInt8291;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	private int anInt8295;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
	private int anInt8296;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	private int anInt8297;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "I")
	private int anInt8298;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
	private int anInt8299;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "I")
	private int anInt8300;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "I")
	private int anInt8301;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
	private int anInt8287 = 0;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "Z")
	public boolean aBoolean631 = false;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!iea;")
	public Class177 aClass177_1 = new Class177();

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!iea;")
	private Class177 aClass177_2 = new Class177();

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
	private boolean aBoolean632 = false;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "Lclient!rv;")
	public final Class330 aClass330_1;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "J")
	private final long aLong254;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!hv;")
	public final Class8_Sub5 aClass8_Sub5_6;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "Lclient!vaa;")
	public Class381 aClass381_1;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!fla;")
	public final Class130 aClass130_11;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ha;Lclient!rv;Lclient!hv;J)V")
	public Class8_Sub8(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) Class8_Sub5 arg2, @OriginalArg(3) long arg3) {
		this.aClass330_1 = arg1;
		this.aLong254 = arg3;
		this.aClass8_Sub5_6 = arg2;
		this.aClass381_1 = this.aClass330_1.method7554();
		if (!arg0.method7944() && this.aClass381_1.anInt9906 != -1) {
			this.aClass381_1 = Static444.method6001(this.aClass381_1.anInt9906);
		}
		this.aClass130_11 = new Class130();
		this.anInt8287 = (int) ((double) this.anInt8287 + Math.random() * 64.0D);
		this.method7271();
		this.aClass177_2.anInt4293 = this.aClass177_1.anInt4293;
		this.aClass177_2.anInt4292 = this.aClass177_1.anInt4292;
		this.aClass177_2.anInt4289 = this.aClass177_1.anInt4289;
		this.aClass177_2.anInt4281 = this.aClass177_1.anInt4281;
		this.aClass177_2.anInt4295 = this.aClass177_1.anInt4295;
		this.aClass177_2.anInt4287 = this.aClass177_1.anInt4287;
		this.aClass177_2.anInt4282 = this.aClass177_1.anInt4282;
		this.aClass177_2.anInt4288 = this.aClass177_1.anInt4288;
		this.aClass177_2.anInt4291 = this.aClass177_1.anInt4291;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBZJLclient!ha;)V")
	public void method7268(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) long arg2, @OriginalArg(4) Class19 arg3) {
		@Pc(46) int local46;
		if (this.aBoolean631) {
			arg1 = false;
		} else if (this.aClass381_1.anInt9922 > Static507.anInt7641) {
			arg1 = false;
		} else if (Static164.anIntArray246[Static507.anInt7641] < Static452.anInt6890) {
			arg1 = false;
		} else if (this.aBoolean632) {
			arg1 = false;
		} else if (this.aClass381_1.anInt9948 != -1) {
			local46 = (int) (arg2 - this.aLong254);
			if (this.aClass381_1.aBoolean763 || this.aClass381_1.anInt9948 >= local46) {
				local46 %= this.aClass381_1.anInt9948;
			} else {
				arg1 = false;
			}
			if (!this.aClass381_1.aBoolean762 && local46 < this.aClass381_1.anInt9911) {
				arg1 = false;
			}
			if (this.aClass381_1.aBoolean762 && this.aClass381_1.anInt9911 <= local46) {
				arg1 = false;
			}
		}
		if (arg1) {
			Static424.anInt6479++;
			local46 = (this.aClass177_1.anInt4288 + this.aClass177_1.anInt4291 + this.aClass177_1.anInt4293) / 3;
			@Pc(147) int local147 = (this.aClass177_1.anInt4281 + this.aClass177_1.anInt4292 + this.aClass177_1.anInt4295) / 3;
			@Pc(162) int local162 = (this.aClass177_1.anInt4289 + this.aClass177_1.anInt4282 + this.aClass177_1.anInt4287) / 3;
			@Pc(210) int local210;
			@Pc(218) int local218;
			@Pc(226) int local226;
			@Pc(235) int local235;
			@Pc(244) int local244;
			@Pc(252) int local252;
			@Pc(362) int local362;
			@Pc(414) int local414;
			@Pc(435) int local435;
			if (local46 != this.aClass177_1.anInt4283 || local147 != this.aClass177_1.anInt4290 || this.aClass177_1.anInt4285 != local162) {
				this.aClass177_1.anInt4290 = local147;
				this.aClass177_1.anInt4285 = local162;
				this.aClass177_1.anInt4283 = local46;
				local210 = this.aClass177_1.anInt4293 - this.aClass177_1.anInt4291;
				local218 = this.aClass177_1.anInt4295 - this.aClass177_1.anInt4292;
				local226 = this.aClass177_1.anInt4289 - this.aClass177_1.anInt4282;
				local235 = this.aClass177_1.anInt4288 - this.aClass177_1.anInt4291;
				local244 = this.aClass177_1.anInt4281 - this.aClass177_1.anInt4292;
				local252 = this.aClass177_1.anInt4287 - this.aClass177_1.anInt4282;
				this.anInt8301 = local210 * local244 - local218 * local235;
				this.anInt8298 = local218 * local252 - local226 * local244;
				this.anInt8300 = local235 * local226 - local252 * local210;
				while (true) {
					if (this.anInt8298 <= 32767 && this.anInt8300 <= 32767 && this.anInt8301 <= 32767 && this.anInt8298 >= -32767 && this.anInt8300 >= -32767 && this.anInt8301 >= -32767) {
						local362 = (int) Math.sqrt(this.anInt8298 * this.anInt8298 + this.anInt8300 * this.anInt8300 + this.anInt8301 * this.anInt8301);
						if (local362 <= 0) {
							local362 = 1;
						}
						this.anInt8300 = this.anInt8300 * 32767 / local362;
						this.anInt8298 = this.anInt8298 * 32767 / local362;
						this.anInt8301 = this.anInt8301 * 32767 / local362;
						if (this.aClass381_1.aShort125 > 0 || this.aClass381_1.aShort126 > 0) {
							local414 = (int) (Math.atan2(this.anInt8301, this.anInt8298) * 2607.5945876176133D);
							local435 = (int) (Math.atan2(this.anInt8300, Math.sqrt(this.anInt8298 * this.anInt8298 + this.anInt8301 * this.anInt8301)) * 2607.5945876176133D);
							this.anInt8296 = this.aClass381_1.aShort125 - this.aClass381_1.aShort124;
							this.anInt8295 = this.aClass381_1.aShort124 + local414 - (this.anInt8296 >> 1);
							this.anInt8297 = this.aClass381_1.aShort126 - this.aClass381_1.aShort127;
							this.anInt8299 = this.aClass381_1.aShort127 + local435 - (this.anInt8297 >> 1);
						}
						break;
					}
					this.anInt8301 >>= 0x1;
					this.anInt8298 >>= 0x1;
					this.anInt8300 >>= 0x1;
				}
			}
			this.anInt8287 += (int) (((double) this.aClass381_1.anInt9960 + Math.random() * (double) (this.aClass381_1.anInt9924 - this.aClass381_1.anInt9960)) * (double) arg0);
			if (this.anInt8287 > 63) {
				local210 = this.anInt8287 >> 6;
				this.anInt8287 &= 0x3F;
				for (local244 = 0; local244 < local210; local244++) {
					@Pc(577) int local577;
					@Pc(581) int local581;
					if (this.aClass381_1.aShort125 <= 0 && this.aClass381_1.aShort126 <= 0) {
						local218 = this.anInt8298;
						local235 = this.anInt8301;
						local226 = this.anInt8300;
					} else {
						local252 = (int) ((double) this.anInt8296 * Math.random()) + this.anInt8295;
						local252 &= 0x3FFF;
						local362 = Class114_Sub1.anIntArray741[local252];
						local414 = Class114_Sub1.anIntArray740[local252];
						local435 = this.anInt8299 + (int) ((double) this.anInt8297 * Math.random());
						local435 &= 0x1FFF;
						local577 = Class114_Sub1.anIntArray741[local435];
						local581 = Class114_Sub1.anIntArray740[local435];
						local218 = local414 * local577 >> 13;
						local226 = (local581 << 1) * -1;
						local235 = local577 * local362 >> 13;
					}
					@Pc(615) float local615 = (float) Math.random();
					@Pc(618) float local618 = (float) Math.random();
					if (local618 + local615 > 1.0F) {
						local615 = 1.0F - local615;
						local618 = 1.0F - local618;
					}
					@Pc(639) float local639 = 1.0F - local618 - local615;
					local435 = (int) ((float) this.aClass177_1.anInt4288 * local639 + (float) this.aClass177_1.anInt4293 * local618 + local615 * (float) this.aClass177_1.anInt4291);
					local577 = (int) ((float) this.aClass177_1.anInt4295 * local618 + local615 * (float) this.aClass177_1.anInt4292 + local639 * (float) this.aClass177_1.anInt4281);
					local581 = (int) ((float) this.aClass177_1.anInt4282 * local615 + (float) this.aClass177_1.anInt4289 * local618 + local639 * (float) this.aClass177_1.anInt4287);
					@Pc(727) int local727 = (int) (local639 * (float) this.aClass177_2.anInt4288 + (float) this.aClass177_2.anInt4293 * local618 + (float) this.aClass177_2.anInt4291 * local615);
					@Pc(749) int local749 = (int) (local639 * (float) this.aClass177_2.anInt4281 + local618 * (float) this.aClass177_2.anInt4295 + local615 * (float) this.aClass177_2.anInt4292);
					@Pc(771) int local771 = (int) (local618 * (float) this.aClass177_2.anInt4289 + (float) this.aClass177_2.anInt4282 * local615 + (float) this.aClass177_2.anInt4287 * local639);
					@Pc(776) int local776 = local435 - local727;
					@Pc(780) int local780 = local577 - local749;
					@Pc(785) int local785 = local581 - local771;
					@Pc(794) int local794 = (int) ((double) local776 * Math.random() + (double) local727);
					@Pc(803) int local803 = (int) ((double) local749 + (double) local780 * Math.random());
					@Pc(812) int local812 = (int) ((double) local771 + Math.random() * (double) local785);
					@Pc(828) int local828 = (int) (Math.random() * (double) (this.aClass381_1.anInt9914 - this.aClass381_1.anInt9920)) + this.aClass381_1.anInt9920;
					@Pc(845) int local845 = (int) (Math.random() * (double) (this.aClass381_1.anInt9929 - this.aClass381_1.anInt9939)) + this.aClass381_1.anInt9939;
					@Pc(862) int local862 = (int) (Math.random() * (double) (this.aClass381_1.anInt9945 - this.aClass381_1.anInt9910)) + this.aClass381_1.anInt9910;
					@Pc(926) int local926;
					if (this.aClass381_1.aBoolean764) {
						@Pc(868) double local868 = Math.random();
						local926 = (int) ((double) this.aClass381_1.anInt9930 + (double) this.aClass381_1.anInt9940 * local868) | (int) ((double) this.aClass381_1.anInt9941 + local868 * (double) this.aClass381_1.anInt9938) << 8 | (int) ((double) this.aClass381_1.anInt9925 + (double) this.aClass381_1.anInt9956 * local868) << 16 | (int) (Math.random() * (double) this.aClass381_1.anInt9904 + (double) this.aClass381_1.anInt9933) << 24;
					} else {
						local926 = (int) ((double) this.aClass381_1.anInt9930 + Math.random() * (double) this.aClass381_1.anInt9940) | (int) ((double) this.aClass381_1.anInt9941 + Math.random() * (double) this.aClass381_1.anInt9938) << 8 | (int) (Math.random() * (double) this.aClass381_1.anInt9956 + (double) this.aClass381_1.anInt9925) << 16 | (int) ((double) this.aClass381_1.anInt9933 + (double) this.aClass381_1.anInt9904 * Math.random()) << 24;
					}
					@Pc(990) int local990 = this.aClass381_1.anInt9932;
					if (!arg3.method7944() && !this.aClass381_1.aBoolean756) {
						local990 = -1;
					}
					if (Static600.anInt8904 == Static559.anInt8434) {
						new Class8_Sub4_Sub2_Sub1(this, local794, local803, local812, local218, local226, local235, local828, local845, local926, local862, local990, this.aClass381_1.aBoolean761, this.aClass381_1.aBoolean759);
					} else {
						@Pc(1032) Class8_Sub4_Sub2_Sub1 local1032 = Static538.aClass8_Sub4_Sub2_Sub1Array2[Static600.anInt8904];
						Static600.anInt8904 = Static600.anInt8904 + 1 & 0x3FF;
						local1032.method6703(this, local794, local803, local812, local218, local226, local235, local828, local845, local926, local862, local990, this.aClass381_1.aBoolean761, this.aClass381_1.aBoolean759);
					}
				}
			}
		}
		if (!this.aClass177_1.method3860(this.aClass177_2)) {
			@Pc(1078) Class177 local1078 = this.aClass177_2;
			this.aClass177_2 = this.aClass177_1;
			this.aClass177_1 = local1078;
			this.aClass177_1.anInt4287 = this.aClass330_1.anInt8544;
			this.aClass177_1.anInt4288 = this.aClass330_1.anInt8536;
			this.aClass177_1.anInt4295 = this.aClass330_1.anInt8531;
			this.aClass177_1.anInt4293 = this.aClass330_1.anInt8540;
			this.aClass177_1.anInt4282 = this.aClass330_1.anInt8528;
			this.aClass177_1.anInt4292 = this.aClass330_1.anInt8526;
			this.aClass177_1.anInt4289 = this.aClass330_1.anInt8533;
			this.aClass177_1.anInt4290 = this.aClass177_2.anInt4290;
			this.aClass177_1.anInt4285 = this.aClass177_2.anInt4285;
			this.aClass177_1.anInt4291 = this.aClass330_1.anInt8542;
			this.aClass177_1.anInt4283 = this.aClass177_2.anInt4283;
			this.aClass177_1.anInt4281 = this.aClass330_1.anInt8527;
		}
		this.anInt8291 = 0;
		for (@Pc(1171) Class8_Sub4_Sub2_Sub1 local1171 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2790(); local1171 != null; local1171 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2785()) {
			local1171.method6701(arg2, arg0);
			this.anInt8291++;
		}
		Static530.anInt8116 += this.anInt8291;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(JLclient!ha;I)V")
	public void method7270(@OriginalArg(0) long arg0, @OriginalArg(1) Class19 arg1) {
		for (@Pc(11) Class8_Sub4_Sub2_Sub1 local11 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2790(); local11 != null; local11 = (Class8_Sub4_Sub2_Sub1) this.aClass130_11.method2785()) {
			local11.method6702(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public void method7271() {
		this.aClass177_1.anInt4295 = this.aClass330_1.anInt8531;
		this.aClass177_1.anInt4287 = this.aClass330_1.anInt8544;
		this.aClass177_1.anInt4288 = this.aClass330_1.anInt8536;
		this.aClass177_1.anInt4292 = this.aClass330_1.anInt8526;
		this.aClass177_1.anInt4293 = this.aClass330_1.anInt8540;
		this.aClass177_1.anInt4282 = this.aClass330_1.anInt8528;
		this.aClass177_1.anInt4289 = this.aClass330_1.anInt8533;
		this.aClass177_1.anInt4291 = this.aClass330_1.anInt8542;
		this.aClass177_1.anInt4281 = this.aClass330_1.anInt8527;
		if (this.aClass177_1.anInt4293 == this.aClass177_1.anInt4291 && this.aClass177_1.anInt4288 == this.aClass177_1.anInt4293 && this.aClass177_1.anInt4292 == this.aClass177_1.anInt4295 && this.aClass177_1.anInt4295 == this.aClass177_1.anInt4281 && this.aClass177_1.anInt4282 == this.aClass177_1.anInt4289 && this.aClass177_1.anInt4287 == this.aClass177_1.anInt4289) {
			this.aBoolean632 = true;
		} else if (this.aBoolean632) {
			this.aClass177_2.anInt4292 = this.aClass177_1.anInt4292;
			this.aClass177_2.anInt4282 = this.aClass177_1.anInt4282;
			this.aClass177_2.anInt4291 = this.aClass177_1.anInt4291;
			this.aClass177_2.anInt4295 = this.aClass177_1.anInt4295;
			this.aClass177_2.anInt4289 = this.aClass177_1.anInt4289;
			this.aClass177_2.anInt4281 = this.aClass177_1.anInt4281;
			this.aClass177_2.anInt4287 = this.aClass177_1.anInt4287;
			this.aBoolean632 = false;
			this.aClass177_2.anInt4288 = this.aClass177_1.anInt4288;
			this.aClass177_2.anInt4293 = this.aClass177_1.anInt4293;
		}
	}
}
