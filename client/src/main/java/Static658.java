import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static658 {

	@OriginalMember(owner = "client!us", name = "n", descriptor = "I")
	public static int anInt9826;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "Lclient!av;")
	public static final HashTable aClass28_43 = new HashTable(16);

	@OriginalMember(owner = "client!us", name = "m", descriptor = "I")
	public static int anInt9827 = 0;

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!eo;[Lclient!lca;)V")
	public static void method8598(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) Node_Sub7[] arg1) {
		@Pc(6) int local6;
		if (Static442.aBoolean500) {
			local6 = arg0.method9295(arg1);
			Static665.aClass19_15.method8016(local6, arg1);
		}
		if (Static693.aClass178Array2 == Static246.aClass178Array1) {
			@Pc(28) int local28;
			if (arg0 instanceof Class8_Sub2_Sub1) {
				local6 = ((Class8_Sub2_Sub1) arg0).aShort131;
				local28 = ((Class8_Sub2_Sub1) arg0).aShort132;
			} else {
				local6 = arg0.anInt10718 >> Static52.anInt1070;
				local28 = arg0.anInt10722 >> Static52.anInt1070;
			}
			Static665.aClass19_15.EA(Static706.aClass178Array3[0].method7885(arg0.anInt10722, arg0.anInt10718), Static100.method1987(local6, local28), Static350.method5131(local6, local28), Static339.method5012(local6, local28));
		}
		@Pc(64) Class8_Sub7 local64 = arg0.method9283(Static665.aClass19_15);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean814) {
			@Pc(74) Class8_Sub6[] local74 = local64.aClass8_Sub6Array1;
			for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
				@Pc(81) Class8_Sub6 local81 = local74[local76];
				if (local81.aBoolean352) {
					Static682.method8934(local81.anInt4519 - local81.anInt4516, local81.anInt4517 + local81.anInt4516, local81.anInt4518 - local81.anInt4516, local81.anInt4515 + local81.anInt4516);
				}
			}
		}
		if (local64.aBoolean548) {
			local64.aClass8_Sub2_18 = arg0;
			if (Static661.aBoolean457) {
				synchronized (Static514.aClass215_2) {
					Static514.aClass215_2.method5015(local64);
					return;
				}
			}
			Static514.aClass215_2.method5015(local64);
			return;
		}
		Static281.method4092(local64);
	}
}
