import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!ska", name = "P", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_217 = new Class227(25, 0);

	@OriginalMember(owner = "client!ska", name = "H", descriptor = "[I")
	public static int[] anIntArray695 = new int[6];

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "([BB)[B")
	public static byte[] method7751(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(arg0);
		@Pc(18) int local18 = local8.method7403();
		@Pc(22) int local22 = local8.method7356();
		if (local22 < 0 || Static112.anInt2231 != 0 && Static112.anInt2231 < local22) {
			throw new RuntimeException();
		} else if (local18 == 0) {
			@Pc(98) byte[] local98 = new byte[local22];
			local8.method7351(0, local22, local98);
			return local98;
		} else {
			@Pc(44) int local44 = local8.method7356();
			if (local44 < 0 || Static112.anInt2231 != 0 && local44 > Static112.anInt2231) {
				throw new RuntimeException();
			}
			@Pc(66) byte[] local66 = new byte[local44];
			if (local18 == 1) {
				Static160.method2576(local66, local44, arg0, local22);
			} else {
				@Pc(73) Class302 local73 = Static315.aClass302_1;
				synchronized (Static315.aClass302_1) {
					Static315.aClass302_1.method6768(local8, local66);
				}
			}
			return local66;
		}
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "([Lclient!eo;II)V")
	public static void method7752(@OriginalArg(0) Class8_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class8_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt10725;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt10725 < local27 + (local29 & 0x1)) {
				@Pc(44) Class8_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method7752(arg0, arg1, local10 - 1);
		method7752(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ska", name = "c", descriptor = "(III)Z")
	public static boolean method7753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x22) != 0;
	}
}