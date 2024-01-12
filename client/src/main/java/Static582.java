import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!sfa", name = "i", descriptor = "Lclient!sb;")
	public static Class332 aClass332_108;

	@OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
	public static int anInt8652;

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
	public static int anInt8653;

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lclient!hc;")
	public static final Class155 aClass155_39 = new Class155(3);

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "I")
	public static int anInt8654 = 7000;

	@OriginalMember(owner = "client!sfa", name = "e", descriptor = "I")
	public static int anInt8651 = anInt8654;

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "Lclient!hw;")
	public static final Class172 aClass172_4 = new Class172();

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Lclient!hda;Z)Lclient!hda;")
	public static Class158 method7665(@OriginalArg(0) Class158 arg0) {
		@Pc(15) Class158 local15 = Static84.method1657(arg0);
		if (local15 == null) {
			local15 = arg0.aClass158_6;
		}
		return local15;
	}
}
