import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class BasTypeList {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_172 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aClass332_103;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!vl;")
	public final Class390 aClass390_2;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!vl;)V")
	public BasTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass332_103 = arg2;
		this.aClass332_103.getGroupCapacity(32);
		this.aClass390_2 = arg3;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	public void method7121() {
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2157();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
	public void method7122() {
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2147(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method7124() {
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2151();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lclient!pda;")
	public BasType method7125(@OriginalArg(1) int arg0) {
		@Pc(16) BasType local16;
		synchronized (this.aClass82_172) {
			local16 = (BasType) this.aClass82_172.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_103) {
			local39 = this.aClass332_103.fetchFile(arg0, 32);
		}
		local16 = new BasType();
		local16.aClass312_1 = this;
		if (local39 != null) {
			local16.method6490(new Buffer(local39));
		}
		synchronized (this.aClass82_172) {
			this.aClass82_172.put(local16, arg0);
			return local16;
		}
	}
}
