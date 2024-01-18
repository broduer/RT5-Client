import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
	public static int anInt4597 = -2;

	@OriginalMember(owner = "client!iu", name = "i", descriptor = "Z")
	public static boolean aBoolean355 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(ZILclient!sb;Ljava/lang/String;)Lclient!nc;")
	public static Class257 method4103(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class332 arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg1.getGroupId(arg2);
		if (local8 == -1) {
			return new Class257(0);
		}
		@Pc(24) int[] local24 = arg1.method7610(local8);
		@Pc(30) Class257 local30 = new Class257(local24.length);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		while (true) {
			while (local30.anInt6393 > local32) {
				@Pc(47) Packet local47 = new Packet(arg1.method7602(local24[local34++], local8));
				@Pc(51) int local51 = local47.g4();
				@Pc(57) int local57 = local47.g2();
				@Pc(61) int local61 = local47.g1();
				if (!arg0 && local61 == 1) {
					local30.anInt6393--;
				} else {
					local30.anIntArray495[local32] = local51;
					local30.anIntArray496[local32] = local57;
					local32++;
				}
			}
			return local30;
		}
	}
}
