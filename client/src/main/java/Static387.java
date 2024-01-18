import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public static void method5447() {
		if (Static164.anInt2818 < 0) {
			Static180.anInt3010 = -1;
			Static558.anInt3190 = -1;
			Static164.anInt2818 = 0;
		}
		if (Static30.anInt5670 < Static164.anInt2818) {
			Static180.anInt3010 = -1;
			Static164.anInt2818 = Static30.anInt5670;
			Static558.anInt3190 = -1;
		}
		if (Static615.anInt9415 < 0) {
			Static558.anInt3190 = -1;
			Static180.anInt3010 = -1;
			Static615.anInt9415 = 0;
		}
		if (Static30.anInt5664 < Static615.anInt9415) {
			Static558.anInt3190 = -1;
			Static180.anInt3010 = -1;
			Static615.anInt9415 = Static30.anInt5664;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ge;II)Ljava/lang/String;")
	public static String method5448(@OriginalArg(0) Packet arg0) {
		try {
			@Pc(7) int local7 = arg0.gsmarts();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.pos += Static636.aClass199_1.method4445(local19, arg0.data, local7, arg0.pos, 0);
			return Static350.method5133(0, local19, local7);
		} catch (@Pc(53) Exception local53) {
			return "Cabbage";
		}
	}
}
