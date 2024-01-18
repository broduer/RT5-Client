import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Calendar;

public final class Static614 {

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	public static int anInt9399;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Z")
	public static final boolean aBoolean719 = false;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZJ)I")
	public static int method8249(@OriginalArg(1) long arg0) {
		Static551.method7283(arg0);
		return Static260.aCalendar2.get(Calendar.YEAR);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JBI)Ljava/lang/String;")
	public static String method8250(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static551.method7283(arg0);
		@Pc(17) int local17 = Static260.aCalendar2.get(Calendar.DATE);
		@Pc(23) int local23 = Static260.aCalendar2.get(Calendar.MONTH) + 1;
		@Pc(27) int local27 = Static260.aCalendar2.get(Calendar.YEAR);
		return Integer.toString(local17 / 10) + local17 % 10 + "/" + local23 / 10 + local23 % 10 + "/" + local27 % 100 / 10 + local27 % 10;
	}

}
