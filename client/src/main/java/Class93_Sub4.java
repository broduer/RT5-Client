import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class93_Sub4 extends Class93 {

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
	private final int anInt10926;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!qha;II[BI)V")
	public Class93_Sub4(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt10926 = arg2;
		super.aClass19_Sub3_43.method4876(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage1Dub(super.anInt10912, 0, super.anInt10911, this.anInt10926, 0, arg4, 5121, arg3, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6817(true);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
	public void method6827() {
		super.aClass19_Sub3_43.method4876(this);
		OpenGL.glTexParameteri(super.anInt10912, 10242, 33071);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	@Override
	public void method6814() {
	}
}
