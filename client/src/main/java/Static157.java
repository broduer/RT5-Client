import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!eu", name = "bb", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_61 = new Class227(46, 3);

	@OriginalMember(owner = "client!eu", name = "ic", descriptor = "I")
	public static int anInt2786 = -1;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V")
	public static void method2560() {
		Static264.aClass82_235.method2157();
		Static123.aClass82_53.method2157();
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIILclient!nda;)V")
	public static void method2564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub2_Sub5 arg4) {
		@Pc(4) Class293 local4 = Static347.method5102(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10718 = (arg1 << Static52.anInt1070) + Static247.anInt4004;
		arg4.anInt10719 = arg3;
		arg4.anInt10722 = (arg2 << Static52.anInt1070) + Static247.anInt4004;
		local4.aClass8_Sub2_Sub5_1 = arg4;
		@Pc(36) int local36 = Static246.aClass178Array1 == Static693.aClass178Array2 ? 1 : 0;
		if (arg4.method9290()) {
			if (arg4.method9289(0)) {
				arg4.aClass8_Sub2_25 = Static398.aClass8_Sub2Array7[local36];
				Static398.aClass8_Sub2Array7[local36] = arg4;
				return;
			}
			arg4.aClass8_Sub2_25 = Static576.aClass8_Sub2Array9[local36];
			Static576.aClass8_Sub2Array9[local36] = arg4;
			Static75.aBoolean521 = true;
			return;
		}
		arg4.aClass8_Sub2_25 = Static468.aClass8_Sub2Array10[local36];
		Static468.aClass8_Sub2Array10[local36] = arg4;
	}
}
