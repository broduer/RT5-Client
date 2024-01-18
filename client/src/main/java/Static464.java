import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
	public static int anInt7034;

	@OriginalMember(owner = "client!ol", name = "G", descriptor = "[I")
	public static final int[] anIntArray561 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ol", name = "I", descriptor = "Z")
	public static boolean objecttag = false;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!ge;Z)Lclient!hea;")
	public static Class160_Sub1 method6308(@OriginalArg(0) Packet arg0) {
		@Pc(16) Class160 local16 = Static515.method6810(arg0);
		@Pc(20) int local20 = arg0.g3s();
		return new Class160_Sub1(local16.anInt3862, local16.aClass405_9, local16.aClass103_9, local16.anInt3861, local16.anInt3856, local20);
	}
}
