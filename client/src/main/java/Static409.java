import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!r;II)Lclient!wk;")
	public static SynthSound method6435(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg0.fetchFile(arg2, arg1);
		return local5 == null ? null : new SynthSound(new Buffer(local5));
	}
}
