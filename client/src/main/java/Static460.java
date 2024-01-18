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
	public static final LinkedList aClass341_40 = new LinkedList();

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)I")
	public static int method6273() {
		if (Static213.anInt3480 == 0) {
			Static566.aClass328_2.method7477(new Class64("jaclib"));
			if (Static566.aClass328_2.method7476().method6472() != 100) {
				return 1;
			}
			if (!((Class64) Static566.aClass328_2.method7476()).method1554()) {
				client.instance.method1644();
			}
			Static213.anInt3480 = 1;
		}
		@Pc(270) int local270;
		@Pc(292) int local292;
		@Pc(308) int local308;
		@Pc(314) int local314;
		if (Static213.anInt3480 == 1) {
			Static522.aClass328Array1 = Static566.method7474();
			Static566.aClass328_1.method7477(new Class137(client.js5Archive28));
			Static566.aClass328_3.method7477(new Class64("jaggl"));
			Static566.aClass328_4.method7477(new Class64("jagdx"));
			Static566.aClass328_5.method7477(new Class64("jagmisc"));
			Static566.aClass328_6.method7477(new Class64("sw3d"));
			Static566.aClass328_7.method7477(new Class64("hw3d"));
			Static566.aClass328_8.method7477(new Class64("jagtheora"));
			Static566.aClass328_9.method7477(new Class137(client.js5Archive31));
			Static566.aClass328_10.method7477(new Class137(client.js5Archive26));
			Static566.aClass328_11.method7477(new Class137(client.js5Archive2));
			Static566.aClass328_12.method7477(new Class137(client.js5Archive16));
			Static566.aClass328_13.method7477(new Class137(client.js5Archive17));
			Static566.aClass328_14.method7477(new Class137(client.js5Archive18));
			Static566.aClass328_15.method7477(new Class137(client.js5Archive19));
			Static566.aClass328_16.method7477(new Class137(client.js5Archive20));
			Static566.aClass328_17.method7477(new Class137(client.js5Archive21));
			Static566.aClass328_18.method7477(new Class137(client.js5Archive22));
			Static566.aClass328_19.method7477(new Class137(client.js5Archive24));
			Static566.aClass328_20.method7477(new Class137(client.js5Archive25));
			Static566.aClass328_21.method7477(new Class137(client.js5Archive27));
			Static566.aClass328_22.method7477(new Class137(client.js5Archive29));
			Static566.aClass328_23.method7477(new Class290(client.js5Archive10, "huffman"));
			Static566.aClass328_24.method7477(new Class137(client.js5Archive3));
			Static566.aClass328_25.method7477(new Class137(client.js5Archive12));
			Static566.aClass328_26.method7477(new Class137(Static697.aClass332_123));
			Static566.aClass328_27.method7477(new Class115(client.js5Archive23, "details"));
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
				client.instance.method1634();
			}
			if (!((Class64) Static566.aClass328_8.method7476()).method1554()) {
				Static234.aBoolean303 = client.instance.method1651();
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
