import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class286 {

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
	public int anInt7195 = 1;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method6454(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static346.method5091(arg1.method7384());
		} else if (arg0 == 2) {
			this.anInt7195 = 0;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!ge;)V")
	public void method6456(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7403();
			if (local13 == 0) {
				return;
			}
			this.method6454(local13, arg0);
		}
	}
}
