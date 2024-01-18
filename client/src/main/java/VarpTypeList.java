import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class VarpTypeList {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_138 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!sb;")
	private final Js5 aClass332_86;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt6482;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarpTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_86 = arg2;
		if (this.aClass332_86 == null) {
			this.anInt6482 = 0;
		} else {
			this.anInt6482 = this.aClass332_86.getGroupCapacity(16);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public void method5788() {
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2151();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lclient!rha;")
	public VarpType method5789(@OriginalArg(1) int arg0) {
		@Pc(16) VarpType local16;
		synchronized (this.aClass82_138) {
			local16 = (VarpType) this.aClass82_138.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_86) {
			local39 = this.aClass332_86.fetchFile(arg0, 16);
		}
		local16 = new VarpType();
		if (local39 != null) {
			local16.method7301(new Buffer(local39));
		}
		synchronized (this.aClass82_138) {
			this.aClass82_138.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method5791() {
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2157();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public void method5792() {
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2147(5);
		}
	}
}
