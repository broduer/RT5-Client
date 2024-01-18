import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
	public static int anInt4376;

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
	public static void method3930() {
		@Pc(10) Node_Sub25 local10;
		for (local10 = (Node_Sub25) Static159.aClass341_15.head(); local10 != null; local10 = (Node_Sub25) Static159.aClass341_15.next()) {
			Static544.method7221(local10, false);
		}
		for (local10 = (Node_Sub25) Static227.aClass341_18.head(); local10 != null; local10 = (Node_Sub25) Static227.aClass341_18.next()) {
			Static544.method7221(local10, true);
		}
	}
}
