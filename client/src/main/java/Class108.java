import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ema")
public final class Class108 {

	@OriginalMember(owner = "client!ema", name = "l", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!ema", name = "b", descriptor = "I")
	public int anInt2630 = -1;

	@OriginalMember(owner = "client!ema", name = "m", descriptor = "I")
	public int anInt2633 = -1;

	@OriginalMember(owner = "client!ema", name = "g", descriptor = "I")
	public int anInt2638 = -1;

	@OriginalMember(owner = "client!ema", name = "h", descriptor = "I")
	public int anInt2634 = 0;

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(IILclient!ge;)V")
	private void method2446(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt2638 = arg1.method7389();
		} else if (arg0 == 2) {
			this.anIntArray232 = new int[arg1.method7403()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray232.length; local26++) {
				this.anIntArray232[local26] = arg1.method7389();
			}
		} else if (arg0 == 3) {
			this.anInt2633 = arg1.method7403();
		} else if (arg0 == 4) {
			this.anInt2634 = arg1.method7403();
		} else if (arg0 == 5) {
			this.anInt2630 = arg1.method7389();
		}
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(BLclient!ge;)V")
	public void method2447(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7403();
			if (local3 == 0) {
				return;
			}
			this.method2446(local3, arg0);
		}
	}
}
