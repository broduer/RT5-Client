import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[5];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[200];

	@OriginalMember(owner = "client!s", name = "o", descriptor = "I")
	public static int anInt8920 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)I")
	public static int method7874(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = 255 - arg2;
		@Pc(33) int local33 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
		return local33 + ((local15 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local15 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(III)V")
	public static void method7883(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static42.aClass383_4.method8751(Static32.aClass32_24.method877(client.lang));
		@Pc(68) int local68;
		@Pc(27) int local27;
		if (Static236.aBoolean304) {
			for (@Pc(18) Class2_Sub2_Sub4 local18 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4359(); local18 != null; local18 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4357()) {
				if (local18.anInt1541 == 1) {
					local27 = Static249.method3536((Class2_Sub2_Sub16) local18.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66);
				} else {
					local27 = Static192.method2875(local18);
				}
				if (local27 > local11) {
					local11 = local27;
				}
			}
			local11 += 8;
			Static407.anInt6308 = (Static60.aBoolean87 ? 26 : 22) + Static31.anInt770 * 16;
			local68 = Static31.anInt770 * 16 + 21;
		} else {
			for (@Pc(74) Class2_Sub2_Sub16 local74 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7706(65280); local74 != null; local74 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7713()) {
				local27 = Static249.method3536(local74);
				if (local11 < local27) {
					local11 = local27;
				}
			}
			local11 += 8;
			Static407.anInt6308 = (Static60.aBoolean87 ? 26 : 22) + Static594.anInt8801 * 16;
			local68 = Static594.anInt8801 * 16 + 21;
		}
		@Pc(118) int local118 = arg1 - local11 / 2;
		if (GameShell.canvasWidth < local11 + local118) {
			local118 = GameShell.canvasWidth - local11;
		}
		if (local118 < 0) {
			local118 = 0;
		}
		@Pc(146) int local146 = arg0;
		if (arg0 + local68 > GameShell.canvasHeight) {
			local146 = GameShell.canvasHeight - local68;
		}
		if (local146 < 0) {
			local146 = 0;
		}
		Static71.anInt1583 = local118;
		Static400.aBoolean623 = true;
		Static84.anInt1783 = local146;
		Static682.anInt10323 = local11;
	}
}
