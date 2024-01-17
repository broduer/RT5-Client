import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class8_Sub2_Sub1_Sub3 extends Class8_Sub2_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!jda", name = "U", descriptor = "Lclient!ke;")
	private Class207 aClass207_5;

	@OriginalMember(owner = "client!jda", name = "nb", descriptor = "Z")
	private final boolean aBoolean364;

	@OriginalMember(owner = "client!jda", name = "Q", descriptor = "Z")
	private final boolean aBoolean363;

	@OriginalMember(owner = "client!jda", name = "cb", descriptor = "B")
	private final byte aByte83;

	@OriginalMember(owner = "client!jda", name = "db", descriptor = "S")
	private final short aShort57;

	@OriginalMember(owner = "client!jda", name = "Y", descriptor = "B")
	private final byte aByte84;

	@OriginalMember(owner = "client!jda", name = "pb", descriptor = "Z")
	private boolean aBoolean365;

	@OriginalMember(owner = "client!jda", name = "ib", descriptor = "Z")
	private final boolean aBoolean362;

	@OriginalMember(owner = "client!jda", name = "gb", descriptor = "Lclient!ka;")
	public Class114 aClass114_4;

	@OriginalMember(owner = "client!jda", name = "eb", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_3;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIIIIZ)V")
	public Class8_Sub2_Sub1_Sub3(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt1223 == 1, Static194.method2904(arg12, arg13));
		this.aBoolean364 = arg1.anInt1276 != 0 && !arg7;
		this.aBoolean363 = arg7;
		this.aByte83 = (byte) arg13;
		this.aShort57 = (short) arg1.anInt1261;
		this.aByte84 = (byte) arg12;
		super.aByte143 = (byte) arg3;
		this.aBoolean365 = arg14;
		this.aBoolean362 = arg0.method8013() && arg1.aBoolean89 && !this.aBoolean363 && Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371() != 0;
		@Pc(83) int local83 = 2048;
		if (this.aBoolean365) {
			local83 |= 0x10000;
		}
		@Pc(98) Class274 local98 = this.method4230(arg0, this.aBoolean362, local83);
		if (local98 != null) {
			this.aClass114_4 = local98.aClass114_7;
			this.aClass2_Sub2_Sub9_3 = local98.aClass2_Sub2_Sub9_5;
			if (this.aBoolean365) {
				this.aClass114_4 = this.aClass114_4.method7502((byte) 0, local83, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(I)V")
	@Override
	public void method6863() {
		if (this.aClass114_4 != null) {
			this.aClass114_4.method7486();
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6864(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class2_Sub2_Sub9 local16;
		if (this.aClass2_Sub2_Sub9_3 == null && this.aBoolean362) {
			@Pc(27) Class274 local27 = this.method4230(arg0, true, 262144);
			local16 = local27 == null ? null : local27.aClass2_Sub2_Sub9_5;
		} else {
			local16 = this.aClass2_Sub2_Sub9_3;
			this.aClass2_Sub2_Sub9_3 = null;
		}
		if (local16 != null) {
			Static292.method4625(local16, super.aByte143, super.anInt10718, super.anInt10722, (boolean[]) null);
		}
		if (arg1 > -42) {
			this.aClass114_4 = null;
		}
	}

	@OriginalMember(owner = "client!jda", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.aClass207_5 = null;
		}
		return this.aBoolean362;
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9290() {
		if (this.aClass114_4 == null) {
			return true;
		} else {
			return !this.aClass114_4.r();
		}
	}

	@OriginalMember(owner = "client!jda", name = "k", descriptor = "(I)I")
	@Override
	public int method9293(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.method9290();
		}
		return this.aClass114_4 == null ? 0 : this.aClass114_4.fa();
	}

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9297(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method9287(61);
		}
		return this.aBoolean365;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class114 method4228(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass114_4 != null && arg0.method7967(this.aClass114_4.ua(), arg1) == 0) {
			return this.aClass114_4;
		} else {
			@Pc(34) Class274 local34 = this.method4230(arg0, false, arg1);
			return local34 == null ? null : local34.aClass114_7;
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)I")
	@Override
	public int method6866(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			Static290.anInt4671 = -2;
		}
		return this.aShort57 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(9) Class114 local9 = this.method4228(arg3, 131072);
		if (local9 == null) {
			return arg2 ? false : false;
		} else {
			@Pc(14) Class73 local14 = arg3.method7992();
			local14.method7132(super.anInt10718, super.anInt10719, super.anInt10722);
			return Static504.aBoolean579 ? local9.method7490(arg1, arg0, local14, false, 0, Static582.anInt8651) : local9.method7493(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!jda", name = "j", descriptor = "(I)V")
	@Override
	public void method9287(@OriginalArg(0) int arg0) {
		this.aBoolean365 = false;
		if (arg0 != 27811) {
			this.aClass207_5 = null;
		}
		if (this.aClass114_4 != null) {
			this.aClass114_4.s(this.aClass114_4.ua() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)I")
	@Override
	public int method6865() {
		return this.aByte84;
	}

	@OriginalMember(owner = "client!jda", name = "m", descriptor = "(I)I")
	public int method4229() {
		return this.aClass114_4 == null ? 15 : this.aClass114_4.na() / 4;
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class207 method9285(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -93) {
			return null;
		} else {
			if (this.aClass207_5 == null) {
				this.aClass207_5 = Static317.method4590(super.anInt10719, super.anInt10718, this.method4228(arg0, 0), super.anInt10722);
			}
			return this.aClass207_5;
		}
	}

	@OriginalMember(owner = "client!jda", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6868(@OriginalArg(0) Class19 arg0) {
		@Pc(21) Class2_Sub2_Sub9 local21;
		if (this.aClass2_Sub2_Sub9_3 == null && this.aBoolean362) {
			@Pc(32) Class274 local32 = this.method4230(arg0, true, 262144);
			local21 = local32 == null ? null : local32.aClass2_Sub2_Sub9_5;
		} else {
			local21 = this.aClass2_Sub2_Sub9_3;
			this.aClass2_Sub2_Sub9_3 = null;
		}
		if (local21 != null) {
			Static630.method8364(local21, super.aByte143, super.anInt10718, super.anInt10722, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(B)I")
	@Override
	public int method9299(@OriginalArg(0) byte arg0) {
		if (arg0 == -21) {
			return this.aClass114_4 == null ? 0 : this.aClass114_4.ma();
		} else {
			return -59;
		}
	}

	@OriginalMember(owner = "client!jda", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9296(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -5) {
			;
		}
	}

	@OriginalMember(owner = "client!jda", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9289(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass2_Sub2_Sub9_3 = null;
		}
		return this.aClass114_4 == null ? false : this.aClass114_4.F();
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9283(@OriginalArg(1) Class19 arg0) {
		if (this.aClass114_4 == null) {
			return null;
		}
		@Pc(20) Class73 local20 = arg0.method7992();
		local20.method7132(super.anInt10718, super.anInt10719, super.anInt10722);
		@Pc(34) Class8_Sub7 local34 = Static642.method8448(this.aBoolean364, 1);
		if (Static504.aBoolean579) {
			this.aClass114_4.method7491(local20, local34.aClass8_Sub6Array1[0], Static582.anInt8651, 0);
		} else {
			this.aClass114_4.method7480(local20, local34.aClass8_Sub6Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg6 instanceof Class8_Sub2_Sub3_Sub2) {
			@Pc(38) Class8_Sub2_Sub3_Sub2 local38 = (Class8_Sub2_Sub3_Sub2) arg6;
			if (this.aClass114_4 != null && local38.aClass114_5 != null) {
				this.aClass114_4.method7488(local38.aClass114_5, arg5, arg0, arg3, arg1);
			}
		} else if (arg6 instanceof Class8_Sub2_Sub1_Sub3) {
			@Pc(14) Class8_Sub2_Sub1_Sub3 local14 = (Class8_Sub2_Sub1_Sub3) arg6;
			if (this.aClass114_4 != null && local14.aClass114_4 != null) {
				this.aClass114_4.method7488(local14.aClass114_4, arg5, arg0, arg3, arg1);
			}
		}
		if (arg4 <= 101) {
			this.method9285((Class19) null, -1);
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;BZI)Lclient!od;")
	private Class274 method4230(@OriginalArg(0) Class19 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class54 local11 = Static354.aClass142_4.method3063(this.aShort57 & 0xFFFF, 73);
		@Pc(27) Class178 local27;
		@Pc(33) Class178 local33;
		if (this.aBoolean363) {
			local27 = Static693.aClass178Array2[super.aByte143];
			local33 = Static706.aClass178Array3[0];
		} else {
			local27 = Static706.aClass178Array3[super.aByte143];
			if (super.aByte143 >= 3) {
				local33 = null;
			} else {
				local33 = Static706.aClass178Array3[super.aByte143 + 1];
			}
		}
		return local11.method1309(this.aByte84 == 11 ? this.aByte83 + 4 : this.aByte83, super.anInt10722, super.anInt10718, local27, arg1, super.anInt10719, this.aByte84 == 11 ? 10 : this.aByte84, arg0, (Class150) null, arg2, local33);
	}

	@OriginalMember(owner = "client!jda", name = "c", descriptor = "(I)I")
	@Override
	public int method6862(@OriginalArg(0) int arg0) {
		return arg0 == 23796 ? this.aByte83 : -53;
	}
}
