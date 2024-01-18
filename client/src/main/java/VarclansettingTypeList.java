import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class VarclansettingTypeList {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_11 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!sb;")
	private final Js5 aClass332_2;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarclansettingTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_2 = arg2;
		if (this.aClass332_2 != null) {
			this.aClass332_2.getGroupCapacity(54);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!sla;")
	public VarclansettingType method263(@OriginalArg(0) int arg0) {
		@Pc(16) VarclansettingType local16;
		synchronized (this.aClass82_11) {
			local16 = (VarclansettingType) this.aClass82_11.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_2) {
			local39 = this.aClass332_2.fetchFile(arg0, 54);
		}
		local16 = new VarclansettingType();
		if (local39 != null) {
			local16.method7770(new Buffer(local39));
		}
		synchronized (this.aClass82_11) {
			this.aClass82_11.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method266() {
		@Pc(6) SoftLruHashTable local6 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2151();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	public void method267() {
		@Pc(11) SoftLruHashTable local11 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2147(5);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public void method269() {
		@Pc(6) SoftLruHashTable local6 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2157();
		}
	}
}
