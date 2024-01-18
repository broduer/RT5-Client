import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIILclient!fk;I)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub19 arg2, @OriginalArg(4) int arg3) {
		arg2.aClass2_Sub21_Sub2_1.method5156(arg0);
		arg2.aClass2_Sub21_Sub2_1.method5179(arg1);
		arg2.aClass2_Sub21_Sub2_1.method5182(arg3);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!uv;IIZ)J")
	public static long method2804(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(18) long local18 = Long.MIN_VALUE;
		@Pc(25) Class54 local25 = Static354.aClass142_4.method2158(arg0.method4822(-32136), 44);
		@Pc(46) long local46 = (long) (arg2 | arg1 << 7 | arg0.method4821() << 14 | arg0.method4818(23796) << 20 | 0x40000000);
		if (local25.anInt1271 == 0) {
			local46 |= local18;
		}
		if (local25.lb == 1) {
			local46 |= local5;
		}
		return local46 | (long) arg0.method4822(-32136) << 32;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IC)Z")
	public static boolean method2805(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IZI)Z")
	public static boolean method2806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
