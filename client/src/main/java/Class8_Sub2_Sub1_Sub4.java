import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class8_Sub2_Sub1_Sub4 extends Class8_Sub2_Sub1 implements Interface25 {

	@OriginalMember(owner = "client!oe", name = "P", descriptor = "Lclient!ke;")
	private Class205 aClass205_7;

	@OriginalMember(owner = "client!oe", name = "X", descriptor = "Z")
	private boolean aBoolean518 = true;

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "Lclient!sh;")
	public Class337 aClass337_3;

	@OriginalMember(owner = "client!oe", name = "S", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIIIII)V")
	public Class8_Sub2_Sub1_Sub4(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.lb == 1, Static609.method5799(arg12, arg13));
		this.aClass337_3 = new Class337(arg0, arg1, arg12, arg13, super.aByte144, arg3, this, arg7, arg14);
		this.aBoolean517 = arg1.anInt1271 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		if (arg4 < 101) {
			Static451.aClass225_171 = null;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(12) Class114 local12 = this.aClass337_3.method5432(arg3, false, true, arg2, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(20) Class73 local20 = arg3.A();
			local20.a(super.anInt10690, super.anInt10691, super.anInt10694);
			return Static504.aBoolean579 ? local12.a(arg1, arg0, local20, false, 0, Static582.anInt8627) : local12.a(arg1, arg0, local20, false, 0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 a(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class114 local14 = this.aClass337_3.method5432(arg0, false, true, true, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(30) Class73 local30 = arg0.A();
		local30.a(super.anInt10690, super.anInt10691, super.anInt10694);
		@Pc(44) Class8_Sub7 local44 = Static642.method5995(this.aBoolean517, 1);
		this.aClass337_3.method5435(super.aShort133, local14, true, -9827, arg0, super.aShort134, super.aShort131, super.aShort132, local30);
		if (Static504.aBoolean579) {
			local14.a(local30, local44.aClass8_Sub6Array1[0], Static582.anInt8627, 0);
		} else {
			local14.a(local30, local44.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass337_3.aClass8_Sub5_7 != null) {
			@Pc(94) Class230 local94 = this.aClass337_3.aClass8_Sub5_7.method2641();
			if (Static504.aBoolean579) {
				arg0.a(local94, Static582.anInt8627);
			} else {
				arg0.a(local94);
			}
		}
		this.aBoolean518 = local14.F() || this.aClass337_3.aClass8_Sub5_7 != null;
		if (this.aClass205_7 == null) {
			this.aClass205_7 = Static317.method3206(super.anInt10691, super.anInt10690, local14, super.anInt10694);
		} else {
			Static223.method6537(local14, super.anInt10694, super.anInt10691, super.anInt10690, this.aClass205_7);
		}
		return local44;
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)Z")
	@Override
	public boolean h(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.aClass205_7 = null;
		}
		return this.aBoolean518;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)I")
	@Override
	public int method4818(@OriginalArg(0) int arg0) {
		if (arg0 != 23796) {
			this.aBoolean517 = false;
		}
		return this.aClass337_3.anInt8663;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method4823(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.aBoolean517 = false;
		}
		return this.aClass337_3.method5429(arg0 ^ 0xFFFFB2F1);
	}

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "(I)Z")
	@Override
	public boolean i(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? false : false;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void d(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class114 local12 = this.aClass337_3.method5432(arg0, true, true, true, 262144);
		if (arg1 == -5 && local12 != null) {
			@Pc(22) Class73 local22 = arg0.A();
			local22.a(super.anInt10690, super.anInt10691, super.anInt10694);
			this.aClass337_3.method5435(super.aShort133, local12, false, -9827, arg0, super.aShort134, super.aShort131, super.aShort132, local22);
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)I")
	@Override
	public int method4821() {
		return this.aClass337_3.anInt8645;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
	@Override
	public int method4822(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.aClass337_3 = null;
		}
		return this.aClass337_3.anInt8649;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class205 c(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			this.aClass337_3 = null;
		}
		return this.aClass205_7;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(I)V")
	@Override
	public void j(@OriginalArg(0) int arg0) {
		if (arg0 != 27811) {
			this.aBoolean517 = false;
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!gp;)V")
	public void method4274(@OriginalArg(1) Class150 arg0) {
		this.aClass337_3.method5433(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Z")
	@Override
	public boolean b() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method4820(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -42) {
			this.a(72, true, (Class19) null, -2, (byte) 37, -105, (Class8_Sub2) null);
		}
		this.aClass337_3.method5423(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)I")
	@Override
	public int c(@OriginalArg(0) byte arg0) {
		if (arg0 != -21) {
			this.aBoolean517 = true;
		}
		return this.aClass337_3.method5427(true);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method4824(@OriginalArg(0) Class19 arg0) {
		this.aClass337_3.method5422(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)V")
	@Override
	public void method4819() {
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "(I)I")
	@Override
	public int k(@OriginalArg(0) int arg0) {
		if (arg0 != 2) {
			this.aClass205_7 = null;
		}
		return this.aClass337_3.method5425();
	}
}
