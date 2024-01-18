import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vka")
public final class EnumTypeList {

	@OriginalMember(owner = "client!vka", name = "j", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_223 = new SoftLruHashTable(128);

	@OriginalMember(owner = "client!vka", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aClass332_122;

	@OriginalMember(owner = "client!vka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public EnumTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_122 = arg2;
		if (this.aClass332_122 != null) {
			@Pc(20) int local20 = this.aClass332_122.method7604() - 1;
			this.aClass332_122.getGroupCapacity(local20);
		}
	}

	@OriginalMember(owner = "client!vka", name = "a", descriptor = "(II)Lclient!bt;")
	public EnumType method8932(@OriginalArg(0) int arg0) {
		@Pc(16) EnumType local16;
		synchronized (this.aClass82_223) {
			local16 = (EnumType) this.aClass82_223.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = this.aClass332_122.fetchFile(Static61.method1313(arg0), Static188.method2857(arg0));
		local16 = new EnumType();
		if (local40 != null) {
			local16.method1222(new Buffer(local40));
		}
		synchronized (this.aClass82_223) {
			this.aClass82_223.put(local16, arg0);
			return local16;
		}
	}
}
