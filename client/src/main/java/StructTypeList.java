import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class StructTypeList {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_114 = new SoftLruHashTable(256);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aClass332_70;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public StructTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_70 = arg2;
		this.aClass332_70.getGroupCapacity(26);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)V")
	public void method5042() {
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2157();
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
	public void method5044() {
		@Pc(10) SoftLruHashTable local10 = this.aClass82_114;
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2147(5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!ab;")
	public StructType method5045(@OriginalArg(1) int arg0) {
		@Pc(16) StructType local16;
		synchronized (this.aClass82_114) {
			local16 = (StructType) this.aClass82_114.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_70) {
			local39 = this.aClass332_70.fetchFile(arg0, 26);
		}
		local16 = new StructType();
		if (local39 != null) {
			local16.method90(new Buffer(local39));
		}
		synchronized (this.aClass82_114) {
			this.aClass82_114.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public void method5047() {
		@Pc(2) SoftLruHashTable local2 = this.aClass82_114;
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2151();
		}
	}
}
