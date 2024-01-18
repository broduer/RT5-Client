import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class284 {

	@OriginalMember(owner = "client!paa", name = "g", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
	public int anInt7174 = 1;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method4516(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static346.method3566(arg1.method5186());
		} else if (arg0 == 2) {
			this.anInt7174 = 0;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!ge;)V")
	public void method4518(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5205();
			if (local13 == 0) {
				return;
			}
			this.method4516(local13, arg0);
		}
	}
}
