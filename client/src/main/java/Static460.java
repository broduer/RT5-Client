import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "Lclient!tt;")
	public static Class73 aClass73_10;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
	public static int[] anIntArray554;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	public static int anInt6991;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	public static int anInt6985 = 0;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!sia;")
	public static final Class341 aClass341_40 = new Class341();

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)I")
	public static int method6273() {
		if (Static213.anInt3480 == 0) {
			Static566.aClass328_2.method7477(new Class64("jaclib"));
			if (Static566.aClass328_2.method7476().method6472() != 100) {
				return 1;
			}
			if (!((Class64) Static566.aClass328_2.method7476()).method1554()) {
				Static295.aClient1.method1644();
			}
			Static213.anInt3480 = 1;
		}
		@Pc(270) int local270;
		@Pc(292) int local292;
		@Pc(308) int local308;
		@Pc(314) int local314;
		if (Static213.anInt3480 == 1) {
			Static522.aClass328Array1 = Static566.method7474();
			Static566.aClass328_1.method7477(new Class137(Static336.aClass332_68));
			Static566.aClass328_3.method7477(new Class64("jaggl"));
			Static566.aClass328_4.method7477(new Class64("jagdx"));
			Static566.aClass328_5.method7477(new Class64("jagmisc"));
			Static566.aClass328_6.method7477(new Class64("sw3d"));
			Static566.aClass328_7.method7477(new Class64("hw3d"));
			Static566.aClass328_8.method7477(new Class64("jagtheora"));
			Static566.aClass328_9.method7477(new Class137(Static124.aClass332_20));
			Static566.aClass328_10.method7477(new Class137(Static199.aClass332_42));
			Static566.aClass328_11.method7477(new Class137(Static6.aClass332_1));
			Static566.aClass328_12.method7477(new Class137(Static459.aClass332_91));
			Static566.aClass328_13.method7477(new Class137(Static20.aClass332_3));
			Static566.aClass328_14.method7477(new Class137(Static333.aClass332_66));
			Static566.aClass328_15.method7477(new Class137(Static380.aClass332_79));
			Static566.aClass328_16.method7477(new Class137(Static668.aClass332_119));
			Static566.aClass328_17.method7477(new Class137(Static271.aClass332_59));
			Static566.aClass328_18.method7477(new Class137(Static233.aClass332_52));
			Static566.aClass328_19.method7477(new Class137(Static58.aClass332_12));
			Static566.aClass328_20.method7477(new Class137(Static244.aClass332_55));
			Static566.aClass328_21.method7477(new Class137(Static88.aClass332_14));
			Static566.aClass328_22.method7477(new Class137(Static140.aClass332_24));
			Static566.aClass328_23.method7477(new Class290(Static463.aClass332_93, "huffman"));
			Static566.aClass328_24.method7477(new Class137(Static554.aClass332_105));
			Static566.aClass328_25.method7477(new Class137(Static31.aClass332_6));
			Static566.aClass328_26.method7477(new Class137(Static697.aClass332_123));
			Static566.aClass328_27.method7477(new Class115(Static120.aClass332_19, "details"));
			for (local270 = 0; local270 < Static522.aClass328Array1.length; local270++) {
				if (Static522.aClass328Array1[local270].method7476() == null) {
					throw new RuntimeException();
				}
			}
			local292 = 0;
			@Pc(294) Class328[] local294 = Static522.aClass328Array1;
			for (@Pc(296) int local296 = 0; local296 < local294.length; local296++) {
				@Pc(304) Class328 local304 = local294[local296];
				local308 = local304.method7478();
				local314 = local304.method7476().method6472();
				local292 += local314 * local308 / 100;
			}
			Static392.anInt6164 = local292;
			Static213.anInt3480 = 2;
		}
		if (Static522.aClass328Array1 == null) {
			return 100;
		}
		local270 = 0;
		local292 = 0;
		@Pc(348) boolean local348 = true;
		@Pc(350) Class328[] local350 = Static522.aClass328Array1;
		for (@Pc(352) int local352 = 0; local352 < local350.length; local352++) {
			@Pc(358) Class328 local358 = local350[local352];
			local314 = local358.method7478();
			@Pc(370) int local370 = local358.method7476().method6472();
			local292 += local314 * local370 / 100;
			if (local370 < 100) {
				local348 = false;
			}
			local270 += local314;
		}
		if (local348) {
			if (!((Class64) Static566.aClass328_5.method7476()).method1554()) {
				Static295.aClient1.method1634();
			}
			if (!((Class64) Static566.aClass328_8.method7476()).method1554()) {
				Static234.aBoolean303 = Static295.aClient1.method1651();
			}
			Static522.aClass328Array1 = null;
		}
		local292 -= Static392.anInt6164;
		local270 -= Static392.anInt6164;
		local308 = local270 > 0 ? local292 * 100 / local270 : 100;
		if (!local348 && local308 > 99) {
			local308 = 99;
		}
		return local308;
	}
}
