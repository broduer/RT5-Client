import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_196 = new Class227(114, 4);

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
	public static final int[] anIntArray628 = new int[1000];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public static void method7126() {
		for (@Pc(8) Class2_Sub2_Sub4 local8 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4359(); local8 != null; local8 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4357()) {
			if (local8.anInt1541 > 1) {
				local8.anInt1541 = 0;
				Static717.aClass82_232.method2150(local8, ((Class2_Sub2_Sub16) local8.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66).aLong234);
				local8.aClass194_3.method4358();
			}
		}
		Static31.anInt770 = 0;
		Static594.anInt8801 = 0;
		Static693.aClass341_79.method7707();
		Static490.aClass28_34.method737();
		Static350.aClass194_8.method4358();
		Static400.aBoolean623 = false;
	}
}
