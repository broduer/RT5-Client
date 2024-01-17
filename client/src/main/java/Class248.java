import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class248 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "Lclient!dla;")
	private Class82 aClass82_134 = new Class82(128);

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!dla;")
	public Class82 aClass82_135 = new Class82(64);

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!sb;")
	public final Class332 aClass332_83;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Lclient!sb;")
	private final Class332 aClass332_82;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class248(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class332 arg3) {
		this.aClass332_83 = arg3;
		this.aClass332_82 = arg2;
		this.aClass332_82.method7615(36);
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
		this.aClass82_134 = new Class82(arg0);
		this.aClass82_135 = new Class82(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)Lclient!el;")
	public Class105 method5591(@OriginalArg(1) int arg0) {
		@Pc(16) Class105 local16;
		synchronized (this.aClass82_134) {
			local16 = (Class105) this.aClass82_134.method2156(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_82) {
			local39 = this.aClass332_82.method7602(arg0, 36);
		}
		local16 = new Class105();
		local16.aClass248_2 = this;
		local16.anInt2599 = arg0;
		if (local39 != null) {
			local16.method2423(new Class2_Sub21(local39));
		}
		local16.method2430();
		synchronized (this.aClass82_134) {
			this.aClass82_134.method2150(local16, arg0);
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
