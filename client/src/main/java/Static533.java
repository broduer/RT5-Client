import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
	public static final int[] anIntArray628 = new int[1000];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method7126() {
		for (@Pc(8) SecondaryNode_Sub4 local8 = (SecondaryNode_Sub4) Static350.aClass194_8.head(); local8 != null; local8 = (SecondaryNode_Sub4) Static350.aClass194_8.next()) {
			if (local8.anInt1541 > 1) {
				local8.anInt1541 = 0;
				Static717.aClass82_232.put(local8, ((SecondaryNode_Sub16) local8.aClass194_3.sentinel.secondaryNext).aLong234);
				local8.aClass194_3.clear();
			}
		}
		Static31.anInt770 = 0;
		Static594.anInt8801 = 0;
		Static693.aClass341_79.clear();
		Static490.aClass28_34.clear();
		Static350.aClass194_8.clear();
		Static400.aBoolean623 = false;
	}
}
