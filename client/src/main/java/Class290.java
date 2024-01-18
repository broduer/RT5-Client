import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class290 implements Interface15 {

	@OriginalMember(owner = "client!pca", name = "h", descriptor = "Lclient!sb;")
	private final Js5 aClass332_94;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "Ljava/lang/String;")
	private final String aString83;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lclient!sb;Ljava/lang/String;)V")
	public Class290(@OriginalArg(0) Js5 arg0, @OriginalArg(1) String arg1) {
		this.aClass332_94 = arg0;
		this.aString83 = arg1;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)I")
	@Override
	public int method6472() {
		return this.aClass332_94.method7585(this.aString83) ? 100 : 0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Lclient!kf;")
	@Override
	public Class208 method6471() {
		return Static326.aClass208_2;
	}
}
