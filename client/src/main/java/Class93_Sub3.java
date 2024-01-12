import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public final class Class93_Sub3 extends Class93 {

	@OriginalMember(owner = "client!vv", name = "C", descriptor = "I")
	private int anInt10432 = -1;

	@OriginalMember(owner = "client!vv", name = "H", descriptor = "I")
	private int anInt10437 = -1;

	@OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
	public final int anInt10429;

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "I")
	public final int anInt10431;

	@OriginalMember(owner = "client!vv", name = "B", descriptor = "I")
	public final int anInt10438;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!qha;IIII)V")
	public Class93_Sub3(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt10429 = arg3;
		this.anInt10431 = arg4;
		this.anInt10438 = arg2;
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glTexImage3Dub(super.anInt10941, 0, super.anInt10940, this.anInt10438, this.anInt10429, this.anInt10431, 0, Static391.method5512(super.anInt10940), 5121, (byte[]) null, 0);
		this.method9445(true);
	}

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Lclient!qha;IIII[BI)V")
	public Class93_Sub3(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt10429 = arg3;
		this.anInt10431 = arg4;
		this.anInt10438 = arg2;
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10941, 0, super.anInt10940, this.anInt10438, this.anInt10429, this.anInt10431, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9445(true);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIIIIBI)V")
	public void method9039(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		super.aClass19_Sub3_43.method7008(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10941, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
	@Override
	public void method9442() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt10432, this.anInt10437, super.anInt10941, 0, 0, 0);
		this.anInt10432 = -1;
		this.anInt10437 = -1;
	}
}
