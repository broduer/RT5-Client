import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class170 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "[[Lclient!uga;")
	private Class375[][] aClass375ArrayArray1;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_18;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "Lclient!pn;")
	private final Class178_Sub2 aClass178_Sub2_1;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public final int anInt4033;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	private final int anInt4037;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	private final int anInt4036;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[B")
	public final byte[] aByteArray41;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
	private final int anInt4031;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	private final int anInt4034;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!qha;Lclient!pn;)V")
	public Class170(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class178_Sub2 arg1) {
		this.aClass19_Sub3_18 = arg0;
		this.aClass178_Sub2_1 = arg1;
		this.anInt4033 = (this.aClass178_Sub2_1.anInt8918 * this.aClass178_Sub2_1.anInt8912 >> this.aClass19_Sub3_18.anInt8012) + 2;
		this.anInt4037 = (this.aClass178_Sub2_1.anInt8916 * this.aClass178_Sub2_1.anInt8912 >> this.aClass19_Sub3_18.anInt8012) + 2;
		this.anInt4036 = this.aClass19_Sub3_18.anInt8012 + 7 - this.aClass178_Sub2_1.anInt8919;
		this.aByteArray41 = new byte[this.anInt4037 * this.anInt4033];
		this.anInt4031 = this.aClass178_Sub2_1.anInt8918 >> this.anInt4036;
		this.anInt4034 = this.aClass178_Sub2_1.anInt8916 >> this.anInt4036;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public void method3540() {
		this.aClass375ArrayArray1 = new Class375[this.anInt4031][this.anInt4034];
		for (@Pc(18) int local18 = 0; local18 < this.anInt4034; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt4031; local22++) {
				this.aClass375ArrayArray1[local22][local18] = new Class375(this.aClass19_Sub3_18, this, this.aClass178_Sub2_1, local22, local18, this.anInt4036, local22 * 128 + 1, local18 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIILclient!r;)V")
	public void method3541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub2_Sub9 arg2) {
		@Pc(6) Class2_Sub2_Sub9_Sub2 local6 = (Class2_Sub2_Sub9_Sub2) arg2;
		arg0 += local6.anInt7371 + 1;
		arg1 += local6.anInt7374 + 1;
		@Pc(27) int local27 = arg1 * this.anInt4033 + arg0;
		@Pc(29) int local29 = 0;
		@Pc(32) int local32 = local6.anInt7365;
		@Pc(35) int local35 = local6.anInt7366;
		@Pc(48) int local48 = this.anInt4033 - local35;
		@Pc(58) int local58;
		if (arg1 <= 0) {
			local58 = 1 - arg1;
			arg1 = 1;
			local27 += local58 * this.anInt4033;
			local32 -= local58;
			local29 = local58 * local35;
		}
		@Pc(79) int local79 = 0;
		if (arg1 + local32 >= this.anInt4037) {
			local58 = arg1 + local32 + 1 - this.anInt4037;
			local32 -= local58;
		}
		if (arg0 <= 0) {
			local58 = 1 - arg0;
			local48 += local58;
			local35 -= local58;
			local79 = local58;
			arg0 = 1;
			local27 += local58;
			local29 += local58;
		}
		if (arg0 + local35 >= this.anInt4033) {
			local58 = local35 + arg0 + 1 - this.anInt4033;
			local48 += local58;
			local79 += local58;
			local35 -= local58;
		}
		if (local35 > 0 && local32 > 0) {
			Static607.method8174(this.aByteArray41, local79, local27, local35, local32, local48, local6.aByteArray85, local29);
			this.method3545(arg1, local32, local35, arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZZI[[ZI)V")
	public void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3, @OriginalArg(5) int arg4) {
		this.aClass19_Sub3_18.method7015(false);
		this.aClass19_Sub3_18.method6979(false);
		this.aClass19_Sub3_18.method7053(-2);
		this.aClass19_Sub3_18.method6998(1);
		this.aClass19_Sub3_18.method7024(1);
		@Pc(50) float local50 = 1.0F / (float) (this.aClass19_Sub3_18.anInt8011 * 128);
		@Pc(54) int local54;
		@Pc(61) int local61;
		@Pc(68) int local68;
		@Pc(70) int local70;
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(86) int local86;
		if (arg1) {
			for (local54 = 0; local54 < this.anInt4034; local54++) {
				local61 = local54 << this.anInt4036;
				local68 = local54 + 1 << this.anInt4036;
				label128: for (local70 = 0; local70 < this.anInt4031; local70++) {
					local77 = local70 << this.anInt4036;
					local84 = local70 + 1 << this.anInt4036;
					for (local86 = local77; local86 < local84; local86++) {
						if (-arg4 <= local86 - arg0 && local86 - arg0 <= arg4) {
							for (@Pc(107) int local107 = local61; local107 < local68; local107++) {
								if (-arg4 <= local107 - arg2 && arg4 >= local107 - arg2 && arg3[arg4 + local86 - arg0][arg4 + local107 - arg2]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local50, local50, 1.0F);
									OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass375ArrayArray1[local70][local54].method8463();
									continue label128;
								}
							}
						}
					}
				}
			}
		} else {
			for (local54 = 0; local54 < this.anInt4034; local54++) {
				local61 = local54 << this.anInt4036;
				local68 = local54 + 1 << this.anInt4036;
				for (local70 = 0; local70 < this.anInt4031; local70++) {
					local77 = 0;
					local84 = local70 << this.anInt4036;
					local86 = local70 + 1 << this.anInt4036;
					@Pc(262) Class2_Sub21_Sub1 local262 = this.aClass19_Sub3_18.aClass2_Sub21_Sub1_3;
					local262.anInt8412 = 0;
					for (@Pc(267) int local267 = local61; local267 < local68; local267++) {
						if (-arg4 <= local267 - arg2 && local267 - arg2 <= arg4) {
							@Pc(298) int local298 = local84 + local267 * this.aClass178_Sub2_1.anInt8918;
							for (@Pc(300) int local300 = local84; local300 < local86; local300++) {
								if (local300 - arg0 >= -arg4 && local300 - arg0 <= arg4 && arg3[arg4 + local300 - arg0][local267 + arg4 - arg2]) {
									@Pc(350) short[] local350 = this.aClass178_Sub2_1.aShortArrayArray6[local298];
									if (local350 != null) {
										@Pc(360) int local360;
										if (this.aClass19_Sub3_18.aBoolean619) {
											for (local360 = 0; local360 < local350.length; local360++) {
												local77++;
												local262.method7380(local350[local360] & 0xFFFF);
											}
										} else {
											for (local360 = 0; local360 < local350.length; local360++) {
												local262.method7361(local350[local360] & 0xFFFF);
												local77++;
											}
										}
									}
								}
								local298++;
							}
						}
					}
					if (local77 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local50, local50, 1.0F);
						OpenGL.glTranslatef((float) -local70 / local50, (float) -local54 / local50, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass375ArrayArray1[local70][local54].method8466(local262.aByteArray93, local77);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!r;I)Z")
	public boolean method3543(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub2_Sub9_Sub2 local6 = (Class2_Sub2_Sub9_Sub2) arg1;
		arg2 += local6.anInt7374 + 1;
		arg0 += local6.anInt7371 + 1;
		@Pc(27) int local27 = arg2 * this.anInt4033 + arg0;
		@Pc(30) int local30 = local6.anInt7365;
		@Pc(33) int local33 = local6.anInt7366;
		@Pc(39) int local39 = this.anInt4033 - local33;
		@Pc(48) int local48;
		if (arg2 <= 0) {
			local48 = 1 - arg2;
			arg2 = 1;
			local30 -= local48;
			local27 += this.anInt4033 * local48;
		}
		if (local30 + arg2 >= this.anInt4037) {
			local48 = local30 + arg2 + 1 - this.anInt4037;
			local30 -= local48;
		}
		if (arg0 <= 0) {
			local48 = 1 - arg0;
			arg0 = 1;
			local33 -= local48;
			local39 += local48;
			local27 += local48;
		}
		if (this.anInt4033 <= arg0 + local33) {
			local48 = arg0 + local33 + 1 - this.anInt4033;
			local33 -= local48;
			local39 += local48;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt4033 * 7;
			return Static417.method5730(local27, this.aByteArray41, local33, local30, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!r;IB)V")
	public void method3544(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub9 arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class2_Sub2_Sub9_Sub2 local6 = (Class2_Sub2_Sub9_Sub2) arg1;
		arg0 += local6.anInt7374 + 1;
		arg2 += local6.anInt7371 + 1;
		@Pc(27) int local27 = this.anInt4033 * arg0 + arg2;
		@Pc(36) int local36 = 0;
		@Pc(39) int local39 = local6.anInt7365;
		@Pc(42) int local42 = local6.anInt7366;
		@Pc(48) int local48 = this.anInt4033 - local42;
		@Pc(50) int local50 = 0;
		@Pc(60) int local60;
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			local39 -= local60;
			arg0 = 1;
			local36 = local42 * local60;
			local27 += local60 * this.anInt4033;
		}
		if (this.anInt4037 <= arg0 + local39) {
			local60 = local39 + arg0 + 1 - this.anInt4037;
			local39 -= local60;
		}
		if (arg2 <= 0) {
			local60 = 1 - arg2;
			local42 -= local60;
			local36 += local60;
			local48 += local60;
			local27 += local60;
			arg2 = 1;
			local50 = local60;
		}
		if (arg2 + local42 >= this.anInt4033) {
			local60 = local42 + arg2 + 1 - this.anInt4033;
			local48 += local60;
			local50 += local60;
			local42 -= local60;
		}
		if (local42 > 0 && local39 > 0) {
			Static672.method8772(local50, local48, local27, this.aByteArray41, local36, local6.aByteArray85, local39, local42);
			this.method3545(arg0, local39, local42, arg2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
	private void method3545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass375ArrayArray1 == null) {
			return;
		}
		@Pc(16) int local16 = arg3 - 1 >> 7;
		@Pc(26) int local26 = arg3 + arg2 - 1 - 1 >> 7;
		@Pc(32) int local32 = arg0 - 1 >> 7;
		@Pc(42) int local42 = arg0 + arg1 - 1 - 1 >> 7;
		for (@Pc(44) int local44 = local16; local44 <= local26; local44++) {
			@Pc(51) Class375[] local51 = this.aClass375ArrayArray1[local44];
			for (@Pc(53) int local53 = local32; local53 <= local42; local53++) {
				local51[local53].aBoolean739 = true;
			}
		}
	}
}
