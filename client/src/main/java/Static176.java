import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
	public static int anInt7555;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "()V")
	public static void method6695() {
		Static374.method5310(Static299.anInt4840);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
	public static boolean method6696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (arg2 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method6697(@OriginalArg(1) Class2_Sub21 arg0) {
		@Pc(6) byte[] local6 = new byte[24];
		if (Static690.aClass245_5 != null) {
			@Pc(18) int local18;
			try {
				Static690.aClass245_5.method5575(0L);
				Static690.aClass245_5.method5572(local6);
				for (local18 = 0; local18 < 24 && local6[local18] == 0; local18++) {
				}
				if (local18 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local18 = 0; local18 < 24; local18++) {
					local6[local18] = -1;
				}
			}
		}
		arg0.method7393(24, local6, 0);
	}
}
