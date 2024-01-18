import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public static int anInt6955;

	@OriginalMember(owner = "client!li", name = "h", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "J")
	public static long aLong219;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "Lclient!it;")
	public static final Class184 aClass184_13 = new Class184(9, 0, 4, 1);

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!nga;")
	public static final Class261 aClass261_14 = new Class261();

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6241(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static110.aString19 = Static110.aString19 + arg0[0];
			Static594.anInt8800 += arg0[0].length();
			return;
		}
		for (@Pc(41) int local41 = 0; local41 < arg0.length; local41++) {
			if (arg0[local41].startsWith("pause")) {
				@Pc(61) int local61 = 5;
				try {
					local61 = Integer.parseInt(arg0[local41].substring(6));
				} catch (@Pc(70) Exception local70) {
				}
				Static79.method1579("Pausing for " + local61 + " seconds...");
				Static144.aStringArray7 = arg0;
				Static523.anInt3896 = local41 + 1;
				Static305.aLong157 = (long) (local61 * 1000) + Static588.currentTimeMillis();
				return;
			}
			Static110.aString19 = arg0[local41];
			Static270.method3920(false);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)I")
	public static int method6242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static65.aClass3_1.anInt81 == -1) {
			return 1;
		}
		if (arg1 != Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922()) {
			Static667.method8702(true, Static32.aClass32_13.method877(client.lang), arg1);
			if (arg1 != Static400.aClass2_Sub34_28.aClass57_Sub29_1.method7922()) {
				return -1;
			}
		}
		try {
			@Pc(43) Dimension local43 = GameShell.canvas.getSize();
			Static694.renderLoadingText(Static163.aClass19_17, Static32.aClass32_13.method877(client.lang), true, Static694.aClass383_13, Static437.aClass14_9);
			@Pc(67) Class88 local67 = Static121.method2201(Static65.aClass3_1.anInt81, Static190.aClass332_38);
			@Pc(70) long local70 = Static588.currentTimeMillis();
			Static163.aClass19_17.la();
			Static460.aClass73_10.method7132(0, Static247.anInt4004, 0);
			Static163.aClass19_17.method8007(Static460.aClass73_10);
			Static163.aClass19_17.DA(local43.width / 2, local43.height / 2, 512, 512);
			Static163.aClass19_17.xa(1.0F);
			Static163.aClass19_17.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(111) Class114 local111 = Static163.aClass19_17.method7959(local67, 2048, 64, 64, 768);
			@Pc(113) int local113 = 0;
			label41: for (@Pc(115) int local115 = 0; local115 < 500; local115++) {
				Static163.aClass19_17.GA(0);
				Static163.aClass19_17.ya();
				for (@Pc(123) int local123 = 15; local123 >= 0; local123--) {
					for (@Pc(126) int local126 = 0; local126 <= local123; local126++) {
						Static59.aClass73_5.method7132((int) ((float) Static340.anInt5606 * (-((float) local123 / 2.0F) + (float) local126)), 0, (local123 + 1) * Static340.anInt5606);
						local111.method7480(Static59.aClass73_5, null, 0);
						local113++;
						if ((long) arg0 <= Static588.currentTimeMillis() - local70) {
							break label41;
						}
					}
				}
			}
			Static163.aClass19_17.method7957();
			@Pc(195) long local195 = (long) (local113 * 1000) / (Static588.currentTimeMillis() - local70);
			Static163.aClass19_17.GA(0);
			Static163.aClass19_17.ya();
			return (int) local195;
		} catch (@Pc(204) Throwable local204) {
			local204.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIIIZ)V")
	public static void method6243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (GameShell.fullscreenFrame != null && (arg2 != 3 || arg3 != Static328.anInt5446 || Static110.anInt2198 != arg1)) {
			Static655.method8569(GameShell.sign, GameShell.fullscreenFrame);
			GameShell.fullscreenFrame = null;
		}
		if (arg2 == 3 && GameShell.fullscreenFrame == null) {
			GameShell.fullscreenFrame = Static489.method6550(0, GameShell.sign, arg1, arg3);
			if (GameShell.fullscreenFrame != null) {
				Static328.anInt5446 = arg3;
				Static110.anInt2198 = arg1;
				Static666.method8700(1);
			}
		}
		if (arg2 == 3 && GameShell.fullscreenFrame == null) {
			method6243(arg0, -1, Static400.aClass2_Sub34_28.aClass57_Sub1_1.method1485(), -1, true);
			return;
		}
		@Pc(95) Container local95;
		@Pc(110) Insets local110;
		if (GameShell.fullscreenFrame != null) {
			Static54.anInt1088 = arg1;
			Static52.anInt1063 = arg3;
			local95 = GameShell.fullscreenFrame;
		} else if (GameShell.frame == null) {
			if (signlink.mainapp == null) {
				local95 = GameShell.instance;
			} else {
				local95 = signlink.mainapp;
			}
			Static52.anInt1063 = local95.getSize().width;
			Static54.anInt1088 = local95.getSize().height;
		} else {
			local110 = GameShell.frame.getInsets();
			Static52.anInt1063 = GameShell.frame.getSize().width - local110.right - local110.left;
			@Pc(126) int local126 = -local110.top;
			Static54.anInt1088 = GameShell.frame.getSize().height + local126 - local110.bottom;
			local95 = GameShell.frame;
		}
		if (arg2 == 1) {
			GameShell.topMargin = 0;
			GameShell.leftMargin = (Static52.anInt1063 - Static302.anInt4867) / 2;
			GameShell.canvasHeight = Static479.anInt7222;
			GameShell.canvasWidth = Static302.anInt4867;
		} else {
			Static323.method4632();
		}
		if (client.modewhere != Static446.liveMode) {
			@Pc(178) boolean local178;
			if (GameShell.canvasWidth < 1024 && GameShell.canvasHeight < 768) {
				local178 = true;
			} else {
				local178 = false;
			}
		}
		if (arg4) {
			Static574.method7579();
		} else {
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (Static137.aBoolean210) {
				Static575.method7613(GameShell.canvas);
			} else {
				Static163.aClass19_17.method7942(GameShell.canvas, GameShell.canvasWidth, GameShell.canvasHeight);
			}
			if (local95 == GameShell.frame) {
				local110 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(GameShell.leftMargin + local110.left, GameShell.topMargin + local110.top);
			} else {
				GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
			}
		}
		if (arg2 >= 2) {
			Static152.aBoolean812 = true;
		} else {
			Static152.aBoolean812 = false;
		}
		if (Static377.anInt5950 != -1) {
			Static640.method8442(true);
		}
		if (Static405.aClass153_2.aClass350_1 != null && Static109.method2070(Static283.anInt4588)) {
			Static371.method5291();
		}
		for (@Pc(258) int local258 = 0; local258 < 100; local258++) {
			Static364.aBooleanArray18[local258] = true;
		}
		GameShell.fullRedraw = true;
	}
}
