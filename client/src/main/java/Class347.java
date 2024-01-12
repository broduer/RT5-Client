import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class347 {

	@OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
	private final int anInt8853;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
	public final int anInt8851;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(II)V")
	public Class347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8853 = arg0;
		this.anInt8851 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)I")
	public int method7833() {
		return this.anInt8853;
	}
}
