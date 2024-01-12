import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!sb;")
	public static Class332 aClass332_61;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "Lclient!om;")
	public static final Class282 aClass282_5 = new Class282(2);

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
	public static int anInt4808 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!gp;BIIII)V")
	public static void method4368(@OriginalArg(0) Class150 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class2_Sub25 local15 = null;
		for (@Pc(20) Class2_Sub25 local20 = (Class2_Sub25) Static227.aClass341_18.method7706(65280); local20 != null; local20 = (Class2_Sub25) Static227.aClass341_18.method7713()) {
			if (local20.anInt4021 == arg1 && local20.anInt4027 == arg3 && local20.anInt4017 == arg4 && arg2 == local20.anInt4022) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class2_Sub25();
			local15.anInt4021 = arg1;
			local15.anInt4027 = arg3;
			local15.anInt4017 = arg4;
			local15.anInt4022 = arg2;
			Static227.aClass341_18.method7718(local15);
		}
		local15.aBoolean309 = false;
		local15.aClass150_1 = arg0;
		local15.aBoolean310 = true;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public static void method4369() {
		@Pc(5) int local5 = 0;
		if (Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7089() == 1) {
			local5 = 55;
		}
		if (Static400.aClass2_Sub34_28.aClass57_Sub30_1.method8363() == 0) {
			local5 |= 0x40;
		}
		Static335.method4952(local5);
		Static354.aClass142_4.method3065(local5);
		Static419.aClass112_1.method2481(local5);
		Static690.aClass310_2.method7100(local5);
		Static23.aClass128_1.method2695(local5);
		Static41.method1029(local5);
		Static298.method4395(local5);
		Static534.method7129(local5);
		Static170.method2651(local5);
		Static449.method6123();
	}
}
