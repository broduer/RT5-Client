import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class Class47 {

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	protected Class47() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V")
	public abstract void method4665(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)I")
	public abstract int method4666(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)[B")
	public abstract byte[] method4670(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)Lclient!pj;")
	public abstract Class292 method4671();
}
