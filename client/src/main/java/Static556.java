import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "Lclient!ca;")
	public static Class8_Sub2_Sub1_Sub2_Sub1 aClass8_Sub2_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "Lclient!uc;")
	public static Class369 aClass369_2;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLclient!hda;)Lclient!hda;")
	public static Class158 method7306(@OriginalArg(1) Class158 arg0) {
		if (arg0.anInt3753 != -1) {
			return Static145.method2412(arg0.anInt3753);
		}
		@Pc(25) int local25 = arg0.anInt3823 >>> 16;
		@Pc(30) Class333 local30 = new Class333(Static548.aClass28_40);
		for (@Pc(35) Class2_Sub4 local35 = (Class2_Sub4) local30.method7620(); local35 != null; local35 = (Class2_Sub4) local30.method7617()) {
			if (local35.anInt147 == local25) {
				return Static145.method2412((int) local35.aLong328);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)V")
	public static void method7307(@OriginalArg(0) int arg0) {
		Static682.anIntArray817 = new int[arg0];
		Static153.anIntArray235 = new int[arg0];
		Static9.anIntArray18 = new int[arg0];
		Static482.anIntArray588 = new int[arg0];
		Static457.anIntArray552 = new int[arg0];
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method7308(@OriginalArg(0) Class19 arg0) {
		if (Static594.anInt8801 < 2 && !Static156.aBoolean223 || Static109.aClass158_3 != null) {
			return;
		}
		@Pc(63) String local63;
		if (Static156.aBoolean223 && Static594.anInt8801 < 2) {
			local63 = Static153.aString27 + Static32.aClass32_32.method877(Static51.anInt1056) + Static128.aString108 + " ->";
		} else if (Static209.aBoolean269 && Static334.aClass321_1.method8486(81) && Static594.anInt8801 > 2) {
			local63 = Static518.method9300(Static470.aClass2_Sub2_Sub16_10);
		} else {
			@Pc(55) Class2_Sub2_Sub16 local55 = Static470.aClass2_Sub2_Sub16_10;
			if (local55 == null) {
				return;
			}
			local63 = Static518.method9300(local55);
			@Pc(65) int[] local65 = null;
			if (Static245.method8642(local55.anInt7335)) {
				local65 = Static419.aClass112_1.method2486((int) local55.aLong233).anIntArray800;
			} else if (local55.anInt7338 != -1) {
				local65 = Static419.aClass112_1.method2486(local55.anInt7338).anIntArray800;
			} else if (Static598.method7832(local55.anInt7335)) {
				@Pc(93) Class2_Sub45 local93 = (Class2_Sub45) Static18.aClass28_2.method738((int) local55.aLong233);
				if (local93 != null) {
					@Pc(98) Class8_Sub2_Sub1_Sub2_Sub2 local98 = local93.aClass8_Sub2_Sub1_Sub2_Sub2_2;
					@Pc(101) Class270 local101 = local98.aClass270_1;
					if (local101.anIntArray532 != null) {
						local101 = local101.method5992(65535, Static34.aClass306_1);
					}
					if (local101 != null) {
						local65 = local101.anIntArray533;
					}
				}
			} else if (Static523.method3444(local55.anInt7335)) {
				@Pc(131) Class54 local131 = Static354.aClass142_4.method3063((int) (local55.aLong233 >>> 32 & 0x7FFFFFFFL), 68);
				if (local131.anIntArray113 != null) {
					local131 = local131.method1301(13, Static34.aClass306_1);
				}
				if (local131 != null) {
					local65 = local131.anIntArray112;
				}
			}
			if (local65 != null) {
				local63 = local63 + Static72.method1527(local65);
			}
		}
		if (Static594.anInt8801 > 2) {
			local63 = local63 + "<col=ffffff> / " + (Static594.anInt8801 - 2) + Static32.aClass32_25.method877(Static51.anInt1056);
		}
		if (Static605.aClass158_15 != null) {
			@Pc(232) Class14 local232 = Static605.aClass158_15.method3403(arg0);
			if (local232 == null) {
				local232 = Static180.aClass14_3;
			}
			local232.method8843(Static329.anIntArray163, Static605.aClass158_15.anInt3829, Static605.aClass158_15.anInt3813, Static460.anIntArray554, Static605.aClass158_15.anInt3789, Static605.aClass158_15.anInt3756, Static493.aRandom1, local63, Static366.anInt5872, Static605.aClass158_15.anInt3809, Static186.aClass23Array5, Static178.anInt2956, Static157.anInt2786, Static605.aClass158_15.anInt3825);
			Static585.method7677(Static329.anIntArray163[2], Static329.anIntArray163[0], Static329.anIntArray163[3], Static329.anIntArray163[1]);
		} else if (Static71.aClass158_2 != null && Static392.aClass379_4 == Static673.aClass379_8) {
			@Pc(299) int local299 = Static180.aClass14_3.method8823(Static186.aClass23Array5, Static178.anInt2956, Static192.anInt3132 + 16, local63, Static460.anIntArray554, Static493.aRandom1, Static725.anInt10965 + 4);
			Static585.method7677(local299 + Static42.aClass383_4.method8751(local63), Static725.anInt10965 - -4, 16, Static192.anInt3132);
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)I")
	public static int method7309() {
		return Static449.aClass366_1.method8386();
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBZ)Lclient!gfa;")
	public static Class2_Sub22 method7310(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) long local19 = arg0 | (arg1 ? Integer.MIN_VALUE : 0);
		return (Class2_Sub22) Static286.aClass28_23.method738(local19);
	}
}
