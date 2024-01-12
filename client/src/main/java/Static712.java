import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static712 {

	@OriginalMember(owner = "client!wj", name = "Lc", descriptor = "Lclient!tt;")
	public static Class73 aClass73_11;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()V")
	public static void method9330() {
		for (@Pc(1) int local1 = 0; local1 < Static125.anInt2361; local1++) {
			@Pc(6) Class8_Sub2_Sub1 local6 = Static679.aClass8_Sub2_Sub1Array1[local1];
			Static549.method8300(local6, true);
			Static679.aClass8_Sub2_Sub1Array1[local1] = null;
		}
		Static125.anInt2361 = 0;
	}

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "(B)V")
	public static void method9336(@OriginalArg(0) byte arg0) {
		@Pc(7) client local7 = Static295.aClient1;
		synchronized (Static295.aClient1) {
			if (Static316.aFrame8 != null) {
				return;
			}
			@Pc(22) Container local22;
			if (Static353.aFrame10 != null) {
				local22 = Static353.aFrame10;
			} else if (Static166.anApplet1 == null) {
				local22 = Static149.anApplet_Sub1_1;
			} else {
				local22 = Static166.anApplet1;
			}
			Static52.anInt1063 = local22.getSize().width;
			Static54.anInt1088 = local22.getSize().height;
			@Pc(44) Insets local44;
			if (local22 == Static353.aFrame10) {
				local44 = Static353.aFrame10.getInsets();
				Static54.anInt1088 -= local44.top + local44.bottom;
				Static52.anInt1063 -= local44.right + local44.left;
			}
			if (Static36.method978(arg0 - 8) == 1) {
				Static241.anInt3973 = 0;
				Static380.anInt5999 = Static479.anInt7222;
				Static134.anInt10357 = (Static52.anInt1063 - Static302.anInt4867) / 2;
				Static680.anInt10317 = Static302.anInt4867;
			} else {
				Static323.method4632();
			}
			if (Static2.aClass357_1 != Static446.aClass357_5) {
				@Pc(101) boolean local101;
				if (Static680.anInt10317 < 1024 && Static380.anInt5999 < 768) {
					local101 = true;
				} else {
					local101 = false;
				}
			}
			Static434.aCanvas7.setSize(Static680.anInt10317, Static380.anInt5999);
			if (Static163.aClass19_17 != null) {
				if (Static137.aBoolean210) {
					Static575.method7613(Static434.aCanvas7);
				} else {
					Static163.aClass19_17.method7942(Static434.aCanvas7, Static680.anInt10317, Static380.anInt5999);
				}
			}
			if (local22 == Static353.aFrame10) {
				local44 = Static353.aFrame10.getInsets();
				Static434.aCanvas7.setLocation(local44.left + Static134.anInt10357, local44.top + Static241.anInt3973);
			} else {
				Static434.aCanvas7.setLocation(Static134.anInt10357, Static241.anInt3973);
			}
			if (Static377.anInt5950 != -1) {
				Static640.method8442(true);
			}
			Static288.method4189();
		}
		if (arg0 != 11) {
			aClass73_11 = null;
		}
	}
}
