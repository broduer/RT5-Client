import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class LightTypeList {

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_219 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "Lclient!sb;")
	private final Js5 aClass332_120;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public LightTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_120 = arg2;
		this.aClass332_120.getGroupCapacity(31);
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	public void method8819() {
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2157();
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)V")
	public void method8820() {
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2147(5);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IB)Lclient!vt;")
	public LightType method8821(@OriginalArg(0) int arg0) {
		@Pc(23) LightType local23;
		synchronized (this.aClass82_219) {
			local23 = (LightType) this.aClass82_219.get(arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(46) byte[] local46;
		synchronized (this.aClass332_120) {
			local46 = this.aClass332_120.fetchFile(arg0, 31);
		}
		local23 = new LightType();
		if (local46 != null) {
			local23.method9013(new Buffer(local46));
		}
		synchronized (this.aClass82_219) {
			this.aClass82_219.put(local23, arg0);
			return local23;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
	public void method8822() {
		synchronized (this.aClass82_219) {
			this.aClass82_219.method2151();
		}
	}
}
