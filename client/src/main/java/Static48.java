import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bka", name = "k", descriptor = "Lclient!vga;")
	public static Class386 aClass386_1;

	@OriginalMember(owner = "client!bka", name = "i", descriptor = "[Lclient!eo;")
	public static Class8_Sub2[] aClass8_Sub2Array3;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIBIIII)I")
	public static int method1095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg2;
			arg2 = local10;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 + 1 - arg4 - arg0;
		} else {
			return 7 + 1 - arg1 - arg2;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "([BZ)Lclient!fj;")
	public static Class2_Sub2_Sub10 method1097(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class2_Sub2_Sub10 local7 = new Class2_Sub2_Sub10();
		@Pc(12) Class2_Sub21 local12 = new Class2_Sub21(arg0);
		local12.anInt8412 = local12.aByteArray93.length - 2;
		@Pc(23) int local23 = local12.method7389();
		@Pc(34) int local34 = local12.aByteArray93.length - local23 - 2 - 16;
		local12.anInt8412 = local34;
		@Pc(50) int local50 = local12.method7356();
		local7.anInt2957 = local12.method7389();
		local7.anInt2959 = local12.method7389();
		local7.anInt2958 = local12.method7389();
		local7.anInt2960 = local12.method7389();
		local7.anInt2962 = local12.method7389();
		local7.anInt2963 = local12.method7389();
		@Pc(84) int local84 = local12.method7403();
		@Pc(95) int local95;
		@Pc(100) int local100;
		if (local84 > 0) {
			local7.aClass28Array1 = new Class28[local84];
			for (local95 = 0; local95 < local84; local95++) {
				local100 = local12.method7389();
				@Pc(107) Class28 local107 = new Class28(Static440.method5969(local100));
				local7.aClass28Array1[local95] = local107;
				while (local100-- > 0) {
					@Pc(117) int local117 = local12.method7356();
					@Pc(121) int local121 = local12.method7356();
					local107.method735((long) local117, new Class2_Sub38(local121));
				}
			}
		}
		local12.anInt8412 = 0;
		local7.aString31 = local12.method7410();
		local7.anIntArray254 = new int[local50];
		local95 = 0;
		while (local12.anInt8412 < local34) {
			local100 = local12.method7389();
			if (local100 == 3) {
				if (local7.aStringArray14 == null) {
					local7.aStringArray14 = new String[local50];
				}
				local7.aStringArray14[local95] = local12.method7365().intern();
			} else if (local100 == 54) {
				if (local7.aLongArray4 == null) {
					local7.aLongArray4 = new long[local50];
				}
				local7.aLongArray4[local95] = local12.method7405();
			} else {
				if (local7.anIntArray255 == null) {
					local7.anIntArray255 = new int[local50];
				}
				if (local100 >= 150 || local100 == 21 || local100 == 38 || local100 == 39) {
					local7.anIntArray255[local95] = local12.method7403();
				} else {
					local7.anIntArray255[local95] = local12.method7356();
				}
			}
			local7.anIntArray254[local95++] = local100;
		}
		return local7;
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!bd;I)Lclient!bd;")
	public static Class2_Sub6_Sub1 method1100(@OriginalArg(0) Class2_Sub6_Sub1 arg0) {
		@Pc(15) Class2_Sub6_Sub1 local15 = arg0 == null ? new Class2_Sub6_Sub1() : new Class2_Sub6_Sub1(arg0);
		local15.method929();
		return local15;
	}
}
