import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class VarcstrTypeList {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aClass332_57;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
	public final int anInt4278;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public VarcstrTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		new SoftLruHashTable(64);
		this.aClass332_57 = arg2;
		this.anInt4278 = this.aClass332_57.getGroupCapacity(15);
	}
}
