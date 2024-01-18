import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
	public static int anInt8431;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!ie;Lclient!ie;)V")
	public static void method7375(@OriginalArg(1) Node arg0, @OriginalArg(2) Node arg1) {
		if (arg1.prev != null) {
			arg1.unlink();
		}
		arg1.next = arg0;
		arg1.prev = arg0.prev;
		arg1.prev.next = arg1;
		arg1.next.prev = arg1;
	}
}
