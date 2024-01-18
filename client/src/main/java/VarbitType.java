import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class VarbitType {

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "I")
	public int anInt2506;

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "I")
	public int anInt2508;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "I")
	public int anInt2510;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!ge;)V")
	public void method2346(@OriginalArg(1) Buffer arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.g1();
			if (local11 == 0) {
				return;
			}
			this.method2348(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!ge;I)V")
	private void method2348(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2510 = arg0.g2();
			this.anInt2506 = arg0.g1();
			this.anInt2508 = arg0.g1();
		}
	}
}
