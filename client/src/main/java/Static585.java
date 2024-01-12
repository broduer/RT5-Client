import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBII)V")
	public static void method7677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < Static122.anInt2348; local1++) {
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
	public static Class227[] method7684() {
		return new Class227[] { Static699.aClass227_252, Static273.aClass227_113, Static356.aClass227_149, Static155.aClass227_60, Static370.aClass227_152, Static121.aClass227_49, Static269.aClass227_111, Static384.aClass227_156, Static489.aClass227_185, Static303.aClass227_126, Static193.aClass227_74, Static137.aClass227_56, Static451.aClass227_171, Static671.aClass227_246, Static176.aClass227_187, Static40.aClass227_19, Static504.aClass227_188, Static481.aClass227_178, Static655.aClass227_237, Static287.aClass227_119, Static441.aClass227_168, Static641.aClass227_234, Static161.aClass227_62, Static207.aClass227_127, Static137.aClass227_57, Static590.aClass227_217, Static31.aClass227_14, Static314.aClass227_132, Static84.aClass227_36, Static670.aClass227_245, Static353.aClass227_233, Static606.aClass227_221, Static286.aClass227_117, Static109.aClass227_45, Static231.aClass227_102, Static207.aClass227_128, Static331.aClass227_138, Static100.aClass227_43, Static232.aClass227_103, Static40.aClass227_17, Static616.aClass227_223, Static166.aClass227_63, Static444.aClass227_169, Static651.aClass227_235, Static452.aClass227_173, Static464.aClass227_176, Static157.aClass227_61, Static347.aClass227_146, Static18.aClass227_7, Static479.aClass227_177, Static383.aClass227_155, Static12.aClass227_147, Static25.aClass227_11, Static390.aClass227_158, Static51.aClass227_30, Static215.aClass227_86, Static309.aClass227_130, Static225.aClass227_90, Static416.aClass227_165, Static432.aClass227_10, Static125.aClass227_52, Static557.aClass227_205, Static722.aClass227_260, Static679.aClass227_247, Static14.aClass227_5, Static284.aClass227_116, Static297.aClass227_125, Static608.aClass227_222, Static619.aClass227_34, Static91.aClass227_236, Static36.aClass227_15, Static334.aClass227_140, Static250.aClass227_105, Static586.aClass227_215, Static40.aClass227_16, Static125.aClass227_53, Static85.aClass227_257, Static468.aClass227_212, Static526.aClass227_194, Static229.aClass227_101, Static526.aClass227_195, Static618.aClass227_227, Static587.aClass227_216, Static211.aClass227_143, Static205.aClass227_80, Static320.aClass227_135, Static283.aClass227_115, Static446.aClass227_170, Static688.aClass227_250, Static632.aClass227_229, Static133.aClass227_55, Static132.aClass227_54, Static344.aClass227_144, Static636.aClass227_230, Static629.aClass227_228, Static286.aClass227_118, Static41.aClass227_20, Static87.aClass227_37, Static9.aClass227_3, Static570.aClass227_208, Static565.aClass227_76, Static46.aClass227_27, Static408.aClass227_162, Static491.aClass227_254, Static542.aClass227_199, Static706.aClass227_255, Static19.aClass227_8, Static707.aClass227_256, Static605.aClass227_220, Static266.aClass227_192, Static459.aClass227_175, Static617.aClass227_224, Static312.aClass227_131, Static208.aClass227_83, Static533.aClass227_196, Static233.aClass227_104, Static550.aClass227_200, Static660.aClass227_239, Static331.aClass227_139, Static598.aClass227_219, Static663.aClass227_241, Static389.aClass227_157, Static721.aClass227_259, Static428.aClass227_167, Static346.aClass227_145, Static72.aClass227_35, Static404.aClass227_161, Static563.aClass227_207, Static291.aClass227_123, Static663.aClass227_240, Static410.aClass227_163, Static224.aClass227_89, Static40.aClass227_18, Static718.aClass227_258, Static305.aClass227_129, Static411.aClass227_164, Static201.aClass227_206, Static119.aClass227_47, Static266.aClass227_191, Static692.aClass227_251, Static454.aClass227_174, Static618.aClass227_226, Static491.aClass227_253, Static272.aClass227_112, Static214.aClass227_85 };
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
