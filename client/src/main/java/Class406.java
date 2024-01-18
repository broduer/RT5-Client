import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class406 implements Interface14 {

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "I")
	private int anInt10829;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
	private int anInt10842;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "I")
	private int anInt10844;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
	private int anInt10825 = -1;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
	private int anInt10830 = 0;

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "[Lclient!bi;")
	private final Interface3[] anInterface3Array1 = new Interface3[9];

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_41;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	private final int anInt10832;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class406(@OriginalArg(0) Class19_Sub3 arg0) {
		if (!arg0.aBoolean613) {
			throw new IllegalStateException("");
		}
		this.aClass19_Sub3_41 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static604.anIntArray708, 0);
		this.anInt10832 = Static604.anIntArray708[0];
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	public void method6752(@OriginalArg(0) int arg0) {
		if (this.anInterface3Array1[arg0] != null) {
			this.anInterface3Array1[arg0].method6814();
		}
		this.anInt10844 &= ~(0x1 << arg0);
		this.anInterface3Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	@Override
	public void method6751() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt10832);
		this.anInt10830 |= 0x2;
		this.anInt10825 = this.method6754();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ec;IIZ)V")
	private void method6753(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (this.anInt10825 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt10844 & 0xFFFFFFFE) == 0) {
			this.anInt10829 = arg1.anInt2456;
			this.anInt10842 = arg1.anInt2456;
		} else if (this.anInt10842 != arg1.anInt2456 || this.anInt10829 != arg1.anInt2456) {
			throw new RuntimeException();
		}
		arg1.method1514(arg0, Static14.anIntArray25[0], this.anInt10825);
		this.anInterface3Array1[0] = arg1;
		this.anInt10844 |= 0x1;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	@Override
	public void method6747() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt10830 &= 0xFFFFFFFB;
		this.anInt10825 = this.method6754();
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)I")
	private int method6754() {
		if ((this.anInt10830 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt10830 & 0x2) == 0) {
			return (this.anInt10830 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ut;II)V")
	public void method6755(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt10825 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg1;
		if ((this.anInt10844 & ~local17) == 0) {
			this.anInt10829 = arg0.anInt9828;
			this.anInt10842 = arg0.anInt9818;
		} else if (this.anInt10842 != arg0.anInt9818 || arg0.anInt9828 != this.anInt10829) {
			throw new RuntimeException();
		}
		arg0.method6134(Static14.anIntArray25[arg1], this.anInt10825);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt10844 |= local17;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	@Override
	public void method6746() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt10830 &= 0xFFFFFFFD;
		this.anInt10825 = this.method6754();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	@Override
	public void method6750() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt10830 &= 0xFFFFFFFE;
		this.anInt10825 = this.method6754();
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
	public boolean method6757() {
		@Pc(14) int local14 = OpenGL.glCheckFramebufferStatusEXT(this.anInt10825);
		return local14 == 36053;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!rq;I)V")
	public void method6758(@OriginalArg(1) Class93_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method6761(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!ec;II)V")
	public void method6759(@OriginalArg(1) Class93_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method6753(arg1, arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public void method6760(@OriginalArg(0) int arg0) {
		if (this.anInt10825 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static14.anIntArray25[arg0]);
	}

	@OriginalMember(owner = "client!wo", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub3_41.method4843(this.anInt10832);
		super.finalize();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIILclient!rq;)V")
	private void method6761(@OriginalArg(0) int arg0, @OriginalArg(3) Class93_Sub2 arg1) {
		if (this.anInt10825 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt10844) == 0) {
			this.anInt10842 = arg1.anInt3248;
			this.anInt10829 = arg1.anInt3255;
		} else if (this.anInt10842 != arg1.anInt3248 || this.anInt10829 != arg1.anInt3255) {
			throw new RuntimeException();
		}
		arg1.method2049(this.anInt10825, Static14.anIntArray25[arg0]);
		this.anInterface3Array1[arg0] = arg1;
		this.anInt10844 |= local16;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(IB)V")
	public void method6763() {
		if (this.anInt10825 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static14.anIntArray25[0]);
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)V")
	@Override
	public void method6748() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt10832);
		this.anInt10830 |= 0x4;
		this.anInt10825 = this.method6754();
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	@Override
	public void method6749() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt10832);
		this.anInt10830 |= 0x1;
		this.anInt10825 = this.method6754();
	}
}
