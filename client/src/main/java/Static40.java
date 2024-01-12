import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static40 {

	@OriginalMember(owner = "client!bfa", name = "l", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_16 = new Class227(74, 11);

	@OriginalMember(owner = "client!bfa", name = "p", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_17 = new Class227(39, 6);

	@OriginalMember(owner = "client!bfa", name = "n", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_18 = new Class227(132, -2);

	@OriginalMember(owner = "client!bfa", name = "o", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_19 = new Class227(15, 0);

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIIIIB)J")
	public static long method1026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static260.aCalendar1.clear();
		Static260.aCalendar1.set(arg1, arg0, arg2, 12, 0, 0);
		return Static260.aCalendar1.getTime().getTime();
	}
}
