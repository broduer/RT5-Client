import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_152 = new Class227(4, 0);

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public static int anInt5896 = 0;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!pc;")
	public static final Class289 aClass289_11 = new Class289(9, -1);

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
	public static int anInt5901 = 0;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	public static void method5286() {
		if (Static620.method8328(Static283.anInt4588)) {
			Static233.method3409(false);
		} else {
			Static467.aClass350_2 = Static405.aClass153_2.aClass350_1;
			Static405.aClass153_2.aClass350_1 = null;
			Static81.method1586(14);
		}
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V")
	public static void method5287() {
		@Pc(12) int local12;
		if (Static384.aClass75Array2 != null) {
			for (local12 = 0; local12 < Static317.anInt5063; local12++) {
				Static384.aClass75Array2[local12] = null;
			}
			Static384.aClass75Array2 = null;
		}
		if (Static607.aClass75Array4 != null) {
			for (local12 = 0; local12 < Static444.anInt6772; local12++) {
				Static607.aClass75Array4[local12] = null;
			}
			Static607.aClass75Array4 = null;
		}
		if (Static285.aClass75Array1 != null) {
			for (local12 = 0; local12 < Static150.anInt2643; local12++) {
				Static285.aClass75Array1[local12] = null;
			}
			Static285.aClass75Array1 = null;
		}
		Static560.aClass75Array3 = null;
		Static446.anIntArrayArrayArray9 = null;
		Static485.anIntArray886 = null;
		Static624.anInt9487 = -1;
		Static228.anInt3719 = -1;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)[Lclient!kda;")
	public static Class206[] method5288() {
		return new Class206[] { Static515.aClass206_10, Static77.aClass206_1, Static565.aClass206_9, Static535.aClass206_11, Static166.aClass206_6, Static541.aClass206_12, Static647.aClass206_13, Static189.aClass206_7, Static667.aClass206_15, Static505.aClass206_16 };
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLclient!ep;Lclient!ep;)V")
	public static void method5289(@OriginalArg(1) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		if (arg0.aClass8_67 != null) {
			arg0.method9281();
		}
		arg0.aClass8_68 = arg1;
		arg0.aClass8_67 = arg1.aClass8_67;
		arg0.aClass8_67.aClass8_68 = arg0;
		arg0.aClass8_68.aClass8_67 = arg0;
	}
}
