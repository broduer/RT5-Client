import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Node_Sub46 extends Node {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public int anInt8264;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	private Node_Sub46() {
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Node_Sub46(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8264 = arg1;
		this.aString100 = arg0;
	}
}
