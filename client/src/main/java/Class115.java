import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public final class Class115 implements Interface15 {

	@OriginalMember(owner = "client!ev", name = "h", descriptor = "Ljava/lang/String;")
	private final String aString29;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!sb;")
	private final Js5 aClass332_30;

	@OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lclient!sb;Ljava/lang/String;)V")
	public Class115(@OriginalArg(0) Js5 arg0, @OriginalArg(1) String arg1) {
		this.aString29 = arg1;
		this.aClass332_30 = arg0;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)I")
	@Override
	public int method6472() {
		return this.aClass332_30.method7605(this.aString29) ? 100 : this.aClass332_30.method7600(this.aString29);
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class208 method6471() {
		return Static326.aClass208_3;
	}
}
