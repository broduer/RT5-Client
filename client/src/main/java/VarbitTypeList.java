import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class VarbitTypeList {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!dla;")
	private SoftLruHashTable aClass82_82 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aClass332_53;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarbitTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_53 = arg2;
		if (this.aClass332_53 != null) {
			@Pc(20) int local20 = this.aClass332_53.method7604() - 1;
			this.aClass332_53.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public void method3420(@OriginalArg(1) int arg0) {
		synchronized (this.aClass82_82) {
			this.aClass82_82.method2157();
			this.aClass82_82 = new SoftLruHashTable(arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method3423() {
		synchronized (this.aClass82_82) {
			this.aClass82_82.method2151();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Lclient!eea;")
	public VarbitType method3426(@OriginalArg(0) int arg0) {
		@Pc(16) VarbitType local16;
		synchronized (this.aClass82_82) {
			local16 = (VarbitType) this.aClass82_82.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(53) byte[] local53;
		synchronized (this.aClass332_53) {
			local53 = this.aClass332_53.fetchFile(Static322.method9450(arg0), Static516.method6813(arg0));
		}
		local16 = new VarbitType();
		if (local53 != null) {
			local16.method2346(new Buffer(local53));
		}
		synchronized (this.aClass82_82) {
			this.aClass82_82.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public void method3428() {
		synchronized (this.aClass82_82) {
			this.aClass82_82.method2147(5);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method3429() {
		synchronized (this.aClass82_82) {
			this.aClass82_82.method2157();
		}
	}
}
