import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lia")
public final class SpotAnimType {

	@OriginalMember(owner = "client!lia", name = "m", descriptor = "I")
	public int anInt5853;

	@OriginalMember(owner = "client!lia", name = "s", descriptor = "I")
	private int anInt5854;

	@OriginalMember(owner = "client!lia", name = "l", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!lia", name = "y", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!lia", name = "e", descriptor = "Lclient!fh;")
	public SpotAnimTypeList aClass128_2;

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
	private int anInt5855 = 0;

	@OriginalMember(owner = "client!lia", name = "q", descriptor = "B")
	public byte aByte96 = 0;

	@OriginalMember(owner = "client!lia", name = "t", descriptor = "I")
	private int anInt5858 = 0;

	@OriginalMember(owner = "client!lia", name = "z", descriptor = "I")
	public int anInt5862 = -1;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "I")
	private int anInt5859 = 0;

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "I")
	private int anInt5867 = 128;

	@OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
	private int anInt5863 = 128;

	@OriginalMember(owner = "client!lia", name = "k", descriptor = "I")
	private int anInt5857 = -1;

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "Z")
	public boolean aBoolean448 = false;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method5253(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.g1();
			if (local12 == 0) {
				return;
			}
			this.method5257(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(BZILclient!gu;Lclient!s;BILclient!s;IILclient!ha;)Lclient!ka;")
	public Class114 method5256(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class152 arg3, @OriginalArg(4) Class178 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class178 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class19 arg9) {
		@Pc(13) boolean local13 = arg1 & this.aByte96 != 0;
		@Pc(15) int local15 = arg7;
		if (arg3 != null) {
			local15 = arg7 | arg3.method9108();
		}
		if (local13) {
			local15 |= this.aByte96 == 3 ? 7 : 2;
		}
		if (this.anInt5863 != 128) {
			local15 |= 0x2;
		}
		if (this.anInt5867 != 128 || this.anInt5858 != 0) {
			local15 |= 0x5;
		}
		@Pc(65) SoftLruHashTable local65 = this.aClass128_2.aClass82_62;
		@Pc(85) Class114 local85;
		synchronized (this.aClass128_2.aClass82_62) {
			local85 = (Class114) this.aClass128_2.aClass82_62.get(this.anInt5853 |= arg9.anInt8986 << 29);
		}
		if (local85 == null || arg9.method7967(local85.ua(), local15) != 0) {
			if (local85 != null) {
				local15 = arg9.method8020(local15, local85.ua());
			}
			@Pc(121) int local121 = local15;
			if (this.aShortArray81 != null) {
				local121 = local15 | 0x4000;
			}
			if (this.aShortArray82 != null) {
				local121 |= 0x8000;
			}
			@Pc(144) Class88 local144 = Static121.method2201(this.anInt5854, this.aClass128_2.aClass332_34);
			if (local144 == null) {
				return null;
			}
			if (local144.anInt2388 < 13) {
				local144.method2232();
			}
			local85 = arg9.method7959(local144, local121, this.aClass128_2.anInt2930, this.anInt5855 + 64, this.anInt5859 + 850);
			@Pc(180) int local180;
			if (this.aShortArray81 != null) {
				for (local180 = 0; local180 < this.aShortArray81.length; local180++) {
					local85.ia(this.aShortArray81[local180], this.aShortArray80[local180]);
				}
			}
			if (this.aShortArray82 != null) {
				for (local180 = 0; local180 < this.aShortArray82.length; local180++) {
					local85.aa(this.aShortArray82[local180], this.aShortArray83[local180]);
				}
			}
			local85.s(local15);
			@Pc(232) SoftLruHashTable local232 = this.aClass128_2.aClass82_62;
			synchronized (this.aClass128_2.aClass82_62) {
				this.aClass128_2.aClass82_62.put(local85, this.anInt5853 |= arg9.anInt8986 << 29);
			}
		}
		@Pc(263) Class114 local263 = local85.method7502(arg0, local15, true);
		if (arg3 != null) {
			arg3.method9096(local263, 0);
		}
		if (this.anInt5867 != 128 || this.anInt5863 != 128) {
			local263.O(this.anInt5867, this.anInt5863, this.anInt5867);
		}
		if (this.anInt5858 != 0) {
			if (this.anInt5858 == 90) {
				local263.a(4096);
			}
			if (this.anInt5858 == 180) {
				local263.a(8192);
			}
			if (this.anInt5858 == 270) {
				local263.a(12288);
			}
		}
		if (local13) {
			local263.p(this.aByte96, this.anInt5857, arg6, arg4, arg5, arg8, arg2);
		}
		local263.s(arg7);
		return local263;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method5257(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.anInt5854 = arg1.g2();
		} else if (arg0 == 2) {
			this.anInt5862 = arg1.g2();
		} else if (arg0 == 4) {
			this.anInt5867 = arg1.g2();
		} else if (arg0 == 5) {
			this.anInt5863 = arg1.g2();
		} else if (arg0 == 6) {
			this.anInt5858 = arg1.g2();
		} else if (arg0 == 7) {
			this.anInt5855 = arg1.g1();
		} else if (arg0 == 8) {
			this.anInt5859 = arg1.g1();
		} else if (arg0 == 9) {
			this.aByte96 = 3;
			this.anInt5857 = 8224;
		} else if (arg0 == 10) {
			this.aBoolean448 = true;
		} else if (arg0 == 11) {
			this.aByte96 = 1;
		} else if (arg0 == 12) {
			this.aByte96 = 4;
		} else if (arg0 == 13) {
			this.aByte96 = 5;
		} else if (arg0 == 14) {
			this.aByte96 = 2;
			this.anInt5857 = arg1.g1() * 256;
		} else if (arg0 == 15) {
			this.aByte96 = 3;
			this.anInt5857 = arg1.g2();
		} else if (arg0 == 16) {
			this.aByte96 = 3;
			this.anInt5857 = arg1.g4();
		} else {
			@Pc(132) int local132;
			@Pc(142) int local142;
			if (arg0 == 40) {
				local132 = arg1.g1();
				this.aShortArray80 = new short[local132];
				this.aShortArray81 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray81[local142] = (short) arg1.g2();
					this.aShortArray80[local142] = (short) arg1.g2();
				}
			} else if (arg0 == 41) {
				local132 = arg1.g1();
				this.aShortArray83 = new short[local132];
				this.aShortArray82 = new short[local132];
				for (local142 = 0; local142 < local132; local142++) {
					this.aShortArray82[local142] = (short) arg1.g2();
					this.aShortArray83[local142] = (short) arg1.g2();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!gu;BIBLclient!ha;)Lclient!ka;")
	public Class114 method5259(@OriginalArg(0) Class152 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class19 arg3) {
		return this.method5256(arg1, false, 0, arg0, null, 0, null, arg2, 0, arg3);
	}
}
