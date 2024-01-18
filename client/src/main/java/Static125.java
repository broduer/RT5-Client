import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!vl;")
	public static Class390 aClass390_1;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
	public static int anInt2361 = 0;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIB)Lclient!eq;")
	public static Class110 method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class110 local7 = new Class110();
		local7.anInt2656 = -1;
		local7.anInt2654 = -1;
		local7.anInt2652 = arg0 + 6;
		local7.anInt2662 = arg1 + 5 + 1;
		local7.anIntArrayArray65 = new int[local7.anInt2652][local7.anInt2662];
		local7.method2467();
		return local7;
	}
}
