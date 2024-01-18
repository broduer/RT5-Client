import java.awt.Container;
import java.awt.Insets;

import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static712 {

	@OriginalMember(owner = "client!wj", name = "Lc", descriptor = "Lclient!tt;")
	public static Class73 aClass73_11;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	public static void method9330() {
		for (@Pc(1) int local1 = 0; local1 < Static125.anInt2361; local1++) {
			@Pc(6) Class8_Sub2_Sub1 local6 = Static679.aClass8_Sub2_Sub1Array1[local1];
			Static549.method8300(local6, true);
			Static679.aClass8_Sub2_Sub1Array1[local1] = null;
		}
		Static125.anInt2361 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "(B)V")
	public static void method9336() {
		synchronized (client.instance) {
			if (GameShell.fullscreenFrame != null) {
				return;
			}
			@Pc(22) Container local22;
			if (GameShell.frame != null) {
				local22 = GameShell.frame;
			} else if (signlink.mainapp == null) {
				local22 = GameShell.instance;
			} else {
				local22 = signlink.mainapp;
			}
			Static52.anInt1063 = local22.getSize().width;
			Static54.anInt1088 = local22.getSize().height;
			@Pc(44) Insets local44;
			if (local22 == GameShell.frame) {
				local44 = GameShell.frame.getInsets();
				Static54.anInt1088 -= local44.top + local44.bottom;
				Static52.anInt1063 -= local44.right + local44.left;
			}
			if (Static36.method978() == 1) {
				GameShell.topMargin = 0;
				GameShell.canvasHeight = Static479.anInt7222;
				GameShell.leftMargin = (Static52.anInt1063 - Static302.anInt4867) / 2;
				GameShell.canvasWidth = Static302.anInt4867;
			} else {
				Static323.method4632();
			}
			if (client.modewhere != Static446.liveMode) {
				@Pc(101) boolean local101;
				if (GameShell.canvasWidth < 1024 && GameShell.canvasHeight < 768) {
					local101 = true;
				} else {
					local101 = false;
				}
			}
			GameShell.canvas.setSize(GameShell.canvasWidth, GameShell.canvasHeight);
			if (Static163.aClass19_17 != null) {
				if (Static137.aBoolean210) {
					Static575.method7613(GameShell.canvas);
				} else {
					Static163.aClass19_17.method7942(GameShell.canvas, GameShell.canvasWidth, GameShell.canvasHeight);
				}
			}
			if (local22 == GameShell.frame) {
				local44 = GameShell.frame.getInsets();
				GameShell.canvas.setLocation(local44.left + GameShell.leftMargin, local44.top + GameShell.topMargin);
			} else {
				GameShell.canvas.setLocation(GameShell.leftMargin, GameShell.topMargin);
			}
			if (Static377.anInt5950 != -1) {
				Static640.method8442(true);
			}
			Static288.method4189();
		}
	}
}
