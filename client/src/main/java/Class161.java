import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class161 {

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "Lclient!dla;")
	private Class82 aClass82_82 = new Class82(64);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!sb;")
	private final Class330 aClass330_53;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class161(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_53 = arg2;
		if (this.aClass330_53 != null) {
			@Pc(20) int local20 = this.aClass330_53.method5361() - 1;
			this.aClass330_53.method5372(local20);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public void method2458(@OriginalArg(1) int arg0) {
		@Pc(2) Class82 local2 = this.aClass82_82;
		synchronized (this.aClass82_82) {
			this.aClass82_82.method1391();
			this.aClass82_82 = new Class82(arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public void method2461() {
		@Pc(2) Class82 local2 = this.aClass82_82;
		synchronized (this.aClass82_82) {
			this.aClass82_82.method1385();
		}
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)Lclient!eea;")
	public Class95 method2464(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_82;
		@Pc(16) Class95 local16;
		synchronized (this.aClass82_82) {
			local16 = (Class95) this.aClass82_82.method1390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) Class330 local40 = this.aClass330_53;
		@Pc(53) byte[] local53;
		synchronized (this.aClass330_53) {
			local53 = this.aClass330_53.method5359(Static322.method6822(arg0), Static516.method4794(arg0));
		}
		local16 = new Class95();
		if (local53 != null) {
			local16.method1544(new Class2_Sub21(local53));
		}
		@Pc(77) Class82 local77 = this.aClass82_82;
		synchronized (this.aClass82_82) {
			this.aClass82_82.method1384(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)V")
	public void method2466() {
		@Pc(2) Class82 local2 = this.aClass82_82;
		synchronized (this.aClass82_82) {
			this.aClass82_82.method1381(5);
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public void method2467() {
		@Pc(6) Class82 local6 = this.aClass82_82;
		synchronized (this.aClass82_82) {
			this.aClass82_82.method1391();
		}
	}
}
