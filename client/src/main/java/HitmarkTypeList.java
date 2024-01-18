import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class HitmarkTypeList {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aClass82_121 = new SoftLruHashTable(20);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_122 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!sb;")
	private final Js5 aClass332_75;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!sb;")
	public final Js5 aClass332_76;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public HitmarkTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass332_75 = arg2;
		this.aClass332_76 = arg3;
		this.aClass332_75.getGroupCapacity(46);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method5189() {
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2157();
		}
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2157();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method5190() {
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2151();
		}
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2151();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method5191() {
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2147(5);
		}
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!pb;")
	public HitmarkType method5193(@OriginalArg(0) int arg0) {
		@Pc(16) HitmarkType local16;
		synchronized (this.aClass82_122) {
			local16 = (HitmarkType) this.aClass82_122.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_75) {
			local39 = this.aClass332_75.fetchFile(arg0, 46);
		}
		local16 = new HitmarkType();
		local16.aClass222_1 = this;
		if (local39 != null) {
			local16.method6465(new Buffer(local39));
		}
		synchronized (this.aClass82_122) {
			this.aClass82_122.put(local16, arg0);
			return local16;
		}
	}
}
