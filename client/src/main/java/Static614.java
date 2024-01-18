import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!sb;")
	public static Class330 aClass330_114;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	public static int anInt9373;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "[F")
	public static final float[] aFloatArray67 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
	public static final boolean aBoolean718 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZJ)I")
	public static int method5821(@OriginalArg(1) long arg0) {
		Static551.method5100(arg0);
		return Static260.aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JBI)Ljava/lang/String;")
	public static String method5822(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static551.method5100(arg0);
		@Pc(17) int local17 = Static260.aCalendar2.get(5);
		@Pc(23) int local23 = Static260.aCalendar2.get(2) + 1;
		@Pc(27) int local27 = Static260.aCalendar2.get(1);
		return Integer.toString(local17 / 10) + local17 % 10 + "/" + local23 / 10 + local23 % 10 + "/" + local27 % 100 / 10 + local27 % 10;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
	public static void method5824() {
		Static467.aClass96_3.method1553();
		Static540.aClass79_6.method1324();
		Static68.aClass215_3.method3527();
		Static354.aClass142_4.method2159();
		Static690.aClass308_2.method4960();
		Static419.aClass112_1.method1677();
		Static25.aClass50_1.method683();
		Static23.aClass128_1.method1835();
		Static529.aClass161_1.method2466();
		Static36.aClass260_1.method4091();
		Static628.aClass342_5.method5523();
		Static648.aClass17_1.method153();
		Static574.aClass310_2.method4990();
		Static577.aClass246_4.method3963();
		Static720.aClass363_4.method5931();
		Static386.aClass49_2.method678();
		Static272.aClass45_1.method631();
		Static324.aClass307_1.method4943();
		Static99.aClass78_1.method1311();
		Static48.aClass384_1.method6300();
		Static354.aClass267_1.method4211();
		Static652.aClass214_1.method3519();
		Static561.aClass220_2.method3646();
		Static559.method5223();
		Static534.method4996();
		Static402.method3962();
		Static198.method2056();
		Static194.method2012();
		Static230.aClass82_81.method1381(5);
		Static669.aClass82_215.method1381(5);
		Static541.aClass82_174.method1381(5);
		Static452.aClass82_149.method1381(5);
		Static472.aClass82_156.method1381(5);
	}
}
