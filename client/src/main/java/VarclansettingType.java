import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sla")
public final class VarclansettingType {

	@OriginalMember(owner = "client!sla", name = "h", descriptor = "I")
	public int anInt8766;

	@OriginalMember(owner = "client!sla", name = "g", descriptor = "I")
	public int anInt8769;

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "C")
	public char aChar7;

	@OriginalMember(owner = "client!sla", name = "e", descriptor = "I")
	public int anInt8770;

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(ILclient!ge;Z)V")
	private void method7769(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
		if (arg0 == 1) {
			this.aChar7 = Static346.method5091(arg1.g1b());
		} else if (arg0 == 2) {
			this.anInt8769 = arg1.g2();
			this.anInt8766 = arg1.g1();
			this.anInt8770 = arg1.g1();
		}
	}

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method7770(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.g1();
			if (local14 == 0) {
				return;
			}
			this.method7769(local14, arg0);
		}
	}
}
