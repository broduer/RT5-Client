import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class269 {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!dla;")
	private final Class82 aClass82_142 = new Class82(64);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Lclient!dla;")
	public final Class82 aClass82_143 = new Class82(2);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!sb;")
	public final Class332 aClass332_88;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!sb;")
	private final Class332 aClass332_89;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class269(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class332 arg3) {
		this.aClass332_88 = arg3;
		this.aClass332_89 = arg2;
		this.aClass332_89.method7615(33);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)V")
	public void method5977() {
		@Pc(11) Class82 local11 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2147(5);
		}
		local11 = this.aClass82_143;
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2147(5);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public void method5979() {
		@Pc(9) Class82 local9 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2151();
		}
		local9 = this.aClass82_143;
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2151();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!vla;")
	public Class391 method5980(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_142;
		@Pc(18) Class391 local18;
		synchronized (this.aClass82_142) {
			local18 = (Class391) this.aClass82_142.method2156(arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class332 local32 = this.aClass332_89;
		@Pc(41) byte[] local41;
		synchronized (this.aClass332_89) {
			local41 = this.aClass332_89.method7602(arg0, 33);
		}
		local18 = new Class391();
		local18.aClass269_2 = this;
		if (local41 != null) {
			local18.method8942(new Class2_Sub21(local41));
		}
		@Pc(70) Class82 local70 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2150(local18, arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public void method5981() {
		@Pc(7) Class82 local7 = this.aClass82_142;
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2157();
		}
		local7 = this.aClass82_143;
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2157();
		}
	}
}
