import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public abstract class Class93 implements Interface3 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Z")
	private boolean aBoolean827 = false;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
	private boolean aBoolean826;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public final int anInt10941;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	private final int anInt10937;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!qha;")
	protected final Class19_Sub3 aClass19_Sub3_43;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	protected final int anInt10940;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	protected int anInt10949;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!qha;IIIZ)V")
	protected Class93(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean826 = arg4;
		this.anInt10941 = arg1;
		this.anInt10937 = arg3;
		this.aClass19_Sub3_43 = arg0;
		this.anInt10940 = arg2;
		OpenGL.glGenTextures(1, Static171.anIntArray250, 0);
		this.anInt10949 = Static171.anIntArray250[0];
		this.method9444(0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	private void method9444(@OriginalArg(1) int arg0) {
		this.aClass19_Sub3_43.anInt8017 -= arg0;
		this.aClass19_Sub3_43.anInt8017 += this.method9451();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
	public final void method9445(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean827 != arg0) {
			this.aBoolean827 = arg0;
			this.method9446();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	private void method9446() {
		this.aClass19_Sub3_43.method7008(this);
		if (this.aBoolean827) {
			OpenGL.glTexParameteri(this.anInt10941, 10241, this.aBoolean826 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10941, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10941, 10241, this.aBoolean826 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10941, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	public final int method9447() {
		return this.anInt10949;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public final void method9449() {
		if (this.anInt10949 > 0) {
			this.aClass19_Sub3_43.method7037(this.anInt10949, this.method9451());
			this.anInt10949 = 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	private int method9451() {
		@Pc(21) int local21 = this.aClass19_Sub3_43.method7035(this.anInt10940) * this.anInt10937;
		return this.aBoolean826 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method9449();
		super.finalize();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
	public final boolean method9453() {
		if (!this.aClass19_Sub3_43.aBoolean613) {
			return false;
		}
		@Pc(18) int local18 = this.method9451();
		this.aClass19_Sub3_43.method7008(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10941);
		this.aBoolean826 = true;
		this.method9446();
		this.method9444(local18);
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	protected final void method9454(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean826) {
			@Pc(7) int local7 = this.method9451();
			this.aBoolean826 = true;
			this.method9446();
			this.method9444(local7);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public abstract void method9442();
}
