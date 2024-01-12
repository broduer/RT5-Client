import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class Class132 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!qha;")
	protected final Class19_Sub3 aClass19_Sub3_25;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	private final int anInt5588;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "Z")
	private final boolean aBoolean425;

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
	private int anInt5591;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
	protected final int anInt5592;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!qha;I[BIZ)V")
	public Class132(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.aClass19_Sub3_25 = arg0;
		this.anInt5588 = arg1;
		this.aBoolean425 = arg4;
		this.anInt5591 = arg3;
		OpenGL.glGenBuffersARB(1, Static607.anIntArray711, 0);
		this.anInt5592 = Static607.anIntArray711[0];
		this.method5006();
		OpenGL.glBufferDataARBub(arg1, this.anInt5591, arg2, 0, this.aBoolean425 ? 35040 : 35044);
		this.aClass19_Sub3_25.anInt8016 += this.anInt5591;
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!qha;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class132(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5591 = arg3;
		this.aClass19_Sub3_25 = arg0;
		this.anInt5588 = arg1;
		this.aBoolean425 = arg4;
		OpenGL.glGenBuffersARB(1, Static607.anIntArray711, 0);
		this.anInt5592 = Static607.anIntArray711[0];
		this.method5006();
		OpenGL.glBufferDataARBa(arg1, this.anInt5591, arg2.getAddress(), this.aBoolean425 ? 35040 : 35044);
		this.aClass19_Sub3_25.anInt8016 += this.anInt5591;
	}

	@OriginalMember(owner = "client!gj", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.aClass19_Sub3_25.method6978(this.anInt5591, this.anInt5592);
		super.finalize();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI[B)V")
	protected final void method5004(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method5006();
		if (this.anInt5591 >= arg0) {
			OpenGL.glBufferSubDataARBub(this.anInt5588, 0, arg0, arg1, 0);
		} else {
			OpenGL.glBufferDataARBub(this.anInt5588, arg0, arg1, 0, this.aBoolean425 ? 35040 : 35044);
			this.aClass19_Sub3_25.anInt8016 += arg0 - this.anInt5591;
			this.anInt5591 = arg0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
	protected abstract void method5006();
}
