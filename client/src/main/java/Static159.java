import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
	public static int anInt2796;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "[I")
	public static final int[] anIntArray245 = new int[5];

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
	public static int anInt2797 = 0;

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "Lclient!sia;")
	public static LinkedList aClass341_15 = new LinkedList();

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)I")
	public static int method2572(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) double local17 = Math.log(arg1) / Math.log(2.0D);
		@Pc(24) double local24 = Math.log(arg0) / Math.log(2.0D);
		@Pc(33) double local33 = local24 + Math.random() * (local17 - local24);
		return (int) (Math.pow(2.0D, local33) + 0.5D);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2574(@OriginalArg(0) Class19 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static137.aBoolean210) {
			local7 = Static130.method2283();
			local9 = Static422.method5778();
		}
		Static97.method1905(Static84.anInt1783 + local9, Static71.anInt1583 - -local7, Static407.anInt6308, arg0, Static682.anInt10323);
		Static180.aClass14_3.method8836(Static71.anInt1583 + local7 + 3, Static84.anInt1783 - (-local9 + -14), Static32.aClass32_24.getLocalization(client.lang), -1, -10660793);
		@Pc(69) int local69 = Static189.aClass120_1.method8860() + local7;
		@Pc(76) int local76 = Static189.aClass120_1.method8861() + local9;
		@Pc(80) int local80;
		@Pc(101) int local101;
		if (Static236.aBoolean304) {
			local80 = 0;
			for (@Pc(137) SecondaryNode_Sub4 local137 = (SecondaryNode_Sub4) Static350.aClass194_8.head(); local137 != null; local137 = (SecondaryNode_Sub4) Static350.aClass194_8.next()) {
				local101 = local9 + Static84.anInt1783 + local80 * 16 + 31;
				if (local137.anInt1541 == 1) {
					Static232.method3387(arg0, Static682.anInt10323, Static407.anInt6308, Static84.anInt1783 + local9, local101, -256, (SecondaryNode_Sub16) local137.aClass194_3.sentinel.secondaryNext, -1, local76, local7 + Static71.anInt1583, local69);
				} else {
					Static515.method6806(local76, Static682.anInt10323, local101, -256, arg0, local69, -1, Static84.anInt1783 + local9, local7 + Static71.anInt1583, Static407.anInt6308, local137);
				}
				local80++;
			}
			if (Static139.aClass2_Sub2_Sub4_1 != null) {
				Static97.method1905(Static493.anInt7385, Static692.anInt10403, Static25.anInt600, arg0, Static85.anInt10703);
				local80 = 0;
				Static180.aClass14_3.method8836(Static692.anInt10403 + 3, Static493.anInt7385 + 14, Static139.aClass2_Sub2_Sub4_1.aString10, -1, -10660793);
				for (@Pc(239) SecondaryNode_Sub16 local239 = (SecondaryNode_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass194_3.head(); local239 != null; local239 = (SecondaryNode_Sub16) Static139.aClass2_Sub2_Sub4_1.aClass194_3.next()) {
					@Pc(251) int local251 = local80 * 16 + Static493.anInt7385 + 31;
					local80++;
					Static232.method3387(arg0, Static85.anInt10703, Static25.anInt600, Static493.anInt7385, local251, -256, local239, -1, local76, Static692.anInt10403, local69);
				}
				Static422.method5780(Static692.anInt10403, Static493.anInt7385, Static85.anInt10703, Static25.anInt600);
			}
		} else {
			local80 = 0;
			for (@Pc(85) SecondaryNode_Sub16 local85 = (SecondaryNode_Sub16) Static693.aClass341_79.head(); local85 != null; local85 = (SecondaryNode_Sub16) Static693.aClass341_79.next()) {
				local101 = (Static594.anInt8801 - local80 - 1) * 16 + local9 + Static84.anInt1783 + 31;
				local80++;
				Static232.method3387(arg0, Static682.anInt10323, Static407.anInt6308, Static84.anInt1783 + local9, local101, -256, local85, -1, local76, local7 + Static71.anInt1583, local69);
			}
		}
		Static422.method5780(local7 + Static71.anInt1583, local9 + Static84.anInt1783, Static682.anInt10323, Static407.anInt6308);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V")
	public static void method2575() {
		if (Static41.method1027(Static283.anInt4588) || Static620.method8328(Static283.anInt4588)) {
			Static127.method2243(Static412.anInt6378, Static170.anInt2873 >> 12, Static110.anInt2195 >> 12);
		} else {
			@Pc(20) int local20 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray879[0] >> 3;
			@Pc(27) int local27 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anIntArray878[0] >> 3;
			if (local20 >= 0 && Static720.anInt10888 >> 3 > local20 && local27 >= 0 && Static501.anInt7591 >> 3 > local27) {
				Static127.method2243(Static412.anInt6378, local20, local27);
			} else {
				Static127.method2243(0, Static720.anInt10888 >> 4, Static501.anInt7591 >> 4);
			}
		}
		Static506.method8320();
		Static588.method7720();
		Static683.method8935();
		Static442.method5976();
	}
}
