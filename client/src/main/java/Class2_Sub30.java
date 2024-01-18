import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class Class2_Sub30 extends Node {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!rfa;I)V")
	public abstract void method7649(@OriginalArg(0) Class2_Sub47 arg0);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ge;I)V")
	public abstract void method7654(@OriginalArg(0) Packet arg0);
}
