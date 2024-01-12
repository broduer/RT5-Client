import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "[Lclient!wka;")
	public static final Interface27[] anInterface27Array2 = new Interface27[75];

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_107 = new Class347(92, 3);

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
	public static int anInt8763 = 0;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(IIIII)V")
	public static void method7764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static180.anInt3004 <= arg0 && Static111.anInt2228 >= arg0) {
			@Pc(30) int local30 = Static670.method8739(Static724.anInt10959, Static273.anInt4408, arg2);
			@Pc(36) int local36 = Static670.method8739(Static724.anInt10959, Static273.anInt4408, arg3);
			Static87.method1692(local36, local30, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ[B)I")
	public static int method7765(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static12.method5170(arg0, 0, arg1);
	}
}
