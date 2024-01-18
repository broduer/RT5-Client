import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
	public static int anInt7364;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "[Lclient!pa;")
	public static final Class285[] aClass285Array1 = new Class285[100];

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!vq;IIII)Ljava/awt/Frame;")
	public static Frame method6550(@OriginalArg(0) int arg0, @OriginalArg(1) signlink arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1.method8997()) {
			return null;
		}
		@Pc(18) Class275[] local18 = Static673.method8794(arg1, true);
		if (local18 == null) {
			return null;
		}
		@Pc(25) boolean local25 = false;
		for (@Pc(27) int local27 = 0; local27 < local18.length; local27++) {
			if (local18[local27].anInt6939 == arg3 && local18[local27].anInt6933 == arg2 && (!local25 || local18[local27].anInt6934 > arg0)) {
				local25 = true;
				arg0 = local18[local27].anInt6934;
			}
		}
		if (!local25) {
			return null;
		}
		@Pc(101) PrivilegedRequest local101 = arg1.method8984(arg0, arg2, arg3);
		while (local101.status == 0) {
			ThreadUtils.sleep(10L);
		}
		@Pc(112) Frame local112 = (Frame) local101.result;
		if (local112 == null) {
			return null;
		} else if (local101.status == 2) {
			Static655.method8569(arg1, local112);
			return null;
		} else {
			return local112;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZBLclient!cg;)V")
	public static void method6554(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class8_Sub2_Sub1_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(16) int local16 = 0;
		if (arg1.anInt10788 > client.cycle) {
			Static441.method5974(arg1);
		} else if (client.cycle > arg1.anInt10784) {
			Static256.method3638(arg1, arg0);
			local7 = Static521.anInt7779;
			local16 = Static524.anInt8065;
		} else {
			Static354.method5188(arg1);
		}
		@Pc(107) int local107;
		if (arg1.anInt10718 < 512 || arg1.anInt10722 < 512 || Static720.anInt10888 * 512 - 512 <= arg1.anInt10718 || arg1.anInt10722 >= Static501.anInt7591 * 512 - 512) {
			arg1.aClass152_11.method9120(true, -1);
			for (local107 = 0; local107 < arg1.aClass201Array3.length; local107++) {
				arg1.aClass201Array3[local107].anInt4947 = -1;
				arg1.aClass201Array3[local107].aClass152_7.method9120(true, -1);
			}
			arg1.anInt10788 = 0;
			local7 = -1;
			arg1.anInt10784 = 0;
			arg1.anIntArray869 = null;
			local16 = 0;
			arg1.anInt10718 = arg1.anIntArray879[0] * 512 + arg1.method9309((byte) 97) * 256;
			arg1.anInt10722 = arg1.anIntArray878[0] * 512 + arg1.method9309((byte) 113) * 256;
			arg1.method9323();
		}
		if (arg1 == Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 && (arg1.anInt10718 < 6144 || arg1.anInt10722 < 6144 || arg1.anInt10718 >= Static720.anInt10888 * 512 - 6144 || Static501.anInt7591 * 512 - 6144 <= arg1.anInt10722)) {
			arg1.aClass152_11.method9120(true, -1);
			for (local107 = 0; local107 < arg1.aClass201Array3.length; local107++) {
				arg1.aClass201Array3[local107].anInt4947 = -1;
				arg1.aClass201Array3[local107].aClass152_7.method9120(true, -1);
			}
			arg1.anInt10788 = 0;
			arg1.anInt10784 = 0;
			arg1.anIntArray869 = null;
			local16 = 0;
			local7 = -1;
			arg1.anInt10718 = arg1.anIntArray879[0] * 512 + arg1.method9309((byte) 69) * 256;
			arg1.anInt10722 = arg1.anIntArray878[0] * 512 + arg1.method9309((byte) 49) * 256;
			arg1.method9323();
		}
		local107 = Static112.method2104(arg1);
		Static145.method2410(arg1);
		Static651.method8520(local7, local107, local16, arg1);
		Static702.method9173(arg1, local7);
		Static50.method6645(arg1);
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
	public static void method6555() {
		Static314.method4575(false);
		Static593.anInt8787 = 0;
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < Static319.aByteArrayArray16.length; local12++) {
			if (Static267.mapGroupIds[local12] != -1 && Static319.aByteArrayArray16[local12] == null) {
				Static319.aByteArrayArray16[local12] = client.js5Archive5.method7602(0, Static267.mapGroupIds[local12]);
				if (Static319.aByteArrayArray16[local12] == null) {
					Static593.anInt8787++;
					local10 = false;
				}
			}
			if (Static266.locGroupIds[local12] != -1 && Static118.aByteArrayArray3[local12] == null) {
				Static118.aByteArrayArray3[local12] = client.js5Archive5.method7590(Static22.anIntArrayArray11[local12], 0, Static266.locGroupIds[local12]);
				if (Static118.aByteArrayArray3[local12] == null) {
					local10 = false;
					Static593.anInt8787++;
				}
			}
			if (Static68.underwaterMapGroupIds[local12] != -1 && Static177.aByteArrayArray5[local12] == null) {
				Static177.aByteArrayArray5[local12] = client.js5Archive5.method7602(0, Static68.underwaterMapGroupIds[local12]);
				if (Static177.aByteArrayArray5[local12] == null) {
					Static593.anInt8787++;
					local10 = false;
				}
			}
			if (Static298.underwaterLocGroupIds[local12] != -1 && Static421.aByteArrayArray19[local12] == null) {
				Static421.aByteArrayArray19[local12] = client.js5Archive5.method7602(0, Static298.underwaterLocGroupIds[local12]);
				if (Static421.aByteArrayArray19[local12] == null) {
					Static593.anInt8787++;
					local10 = false;
				}
			}
			if (Static376.anIntArray458 != null && Static363.aByteArrayArray22[local12] == null && Static376.anIntArray458[local12] != -1) {
				Static363.aByteArrayArray22[local12] = client.js5Archive5.method7590(Static22.anIntArrayArray11[local12], 0, Static376.anIntArray458[local12]);
				if (Static363.aByteArrayArray22[local12] == null) {
					Static593.anInt8787++;
					local10 = false;
				}
			}
		}
		if (Static42.aClass257_2 == null) {
			if (Static162.aClass2_Sub2_Sub13_2 == null || !Static120.aClass332_19.method7594(Static162.aClass2_Sub2_Sub13_2.aString48 + "_staticelements")) {
				Static42.aClass257_2 = new Class257(0);
			} else if (Static120.aClass332_19.method7605(Static162.aClass2_Sub2_Sub13_2.aString48 + "_staticelements")) {
				Static42.aClass257_2 = Static284.method4103(Static174.aBoolean249, Static120.aClass332_19, Static162.aClass2_Sub2_Sub13_2.aString48 + "_staticelements");
			} else {
				local10 = false;
				Static593.anInt8787++;
			}
		}
		if (!local10) {
			Static213.anInt3482 = 1;
			return;
		}
		local10 = true;
		Static13.anInt150 = 0;
		@Pc(310) int local310;
		for (@Pc(282) int local282 = 0; local282 < Static319.aByteArrayArray16.length; local282++) {
			@Pc(287) byte[] local287 = Static118.aByteArrayArray3[local282];
			@Pc(299) int local299;
			if (local287 != null) {
				local299 = (Static89.anIntArray169[local282] >> 8) * 64 - Static691.anInt10395;
				local310 = (Static89.anIntArray169[local282] & 0xFF) * 64 - Static116.anInt2279;
				if (Static117.anInt2291 != 0) {
					local299 = 10;
					local310 = 10;
				}
				local10 &= Static213.method3141(local287, local299, Static720.anInt10888, local310, Static501.anInt7591);
			}
			local287 = Static421.aByteArrayArray19[local282];
			if (local287 != null) {
				local299 = (Static89.anIntArray169[local282] >> 8) * 64 - Static691.anInt10395;
				local310 = (Static89.anIntArray169[local282] & 0xFF) * 64 - Static116.anInt2279;
				if (Static117.anInt2291 != 0) {
					local310 = 10;
					local299 = 10;
				}
				local10 &= Static213.method3141(local287, local299, Static720.anInt10888, local310, Static501.anInt7591);
			}
		}
		if (!local10) {
			Static213.anInt3482 = 2;
			return;
		}
		if (Static213.anInt3482 != 0) {
			Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_12.method877(client.lang) + "<br>(100%)", true, Static694.aClass383_13, Static437.aClass14_9);
		}
		Static557.method7338();
		Static352.method5187();
		Static46.method1084();
		@Pc(430) boolean local430 = false;
		if (Static163.aClass19_17.method7997() && Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7470() == 2) {
			for (local310 = 0; local310 < Static319.aByteArrayArray16.length; local310++) {
				if (Static421.aByteArrayArray19[local310] != null || Static177.aByteArrayArray5[local310] != null) {
					local430 = true;
					break;
				}
			}
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub16_1.method5514() == 1) {
			local310 = Static571.anIntArray682[Static537.anInt8193];
		} else {
			local310 = Static506.anIntArray728[Static537.anInt8193];
		}
		if (Static163.aClass19_17.method7975()) {
			local310++;
		}
		Static21.method8050(Static163.aClass19_17, Static455.anInt6936, Static720.anInt10888, Static501.anInt7591, local310, local430, Static163.aClass19_17.method7962() > 0);
		Static483.method6497(Static699.anInt10567);
		if (Static699.anInt10567 == 0) {
			Static110.method2082(null);
		} else {
			Static110.method2082(Static665.aClass14_12);
		}
		for (@Pc(519) int local519 = 0; local519 < 4; local519++) {
			Static577.aClass110Array1[local519].method2467();
		}
		Static305.method4448();
		Static609.method8220(false);
		Static508.method6757();
		Static112.aBoolean197 = false;
		Static557.method7338();
		System.gc();
		Static314.method4575(true);
		Static699.method9146();
		Static439.anInt6694 = Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371();
		Static428.aBoolean487 = GameShell.maxMemory >= 96;
		Static50.aBoolean566 = Static400.aClass2_Sub34_28.aClass57_Sub26_1.method7470() == 2;
		Static305.aBoolean371 = Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7089() == 1;
		Static478.anInt7219 = Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() == 1 ? -1 : Static164.anInt2817;
		Static718.aBoolean823 = Static400.aClass2_Sub34_28.aClass57_Sub23_1.method7061() == 1;
		Static196.aBoolean262 = Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8363() == 1;
		Static2.aClass308_Sub1_1 = new Class308_Sub1(4, Static720.anInt10888, Static501.anInt7591, false);
		if (Static117.anInt2291 == 0) {
			Static73.method9319(Static319.aByteArrayArray16, Static2.aClass308_Sub1_1);
		} else {
			Static693.method9017(Static319.aByteArrayArray16, Static2.aClass308_Sub1_1);
		}
		Static92.method1757(Static720.anInt10888 >> 4, Static501.anInt7591 >> 4);
		Static159.method2575();
		if (local430) {
			Static379.method5362(true);
			Static134.aClass308_Sub1_3 = new Class308_Sub1(1, Static720.anInt10888, Static501.anInt7591, true);
			if (Static117.anInt2291 == 0) {
				Static73.method9319(Static177.aByteArrayArray5, Static134.aClass308_Sub1_3);
				Static314.method4575(true);
			} else {
				Static693.method9017(Static177.aByteArrayArray5, Static134.aClass308_Sub1_3);
				Static314.method4575(true);
			}
			Static134.aClass308_Sub1_3.method7892(Static2.aClass308_Sub1_1.anIntArrayArrayArray17[0]);
			Static134.aClass308_Sub1_3.method7888(null, Static163.aClass19_17, null);
			Static379.method5362(false);
		}
		Static2.aClass308_Sub1_1.method7888(local430 ? Static134.aClass308_Sub1_3.anIntArrayArrayArray17 : null, Static163.aClass19_17, Static577.aClass110Array1);
		if (Static117.anInt2291 == 0) {
			Static314.method4575(true);
			Static338.method5001(Static118.aByteArrayArray3, Static2.aClass308_Sub1_1);
			if (Static363.aByteArrayArray22 != null) {
				Static369.method3847();
			}
		} else {
			Static314.method4575(true);
			Static101.method2001(Static118.aByteArrayArray3, Static2.aClass308_Sub1_1);
		}
		Static352.method5187();
		if (GameShell.maxMemory < 96) {
			Static358.method9198();
		}
		Static314.method4575(true);
		Static2.aClass308_Sub1_1.method7895(Static163.aClass19_17, local430 ? Static693.aClass178Array2[0] : null, null);
		Static2.aClass308_Sub1_1.method7905(false, Static163.aClass19_17);
		Static314.method4575(true);
		if (local430) {
			Static379.method5362(true);
			Static314.method4575(true);
			if (Static117.anInt2291 == 0) {
				Static338.method5001(Static421.aByteArrayArray19, Static134.aClass308_Sub1_3);
			} else {
				Static101.method2001(Static421.aByteArrayArray19, Static134.aClass308_Sub1_3);
			}
			Static352.method5187();
			Static314.method4575(true);
			Static134.aClass308_Sub1_3.method7895(Static163.aClass19_17, null, Static706.aClass178Array3[0]);
			Static134.aClass308_Sub1_3.method7905(true, Static163.aClass19_17);
			Static314.method4575(true);
			Static379.method5362(false);
		}
		Static207.method4439();
		@Pc(825) int local825 = Static2.aClass308_Sub1_1.anInt8943;
		if (local825 > Static394.anInt6196) {
			local825 = Static394.anInt6196;
		}
		if (Static394.anInt6196 - 1 > local825) {
			local825 = Static394.anInt6196 - 1;
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub19_2.method5967() == 0) {
			Static3.method87(local825);
		} else {
			Static3.method87(0);
		}
		@Pc(855) int local855;
		@Pc(858) int local858;
		for (@Pc(852) int local852 = 0; local852 < 4; local852++) {
			for (local855 = 0; local855 < Static720.anInt10888; local855++) {
				for (local858 = 0; local858 < Static501.anInt7591; local858++) {
					Static468.method7648(local852, local858, local855);
				}
			}
		}
		Static77.method1561();
		Static557.method7338();
		Static197.method2949();
		Static352.method5187();
		Static442.method5976();
		@Pc(920) Class2_Sub19 local920;
		if (GameShell.frame != null && Static405.aClass153_2.aClass350_1 != null && Static283.anInt4588 == 12) {
			local920 = Static293.method4342(Static694.aClass347_122, Static405.aClass153_2.aClass186_1);
			local920.aClass2_Sub21_Sub2_1.method7349(1057001181);
			Static405.aClass153_2.method3275(local920);
		}
		if (Static117.anInt2291 == 0) {
			local855 = (Static62.anInt1472 - (Static720.anInt10888 >> 4)) / 8;
			local858 = (Static62.anInt1472 + (Static720.anInt10888 >> 4)) / 8;
			@Pc(961) int local961 = (Static525.anInt8931 - (Static501.anInt7591 >> 4)) / 8;
			@Pc(969) int local969 = ((Static501.anInt7591 >> 4) + Static525.anInt8931) / 8;
			for (@Pc(973) int local973 = local855 - 1; local973 <= local858 + 1; local973++) {
				for (@Pc(978) int local978 = local961 - 1; local978 <= local969 + 1; local978++) {
					if (local973 < local855 || local973 > local858 || local978 < local961 || local969 < local978) {
						client.js5Archive5.method7609("m" + local973 + "_" + local978);
						client.js5Archive5.method7609("l" + local973 + "_" + local978);
					}
				}
			}
		}
		if (Static283.anInt4588 == 4) {
			Static81.method1586(3);
		} else if (Static283.anInt4588 == 8) {
			Static81.method1586(7);
		} else if (Static283.anInt4588 == 10) {
			Static81.method1586(9);
		} else {
			Static81.method1586(11);
			if (Static405.aClass153_2.aClass350_1 != null) {
				local920 = Static293.method4342(Static161.aClass347_29, Static405.aClass153_2.aClass186_1);
				Static405.aClass153_2.method3275(local920);
			}
		}
		Static606.method7941();
		Static557.method7338();
		Static199.method2977();
		Static75.aBoolean521 = true;
		if (Static28.aBoolean43) {
			Static79.method1579("Took: " + (Static588.currentTimeMillis() - Static690.aLong318) + "ms");
			Static28.aBoolean43 = false;
		}
	}
}
