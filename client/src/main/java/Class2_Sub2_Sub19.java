import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 implements Interface3 {

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "[I")
	public static final int[] anIntArray768 = new int[4096];

	@OriginalMember(owner = "client!ut", name = "K", descriptor = "I")
	private int anInt9848 = -1;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
	private int anInt9847 = -1;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "I")
	private final int anInt9852;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_38;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
	public final int anInt9844;

	@OriginalMember(owner = "client!ut", name = "I", descriptor = "I")
	public final int anInt9854;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "I")
	private int anInt9845;

	@OriginalMember(owner = "client!ut", name = "J", descriptor = "I")
	private final int anInt9841;

	static {
		for (@Pc(123) int local123 = 0; local123 < 4096; local123++) {
			anIntArray768[local123] = Static61.method1310(local123);
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qha;III)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9852 = arg1;
		this.aClass19_Sub3_38 = arg0;
		this.anInt9844 = arg2;
		this.anInt9854 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static708.anIntArray862, 0);
		this.anInt9845 = Static708.anIntArray862[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt9845);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt9852, this.anInt9844, this.anInt9854);
		this.anInt9841 = this.anInt9844 * this.anInt9854 * this.aClass19_Sub3_38.method7035(this.anInt9852);
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!qha;IIII)V")
	public Class2_Sub2_Sub19(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass19_Sub3_38 = arg0;
		this.anInt9852 = arg1;
		this.anInt9844 = arg2;
		this.anInt9854 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static708.anIntArray862, 0);
		this.anInt9845 = Static708.anIntArray862[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt9845);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt9852, this.anInt9844, this.anInt9854);
		this.anInt9841 = this.anInt9854 * this.anInt9844 * this.aClass19_Sub3_38.method7035(this.anInt9852);
	}

	@OriginalMember(owner = "client!ut", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method8616();
		super.finalize();
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(III)V")
	public void method8614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt9845);
		this.anInt9848 = arg0;
		this.anInt9847 = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	@Override
	public void method9442() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt9847, this.anInt9848, 36161, 0);
		this.anInt9848 = -1;
		this.anInt9847 = -1;
	}

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)V")
	public void method8616() {
		if (this.anInt9845 > 0) {
			this.aClass19_Sub3_38.method6990(this.anInt9845, this.anInt9841);
			this.anInt9845 = 0;
		}
	}
}
