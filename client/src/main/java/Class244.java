import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public final class Class244 implements Interface11 {

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
	public final int anInt6217;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class244(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt6217 = arg1;
	}

	@OriginalMember(owner = "client!mia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
