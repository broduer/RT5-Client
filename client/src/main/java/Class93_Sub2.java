import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public class Class93_Sub2 extends Class93 {

	@OriginalMember(owner = "client!rq", name = "I", descriptor = "I")
	private int anInt3259 = -1;

	@OriginalMember(owner = "client!rq", name = "E", descriptor = "I")
	private int anInt3265 = -1;

	@OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
	public final int anInt3257;

	@OriginalMember(owner = "client!rq", name = "G", descriptor = "I")
	public final int anInt3264;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!qha;IIIIZ[BIZ)V")
	public Class93_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3257 = arg3;
		this.anInt3264 = arg4;
		if (arg8) {
			@Pc(26) byte[] local26 = new byte[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = arg3 * local28;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg5 && super.anInt10941 != 34037) {
			Static397.method5561(arg2, arg1, arg7, arg3, arg4, arg6);
			this.method9454(true);
		} else {
			OpenGL.glTexImage2Dub(super.anInt10941, 0, super.anInt10940, this.anInt3257, this.anInt3264, 0, arg7, 5121, arg6, 0);
			this.method9454(false);
		}
		OpenGL.glPixelStorei(3317, 4);
		this.method9445(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!qha;IIIII)V")
	public Class93_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, 6407, arg5 * arg4, false);
		this.anInt3257 = arg4;
		this.anInt3264 = arg5;
		@Pc(29) int local29 = super.aClass19_Sub3_43.anInt7979 - arg3 - arg5;
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glCopyTexImage2D(super.anInt10941, 0, super.anInt10940, arg2, local29, arg4, arg5, 0);
		this.method9445(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!qha;IIII)V")
	public Class93_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3 * arg4, false);
		this.anInt3257 = arg3;
		this.anInt3264 = arg4;
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glTexImage2Dub(super.anInt10941, 0, super.anInt10940, arg3, arg4, 0, Static391.method5512(super.anInt10940), 5121, (byte[]) null, 0);
		this.method9445(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!qha;IIIIZ[IIIZ)V")
	public Class93_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3264 = arg4;
		this.anInt3257 = arg3;
		if (arg9) {
			@Pc(26) int[] local26 = new int[arg6.length];
			for (@Pc(28) int local28 = 0; local28 < arg4; local28++) {
				@Pc(33) int local33 = local28 * arg3;
				@Pc(42) int local42 = arg3 * (arg4 - local28 - 1);
				for (@Pc(44) int local44 = 0; local44 < arg3; local44++) {
					local26[local33++] = arg6[local42++];
				}
			}
			arg6 = local26;
		}
		super.aClass19_Sub3_43.method7008(this);
		if (super.anInt10941 != 34037 && arg5 && arg7 == 0 && arg8 == 0) {
			Static480.method6473(this.anInt3257, super.anInt10941, arg6, super.anInt10940, this.anInt3264, super.aClass19_Sub3_43.anInt8053);
			this.method9454(true);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Di(super.anInt10941, 0, super.anInt10940, this.anInt3257, this.anInt3264, 0, 32993, super.aClass19_Sub3_43.anInt8053, arg6, arg8 * 4);
			OpenGL.glPixelStorei(3314, 0);
			this.method9454(false);
		}
		this.method9445(true);
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!qha;IIIIZ[FI)V")
	public Class93_Sub2(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3 * arg4, arg5);
		this.anInt3257 = arg3;
		this.anInt3264 = arg4;
		super.aClass19_Sub3_43.method7008(this);
		if (arg5 && super.anInt10941 != 34037) {
			Static612.method8245(arg7, arg4, arg3, arg1, arg6, arg2);
			this.method9454(true);
		} else {
			OpenGL.glTexImage2Df(super.anInt10941, 0, super.anInt10940, this.anInt3257, this.anInt3264, 0, arg7, 5126, arg6, 0);
			this.method9454(false);
		}
		this.method9445(true);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)V")
	@Override
	public final void method9442() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3265, this.anInt3259, super.anInt10941, 0, 0);
		this.anInt3265 = -1;
		this.anInt3259 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B[IZIIIIII)V")
	public final void method2942(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg3;
		}
		@Pc(16) int[] local16 = new int[arg2 * arg3];
		for (@Pc(18) int local18 = 0; local18 < arg2; local18++) {
			@Pc(24) int local24 = arg3 * local18;
			@Pc(36) int local36 = arg5 * (arg2 - local18 - 1);
			for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
				local16[local24++] = arg0[local36++];
			}
		}
		super.aClass19_Sub3_43.method7008(this);
		if (arg5 != arg3) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt10941, 0, arg1, this.anInt3264 - arg2 - arg4, arg3, arg2, 32993, super.aClass19_Sub3_43.anInt8053, local16, 0);
		if (arg3 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIBIII)V")
	public final void method2943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18 = super.aClass19_Sub3_43.anInt7979 - arg0 - arg3;
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glCopyTexSubImage2D(super.anInt10941, 0, arg1, this.anInt3264 - arg2 - arg0, arg4, local18, arg5, arg0);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)V")
	public final void method2944(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, super.anInt10941, super.anInt10949, 0);
		this.anInt3265 = arg0;
		this.anInt3259 = arg1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IBIII[BZIII)V")
	public final void method2945(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) boolean arg4) {
		if (arg4) {
			@Pc(18) int local18 = Static646.method8465(6406);
			@Pc(22) int local22 = arg2 * local18;
			@Pc(26) int local26 = local18 * arg2;
			@Pc(31) byte[] local31 = new byte[local22 * arg1];
			for (@Pc(33) int local33 = 0; local33 < arg1; local33++) {
				@Pc(39) int local39 = local22 * local33;
				@Pc(50) int local50 = local26 * (arg1 - local33 - 1);
				for (@Pc(52) int local52 = 0; local52 < local22; local52++) {
					local31[local39++] = arg3[local50++];
				}
			}
			arg3 = local31;
		}
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, arg2);
		}
		OpenGL.glTexSubImage2Dub(super.anInt10941, 0, 0, 0, arg2, arg1, 6406, 5121, arg3, 0);
		if (arg2 != arg2) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZIZ)V")
	public final void method2946(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (super.anInt10941 == 3553) {
			super.aClass19_Sub3_43.method7008(this);
			OpenGL.glTexParameteri(super.anInt10941, 10242, arg0 ? 10497 : 33071);
			OpenGL.glTexParameteri(super.anInt10941, 10243, arg1 ? 10497 : 33071);
		}
	}
}
