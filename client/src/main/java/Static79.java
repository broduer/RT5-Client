import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cja", name = "l", descriptor = "I")
	public static int anInt1641;

	@OriginalMember(owner = "client!cja", name = "b", descriptor = "(B)V")
	public static void method1578() {
		for (@Pc(10) Class2_Sub2_Sub4 local10 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4359(); local10 != null; local10 = (Class2_Sub2_Sub4) Static350.aClass194_8.method4357()) {
			if (local10.anInt1541 > 1) {
				local10.anInt1541 = 0;
				Static717.aClass82_232.method2150(local10, ((Class2_Sub2_Sub16) local10.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66).aLong234);
				local10.aClass194_3.method4358();
			}
		}
		Static594.anInt8801 = 0;
		Static31.anInt770 = 0;
		if (98 != 98) {
			anInt1641 = 47;
		}
		Static693.aClass341_79.method7707();
		Static490.aClass28_34.method737();
		Static350.aClass194_8.method4358();
		Static84.method1662(Static525.aClass2_Sub2_Sub16_12);
	}

	@OriginalMember(owner = "client!cja", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1579(@OriginalArg(1) String arg0) {
		if (Static393.aStringArray32 == null) {
			Static279.method4072();
		}
		Static459.aCalendar3.setTime(new Date(Static588.method7722()));
		@Pc(20) int local20 = Static459.aCalendar3.get(11);
		@Pc(31) int local31 = Static459.aCalendar3.get(12);
		@Pc(35) int local35 = Static459.aCalendar3.get(13);
		@Pc(69) String local69 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local31 / 10 + local31 % 10 + ":" + local35 / 10 + local35 % 10;
		@Pc(74) String[] local74 = Static189.method2861(arg0, '\n');
		for (@Pc(76) int local76 = 0; local76 < local74.length; local76++) {
			for (@Pc(79) int local79 = Static512.anInt7687; local79 > 0; local79--) {
				Static393.aStringArray32[local79] = Static393.aStringArray32[local79 - 1];
			}
			Static393.aStringArray32[0] = local69 + ": " + local74[local76];
			if (Static134.aFileOutputStream2 != null) {
				try {
					Static134.aFileOutputStream2.write(Static469.method6368(Static393.aStringArray32[0] + "\n"));
				} catch (@Pc(129) IOException local129) {
				}
			}
			if (Static512.anInt7687 < Static393.aStringArray32.length - 1) {
				Static512.anInt7687++;
				if (Static213.anInt3481 > 0) {
					Static213.anInt3481++;
				}
			}
		}
	}
}
