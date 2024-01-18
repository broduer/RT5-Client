import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static726 {

	@OriginalMember(owner = "client!za", name = "k", descriptor = "Lclient!om;")
	public static Class282 aClass282_7;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method9470(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(11) String local11 = Static390.method5499(arg0);
		if (local11 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static436.anInt3860; local25++) {
			@Pc(30) String local30 = Static632.aStringArray44[local25];
			@Pc(34) String local34 = Static390.method5499(local30);
			if (Static585.method7689(arg0, local34, local30, local11)) {
				Static436.anInt3860--;
				for (@Pc(47) int local47 = local25; local47 < Static436.anInt3860; local47++) {
					Static632.aStringArray44[local47] = Static632.aStringArray44[local47 + 1];
					Static446.aStringArray35[local47] = Static446.aStringArray35[local47 + 1];
					Static10.aStringArray1[local47] = Static10.aStringArray1[local47 + 1];
					Static316.aStringArray41[local47] = Static316.aStringArray41[local47 + 1];
					Static65.aBooleanArray2[local47] = Static65.aBooleanArray2[local47 + 1];
				}
				Static344.anInt5641 = Static642.anInt9625;
				@Pc(101) Class153 local101 = Static668.method8708();
				@Pc(107) Node_Sub19 local107 = Static293.method4342(Static8.aClass347_1, local101.aClass186_1);
				local107.aClass2_Sub21_Sub2_1.p1(Static231.method3379(arg0));
				local107.aClass2_Sub21_Sub2_1.pjstr(arg0);
				local101.method3275(local107);
				return;
			}
		}
	}
}
