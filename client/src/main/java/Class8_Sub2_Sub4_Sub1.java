import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class8_Sub2_Sub4_Sub1 extends Class8_Sub2_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!im", name = "T", descriptor = "Lclient!ke;")
	private Class207 aClass207_4;

	@OriginalMember(owner = "client!im", name = "P", descriptor = "S")
	private final short aShort52;

	@OriginalMember(owner = "client!im", name = "ib", descriptor = "B")
	private byte aByte78;

	@OriginalMember(owner = "client!im", name = "jb", descriptor = "B")
	private byte aByte77;

	@OriginalMember(owner = "client!im", name = "K", descriptor = "Z")
	private final boolean aBoolean350;

	@OriginalMember(owner = "client!im", name = "Y", descriptor = "Z")
	private final boolean aBoolean348;

	@OriginalMember(owner = "client!im", name = "kb", descriptor = "Z")
	private final boolean aBoolean349;

	@OriginalMember(owner = "client!im", name = "M", descriptor = "Lclient!ka;")
	private Class114 aClass114_3;

	@OriginalMember(owner = "client!im", name = "eb", descriptor = "Lclient!r;")
	private SecondaryNode_Sub9 aClass2_Sub2_Sub9_2;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIII)V")
	public Class8_Sub2_Sub4_Sub1(@OriginalArg(0) Class19 arg0, @OriginalArg(1) LocType arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		super.anInt10722 = arg6;
		this.aShort52 = (short) arg1.anInt1261;
		this.aByte78 = (byte) arg11;
		super.anInt10718 = arg4;
		this.aByte77 = (byte) arg10;
		this.aBoolean350 = arg1.anInt1276 != 0 && !arg7;
		this.aBoolean348 = arg7;
		this.aBoolean349 = arg0.method8013() && arg1.aBoolean89 && !this.aBoolean348 && Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371() != 0;
		@Pc(81) Class274 local81 = this.method4045(arg0, 2048, this.aBoolean349);
		if (local81 != null) {
			this.aClass114_3 = local81.aClass114_7;
			this.aClass2_Sub2_Sub9_2 = local81.aClass2_Sub2_Sub9_5;
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)I")
	@Override
	public int method6862(@OriginalArg(0) int arg0) {
		return this.aByte78;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IILclient!ha;)Lclient!ka;")
	private Class114 method4041(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		if (this.aClass114_3 != null && arg1.method7967(this.aClass114_3.ua(), arg0) == 0) {
			return this.aClass114_3;
		} else {
			@Pc(35) Class274 local35 = this.method4045(arg1, arg0, false);
			return local35 == null ? null : local35.aClass114_7;
		}
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
	@Override
	public void method6863() {
		if (this.aClass114_3 != null) {
			this.aClass114_3.method7486();
		}
	}

	@OriginalMember(owner = "client!im", name = "k", descriptor = "(I)I")
	@Override
	public int method9293(@OriginalArg(0) int arg0) {
		return this.aClass114_3 == null ? 0 : this.aClass114_3.fa();
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0) {
		return arg0 == -19717 ? this.aBoolean349 : true;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (arg2) {
			this.method6864(null, 39);
		}
		@Pc(18) Class114 local18 = this.method4041(131072, arg3);
		if (local18 == null) {
			return false;
		} else {
			@Pc(23) Class73 local23 = arg3.method7992();
			local23.method7132(super.anInt10718, super.anInt10719, super.anInt10722);
			return Static504.aBoolean579 ? local18.method7490(arg1, arg0, local23, false, 0, Static582.anInt8651) : local18.method7493(arg1, arg0, local23, false, 0);
		}
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class207 method9285(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass207_4 == null) {
			this.aClass207_4 = Static317.method4590(super.anInt10719, super.anInt10718, this.method4041(0, arg0), super.anInt10722);
		}
		return this.aClass207_4;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6868(@OriginalArg(0) Class19 arg0) {
		@Pc(37) SecondaryNode_Sub9 local37;
		if (this.aClass2_Sub2_Sub9_2 == null && this.aBoolean349) {
			@Pc(29) Class274 local29 = this.method4045(arg0, 262144, true);
			local37 = local29 == null ? null : local29.aClass2_Sub2_Sub9_5;
		} else {
			local37 = this.aClass2_Sub2_Sub9_2;
			this.aClass2_Sub2_Sub9_2 = null;
		}
		if (local37 != null) {
			Static630.method8364(local37, super.aByte143, super.anInt10718, super.anInt10722, null);
		}
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9296(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9289(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return this.aClass114_3 == null ? false : this.aClass114_3.F();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6864(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		@Pc(28) SecondaryNode_Sub9 local28;
		if (this.aClass2_Sub2_Sub9_2 == null && this.aBoolean349) {
			@Pc(20) Class274 local20 = this.method4045(arg0, 262144, true);
			local28 = local20 == null ? null : local20.aClass2_Sub2_Sub9_5;
		} else {
			local28 = this.aClass2_Sub2_Sub9_2;
			this.aClass2_Sub2_Sub9_2 = null;
		}
		if (arg1 < -42 && local28 != null) {
			Static292.method4625(local28, super.aByte143, super.anInt10718, super.anInt10722, null);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
	@Override
	public int method6866(@OriginalArg(0) int arg0) {
		return arg0 == -32136 ? this.aShort52 & 0xFFFF : 109;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9290() {
		if (this.aClass114_3 == null) {
			return true;
		} else {
			return !this.aClass114_3.r();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BLclient!ha;IZ)Lclient!od;")
	private Class274 method4045(@OriginalArg(1) Class19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(17) LocType local17 = client.locTypeList.method3063(this.aShort52 & 0xFFFF, 42);
		@Pc(29) Class178 local29;
		@Pc(24) Class178 local24;
		if (this.aBoolean348) {
			local24 = Static706.aClass178Array3[0];
			local29 = Static693.aClass178Array2[super.aByte143];
		} else {
			local29 = Static706.aClass178Array3[super.aByte143];
			if (super.aByte143 < 3) {
				local24 = Static706.aClass178Array3[super.aByte143 + 1];
			} else {
				local24 = null;
			}
		}
		return local17.method1309(this.aByte78, super.anInt10722, super.anInt10718, local29, arg2, super.anInt10719, this.aByte77, arg0, null, arg1, local24);
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I")
	@Override
	public int method6865() {
		return this.aByte77;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9283(@OriginalArg(1) Class19 arg0) {
		if (this.aClass114_3 == null) {
			return null;
		}
		@Pc(12) Class73 local12 = arg0.method7992();
		local12.method7132(super.anInt10718 + super.aShort101, super.anInt10719, super.aShort102 + super.anInt10722);
		@Pc(41) Class8_Sub7 local41 = Static642.method8448(this.aBoolean350, 1);
		if (Static504.aBoolean579) {
			this.aClass114_3.method7491(local12, local41.aClass8_Sub6Array1[0], Static582.anInt8651, 0);
		} else {
			this.aClass114_3.method7480(local12, local41.aClass8_Sub6Array1[0], 0);
		}
		return local41;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(B)I")
	@Override
	public int method9299(@OriginalArg(0) byte arg0) {
		return this.aClass114_3 == null ? 0 : this.aClass114_3.ma();
	}
}
