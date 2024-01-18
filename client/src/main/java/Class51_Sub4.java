import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class51_Sub4 extends Class51 implements Interface18 {

	@OriginalMember(owner = "client!va", name = "L", descriptor = "I")
	private final int anInt9865;

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	private final int anInt9869;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;IIZ[FII)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static702.aClass397_20, arg2 * arg3, arg4);
		this.anInt9865 = arg2;
		this.anInt9869 = arg3;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		if (!arg4 && arg7 == 0 && arg6 == 0) {
			this.method6156(arg5, arg2, arg3, super.anInt9848);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Df(super.anInt9848, 0, this.method6148(), arg2, arg3, 0, Static468.method5398(super.aClass92_14), 5126, arg5, arg6 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;IIZ[III)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 3553, Static172.aClass92_8, Static702.aClass397_16, arg2 * arg1, arg3);
		this.anInt9865 = arg1;
		this.anInt9869 = arg2;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		if (arg3 && arg6 == 0 && arg5 == 0) {
			this.method6153(super.anInt9848, arg4, arg2, arg1);
		} else {
			OpenGL.glPixelStorei(3314, arg6);
			OpenGL.glTexImage2Di(super.anInt9848, 0, 6408, this.anInt9865, this.anInt9869, 0, 32993, super.aClass19_Sub1_Sub2_12.anInt9277, arg4, arg5 * 4);
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;IIZ[BII)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, Static702.aClass397_16, arg2 * arg3, arg4);
		this.anInt9865 = arg2;
		this.anInt9869 = arg3;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 && arg7 == 0 && arg6 == 0) {
			this.method6155(arg3, super.anInt9848, arg5, arg2);
		} else {
			OpenGL.glPixelStorei(3314, arg7);
			OpenGL.glTexImage2Dub(super.anInt9848, 0, this.method6148(), arg2, arg3, 0, Static468.method5398(super.aClass92_14), 5121, arg5, arg6);
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;Lclient!wda;II)V")
	public Class51_Sub4(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
		this.anInt9869 = arg4;
		this.anInt9865 = arg3;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glTexImage2Dub(super.anInt9848, 0, this.method6148(), arg3, arg4, 0, Static468.method5398(super.aClass92_14), Static248.method2554(super.aClass397_11), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FB)F")
	@Override
	public float method6484(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9869;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII[IIII)V")
	@Override
	public void method6478(@OriginalArg(3) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt9869 * this.anInt9865];
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glGetTexImagei(super.anInt9848, 0, 32993, 5121, local12, 0);
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			Static734.method5449(local12, (arg2 - local34 - 1) * this.anInt9865, arg0, arg1 * local34, arg1);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(FI)F")
	@Override
	public float method6480(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt9865;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	@Override
	public int method6481() {
		return this.anInt9869;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6483() {
		return true;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
	@Override
	public int method6479() {
		return this.anInt9865;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII[BILclient!eba;II)V")
	@Override
	public void method6485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class92 arg3, @OriginalArg(8) int arg4) {
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg0);
		OpenGL.glTexSubImage2Dub(super.anInt9848, 0, 0, 0, arg4, arg1, Static468.method5398(arg3), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!eba;III[FIIII)V")
	public void method6168(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float[] arg2, @OriginalArg(8) int arg3) {
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glTexSubImage2Df(super.anInt9848, 0, 0, 0, arg3, arg1, Static468.method5398(arg0), 5121, arg2, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method6482(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexSubImage2Di(super.anInt9848, 0, arg1, arg2, arg4, arg3, 32993, super.aClass19_Sub1_Sub2_12.anInt9277, arg0, 0);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method6486(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glTexParameteri(super.anInt9848, 10242, arg0 ? 10497 : 33071);
		OpenGL.glTexParameteri(super.anInt9848, 10243, arg1 ? 10497 : 33071);
	}
}
