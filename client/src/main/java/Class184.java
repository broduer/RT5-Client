import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public final class Class184 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "I")
	public final int anInt4587;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public final int anInt4589;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "I")
	public final int anInt4591;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public final int anInt4590;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(IIII)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4587 = arg3;
		this.anInt4589 = arg0;
		this.anInt4591 = arg2;
		this.anInt4590 = arg1;
	}

	@OriginalMember(owner = "client!it", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
