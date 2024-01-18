import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static298 {

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public static int anInt4827;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "[I")
	public static int[] underwaterLocGroupIds;

	@OriginalMember(owner = "client!ji", name = "I", descriptor = "[I")
	public static final int[] anIntArray366 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Lclient!mia;")
	public static final Class244 aClass244_8 = new Class244("", 10);

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Lclient!uk;")
	public static final Interface23 anInterface23_2 = new Class147();

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
	public static void method4392() {
		Static25.aClass28_4.method737();
		Static391.aClass341_34.method7707();
		Static507.aClass396Array1 = null;
		Static75.aClass359Array2 = null;
		Static219.aClass238Array1 = null;
		Static5.anInt92 = -1;
		Static457.anInt6954 = 1;
		Static482.anInt7249 = 0;
		if (Static354.aBoolean439) {
			Static25.aShort1 = Static267.aShort47;
			Static598.aShort120 = Static465.aShort81;
			Static552.aShort123 = Static470.aShort82;
			Static306.aShort59 = Static322.aShort135;
			Static354.aBoolean439 = false;
		}
		Static183.aClass233Array1 = null;
		Static134.anInt10358 = 0;
		Static178.aClass249_1 = null;
		Static401.aClass39Array1 = null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZI)Z")
	public static boolean method4394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
	public static void method4395(@OriginalArg(1) int arg0) {
		Static722.anInt10934 = arg0;
		synchronized (Static354.aClass82_120) {
			Static354.aClass82_120.method2157();
		}
	}
}
