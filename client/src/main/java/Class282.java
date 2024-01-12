import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class282 {

	@OriginalMember(owner = "client!om", name = "g", descriptor = "I")
	public final int anInt7060;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(I)V")
	public Class282(@OriginalArg(0) int arg0) {
		this.anInt7060 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
