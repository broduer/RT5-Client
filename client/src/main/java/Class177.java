import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public final class Class177 {

	@OriginalMember(owner = "client!iea", name = "l", descriptor = "I")
	public int anInt4281;

	@OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
	public int anInt4282;

	@OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
	public int anInt4283;

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
	public int anInt4285;

	@OriginalMember(owner = "client!iea", name = "d", descriptor = "I")
	public int anInt4287;

	@OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
	public int anInt4288;

	@OriginalMember(owner = "client!iea", name = "p", descriptor = "I")
	public int anInt4289;

	@OriginalMember(owner = "client!iea", name = "h", descriptor = "I")
	public int anInt4290;

	@OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
	public int anInt4291;

	@OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
	public int anInt4292;

	@OriginalMember(owner = "client!iea", name = "q", descriptor = "I")
	public int anInt4293;

	@OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
	public int anInt4295;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILclient!iea;)Z")
	public boolean method3860(@OriginalArg(1) Class177 arg0) {
		return arg0.anInt4283 == this.anInt4283 && arg0.anInt4290 == this.anInt4290 && arg0.anInt4285 == this.anInt4285;
	}
}
