import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class8_Sub2_Sub3_Sub2 extends Class8_Sub2_Sub3 implements Interface25 {

	@OriginalMember(owner = "client!jn", name = "T", descriptor = "Lclient!ke;")
	private Class205 aClass205_6;

	@OriginalMember(owner = "client!jn", name = "ib", descriptor = "Z")
	private final boolean aBoolean379;

	@OriginalMember(owner = "client!jn", name = "cb", descriptor = "S")
	private final short aShort60;

	@OriginalMember(owner = "client!jn", name = "U", descriptor = "B")
	private byte aByte88;

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "Z")
	private final boolean aBoolean376;

	@OriginalMember(owner = "client!jn", name = "H", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!jn", name = "O", descriptor = "B")
	private byte aByte87;

	@OriginalMember(owner = "client!jn", name = "hb", descriptor = "Z")
	private final boolean aBoolean377;

	@OriginalMember(owner = "client!jn", name = "X", descriptor = "Lclient!ka;")
	public Class114 aClass114_5;

	@OriginalMember(owner = "client!jn", name = "eb", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_4;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIZ)V")
	public Class8_Sub2_Sub3_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static490.method4605(arg9, arg8));
		super.anInt10690 = arg4;
		super.anInt10694 = arg6;
		this.aBoolean379 = arg1.anInt1271 != 0 && !arg7;
		this.aShort60 = (short) arg1.anInt1256;
		this.aByte88 = (byte) arg8;
		this.aBoolean376 = arg7;
		this.aBoolean378 = arg10;
		this.aByte87 = (byte) arg9;
		this.aBoolean377 = arg0.r() && arg1.aBoolean89 && !this.aBoolean376 && Static400.aClass2_Sub34_28.aClass57_Sub12_1.method3029() != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean378) {
			local77 |= 0x10000;
		}
		@Pc(92) Class272 local92 = this.method3110(arg0, local77, this.aBoolean377);
		if (local92 != null) {
			this.aClass114_5 = local92.aClass114_7;
			this.aClass2_Sub2_Sub9_4 = local92.aClass2_Sub2_Sub9_5;
			if (this.aBoolean378) {
				this.aClass114_5 = this.aClass114_5.a((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "(I)Z")
	@Override
	public boolean i(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.b();
		}
		return this.aBoolean378;
	}

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)Z")
	@Override
	public boolean h(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return this.aClass114_5 == null ? false : this.aClass114_5.F();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method4824(@OriginalArg(0) Class19 arg0) {
		@Pc(21) Class2_Sub2_Sub9 local21;
		if (this.aClass2_Sub2_Sub9_4 == null && this.aBoolean377) {
			@Pc(32) Class272 local32 = this.method3110(arg0, 262144, true);
			local21 = local32 == null ? null : local32.aClass2_Sub2_Sub9_5;
		} else {
			local21 = this.aClass2_Sub2_Sub9_4;
			this.aClass2_Sub2_Sub9_4 = null;
		}
		if (local21 != null) {
			Static630.method5921(local21, super.aByte143, super.anInt10690, super.anInt10694, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg6 instanceof Class8_Sub2_Sub3_Sub2) {
			@Pc(34) Class8_Sub2_Sub3_Sub2 local34 = (Class8_Sub2_Sub3_Sub2) arg6;
			if (this.aClass114_5 != null && local34.aClass114_5 != null) {
				this.aClass114_5.a(local34.aClass114_5, arg5, arg0, arg3, arg1);
			}
		} else if (arg6 instanceof Class8_Sub2_Sub1_Sub3) {
			@Pc(10) Class8_Sub2_Sub1_Sub3 local10 = (Class8_Sub2_Sub1_Sub3) arg6;
			if (this.aClass114_5 != null && local10.aClass114_4 != null) {
				this.aClass114_5.a(local10.aClass114_4, arg5, arg0, arg3, arg1);
			}
		}
		if (arg4 < 101) {
			this.h(1);
		}
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4823(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.aBoolean378 = true;
		}
		return this.aBoolean377;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)Z")
	@Override
	public boolean b() {
		if (this.aClass114_5 == null) {
			return true;
		} else {
			return !this.aClass114_5.r();
		}
	}

	@OriginalMember(owner = "client!jn", name = "k", descriptor = "(I)I")
	@Override
	public int k(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			Static306.method3111((String) null, 57);
		}
		return this.aClass114_5 == null ? 0 : this.aClass114_5.fa();
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 c(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass205_6 == null) {
			this.aClass205_6 = Static317.method3206(super.anInt10691, super.anInt10690, this.method3109(arg0, 0), super.anInt10694);
		}
		if (arg1 >= -93) {
			this.aClass205_6 = null;
		}
		return this.aClass205_6;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ka;")
	private Class114 method3109(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass114_5 != null && arg0.b(this.aClass114_5.ua(), arg1) == 0) {
			return this.aClass114_5;
		} else {
			@Pc(37) Class272 local37 = this.method3110(arg0, arg1, false);
			return local37 == null ? null : local37.aClass114_7;
		}
	}

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "(I)V")
	@Override
	public void j(@OriginalArg(0) int arg0) {
		this.aBoolean378 = false;
		if (this.aClass114_5 != null) {
			this.aClass114_5.s(this.aClass114_5.ua() & 0xFFFEFFFF);
		}
		if (arg0 != 27811) {
			this.aByte88 = -28;
		}
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)V")
	@Override
	public void method4819() {
		if (this.aClass114_5 != null) {
			this.aClass114_5.e();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method4820(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -42) {
			this.aClass205_6 = null;
		}
		@Pc(24) Class2_Sub2_Sub9 local24;
		if (this.aClass2_Sub2_Sub9_4 == null && this.aBoolean377) {
			@Pc(35) Class272 local35 = this.method3110(arg0, 262144, true);
			local24 = local35 == null ? null : local35.aClass2_Sub2_Sub9_5;
		} else {
			local24 = this.aClass2_Sub2_Sub9_4;
			this.aClass2_Sub2_Sub9_4 = null;
		}
		if (local24 != null) {
			Static292.method3236(local24, super.aByte143, super.anInt10690, super.anInt10694, (boolean[]) null);
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)I")
	@Override
	public int c(@OriginalArg(0) byte arg0) {
		if (arg0 == -21) {
			return this.aClass114_5 == null ? 0 : this.aClass114_5.ma();
		} else {
			return 49;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ha;ZIZ)Lclient!od;")
	private Class272 method3110(@OriginalArg(0) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) Class54 local11 = Static354.aClass142_4.method2158(this.aShort60 & 0xFFFF, 56);
		@Pc(27) Class178 local27;
		@Pc(38) Class178 local38;
		if (this.aBoolean376) {
			local27 = Static693.aClass178Array2[super.aByte143];
			local38 = Static706.aClass178Array3[0];
		} else {
			local27 = Static706.aClass178Array3[super.aByte143];
			if (super.aByte143 < 3) {
				local38 = Static706.aClass178Array3[super.aByte143 + 1];
			} else {
				local38 = null;
			}
		}
		return local11.method809(this.aByte87, super.anInt10694, super.anInt10690, local27, arg2, super.anInt10691, this.aByte88, arg0, (Class150) null, arg1, local38);
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void d(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			this.aBoolean378 = true;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(9) Class114 local9 = this.method3109(arg3, 131072);
		if (local9 == null) {
			if (arg2) {
				this.aClass205_6 = null;
			}
			return false;
		} else {
			@Pc(14) Class73 local14 = arg3.A();
			local14.a(super.anInt10690, super.anInt10691, super.anInt10694);
			return Static504.aBoolean579 ? local9.a(arg1, arg0, local14, false, 0, Static582.anInt8627) : local9.a(arg1, arg0, local14, false, 0);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
	@Override
	public int method4822(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.aClass114_5 = null;
		}
		return this.aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 a(@OriginalArg(1) Class19 arg0) {
		if (this.aClass114_5 == null) {
			return null;
		}
		@Pc(20) Class73 local20 = arg0.A();
		local20.a(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(34) Class8_Sub7 local34 = Static642.method5995(this.aBoolean379, 1);
		if (Static504.aBoolean579) {
			this.aClass114_5.a(local20, local34.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			this.aClass114_5.a(local20, local34.aClass8_Sub6Array1[0], 0);
		}
		return local34;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I")
	@Override
	public int method4821() {
		return this.aByte88;
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)I")
	@Override
	public int method4818(@OriginalArg(0) int arg0) {
		if (arg0 != 23796) {
			this.aByte87 = 21;
		}
		return this.aByte87;
	}
}
