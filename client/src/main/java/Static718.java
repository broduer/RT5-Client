import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static718 {

	@OriginalMember(owner = "client!wo", name = "A", descriptor = "Lclient!ida;")
	public static Class176 aClass176_1;

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "Z")
	public static boolean aBoolean824;

	@OriginalMember(owner = "client!wo", name = "E", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_258 = new Class227(133, -1);

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
	public static boolean aBoolean823 = false;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!re;BLclient!ha;)I")
	public static int method9374(@OriginalArg(0) Class320 arg0, @OriginalArg(2) Class19 arg1) {
		if (arg0.anInt8271 != -1) {
			return arg0.anInt8271;
		}
		if (arg0.anInt8278 != -1) {
			@Pc(31) Class118 local31 = arg1.anInterface4_10.method6824(arg0.anInt8278);
			if (!local31.aBoolean240) {
				return local31.aShort37;
			}
		}
		return arg0.anInt8272;
	}
}