import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	private int anInt2459 = -1;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private int anInt2463 = -1;

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
	public final int anInt2465;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qha;IIZ[[BI)V")
	public Class93_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2465 = arg2;
		super.aClass19_Sub3_43.method7008(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt10940, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method9445(true);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qha;II)V")
	public Class93_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt2465 = arg2;
		super.aClass19_Sub3_43.method7008(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt10940, arg2, arg2, 0, Static391.method5512(super.anInt10940), 5121, null, 0);
		}
		this.method9445(true);
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!qha;IIZ[[I)V")
	public Class93_Sub1(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2465 = arg2;
		super.aClass19_Sub3_43.method7008(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static480.method6473(arg2, local30 + 34069, arg4[local30], super.anInt10940, arg2, super.aClass19_Sub3_43.anInt8053);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt10940, arg2, arg2, 0, 32993, super.aClass19_Sub3_43.anInt8053, arg4[local30], 0);
			}
		}
		this.method9445(true);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBIII)V")
	public void method2311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt10949, 0);
		this.anInt2463 = arg1;
		this.anInt2459 = arg2;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	public void method9442() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2459, this.anInt2463, 3553, 0, 0);
		this.anInt2463 = -1;
		this.anInt2459 = -1;
	}
}
