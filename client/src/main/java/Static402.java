import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Lclient!ss;")
	public static final Class345 aClass345_72 = new Class345(76, 7);

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "[B")
	public static final byte[] aByteArray68 = new byte[2048];

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Z")
	public static boolean method3959(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static58.method767(arg0, arg1) || Static598.method5557(arg1, arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)I")
	public static int method3960() {
		return Static129.anInt2406;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public static void method3962() {
		Static627.aClass82_200.method1381(50);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)Lclient!uja;")
	public static Class376 method3964(@OriginalArg(1) int arg0) {
		@Pc(10) Class376 local10 = (Class376) Static153.aClass82_56.method1390((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static331.aClass330_65.method5359(arg0, 0);
		local10 = new Class376();
		if (local21 != null) {
			local10.method6060(arg0, new Class2_Sub21(local21));
		}
		Static153.aClass82_56.method1384(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)I")
	public static int method3969(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(19) int local19 = local13 | local13 >>> 2;
		@Pc(25) int local25 = local19 | local19 >>> 4;
		@Pc(40) int local40 = local25 | local25 >>> 8;
		@Pc(46) int local46 = local40 | local40 >>> 16;
		return ~local46 & arg0;
	}
}
