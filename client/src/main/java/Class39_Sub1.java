import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public abstract class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!mha", name = "g", descriptor = "I")
	protected final int anInt10586;

	@OriginalMember(owner = "client!mha", name = "m", descriptor = "I")
	protected final int anInt10584;

	@OriginalMember(owner = "client!mha", name = "h", descriptor = "I")
	protected final int anInt10588;

	@OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub1(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt10586 = arg0.method7389();
		this.anInt10584 = arg0.method7389();
		this.anInt10588 = arg0.method7403();
	}
}