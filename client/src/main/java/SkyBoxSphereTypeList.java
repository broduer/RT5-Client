import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class SkyBoxSphereTypeList {

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_45 = new SoftLruHashTable(16);

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "Lclient!sb;")
	private final Js5 aClass332_17;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public SkyBoxSphereTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_17 = arg2;
		this.aClass332_17.getGroupCapacity(30);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)Lclient!afa;")
	public SkyBoxSphereType method2051(@OriginalArg(1) int arg0) {
		@Pc(16) SkyBoxSphereType local16;
		synchronized (this.aClass82_45) {
			local16 = (SkyBoxSphereType) this.aClass82_45.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_17) {
			local39 = this.aClass332_17.fetchFile(arg0, 30);
		}
		local16 = new SkyBoxSphereType();
		if (local39 != null) {
			local16.method131(new Buffer(local39));
		}
		synchronized (this.aClass82_45) {
			this.aClass82_45.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public void method2052() {
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2157();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
	public void method2053() {
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2151();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IB)V")
	public void method2055() {
		synchronized (this.aClass82_45) {
			this.aClass82_45.method2147(5);
		}
	}
}
