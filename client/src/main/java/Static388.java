import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	public static void method5461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static74.aClass19_4 == null) {
			return;
		}
		@Pc(9) int local9 = Static211.anInt5594;
		@Pc(16) int local16 = Static617.anInt9460;
		Static186.method2821(arg0, arg1);
		if (Static448.anInt6817 == 0) {
			Static450.anInterface9_1 = null;
			Static450.anInterface9_1 = Static74.aClass19_4.method7995(Static74.aClass19_4.method7969(Static571.anInt8558, Static576.anInt8609), Static74.aClass19_4.method7993(Static571.anInt8558, Static576.anInt8609));
		} else if (Static448.anInt6817 == 1 && (Static651.anInterface9Array1 == null || local9 != Static211.anInt5594 || local16 != Static617.anInt9460)) {
			Static651.anInterface9Array1 = new Interface9[Static211.anInt5594 * Static617.anInt9460];
			for (@Pc(74) int local74 = 0; local74 < Static651.anInterface9Array1.length; local74++) {
				Static651.anInterface9Array1[local74] = Static74.aClass19_4.method7995(Static74.aClass19_4.method7969(Static437.anInt6648, Static714.anInt10831), Static74.aClass19_4.method7993(Static437.anInt6648, Static714.anInt10831));
			}
			Static420.anInt6456 = 1;
			Static173.anIntArray252 = new int[Static211.anInt5594 * Static617.anInt9460];
		}
		Static75.aBoolean521 = true;
	}
}
