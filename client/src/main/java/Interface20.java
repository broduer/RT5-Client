import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public interface Interface20 extends Interface21 {

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Z")
	boolean method8553();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	void method8545();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method8554();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Lclient!wda;")
	Class399 method8555();

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	void method8550(@OriginalArg(1) int arg0);
}
