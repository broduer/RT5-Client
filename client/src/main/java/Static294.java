import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
	public static int anInt4782;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "D")
	public static double aDouble15;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "[B")
	public static final byte[] aByteArray49 = new byte[520];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!tca;II[B)Lclient!fr;")
	public static Class135 method4345(@OriginalArg(0) Class19_Sub1_Sub2 arg0, @OriginalArg(3) byte[] arg1) {
		if (arg1 == null) {
			return null;
		}
		@Pc(16) int local16 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local16);
		OpenGL.glProgramRawARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static564.anIntArray653, 0);
		if (Static564.anIntArray653[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class135(arg0, 34336, local16);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZIII)V")
	public static void method4346(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static334.aClass293ArrayArrayArray1 == null) {
			Static163.aClass19_17.method7978(arg2, arg3, arg0, arg4, -16777216);
			return;
		}
		@Pc(19) boolean local19 = false;
		if (Static1.anInt10827 == 0) {
			if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 < 0 || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >= Static720.anInt10888 * 512 || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 < 0 || Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >= Static501.anInt7591 * 512) {
				local19 = true;
			}
		} else if (!Static421.aBoolean480) {
			local19 = true;
		}
		if (local19) {
			Static163.aClass19_17.method7978(arg2, arg3, arg0, arg4, -16777216);
			return;
		}
		Static198.anInt3285++;
		if (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2 != null && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 + 256 - Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9309((byte) 45) * 256 >> 9 == Static675.anInt10184 && Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 - (Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.method9309((byte) 48) - 1) * 256 >> 9 == Static212.anInt3476) {
			Static675.anInt10184 = -1;
			Static212.anInt3476 = -1;
			Static444.method5995();
		}
		Static710.method6718();
		if (!arg1) {
			Static527.method7090();
		}
		Static498.method6650(arg4, true, arg0, arg3, arg2);
		@Pc(153) int local153 = Static32.anInt776;
		@Pc(155) int local155 = Static242.anInt3982;
		Static582.anInt8651 = Static582.anInt8654;
		@Pc(159) int local159 = Static290.anInt4671;
		@Pc(161) int local161 = Static200.anInt3314;
		@Pc(169) int local169;
		@Pc(204) int local204;
		if (Static511.anInt7668 == 1) {
			local169 = (int) Static479.aFloat123;
			if (Static188.anInt3112 >> 8 > local169) {
				local169 = Static188.anInt3112 >> 8;
			}
			if (Static572.aBooleanArray29[4] && local169 < Static140.anIntArray222[4] + 128) {
				local169 = Static140.anIntArray222[4] + 128;
			}
			local204 = Static288.anInt4635 + (int) Static171.aFloat64 & 0x3FFF;
			Static292.method4613(local169, (local169 >> 3) * 3 + 600 << 2, local161, Static494.anInt7431, local204, Static38.anInt924, Static102.method2025(Static394.anInt6196, -29754, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718) - 200);
		} else if (Static511.anInt7668 == 4) {
			local169 = (int) Static479.aFloat123;
			if (Static188.anInt3112 >> 8 > local169) {
				local169 = Static188.anInt3112 >> 8;
			}
			if (Static572.aBooleanArray29[4] && Static140.anIntArray222[4] + 128 > local169) {
				local169 = Static140.anIntArray222[4] + 128;
			}
			local204 = (int) Static171.aFloat64 & 0x3FFF;
			Static292.method4613(local169, (local169 >> 3) * 3 + 600 << 2, local161, Static494.anInt7431, local204, Static38.anInt924, Static102.method2025(Static394.anInt6196, -29754, Static249.anInt4029, Static433.anInt6282) - 200);
		} else if (Static511.anInt7668 == 5) {
			Static110.method2079(local161);
		}
		local169 = Static170.anInt2873;
		local204 = Static359.anInt5821;
		@Pc(325) int local325 = Static110.anInt2195;
		@Pc(327) int local327 = Static598.anInt8856;
		@Pc(329) int local329 = Static323.anInt5136;
		@Pc(375) int local375;
		for (@Pc(331) int local331 = 0; local331 < 5; local331++) {
			if (Static572.aBooleanArray29[local331]) {
				local375 = (int) ((double) -Static331.anIntArray403[local331] + (double) (Static331.anIntArray403[local331] * 2 + 1) * Math.random() + Math.sin((double) Static362.anIntArray450[local331] / 100.0D * (double) Static194.anIntArray268[local331]) * (double) Static140.anIntArray222[local331]);
				if (local331 == 3) {
					Static323.anInt5136 = local375 + Static323.anInt5136 & 0x3FFF;
				}
				if (local331 == 0) {
					Static170.anInt2873 += local375 << 2;
				}
				if (local331 == 1) {
					Static359.anInt5821 += local375 << 2;
				}
				if (local331 == 2) {
					Static110.anInt2195 += local375 << 2;
				}
				if (local331 == 4) {
					Static598.anInt8856 += local375;
					if (Static598.anInt8856 < 1024) {
						Static598.anInt8856 = 1024;
					} else if (Static598.anInt8856 > 3072) {
						Static598.anInt8856 = 3072;
					}
				}
			}
		}
		if (Static170.anInt2873 < 0) {
			Static170.anInt2873 = 0;
		}
		if (Static110.anInt2195 < 0) {
			Static110.anInt2195 = 0;
		}
		if (Static170.anInt2873 > (Static619.anInt1573 << 9) - 1) {
			Static170.anInt2873 = (Static619.anInt1573 << 9) - 1;
		}
		if (Static110.anInt2195 > (Static662.anInt9869 << 9) - 1) {
			Static110.anInt2195 = (Static662.anInt9869 << 9) - 1;
		}
		Static276.method3988();
		Static163.aClass19_17.KA(local153, local159, local155 + local153, local159 + local161);
		Static501.method6723(true);
		local375 = Static251.anInt4048;
		Static460.aClass73_10.method7142(Static170.anInt2873, Static359.anInt5821, Static110.anInt2195, -Static598.anInt8856 & 0x3FFF, -Static323.anInt5136 & 0x3FFF, -Static81.anInt1651 & 0x3FFF);
		Static163.aClass19_17.method8007(Static460.aClass73_10);
		Static163.aClass19_17.DA(local155 / 2 + local153, local161 / 2 + local159, Static428.anInt6515 << 1, Static428.anInt6515 << 1);
		if (Static137.aBoolean210) {
			Static476.method6455(Static251.anInt4048);
			if (Static162.anInt2809 != Static582.anInt8651) {
				Static75.aBoolean521 = true;
			}
			Static162.anInt2809 = Static582.anInt8651;
			Static163.aClass19_17.GA(local375);
			Static163.aClass19_17.ya();
		} else if (Static456.aClass148_3 == null) {
			Static163.aClass19_17.GA(local375);
			Static163.aClass19_17.ya();
		} else {
			Static163.aClass19_17.xa(1.0F);
			Static163.aClass19_17.ZA(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			Static456.aClass148_3.method3159(local159, Static163.aClass19_17, Static323.anInt5136, local155, local375, Static81.anInt1651, local161, local153, Static436.anInt3863 << 3, Static598.anInt8856);
		}
		Static557.method7338();
		Static527.method7088(Static428.anInt6515 << 1, local161 / 2 + local159, Static428.anInt6515 << 1, local153 + local155 / 2);
		Static620.method8331(-Static323.anInt5136 & 0x3FFF, Static110.anInt2195, -Static81.anInt1651 & 0x3FFF, Static359.anInt5821, -Static598.anInt8856 & 0x3FFF, Static170.anInt2873);
		Static159.method2575();
		@Pc(688) byte local688 = Static400.aClass2_Sub34_28.aClass57_Sub4_2.method2143() == 2 ? (byte) Static198.anInt3285 : 1;
		if (Static137.aBoolean210) {
			Static648.method8490(-Static323.anInt5136 & 0x3FFF, -Static81.anInt1651 & 0x3FFF, -Static598.anInt8856 & 0x3FFF);
			Static466.method6331(local688, Static170.anInt2873, Static110.anInt2195, Static359.anInt5821, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >> 9, Static457.anIntArray552, Static682.anIntArray817, Static333.anInt5474, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 + 1, Static482.anIntArray588, Static400.aClass2_Sub34_28.aClass57_Sub8_1.method3176() == 0, Static582.anInt8651, Static9.anIntArray18, Static328.aByteArrayArrayArray4, Static153.anIntArray235, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >> 9);
		} else {
			Static283.method4100(Static333.anInt5474, Static170.anInt2873, Static359.anInt5821, Static110.anInt2195, Static328.aByteArrayArrayArray4, Static482.anIntArray588, Static9.anIntArray18, Static457.anIntArray552, Static153.anIntArray235, Static682.anIntArray817, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.aByte144 + 1, local688, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10718 >> 9, Static556.aClass8_Sub2_Sub1_Sub2_Sub1_2.anInt10722 >> 9, Static400.aClass2_Sub34_28.aClass57_Sub8_1.method3176() == 0, Static504.aBoolean579 ? Static582.anInt8651 : -1, 0, false);
		}
		Static557.method7338();
		if (Static283.anInt4588 == 11) {
			Static205.method3091(local155, local161, local159, local153);
			Static608.method8183(local159, local155, local153, local161);
			Static233.method3407(local155, local159, local153, local161);
			Static208.method3105(local155, local153, local159, local161);
		}
		Static712.method9330();
		Static110.anInt2195 = local325;
		Static170.anInt2873 = local169;
		Static598.anInt8856 = local327;
		Static359.anInt5821 = local204;
		Static323.anInt5136 = local329;
		Static288.aBoolean356 = false;
		if (Static426.aBoolean72 && Static500.aClass297_3.method6629() == 0) {
			Static426.aBoolean72 = false;
		}
		if (Static426.aBoolean72) {
			Static163.aClass19_17.method7978(local155, local161, local159, local153, -16777216);
			Static694.method9035(Static163.aClass19_17, Static32.aClass32_12.method877(Static51.anInt1056), false, Static694.aClass383_13, Static437.aClass14_9);
		}
		Static501.method6723(false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!ge;)Lclient!pf;")
	public static Class2_Sub1 method4348(@OriginalArg(1) Class2_Sub21 arg0) {
		arg0.method7403();
		@Pc(13) int local13 = arg0.method7403();
		@Pc(17) Class2_Sub1 local17 = Static96.method8828(local13);
		local17.anInt10909 = arg0.method7403();
		@Pc(32) int local32 = arg0.method7403();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(40) int local40 = arg0.method7403();
			local17.method9423(arg0, local40);
		}
		local17.method9428();
		return local17;
	}
}
