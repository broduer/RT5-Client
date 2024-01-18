import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public final class Class79 {

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!dla;")
	private final Class82 aClass82_47 = new Class82(128);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!sb;")
	private final Class332 aClass332_18;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class79(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_18 = arg2;
		this.aClass332_18.method7615(1);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lclient!nq;")
	public Class266 method2066(@OriginalArg(1) int arg0) {
		@Pc(18) Class266 local18;
		synchronized (this.aClass82_47) {
			local18 = (Class266) this.aClass82_47.method2156(arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41;
		synchronized (this.aClass332_18) {
			local41 = this.aClass332_18.method7602(arg0, 1);
		}
		local18 = new Class266();
		if (local41 != null) {
			local18.method5928(new Packet(local41));
		}
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2150(local18, arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public void method2067() {
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2157();
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
	public void method2072() {
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2151();
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(II)V")
	public void method2073() {
		synchronized (this.aClass82_47) {
			this.aClass82_47.method2147(5);
		}
	}
}
