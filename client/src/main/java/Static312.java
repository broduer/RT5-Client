import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "Lclient!dla;")
	public static final SoftLruHashTable aClass82_106 = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public static int anInt5017 = -1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method4548() {
		Static117.aClass2_Sub6_Sub1_2 = null;
		Static676.aClass332_121 = null;
		Static190.anInt3121 = 2;
		Static497.aBoolean564 = false;
		Static24.anInt597 = 0;
		Static96.anInt10199 = 1;
		Static99.anInt2086 = -1;
		Static174.anInt2927 = -1;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLclient!hda;)V")
	public static void method4549(@OriginalArg(1) Class158 arg0) {
		if (!Static156.aBoolean223) {
			return;
		}
		if (arg0.anObjectArray10 != null) {
			@Pc(17) Class158 local17 = Static15.method186(Static77.anInt1621, Static450.anInt6840);
			if (local17 != null) {
				@Pc(23) Node_Sub42 local23 = new Node_Sub42();
				local23.anObjectArray36 = arg0.anObjectArray10;
				local23.aClass158_14 = arg0;
				local23.aClass158_13 = local17;
				Static472.method6427(local23);
			}
		}
		@Pc(45) Node_Sub19 local45 = Static293.method4342(Static505.aClass347_119, Static405.aClass153_2.aClass186_1);
		local45.aClass2_Sub21_Sub2_1.method7357(arg0.anInt3823);
		local45.aClass2_Sub21_Sub2_1.method7400(Static162.anInt2808);
		local45.aClass2_Sub21_Sub2_1.method7377(Static77.anInt1621);
		local45.aClass2_Sub21_Sub2_1.method7354(Static450.anInt6840);
		local45.aClass2_Sub21_Sub2_1.method7400(arg0.anInt3770);
		local45.aClass2_Sub21_Sub2_1.method7369(arg0.anInt3751);
		Static405.aClass153_2.method3275(local45);
	}
}
