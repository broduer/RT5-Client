import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class148 {

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Z")
	private boolean aBoolean272;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
	private int anInt3511;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
	private int anInt3513;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	private int anInt3516;

	@OriginalMember(owner = "client!gm", name = "G", descriptor = "Lclient!st;")
	private Class23 aClass23_10;

	@OriginalMember(owner = "client!gm", name = "E", descriptor = "I")
	private int anInt3518;

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
	private int anInt3521;

	@OriginalMember(owner = "client!gm", name = "D", descriptor = "Lclient!gm;")
	private Class148 aClass148_2;

	@OriginalMember(owner = "client!gm", name = "C", descriptor = "Lclient!ka;")
	private Class114 aClass114_2;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	private int anInt3527;

	@OriginalMember(owner = "client!gm", name = "K", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!gm", name = "y", descriptor = "Z")
	private boolean aBoolean273 = true;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	private int anInt3520 = -1;

	@OriginalMember(owner = "client!gm", name = "J", descriptor = "I")
	private final int anInt3519;

	@OriginalMember(owner = "client!gm", name = "A", descriptor = "I")
	private final int anInt3525;

	@OriginalMember(owner = "client!gm", name = "F", descriptor = "[Lclient!ks;")
	private final Class218[] aClass218Array1;

	@OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "I")
	private final int anInt3533;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
	private final int anInt3517;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "[Lclient!ks;")
	private final Class218[] aClass218Array2;

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Lclient!ks;")
	private final Class218 aClass218_1;

	@OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
	private final int anInt3524;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I[Lclient!ks;IIIIII)V")
	public Class148(@OriginalArg(0) int arg0, @OriginalArg(1) Class218[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3519 = arg4;
		this.anInt3525 = arg6;
		this.aClass218Array1 = arg1;
		this.anInt3515 = arg5;
		this.anInt3533 = arg3;
		this.anInt3517 = arg0;
		if (arg1 == null) {
			this.aClass218Array2 = null;
			this.aClass218_1 = null;
		} else {
			this.aClass218Array2 = new Class218[arg1.length];
			this.aClass218_1 = arg2 < 0 ? null : arg1[arg2];
		}
		this.anInt3524 = arg7;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZILclient!ha;IIIIIIIIZB)V")
	public void method3159(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = 0;
		if (this.aBoolean272) {
			local5 = this.anInt3527;
		}
		if (this.aClass148_2 == null) {
			this.method3161(arg5, arg8, arg6, arg1, true, arg4, arg3, arg7, arg2, local5, arg9, arg0);
			return;
		}
		@Pc(16) Class148 local16 = this;
		@Pc(19) Class148 local19 = this.aClass148_2;
		if (this.hashCode() > local19.hashCode()) {
			local5 = 255 - local5;
			local19 = this;
			local16 = this.aClass148_2;
		}
		local16.method3161(arg5, arg8, arg6, arg1, true, arg4, arg3, arg7, arg2, local5, arg9, arg0);
		local19.method3161(arg5, arg8, arg6, arg1, false, arg4, arg3, arg7, arg2, 255 - local5, arg9, arg0);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIB)V")
	public void method3160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3527 = this.anInt3516 + (arg0 - this.anInt3516) * arg1 / 255;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILclient!ha;ZZIIIIIIII)V")
	private void method3161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		@Pc(10) int local10 = 255 - arg9;
		if (this.aClass114_2 == null) {
			arg8 = arg8 + arg1 & 0x3FFF;
			arg3.ya();
			if (this.anInt3517 == -1 || this.anInt3528 == 0) {
				arg3.aa(arg7, arg11, arg6, arg2, local10 << 24 | arg5, 1);
			} else {
				@Pc(74) Material local74 = Static708.anInterface4_12.method6824(this.anInt3517);
				if (this.aClass23_10 == null && Static708.anInterface4_12.method6821(this.anInt3517)) {
					@Pc(120) int[] local120 = local74.anInt2805 == 2 ? Static708.anInterface4_12.method6822(0.7F, this.anInt3517, this.anInt3528, this.anInt3528) : Static708.anInterface4_12.method6825(this.anInt3528, false, this.anInt3528, this.anInt3517, 0.7F);
					this.anInt3511 = local120[0];
					this.anInt3521 = local120[local120.length - 1];
					this.aClass23_10 = arg3.method7953(this.anInt3528, this.anInt3528, this.anInt3528, local120);
				}
				@Pc(161) int local161 = local10 == 255 ? (local74.anInt2805 == 2 ? 1 : 0) : 1;
				if (local161 == 1 && arg4) {
					arg3.aa(arg7, arg11, arg6, arg2, arg5, 0);
				}
				if (this.aClass23_10 != null) {
					@Pc(187) int local187 = arg2 * arg10 / -4096;
					@Pc(199) int local199;
					for (local199 = arg8 * arg2 / 4096 + (arg6 - arg2) / 2; local199 > arg2; local199 -= arg2) {
					}
					while (local199 < 0) {
						local199 += arg2;
					}
					@Pc(233) int local233;
					if (this.anInt3525 == 1) {
						for (local233 = local199 - arg2; local233 < arg6; local233 += arg2) {
							this.aClass23_10.method8212(arg7 + local233, local187 + arg11, arg2, arg2, 0, local10 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt3511 & 0xFF000000) != 0) {
							arg3.method7978(arg6, local187 + arg11 + 1, 0, 0, this.anInt3511);
						}
						if ((this.anInt3521 & 0xFF000000) != 0) {
							arg3.method7978(arg6, arg2 - arg2 - local187 - arg11, arg2 + arg11 + local187, 0, this.anInt3521);
						}
					} else {
						while (arg2 < local187) {
							local187 -= arg2;
						}
						while (local187 < 0) {
							local187 += arg2;
						}
						for (local233 = local199 - arg2; local233 < arg6; local233 += arg2) {
							for (@Pc(360) int local360 = local187 - arg2; local360 < arg2; local360 += arg2) {
								this.aClass23_10.method8212(arg7 + local233, local360 - -arg11, arg2, arg2, 0, local10 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else {
			if (arg4) {
				arg3.GA(arg5);
				arg3.ya();
			}
			this.method3164(arg8, arg9, arg10, arg0, arg3);
		}
		for (@Pc(417) int local417 = this.anInt3518 - 1; local417 >= 0; local417--) {
			this.aClass218Array2[local417].method5062(arg3, arg7, arg11, arg6, arg2, arg10, arg8, this.anInt3533, this.anInt3519, this.anInt3515, local10);
		}
		arg3.ya();
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILclient!ha;IIIIIIII)V")
	public void method3162(@OriginalArg(2) Class19 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(8) int arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6) {
		this.method3159(arg1, arg0, arg5, arg3, 0, 0, arg6, arg2, 0, arg4);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLclient!gm;)V")
	public void method3163(@OriginalArg(1) Class148 arg0) {
		if (this.aBoolean272) {
			this.anInt3516 = this.anInt3527;
		} else if (arg0 != null && arg0.aBoolean272) {
			this.anInt3516 = 255 - arg0.anInt3527;
		} else {
			this.anInt3516 = 0;
		}
		this.anInt3527 = 0;
		this.aBoolean272 = true;
		this.aClass148_2 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIILclient!ha;)V")
	private void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class19 arg4) {
		@Pc(7) Class73 local7 = arg4.method8024().method7136();
		@Pc(10) Class73 local10 = arg4.method7960();
		local10.method7132(0, 0, 0);
		local10.method7134(arg0 & 0x3FFF);
		local10.method7137(arg2 & 0x3FFF);
		local10.method7146(arg3 & 0x3FFF);
		arg4.method8007(local10);
		@Pc(36) Class73 local36 = arg4.method7960();
		local36.method7140();
		if (this.anInt3513 != arg1) {
			this.aClass114_2.method7505((byte) arg1, this.aByteArray35);
			this.anInt3513 = arg1;
		}
		this.aClass114_2.method7480(local36, null, 0);
		arg4.method8007(local7);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)Z")
	public boolean method3165() {
		return this.aBoolean272;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILclient!ha;)V")
	private void method3166(@OriginalArg(1) Class19 arg0) {
		try {
			@Pc(9) Js5 local9 = Static386.aClass332_80;
			@Pc(17) boolean local17 = local9.method7614(this.anInt3524);
			if (local17) {
				arg0.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(36) Class88 local36 = Static121.method2201(this.anInt3524, Static386.aClass332_80);
				this.aClass114_2 = arg0.method7959(local36, 1099776, 0, 255, 1);
				@Pc(49) byte[] local49 = this.aClass114_2.method7496();
				if (local49 == null) {
					this.aByteArray35 = null;
				} else {
					this.aByteArray35 = new byte[local49.length];
					Static734.method7701(local49, 0, this.aByteArray35, 0, local49.length);
				}
			}
		} catch (@Pc(73) Exception local73) {
		}
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Lclient!gm;")
	public Class148 method3167() {
		return this.aClass148_2;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIILclient!ha;)Z")
	public boolean method3168(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.anInt3520 != arg1) {
			this.anInt3520 = arg1;
			@Pc(16) int local16 = Static402.method5594(arg1);
			if (local16 > 512) {
				local16 = 512;
			}
			if (local16 <= 0) {
				local16 = 1;
			}
			if (local16 != this.anInt3528) {
				this.anInt3528 = local16;
				this.aClass23_10 = null;
			}
			if (this.aClass218Array1 != null) {
				this.anInt3518 = 0;
				@Pc(57) int[] local57 = new int[this.aClass218Array1.length];
				for (@Pc(59) int local59 = 0; local59 < this.aClass218Array1.length; local59++) {
					@Pc(68) Class218 local68 = this.aClass218Array1[local59];
					if (local68.method5063(this.anInt3533, this.anInt3519, this.anInt3515, this.anInt3520)) {
						local57[this.anInt3518] = local68.anInt5651;
						this.aClass218Array2[this.anInt3518++] = local68;
					}
				}
				Static441.method5973(this.anInt3518 - 1, 0, local57, this.aClass218Array2);
			}
			this.aBoolean273 = true;
		}
		@Pc(131) boolean local131 = false;
		if (this.aBoolean273) {
			this.aBoolean273 = false;
			for (@Pc(142) int local142 = this.anInt3518 - 1; local142 >= 0; local142--) {
				@Pc(155) boolean local155 = this.aClass218Array2[local142].method5057(arg2, this.aClass218_1);
				this.aBoolean273 |= !local155;
				local131 |= local155;
			}
		}
		if (arg0 == 0 || !arg2.method7999()) {
			this.aClass114_2 = null;
		} else if (this.aClass114_2 == null && this.anInt3524 >= 0) {
			this.method3166(arg2);
		}
		if (this.aClass148_2 != null && this.aClass148_2 != this) {
			this.aClass148_2.method3169();
			local131 |= this.aClass148_2.method3168(arg0, arg1, arg2);
		}
		return local131;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public void method3169() {
		this.aBoolean272 = false;
		this.anInt3527 = 0;
		this.aClass148_2 = null;
	}
}
