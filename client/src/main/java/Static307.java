import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "Z")
	private static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!sia;")
	private static final Class341 aClass341_28 = new Class341();

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	private static int anInt4941 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!e;)V")
	public static synchronized void method4484(@OriginalArg(1) Interface5 arg0) {
		if (aBoolean380) {
			return;
		}
		if (anInt4941 <= 0) {
			arg0.w(false);
		} else {
			@Pc(15) Class2_Sub52 local15 = new Class2_Sub52();
			local15.anInterface5_1 = arg0;
			aClass341_28.method7718(local15);
		}
	}

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
	public static synchronized void method4485() {
		while (true) {
			@Pc(4) Class2_Sub52 local4 = (Class2_Sub52) aClass341_28.method7712();
			if (local4 == null) {
				return;
			}
			local4.anInterface5_1.w(true);
			local4.method9464();
		}
	}

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public static synchronized void method4486() {
		anInt4941++;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V")
	public static synchronized void method4487() {
		aBoolean380 = true;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static synchronized void method4488() {
		anInt4941--;
		if (anInt4941 == 0) {
			method4485();
		}
	}
}
