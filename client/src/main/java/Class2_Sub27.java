import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public final class Class2_Sub27 extends Node {

	@OriginalMember(owner = "client!iia", name = "k", descriptor = "I")
	public final int anInt4369;

	@OriginalMember(owner = "client!iia", name = "p", descriptor = "I")
	public final int anInt4365;

	@OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(II)V")
	public Class2_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4369 = arg0;
		this.anInt4365 = arg1;
	}
}
