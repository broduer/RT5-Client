import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class8_Sub2_Sub5_Sub1 extends Class8_Sub2_Sub5 {

	@OriginalMember(owner = "client!sv", name = "ib", descriptor = "I")
	public int anInt8891;

	@OriginalMember(owner = "client!sv", name = "cb", descriptor = "I")
	public int anInt8896;

	@OriginalMember(owner = "client!sv", name = "Q", descriptor = "I")
	public int anInt8897;

	@OriginalMember(owner = "client!sv", name = "S", descriptor = "I")
	public int anInt8898;

	@OriginalMember(owner = "client!sv", name = "db", descriptor = "I")
	public int anInt8900 = -1;

	@OriginalMember(owner = "client!sv", name = "X", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!sv", name = "fb", descriptor = "I")
	private int anInt8903 = 0;

	@OriginalMember(owner = "client!sv", name = "kb", descriptor = "I")
	public int anInt8902 = -1;

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
	public int anInt8909 = 0;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(IIIII)V")
	public Class8_Sub2_Sub5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(B)I")
	@Override
	public int method9294() {
		@Pc(9) ObjType local9 = client.objTypeList.get(this.anInt8891);
		@Pc(12) int local12 = local9.anInt10166;
		if (this.anInt8902 != -1) {
			@Pc(22) ObjType local22 = client.objTypeList.get(this.anInt8902);
			if (local22.anInt10166 > local12) {
				local12 = local22.anInt10166;
			}
		}
		if (this.anInt8900 != -1) {
			@Pc(48) ObjType local48 = client.objTypeList.get(this.anInt8900);
			if (local48.anInt10166 > local12) {
				local12 = local48.anInt10166;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method9289(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.anInt8903 = -87;
		}
		return this.aBoolean673;
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(B)I")
	@Override
	public int method9299(@OriginalArg(0) byte arg0) {
		return arg0 == -21 ? this.anInt8903 : -65;
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9296(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -5) {
			;
		}
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class207 method9285(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -93) {
			this.method9285(null, 61);
		}
		return null;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(I)I")
	@Override
	public int method9293(@OriginalArg(0) int arg0) {
		return arg0 == 2 ? -10 : -14;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (arg2) {
			this.method9285(null, 104);
		}
		@Pc(16) Class73 local16 = arg3.method7992();
		local16.method7132(super.anInt10718, super.anInt10719 - 10, super.anInt10722);
		@Pc(32) ObjType local32 = client.objTypeList.get(this.anInt8891);
		@Pc(42) Class114 local42 = local32.method8812(null, 131072, null, this.anInt8897, arg3);
		if (local42 != null && (Static504.aBoolean579 ? local42.method7490(arg1, arg0, local16, true, local32.anInt10166, Static582.anInt8651) : local42.method7493(arg1, arg0, local16, true, local32.anInt10166))) {
			return true;
		}
		@Pc(82) ObjType local82;
		if (this.anInt8902 != -1) {
			local82 = client.objTypeList.get(this.anInt8902);
			local42 = local82.method8812(null, 131072, null, this.anInt8898, arg3);
			if (local42 != null && (Static504.aBoolean579 ? local42.method7490(arg1, arg0, local16, true, local82.anInt10166, Static582.anInt8651) : local42.method7493(arg1, arg0, local16, true, local82.anInt10166))) {
				return true;
			}
		}
		if (this.anInt8900 != -1) {
			local82 = client.objTypeList.get(this.anInt8900);
			local42 = local82.method8812(null, 131072, null, this.anInt8896, arg3);
			if (local42 != null && (Static504.aBoolean579 ? local42.method7490(arg1, arg0, local16, true, local82.anInt10166, Static582.anInt8651) : local42.method7493(arg1, arg0, local16, true, local82.anInt10166))) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method9290() {
		return false;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9283(@OriginalArg(1) Class19 arg0) {
		@Pc(17) Class288 local17 = Static467.method6358(super.aByte144, super.anInt10718 >> Static52.anInt1070, super.anInt10722 >> Static52.anInt1070);
		@Pc(29) Class8_Sub2_Sub2 local29 = Static687.method8966(super.aByte144, super.anInt10718 >> Static52.anInt1070, super.anInt10722 >> Static52.anInt1070);
		@Pc(31) int local31 = 0;
		if (local17 != null && local17.aClass8_Sub2_Sub1_1.aBoolean816) {
			local31 = local17.aClass8_Sub2_Sub1_1.method9293(2);
		}
		if (local29 != null && -local31 < local29.aShort46) {
			local31 = -local29.aShort46;
		}
		if (local31 != this.anInt8909) {
			super.anInt10719 -= this.anInt8909;
			this.anInt8909 = local31;
			super.anInt10719 += local31;
		}
		@Pc(94) Class73 local94 = arg0.method7992();
		local94.method7140();
		if (this.anInt8909 == 0) {
			@Pc(110) Class178 local110 = Static246.aClass178Array1[super.aByte143];
			@Pc(115) int local115 = this.anInt8903 << 1;
			@Pc(122) int local122 = -local115 / 2;
			@Pc(127) int local127 = -local115 / 2;
			@Pc(139) int local139 = local110.method7885(super.anInt10722 + local127, local122 + super.anInt10718);
			@Pc(143) int local143 = local115 / 2;
			@Pc(148) int local148 = -local115 / 2;
			@Pc(161) int local161 = local110.method7885(super.anInt10722 + local148, local143 + super.anInt10718);
			@Pc(166) int local166 = -local115 / 2;
			@Pc(170) int local170 = local115 / 2;
			@Pc(182) int local182 = local110.method7885(local170 + super.anInt10722, super.anInt10718 + local166);
			@Pc(186) int local186 = local115 / 2;
			@Pc(190) int local190 = local115 / 2;
			@Pc(203) int local203 = local110.method7885(super.anInt10722 + local190, local186 + super.anInt10718);
			@Pc(215) int local215 = local161 > local139 ? local139 : local161;
			@Pc(223) int local223 = local203 > local182 ? local182 : local203;
			@Pc(235) int local235 = local161 < local203 ? local161 : local203;
			@Pc(243) int local243 = local139 >= local182 ? local182 : local139;
			if (local115 != 0) {
				@Pc(259) int local259 = (int) (Math.atan2(local215 - local223, local115) * 2607.5945876176133D) & 0x3FFF;
				if (local259 != 0) {
					local94.method7137(local259);
				}
			}
			if (local115 != 0) {
				@Pc(285) int local285 = (int) (Math.atan2(local243 - local235, local115) * 2607.5945876176133D) & 0x3FFF;
				if (local285 != 0) {
					local94.method7146(-local285);
				}
			}
			@Pc(297) int local297 = local203 + local139;
			if (local182 + local161 < local297) {
				local297 = local161 + local182;
			}
			local297 = (local297 >> 1) - super.anInt10719;
			if (local297 != 0) {
				local94.method7141(0, local297, 0);
			}
		}
		local94.method7141(super.anInt10718, super.anInt10719 - 10, super.anInt10722);
		@Pc(345) Class8_Sub7 local345 = Static642.method8448(true, 3);
		this.anInt8903 = 0;
		this.aBoolean673 = false;
		@Pc(369) Class114 local369;
		if (this.anInt8900 != -1) {
			local369 = client.objTypeList.get(this.anInt8900).method8812(null, 2048, null, this.anInt8896, arg0);
			if (local369 != null) {
				if (Static504.aBoolean579) {
					local369.method7491(local94, local345.aClass8_Sub6Array1[2], Static582.anInt8651, 0);
				} else {
					local369.method7480(local94, local345.aClass8_Sub6Array1[2], 0);
				}
				this.aBoolean673 |= local369.F();
				this.anInt8903 = local369.ma();
			}
		}
		if (this.anInt8902 != -1) {
			local369 = client.objTypeList.get(this.anInt8902).method8812(null, 2048, null, this.anInt8898, arg0);
			if (local369 != null) {
				if (Static504.aBoolean579) {
					local369.method7491(local94, local345.aClass8_Sub6Array1[1], Static582.anInt8651, 0);
				} else {
					local369.method7480(local94, local345.aClass8_Sub6Array1[1], 0);
				}
				this.aBoolean673 |= local369.F();
				if (local369.ma() > this.anInt8903) {
					this.anInt8903 = local369.ma();
				}
			}
		}
		local369 = client.objTypeList.get(this.anInt8891).method8812(null, 2048, null, this.anInt8897, arg0);
		if (local369 != null) {
			if (Static504.aBoolean579) {
				local369.method7491(local94, local345.aClass8_Sub6Array1[0], Static582.anInt8651, 0);
			} else {
				local369.method7480(local94, local345.aClass8_Sub6Array1[0], 0);
			}
			this.aBoolean673 |= local369.F();
			if (local369.ma() > this.anInt8903) {
				this.anInt8903 = local369.ma();
			}
		}
		return local345;
	}
}
