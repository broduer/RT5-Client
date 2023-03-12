import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class AreaSoundManager {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!oe;B)V")
	public static void remove(@OriginalArg(0) Npc arg0) {
		for (@Pc(16) Class2_Sub19 local16 = (Class2_Sub19) Static363.aClass135_39.method3551(); local16 != null; local16 = (Class2_Sub19) Static363.aClass135_39.method3552()) {
			if (local16.aClass11_Sub5_Sub2_Sub2_1 == arg0) {
				if (local16.aClass2_Sub12_Sub4_3 != null) {
					Static227.aClass2_Sub12_Sub2_2.method2081(local16.aClass2_Sub12_Sub4_3);
					local16.aClass2_Sub12_Sub4_3 = null;
				}
				local16.method6468();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ct;IILclient!nh;Lclient!oe;BII)V")
	public static void add(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Player arg3, @OriginalArg(4) Npc arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.anInt2905 = arg6;
		local7.anInt2899 = arg5 * 128;
		local7.anInt2910 = arg1 * 128;
		if (arg0 != null) {
			local7.aClass41_1 = arg0;
			@Pc(33) int local33 = arg0.anInt1356;
			@Pc(36) int local36 = arg0.anInt1327;
			if (arg2 == 1 || arg2 == 3) {
				local33 = arg0.anInt1327;
				local36 = arg0.anInt1356;
			}
			local7.anIntArray181 = arg0.anIntArray93;
			local7.anInt2903 = arg0.anInt1334;
			local7.anInt2896 = (arg5 + local33) * 128;
			local7.anInt2901 = arg0.anInt1307 * 128;
			local7.anInt2904 = (local36 + arg1) * 128;
			local7.anInt2906 = arg0.anInt1320;
			local7.anInt2894 = arg0.anInt1325;
			local7.anInt2897 = arg0.anInt1315;
			if (arg0.anIntArray94 != null) {
				local7.aBoolean204 = true;
				local7.method2941();
			}
			if (local7.anIntArray181 != null) {
				local7.anInt2907 = local7.anInt2903 + (int) ((double) (local7.anInt2897 - local7.anInt2903) * Math.random());
			}
			Static83.aClass135_14.method3540(local7);
		} else if (arg4 != null) {
			local7.aClass11_Sub5_Sub2_Sub2_1 = arg4;
			@Pc(131) Class71 local131 = arg4.type;
			if (local131.anIntArray129 != null) {
				local7.aBoolean204 = true;
				local131 = local131.method2093(Static214.aClass226_1);
			}
			if (local131 != null) {
				local7.anInt2904 = (arg1 + local131.size) * 128;
				local7.anInt2896 = (arg5 + local131.size) * 128;
				local7.anInt2894 = Static340.method5764(arg4);
				local7.anInt2901 = local131.anInt2022 * 128;
				local7.anInt2906 = local131.anInt2051;
			}
			Static363.aClass135_39.method3540(local7);
		} else if (arg3 != null) {
			local7.aClass11_Sub5_Sub2_Sub1_2 = arg3;
			local7.anInt2896 = (arg5 + arg3.getSize()) * 128;
			local7.anInt2904 = (arg1 + arg3.getSize()) * 128;
			local7.anInt2894 = Static384.method6415(arg3);
			local7.anInt2906 = arg3.soundVolume;
			local7.anInt2901 = arg3.soundRadius * 128;
			Static232.aClass4_86.method87(local7, (long) arg3.anInt4619);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!nh;)V")
	public static void remove(@OriginalArg(1) Player arg0) {
		@Pc(11) Class2_Sub19 local11 = (Class2_Sub19) Static232.aClass4_86.method90((long) arg0.anInt4619);
		if (local11 == null) {
			return;
		}
		if (local11.aClass2_Sub12_Sub4_3 != null) {
			Static227.aClass2_Sub12_Sub2_2.method2081(local11.aClass2_Sub12_Sub4_3);
			local11.aClass2_Sub12_Sub4_3 = null;
		}
		local11.method6468();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void update(@OriginalArg(0) Player arg0) {
		@Pc(19) Class2_Sub19 local19 = (Class2_Sub19) Static232.aClass4_86.method90((long) arg0.anInt4619);
		if (local19 == null) {
			add(null, arg0.movementQueueZ[0], 0, arg0, null, arg0.movementQueueX[0], arg0.aByte78);
		} else {
			local19.method2941();
		}
	}

}
