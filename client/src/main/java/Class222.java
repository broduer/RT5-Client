import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class222 {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!dla;")
	public final Class82 aClass82_121 = new Class82(20);

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!dla;")
	private final Class82 aClass82_122 = new Class82(64);

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!sb;")
	private final Class332 aClass332_75;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "Lclient!sb;")
	public final Class332 aClass332_76;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public Class222(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class332 arg3) {
		this.aClass332_75 = arg2;
		this.aClass332_76 = arg3;
		this.aClass332_75.method7615(46);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public void method5189() {
		@Pc(2) Class82 local2 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2157();
		}
		local2 = this.aClass82_121;
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2157();
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method5190() {
		@Pc(2) Class82 local2 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2151();
		}
		local2 = this.aClass82_121;
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2151();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method5191() {
		@Pc(6) Class82 local6 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2147(5);
		}
		local6 = this.aClass82_121;
		synchronized (this.aClass82_121) {
			this.aClass82_121.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)Lclient!pb;")
	public Class287 method5193(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_122;
		@Pc(16) Class287 local16;
		synchronized (this.aClass82_122) {
			local16 = (Class287) this.aClass82_122.method2156(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_75;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_75) {
			local39 = this.aClass332_75.method7602(arg0, 46);
		}
		local16 = new Class287();
		local16.aClass222_1 = this;
		if (local39 != null) {
			local16.method6465(new Class2_Sub21(local39));
		}
		@Pc(66) Class82 local66 = this.aClass82_122;
		synchronized (this.aClass82_122) {
			this.aClass82_122.method2150(local16, arg0);
			return local16;
		}
	}
}
