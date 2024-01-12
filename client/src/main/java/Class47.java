import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class Class47 {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	protected Class47() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public abstract void method6643(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I")
	public abstract int method6644(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method6648(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lclient!pj;")
	public abstract Class294 method6649();
}
