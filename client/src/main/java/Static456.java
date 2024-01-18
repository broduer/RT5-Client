import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!gm;")
	public static Class148 aClass148_3;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public static int anInt6950;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_85 = new ClientProt(30, -1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
	public static void method6235(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static377.anInt5950 != -1) {
				Static347.method5101(Static377.anInt5950);
			}
			for (@Pc(21) Class2_Sub4 local21 = (Class2_Sub4) Static548.aClass28_40.method736(); local21 != null; local21 = (Class2_Sub4) Static548.aClass28_40.method740()) {
				if (!local21.isLinked()) {
					local21 = (Class2_Sub4) Static548.aClass28_40.method736();
					if (local21 == null) {
						break;
					}
				}
				Static449.method6122(false, true, local21);
			}
			Static377.anInt5950 = -1;
			Static548.aClass28_40 = new Class28(8);
			Static656.method6699();
			Static377.anInt5950 = Static65.aClass3_1.anInt88;
			Static640.method8442(false);
			Static469.method6369();
			Static472.method6421(Static377.anInt5950);
		}
		Static300.method4396();
		Static461.aBoolean529 = false;
		Static242.method3502();
		Static442.anInt6719 = -1;
		Static115.method2136(Static277.anInt4500);
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 = new Class8_Sub2_Sub1_Sub2_Sub1();
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 = Static501.anInt7591 * 512 / 2;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 = Static720.anInt10888 * 512 / 2;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] = Static720.anInt10888 / 2;
		Static110.anInt2195 = 0;
		Static170.anInt2873 = 0;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0] = Static501.anInt7591 / 2;
		if (Static511.anInt7668 == 2) {
			Static110.anInt2195 = Static709.anInt10695 << 9;
			Static170.anInt2873 = Static121.anInt2342 << 9;
		} else {
			Static583.method7666();
		}
		Static218.method3187();
	}
}
