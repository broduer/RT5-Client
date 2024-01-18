import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!dla;")
	public static final Class82 aClass82_215 = new Class82(4);

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "Lclient!ss;")
	public static final Class347 aClass347_116 = new Class347(51, -1);

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
	public static int anInt10023 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method8718(@OriginalArg(0) int arg0) {
		Static180.anInt3010 = -1;
		Static558.anInt3190 = -1;
		Static164.anInt2818 = arg0;
		Static387.method5447();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!pq;ZLclient!pq;II)I")
	public static int method8719(@OriginalArg(0) Class299_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class299_Sub1 arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg2.anInt7584;
			local14 = arg0.anInt7584;
			if (!arg1) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static540.method6545(arg0.method6724().aString13, client.lang, arg2.method6724().aString13);
		} else if (arg3 == 3) {
			if (arg2.aString91.equals("-")) {
				if (arg0.aString91.equals("-")) {
					return 0;
				} else if (arg1) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString91.equals("-")) {
				return arg1 ? 1 : -1;
			} else {
				return Static540.method6545(arg0.aString91, client.lang, arg2.aString91);
			}
		} else if (arg3 == 4) {
			if (arg2.method6719()) {
				return arg0.method6719() ? 0 : 1;
			} else if (arg0.method6719()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method6713()) {
				return arg0.method6713() ? 0 : 1;
			} else if (arg0.method6713()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method6715()) {
				return arg0.method6715() ? 0 : 1;
			} else if (arg0.method6715()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method6716()) {
				return arg0.method6716() ? 0 : 1;
			} else if (arg0.method6716()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg2.anInt7593;
			local14 = arg0.anInt7593;
			if (arg1) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg2.anInt7592 - arg0.anInt7592;
		}
	}
}
