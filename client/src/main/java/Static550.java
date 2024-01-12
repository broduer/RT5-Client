import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
	public static int anInt8294;

	@OriginalMember(owner = "client!rf", name = "t", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_200 = new Class227(116, -1);

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!ca;II)V")
	public static void method7267(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static734.method7697(local6, 0, local6.length, arg2);
		Static651.method8522(local6, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
	public static void method7272(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub2_Sub2 local9 = Static440.method5970(7, (long) arg0);
		local9.method205();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method7273() {
		Static577.method7622(255, -1);
	}
}
