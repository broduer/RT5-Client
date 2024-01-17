import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class8_Sub2_Sub1_Sub1 extends Class8_Sub2_Sub1 {

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
	private int anInt696;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!b", name = "L", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!b", name = "vb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!b", name = "Gb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!b", name = "Ib", descriptor = "Lclient!hv;")
	private Class8_Sub5 aClass8_Sub5_1;

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!b", name = "Y", descriptor = "I")
	private int anInt694 = 0;

	@OriginalMember(owner = "client!b", name = "ub", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!b", name = "P", descriptor = "I")
	private int anInt720 = 0;

	@OriginalMember(owner = "client!b", name = "R", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
	private final int anInt724;

	@OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
	private final int anInt718;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "I")
	public final int anInt725;

	@OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!b", name = "rb", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	public final int anInt714;

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
	public final int anInt699;

	@OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
	public final int anInt712;

	@OriginalMember(owner = "client!b", name = "xb", descriptor = "I")
	private final int anInt708;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "I")
	private final int anInt707;

	@OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
	private final int anInt711;

	@OriginalMember(owner = "client!b", name = "N", descriptor = "Lclient!gu;")
	private final Class152 aClass152_1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class8_Sub2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static102.method2025(arg1, -29754, arg4, arg3) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt724 = arg5;
		this.anInt718 = arg0;
		this.anInt725 = arg6;
		this.anInt697 = arg14;
		this.aBoolean57 = arg13;
		this.anInt714 = arg11;
		this.aBoolean59 = false;
		this.anInt699 = arg7;
		this.anInt712 = arg12;
		this.anInt708 = arg10;
		this.anInt707 = arg8;
		this.anInt711 = arg9;
		@Pc(82) int local82 = Static23.aClass128_1.method2694(this.anInt718).anInt5862;
		this.aClass152_1 = new Class152_Sub2(this, false);
		this.aClass152_1.method9120(true, local82);
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(I)I")
	@Override
	public int method9293(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.aBoolean57 = false;
		}
		return this.anInt720;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZIII)V")
	public void method813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean59) {
			local9 = arg3 - super.anInt10718;
			@Pc(16) double local16 = arg2 - super.anInt10722;
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble4 = (double) this.anInt711 * local16 / local25 + (double) super.anInt10722;
			this.aDouble8 = (double) super.anInt10718 + local9 * (double) this.anInt711 / local25;
			if (this.aBoolean57) {
				this.aDouble5 = Static102.method2025(super.aByte144, -29754, (int) this.aDouble4, (int) this.aDouble8) - this.anInt724;
			} else {
				this.aDouble5 = super.anInt10719;
			}
		}
		local9 = this.anInt699 + 1 - arg1;
		this.aDouble2 = ((double) arg2 - this.aDouble4) / local9;
		this.aDouble7 = ((double) arg3 - this.aDouble8) / local9;
		this.aDouble6 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble2 * this.aDouble2);
		if (this.anInt707 == -1) {
			this.aDouble1 = ((double) arg0 - this.aDouble5) / local9;
		} else {
			if (!this.aBoolean59) {
				this.aDouble1 = -this.aDouble6 * Math.tan((double) this.anInt707 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - local9 * this.aDouble1 - this.aDouble5) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class207 method9285(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			this.aDouble8 = 1.3103535335051488D;
		}
		return null;
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "(I)V")
	@Override
	public void method9301() {
		super.aShort131 = super.aShort134 = (short) (int) (this.aDouble8 / 512.0D);
		super.aShort132 = super.aShort133 = (short) (int) (this.aDouble4 / 512.0D);
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "(I)V")
	@Override
	public void method9287(@OriginalArg(0) int arg0) {
		if (arg0 != 27811) {
			this.anInt697 = -9;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 >= 101) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ha;I)Lclient!ka;")
	private Class114 method814(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class229 local17 = Static23.aClass128_1.method2694(this.anInt718);
		return local17.method5259(this.aClass152_1, (byte) 2, arg0, arg1);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public void method815() {
		if (this.aClass8_Sub5_1 != null) {
			this.aClass8_Sub5_1.method3644();
		}
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9289(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aBoolean58 : true;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)V")
	public void method816() {
		if (this.aBoolean59 || this.anInt708 == 0) {
			return;
		}
		@Pc(21) Class8_Sub2_Sub1_Sub2 local21 = null;
		if (Static1.anInt10827 == 3) {
			local21 = Static219.aClass238Array1[this.anInt708 - 1].method5370();
		} else {
			@Pc(35) int local35;
			if (this.anInt708 < 0) {
				local35 = -this.anInt708 - 1;
				if (Static312.anInt5017 == local35) {
					local21 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2;
				} else {
					local21 = Static621.aClass8_Sub2_Sub1_Sub2_Sub1Array3[local35];
				}
			} else {
				local35 = this.anInt708 - 1;
				@Pc(58) Class2_Sub45 local58 = (Class2_Sub45) Static18.aClass28_2.method738(local35);
				if (local58 != null) {
					local21 = local58.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				}
			}
		}
		if (local21 == null) {
			return;
		}
		super.anInt10722 = local21.anInt10722;
		super.anInt10718 = local21.anInt10718;
		super.anInt10719 = Static102.method2025(super.aByte144, -29754, local21.anInt10722, local21.anInt10718) - this.anInt724;
		if (this.anInt697 < 0) {
			return;
		}
		@Pc(105) Class291 local105 = local21.method9324();
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		if (local105.anIntArrayArray181 != null && local105.anIntArrayArray181[this.anInt697] != null) {
			local109 = local105.anIntArrayArray181[this.anInt697][2];
			local107 = local105.anIntArrayArray181[this.anInt697][0];
		}
		if (local105.anIntArrayArray180 != null && local105.anIntArrayArray180[this.anInt697] != null) {
			local109 += local105.anIntArrayArray180[this.anInt697][2];
			local107 += local105.anIntArrayArray180[this.anInt697][0];
		}
		if (local107 != 0 || local109 != 0) {
			@Pc(185) int local185 = local21.aClass126_7.method2673(16383);
			@Pc(187) int local187 = local185;
			if (local21.anIntArray877 != null && local21.anIntArray877[this.anInt697] != -1) {
				local187 = local21.anIntArray877[this.anInt697];
			}
			@Pc(213) int local213 = local187 - local185 & 0x3FFF;
			@Pc(217) int local217 = Class363.anIntArray741[local213];
			@Pc(221) int local221 = Class363.anIntArray740[local213];
			@Pc(232) int local232 = local217 * local109 + local221 * local107 >> 14;
			local109 = local109 * local221 - local217 * local107 >> 14;
			super.anInt10722 += local109;
			super.anInt10718 += local232;
		}
		return;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9290() {
		return false;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)I")
	@Override
	public int method9299(@OriginalArg(0) byte arg0) {
		return arg0 == -21 ? this.anInt694 : 39;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!ha;Lclient!tt;Lclient!ka;)V")
	private void method817(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class73 arg1, @OriginalArg(3) Class114 arg2) {
		arg2.method7483(arg1);
		@Pc(9) Class330[] local9 = arg2.method7489();
		@Pc(12) Class251[] local12 = arg2.method7487();
		if ((this.aClass8_Sub5_1 == null || this.aClass8_Sub5_1.aBoolean324) && (local9 != null || local12 != null)) {
			this.aClass8_Sub5_1 = Static257.method3654(Static333.anInt5474, true);
		}
		if (this.aClass8_Sub5_1 != null) {
			this.aClass8_Sub5_1.method3643(arg0, Static333.anInt5474, local9, local12);
			this.aClass8_Sub5_1.method3658(super.aByte144, super.aShort131, super.aShort134, super.aShort132, super.aShort133);
		}
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9297(@OriginalArg(0) int arg0) {
		return arg0 != 0;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9296(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			Static29.aClass131_1 = null;
		}
		@Pc(18) Class114 local18 = this.method814(0, arg0, arg1 + 75);
		if (local18 == null) {
			return;
		}
		@Pc(25) Class73 local25 = arg0.method7992();
		local25.method7143(this.anInt705);
		local25.method7134(this.anInt696);
		local25.method7141((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble4);
		this.anInt720 = local18.fa();
		this.anInt694 = local18.ma();
		this.method817(arg0, local25, local18);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9283(@OriginalArg(1) Class19 arg0) {
		@Pc(19) Class114 local19 = this.method814(2048, arg0, 46);
		if (local19 == null) {
			return null;
		}
		@Pc(27) Class73 local27 = arg0.method7992();
		local27.method7143(this.anInt705);
		local27.method7134(this.anInt696);
		local27.method7141((int) this.aDouble8, (int) this.aDouble5, (int) this.aDouble4);
		this.method817(arg0, local27, local19);
		@Pc(57) Class8_Sub7 local57 = Static642.method8448(false, 1);
		if (Static504.aBoolean579) {
			local19.method7491(local27, local57.aClass8_Sub6Array1[0], Static582.anInt8651, 0);
		} else {
			local19.method7480(local27, local57.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass8_Sub5_1 != null) {
			@Pc(89) Class232 local89 = this.aClass8_Sub5_1.method3645();
			if (Static504.aBoolean579) {
				arg0.method7974(local89, Static582.anInt8651);
			} else {
				arg0.method8028(local89);
			}
		}
		this.aBoolean58 = local19.F();
		this.anInt720 = local19.fa();
		this.anInt694 = local19.ma();
		return local57;
	}

	@OriginalMember(owner = "client!b", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_1 != null) {
			this.aClass8_Sub5_1.method3644();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (arg2) {
			this.aDouble5 = -0.10988590233715705D;
		}
		return false;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public void method819(@OriginalArg(1) int arg0) {
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aBoolean59 = true;
		this.aDouble4 += (double) arg0 * this.aDouble2;
		if (this.aBoolean57) {
			this.aDouble5 = Static102.method2025(super.aByte144, -29754, (int) this.aDouble4, (int) this.aDouble8) - this.anInt724;
		} else if (this.anInt707 == -1) {
			this.aDouble5 += this.aDouble1 * (double) arg0;
		} else {
			this.aDouble5 += (double) arg0 * this.aDouble1 + this.aDouble3 * 0.5D * (double) arg0 * (double) arg0;
			this.aDouble1 += (double) arg0 * this.aDouble3;
		}
		this.anInt696 = (int) (Math.atan2(this.aDouble7, this.aDouble2) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt705 = (int) (Math.atan2(this.aDouble1, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass152_1.method9119(1) && this.aClass152_1.method9109()) {
			this.aClass152_1.method9106();
		}
	}
}
