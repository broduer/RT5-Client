import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "Lclient!fla;")
	public static final Class130 aClass130_9 = new Class130();

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)I")
	public static int method5778() {
		return Static448.anInt6817 == 1 ? Static312.anInt5018 : 0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	public static void method5779() {
		Static713.aClass82_231.method2157();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IIIII)V")
	public static void method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static122.rectangles; local5++) {
			@Pc(10) Rectangle local10 = TextureOpSquareWaveform.aRectangleArray1[local5];
			if (arg0 < local10.x + local10.width && local10.x < arg2 + arg0 && local10.height + local10.y > arg1 && local10.y < arg1 + arg3) {
				Static469.rectangleRedraw[local5] = true;
			}
		}
		Static682.method8934(arg1, arg3 + arg1, arg0, arg0 + arg2);
	}
}
