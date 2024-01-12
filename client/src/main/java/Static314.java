import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
	public static int anInt5052;

	@OriginalMember(owner = "client!jw", name = "D", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_132 = new Class227(27, 0);

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)V")
	public static void method4567() {
		@Pc(5) Class82 local5 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			Static580.aClass82_186.method2157();
		}
		local5 = Static54.aClass82_25;
		synchronized (Static54.aClass82_25) {
			Static54.aClass82_25.method2157();
		}
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	public static void method4569() {
		if (Static2.aClass357_1 != Static16.aClass357_2) {
			try {
				Static727.method97("tbrefresh", Static295.aClient1);
			} catch (@Pc(34) Throwable local34) {
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BFFFFI[BIIFILclient!tk;I)V")
	public static void method4572(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) byte[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6, @OriginalArg(11) Class59 arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static364.method5258(arg0, arg3, local5, arg7, arg4, arg6, arg1, arg5, arg2);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
	public static void method4574() {
		if (Static134.aFileOutputStream2 != null) {
			try {
				Static134.aFileOutputStream2.close();
			} catch (@Pc(10) IOException local10) {
			}
		}
		Static134.aFileOutputStream2 = null;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZI)V")
	public static void method4575(@OriginalArg(0) boolean arg0) {
		Static557.method7338();
		if (!Static109.method2070(Static283.anInt4588)) {
			return;
		}
		@Pc(13) Class153[] local13 = Static405.aClass153Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(20) Class153 local20 = local13[local15];
			local20.anInt3657++;
			if (local20.anInt3657 < 50 && !arg0) {
				return;
			}
			local20.anInt3657 = 0;
			if (!local20.aBoolean278 && local20.aClass350_1 != null) {
				@Pc(59) Class2_Sub19 local59 = Static293.method4342(Static415.aClass347_75, local20.aClass186_1);
				local20.method3275(local59);
				try {
					local20.method3273();
				} catch (@Pc(68) IOException local68) {
					local20.aBoolean278 = true;
				}
			}
		}
		Static557.method7338();
	}
}
