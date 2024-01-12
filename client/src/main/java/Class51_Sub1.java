import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class51_Sub1 extends Class51 implements Interface2 {

	@OriginalMember(owner = "client!br", name = "y", descriptor = "I")
	private final int anInt1132;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	private final int anInt1134;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	private final int anInt1133;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!tca;Lclient!eba;III[B)V")
	public Class51_Sub1(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5) {
		super(arg0, 32879, arg1, Static702.aClass399_16, arg2 * arg3 * arg4, false);
		this.anInt1132 = arg4;
		this.anInt1134 = arg2;
		this.anInt1133 = arg3;
		super.aClass19_Sub1_Sub2_12.method8095(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9874, 0, this.method8638(), this.anInt1134, this.anInt1133, this.anInt1132, 0, Static468.method7651(super.aClass92_14), 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
	}
}
