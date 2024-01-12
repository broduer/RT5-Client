import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class146 implements Interface10 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public final int anInt3451;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
	public Class146(@OriginalArg(0) int arg0) {
		this.anInt3451 = arg0;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return Static515.aClass206_10;
	}
}
