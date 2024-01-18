import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Lclient!gm;")
	public static Class148 aClass148_3;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	public static int anInt6929;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_85 = new Class345(30, -1);

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)V")
	public static void method4332(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static377.anInt5930 != -1) {
				Static347.method3571(Static377.anInt5930);
			}
			for (@Pc(21) Class2_Sub4 local21 = (Class2_Sub4) Static548.aClass28_40.method371(); local21 != null; local21 = (Class2_Sub4) Static548.aClass28_40.method375()) {
				if (!local21.e(-127)) {
					local21 = (Class2_Sub4) Static548.aClass28_40.method371();
					if (local21 == null) {
						break;
					}
				}
				Static449.method4257(false, true, local21);
			}
			Static377.anInt5930 = -1;
			Static548.aClass28_40 = new Class28(8);
			Static656.method4705();
			Static377.anInt5930 = Static65.aClass3_1.anInt88;
			Static640.method5989(false);
			Static469.method4451();
			Static472.method4493(Static377.anInt5930);
		}
		Static300.method3049();
		Static461.aBoolean529 = false;
		Static242.method2535();
		Static442.anInt6699 = -1;
		Static115.method1370(Class8_Sub2_Sub4_Sub1.lb);
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 = new Class8_Sub2_Sub1_Sub2_Sub1();
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10694 = Static501.anInt7568 * 512 / 2;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10690 = Static720.anInt10859 * 512 / 2;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] = Static720.anInt10859 / 2;
		Static110.anInt2186 = 0;
		Static170.anInt2864 = 0;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0] = Static501.anInt7568 / 2;
		if (Static511.anInt7645 == 2) {
			Static110.anInt2186 = Static709.anInt10667 << 9;
			Static170.anInt2864 = Static121.anInt2333 << 9;
		} else {
			Static583.method5413();
		}
		Static218.method2272();
	}
}
