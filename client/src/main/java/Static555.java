import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "Lclient!sb;")
	public static Class332 aClass332_106;

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_99 = new ClientProt(86, 7);

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "I")
	public static int anInt8328 = 2;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "Lclient!wk;")
	public static final Class405 aClass405_14 = new Class405();

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(III)Z")
	public static boolean method7304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIII)V")
	public static void method7305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub2_Sub2 local14 = Static440.method5970(11, arg2);
		local14.method202();
		local14.anInt197 = arg0;
		local14.anInt195 = arg1;
	}
}
