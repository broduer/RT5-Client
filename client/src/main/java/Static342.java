import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!kp", name = "w", descriptor = "Lclient!fla;")
	public static Class130 aClass130_7;

	@OriginalMember(owner = "client!kp", name = "A", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_61 = new Class347(47, 7);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!jm;)V")
	public static void method4469(@OriginalArg(1) Class199 arg0) {
		Static636.aClass199_1 = arg0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ke;B)Z")
	public static boolean method4470(@OriginalArg(0) Class207 arg0) {
		return arg0 == null ? false : Static318.method8564(arg0.anInt5143 - arg0.anInt5140, -arg0.anInt5150 + arg0.anInt5151, arg0.anInt5140, arg0.anInt5148, arg0.anInt5150, arg0.anInt5142 - arg0.anInt5148);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
	public static void method4471(@OriginalArg(0) int arg0) {
		if (true) {
			// 2011scape compatibility
			Static284.anInt4597 = arg0;
			Static344.aClass231_1.id = 15;
			Static344.aClass231_1.alternatePort = 50015;
		} else {
			if (Static299.anInt4841 == 1) {
				Static284.anInt4597 = arg0;
			} else if (Static299.anInt4841 == 2) {
				Static169.anInt2864 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BI)V")
	public static void method4472(@OriginalArg(1) int arg0) {
		if (arg0 == Static537.anInt8193) {
			return;
		}
		Static720.anInt10888 = Static501.anInt7591 = Static238.anIntArray306[arg0];
		Static209.method3110();
		Static623.anIntArrayArrayArray19 = new int[4][Static720.anInt10888 >> 3][Static501.anInt7591 >> 3];
		Static148.anIntArrayArray64 = new int[Static720.anInt10888][Static501.anInt7591];
		Static341.anIntArrayArray133 = new int[Static720.anInt10888][Static501.anInt7591];
		for (@Pc(35) int local35 = 0; local35 < 4; local35++) {
			Static577.aClass110Array1[local35] = Static125.method2219(Static720.anInt10888, Static501.anInt7591);
		}
		Static328.aByteArrayArrayArray4 = new byte[4][Static720.anInt10888][Static501.anInt7591];
		Static708.method9238(Static720.anInt10888, Static501.anInt7591);
		Static613.method8246(Static163.aClass19_17, Static501.anInt7591 >> 3, Static720.anInt10888 >> 3);
		Static537.anInt8193 = arg0;
	}
}
