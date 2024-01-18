import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class SecondaryNode extends Node {

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!cm;")
	public SecondaryNode secondaryNext;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!cm;")
	public SecondaryNode secondaryPrev;

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "J")
	public long secondaryKey;

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public final void unlinkSecondary() {
		if (this.secondaryPrev != null) {
			this.secondaryPrev.secondaryNext = this.secondaryNext;
			this.secondaryNext.secondaryPrev = this.secondaryPrev;
			this.secondaryNext = null;
			this.secondaryPrev = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Z")
	public final boolean isSecondaryLinked() {
		return this.secondaryPrev != null;
	}
}
