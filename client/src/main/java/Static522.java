import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Calendar;

public final class Static522 {

	@OriginalMember(owner = "client!qha", name = "jd", descriptor = "[Lclient!rr;")
	public static Class328[] aClass328Array1;

	@OriginalMember(owner = "client!qha", name = "Kf", descriptor = "I")
	public static int anInt7923 = 0;

	@OriginalMember(owner = "client!qha", name = "Xd", descriptor = "Lclient!cja;")
	public static Class2_Sub12 aClass2_Sub12_4 = null;

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method7001(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static551.method7283(arg1);
		@Pc(19) int local19 = Static260.aCalendar2.get(Calendar.DATE);
		@Pc(23) int local23 = Static260.aCalendar2.get(Calendar.MONTH);
		@Pc(27) int local27 = Static260.aCalendar2.get(Calendar.YEAR);
		return arg0 == 3 ? Static614.method8250(arg1, arg0) : Integer.toString(local19 / 10) + local19 % 10 + "-" + Static19.aStringArrayArray1[arg0][local23] + "-" + local27;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILclient!bn;)V")
	public static void method7048(@OriginalArg(1) Class2_Sub8 arg0) {
		Static581.aClass2_Sub6_Sub1_3.method934(arg0, false);
		if (Static426.aClass56_2 != null) {
			Static426.aClass56_2.method3582(Static581.aClass2_Sub6_Sub1_3);
		}
		Static62.aClass2_Sub8_3 = null;
		Static96.anInt10199 = 0;
		Static117.aClass2_Sub6_Sub1_2 = null;
		Static12.aClass123_4 = null;
		Static676.aClass332_121 = null;
	}
}
