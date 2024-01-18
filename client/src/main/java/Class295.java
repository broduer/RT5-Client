import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class295 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "[[Lclient!oh;")
	private Class276[][] aClass276ArrayArray1;

	@OriginalMember(owner = "client!pk", name = "p", descriptor = "Lclient!iga;")
	private final Class178_Sub1 aClass178_Sub1_2;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_17;

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	public final int anInt7450;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
	private final int anInt7447;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "[B")
	public final byte[] aByteArray87;

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
	private final int anInt7439;

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
	private final int anInt7442;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
	private final int anInt7448;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!am;Lclient!iga;)V")
	public Class295(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class178_Sub1 arg1) {
		this.aClass178_Sub1_2 = arg1;
		this.aClass19_Sub1_17 = arg0;
		this.anInt7450 = (this.aClass178_Sub1_2.anInt8918 * this.aClass178_Sub1_2.anInt8912 >> this.aClass19_Sub1_17.anInt9199) + 2;
		this.anInt7447 = (this.aClass178_Sub1_2.anInt8912 * this.aClass178_Sub1_2.anInt8916 >> this.aClass19_Sub1_17.anInt9199) + 2;
		this.aByteArray87 = new byte[this.anInt7450 * this.anInt7447];
		this.anInt7439 = this.aClass19_Sub1_17.anInt9199 + 7 - this.aClass178_Sub1_2.anInt8919;
		this.anInt7442 = this.aClass178_Sub1_2.anInt8918 >> this.anInt7439;
		this.anInt7448 = this.aClass178_Sub1_2.anInt8916 >> this.anInt7439;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	private void method6611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass276ArrayArray1 == null) {
			return;
		}
		@Pc(20) int local20 = arg2 - 1 >> 7;
		@Pc(30) int local30 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(36) int local36 = arg1 - 1 >> 7;
		@Pc(46) int local46 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(48) int local48 = local20; local48 <= local30; local48++) {
			@Pc(55) Class276[] local55 = this.aClass276ArrayArray1[local48];
			for (@Pc(57) int local57 = local36; local57 <= local46; local57++) {
				if (local55[local57] != null) {
					local55[local57].aBoolean520 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "([[ZIIIZI)V")
	public void method6612(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub1_17.method8079(false);
		this.aClass19_Sub1_17.method8090(false);
		this.aClass19_Sub1_17.method8060(1);
		this.aClass19_Sub1_17.method8061(1);
		this.aClass19_Sub1_17.method8115(false, -2, false);
		@Pc(54) float local54 = 1.0F / (float) (this.aClass19_Sub1_17.anInt9185 * 128);
		@Pc(58) int local58;
		@Pc(65) int local65;
		@Pc(72) int local72;
		@Pc(74) int local74;
		if (arg4) {
			for (local58 = 0; local58 < this.anInt7448; local58++) {
				local65 = local58 << this.anInt7439;
				local72 = local58 + 1 << this.anInt7439;
				label138: for (local74 = 0; local74 < this.anInt7442; local74++) {
					if (this.aClass276ArrayArray1[local74][local58] != null) {
						@Pc(90) int local90 = local74 << this.anInt7439;
						@Pc(97) int local97 = local74 + 1 << this.anInt7439;
						for (@Pc(99) int local99 = local90; local99 < local97; local99++) {
							if (local99 - arg3 >= -arg1 && arg1 >= local99 - arg3) {
								for (@Pc(127) int local127 = local65; local127 < local72; local127++) {
									if (-arg1 <= local127 - arg2 && local127 - arg2 <= arg1 && arg0[arg1 + local99 - arg3][local127 + arg1 - arg2]) {
										@Pc(169) Class73_Sub1 local169 = this.aClass19_Sub1_17.method8089();
										local169.method1884(1.0F, local54, local54);
										local169.method7141(-local74, -local58, 0);
										this.aClass19_Sub1_17.method8080(Static431.aClass372_5);
										this.aClass276ArrayArray1[local74][local58].method6236();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local58 = 0; local58 < this.anInt7448; local58++) {
				local65 = local58 << this.anInt7439;
				local72 = local58 + 1 << this.anInt7439;
				for (local74 = 0; local74 < this.anInt7442; local74++) {
					@Pc(266) Class276 local266 = this.aClass276ArrayArray1[local74][local58];
					if (local266 != null) {
						@Pc(279) Interface20 local279 = this.aClass19_Sub1_17.method8081(local266.anInt6949 * 3);
						@Pc(284) Buffer local284 = local279.method8554();
						if (local284 != null) {
							@Pc(292) Stream local292 = this.aClass19_Sub1_17.method8107(local284);
							@Pc(294) int local294 = 0;
							@Pc(299) int local299 = local74 << this.anInt7439;
							@Pc(306) int local306 = local74 + 1 << this.anInt7439;
							for (@Pc(308) int local308 = local65; local308 < local72; local308++) {
								if (local308 - arg2 >= -arg1 && arg1 >= local308 - arg2) {
									@Pc(342) int local342 = local299 + this.aClass178_Sub1_2.anInt8918 * local308;
									for (@Pc(344) int local344 = local299; local344 < local306; local344++) {
										if (-arg1 <= local344 - arg3 && local344 - arg3 <= arg1 && arg0[arg1 + local344 - arg3][local308 + arg1 - arg2]) {
											@Pc(393) short[] local393 = this.aClass178_Sub1_2.aShortArrayArray4[local342];
											if (local393 != null) {
												@Pc(401) int local401;
												if (Stream.b()) {
													for (local401 = 0; local401 < local393.length; local401++) {
														local292.b(local393[local401] & 0xFFFF);
														local294++;
													}
												} else {
													for (local401 = 0; local401 < local393.length; local401++) {
														local292.c(local393[local401] & 0xFFFF);
														local294++;
													}
												}
											}
										}
										local342++;
									}
								}
							}
							local292.c();
							if (local279.method8553() && local294 > 0) {
								@Pc(490) Class73_Sub1 local490 = this.aClass19_Sub1_17.method8089();
								local490.method1884(1.0F, local54, local54);
								local490.method7141(-local74, -local58, 0);
								this.aClass19_Sub1_17.method8080(Static431.aClass372_5);
								local266.method6233(local279, local294 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass19_Sub1_17.method8038();
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Lclient!r;III)V")
	public void method6614(@OriginalArg(0) SecondaryNode_Sub9 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) SecondaryNode_Sub9_Sub1 local17 = (SecondaryNode_Sub9_Sub1) arg0;
		arg2 += local17.anInt2337 + 1;
		arg1 += local17.anInt2335 + 1;
		@Pc(38) int local38 = arg1 + arg2 * this.anInt7450;
		@Pc(40) int local40 = 0;
		@Pc(43) int local43 = local17.anInt2334;
		@Pc(46) int local46 = local17.anInt2329;
		@Pc(52) int local52 = this.anInt7450 - local46;
		@Pc(54) int local54 = 0;
		@Pc(61) int local61;
		if (arg2 <= 0) {
			local61 = 1 - arg2;
			local40 = local46 * local61;
			arg2 = 1;
			local43 -= local61;
			local38 += this.anInt7450 * local61;
		}
		if (this.anInt7447 <= local43 + arg2) {
			local61 = local43 + arg2 + 1 - this.anInt7447;
			local43 -= local61;
		}
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local38 += local61;
			local52 += local61;
			arg1 = 1;
			local46 -= local61;
			local54 = local61;
			local40 += local61;
		}
		if (this.anInt7450 <= local46 + arg1) {
			local61 = local46 + arg1 + 1 - this.anInt7450;
			local54 += local61;
			local46 -= local61;
			local52 += local61;
		}
		if (local46 > 0 && local43 > 0) {
			Static714.method9348(local52, local40, this.aByteArray87, local43, local38, local17.aByteArray22, local46, local54);
			this.method6611(local43, arg2, arg1, local46);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!r;IB)Z")
	public boolean method6615(@OriginalArg(0) int arg0, @OriginalArg(1) SecondaryNode_Sub9 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) SecondaryNode_Sub9_Sub1 local6 = (SecondaryNode_Sub9_Sub1) arg1;
		arg2 += local6.anInt2337 + 1;
		arg0 += local6.anInt2335 + 1;
		@Pc(27) int local27 = arg2 * this.anInt7450 + arg0;
		@Pc(30) int local30 = local6.anInt2334;
		@Pc(40) int local40 = local6.anInt2329;
		@Pc(45) int local45 = this.anInt7450 - local40;
		@Pc(55) int local55;
		if (arg2 <= 0) {
			local55 = 1 - arg2;
			local30 -= local55;
			local27 += local55 * this.anInt7450;
			arg2 = 1;
		}
		if (this.anInt7447 <= arg2 + local30) {
			local55 = local30 + arg2 + 1 - this.anInt7447;
			local30 -= local55;
		}
		if (arg0 <= 0) {
			local55 = 1 - arg0;
			local45 += local55;
			arg0 = 1;
			local40 -= local55;
			local27 += local55;
		}
		if (arg0 + local40 >= this.anInt7450) {
			local55 = local40 + arg0 + 1 - this.anInt7450;
			local40 -= local55;
			local45 += local55;
		}
		if (local40 > 0 && local30 > 0) {
			local45 += this.anInt7450 * 7;
			return Static105.method2042(local30, local27, local45, this.aByteArray87, local40);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!r;III)V")
	public void method6616(@OriginalArg(0) SecondaryNode_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) SecondaryNode_Sub9_Sub1 local6 = (SecondaryNode_Sub9_Sub1) arg0;
		arg2 += local6.anInt2335 + 1;
		arg1 += local6.anInt2337 + 1;
		@Pc(27) int local27 = arg1 * this.anInt7450 + arg2;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt2334;
		@Pc(35) int local35 = local6.anInt2329;
		@Pc(40) int local40 = this.anInt7450 - local35;
		@Pc(49) int local49;
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local32 -= local49;
			local29 = local49 * local35;
			local27 += local49 * this.anInt7450;
		}
		@Pc(70) int local70 = 0;
		if (arg1 + local32 >= this.anInt7447) {
			local49 = local32 + arg1 + 1 - this.anInt7447;
			local32 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local70 = local49;
			local40 += local49;
			local35 -= local49;
			local27 += local49;
			local29 += local49;
		}
		if (arg2 + local35 >= this.anInt7450) {
			local49 = arg2 + local35 + 1 - this.anInt7450;
			local35 -= local49;
			local40 += local49;
			local70 += local49;
		}
		if (local35 > 0 && local32 > 0) {
			Static217.method3185(this.aByteArray87, local6.aByteArray22, local27, local40, local70, local29, local35, local32);
			this.method6611(local32, arg1, arg2, local35);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public void method6618() {
		this.aClass276ArrayArray1 = new Class276[this.anInt7442][this.anInt7448];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7448; local14++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt7442; local21++) {
				this.aClass276ArrayArray1[local21][local14] = new Class276(this.aClass19_Sub1_17, this, this.aClass178_Sub1_2, local21, local14, this.anInt7439, local21 * 128 + 1, local14 * 128 - -1);
				if (this.aClass276ArrayArray1[local21][local14].anInt6949 == 0) {
					this.aClass276ArrayArray1[local21][local14] = null;
				}
			}
		}
	}
}
