import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
	public static int anInt5630;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "Z")
	public static boolean aBoolean428 = false;

	@OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
	public static final int anInt5632 = 1409;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "[Lclient!pq;")
	public static Class299_Sub1[] aClass299_Sub1Array2 = new Class299_Sub1[0];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)I")
	public static int method5043(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static659.method8611(arg0 - 1, arg1 + -1) + Static659.method8611(arg0 - 1, arg1 + 1) + Static659.method8611(arg0 + 1, arg1 + -1) + Static659.method8611(arg0 + 1, arg1 + 1);
		@Pc(77) int local77 = Static659.method8611(arg0, arg1 - 1) + Static659.method8611(arg0, arg1 + 1) + Static659.method8611(arg0 + -1, arg1) + Static659.method8611(arg0 - -1, arg1);
		@Pc(82) int local82 = Static659.method8611(arg0, arg1);
		return local77 / 8 + local41 / 16 + local82 / 4;
	}
}
