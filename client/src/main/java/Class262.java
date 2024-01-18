import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class262 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!dla;")
	private final Class82 aClass82_138 = new Class82(64);

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "Lclient!sb;")
	private final Class332 aClass332_86;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	public final int anInt6482;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class262(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_86 = arg2;
		if (this.aClass332_86 == null) {
			this.anInt6482 = 0;
		} else {
			this.anInt6482 = this.aClass332_86.method7615(16);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	public void method5788() {
		@Pc(2) Class82 local2 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2151();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)Lclient!rha;")
	public Class323 method5789(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_138;
		@Pc(16) Class323 local16;
		synchronized (this.aClass82_138) {
			local16 = (Class323) this.aClass82_138.method2156(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_86;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_86) {
			local39 = this.aClass332_86.method7602(arg0, 16);
		}
		local16 = new Class323();
		if (local39 != null) {
			local16.method7301(new Packet(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2150(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public void method5791() {
		@Pc(13) Class82 local13 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2157();
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	public void method5792() {
		@Pc(11) Class82 local11 = this.aClass82_138;
		synchronized (this.aClass82_138) {
			this.aClass82_138.method2147(5);
		}
	}
}
