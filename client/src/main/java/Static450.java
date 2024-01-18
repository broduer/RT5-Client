import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
	public static int anInt6840;

	@OriginalMember(owner = "client!oda", name = "r", descriptor = "Lclient!gaa;")
	public static Interface9 anInterface9_1;

	@OriginalMember(owner = "client!oda", name = "v", descriptor = "Lclient!pc;")
	public static final Class289 aClass289_14 = new Class289(0, 4);

	@OriginalMember(owner = "client!oda", name = "n", descriptor = "Lclient!uf;")
	public static final Class372 aClass372_6 = new Class372();

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BII)V")
	public static void method6134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) SecondaryNode_Sub2 local16 = Static440.method5970(7, arg1);
		local16.method202();
		local16.anInt197 = arg0;
	}
}
