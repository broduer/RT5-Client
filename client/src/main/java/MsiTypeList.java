import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class MsiTypeList {

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!dla;")
	private SoftLruHashTable aClass82_201 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!u", name = "n", descriptor = "Lclient!dla;")
	public SoftLruHashTable aClass82_202 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!sb;")
	public final Js5 aClass332_116;

	@OriginalMember(owner = "client!u", name = "c", descriptor = "Lclient!sb;")
	private final Js5 aClass332_115;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public MsiTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass332_116 = arg3;
		this.aClass332_115 = arg2;
		this.aClass332_115.getGroupCapacity(34);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	public void method8367() {
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2151();
		}
		synchronized (this.aClass82_202) {
			this.aClass82_202.method2151();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public void method8368() {
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2157();
		}
		synchronized (this.aClass82_202) {
			this.aClass82_202.method2157();
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lclient!ia;")
	public MsiType method8369(@OriginalArg(0) int arg0) {
		@Pc(16) MsiType local16;
		synchronized (this.aClass82_201) {
			local16 = (MsiType) this.aClass82_201.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_115) {
			local39 = this.aClass332_115.fetchFile(arg0, 34);
		}
		local16 = new MsiType();
		local16.aClass365_2 = this;
		if (local39 != null) {
			local16.method3694(new Buffer(local39));
		}
		synchronized (this.aClass82_201) {
			this.aClass82_201.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass82_201 = new SoftLruHashTable(arg1);
		this.aClass82_202 = new SoftLruHashTable(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)V")
	public void method8374() {
		synchronized (this.aClass82_201) {
			this.aClass82_201.method2147(5);
		}
		synchronized (this.aClass82_202) {
			this.aClass82_202.method2147(5);
		}
	}
}
