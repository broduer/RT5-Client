import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static668 {

	@OriginalMember(owner = "client!vca", name = "r", descriptor = "Lclient!lja;")
	public static Class231 aClass231_5;

	@OriginalMember(owner = "client!vca", name = "o", descriptor = "Lclient!sb;")
	public static Class332 aClass332_119;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "Lclient!pc;")
	public static final Class289 aClass289_16 = new Class289(12, 7);

	@OriginalMember(owner = "client!vca", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray244 = new int[128][128];

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
	public static void method8707(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static30.aClass2_Sub2_Sub13_3 != null) {
			Static357.anInt6524 = Static30.aClass2_Sub2_Sub13_3.anInt4577;
		} else {
			Static357.anInt6524 = -1;
		}
		Static551.aClass341_54 = null;
		Static210.aClass158_4 = null;
		Static30.aClass2_Sub2_Sub13_3 = null;
		Static273.anInt4416 = 0;
		Static30.method5077();
		Static30.aClass341_31.method7707();
		Static359.aClass329_3 = null;
		Static484.aClass329_6 = null;
		Static30.aClass257_3 = null;
		Static651.aClass329_8 = null;
		Static180.anInt3010 = -1;
		Static13.aClass23_4 = null;
		Static142.aClass329_1 = null;
		Static390.aClass329_5 = null;
		Static559.aClass329_7 = null;
		Static364.aClass329_4 = null;
		Static275.aClass329_2 = null;
		Static558.anInt3190 = -1;
		if (Static30.aClass248_3 != null) {
			Static30.aClass248_3.method5593();
			Static30.aClass248_3.method5590(128, 64);
		}
		if (Static30.aClass365_3 != null) {
			Static30.aClass365_3.method8372(64, 64);
		}
		if (Static30.aClass142_3 != null) {
			Static30.aClass142_3.method3062(64);
		}
		Static529.aClass161_1.method3420(64);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)Lclient!gw;")
	public static Class153 method8708() {
		return Static620.method8328(Static283.anInt4588) ? Static405.aClass153_1 : Static405.aClass153_2;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)I")
	public static int method8709(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	public static void method8710() {
		if (Static566.anInt8496 < 102) {
			Static566.anInt8496 += 6;
		}
		@Pc(26) int local26;
		if (Static523.anInt3896 != -1 && Static305.aLong157 < Static588.currentTimeMillis()) {
			for (local26 = Static523.anInt3896; local26 < Static144.aStringArray7.length; local26++) {
				if (Static144.aStringArray7[local26].startsWith("pause")) {
					@Pc(40) int local40 = 5;
					try {
						local40 = Integer.parseInt(Static144.aStringArray7[local26].substring(6));
					} catch (@Pc(49) Exception local49) {
					}
					Static79.method1579("Pausing for " + local40 + " seconds...");
					Static523.anInt3896 = local26 + 1;
					Static305.aLong157 = (long) (local40 * 1000) + Static588.currentTimeMillis();
					return;
				}
				Static110.aString19 = Static144.aStringArray7[local26];
				Static270.method3920(false);
			}
			Static523.anInt3896 = -1;
		}
		if (Static611.anInt9367 != 0) {
			Static213.anInt3481 -= Static611.anInt9367 * 5;
			if (Static213.anInt3481 >= Static512.anInt7687) {
				Static213.anInt3481 = Static512.anInt7687 - 1;
			}
			Static611.anInt9367 = 0;
			if (Static213.anInt3481 < 0) {
				Static213.anInt3481 = 0;
			}
		}
		for (local26 = 0; local26 < Static671.anInt10053; local26++) {
			@Pc(147) Interface27 local147 = Static194.anInterface27Array1[local26];
			@Pc(151) int local151 = local147.method2664();
			@Pc(155) char local155 = local147.method2666();
			@Pc(159) int local159 = local147.method2667();
			if (local151 == 84) {
				Static270.method3920(false);
			}
			if (local151 == 80) {
				Static270.method3920(true);
			} else if (local151 == 66 && (local159 & 0x4) != 0) {
				if (Static175.clipboard != null) {
					@Pc(467) String local467 = "";
					for (@Pc(472) int local472 = Static393.aStringArray32.length - 1; local472 >= 0; local472--) {
						if (Static393.aStringArray32[local472] != null && Static393.aStringArray32[local472].length() > 0) {
							local467 = local467 + Static393.aStringArray32[local472] + '\n';
						}
					}
					Static175.clipboard.setContents(new StringSelection(local467), null);
				}
			} else if (local151 == 67 && (local159 & 0x4) != 0) {
				if (Static175.clipboard != null) {
					try {
						@Pc(207) Transferable local207 = Static175.clipboard.getContents(null);
						if (local207 != null) {
							@Pc(214) String local214 = (String) local207.getTransferData(DataFlavor.stringFlavor);
							if (local214 != null) {
								@Pc(221) String[] local221 = Static189.method2861(local214, '\n');
								Static363.method6241(local221);
							}
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			} else if (local151 == 85 && Static594.anInt8800 > 0) {
				Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8800 - 1) + Static110.aString19.substring(Static594.anInt8800);
				Static594.anInt8800--;
			} else if (local151 == 101 && Static594.anInt8800 < Static110.aString19.length()) {
				Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8800) + Static110.aString19.substring(Static594.anInt8800 + 1);
			} else if (local151 == 96 && Static594.anInt8800 > 0) {
				Static594.anInt8800--;
			} else if (local151 == 97 && Static594.anInt8800 < Static110.aString19.length()) {
				Static594.anInt8800++;
			} else if (local151 == 102) {
				Static594.anInt8800 = 0;
			} else if (local151 == 103) {
				Static594.anInt8800 = Static110.aString19.length();
			} else if (local151 == 104 && Static393.aStringArray32.length > Static625.anInt9498) {
				Static625.anInt9498++;
				Static344.method5053();
				Static594.anInt8800 = Static110.aString19.length();
			} else if (local151 == 105 && Static625.anInt9498 > 0) {
				Static625.anInt9498--;
				Static344.method5053();
				Static594.anInt8800 = Static110.aString19.length();
			} else if (Static596.method7822(local155) || "\\/.:, _-+[]~@".indexOf(local155) != -1) {
				Static110.aString19 = Static110.aString19.substring(0, Static594.anInt8800) + Static194.anInterface27Array1[local26].method2666() + Static110.aString19.substring(Static594.anInt8800);
				Static594.anInt8800++;
			}
		}
		Static216.anInt3540 = 0;
		Static671.anInt10053 = 0;
		Static469.method6369();
	}
}
