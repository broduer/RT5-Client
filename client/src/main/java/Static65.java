import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cba", name = "E", descriptor = "Lclient!aba;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!cba", name = "D", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_8 = new Class155(11);

	@OriginalMember(owner = "client!cba", name = "B", descriptor = "I")
	public static int anInt1536 = 0;

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(B)I")
	public static int method919() {
		@Pc(5) Class19 local5 = Static163.aClass19_17;
		@Pc(7) boolean local7 = false;
		if (Static400.aClass2_Sub34_28.aClass57_Sub29_1.method5612() != 0) {
			@Pc(19) Canvas local19 = new Canvas();
			local19.setSize(100, 100);
			local7 = true;
			local5 = Static255.method2615((Class330) null, (Interface4) null, 0, local19, 0);
		}
		@Pc(36) long local36 = Static588.method5469();
		for (@Pc(38) int local38 = 0; local38 < 10000; local38++) {
			local5.a(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
		}
		@Pc(71) int local71 = (int) (Static588.method5469() - local36);
		local5.a(100, 100, 0, (byte) 116, (int) 0, -16777216);
		if (local7) {
			local5.i(-7751);
		}
		return local71;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public static void method921() {
		Static157.method1702();
		Static425.aClass67_6 = null;
		Static74.aClass148_1 = null;
		Static456.aClass148_3 = null;
		Static74.aClass67_3 = null;
		Static425.aClass19_13 = null;
		Static226.aClass67_9 = null;
		Static665.aClass367ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZILclient!hda;)V")
	public static void method922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class158 arg2) {
		Static366.anInt5852 = arg0;
		Static605.aClass158_15 = arg2;
		Static157.anInt2777 = arg1;
	}
}
