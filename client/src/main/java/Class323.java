import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rha")
public final class Class323 {

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "I")
	public int anInt8324 = 0;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method7300(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt8324 = arg0.g2();
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method7301(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.g1();
			if (local7 == 0) {
				return;
			}
			this.method7300(arg0, local7);
		}
	}
}
