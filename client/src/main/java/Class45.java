import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class Class45 {

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!dla;")
	private final Class82 aClass82_17 = new Class82(64);

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "Lclient!sb;")
	private final Class332 aClass332_9;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class45(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_9 = arg2;
		if (this.aClass332_9 != null) {
			this.aClass332_9.method7615(35);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)V")
	public void method1093() {
		@Pc(6) Class82 local6 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2151();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)Lclient!la;")
	public Class220 method1094(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_17;
		@Pc(16) Class220 local16;
		synchronized (this.aClass82_17) {
			local16 = (Class220) this.aClass82_17.method2156(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_9;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_9) {
			local39 = this.aClass332_9.method7602(arg0, 35);
		}
		local16 = new Class220();
		if (local39 != null) {
			local16.method5134(new Packet(local39));
		}
		local16.method5130();
		@Pc(66) Class82 local66 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2150(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
	public void method1096() {
		@Pc(11) Class82 local11 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)V")
	public void method1098() {
		@Pc(2) Class82 local2 = this.aClass82_17;
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2157();
		}
	}
}
