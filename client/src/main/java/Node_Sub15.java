import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Node_Sub15 extends Node {

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "I")
	public final int anInt1967;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(II)V")
	public Node_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1967 = arg0;
		this.anInt1968 = arg1;
	}
}
