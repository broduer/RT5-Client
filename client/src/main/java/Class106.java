import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ela")
public final class Class106 implements Interface16 {

	@OriginalMember(owner = "client!ela", name = "f", descriptor = "I")
	private int anInt2628;

	@OriginalMember(owner = "client!ela", name = "e", descriptor = "I")
	private int anInt2629;

	@OriginalMember(owner = "client!ela", name = "g", descriptor = "B")
	private byte aByte50;

	@OriginalMember(owner = "client!ela", name = "b", descriptor = "Lclient!jagdx/IDirect3DVertexBuffer;")
	public IDirect3DVertexBuffer anIDirect3DVertexBuffer1;

	@OriginalMember(owner = "client!ela", name = "d", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!ela", name = "c", descriptor = "Lclient!kea;")
	private final Class19_Sub1_Sub1 aClass19_Sub1_Sub1_4;

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "Z")
	private final boolean aBoolean219;

	@OriginalMember(owner = "client!ela", name = "<init>", descriptor = "(Lclient!kea;Z)V")
	public Class106(@OriginalArg(0) Class19_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass19_Sub1_Sub1_4 = arg0;
		this.aBoolean219 = arg1;
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3154() {
		if (this.aBoolean220 && Static731.method4161((byte) 96, this.anIDirect3DVertexBuffer1.Unlock())) {
			this.aBoolean220 = false;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method3153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte50 = (byte) arg0;
		this.anInt2628 = arg1;
		if (this.anInt2629 < this.anInt2628) {
			@Pc(17) short local17 = 8;
			@Pc(26) byte local26;
			if (this.aBoolean219) {
				local17 = 520;
				local26 = 0;
			} else {
				local26 = 1;
			}
			if (this.anIDirect3DVertexBuffer1 != null) {
				this.anIDirect3DVertexBuffer1.a(111);
			}
			this.anIDirect3DVertexBuffer1 = this.aClass19_Sub1_Sub1_4.anIDirect3DDevice1.a(this.anInt2628, local17, 0, local26, (IDirect3DVertexBuffer) this.anIDirect3DVertexBuffer1);
			this.anInt2629 = this.anInt2628;
		}
		return this.anIDirect3DVertexBuffer1 != null;
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method3152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		return this.method3153(arg0, arg1) ? this.anIDirect3DVertexBuffer1.a(arg2, 0, 0, this.anInt2628, this.aBoolean219 ? 8192 : 0) : false;
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method3155() {
		if (this.anIDirect3DVertexBuffer1 == null) {
			return null;
		}
		@Pc(12) boolean local12 = this.aBoolean219 & true;
		if (!this.aBoolean220 && Static731.method4161((byte) 108, this.anIDirect3DVertexBuffer1.Lock(0, this.anInt2629, local12 ? 8192 : 0, this.aClass19_Sub1_Sub1_4.aGeometryBuffer1))) {
			this.aBoolean220 = true;
			return this.aClass19_Sub1_Sub1_4.aGeometryBuffer1;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(Z)V")
	@Override
	public void method8545() {
		if (this.anIDirect3DVertexBuffer1 != null) {
			this.anIDirect3DVertexBuffer1.a(31);
			this.anIDirect3DVertexBuffer1 = null;
		}
		this.anInt2629 = 0;
		this.anInt2628 = 0;
	}

	@OriginalMember(owner = "client!ela", name = "b", descriptor = "(I)I")
	public int method2445() {
		return this.aByte50;
	}

	@OriginalMember(owner = "client!ela", name = "a", descriptor = "(B)I")
	@Override
	public int method8543() {
		return this.anInt2628;
	}
}
