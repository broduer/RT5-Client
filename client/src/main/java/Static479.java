import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "F")
	public static float aFloat123 = 1024.0F;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public static int anInt7201 = 503;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_177 = new Class225(49, 1);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZI)V")
	public static void method4530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub19 local13 = Static293.method3000(Static288.aClass345_58, Static405.aClass153_2.aClass186_1);
		local13.aClass2_Sub21_Sub2_1.method5156(arg1);
		local13.aClass2_Sub21_Sub2_1.method5179(arg0);
		Static405.aClass153_2.method2339(local13);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method4531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method4204(4, (long) arg3);
		local9.method130();
		local9.anInt192 = arg2;
		local9.anInt197 = arg1;
		local9.anInt195 = arg0;
	}
}
