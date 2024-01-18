import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public interface Interface22 {

	@OriginalMember(owner = "client!uha", name = "d", descriptor = "(I)I")
	int method6014();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	void method6015();

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "(I)I")
	int method6016();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZJ)Z")
	boolean method6017(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	void method6018();

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(ZB)V")
	void method6019(@OriginalArg(0) boolean arg0);
}
