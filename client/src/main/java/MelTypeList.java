import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class MelTypeList {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!dla;")
	private SoftLruHashTable aClass82_134 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!dla;")
	public SoftLruHashTable aClass82_135 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!sb;")
	public final Js5 aClass332_83;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Lclient!sb;")
	private final Js5 aClass332_82;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public MelTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass332_83 = arg3;
		this.aClass332_82 = arg2;
		this.aClass332_82.getGroupCapacity(36);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method5588() {
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2147(5);
		}
		synchronized (this.aClass82_135) {
			this.aClass82_135.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
	public void method5590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass82_134 = new SoftLruHashTable(arg0);
		this.aClass82_135 = new SoftLruHashTable(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!el;")
	public MelType method5591(@OriginalArg(1) int arg0) {
		@Pc(16) MelType local16;
		synchronized (this.aClass82_134) {
			local16 = (MelType) this.aClass82_134.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_82) {
			local39 = this.aClass332_82.fetchFile(arg0, 36);
		}
		local16 = new MelType();
		local16.aClass248_2 = this;
		local16.anInt2599 = arg0;
		if (local39 != null) {
			local16.method2423(new Buffer(local39));
		}
		local16.method2430();
		synchronized (this.aClass82_134) {
			this.aClass82_134.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method5592() {
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2151();
		}
		synchronized (this.aClass82_135) {
			this.aClass82_135.method2151();
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	public void method5593() {
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2157();
		}
		synchronized (this.aClass82_135) {
			this.aClass82_135.method2157();
		}
	}
}
