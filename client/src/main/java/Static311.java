import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!js", name = "P", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!bn;I)Z")
	public static boolean method4544(@OriginalArg(0) Node_Sub8 arg0) {
		if (arg0 == null) {
			return true;
		}
		Static62.aClass2_Sub8_3 = null;
		Static96.anInt10199 = 0;
		Static12.aClass123_4 = null;
		Static117.aClass2_Sub6_Sub1_2 = null;
		if (arg0 != Static62.aClass2_Sub8_2) {
			Static159.anInt2797 = 0;
			Static62.aClass2_Sub8_2 = arg0;
		}
		Static676.aClass332_121 = null;
		if (Static159.anInt2797 == 0) {
			Static270.aClass123_2 = new Class123(Static91.aClass332_117, Static296.aClass332_61);
			Static581.aClass2_Sub6_Sub1_3.method927();
			Static159.anInt2797 = 1;
		}
		if (Static159.anInt2797 == 1) {
			if (!Static581.aClass2_Sub6_Sub1_3.method944(Static270.aClass123_2, Static86.aClass332_13, arg0)) {
				return false;
			}
			Static270.aClass123_2 = null;
			Static62.aClass2_Sub8_2 = null;
			Static159.anInt2797 = 0;
		}
		return true;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ZBZIILjava/lang/String;Ljava/lang/String;)V")
	public static void method4545(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		client.js5Archive19.discardUnpacked = 1;
		@Pc(9) String local9 = arg4.toLowerCase();
		@Pc(12) short[] local12 = new short[16];
		@Pc(14) int local14 = -1;
		@Pc(16) String local16 = null;
		if (arg3 != -1) {
			@Pc(25) ParamType local25 = client.paramTypeList.method1161(arg3);
			if (local25 == null || local25.method6679() != arg0) {
				return;
			}
			if (local25.method6679()) {
				local16 = local25.aString89;
			} else {
				local14 = local25.anInt7532;
			}
		}
		@Pc(54) int local54 = 0;
		for (@Pc(56) int local56 = 0; local56 < client.objTypeList.anInt2679; local56++) {
			@Pc(62) ObjType local62 = client.objTypeList.get(local56);
			if ((!arg1 || local62.aBoolean772) && local62.anInt10114 == -1 && local62.anInt10110 == -1 && local62.anInt10172 == -1 && local62.anInt10128 == 0 && local62.aString118.toLowerCase().indexOf(local9) != -1) {
				if (arg3 != -1) {
					if (arg0) {
						if (!arg5.equals(local62.method8807(local16, arg3))) {
							continue;
						}
					} else if (arg2 != local62.method8801(arg3, local14)) {
						continue;
					}
				}
				if (local54 >= 250) {
					Static256.aShortArray63 = null;
					Static606.anInt8971 = -1;
					return;
				}
				if (local12.length <= local54) {
					@Pc(164) short[] local164 = new short[local12.length * 2];
					for (@Pc(166) int local166 = 0; local166 < local54; local166++) {
						local164[local166] = local12[local166];
					}
					local12 = local164;
				}
				local12[local54++] = (short) local56;
			}
		}
		Static606.anInt8971 = local54;
		Static143.anInt4065 = 0;
		Static256.aShortArray63 = local12;
		@Pc(203) String[] local203 = new String[Static606.anInt8971];
		for (@Pc(205) int local205 = 0; local205 < Static606.anInt8971; local205++) {
			local203[local205] = client.objTypeList.get(local12[local205]).aString118;
		}
		Static554.method7299(local203, Static256.aShortArray63);
		client.js5Archive19.method7599();
		client.js5Archive19.discardUnpacked = 2;
	}
}
