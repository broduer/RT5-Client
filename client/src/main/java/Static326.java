import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!kf;")
	public static final Class208 aClass208_1 = new Class208();

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!kf;")
	public static final Class208 aClass208_2 = new Class208();

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!kf;")
	public static final Class208 aClass208_3 = new Class208();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!kf;")
	public static final Class208 aClass208_4 = new Class208();

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!ca;)I")
	public static int method4877(@OriginalArg(1) Class8_Sub2_Sub1_Sub2_Sub1 arg0) {
		@Pc(6) int local6 = arg0.anInt1452;
		@Pc(10) BasType local10 = arg0.method9324();
		@Pc(15) int local15 = arg0.aClass152_10.method9121();
		if (local15 == -1 || arg0.aBoolean818) {
			local6 = arg0.anInt1462;
		} else if (local10.anInt7247 == local15 || local15 == local10.anInt7262 || local10.anInt7281 == local15 || local10.anInt7261 == local15) {
			local6 = arg0.anInt1476;
		} else if (local10.anInt7256 == local15 || local10.anInt7283 == local15 || local10.anInt7289 == local15 || local10.anInt7260 == local15) {
			local6 = arg0.anInt1466;
		}
		return local6;
	}
}
