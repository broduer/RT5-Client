import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public abstract class Class114 {

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
	protected boolean aBoolean645 = false;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	protected Class114() {
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tt;Lclient!ima;I)V")
	public abstract void a(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class8_Sub6 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "I", descriptor = "(I[IIIIZI[I)V")
	protected abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()Z")
	public abstract boolean a();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III[I[IZZIII)V")
	private void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(18) int local18;
		if (arg7 == 1) {
			if (arg1 == 0 || arg1 == 1) {
				local18 = -arg8;
				arg8 = arg0;
				arg0 = local18;
			} else if (arg1 == 3) {
				local18 = arg8;
				arg8 = arg0;
				arg0 = local18;
			} else if (arg1 == 2) {
				local18 = arg8;
				arg8 = -arg0 & 0x3FFF;
				arg0 = local18 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg1 == 0 || arg1 == 1) {
				arg8 = -arg8;
				arg0 = -arg0;
			} else if (arg1 == 2) {
				arg0 = -arg0 & 0x3FFF;
				arg8 = -arg8 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg1 == 0 || arg1 == 1) {
				local18 = arg8;
				arg8 = -arg0;
				arg0 = local18;
			} else if (arg1 == 3) {
				local18 = arg8;
				arg8 = arg0;
				arg0 = local18;
			} else if (arg1 == 2) {
				local18 = arg8;
				arg8 = arg0 & 0x3FFF;
				arg0 = -local18 & 0x3FFF;
			}
		}
		if (arg2 == 65535) {
			this.a(arg1, arg3, arg8, arg9, arg0, arg7, arg5);
		} else {
			this.I(arg1, arg3, arg8, arg9, arg0, arg5, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "()Z")
	public abstract boolean F();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tt;)V")
	public abstract void a(@OriginalArg(0) Class73 arg0);

	@OriginalMember(owner = "client!ka", name = "LA", descriptor = "(I)V")
	public abstract void LA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "aa", descriptor = "(SS)V")
	public abstract void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "VA", descriptor = "(I)V")
	public abstract void VA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!rw;IIILclient!rw;Lclient!rw;IZILclient!rw;[ZII)V")
	public final void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub18 arg6, @OriginalArg(7) Class2_Sub2_Sub18 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class2_Sub2_Sub18 arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg14 == -1) {
			this.a(arg7, arg8, arg13, arg2, arg1, arg5, 0, -110, arg9);
			return;
		}
		this.g();
		if (!this.NA()) {
			this.d();
			return;
		}
		@Pc(44) Class253 local44 = arg7.aClass253Array1[arg1];
		@Pc(47) Class2_Sub44 local47 = local44.aClass2_Sub44_1;
		@Pc(49) Class253 local49 = null;
		if (arg2 != null) {
			local49 = arg2.aClass253Array1[arg5];
			if (local49.aClass2_Sub44_1 != local47) {
				local49 = null;
			}
		}
		this.a(local49, arg12, arg8, false, (byte) 82, (int[]) null, 0, arg13, local44, local47, 65535, arg9);
		@Pc(81) Class253 local81 = arg11.aClass253Array1[arg14];
		@Pc(83) Class253 local83 = null;
		if (arg6 != null) {
			local83 = arg6.aClass253Array1[arg3];
			if (local47 != local83.aClass2_Sub44_1) {
				local83 = null;
			}
		}
		this.a(0, new int[0], 0, 0, 0, 0, arg9);
		this.a(local83, arg12, arg0, true, (byte) 116, (int[]) null, 0, arg10, local81, local81.aClass2_Sub44_1, 65535, arg9);
		this.wa();
		this.d();
	}

	@OriginalMember(owner = "client!ka", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	public abstract Class2_Sub2_Sub9 ba(@OriginalArg(0) Class2_Sub2_Sub9 arg0);

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "()V")
	public abstract void e();

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "(I)V")
	public abstract void s(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()[Lclient!mn;")
	public abstract Class249[] c();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	public abstract void a(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "(IIII)V")
	protected abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "()[Lclient!rv;")
	public abstract Class328[] f();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!tt;ZII)Z")
	public abstract boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ka", name = "HA", descriptor = "()I")
	public abstract int HA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tt;Lclient!ima;II)V")
	public abstract void a(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class8_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!tt;ZI)Z")
	public abstract boolean a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!rw;IILclient!rw;IIIIZ)V")
	public final void a(@OriginalArg(0) Class2_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub2_Sub18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg4 == -1) {
			return;
		}
		this.g();
		if (!this.NA()) {
			this.d();
			return;
		}
		@Pc(23) Class253 local23 = arg0.aClass253Array1[arg4];
		@Pc(26) Class2_Sub44 local26 = local23.aClass2_Sub44_1;
		@Pc(28) Class253 local28 = null;
		if (arg3 != null) {
			local28 = arg3.aClass253Array1[arg5];
			if (local28.aClass2_Sub44_1 != local26) {
				local28 = null;
			}
		}
		this.a(local28, (boolean[]) null, arg1, false, (byte) 121, (int[]) null, arg6, arg2, local23, local26, 65535, arg8);
		this.wa();
		this.d();
	}

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "(III)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)V")
	public abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ka", name = "wa", descriptor = "()V")
	protected abstract void wa();

	@OriginalMember(owner = "client!ka", name = "da", descriptor = "()I")
	public abstract int da();

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()[B")
	public abstract byte[] b();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public abstract void a(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()V")
	public abstract void v();

	@OriginalMember(owner = "client!ka", name = "ua", descriptor = "()I")
	public abstract int ua();

	@OriginalMember(owner = "client!ka", name = "NA", descriptor = "()Z")
	protected abstract boolean NA();

	@OriginalMember(owner = "client!ka", name = "na", descriptor = "()I")
	public abstract int na();

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "()I")
	public abstract int G();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIILclient!s;I)V")
	protected final void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class178 arg7, @OriginalArg(8) int arg8) {
		@Pc(24) int local24 = -arg4 / 2;
		@Pc(29) int local29 = -arg6 / 2;
		@Pc(40) int local40 = arg7.a(local29 + arg5, -124, (int) (arg2 - -local24));
		@Pc(44) int local44 = arg4 / 2;
		@Pc(49) int local49 = -arg6 / 2;
		@Pc(61) int local61 = arg7.a(local49 + arg5, arg3 + 6908, arg2 + local44);
		@Pc(66) int local66 = -arg4 / 2;
		@Pc(70) int local70 = arg6 / 2;
		@Pc(82) int local82 = arg7.a(local70 + arg5, arg3 ^ 0x1B1E, local66 + arg2);
		@Pc(86) int local86 = arg4 / 2;
		@Pc(90) int local90 = arg6 / 2;
		@Pc(101) int local101 = arg7.a(local90 + arg5, -121, (int) (arg2 - -local86));
		@Pc(113) int local113 = local61 > local40 ? local40 : local61;
		@Pc(125) int local125 = local101 <= local82 ? local101 : local82;
		@Pc(133) int local133 = local61 >= local101 ? local101 : local61;
		@Pc(141) int local141 = local82 > local40 ? local40 : local82;
		@Pc(171) int local171;
		if (arg6 != 0) {
			@Pc(156) int local156 = (int) (Math.atan2((double) (local113 - local125), (double) arg6) * 2607.5945876176133D) & 0x3FFF;
			if (local156 != 0) {
				if (arg1 != 0) {
					if (local156 > 8192) {
						local171 = 16384 - arg1;
						if (local156 < local171) {
							local156 = local171;
						}
					} else if (arg1 < local156) {
						local156 = arg1;
					}
				}
				this.FA(local156);
			}
		}
		@Pc(192) int local192 = local40 + local101;
		if (arg4 != 0) {
			@Pc(207) int local207 = (int) (Math.atan2((double) (local141 - local133), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local207 != 0) {
				if (arg8 != 0) {
					if (local207 > 8192) {
						local171 = 16384 - arg8;
						if (local171 > local207) {
							local207 = local171;
						}
					} else if (local207 > arg8) {
						local207 = arg8;
					}
				}
				this.VA(local207);
			}
		}
		if (local192 > local61 + local82) {
			local192 = local82 + local61;
		}
		local192 = (local192 >> 1) - arg0;
		if (local192 != 0) {
			this.H(0, local192, 0);
		}
	}

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "()V")
	protected abstract void g();

	@OriginalMember(owner = "client!ka", name = "ia", descriptor = "(SS)V")
	public abstract void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!ka", name = "EA", descriptor = "()I")
	public abstract int EA();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!tt;IZ)V")
	public abstract void a(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IILclient!rw;)V")
	public final void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub2_Sub18 arg2) {
		if (arg0 == -1) {
			return;
		}
		this.g();
		if (!this.NA()) {
			this.d();
			return;
		}
		@Pc(33) Class253 local33 = arg2.aClass253Array1[arg0];
		@Pc(36) Class2_Sub44 local36 = local33.aClass2_Sub44_1;
		for (@Pc(38) int local38 = 0; local38 < local33.anInt6359; local38++) {
			@Pc(45) short local45 = local33.aShortArray87[local38];
			if (local36.aBooleanArray25[local45]) {
				if (local33.aShortArray86[local38] != -1) {
					this.P(0, 0, 0, 0);
				}
				this.P(local36.anIntArray619[local45], local33.aShortArray93[local38], local33.aShortArray94[local38], local33.aShortArray89[local38]);
			}
		}
		this.wa();
		this.d();
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "()V")
	protected abstract void d();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZ)Lclient!ka;")
	public abstract Class114 a(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "(I)V")
	public abstract void C(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "FA", descriptor = "(I)V")
	public abstract void FA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "()Z")
	public abstract boolean r();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!rw;Lclient!rw;II[IBIZII)V")
	public final void a(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub18 arg1, @OriginalArg(2) Class2_Sub2_Sub18 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg3 == -1) {
			return;
		}
		this.g();
		if (!this.NA()) {
			this.d();
			return;
		}
		@Pc(29) Class253 local29 = arg1.aClass253Array1[arg3];
		@Pc(32) Class2_Sub44 local32 = local29.aClass2_Sub44_1;
		@Pc(34) Class253 local34 = null;
		if (arg2 != null) {
			local34 = arg2.aClass253Array1[arg9];
			if (local34.aClass2_Sub44_1 != local32) {
				local34 = null;
			}
		}
		this.a(local34, (boolean[]) null, arg0, false, (byte) 84, arg5, arg4, arg7, local29, local32, arg10, arg8);
		this.wa();
		this.d();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!nb;[ZIZB[IIILclient!nb;Lclient!qda;IZ)V")
	private void a(@OriginalArg(0) Class253 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class253 arg8, @OriginalArg(9) Class2_Sub44 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		@Pc(11) int local11;
		if (arg0 == null || arg2 == 0) {
			for (local11 = 0; local11 < arg8.anInt6359; local11++) {
				@Pc(17) short local17 = arg8.aShortArray87[local11];
				if (arg1 == null || arg3 == arg1[local17] || arg9.anIntArray619[local17] == 0) {
					@Pc(43) short local43 = arg8.aShortArray86[local11];
					if (local43 != -1) {
						this.a(0, 0, arg10 & arg9.anIntArray618[local43], arg9.anIntArrayArray196[local43], arg5, arg11, false, arg6, 0, 0);
					}
					this.a(arg8.aShortArray89[local11], arg9.anIntArray619[local17], arg10 & arg9.anIntArray618[local17], arg9.anIntArrayArray196[local17], arg5, arg11, false, arg6, arg8.aShortArray93[local11], arg8.aShortArray94[local11]);
				}
			}
			return;
		}
		local11 = 0;
		@Pc(116) int local116 = 0;
		for (@Pc(123) int local123 = 0; local123 < arg9.anInt7690; local123++) {
			@Pc(126) boolean local126 = false;
			if (arg8.anInt6359 > local11 && local123 == arg8.aShortArray87[local11]) {
				local126 = true;
			}
			@Pc(146) boolean local146 = false;
			if (arg0.anInt6359 > local116 && local123 == arg0.aShortArray87[local116]) {
				local146 = true;
			}
			if (local126 || local146) {
				if (arg1 == null || arg1[local123] == arg3 || arg9.anIntArray619[local123] == 0) {
					@Pc(206) short local206 = 0;
					@Pc(211) int local211 = arg9.anIntArray619[local123];
					if (local211 == 3 || local211 == 10) {
						local206 = 128;
					}
					@Pc(243) short local243;
					@Pc(238) short local238;
					@Pc(228) short local228;
					@Pc(233) short local233;
					@Pc(248) byte local248;
					if (local126) {
						local228 = arg8.aShortArray89[local11];
						local233 = arg8.aShortArray86[local11];
						local238 = arg8.aShortArray94[local11];
						local243 = arg8.aShortArray93[local11];
						local248 = arg8.aByteArray70[local11];
						local11++;
					} else {
						local248 = 0;
						local228 = local206;
						local243 = local206;
						local233 = -1;
						local238 = local206;
					}
					@Pc(267) short local267;
					@Pc(282) short local282;
					@Pc(272) short local272;
					@Pc(287) short local287;
					@Pc(277) byte local277;
					if (local146) {
						local267 = arg0.aShortArray93[local116];
						local272 = arg0.aShortArray89[local116];
						local277 = arg0.aByteArray70[local116];
						local282 = arg0.aShortArray94[local116];
						local287 = arg0.aShortArray86[local116];
						local116++;
					} else {
						local282 = local206;
						local272 = local206;
						local277 = 0;
						local287 = -1;
						local267 = local206;
					}
					if (local233 != -1) {
						this.a(0, 0, arg10 & arg9.anIntArray618[local233], arg9.anIntArrayArray196[local233], arg5, arg11, false, arg6, 0, 0);
					} else if (local287 != -1) {
						this.a(0, 0, arg10 & arg9.anIntArray618[local287], arg9.anIntArrayArray196[local287], arg5, arg11, false, arg6, 0, 0);
					}
					@Pc(423) int local423;
					@Pc(413) int local413;
					@Pc(439) int local439;
					if ((local248 & 0x2) == 0 && (local277 & 0x1) == 0) {
						@Pc(376) int local376;
						if (local211 == 2) {
							local376 = local267 - local243 & 0x3FFF;
							@Pc(383) int local383 = local282 - local238 & 0x3FFF;
							@Pc(389) int local389 = local272 - local228 & 0x3FFF;
							if (local376 >= 8192) {
								local376 -= 16384;
							}
							if (local383 >= 8192) {
								local383 -= 16384;
							}
							local413 = local238 + arg2 * local383 / arg7 & 0x3FFF;
							local423 = local376 * arg2 / arg7 + local243 & 0x3FFF;
							if (local389 >= 8192) {
								local389 -= 16384;
							}
							local439 = arg2 * local389 / arg7 + local228 & 0x3FFF;
						} else if (local211 == 9) {
							local376 = local267 - local243 & 0x3FFF;
							if (local376 >= 8192) {
								local376 -= 16384;
							}
							local439 = 0;
							local413 = 0;
							local423 = local243 + arg2 * local376 / arg7 & 0x3FFF;
						} else if (local211 == 7) {
							local376 = local267 - local243 & 0x3F;
							if (local376 >= 32) {
								local376 -= 64;
							}
							local439 = (local272 - local228) * arg2 / arg7 + local228;
							local413 = (local282 - local238) * arg2 / arg7 + local238;
							local423 = local243 + arg2 * local376 / arg7 & 0x3F;
						} else {
							local439 = local228 + (local272 - local228) * arg2 / arg7;
							local413 = (local282 - local238) * arg2 / arg7 + local238;
							local423 = arg2 * (local267 - local243) / arg7 + local243;
						}
					} else {
						local413 = local238;
						local423 = local243;
						local439 = local228;
					}
					this.a(local439, local211, arg9.anIntArray618[local123] & arg10, arg9.anIntArrayArray196[local123], arg5, arg11, false, arg6, local423, local413);
				} else {
					if (local146) {
						local116++;
					}
					if (local126) {
						local11++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void a(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!ka", name = "RA", descriptor = "()I")
	public abstract int RA();

	@OriginalMember(owner = "client!ka", name = "fa", descriptor = "()I")
	public abstract int fa();

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	public abstract void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ka", name = "WA", descriptor = "()I")
	public abstract int WA();

	@OriginalMember(owner = "client!ka", name = "ma", descriptor = "()I")
	public abstract int ma();

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "(III)V")
	public abstract void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "()I")
	public abstract int V();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[IIIIIZ)V")
	protected abstract void a(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);
}
