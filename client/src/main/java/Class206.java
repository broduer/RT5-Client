import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public final class Class206 {

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	public final int anInt5131;

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(II)V")
	public Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5131 = arg1;
	}

	@OriginalMember(owner = "client!kda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
