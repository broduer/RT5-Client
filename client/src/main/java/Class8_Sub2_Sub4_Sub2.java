import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
public final class Class8_Sub2_Sub4_Sub2 extends Class8_Sub2_Sub4 implements Interface25 {

	@OriginalMember(owner = "client!qg", name = "I", descriptor = "Lclient!ke;")
	private Class207 aClass207_8;

	@OriginalMember(owner = "client!qg", name = "R", descriptor = "Z")
	private boolean aBoolean588 = true;

	@OriginalMember(owner = "client!qg", name = "bb", descriptor = "Lclient!sh;")
	public Class339 aClass339_4;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "Z")
	private final boolean aBoolean587;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIIIZIIIII)V")
	public Class8_Sub2_Sub4_Sub2(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass339_4 = new Class339(arg0, arg1, arg10, arg11, super.aByte144, arg3, this, arg7, arg12);
		this.aBoolean587 = arg1.anInt1276 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)I")
	@Override
	public int method6865() {
		return this.aClass339_4.anInt8669;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9283(@OriginalArg(1) Class19 arg0) {
		@Pc(14) Class114 local14 = this.aClass339_4.method7685(arg0, false, true, true, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(22) Class73 local22 = arg0.method7992();
		local22.method7132(super.anInt10718 + super.aShort101, super.anInt10719, super.anInt10722 + super.aShort102);
		@Pc(42) Class8_Sub7 local42 = Static642.method8448(this.aBoolean587, 1);
		@Pc(55) int local55 = super.anInt10718 >> 9;
		@Pc(60) int local60 = super.anInt10722 >> 9;
		this.aClass339_4.method7688(local60, local14, true, -9827, arg0, local55, local55, local60, local22);
		if (Static504.aBoolean579) {
			local14.method7491(local22, local42.aClass8_Sub6Array1[0], Static582.anInt8651, 0);
		} else {
			local14.method7480(local22, local42.aClass8_Sub6Array1[0], 0);
		}
		if (this.aClass339_4.aClass8_Sub5_7 != null) {
			@Pc(106) Class232 local106 = this.aClass339_4.aClass8_Sub5_7.method3645();
			if (Static504.aBoolean579) {
				arg0.method7974(local106, Static582.anInt8651);
			} else {
				arg0.method8028(local106);
			}
		}
		this.aBoolean588 = local14.F() || this.aClass339_4.aClass8_Sub5_7 != null;
		if (this.aClass207_8 == null) {
			this.aClass207_8 = Static317.method4590(super.anInt10719, super.anInt10718, local14, super.anInt10722);
		} else {
			Static223.method9110(local14, super.anInt10722, super.anInt10719, super.anInt10718, this.aClass207_8);
		}
		return local42;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)I")
	@Override
	public int method6862(@OriginalArg(0) int arg0) {
		return arg0 == 23796 ? this.aClass339_4.anInt8687 : -54;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V")
	@Override
	public void method6863() {
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6864(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		this.aClass339_4.method7676(arg0);
		if (arg1 < -42) {
			;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		@Pc(17) Class114 local17 = this.aClass339_4.method7685(arg3, false, !arg2, arg2, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(25) Class73 local25 = arg3.method7992();
			local25.method7132(super.aShort101 + super.anInt10718, super.anInt10719, super.anInt10722 + super.aShort102);
			return Static504.aBoolean579 ? local17.method7490(arg1, arg0, local25, false, 0, Static582.anInt8651) : local17.method7493(arg1, arg0, local25, false, 0);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!gp;B)V")
	public void method6869(@OriginalArg(0) Class150 arg0) {
		this.aClass339_4.method7686(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0) {
		if (arg0 != -19717) {
			this.method6863();
		}
		return this.aClass339_4.method7682(10);
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9290() {
		return false;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class207 method9285(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		return arg1 >= -93 ? null : this.aClass207_8;
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6868(@OriginalArg(0) Class19 arg0) {
		this.aClass339_4.method7675(arg0);
	}

	@OriginalMember(owner = "client!qg", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9289(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.aBoolean588 : true;
	}

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "(I)I")
	@Override
	public int method9293(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? this.aClass339_4.method7678() : 14;
	}

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9296(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != -5) {
			this.method6869((Class150) null);
		}
		@Pc(21) Class114 local21 = this.aClass339_4.method7685(arg0, false, true, true, 262144);
		if (local21 == null) {
			return;
		}
		@Pc(28) int local28 = super.anInt10718 >> 9;
		@Pc(33) int local33 = super.anInt10722 >> 9;
		@Pc(36) Class73 local36 = arg0.method7992();
		local36.method7132(super.anInt10718, super.anInt10719, super.anInt10722);
		this.aClass339_4.method7688(local33, local21, false, arg1 - 9822, arg0, local28, local28, local33, local36);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	@Override
	public int method6866(@OriginalArg(0) int arg0) {
		if (arg0 != -32136) {
			this.aClass339_4 = null;
		}
		return this.aClass339_4.anInt8673;
	}
}
