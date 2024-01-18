import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
	public static int anInt2247;

	@OriginalMember(owner = "client!dja", name = "g", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_22 = new ClientProt(17, -1);

	@OriginalMember(owner = "client!dja", name = "h", descriptor = "Lclient!av;")
	public static final Class28 aClass28_12 = new Class28(16);

	@OriginalMember(owner = "client!dja", name = "n", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "(II)V")
	public static void method2119(@OriginalArg(1) int arg0) {
		Static524.aClass153_3 = Static405.aClass153_2;
		Static299.anInt4841 = 2;
		Static470.anInt7134 = arg0;
		Static238.method3471(Static319.aString51.equals(""), Static319.aString51, true, "");
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "([BBZ)V")
	public static void method2121(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static339.aClass2_Sub21_9 == null) {
			Static339.aClass2_Sub21_9 = new Packet(20000);
		}
		Static339.aClass2_Sub21_9.pdata(arg0.length, arg0, 0);
		if (!arg1) {
			return;
		}
		Static681.method8926(Static339.aClass2_Sub21_9.data);
		Static343.aClass299_Sub1Array2 = new Class299_Sub1[Static476.anInt7198];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static494.anInt7417; local33 <= Static699.anInt10560; local33++) {
			@Pc(38) Class299_Sub1 local38 = Static615.method8267(local33);
			if (local38 != null) {
				Static343.aClass299_Sub1Array2[local31++] = local38;
			}
		}
		Static149.aBoolean221 = false;
		Static363.aLong219 = Static588.currentTimeMillis();
		Static339.aClass2_Sub21_9 = null;
	}
}
