import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!via", name = "O", descriptor = "J")
	public static long js5ConnectTime;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method8908(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		for (@Pc(1) int local1 = 0; local1 < Static476.anInt7198; local1++) {
			@Pc(6) int local6 = arg1.method7397();
			@Pc(10) int local10 = arg1.method7389();
			if (local10 == 65535) {
				local10 = -1;
			}
			if (Static106.aClass299_Sub1Array1[local6] != null) {
				Static106.aClass299_Sub1Array1[local6].anInt7584 = local10;
			}
		}
		if (arg0 != -1) {
			method8908(-83, null);
		}
	}
}
