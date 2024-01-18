import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public final class Class39_Sub8 extends Class39 {

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Ljava/lang/String;")
	private final String aString39;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	private final int anInt3645;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub8(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.aString39 = arg0.gstr();
		this.anInt3645 = arg0.g2();
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		if (Static717.anInt10846 != -1) {
			Static472.method6434(Static717.anInt10846, this.aString39, this.anInt3645);
		}
	}
}
