import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class137 implements Interface15 {

	@OriginalMember(owner = "client!ft", name = "c", descriptor = "Lclient!sb;")
	private final Js5 aClass332_39;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!sb;)V")
	public Class137(@OriginalArg(0) Js5 arg0) {
		this.aClass332_39 = arg0;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I")
	@Override
	public int method6472() {
		return this.aClass332_39.method7598() ? 100 : this.aClass332_39.method7589();
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class208 method6471() {
		return Static326.aClass208_1;
	}
}
