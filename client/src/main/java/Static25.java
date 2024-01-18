import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!bp;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt598;

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!lga;")
	public static final Class225 aClass225_11 = new Class225(52, 6);

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!av;")
	public static final Class28 aClass28_4 = new Class28(32);

	@OriginalMember(owner = "client!as", name = "b", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZ)V")
	public static void method323(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static377.anInt5930 != -1) {
				Static347.method3571(Static377.anInt5930);
			}
			for (@Pc(16) Class2_Sub4 local16 = (Class2_Sub4) Static548.aClass28_40.method371(); local16 != null; local16 = (Class2_Sub4) Static548.aClass28_40.method375()) {
				if (!local16.e(-122)) {
					local16 = (Class2_Sub4) Static548.aClass28_40.method371();
					if (local16 == null) {
						break;
					}
				}
				Static449.method4257(false, true, local16);
			}
			Static377.anInt5930 = -1;
			Static548.aClass28_40 = new Class28(8);
			Static656.method4705();
			Static377.anInt5930 = Static65.aClass3_1.anInt82;
			Static640.method5989(false);
			Static469.method4451();
			Static472.method4493(Static377.anInt5930);
		}
		Static461.aBoolean529 = true;
	}
}
