import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
	public static int anInt1088;

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "[I")
	public static int[] anIntArray92;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_25 = new Class82(5);

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public static void method1179() {
		Static342.method4472(Static400.aClass2_Sub34_28.aClass57_Sub5_1.method2172());
		@Pc(19) int local19 = (Static691.anInt10395 >> 3) + (Static170.anInt2873 >> 12);
		@Pc(28) int local28 = (Static110.anInt2195 >> 12) + (Static116.anInt2279 >> 3);
		Static394.anInt6196 = Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 = 0;
		Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method1419(8, 8);
		Static22.anIntArrayArray11 = new int[18][4];
		Static363.aByteArrayArray22 = new byte[18][];
		Static177.aByteArrayArray5 = new byte[18][];
		Static267.anIntArray329 = new int[18];
		Static68.anIntArray316 = new int[18];
		Static266.anIntArray615 = new int[18];
		Static89.anIntArray169 = new int[18];
		Static421.aByteArrayArray19 = new byte[18][];
		Static298.anIntArray367 = new int[18];
		Static376.anIntArray458 = new int[18];
		Static319.aByteArrayArray16 = new byte[18][];
		Static118.aByteArrayArray3 = new byte[18][];
		@Pc(79) int local79 = 0;
		@Pc(99) int local99;
		for (@Pc(88) int local88 = (local19 - (Static720.anInt10888 >> 4)) / 8; local88 <= (local19 + (Static720.anInt10888 >> 4)) / 8; local88++) {
			for (local99 = (local28 - (Static501.anInt7591 >> 4)) / 8; local99 <= ((Static501.anInt7591 >> 4) + local28) / 8; local99++) {
				@Pc(107) int local107 = local99 + (local88 << 8);
				Static89.anIntArray169[local79] = local107;
				Static267.anIntArray329[local79] = Static93.aClass332_16.method7597("m" + local88 + "_" + local99);
				Static266.anIntArray615[local79] = Static93.aClass332_16.method7597("l" + local88 + "_" + local99);
				Static376.anIntArray458[local79] = Static93.aClass332_16.method7597("n" + local88 + "_" + local99);
				Static68.anIntArray316[local79] = Static93.aClass332_16.method7597("um" + local88 + "_" + local99);
				Static298.anIntArray367[local79] = Static93.aClass332_16.method7597("ul" + local88 + "_" + local99);
				if (Static376.anIntArray458[local79] == -1) {
					Static267.anIntArray329[local79] = -1;
					Static266.anIntArray615[local79] = -1;
					Static68.anIntArray316[local79] = -1;
					Static298.anIntArray367[local79] = -1;
				}
				local79++;
			}
		}
		for (local99 = local79; local99 < Static376.anIntArray458.length; local99++) {
			Static376.anIntArray458[local99] = -1;
			Static267.anIntArray329[local99] = -1;
			Static266.anIntArray615[local99] = -1;
			Static68.anIntArray316[local99] = -1;
			Static298.anIntArray367[local99] = -1;
		}
		@Pc(309) byte local309;
		if (Static283.anInt4588 == 3) {
			local309 = 4;
		} else if (Static283.anInt4588 == 9) {
			local309 = 10;
		} else if (Static283.anInt4588 == 7) {
			local309 = 8;
		} else {
			throw new RuntimeException(String.valueOf(Static283.anInt4588));
		}
		Static684.method8938(false, local19, local309, local28);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)Z")
	public static boolean method1183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
