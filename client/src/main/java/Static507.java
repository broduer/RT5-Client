import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!pw", name = "C", descriptor = "[Lclient!w;")
	public static Class396[] aClass396Array1;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_95 = new Class347(44, -1);

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "Lclient!it;")
	public static final Class184 aClass184_14 = new Class184(10, 2, 2, 0);

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "[I")
	public static final int[] anIntArray610 = new int[4096];

	@OriginalMember(owner = "client!pw", name = "G", descriptor = "I")
	public static int anInt7641 = 2;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZIIILclient!hda;)V")
	public static void method6750(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class158 arg3) {
		@Pc(6) int local6 = arg3.anInt3813;
		@Pc(16) int local16 = arg3.anInt3756;
		if (arg3.aByte63 == 0) {
			arg3.anInt3813 = arg3.anInt3754;
		} else if (arg3.aByte63 == 1) {
			arg3.anInt3813 = arg2 - arg3.anInt3754;
		} else if (arg3.aByte63 == 2) {
			arg3.anInt3813 = arg3.anInt3754 * arg2 >> 14;
		}
		if (arg3.aByte62 == 0) {
			arg3.anInt3756 = arg3.anInt3772;
		} else if (arg3.aByte62 == 1) {
			arg3.anInt3756 = arg1 - arg3.anInt3772;
		} else if (arg3.aByte62 == 2) {
			arg3.anInt3756 = arg1 * arg3.anInt3772 >> 14;
		}
		if (arg3.aByte63 == 4) {
			arg3.anInt3813 = arg3.anInt3806 * arg3.anInt3756 / arg3.anInt3760;
		}
		if (arg3.aByte62 == 4) {
			arg3.anInt3756 = arg3.anInt3813 * arg3.anInt3760 / arg3.anInt3806;
		}
		if (Static103.aBoolean195 && (Static84.method1661(arg3).anInt6930 != 0 || arg3.anInt3831 == 0)) {
			if (arg3.anInt3756 < 5 && arg3.anInt3813 < 5) {
				arg3.anInt3756 = 5;
				arg3.anInt3813 = 5;
			} else {
				if (arg3.anInt3813 <= 0) {
					arg3.anInt3813 = 5;
				}
				if (arg3.anInt3756 <= 0) {
					arg3.anInt3756 = 5;
				}
			}
		}
		if (Static188.anInt3113 == arg3.anInt3817) {
			Static610.aClass158_16 = arg3;
		}
		if (arg0 && arg3.anObjectArray19 != null && (local6 != arg3.anInt3813 || local16 != arg3.anInt3756)) {
			@Pc(225) Class2_Sub42 local225 = new Class2_Sub42();
			local225.anObjectArray36 = arg3.anObjectArray19;
			local225.aClass158_14 = arg3;
			Static521.aClass341_44.method7718(local225);
		}
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(Z)V")
	public static void method6751() {
		for (@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) Static106.aClass28_11.method736(); local15 != null; local15 = (Class2_Sub5) Static106.aClass28_11.method740()) {
			if (local15.aBoolean18) {
				local15.aBoolean18 = false;
			} else {
				Static121.method2199(local15.anInt182);
			}
		}
	}
}
