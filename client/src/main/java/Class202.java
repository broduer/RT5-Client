import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class202 implements Interface10 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public final int anInt5013;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class202(@OriginalArg(0) int arg0) {
		this.anInt5013 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return Static667.aClass206_15;
	}
}
