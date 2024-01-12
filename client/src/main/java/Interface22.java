import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public interface Interface22 {

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)I")
	int method8467();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	void method8468();

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)I")
	int method8469();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZJ)Z")
	boolean method8470(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	void method8471();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V")
	void method8472(@OriginalArg(0) boolean arg0);
}
