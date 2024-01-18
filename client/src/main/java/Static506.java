import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "[I")
	public static final int[] anIntArray728 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIILclient!c;I)V")
	public static void method8319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class54 arg3) {
		for (@Pc(18) Class2_Sub51 local18 = (Class2_Sub51) Static460.aClass341_40.method7706(65280); local18 != null; local18 = (Class2_Sub51) Static460.aClass341_40.method7713()) {
			if (local18.anInt9376 == arg2 && local18.anInt9383 == arg0 << 9 && local18.anInt9378 == arg1 << 9 && arg3.anInt1261 == local18.aClass54_1.anInt1261) {
				if (local18.aClass2_Sub6_Sub2_4 != null) {
					Static336.aClass2_Sub6_Sub3_1.method5890(local18.aClass2_Sub6_Sub2_4);
					local18.aClass2_Sub6_Sub2_4 = null;
				}
				if (local18.aClass2_Sub6_Sub2_3 != null) {
					Static336.aClass2_Sub6_Sub3_1.method5890(local18.aClass2_Sub6_Sub2_3);
					local18.aClass2_Sub6_Sub2_3 = null;
				}
				local18.unlink();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V")
	public static void method8320() {
		if (Static173.anInt2922 < 0) {
			return;
		}
		@Pc(18) long local18 = Static588.currentTimeMillis();
		Static173.anInt2922 = (int) ((long) Static173.anInt2922 + Static344.aLong169 - local18);
		if (Static173.anInt2922 > 0) {
			@Pc(35) int local35 = (Static173.anInt2922 << 8) / Static587.anInt8697;
			@Pc(40) int local40 = 255 - local35;
			@Pc(45) float local45 = (float) local35 / 255.0F;
			@Pc(50) float local50 = 1.0F - local45;
			Static448.anInt6822 = (local40 * (Static346.aClass369_1.anInt9563 & 0xFF00FF) + (Static386.anInt6082 & 0xFF00FF) * local35 & 0xFF00FF00) + (local35 * (Static386.anInt6082 & 0xFF00) + (local40 * (Static346.aClass369_1.anInt9563 & 0xFF00)) & 0xFF0000) >>> 8;
			Static318.aFloat210 = Static620.aFloat197 + (Static346.aClass369_1.aFloat204 - Static620.aFloat197) * local50;
			Static688.aFloat216 = local50 * (Static346.aClass369_1.aFloat205 - Static659.aFloat213) + Static659.aFloat213;
			Static171.anInt2891 = Static679.anInt10301 * local35 + Static346.aClass369_1.anInt9565 * local40 >> 8;
			Static683.aFloat215 = (Static346.aClass369_1.aFloat202 - Static671.aFloat214) * local50 + Static671.aFloat214;
			Static151.aFloat218 = Static600.aFloat179 + (Static346.aClass369_1.aFloat203 - Static600.aFloat179) * local50;
			Static251.anInt4048 = (local40 * (Static346.aClass369_1.anInt9564 & 0xFF00FF) + (Static360.anInt5840 & 0xFF00FF) * local35 & 0xFF00FF00) + (local35 * (Static360.anInt5840 & 0xFF00) + (Static346.aClass369_1.anInt9564 & 0xFF00) * local40 & 0xFF0000) >>> 8;
			Static133.aFloat63 = Static538.aFloat174 + (Static346.aClass369_1.aFloat201 - Static538.aFloat174) * local50;
			Static57.aFloat29 = local50 * (Static346.aClass369_1.aFloat200 - Static203.aFloat69) + Static203.aFloat69;
			if (Static74.aClass67_3 != Static346.aClass369_1.aClass67_10) {
				Static425.aClass67_6 = Static425.aClass19_13.method8014(Static74.aClass67_3, Static346.aClass369_1.aClass67_10, local50, Static425.aClass67_6);
			}
			if (Static346.aClass369_1.aClass148_5 != Static74.aClass148_1) {
				if (Static74.aClass148_1 == null) {
					Static456.aClass148_3 = Static346.aClass369_1.aClass148_5;
					if (Static456.aClass148_3 != null) {
						Static456.aClass148_3.method3160(0, local40);
					}
				} else {
					Static456.aClass148_3 = Static74.aClass148_1;
					if (Static456.aClass148_3 != null) {
						Static456.aClass148_3.method3160(255, local40);
					}
				}
			}
		} else {
			Static448.anInt6822 = Static346.aClass369_1.anInt9563;
			Static151.aFloat218 = Static346.aClass369_1.aFloat203;
			Static318.aFloat210 = Static346.aClass369_1.aFloat204;
			Static133.aFloat63 = Static346.aClass369_1.aFloat201;
			Static683.aFloat215 = Static346.aClass369_1.aFloat202;
			Static425.aClass67_6 = Static346.aClass369_1.aClass67_10;
			Static171.anInt2891 = Static346.aClass369_1.anInt9565;
			Static251.anInt4048 = Static346.aClass369_1.anInt9564;
			Static688.aFloat216 = Static346.aClass369_1.aFloat205;
			Static57.aFloat29 = Static346.aClass369_1.aFloat200;
			if (Static456.aClass148_3 != null) {
				Static456.aClass148_3.method3169();
			}
			Static173.anInt2922 = -1;
			Static456.aClass148_3 = Static346.aClass369_1.aClass148_5;
		}
		Static344.aLong169 = local18;
	}
}
