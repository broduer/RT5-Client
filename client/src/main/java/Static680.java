import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static680 {

	@OriginalMember(owner = "client!vja", name = "h", descriptor = "I")
	public static int anInt10317;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!sb;IZ)Lclient!cea;")
	public static Class2_Sub11 method8924(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method7596(arg1);
		return local8 == null ? null : new Class2_Sub11(local8);
	}
}
