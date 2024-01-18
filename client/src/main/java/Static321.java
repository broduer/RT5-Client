import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!kca", name = "V", descriptor = "I")
	public static int anInt5130;

	@OriginalMember(owner = "client!kca", name = "w", descriptor = "Lclient!ss;")
	public static final ClientProt aClass347_64 = new ClientProt(58, 2);

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
	public static int anInt5128 = 0;

	@OriginalMember(owner = "client!kca", name = "O", descriptor = "[I")
	public static final int[] anIntArray388 = new int[2048];

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIZ)V")
	public static void method4626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(23) Class2_Sub2_Sub2 local23 = Static440.method5970(18, (long) arg1 << 32 | (long) arg0);
		local23.method205();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)Lclient!wca;")
	public static Class398 method4627() {
		return new Class398(1, false);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(II)Z")
	public static boolean method4629(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class2_Sub2_Sub16 local8 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7706(65280); local8 != null; local8 = (Class2_Sub2_Sub16) Static693.aClass341_79.method7713()) {
			if (Static598.method7832(local8.anInt7335) && local8.aLong233 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
