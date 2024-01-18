import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public abstract class Node_Sub14 extends Node {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!ge;)V")
	public abstract void method8622(@OriginalArg(1) Buffer arg0);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!hi;I)V")
	public abstract void method8624(@OriginalArg(0) Class164 arg0);
}
