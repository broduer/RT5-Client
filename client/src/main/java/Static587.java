import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!sia", name = "h", descriptor = "I")
	public static int anInt8712;

	@OriginalMember(owner = "client!sia", name = "m", descriptor = "I")
	public static int anInt8697 = 0;

	@OriginalMember(owner = "client!sia", name = "n", descriptor = "Z")
	public static boolean aBoolean664 = false;

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "[I")
	public static final int[] anIntArray689 = new int[] { 0xFFFF00, 0xFF0000, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!sia", name = "i", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_104 = new ClientProt(46, 3);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_105 = new ClientProt(87, 6);

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!d;IIILjava/awt/Canvas;)Lclient!ha;")
	public static Class19 method7705(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Canvas arg3) {
		return new oa(arg3, arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!sia", name = "b", descriptor = "(I)V")
	public static void method7711() {
		if (!Static60.aBoolean86) {
			return;
		}
		while (true) {
			while (Static343.aClass299_Sub1Array2.length > Static419.anInt6454) {
				@Pc(26) Class299_Sub1 local26 = Static343.aClass299_Sub1Array2[Static419.anInt6454];
				if (local26 != null && local26.anInt7593 == -1) {
					if (Static522.aClass2_Sub12_4 == null) {
						Static522.aClass2_Sub12_4 = Static151.aClass228_20.method5252(local26.aString90);
					}
					@Pc(54) int local54 = Static522.aClass2_Sub12_4.anInt1638;
					if (local54 == -1) {
						return;
					}
					Static419.anInt6454++;
					Static522.aClass2_Sub12_4 = null;
					local26.anInt7593 = local54;
				} else {
					Static419.anInt6454++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sia", name = "g", descriptor = "(I)[Lclient!oga;")
	public static Class275[] method7717() {
		if (Static679.aClass275Array1 == null) {
			@Pc(20) Class275[] local20 = Static673.method8794(GameShell.sign, true);
			@Pc(24) Class275[] local24 = new Class275[local20.length];
			@Pc(26) int local26 = 0;
			@Pc(31) int local31 = Static400.aClass2_Sub34_28.aClass57_Sub18_1.method5774();
			@Pc(112) int local112;
			@Pc(117) Class275 local117;
			label69: for (@Pc(33) int local33 = 0; local33 < local20.length; local33++) {
				@Pc(38) Class275 local38 = local20[local33];
				if ((local38.anInt6934 <= 0 || local38.anInt6934 >= 24) && local38.anInt6939 >= 800 && local38.anInt6933 >= 600 && (local31 != 2 || local38.anInt6939 <= 800 && local38.anInt6933 <= 600) && (local31 != 1 || local38.anInt6939 <= 1024 && local38.anInt6933 <= 768)) {
					for (local112 = 0; local112 < local26; local112++) {
						local117 = local24[local112];
						if (local38.anInt6939 == local117.anInt6939 && local38.anInt6933 == local117.anInt6933) {
							if (local117.anInt6934 < local38.anInt6934) {
								local24[local112] = local38;
							}
							continue label69;
						}
					}
					local24[local26] = local38;
					local26++;
				}
			}
			Static679.aClass275Array1 = new Class275[local26];
			Static734.method7698(local24, 0, Static679.aClass275Array1, 0, local26);
			@Pc(175) int[] local175 = new int[Static679.aClass275Array1.length];
			for (local112 = 0; local112 < Static679.aClass275Array1.length; local112++) {
				local117 = Static679.aClass275Array1[local112];
				local175[local112] = local117.anInt6933 * local117.anInt6939;
			}
			Static510.method6770(Static679.aClass275Array1, local175);
		}
		return Static679.aClass275Array1;
	}
}
