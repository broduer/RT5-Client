import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!vaa", name = "gb", descriptor = "Z")
	public static volatile boolean aBoolean759 = true;

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_115 = new Class345(40, 11);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!fk;)[I")
	public static int[] method6169(@OriginalArg(1) Class2_Sub19 arg0) {
		@Pc(8) Class2_Sub21 local8 = new Class2_Sub21(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.method5198(10);
		local8.method5151(local11[0]);
		local8.method5151(local11[1]);
		local8.method5151(local11[2]);
		local8.method5151(local11[3]);
		for (@Pc(70) int local70 = 0; local70 < 10; local70++) {
			local8.method5151((int) (Math.random() * 9.9999999E7D));
		}
		local8.method5182((int) (Math.random() * 9.9999999E7D));
		local8.method5194(Static374.aBigInteger2, Static262.aBigInteger1);
		arg0.aClass2_Sub21_Sub2_1.method5195(local8.anInt8388, local8.aByteArray93, 0);
		return local11;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZLjava/lang/String;ZLclient!vq;)V")
	public static void method6172(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class390 arg3) {
		Static259.method2660(arg1, "openjs", arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
	public static void method6174() {
		if (Static689.aString123.toLowerCase().indexOf("microsoft") != -1) {
			Static471.anIntArray577[191] = 73;
			Static471.anIntArray577[186] = 57;
			Static471.anIntArray577[219] = 42;
			Static471.anIntArray577[223] = 28;
			Static471.anIntArray577[192] = 58;
			Static471.anIntArray577[189] = 26;
			Static471.anIntArray577[222] = 59;
			Static471.anIntArray577[188] = 71;
			Static471.anIntArray577[187] = 27;
			Static471.anIntArray577[220] = 74;
			Static471.anIntArray577[221] = 43;
			Static471.anIntArray577[190] = 72;
			return;
		}
		Static471.anIntArray577[92] = 74;
		Static471.anIntArray577[47] = 73;
		Static471.anIntArray577[46] = 72;
		Static471.anIntArray577[44] = 71;
		Static471.anIntArray577[45] = 26;
		if (Static689.aMethod2 == null) {
			Static471.anIntArray577[192] = 58;
			Static471.anIntArray577[222] = 59;
		} else {
			Static471.anIntArray577[222] = 58;
			Static471.anIntArray577[192] = 28;
			Static471.anIntArray577[520] = 59;
		}
		Static471.anIntArray577[93] = 43;
		Static471.anIntArray577[91] = 42;
		Static471.anIntArray577[59] = 57;
		Static471.anIntArray577[61] = 27;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6175(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < Static327.anInt5392; local10++) {
			if (arg0.equalsIgnoreCase(Static330.aStringArray25[local10])) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public static void method6176() {
		Static467.aClass96_3.method1549();
		Static540.aClass79_6.method1323();
		Static68.aClass215_3.method3523();
		Static354.aClass142_4.method2153();
		Static690.aClass308_2.method4964();
		Static419.aClass112_1.method1678();
		Static25.aClass50_1.method684();
		Static23.aClass128_1.method1834();
		Static529.aClass161_1.method2461();
		Static36.aClass260_1.method4087();
		Static628.aClass342_5.method5526();
		Static648.aClass17_1.method152();
		Static574.aClass310_2.method4992();
		Static720.aClass363_4.method5924();
		Static577.aClass246_4.method3967();
		Static272.aClass45_1.method628();
		Static386.aClass49_2.method676();
		Static324.aClass307_1.method4944();
		Static99.aClass78_1.method1309();
		Static48.aClass384_1.method6302();
		Static354.aClass267_1.method4213();
		Static652.aClass214_1.method3522();
		Static561.aClass220_2.method3645();
		Static424.method4085();
		Static570.method5322();
		Static553.method5114();
		Static149.method1648();
		Static126.method1449();
		Static230.aClass82_81.method1385();
		Static669.aClass82_215.method1385();
		Static541.aClass82_174.method1385();
		Static452.aClass82_149.method1385();
		Static472.aClass82_156.method1385();
	}
}
