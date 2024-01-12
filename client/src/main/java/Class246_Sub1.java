import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class246_Sub1 extends Class246 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[Lclient!mc;")
	public final Class239[] aClass239Array1;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "([Lclient!mc;)V")
	public Class246_Sub1(@OriginalArg(0) Class239[] arg0) {
		this.aClass239Array1 = arg0;
	}
}
