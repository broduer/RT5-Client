import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class151 {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!dla;")
	private final Class82 aClass82_79 = new Class82(64);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!sb;")
	private final Class332 aClass332_51;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "Lclient!sb;")
	private final Class332 aClass332_50;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;)V")
	public Class151(@OriginalArg(0) int arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_51 = arg2;
		this.aClass332_50 = arg1;
		if (this.aClass332_50 != null) {
			this.aClass332_50.method7615(0);
		}
		if (this.aClass332_51 != null) {
			this.aClass332_51.method7615(0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lclient!bq;")
	public Class2_Sub2_Sub3 method3234(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub3 local11 = (Class2_Sub2_Sub3) this.aClass82_79.method2156(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = this.aClass332_50.method7602(arg0, 0);
		} else {
			local28 = this.aClass332_51.method7602(arg0 & 0x7FFF, 0);
		}
		local11 = new Class2_Sub2_Sub3();
		if (local28 != null) {
			local11.method1180(new Packet(local28));
		}
		if (arg0 >= 32768) {
			local11.method1186();
		}
		this.aClass82_79.method2150(local11, arg0);
		return local11;
	}
}
