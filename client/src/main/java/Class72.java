import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public abstract class Class72 implements Interface21 {

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	private int anInt9752;

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
	private int anInt9759;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	private int anInt9747 = -1;

	@OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
	private int anInt9758 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Z")
	private final boolean aBoolean752;

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "I")
	private final int anInt9749;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "Lclient!tca;")
	protected final Class19_Sub1_Sub2 aClass19_Sub1_Sub2_11;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!tca;IZ)V")
	protected Class72(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean752 = arg2;
		this.anInt9749 = arg1;
		this.aClass19_Sub1_Sub2_11 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V")
	public void method8545() {
		if (this.anInt9747 > 0) {
			this.aClass19_Sub1_Sub2_11.method8171(this.anInt9747, this.anInt9752);
			this.anInt9747 = -1;
		}
	}

	@OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8545();
		super.finalize();
	}

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)J")
	public final long method8546() {
		return this.anInt9747 == 0 ? this.aNativeHeapBuffer7.getAddress() : 0L;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!jaclib/memory/Source;Z)Z")
	protected final boolean method8547(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1) {
		if (arg0 > this.anInt9759) {
			this.method8552();
			if (this.anInt9747 <= 0) {
				throw new RuntimeException("ARGH!");
			}
			OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
			OpenGL.glBufferDataARBa(this.anInt9749, arg0, arg1.getAddress(), this.aBoolean752 ? 35040 : 35044);
			this.aClass19_Sub1_Sub2_11.anInt9167 += arg0 - this.anInt9752;
			this.anInt9759 = arg0;
		} else if (this.anInt9747 > 0) {
			OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
			OpenGL.glBufferSubDataARBa(this.anInt9749, 0, this.anInt9752, arg1.getAddress());
			this.aClass19_Sub1_Sub2_11.anInt9167 += arg0 - this.anInt9752;
		} else {
			throw new RuntimeException("ARGH!");
		}
		this.anInt9752 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!jaggl/MapBuffer;)Z")
	protected final boolean method8548(@OriginalArg(1) MapBuffer arg0) {
		@Pc(13) boolean local13 = true;
		if (this.anInt9758 != 0) {
			if (this.anInt9747 > 0) {
				OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
				if (this.anInt9758 == 1) {
					OpenGL.glBufferSubDataARBa(this.anInt9749, 0, this.anInt9759, this.aClass19_Sub1_Sub2_11.aNativeHeapBuffer6.getAddress());
				} else {
					local13 = arg0.b();
				}
			}
			this.anInt9758 = 0;
		}
		return local13;
	}

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
	public final void method8549() {
		if (this.aClass19_Sub1_Sub2_11.aBoolean705) {
			OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public void method8550(@OriginalArg(1) int arg0) {
		if (arg0 > this.anInt9759) {
			this.method8552();
			if (this.anInt9747 > 0) {
				OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
				OpenGL.glBufferDataARBub(this.anInt9749, arg0, null, 0, this.aBoolean752 ? 35040 : 35044);
				this.aClass19_Sub1_Sub2_11.anInt9167 += arg0 - this.anInt9759;
			} else {
				this.aNativeHeapBuffer7 = this.aClass19_Sub1_Sub2_11.method8113(false, arg0);
			}
			this.anInt9759 = arg0;
		}
		this.anInt9752 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZLclient!jaggl/MapBuffer;I)Lclient!jaclib/memory/Buffer;")
	protected final Buffer method8551(@OriginalArg(1) MapBuffer arg0) {
		if (this.anInt9758 == 0) {
			this.method8552();
			if (this.anInt9747 <= 0) {
				this.anInt9758 = 2;
				return this.aNativeHeapBuffer7;
			}
			OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
			OpenGL.glBufferDataARBub(this.anInt9749, this.anInt9759, null, 0, this.aBoolean752 ? 35040 : 35044);
			if (this.aClass19_Sub1_Sub2_11.aNativeHeapBuffer6.b >= this.anInt9752) {
				this.anInt9758 = 1;
				return this.aClass19_Sub1_Sub2_11.aNativeHeapBuffer6;
			}
			if (!arg0.a() && arg0.a(this.anInt9749, this.anInt9752, 35001)) {
				this.anInt9758 = 2;
				return arg0;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	@Override
	public int method8543() {
		return this.anInt9752;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(I)V")
	private void method8552() {
		if (this.anInt9747 >= 0) {
			return;
		}
		if (this.aClass19_Sub1_Sub2_11.aBoolean705) {
			OpenGL.glGenBuffersARB(1, Static581.anIntArray687, 0);
			this.anInt9747 = Static581.anIntArray687[0];
			OpenGL.glBindBufferARB(this.anInt9749, this.anInt9747);
		} else {
			this.anInt9747 = 0;
		}
	}
}
