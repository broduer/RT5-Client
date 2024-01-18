import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class VarclanTypeList {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_192 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!sb;")
	private final Js5 aClass332_111;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public final int anInt8793;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarclanTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_111 = arg2;
		if (this.aClass332_111 == null) {
			this.anInt8793 = 0;
		} else {
			this.anInt8793 = this.aClass332_111.getGroupCapacity(47);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public void method7790() {
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2157();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public void method7791() {
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2147(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Lclient!fc;")
	public VarclanType method7792(@OriginalArg(0) int arg0) {
		@Pc(16) VarclanType local16;
		synchronized (this.aClass82_192) {
			local16 = (VarclanType) this.aClass82_192.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_111) {
			local39 = this.aClass332_111.fetchFile(arg0, 47);
		}
		local16 = new VarclanType();
		if (local39 != null) {
			local16.method2610(new Buffer(local39));
		}
		synchronized (this.aClass82_192) {
			this.aClass82_192.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method7794() {
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2151();
		}
	}
}
