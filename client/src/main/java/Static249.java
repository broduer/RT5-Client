import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!hma", name = "B", descriptor = "I")
	public static int anInt4019 = 0;

	@OriginalMember(owner = "client!hma", name = "k", descriptor = "I")
	public static int anInt4029 = 0;

	@OriginalMember(owner = "client!hma", name = "a", descriptor = "(IBIIIII)V")
	public static void method3535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static670.method8739(Static724.anInt10959, Static273.anInt4408, arg1);
		@Pc(17) int local17 = Static670.method8739(Static724.anInt10959, Static273.anInt4408, arg3);
		@Pc(23) int local23 = Static670.method8739(Static180.anInt3004, Static111.anInt2228, arg4);
		@Pc(29) int local29 = Static670.method8739(Static180.anInt3004, Static111.anInt2228, arg2);
		@Pc(38) int local38 = Static670.method8739(Static724.anInt10959, Static273.anInt4408, arg1 + arg0);
		@Pc(47) int local47 = Static670.method8739(Static724.anInt10959, Static273.anInt4408, arg3 - arg0);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static696.method9044(local29, arg5, local23, Static723.anIntArrayArray266[local49]);
		}
		for (@Pc(78) int local78 = local17; local78 > local47; local78--) {
			Static696.method9044(local29, arg5, local23, Static723.anIntArrayArray266[local78]);
		}
		@Pc(104) int local104 = Static670.method8739(Static180.anInt3004, Static111.anInt2228, arg4 + arg0);
		@Pc(113) int local113 = Static670.method8739(Static180.anInt3004, Static111.anInt2228, arg2 - arg0);
		for (@Pc(115) int local115 = local38; local115 <= local47; local115++) {
			@Pc(123) int[] local123 = Static723.anIntArrayArray266[local115];
			Static696.method9044(local104, arg5, local23, local123);
			Static696.method9044(local29, arg5, local113, local123);
		}
	}

	@OriginalMember(owner = "client!hma", name = "a", descriptor = "(BLclient!pg;)I")
	public static int method3536(@OriginalArg(1) SecondaryNode_Sub16 arg0) {
		@Pc(15) String local15 = Static518.method9300(arg0);
		@Pc(17) int[] local17 = null;
		if (Static245.method8642(arg0.anInt7335)) {
			local17 = client.objTypeList.get((int) arg0.aLong233).anIntArray800;
		} else if (arg0.anInt7338 != -1) {
			local17 = client.objTypeList.get(arg0.anInt7338).anIntArray800;
		} else if (Static598.method7832(arg0.anInt7335)) {
			@Pc(51) Node_Sub45 local51 = (Node_Sub45) Static18.aClass28_2.get((int) arg0.aLong233);
			if (local51 != null) {
				@Pc(56) Class8_Sub2_Sub1_Sub2_Sub2 local56 = local51.aClass8_Sub2_Sub1_Sub2_Sub2_2;
				@Pc(59) Class270 local59 = local56.aClass270_1;
				if (local59.anIntArray532 != null) {
					local59 = local59.method5992(65535, Static34.aClass306_1);
				}
				if (local59 != null) {
					local17 = local59.anIntArray533;
				}
			}
		} else if (Static523.method3444(arg0.anInt7335)) {
			@Pc(89) LocType local89 = client.locTypeList.method3063((int) (arg0.aLong233 >>> 32 & 0x7FFFFFFFL), 46);
			if (local89.anIntArray113 != null) {
				local89 = local89.method1301(13, Static34.aClass306_1);
			}
			if (local89 != null) {
				local17 = local89.anIntArray112;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static72.method1527(local17);
		}
		@Pc(130) int local130 = Static42.aClass383_4.method8749(Static186.aClass23Array5, local15);
		if (arg0.aBoolean553) {
			local130 += Static517.aClass23_32.method8206() + 4;
		}
		return local130;
	}

	@OriginalMember(owner = "client!hma", name = "a", descriptor = "(BZ)Z")
	public static boolean method3537(@OriginalArg(1) boolean arg0) {
		@Pc(13) boolean local13 = Static163.aClass19_17.method8021();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static163.aClass19_17.method7987();
		} else if (!Static163.aClass19_17.method7977()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static400.aClass2_Sub34_28.method5111(arg0 ? 1 : 0, Static400.aClass2_Sub34_28.aClass57_Sub20_1);
			Static666.method8700(1);
			return true;
		}
	}

	@OriginalMember(owner = "client!hma", name = "a", descriptor = "(Z)V")
	public static void method3538() {
		Static408.method5639();
	}
}
