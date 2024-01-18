import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class ParamTypeList {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_21 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aClass332_10;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public ParamTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_10 = arg2;
		if (this.aClass332_10 != null) {
			this.aClass332_10.getGroupCapacity(11);
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method1156() {
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2151();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public void method1158() {
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method1160() {
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2157();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!po;")
	public ParamType method1161(@OriginalArg(0) int arg0) {
		@Pc(23) ParamType local23;
		synchronized (this.aClass82_21) {
			local23 = (ParamType) this.aClass82_21.get(arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(46) byte[] local46;
		synchronized (this.aClass332_10) {
			local46 = this.aClass332_10.fetchFile(arg0, 11);
		}
		local23 = new ParamType();
		if (local46 != null) {
			local23.method6680(new Buffer(local46));
		}
		synchronized (this.aClass82_21) {
			this.aClass82_21.put(local23, arg0);
			return local23;
		}
	}
}
