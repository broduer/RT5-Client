import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class IdkTypeList {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_115 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!sb;")
	public final Js5 aClass332_72;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!sb;")
	private final Js5 aClass332_71;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public IdkTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass332_72 = arg3;
		this.aClass332_71 = arg2;
		this.aClass332_71.getGroupCapacity(3);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	public void method5048() {
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2151();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)Lclient!pka;")
	public IdkType method5049(@OriginalArg(0) int arg0) {
		@Pc(24) IdkType local24;
		synchronized (this.aClass82_115) {
			local24 = (IdkType) this.aClass82_115.get(arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(47) byte[] local47;
		synchronized (this.aClass332_71) {
			local47 = this.aClass332_71.fetchFile(arg0, 3);
		}
		local24 = new IdkType();
		local24.aClass217_4 = this;
		if (local47 != null) {
			local24.method6620(new Buffer(local47));
		}
		synchronized (this.aClass82_115) {
			this.aClass82_115.put(local24, arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method5051() {
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2157();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public void method5052() {
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2147(5);
		}
	}
}
