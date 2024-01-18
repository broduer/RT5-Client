import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class FluTypeList {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_47 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!sb;")
	private final Js5 aClass332_18;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public FluTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_18 = arg2;
		this.aClass332_18.getGroupCapacity(1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lclient!nq;")
	public FluType method2066(@OriginalArg(1) int arg0) {
		@Pc(18) FluType local18;
		synchronized (this.aClass82_47) {
			local18 = (FluType) this.aClass82_47.get(arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41;
		synchronized (this.aClass332_18) {
			local41 = this.aClass332_18.fetchFile(arg0, 1);
		}
		local18 = new FluType();
		if (local41 != null) {
			local18.method5928(new Buffer(local41));
		}
		synchronized (this.aClass82_47) {
			this.aClass82_47.put(local18, arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public void method2067() {
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2157();
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public void method2072() {
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2151();
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
	public void method2073() {
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2147(5);
		}
	}
}
