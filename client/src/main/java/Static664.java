import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static664 {

	@OriginalMember(owner = "client!vaa", name = "v", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_115 = new ClientProt(40, 11);

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ILclient!fk;)[I")
	public static int[] method8659(@OriginalArg(1) Node_Sub19 arg0) {
		@Pc(8) Buffer local8 = new Buffer(518);
		@Pc(11) int[] local11 = new int[4];
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			local11[local13] = (int) (Math.random() * 9.9999999E7D);
		}
		local8.p1(10);
		local8.p4(local11[0]);
		local8.p4(local11[1]);
		local8.p4(local11[2]);
		local8.p4(local11[3]);
		for (@Pc(70) int local70 = 0; local70 < 10; local70++) {
			local8.p4((int) (Math.random() * 9.9999999E7D));
		}
		local8.p2((int) (Math.random() * 9.9999999E7D));
		local8.rsaenc(Static374.aBigInteger2, Static262.aBigInteger1);
		arg0.aClass2_Sub21_Sub2_1.pdata(local8.pos, local8.data, 0);
		return local11;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IZLjava/lang/String;ZLclient!vq;)V")
	public static void method8662(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) signlink arg3) {
		Static259.method3693(arg1, "openjs", arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
	public static void method8664() {
		if (signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
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
		if (signlink.aMethod2 == null) {
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
	public static int method8665(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < Static327.anInt5411; local10++) {
			if (arg0.equalsIgnoreCase(Static330.aStringArray25[local10])) {
				return local10;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
	public static void method8666() {
		client.floTypeList.method2351();
		client.fluTypeList.method2072();
		client.idkTypeList.method5048();
		client.locTypeList.method3058();
		client.npcTypeList.method7096();
		client.objTypeList.method2480();
		client.seqTypeList.method1164();
		client.spotanimTypeList.method2697();
		client.varbitTypeList.method3423();
		client.varpTypeList.method5788();
		client.varclanTypeList.method7794();
		client.varclansettingTypeList.method266();
		client.basTypeList.method7124();
		client.msiTypeList.method8367();
		client.melTypeList.method5592();
		client.questTypeList.method1093();
		client.paramTypeList.method1156();
		client.skyboxTypeList.method7076();
		client.skyboxsphereTypeList.method2053();
		client.lightTypeList.method8822();
		client.cursorTypeList.method5979();
		client.structTypeList.method5047();
		client.hitmarkTypeList.method5190();
		Static424.method5786();
		Static570.method7560();
		Static553.method7297();
		Static149.method2450();
		Static126.method2229();
		Static230.aClass82_81.method2151();
		Static669.aClass82_215.method2151();
		Static541.aClass82_174.method2151();
		Static452.aClass82_149.method2151();
		Static472.aClass82_156.method2151();
	}
}
