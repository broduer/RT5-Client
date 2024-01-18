import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class217 {

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "Lclient!dla;")
	private final Class82 aClass82_115 = new Class82(64);

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!sb;")
	public final Class332 aClass332_72;

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "Lclient!sb;")
	private final Class332 aClass332_71;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class217(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class332 arg3) {
		this.aClass332_72 = arg3;
		this.aClass332_71 = arg2;
		this.aClass332_71.method7615(3);
	}

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
	public void method5048() {
		@Pc(6) Class82 local6 = this.aClass82_115;
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2151();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)Lclient!pka;")
	public Class296 method5049(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_115;
		@Pc(24) Class296 local24;
		synchronized (this.aClass82_115) {
			local24 = (Class296) this.aClass82_115.method2156(arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class332 local38 = this.aClass332_71;
		@Pc(47) byte[] local47;
		synchronized (this.aClass332_71) {
			local47 = this.aClass332_71.method7602(arg0, 3);
		}
		local24 = new Class296();
		local24.aClass217_4 = this;
		if (local47 != null) {
			local24.method6620(new Packet(local47));
		}
		@Pc(74) Class82 local74 = this.aClass82_115;
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2150(local24, arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method5051() {
		@Pc(2) Class82 local2 = this.aClass82_115;
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2157();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)V")
	public void method5052() {
		@Pc(7) Class82 local7 = this.aClass82_115;
		synchronized (this.aClass82_115) {
			this.aClass82_115.method2147(5);
		}
	}
}
