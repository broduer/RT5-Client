import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
	public static void method7677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static122.rectangles; local1++) {
			@Pc(6) Rectangle local6 = Class2_Sub1_Sub28.aRectangleArray1[local1];
			if (arg1 < local6.x + local6.width && arg1 + arg0 > local6.x && local6.height + local6.y > arg3 && local6.y < arg2 + arg3) {
				Static364.aBooleanArray18[local1] = true;
			}
		}
		Static682.method8934(arg3, arg3 + arg2, arg1, arg1 + arg0);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIZ[B)[B")
	public static byte[] method7681(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static734.method7701(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)[Lclient!lga;")
	public static ServerProt[] method7684() {
		return new ServerProt[] { ServerProt.OPCODE_0, ServerProt.OPCODE_1, ServerProt.OPCODE_2, ServerProt.OPCODE_3, ServerProt.OPCODE_4, ServerProt.OPCODE_5, ServerProt.OPCODE_6, ServerProt.OPCODE_7, ServerProt.OPCODE_8, ServerProt.OPCODE_9, ServerProt.OPCODE_10, ServerProt.OPCODE_11, ServerProt.OPCODE_12, ServerProt.OPCODE_13, ServerProt.OPCODE_14, ServerProt.OPCODE_15, ServerProt.OPCODE_16, ServerProt.OPCODE_17, ServerProt.OPCODE_18, ServerProt.OPCODE_19, ServerProt.OPCODE_20, ServerProt.OPCODE_21, ServerProt.OPCODE_22, ServerProt.OPCODE_23, ServerProt.OPCODE_24, ServerProt.OPCODE_25, ServerProt.OPCODE_26, ServerProt.OPCODE_27, ServerProt.OPCODE_28, ServerProt.OPCODE_29, ServerProt.OPCODE_30, ServerProt.OPCODE_31, ServerProt.OPCODE_32, ServerProt.OPCODE_33, ServerProt.OPCODE_34, ServerProt.OPCODE_35, ServerProt.OPCODE_36, ServerProt.OPCODE_37, ServerProt.OPCODE_38, ServerProt.OPCODE_39, ServerProt.OPCODE_40, ServerProt.OPCODE_41, ServerProt.OPCODE_42, ServerProt.OPCODE_43, ServerProt.OPCODE_44, ServerProt.OPCODE_45, ServerProt.OPCODE_46, ServerProt.OPCODE_47, ServerProt.OPCODE_48, ServerProt.OPCODE_49, ServerProt.OPCODE_50, ServerProt.OPCODE_51, ServerProt.OPCODE_52, ServerProt.OPCODE_53, ServerProt.OPCODE_54, ServerProt.OPCODE_55, ServerProt.OPCODE_56, ServerProt.OPCODE_57, ServerProt.OPCODE_58, ServerProt.OPCODE_59, ServerProt.OPCODE_60, ServerProt.OPCODE_61, ServerProt.OPCODE_62, ServerProt.OPCODE_63, ServerProt.OPCODE_64, ServerProt.OPCODE_65, ServerProt.OPCODE_66, ServerProt.OPCODE_67, ServerProt.OPCODE_68, ServerProt.OPCODE_69, ServerProt.OPCODE_70, ServerProt.OPCODE_71, ServerProt.OPCODE_72, ServerProt.OPCODE_73, ServerProt.OPCODE_74, ServerProt.OPCODE_75, ServerProt.OPCODE_76, ServerProt.OPCODE_77, ServerProt.OPCODE_78, ServerProt.OPCODE_79, ServerProt.OPCODE_80, ServerProt.OPCODE_81, ServerProt.OPCODE_82, ServerProt.OPCODE_83, ServerProt.OPCODE_84, ServerProt.OPCODE_85, ServerProt.OPCODE_86, ServerProt.OPCODE_87, ServerProt.OPCODE_88, ServerProt.OPCODE_89, ServerProt.OPCODE_90, ServerProt.OPCODE_91, ServerProt.OPCODE_92, ServerProt.OPCODE_93, ServerProt.OPCODE_94, ServerProt.OPCODE_95, ServerProt.OPCODE_96, ServerProt.OPCODE_97, ServerProt.OPCODE_98, ServerProt.OPCODE_99, ServerProt.OPCODE_100, ServerProt.OPCODE_101, ServerProt.OPCODE_102, ServerProt.OPCODE_103, ServerProt.OPCODE_104, ServerProt.OPCODE_105, ServerProt.OPCODE_106, ServerProt.OPCODE_107, ServerProt.OPCODE_108, ServerProt.OPCODE_109, ServerProt.OPCODE_110, ServerProt.OPCODE_111, ServerProt.OPCODE_112, ServerProt.OPCODE_113, ServerProt.OPCODE_114, ServerProt.OPCODE_115, ServerProt.OPCODE_116, ServerProt.OPCODE_117, ServerProt.OPCODE_118, ServerProt.OPCODE_119, ServerProt.OPCODE_120, ServerProt.OPCODE_121, ServerProt.OPCODE_122, ServerProt.OPCODE_123, ServerProt.OPCODE_124, ServerProt.OPCODE_125, ServerProt.OPCODE_126, ServerProt.OPCODE_127, ServerProt.OPCODE_128, ServerProt.OPCODE_129, ServerProt.OPCODE_130, ServerProt.OPCODE_131, ServerProt.OPCODE_132, ServerProt.OPCODE_133, ServerProt.OPCODE_134, ServerProt.OPCODE_135, ServerProt.OPCODE_136, ServerProt.OPCODE_137, ServerProt.OPCODE_138, ServerProt.OPCODE_139, ServerProt.OPCODE_140, ServerProt.OPCODE_141, ServerProt.OPCODE_142, ServerProt.OPCODE_143, ServerProt.OPCODE_144 };
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z")
	public static boolean method7689(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg3.equals(arg1);
		}
	}
}
