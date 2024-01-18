import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kka")
public final class VarclientTypeList {

	@OriginalMember(owner = "client!kka", name = "b", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_112 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aClass332_67;

	@OriginalMember(owner = "client!kka", name = "f", descriptor = "I")
	public final int anInt5492;

	@OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarclientTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_67 = arg2;
		this.anInt5492 = this.aClass332_67.getGroupCapacity(19);
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(II)Lclient!paa;")
	public VarclientType method4954(@OriginalArg(0) int arg0) {
		@Pc(22) VarclientType local22;
		synchronized (this.aClass82_112) {
			local22 = (VarclientType) this.aClass82_112.get(arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(45) byte[] local45;
		synchronized (this.aClass332_67) {
			local45 = this.aClass332_67.fetchFile(arg0, 19);
		}
		local22 = new VarclientType();
		if (local45 != null) {
			local22.method6456(new Buffer(local45));
		}
		synchronized (this.aClass82_112) {
			this.aClass82_112.put(local22, arg0);
			return local22;
		}
	}
}
