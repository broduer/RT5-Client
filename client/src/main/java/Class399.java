import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public final class Class399 {

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "I")
	public final int anInt10596;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(I)V")
	public Class399(@OriginalArg(0) int arg0) {
		this.anInt10596 = arg0;
	}

	@OriginalMember(owner = "client!wda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
