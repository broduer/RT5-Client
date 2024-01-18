import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uja")
public final class Class378 {

	@OriginalMember(owner = "client!uja", name = "l", descriptor = "I")
	public int anInt9715 = 2;

	@OriginalMember(owner = "client!uja", name = "m", descriptor = "I")
	public int anInt9719 = -1;

	@OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
	public int anInt9716 = 64;

	@OriginalMember(owner = "client!uja", name = "k", descriptor = "Z")
	public boolean aBoolean748 = false;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "Z")
	public boolean aBoolean749 = false;

	@OriginalMember(owner = "client!uja", name = "i", descriptor = "I")
	public int anInt9723 = 1;

	@OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
	public int anInt9722 = 64;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ge;IBI)V")
	private void method8517(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt9719 = arg0.g2();
			if (this.anInt9719 == 65535) {
				this.anInt9719 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt9722 = arg0.g2() + 1;
			this.anInt9716 = arg0.g2() + 1;
		} else if (arg2 == 3) {
			arg0.g1b();
		} else if (arg2 == 4) {
			this.anInt9715 = arg0.g1();
		} else if (arg2 == 5) {
			this.anInt9723 = arg0.g1();
		} else if (arg2 == 6) {
			this.aBoolean749 = true;
		} else if (arg2 == 7) {
			this.aBoolean748 = true;
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(IBLclient!ge;)V")
	public void method8518(@OriginalArg(0) int arg0, @OriginalArg(2) Buffer arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.g1();
			if (local13 == 0) {
				return;
			}
			this.method8517(arg1, arg0, local13);
		}
	}
}
