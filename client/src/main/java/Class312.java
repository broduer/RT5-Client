import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class312 {

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "Lclient!dla;")
	private final Class82 aClass82_172 = new Class82(64);

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!sb;")
	private final Class332 aClass332_103;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "Lclient!vl;")
	public final Class390 aClass390_2;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!vl;)V")
	public Class312(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class390 arg3) {
		this.aClass332_103 = arg2;
		this.aClass332_103.method7615(32);
		this.aClass390_2 = arg3;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
	public void method7121() {
		@Pc(2) Class82 local2 = this.aClass82_172;
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2157();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)V")
	public void method7122() {
		@Pc(14) Class82 local14 = this.aClass82_172;
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2147(5);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	public void method7124() {
		@Pc(2) Class82 local2 = this.aClass82_172;
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2151();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BI)Lclient!pda;")
	public Class291 method7125(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_172;
		@Pc(16) Class291 local16;
		synchronized (this.aClass82_172) {
			local16 = (Class291) this.aClass82_172.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_103;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_103) {
			local39 = this.aClass332_103.method7602(arg0, 32);
		}
		local16 = new Class291();
		local16.aClass312_1 = this;
		if (local39 != null) {
			local16.method6490(new Class2_Sub21(local39));
		}
		@Pc(66) Class82 local66 = this.aClass82_172;
		synchronized (this.aClass82_172) {
			this.aClass82_172.method2150(local16, (long) arg0);
			return local16;
		}
	}
}
