import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class49 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "Lclient!dla;")
	private final Class82 aClass82_21 = new Class82(64);

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "Lclient!sb;")
	private final Class332 aClass332_10;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class49(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_10 = arg2;
		if (this.aClass332_10 != null) {
			this.aClass332_10.method7615(11);
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	public void method1156() {
		@Pc(2) Class82 local2 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2151();
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)V")
	public void method1158() {
		@Pc(6) Class82 local6 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	public void method1160() {
		@Pc(2) Class82 local2 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2157();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lclient!po;")
	public Class298 method1161(@OriginalArg(0) int arg0) {
		@Pc(13) Class82 local13 = this.aClass82_21;
		@Pc(23) Class298 local23;
		synchronized (this.aClass82_21) {
			local23 = (Class298) this.aClass82_21.method2156(arg0);
		}
		if (local23 != null) {
			return local23;
		}
		@Pc(37) Class332 local37 = this.aClass332_10;
		@Pc(46) byte[] local46;
		synchronized (this.aClass332_10) {
			local46 = this.aClass332_10.method7602(arg0, 11);
		}
		local23 = new Class298();
		if (local46 != null) {
			local23.method6680(new Class2_Sub21(local46));
		}
		@Pc(70) Class82 local70 = this.aClass82_21;
		synchronized (this.aClass82_21) {
			this.aClass82_21.method2150(local23, arg0);
			return local23;
		}
	}
}
