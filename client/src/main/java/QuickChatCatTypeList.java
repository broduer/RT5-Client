import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class QuickChatCatTypeList {

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_79 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!sb;")
	private final Js5 aClass332_51;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "Lclient!sb;")
	private final Js5 aClass332_50;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(ILclient!sb;Lclient!sb;)V")
	public QuickChatCatTypeList(@OriginalArg(0) int arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_51 = arg2;
		this.aClass332_50 = arg1;
		if (this.aClass332_50 != null) {
			this.aClass332_50.getGroupCapacity(0);
		}
		if (this.aClass332_51 != null) {
			this.aClass332_51.getGroupCapacity(0);
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BI)Lclient!bq;")
	public QuickChatCatType method3234(@OriginalArg(1) int arg0) {
		@Pc(11) QuickChatCatType local11 = (QuickChatCatType) this.aClass82_79.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = this.aClass332_50.fetchFile(arg0, 0);
		} else {
			local28 = this.aClass332_51.fetchFile(arg0 & 0x7FFF, 0);
		}
		local11 = new QuickChatCatType();
		if (local28 != null) {
			local11.method1180(new Buffer(local28));
		}
		if (arg0 >= 32768) {
			local11.method1186();
		}
		this.aClass82_79.put(local11, arg0);
		return local11;
	}
}
