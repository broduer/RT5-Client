import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class51_Sub3 extends Class51 implements Interface18 {

	@OriginalMember(owner = "client!of", name = "I", descriptor = "I")
	private final int anInt6895;

	@OriginalMember(owner = "client!of", name = "E", descriptor = "I")
	private final int anInt6893;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;II[FII)V")
	public Class51_Sub3(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static702.aClass397_20, arg3 * arg2, false);
		this.anInt6895 = arg3;
		this.anInt6893 = arg2;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Df(super.anInt9848, 0, this.method6148(), arg2, arg3, 0, Static468.method5398(super.aClass92_14), 5126, arg4, arg5 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!tca;II[III)V")
	public Class51_Sub3(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34037, Static172.aClass92_8, Static702.aClass397_16, arg2 * arg1, false);
		this.anInt6893 = arg1;
		this.anInt6895 = arg2;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3314, arg5);
		OpenGL.glTexImage2Di(super.anInt9848, 0, 6408, this.anInt6893, this.anInt6895, 0, 32993, super.aClass19_Sub1_Sub2_12.anInt9277, arg3, arg4 * 4);
		OpenGL.glPixelStorei(3314, 0);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;Lclient!wda;II)V")
	public Class51_Sub3(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) Class397 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
		this.anInt6893 = arg3;
		this.anInt6895 = arg4;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glTexImage2Dub(super.anInt9848, 0, this.method6148(), arg3, arg4, 0, Static468.method5398(super.aClass92_14), Static248.method2554(super.aClass397_11), (byte[]) null, 0);
	}

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;II[BII)V")
	public Class51_Sub3(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, 34037, arg1, Static702.aClass397_16, arg2 * arg3, false);
		this.anInt6893 = arg2;
		this.anInt6895 = arg3;
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glPixelStorei(3314, arg6);
		OpenGL.glTexImage2Dub(super.anInt9848, 0, this.method6148(), arg2, arg3, 0, Static468.method5398(super.aClass92_14), 5121, arg4, arg5);
		OpenGL.glPixelStorei(3314, 0);
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BII[IIII)V")
	@Override
	public void method6478(@OriginalArg(3) int[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		@Pc(12) int[] local12 = new int[this.anInt6893 * this.anInt6895];
		super.aClass19_Sub1_Sub2_12.method5697(this);
		OpenGL.glGetTexImagei(super.anInt9848, 0, 32993, 5121, local12, 0);
		for (@Pc(32) int local32 = 0; local32 < arg2; local32++) {
			Static734.method5449(local12, (arg2 - local32 - 1) * this.anInt6893, arg0, arg1 * local32, arg1);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6483() {
		return false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FI)F")
	@Override
	public float method6480(@OriginalArg(0) float arg0) {
		return arg0;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)I")
	@Override
	public int method6481() {
		return this.anInt6895;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([IIIIIIII)V")
	@Override
	public void method6482(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg5 == 0) {
			arg5 = arg4;
		}
		super.aClass19_Sub1_Sub2_12.method5697(this);
		if (arg4 != arg5) {
			OpenGL.glPixelStorei(3314, arg5);
		}
		OpenGL.glTexSubImage2Di(super.anInt9848, 0, arg1, arg2, arg4, arg3, 32993, super.aClass19_Sub1_Sub2_12.anInt9277, arg0, 0);
		if (arg4 != arg5) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ZZZ)V")
	@Override
	public void method6486(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)I")
	@Override
	public int method6479() {
		return this.anInt6893;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII[BILclient!eba;II)V")
	@Override
	public void method6485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class92 arg3, @OriginalArg(8) int arg4) {
		super.aClass19_Sub1_Sub2_12.method5697(this);
		if (arg0 == 0) {
			arg0 = arg4;
		}
		OpenGL.glPixelStorei(3317, 1);
		if (arg4 != arg0) {
			OpenGL.glPixelStorei(3314, arg0);
		}
		OpenGL.glTexSubImage2Dub(super.anInt9848, 0, 0, 0, arg4, arg1, Static468.method5398(arg3), 5121, arg2, 0);
		if (arg0 != arg4) {
			OpenGL.glPixelStorei(3314, 0);
		}
		OpenGL.glPixelStorei(3317, 4);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(FB)F")
	@Override
	public float method6484(@OriginalArg(0) float arg0) {
		return arg0;
	}
}
