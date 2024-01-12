import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public final class Class394 {

	@OriginalMember(owner = "client!vt", name = "i", descriptor = "I")
	public int anInt10400 = 0;

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
	public int anInt10402 = 0;

	@OriginalMember(owner = "client!vt", name = "k", descriptor = "I")
	public int anInt10401 = 2048;

	@OriginalMember(owner = "client!vt", name = "j", descriptor = "I")
	public int anInt10405 = 2048;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method9013(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method7403();
			if (local15 == 0) {
				return;
			}
			this.method9014(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method9014(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.anInt10400 = arg1.method7403();
		} else if (arg0 == 2) {
			this.anInt10405 = arg1.method7389();
		} else if (arg0 == 3) {
			this.anInt10401 = arg1.method7389();
		} else if (arg0 == 4) {
			this.anInt10402 = arg1.method7363();
		}
	}
}
