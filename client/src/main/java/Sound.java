import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class Sound extends Class2 {

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
	public int position;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	protected Sound() {
	}
}
