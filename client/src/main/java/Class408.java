import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class408 implements Interface14 {

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	private int anInt10858;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
	private int anInt10871;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	private int anInt10873;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
	private int anInt10854 = -1;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
	private int anInt10859 = 0;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[Lclient!bi;")
	private final Interface3[] anInterface3Array1 = new Interface3[9];

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_41;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	private final int anInt10861;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class408(@OriginalArg(0) Class19_Sub3 arg0) {
		if (!arg0.aBoolean613) {
			throw new IllegalStateException("");
		}
		this.aClass19_Sub3_41 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static604.anIntArray708, 0);
		this.anInt10861 = Static604.anIntArray708[0];
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	public void method9370(@OriginalArg(0) int arg0) {
		if (this.anInterface3Array1[arg0] != null) {
			this.anInterface3Array1[arg0].method9442();
		}
		this.anInt10873 &= ~(0x1 << arg0);
		this.anInterface3Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	@Override
	public void method9369() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt10861);
		this.anInt10859 |= 0x2;
		this.anInt10854 = this.method9372();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ec;IIZ)V")
	private void method9371(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (this.anInt10854 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt10873 & 0xFFFFFFFE) == 0) {
			this.anInt10858 = arg1.anInt2465;
			this.anInt10871 = arg1.anInt2465;
		} else if (this.anInt10871 != arg1.anInt2465 || this.anInt10858 != arg1.anInt2465) {
			throw new RuntimeException();
		}
		arg1.method2311(arg0, Static14.anIntArray25[0], this.anInt10854);
		this.anInterface3Array1[0] = arg1;
		this.anInt10873 |= 0x1;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	@Override
	public void method9365() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt10859 &= 0xFFFFFFFB;
		this.anInt10854 = this.method9372();
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
	private int method9372() {
		if ((this.anInt10859 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt10859 & 0x2) == 0) {
			return (this.anInt10859 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ut;II)V")
	public void method9373(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10854 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg1;
		if ((this.anInt10873 & ~local17) == 0) {
			this.anInt10858 = arg0.anInt9854;
			this.anInt10871 = arg0.anInt9844;
		} else if (this.anInt10871 != arg0.anInt9844 || arg0.anInt9854 != this.anInt10858) {
			throw new RuntimeException();
		}
		arg0.method8614(Static14.anIntArray25[arg1], this.anInt10854);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt10873 |= local17;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	@Override
	public void method9364() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt10859 &= 0xFFFFFFFD;
		this.anInt10854 = this.method9372();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	@Override
	public void method9368() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt10859 &= 0xFFFFFFFE;
		this.anInt10854 = this.method9372();
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
	public boolean method9375() {
		@Pc(14) int local14 = OpenGL.glCheckFramebufferStatusEXT(this.anInt10854);
		return local14 == 36053;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!rq;I)V")
	public void method9376(@OriginalArg(1) Class93_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method9379(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ec;II)V")
	public void method9377(@OriginalArg(1) Class93_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method9371(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public void method9378(@OriginalArg(0) int arg0) {
		if (this.anInt10854 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static14.anIntArray25[arg0]);
	}

	@OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub3_41.method6975(this.anInt10861);
		super.finalize();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIILclient!rq;)V")
	private void method9379(@OriginalArg(0) int arg0, @OriginalArg(3) Class93_Sub2 arg1) {
		if (this.anInt10854 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt10873) == 0) {
			this.anInt10871 = arg1.anInt3257;
			this.anInt10858 = arg1.anInt3264;
		} else if (this.anInt10871 != arg1.anInt3257 || this.anInt10858 != arg1.anInt3264) {
			throw new RuntimeException();
		}
		arg1.method2944(this.anInt10854, Static14.anIntArray25[arg0]);
		this.anInterface3Array1[arg0] = arg1;
		this.anInt10873 |= local16;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IB)V")
	public void method9381() {
		if (this.anInt10854 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static14.anIntArray25[0]);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V")
	@Override
	public void method9366() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10861);
		this.anInt10859 |= 0x4;
		this.anInt10854 = this.method9372();
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	@Override
	public void method9367() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt10861);
		this.anInt10859 |= 0x1;
		this.anInt10854 = this.method9372();
	}
}
