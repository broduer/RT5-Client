import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class17 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "Lclient!dla;")
	private final Class82 aClass82_11 = new Class82(64);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!sb;")
	private final Class330 aClass330_2;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class17(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_2 = arg2;
		if (this.aClass330_2 != null) {
			this.aClass330_2.method5372(54);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!sla;")
	public Class341 method149(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_11;
		@Pc(16) Class341 local16;
		synchronized (this.aClass82_11) {
			local16 = (Class341) this.aClass82_11.method1390((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class330 local30 = this.aClass330_2;
		@Pc(39) byte[] local39;
		synchronized (this.aClass330_2) {
			local39 = this.aClass330_2.method5359(arg0, 54);
		}
		local16 = new Class341();
		if (local39 != null) {
			local16.method5507(new Class2_Sub21(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method1384(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
	public void method152() {
		@Pc(6) Class82 local6 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method1385();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	public void method153() {
		@Pc(11) Class82 local11 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method1381(5);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public void method155() {
		@Pc(6) Class82 local6 = this.aClass82_11;
		synchronized (this.aClass82_11) {
			this.aClass82_11.method1391();
		}
	}
}
