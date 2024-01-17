import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class17 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!dla;")
	private final Class82 aClass82_11 = new Class82(64);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!sb;")
	private final Class332 aClass332_2;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class17(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_2 = arg2;
		if (this.aClass332_2 != null) {
			this.aClass332_2.method7615(54);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!sla;")
	public Class343 method263(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_11;
		@Pc(16) Class343 local16;
		synchronized (this.aClass82_11) {
			local16 = (Class343) this.aClass82_11.method2156(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_2;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_2) {
			local39 = this.aClass332_2.method7602(arg0, 54);
		}
		local16 = new Class343();
		if (local39 != null) {
			local16.method7770(new Class2_Sub21(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2150(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method266() {
		@Pc(6) Class82 local6 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2151();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	public void method267() {
		@Pc(11) Class82 local11 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2147(5);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public void method269() {
		@Pc(6) Class82 local6 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method2157();
		}
	}
}
