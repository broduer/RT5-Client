import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static666 {

	@OriginalMember(owner = "client!vba", name = "K", descriptor = "J")
	public static long aLong301;

	@OriginalMember(owner = "client!vba", name = "M", descriptor = "Lclient!sb;")
	public static Class332 aClass332_118;

	@OriginalMember(owner = "client!vba", name = "H", descriptor = "Z")
	public static boolean aBoolean767 = false;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "(I)V")
	public static void method8700(@OriginalArg(0) int arg0) {
		@Pc(5) Class83 local5 = null;
		try {
			@Pc(18) Class272 local18 = Static446.aClass392_6.method8988("");
			while (local18.anInt6810 == 0) {
				Static638.method8402(1L);
			}
			if (local18.anInt6810 == 1) {
				local5 = (Class83) local18.anObject13;
				@Pc(41) Class2_Sub21 local41 = Static400.aClass2_Sub34_28.method5117();
				local5.method2162(local41.aByteArray93, 0, local41.anInt8412);
			}
		} catch (@Pc(51) Exception local51) {
		}
		try {
			if (local5 != null) {
				local5.method2158();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}
}
