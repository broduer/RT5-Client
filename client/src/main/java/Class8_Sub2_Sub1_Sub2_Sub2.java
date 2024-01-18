import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class8_Sub2_Sub1_Sub2_Sub2 extends Class8_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!wj", name = "Qc", descriptor = "Ljava/lang/String;")
	public String aString128;

	@OriginalMember(owner = "client!wj", name = "Gc", descriptor = "Lclient!vk;")
	public Class388 aClass388_1;

	@OriginalMember(owner = "client!wj", name = "Yc", descriptor = "Lclient!o;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!wj", name = "Sc", descriptor = "I")
	public int anInt10820;

	@OriginalMember(owner = "client!wj", name = "ad", descriptor = "I")
	public int anInt10803 = -1;

	@OriginalMember(owner = "client!wj", name = "fd", descriptor = "I")
	public int anInt10796 = -1;

	@OriginalMember(owner = "client!wj", name = "Jc", descriptor = "I")
	public int anInt10817 = 1;

	@OriginalMember(owner = "client!wj", name = "Dc", descriptor = "I")
	public int anInt10819 = 1;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
	public Class8_Sub2_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "(I)V")
	@Override
	public void method9287(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "(B)Z")
	public boolean method9329() {
		return this.aClass270_1 != null;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLclient!ha;IBILclient!eo;)V")
	@Override
	public void method9292(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIZLclient!ha;)Z")
	@Override
	public boolean method9286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class19 arg3) {
		if (this.aClass270_1 == null || !this.method9331(131072, arg3)) {
			return false;
		}
		@Pc(20) Class73 local20 = arg3.method7992();
		@Pc(25) int local25 = super.aClass126_7.method2673(16383);
		local20.method7138(local25);
		local20.method7141(super.anInt10718, super.anInt10719, super.anInt10722);
		@Pc(38) boolean local38 = arg2;
		for (@Pc(40) int local40 = 0; local40 < super.aClass114Array3.length; local40++) {
			if (super.aClass114Array3[local40] != null) {
				@Pc(71) boolean var10000;
				label50: {
					if (this.aClass270_1.anInt6743 <= 0) {
						label48: {
							if (this.aClass270_1.anInt6726 == -1) {
								if (this.aClass270_1.anInt6733 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass270_1.anInt6726 == 1) {
									break label48;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label50;
							}
						}
					}
					var10000 = true;
				}
				@Pc(89) boolean local89 = var10000;
				@Pc(105) boolean local105;
				if (Static504.aBoolean579) {
					local105 = super.aClass114Array3[local40].method7490(arg1, arg0, local20, local89, this.aClass270_1.anInt6743, Static582.anInt8651);
				} else {
					local105 = super.aClass114Array3[local40].method7493(arg1, arg0, local20, local89, this.aClass270_1.anInt6743);
				}
				if (local105) {
					local38 = true;
					break;
				}
			}
		}
		for (@Pc(136) int local136 = 0; local136 < super.aClass114Array3.length; local136++) {
			super.aClass114Array3[local136] = null;
		}
		return local38;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILclient!ha;)Lclient!pea;")
	@Override
	public Class8_Sub7 method9283(@OriginalArg(1) Class19 arg0) {
		if (this.aClass270_1 == null || !this.method9331(2048, arg0)) {
			return null;
		}
		@Pc(22) Class73 local22 = arg0.method7992();
		@Pc(27) int local27 = super.aClass126_7.method2673(16383);
		local22.method7138(local27);
		@Pc(45) Class293 local45 = Static334.aClass293ArrayArrayArray1[super.aByte144][super.anInt10718 >> Static52.anInt1070][super.anInt10722 >> Static52.anInt1070];
		if (local45 == null || local45.aClass8_Sub2_Sub2_1 == null) {
			super.anInt10760 = (int) ((float) super.anInt10760 - (float) super.anInt10760 / 10.0F);
		} else {
			@Pc(75) int local75 = super.anInt10760 - local45.aClass8_Sub2_Sub2_1.aShort46;
			super.anInt10760 = (int) ((float) super.anInt10760 - (float) local75 / 10.0F);
		}
		local22.method7141(super.anInt10718, -super.anInt10760 + super.anInt10719 - 20, super.anInt10722);
		@Pc(104) BasType local104 = this.method9324();
		@Pc(118) Class270 local118 = this.aClass270_1.anIntArray532 == null ? this.aClass270_1 : this.aClass270_1.method5992(65535, Static34.aClass306_1);
		super.aBoolean820 = false;
		@Pc(123) Class8_Sub7 local123 = null;
		if (Static400.aClass2_Sub34_28.aClass57_Sub7_1.method2905() == 1 && local118.aBoolean506 && local104.aBoolean545) {
			@Pc(159) Class152 local159 = super.aClass152_11.method9116() && super.aClass152_11.method9113() ? super.aClass152_11 : null;
			@Pc(179) Class152 local179 = super.aClass152_10.method9116() && (!super.aBoolean818 || local159 == null) ? super.aClass152_10 : null;
			@Pc(223) Class114 local223 = Static618.method8327(this.aClass270_1.aByte109 & 0xFF, super.aClass114Array3[0], super.anInt10770, this.aClass270_1.aShort76 & 0xFFFF, super.anInt10744, this.aClass270_1.anInt6733, arg0, this.aClass270_1.aByte111 & 0xFF, local179 == null ? local159 : local179, super.anInt10775, local27, this.aClass270_1.aShort75 & 0xFFFF);
			if (local223 != null) {
				local123 = Static642.method8448(this.method9337(), super.aClass114Array3.length + 1);
				super.aBoolean820 = true;
				arg0.C(false);
				if (Static504.aBoolean579) {
					local223.method7491(local22, local123.aClass8_Sub6Array1[super.aClass114Array3.length], Static582.anInt8651, 0);
				} else {
					local223.method7480(local22, local123.aClass8_Sub6Array1[super.aClass114Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method7138(local27);
		local22.method7141(super.anInt10718, -super.anInt10760 + super.anInt10719 - 5, super.anInt10722);
		if (local123 == null) {
			local123 = Static642.method8448(this.method9337(), super.aClass114Array3.length);
		}
		this.method9326(arg0, false, super.aClass114Array3, local22);
		@Pc(314) int local314;
		if (Static504.aBoolean579) {
			for (local314 = 0; local314 < super.aClass114Array3.length; local314++) {
				if (super.aClass114Array3[local314] != null) {
					super.aClass114Array3[local314].method7491(local22, local123.aClass8_Sub6Array1[local314], Static582.anInt8651, 0);
				}
			}
		} else {
			for (local314 = 0; local314 < super.aClass114Array3.length; local314++) {
				if (super.aClass114Array3[local314] != null) {
					super.aClass114Array3[local314].method7480(local22, local123.aClass8_Sub6Array1[local314], 0);
				}
			}
		}
		if (super.aClass8_Sub5_8 != null) {
			@Pc(394) Class232 local394 = super.aClass8_Sub5_8.method3645();
			if (Static504.aBoolean579) {
				arg0.method7974(local394, Static582.anInt8651);
			} else {
				arg0.method8028(local394);
			}
		}
		for (@Pc(419) int local419 = 0; local419 < super.aClass114Array3.length; local419++) {
			if (super.aClass114Array3[local419] != null) {
				super.aBoolean820 |= super.aClass114Array3[local419].F();
			}
			super.aClass114Array3[local419] = null;
		}
		super.anInt10732 = Static198.anInt3285;
		return local123;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZLclient!ha;)Z")
	private boolean method9331(@OriginalArg(0) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) BasType local9 = this.method9324();
		@Pc(27) Class152 local27 = super.aClass152_11.method9116() && !super.aClass152_11.method9113() ? super.aClass152_11 : null;
		@Pc(47) Class152 local47 = super.aClass152_10.method9116() && (!super.aBoolean818 || local27 == null) ? super.aClass152_10 : null;
		@Pc(50) int local50 = local9.anInt7255;
		@Pc(53) int local53 = local9.anInt7259;
		if (local50 != 0 || local53 != 0 || local9.anInt7245 != 0 || local9.anInt7273 != 0) {
			arg0 |= 0x7;
		}
		@Pc(100) boolean local100 = super.aByte149 != 0 && super.anInt10789 <= client.cycle && client.cycle < super.anInt10781;
		if (local100) {
			arg0 |= 0x80000;
		}
		@Pc(111) int local111 = super.aClass126_7.method2673(16383);
		@Pc(134) Class114 local134 = super.aClass114Array3[0] = this.aClass270_1.method6000(Static34.aClass306_1, arg1, client.basTypeList, local27, local111, super.anIntArray877, this.aClass388_1, local47, arg0, super.aClass152_Sub2_Sub1Array3);
		if (local134 == null) {
			return false;
		}
		super.anInt10777 = local134.fa();
		super.anInt10756 = local134.ma();
		this.method9313(local134);
		if (local50 == 0 && local53 == 0) {
			this.method9321(local111, 0, 0, this.method9309((byte) 116) << 9, this.method9309((byte) 79) << 9, -86);
		} else {
			this.method9321(local111, local9.anInt7257, local9.anInt7279, local50, local53, -119);
			if (super.anInt10775 != 0) {
				super.aClass114Array3[0].FA(super.anInt10775);
			}
			if (super.anInt10770 != 0) {
				super.aClass114Array3[0].VA(super.anInt10770);
			}
			if (super.anInt10744 != 0) {
				super.aClass114Array3[0].H(0, super.anInt10744, 0);
			}
		}
		if (local100) {
			local134.method7495(super.aByte150, super.aByte147, super.aByte148, super.aByte149 & 0xFF);
		}
		this.method9304(local5, local53, arg1, local9, local111, local50);
		return true;
	}

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)I")
	@Override
	public int method9306() {
		if (this.aClass270_1.anIntArray532 != null) {
			@Pc(19) Class270 local19 = this.aClass270_1.method5992(65535, Static34.aClass306_1);
			if (local19 != null && local19.anInt6727 != -1) {
				return local19.anInt6727;
			}
		}
		return this.aClass270_1.anInt6727 == -1 ? super.method9306() : this.aClass270_1.anInt6727;
	}

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(Lclient!ha;I)Lclient!ke;")
	@Override
	public Class207 method9285(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -93) {
			this.method9327(98);
		}
		return null;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)Lclient!dj;")
	@Override
	public Class80 method9325(@OriginalArg(0) int arg0) {
		if (arg0 == -3109) {
			return super.aClass80_3 != null && super.aClass80_3.aString20 == null ? null : super.aClass80_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method9318() {
		return Static65.aClass3_1.aBoolean5;
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(B)I")
	@Override
	public int method9311(@OriginalArg(0) byte arg0) {
		if (this.aClass270_1.anIntArray532 != null) {
			@Pc(22) Class270 local22 = this.aClass270_1.method5992(65535, Static34.aClass306_1);
			if (local22 != null && local22.anInt6735 != -1) {
				return local22.anInt6735;
			}
		}
		return this.aClass270_1.anInt6735;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)V")
	public void method9332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray879[0];
		@Pc(20) int local20 = super.anIntArray878[0];
		if (arg1 == 0) {
			local20++;
		}
		if (arg1 == 1) {
			local20++;
			local10++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local20--;
			local10++;
		}
		if (arg1 == 4) {
			local20--;
		}
		if (arg1 == 5) {
			local20--;
			local10--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local10--;
			local20++;
		}
		if (super.aClass152_11.method9116() && super.aClass152_11.method9114().anInt1661 == 1) {
			super.anIntArray869 = null;
			super.aClass152_11.method9120(true, -1);
		}
		for (@Pc(110) int local110 = 0; local110 < super.aClass201Array3.length; local110++) {
			if (super.aClass201Array3[local110].anInt4947 != -1) {
				@Pc(131) SpotAnimType local131 = client.spotanimTypeList.method2694(super.aClass201Array3[local110].anInt4947);
				if (local131.aBoolean448 && local131.anInt5862 != -1 && client.seqTypeList.method1162(local131.anInt5862).anInt1661 == 1) {
					super.aClass201Array3[local110].aClass152_7.method9120(true, -1);
					super.aClass201Array3[local110].anInt4947 = -1;
				}
			}
		}
		if (super.anInt10793 < super.anIntArray879.length - 1) {
			super.anInt10793++;
		}
		for (@Pc(201) int local201 = super.anInt10793; local201 > 0; local201--) {
			super.anIntArray879[local201] = super.anIntArray879[local201 - 1];
			super.anIntArray878[local201] = super.anIntArray878[local201 - 1];
			super.aByteArray111[local201] = super.aByteArray111[local201 - 1];
		}
		super.anIntArray879[0] = local10;
		super.anIntArray878[0] = local20;
		super.aByteArray111[0] = (byte) arg0;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZIIII)V")
	public void method9333(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte144 = super.aByte143 = (byte) arg3;
		if (Static441.method5975(arg1, arg2)) {
			super.aByte143++;
		}
		if (super.aClass152_11.method9116() && super.aClass152_11.method9114().anInt1661 == 1) {
			super.anIntArray869 = null;
			super.aClass152_11.method9120(true, -1);
		}
		for (@Pc(61) int local61 = 0; local61 < super.aClass201Array3.length; local61++) {
			if (super.aClass201Array3[local61].anInt4947 != -1) {
				@Pc(81) SpotAnimType local81 = client.spotanimTypeList.method2694(super.aClass201Array3[local61].anInt4947);
				if (local81.aBoolean448 && local81.anInt5862 != -1 && client.seqTypeList.method1162(local81.anInt5862).anInt1661 == 1) {
					super.aClass201Array3[local61].aClass152_7.method9120(true, -1);
					super.aClass201Array3[local61].anInt4947 = -1;
				}
			}
		}
		if (!arg0) {
			@Pc(134) int local134 = arg2 - super.anIntArray879[0];
			@Pc(142) int local142 = arg1 - super.anIntArray878[0];
			if (local134 >= -8 && local134 <= 8 && local142 >= -8 && local142 <= 8) {
				if (super.anIntArray879.length - 1 > super.anInt10793) {
					super.anInt10793++;
				}
				for (@Pc(183) int local183 = super.anInt10793; local183 > 0; local183--) {
					super.anIntArray879[local183] = super.anIntArray879[local183 - 1];
					super.anIntArray878[local183] = super.anIntArray878[local183 - 1];
					super.aByteArray111[local183] = super.aByteArray111[local183 - 1];
				}
				super.anIntArray879[0] = arg2;
				super.aByteArray111[0] = 1;
				super.anIntArray878[0] = arg1;
				return;
			}
		}
		super.anInt10793 = 0;
		super.anInt10792 = 0;
		super.anIntArray879[0] = arg2;
		super.anInt10791 = 0;
		super.anIntArray878[0] = arg1;
		super.anInt10718 = (arg4 << 8) + (super.anIntArray879[0] << 9);
		super.anInt10722 = (super.anIntArray878[0] << 9) + (arg4 << 8);
		if (super.aClass8_Sub5_8 != null) {
			super.aClass8_Sub5_8.method3656();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILjava/lang/String;B)V")
	public void method9334(@OriginalArg(2) String arg0) {
		@Pc(17) int local17 = Static504.method6740() * Static65.aClass3_1.anInt85;
		this.method9320(local17, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method9296(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass270_1 == null || !super.aBoolean821 && !this.method9331(0, arg0)) {
			return;
		}
		@Pc(26) Class73 local26 = arg0.method7992();
		local26.method7138(super.aClass126_7.method2673(16383));
		local26.method7141(super.anInt10718, super.anInt10719 - 20, super.anInt10722);
		this.method9326(arg0, super.aBoolean821, super.aClass114Array3, local26);
		for (@Pc(53) int local53 = 0; local53 < super.aClass114Array3.length; local53++) {
			super.aClass114Array3[local53] = null;
		}
		if (arg1 != -5) {
			this.method9285(null, -21);
		}
	}

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method9297() {
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!o;Z)V")
	public void method9335(@OriginalArg(0) Class270 arg0) {
		if (arg0 != this.aClass270_1 && Static400.aBoolean623 && Static321.method4629(super.anInt10768)) {
			Static488.method6529();
		}
		this.aClass270_1 = arg0;
		if (this.aClass270_1 != null) {
			this.aString128 = this.aClass270_1.aString73;
			this.anInt10820 = this.aClass270_1.anInt6747;
		}
		if (super.aClass8_Sub5_8 != null) {
			super.aClass8_Sub5_8.method3656();
		}
	}

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "(I)I")
	@Override
	protected int method9327(@OriginalArg(0) int arg0) {
		if (this.aClass270_1.anIntArray532 != null) {
			@Pc(15) Class270 local15 = this.aClass270_1.method5992(arg0 + 65535, Static34.aClass306_1);
			if (local15 != null && local15.anInt6746 != -1) {
				return local15.anInt6746;
			}
		}
		if (arg0 != 0) {
			this.anInt10803 = -66;
		}
		return this.aClass270_1.anInt6746;
	}

	@OriginalMember(owner = "client!wj", name = "n", descriptor = "(I)Z")
	private boolean method9337() {
		return this.aClass270_1.aBoolean505;
	}

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)I")
	@Override
	public int method9294() {
		return this.aClass270_1 == null ? 0 : this.aClass270_1.anInt6743;
	}
}
