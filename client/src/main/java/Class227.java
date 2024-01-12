import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class227 {

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
	private final int anInt5844;

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
	public final int anInt5842;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(II)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5844 = arg0;
		this.anInt5842 = arg1;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public int method5246() {
		return this.anInt5844;
	}

	@OriginalMember(owner = "client!lga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
