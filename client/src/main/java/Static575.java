import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
	public static void method5370(@OriginalArg(0) Canvas arg0) {
		@Pc(6) Dimension local6 = arg0.getSize();
		Static388.method3861(local6.height, local6.width);
		if (Static448.anInt6796 == 1) {
			Static74.aClass19_4.a(arg0, Static571.anInt8534, Static576.anInt8585);
		} else {
			Static74.aClass19_4.a(arg0, Static252.anInt4078, Static281.anInt4566);
		}
	}
}
