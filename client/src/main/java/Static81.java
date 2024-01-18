import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!cka", name = "x", descriptor = "[Lclient!hv;")
	public static Class8_Sub5[] aClass8_Sub5Array1;

	@OriginalMember(owner = "client!cka", name = "q", descriptor = "I")
	public static int anInt1651;

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IB)V")
	public static void method1586(@OriginalArg(0) int arg0) {
		if (Static283.anInt4588 == arg0) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static670.method8742();
		}
		if (arg0 != 14 && Static467.aClass350_2 != null) {
			Static467.aClass350_2.method7933();
			Static467.aClass350_2 = null;
		}
		if (arg0 == 3) {
			Static456.method6235(Static65.aClass3_1.anInt88 != Static377.anInt5950);
		}
		if (arg0 == 7) {
			Static25.method688(Static65.aClass3_1.anInt82 != Static377.anInt5950);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static369.method3852();
		} else if (arg0 == 6 || arg0 == 9 && Static283.anInt4588 != 10) {
			Static670.method8742();
		}
		if (Static594.method7789(Static283.anInt4588)) {
			Static6.aClass332_1.anInt8579 = 2;
			Static20.aClass332_3.anInt8579 = 2;
			Static459.aClass332_91.anInt8579 = 2;
			Static333.aClass332_66.anInt8579 = 2;
			Static380.aClass332_79.anInt8579 = 2;
			Static668.aClass332_119.anInt8579 = 2;
			Static271.aClass332_59.anInt8579 = 2;
		}
		if (Static594.method7789(arg0)) {
			Static593.anInt8787 = 0;
			Static357.anInt6528 = 1;
			Static440.anInt6703 = 1;
			Static213.anInt3482 = 0;
			Static13.anInt150 = 0;
			Static668.method8707(true);
			Static6.aClass332_1.anInt8579 = 1;
			Static20.aClass332_3.anInt8579 = 1;
			Static459.aClass332_91.anInt8579 = 1;
			Static333.aClass332_66.anInt8579 = 1;
			Static380.aClass332_79.anInt8579 = 1;
			Static668.aClass332_119.anInt8579 = 1;
			Static271.aClass332_59.anInt8579 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static314.method4569();
		}
		@Pc(213) boolean local213 = arg0 == 2 || Static41.method1027(arg0) || Static620.method8328(arg0);
		@Pc(235) boolean local235 = Static283.anInt4588 == 2 || Static41.method1027(Static283.anInt4588) || Static620.method8328(Static283.anInt4588);
		if (local235 != local213) {
			if (local213) {
				Static588.anInt8716 = Static597.anInt8845;
				if (Static400.aClass2_Sub34_28.aClass57_Sub25_5.method7215() == 0) {
					Static312.method4548();
				} else {
					Static57.method1225(Static597.anInt8845, Static400.aClass2_Sub34_28.aClass57_Sub25_5.method7215(), Static398.aClass332_81);
					Static550.method7273();
				}
				client.js5NetQueue.method6633(false);
			} else {
				Static312.method4548();
				client.js5NetQueue.method6633(true);
			}
		}
		if (Static594.method7789(arg0) || arg0 == 14 || arg0 == 15) {
			Static163.aClass19_17.method7976();
		}
		Static283.anInt4588 = arg0;
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Lclient!aj;")
	public static Class2_Sub2_Sub2 method1587() {
		@Pc(17) Class2_Sub2_Sub2 local17 = (Class2_Sub2_Sub2) Static138.aClass194_6.method4359();
		if (local17 != null) {
			local17.unlink();
			local17.method9267();
			return local17;
		}
		do {
			local17 = (Class2_Sub2_Sub2) Static59.aClass194_9.method4359();
			if (local17 == null) {
				return null;
			}
			if (local17.method201() > Static588.currentTimeMillis()) {
				return null;
			}
			local17.unlink();
			local17.method9267();
		} while ((local17.aLong325 & Long.MIN_VALUE) == 0L);
		return local17;
	}

	@OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V")
	public static void method1589() {
		Static345.method5056();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ZI)V")
	public static void method1591(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class2_Sub19 local8 = Static273.method3962();
		local8.aClass2_Sub21_Sub2_1.p1(LoginProt.OPCODE_22.opcode);
		local8.aClass2_Sub21_Sub2_1.p2(0);
		@Pc(25) int local25 = local8.aClass2_Sub21_Sub2_1.pos;
		local8.aClass2_Sub21_Sub2_1.p2(667);
		@Pc(38) int[] local38 = Static664.method8659(local8);
		@Pc(42) int local42 = local8.aClass2_Sub21_Sub2_1.pos;
		local8.aClass2_Sub21_Sub2_1.pjstr(arg0);
		local8.aClass2_Sub21_Sub2_1.p2(Static323.affid);
		local8.aClass2_Sub21_Sub2_1.pjstr(arg2);
		local8.aClass2_Sub21_Sub2_1.p8(Static416.userFlow);
		local8.aClass2_Sub21_Sub2_1.p1(client.lang);
		local8.aClass2_Sub21_Sub2_1.p1(Static392.game.id);
		Static176.method6697(local8.aClass2_Sub21_Sub2_1);
		@Pc(81) String local81 = Static389.additionalInfo;
		local8.aClass2_Sub21_Sub2_1.p1(local81 == null ? 0 : 1);
		if (local81 != null) {
			local8.aClass2_Sub21_Sub2_1.pjstr(local81);
		}
		local8.aClass2_Sub21_Sub2_1.p1(arg1);
		local8.aClass2_Sub21_Sub2_1.p1(arg3 ? 1 : 0);
		local8.aClass2_Sub21_Sub2_1.pos += 7;
		local8.aClass2_Sub21_Sub2_1.method7373(local38, local42, local8.aClass2_Sub21_Sub2_1.pos);
		local8.aClass2_Sub21_Sub2_1.psize2(local8.aClass2_Sub21_Sub2_1.pos - local25);
		Static405.aClass153_1.method3275(local8);
		Static720.anInt10894 = 0;
		Static580.anInt8645 = -3;
		Static654.anInt9765 = 0;
		Static6.anInt95 = 1;
		if (arg1 < 13) {
			Static477.under = true;
			Static358.method9197();
		}
	}
}
