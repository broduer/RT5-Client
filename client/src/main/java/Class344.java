import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class344 {

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!dla;")
	private final Class82 aClass82_192 = new Class82(64);

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!sb;")
	private final Class332 aClass332_111;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
	public final int anInt8793;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class344(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_111 = arg2;
		if (this.aClass332_111 == null) {
			this.anInt8793 = 0;
		} else {
			this.anInt8793 = this.aClass332_111.method7615(47);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public void method7790() {
		@Pc(2) Class82 local2 = this.aClass82_192;
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2157();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)V")
	public void method7791() {
		@Pc(6) Class82 local6 = this.aClass82_192;
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2147(5);
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)Lclient!fc;")
	public Class122 method7792(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_192;
		@Pc(16) Class122 local16;
		synchronized (this.aClass82_192) {
			local16 = (Class122) this.aClass82_192.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_111;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_111) {
			local39 = this.aClass332_111.method7602(arg0, 47);
		}
		local16 = new Class122();
		if (local39 != null) {
			local16.method2610(new Class2_Sub21(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_192;
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
	public void method7794() {
		@Pc(2) Class82 local2 = this.aClass82_192;
		synchronized (this.aClass82_192) {
			this.aClass82_192.method2151();
		}
	}
}
