import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public final class Class379 {

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/lang/String;")
	public final String name;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public final int id;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class379(@OriginalArg(0) String name, @OriginalArg(1) String displayName, @OriginalArg(2) int id) {
		this.name = name;
		this.id = id;
	}

	@OriginalMember(owner = "client!ul", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
