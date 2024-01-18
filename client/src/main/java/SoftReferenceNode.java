import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public final class SoftReferenceNode extends ReferenceNode {

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
	private final SoftReference reference;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public SoftReferenceNode(@OriginalArg(0) Object referent, @OriginalArg(1) int arg1) {
		super(arg1);
		this.reference = new SoftReference(referent);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object get() {
		return this.reference.get();
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)Z")
	@Override
	public boolean isSoft() {
		return true;
	}
}
