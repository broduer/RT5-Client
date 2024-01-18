import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gla")
public final class Class72_Sub1 extends Class72 implements Interface16 {

	@OriginalMember(owner = "client!gla", name = "A", descriptor = "B")
	private byte aByte60;

	@OriginalMember(owner = "client!gla", name = "<init>", descriptor = "(Lclient!tca;Z)V")
	public Class72_Sub1(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method2239() {
		return super.method6085(super.aClass19_Sub1_Sub2_11.aMapBuffer2);
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(III)Z")
	@Override
	public boolean method2238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte60 = (byte) arg0;
		super.method6087(arg1);
		return true;
	}

	@OriginalMember(owner = "client!gla", name = "b", descriptor = "(I)I")
	public int method2241() {
		return this.aByte60;
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	@Override
	public boolean method2237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2) {
		this.aByte60 = (byte) arg0;
		super.method6084(arg1, arg2);
		return true;
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(B)I")
	@Override
	public int method6080() {
		return super.method6080();
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(Z)V")
	@Override
	public void method6082() {
		super.method6082();
	}

	@OriginalMember(owner = "client!gla", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	@Override
	public Buffer method2240() {
		return super.method6088(super.aClass19_Sub1_Sub2_11.aMapBuffer2);
	}
}
