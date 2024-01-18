import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!jw", name = "D", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_132 = new Class225(27, 0);

	@OriginalMember(owner = "client!jw", name = "c", descriptor = "(B)V")
	public static void method3183() {
		@Pc(5) Class82 local5 = Static580.aClass82_186;
		synchronized (Static580.aClass82_186) {
			Static580.aClass82_186.method1391();
		}
		local5 = Static54.aClass82_25;
		synchronized (Static54.aClass82_25) {
			Static54.aClass82_25.method1391();
		}
	}

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	public static void method3185() {
		if (Static2.aClass355_1 != Static16.aClass355_2) {
			try {
				Static727.method54("tbrefresh", Static295.aClient1);
			} catch (@Pc(34) Throwable local34) {
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(BFFFFI[BIIFILclient!tk;I)V")
	public static void method3188(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(6) byte[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6, @OriginalArg(11) Class59 arg7) {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			Static364.method3708(arg0, arg3, local5, arg7, arg4, arg6, arg1, arg5, arg2);
			arg5 += 16384;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Z)V")
	public static void method3190() {
		if (Static134.aFileOutputStream2 != null) {
			try {
				Static134.aFileOutputStream2.close();
			} catch (@Pc(10) IOException local10) {
			}
		}
		Static134.aFileOutputStream2 = null;
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZI)V")
	public static void method3191(@OriginalArg(0) boolean arg0) {
		Static557.method5145();
		if (!Static109.method1321(Static283.anInt4574)) {
			return;
		}
		@Pc(13) Class153[] local13 = Static405.aClass153Array1;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(20) Class153 local20 = local13[local15];
			local20.anInt3647++;
			if (local20.anInt3647 < 50 && !arg0) {
				return;
			}
			local20.anInt3647 = 0;
			if (!local20.aBoolean278 && local20.aClass348_1 != null) {
				@Pc(59) Class2_Sub19 local59 = Static293.method3000(Static415.aClass345_75, local20.aClass186_1);
				local20.method2339(local59);
				try {
					local20.method2337();
				} catch (@Pc(68) IOException local68) {
					local20.aBoolean278 = true;
				}
			}
		}
		Static557.method5145();
	}
}
