import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class Class212 {

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!dla;")
	private final Class82 aClass82_112 = new Class82(64);

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "Lclient!sb;")
	private final Class332 aClass332_67;

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
	public final int anInt5492;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class212(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_67 = arg2;
		this.anInt5492 = this.aClass332_67.method7615(19);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)Lclient!paa;")
	public Class286 method4954(@OriginalArg(0) int arg0) {
		@Pc(12) Class82 local12 = this.aClass82_112;
		@Pc(22) Class286 local22;
		synchronized (this.aClass82_112) {
			local22 = (Class286) this.aClass82_112.method2156((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class332 local36 = this.aClass332_67;
		@Pc(45) byte[] local45;
		synchronized (this.aClass332_67) {
			local45 = this.aClass332_67.method7602(arg0, 19);
		}
		local22 = new Class286();
		if (local45 != null) {
			local22.method6456(new Class2_Sub21(local45));
		}
		@Pc(69) Class82 local69 = this.aClass82_112;
		synchronized (this.aClass82_112) {
			this.aClass82_112.method2150(local22, (long) arg0);
			return local22;
		}
	}
}
