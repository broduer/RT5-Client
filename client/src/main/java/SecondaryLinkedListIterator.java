import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class SecondaryLinkedListIterator {

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "Lclient!cm;")
	private SecondaryNode cursor;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "Lclient!jga;")
	private SecondaryLinkedList list;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	private SecondaryLinkedListIterator() {
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lclient!jga;)V")
	public SecondaryLinkedListIterator(@OriginalArg(0) SecondaryLinkedList arg0) {
		this.list = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)Lclient!cm;")
	public SecondaryNode next() {
		@Pc(6) SecondaryNode node = this.cursor;
		if (node == this.list.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lclient!cm;")
	public SecondaryNode head() {
		@Pc(14) SecondaryNode node = this.list.sentinel.secondaryNext;
		if (this.list.sentinel == node) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}
}
