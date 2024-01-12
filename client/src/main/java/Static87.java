import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!cn", name = "i", descriptor = "[Lclient!mga;")
	public static Class243[] aClass243Array1;

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
	public static int anInt1818;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
	public static int anInt1814 = 0;

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_37 = new Class227(97, -1);

	@OriginalMember(owner = "client!cn", name = "l", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_17 = new Class347(35, 7);

	@OriginalMember(owner = "client!cn", name = "k", descriptor = "Lclient!it;")
	public static final Class184 aClass184_4 = new Class184(13, 0, 1, 0);

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIII)V")
	public static void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) int local8;
		if (arg0 >= arg1) {
			for (local8 = arg1; local8 < arg0; local8++) {
				Static723.anIntArrayArray266[local8][arg3] = arg2;
			}
		} else {
			for (local8 = arg0; local8 < arg1; local8++) {
				Static723.anIntArrayArray266[local8][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILjava/lang/String;Lclient!ha;BIII)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static459.aClass23_31 == null || Static1.aClass23_42 == null) {
			if (Static721.aClass332_128.method7588(Static63.anInt1481) && Static721.aClass332_128.method7588(Static282.anInt4430)) {
				Static459.aClass23_31 = arg3.method7955(Static736.method9389(Static721.aClass332_128, Static63.anInt1481, 0), true);
				@Pc(49) Class409 local49 = Static736.method9389(Static721.aClass332_128, Static282.anInt4430, 0);
				Static1.aClass23_42 = arg3.method7955(local49, true);
				local49.method9395();
				Static608.aClass23_41 = arg3.method7955(local49, true);
			} else {
				arg3.aa(arg5, arg4, arg0, 20, Static719.anInt10532 | 255 - Static514.anInt7700 << 24, 1);
			}
		}
		if (Static459.aClass23_31 != null && Static1.aClass23_42 != null) {
			@Pc(82) int local82 = (arg0 - Static1.aClass23_42.method8206() * 2) / Static459.aClass23_31.method8206();
			for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
				Static459.aClass23_31.method8209(arg5 + Static1.aClass23_42.method8206() + local84 * Static459.aClass23_31.method8206(), arg4);
			}
			Static1.aClass23_42.method8209(arg5, arg4);
			Static608.aClass23_41.method8209(arg0 + arg5 - Static608.aClass23_41.method8206(), arg4);
		}
		Static180.aClass14_3.method8836(arg5 + 3, arg4 + 14, arg2, -1, -16777216 | Static563.anInt8479);
		arg3.aa(arg5, arg4 + 20, arg0, arg1 - 20, -Static514.anInt7700 + 255 << 24 | Static719.anInt10532, 1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method1694(@OriginalArg(0) String arg0) {
		Static110.aString19 = arg0;
		Static594.anInt8800 = Static110.aString19.length();
	}
}
