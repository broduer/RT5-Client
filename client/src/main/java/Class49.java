import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class49 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!dla;")
	private final Class82 aClass82_21 = new Class82(64);

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!sb;")
	private final Class330 aClass330_10;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class49(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class330 arg2) {
		this.aClass330_10 = arg2;
		if (this.aClass330_10 != null) {
			this.aClass330_10.method5372(11);
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method676() {
		@Pc(2) Class82 local2 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method1385();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public void method678() {
		@Pc(6) Class82 local6 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method1381(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method680() {
		@Pc(2) Class82 local2 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method1391();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!po;")
	public Class296 method681(@OriginalArg(0) int arg0) {
		@Pc(13) Class82 local13 = this.aClass82_21;
		@Pc(23) Class296 local23;
		synchronized (this.aClass82_21) {
			local23 = (Class296) this.aClass82_21.method1390((long) arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Class330 local37 = this.aClass330_10;
		@Pc(46) byte[] local46;
		synchronized (this.aClass330_10) {
			local46 = this.aClass330_10.method5359(arg0, 11);
		}
		local23 = new Class296();
		if (local46 != null) {
			local23.method4690(new Class2_Sub21(local46));
		}
		@Pc(70) Class82 local70 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method1384(local23, (long) arg0);
			return local23;
		}
	}
}
