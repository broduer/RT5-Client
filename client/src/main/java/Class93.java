import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public abstract class Class93 implements Interface3 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "Z")
	private boolean aBoolean826 = false;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Z")
	private boolean aBoolean825;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	public final int anInt10912;

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
	private final int anInt10908;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "Lclient!qha;")
	protected final Class19_Sub3 aClass19_Sub3_43;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	protected final int anInt10911;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	protected int anInt10920;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!qha;IIIZ)V")
	protected Class93(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean825 = arg4;
		this.anInt10912 = arg1;
		this.anInt10908 = arg3;
		this.aClass19_Sub3_43 = arg0;
		this.anInt10911 = arg2;
		OpenGL.glGenTextures(1, Static171.anIntArray250, 0);
		this.anInt10920 = Static171.anIntArray250[0];
		this.method6816(0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)V")
	private void method6816(@OriginalArg(1) int arg0) {
		this.aClass19_Sub3_43.anInt7994 -= arg0;
		this.aClass19_Sub3_43.anInt7994 += this.method6823();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
	public final void method6817(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean826 != arg0) {
			this.aBoolean826 = arg0;
			this.method6818();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)V")
	private void method6818() {
		this.aClass19_Sub3_43.method4876(this);
		if (this.aBoolean826) {
			OpenGL.glTexParameteri(this.anInt10912, 10241, this.aBoolean825 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10912, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10912, 10241, this.aBoolean825 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10912, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
	public final int method6819() {
		return this.anInt10920;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public final void method6821() {
		if (this.anInt10920 > 0) {
			this.aClass19_Sub3_43.method4905(this.anInt10920, this.method6823());
			this.anInt10920 = 0;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	private int method6823() {
		@Pc(21) int local21 = this.aClass19_Sub3_43.method4903(this.anInt10911) * this.anInt10908;
		return this.aBoolean825 ? local21 * 4 / 3 : local21;
	}

	@OriginalMember(owner = "client!kd", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method6821();
		super.finalize();
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)Z")
	public final boolean method6825() {
		if (!this.aClass19_Sub3_43.aBoolean613) {
			return false;
		}
		@Pc(18) int local18 = this.method6823();
		this.aClass19_Sub3_43.method4876(this);
		OpenGL.glGenerateMipmapEXT(this.anInt10912);
		this.aBoolean825 = true;
		this.method6818();
		this.method6816(local18);
		return true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BZ)V")
	protected final void method6826(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean825) {
			@Pc(7) int local7 = this.method6823();
			this.aBoolean825 = true;
			this.method6818();
			this.method6816(local7);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public abstract void method6814();
}
