import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!lka", name = "h", descriptor = "Ljava/lang/Class;")
	private static Class aClass14;

	// $FF: synthetic field
	@OriginalMember(owner = "client!lka", name = "i", descriptor = "Ljava/lang/Class;")
	private static Class aClass15;

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(B)I")
	public static int method5276() {
		@Pc(5) int local5 = 0;
		@Pc(26) Field[] local26 = (aClass14 == null ? (aClass14 = Class233.a("kv")) : aClass14).getDeclaredFields();
		for (@Pc(30) int local30 = 0; local30 < local26.length; local30++) {
			@Pc(35) Field local35 = local26[local30];
			if ((aClass15 == null ? (aClass15 = Class233.a("ta")) : aClass15).isAssignableFrom(local35.getType())) {
				local5++;
			}
		}
		return local5 + 1;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(I[BIIIB)V")
	public static void method5277(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		arg2 += arg0;
		@Pc(25) int local25 = arg3 - arg0 >> 2;
		while (true) {
			local25--;
			if (local25 < 0) {
				local25 = arg3 - arg0 & 0x3;
				while (true) {
					local25--;
					if (local25 < 0) {
						return;
					}
					arg1[arg2++] = 1;
				}
			}
			@Pc(33) int local33 = arg2 + 1;
			arg1[arg2] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg1[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg1[local38] = 1;
			arg2 = local43 + 1;
			arg1[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(ILclient!sia;ILclient!ha;I)V")
	public static void method5279(@OriginalArg(1) Class341 arg0, @OriginalArg(3) Class19 arg1) {
		Static551.aClass341_54.method7707();
		if (Static178.aBoolean251) {
			return;
		}
		for (@Pc(27) Class2_Sub20 local27 = (Class2_Sub20) arg0.method7706(65280); local27 != null; local27 = (Class2_Sub20) arg0.method7713()) {
			@Pc(35) Class105 local35 = Static30.aClass248_3.method5591(local27.anInt3140);
			if (Static408.method5641(local35)) {
				@Pc(47) boolean local47 = Static351.method5145(arg1, local35, local27);
				if (local47) {
					Static603.method7909(local27, arg1, local35);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "(B)V")
	public static void method5280() {
		Static33.anInt782 = 0;
		Static409.aClass104Array1 = new Class104[50];
	}
}
