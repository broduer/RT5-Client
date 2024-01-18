import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "[I")
	public static final int[] anIntArray368 = new int[3];

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
	public static void method4396() {
		Static59.aString63 = "";
		Static449.aString75 = "";
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZBZ)V")
	public static void method4397(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static191.anInt3124--;
			if (Static191.anInt3124 == 0) {
				Static154.anIntArray237 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static432.anInt526--;
		if (Static432.anInt526 == 0) {
			Static323.anIntArray389 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ge;)V")
	public static void method4399(@OriginalArg(1) Buffer arg0) {
		@Pc(7) int local7 = arg0.gsmarts();
		Static511.aClass65Array1 = new Class65[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static511.aClass65Array1[local12] = new Class65();
			Static511.aClass65Array1[local12].anInt1617 = arg0.gsmarts();
			Static511.aClass65Array1[local12].aString13 = arg0.gjstr2();
		}
		Static494.anInt7417 = arg0.gsmarts();
		Static699.anInt10560 = arg0.gsmarts();
		Static476.anInt7198 = arg0.gsmarts();
		Static106.aClass299_Sub1Array1 = new Class299_Sub1[Static699.anInt10560 + 1 - Static494.anInt7417];
		for (@Pc(63) int local63 = 0; local63 < Static476.anInt7198; local63++) {
			@Pc(68) int local68 = arg0.gsmarts();
			@Pc(76) Class299_Sub1 local76 = Static106.aClass299_Sub1Array1[local68] = new Class299_Sub1();
			local76.anInt7587 = arg0.g1();
			local76.anInt7586 = arg0.g4();
			local76.anInt7592 = Static494.anInt7417 + local68;
			local76.aString91 = arg0.gjstr2();
			local76.aString90 = arg0.gjstr2();
		}
		Static379.anInt5988 = arg0.g4();
		Static518.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method4400() {
		Static668.method8707(false);
		if (Static114.anInt2265 >= 0 && Static114.anInt2265 != 0) {
			Static32.method880(Static114.anInt2265, false);
			Static114.anInt2265 = -1;
		}
	}
}
