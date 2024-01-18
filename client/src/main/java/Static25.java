import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt600;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!av;")
	public static final HashTable aClass28_4 = new HashTable(32);

	@OriginalMember(owner = "client!as", name = "b", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZ)V")
	public static void method688(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static377.anInt5950 != -1) {
				Static347.method5101(Static377.anInt5950);
			}
			for (@Pc(16) Node_Sub4 local16 = (Node_Sub4) Static548.aClass28_40.method736(); local16 != null; local16 = (Node_Sub4) Static548.aClass28_40.method740()) {
				if (!local16.isLinked()) {
					local16 = (Node_Sub4) Static548.aClass28_40.method736();
					if (local16 == null) {
						break;
					}
				}
				Static449.method6122(false, true, local16);
			}
			Static377.anInt5950 = -1;
			Static548.aClass28_40 = new HashTable(8);
			Static656.method6699();
			Static377.anInt5950 = Static65.aClass3_1.anInt82;
			Static640.method8442(false);
			Static469.method6369();
			Static472.method6421(Static377.anInt5950);
		}
		Static461.aBoolean529 = true;
	}
}
