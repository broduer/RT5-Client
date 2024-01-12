import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class337 {

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "Lclient!dla;")
	private final Class82 aClass82_188 = new Class82(64);

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "Lclient!sb;")
	private final Class332 aClass332_107;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class337(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_107 = arg2;
		this.aClass332_107.method7615(5);
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(II)Lclient!dba;")
	public Class2_Sub2_Sub6 method7664(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_188;
		@Pc(16) Class2_Sub2_Sub6 local16;
		synchronized (this.aClass82_188) {
			local16 = (Class2_Sub2_Sub6) this.aClass82_188.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_107;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_107) {
			local39 = this.aClass332_107.method7602(arg0, 5);
		}
		local16 = new Class2_Sub2_Sub6();
		if (local39 != null) {
			local16.method1979(new Class2_Sub21(local39));
		}
		@Pc(63) Class82 local63 = this.aClass82_188;
		synchronized (this.aClass82_188) {
			this.aClass82_188.method2150(local16, (long) arg0);
			return local16;
		}
	}
}
