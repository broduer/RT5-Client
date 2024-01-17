import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V")
	public static void method8400() {
		@Pc(5) Class130[] local5 = Class43.aClass130Array1;
		synchronized (Class43.aClass130Array1) {
			for (@Pc(9) int local9 = 0; local9 < Class43.aClass130Array1.length; local9++) {
				Class43.aClass130Array1[local9] = new Class130();
				Static159.anIntArray245[local9] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!vq;BIILjava/awt/Component;)Lclient!cd;")
	public static Class56 method8401(@OriginalArg(0) Class392 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static686.anInt8968 == 0) {
			throw new IllegalStateException();
		} else if (arg1 >= 2) {
			throw new IllegalArgumentException();
		} else {
			try {
				@Pc(41) Class56 local41 = (Class56) Class.forName("Class56_Sub1").getDeclaredConstructor().newInstance();
				local41.anIntArray315 = new int[(Static316.aBoolean645 ? 2 : 1) * 256];
				local41.anInt4109 = arg2;
				local41.method3593(arg3);
				local41.anInt4108 = (-1024 & arg2) + 1024;
				if (local41.anInt4108 > 16384) {
					local41.anInt4108 = 16384;
				}
				local41.method3588(local41.anInt4108);
				if (Static156.anInt2688 > 0 && Static232.aClass119_1 == null) {
					Static232.aClass119_1 = new Class119();
					Static232.aClass119_1.aClass392_2 = arg0;
					arg0.method8998(Static232.aClass119_1, Static156.anInt2688);
				}
				if (Static232.aClass119_1 != null) {
					if (Static232.aClass119_1.aClass56Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static232.aClass119_1.aClass56Array1[arg1] = local41;
				}
				return local41;
			} catch (@Pc(135) Throwable local135) {
				try {
					@Pc(141) Class56_Sub2 local141 = new Class56_Sub2(arg0, arg1);
					local141.anIntArray315 = new int[(Static316.aBoolean645 ? 2 : 1) * 256];
					local141.anInt4109 = arg2;
					local141.method3593(arg3);
					local141.anInt4108 = 16384;
					local141.method3588(local141.anInt4108);
					if (Static156.anInt2688 > 0 && Static232.aClass119_1 == null) {
						Static232.aClass119_1 = new Class119();
						Static232.aClass119_1.aClass392_2 = arg0;
						arg0.method8998(Static232.aClass119_1, Static156.anInt2688);
					}
					if (Static232.aClass119_1 != null) {
						if (Static232.aClass119_1.aClass56Array1[arg1] != null) {
							throw new IllegalArgumentException();
						}
						Static232.aClass119_1.aClass56Array1[arg1] = local141;
					}
					return local141;
				} catch (@Pc(211) Throwable local211) {
					return new Class56();
				}
			}
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(JZ)V")
	public static void method8402(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static315.method4585(arg0 - 1L);
			Static315.method4585(1L);
		} else {
			Static315.method4585(arg0);
		}
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(Z)Lclient!gh;")
	public static Class145 method8403() {
		try {
			return (Class145) Class.forName("Class145_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return null;
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIII)V")
	public static void method8404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static12.anInt5761 = arg1;
		Static55.anInt1129 = arg3;
		Static314.anInt5052 = arg0;
		Static179.anInt3000 = arg4;
		Static441.anInt6709 = arg2;
		if (Static179.anInt3000 >= 100) {
			@Pc(22) int local22 = Static441.anInt6709 * 512 + 256;
			@Pc(28) int local28 = Static12.anInt5761 * 512 + 256;
			@Pc(36) int local36 = Static102.method2025(Static394.anInt6196, -29754, local28, local22) - Static55.anInt1129;
			@Pc(41) int local41 = local22 - Static170.anInt2873;
			@Pc(46) int local46 = local36 - Static359.anInt5821;
			@Pc(51) int local51 = local28 - Static110.anInt2195;
			@Pc(62) int local62 = (int) Math.sqrt(local51 * local51 + local41 * local41);
			Static598.anInt8856 = (int) (Math.atan2(local46, local62) * 2607.5945876176133D) & 0x3FFF;
			Static323.anInt5136 = (int) (-2607.5945876176133D * Math.atan2(local41, local51)) & 0x3FFF;
			if (Static598.anInt8856 < 1024) {
				Static598.anInt8856 = 1024;
			}
			Static81.anInt1651 = 0;
			if (Static598.anInt8856 > 3072) {
				Static598.anInt8856 = 3072;
			}
		}
		Static693.anInt10411 = -1;
		Static692.anInt10404 = -1;
		Static511.anInt7668 = 2;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(III)Lclient!nda;")
	public static Class8_Sub2_Sub5 method8405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class293 local7 = Static334.aClass293ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class8_Sub2_Sub5 local15 = local7.aClass8_Sub2_Sub5_1;
			local7.aClass8_Sub2_Sub5_1 = null;
			Static109.method2068(local15);
			return local15;
		}
	}
}
