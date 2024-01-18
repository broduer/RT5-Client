import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tka")
public final class Class357 {

	@OriginalMember(owner = "client!tka", name = "f", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public Class357(@OriginalArg(0) String name, @OriginalArg(1) String where, @OriginalArg(2) String suffix, @OriginalArg(3) int id) {
		this.id = id;
	}

	@OriginalMember(owner = "client!tka", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
