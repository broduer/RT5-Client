import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class SecondaryLinkedList {

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "Lclient!cm;")
	private SecondaryNode cursor;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "Lclient!cm;")
	public final SecondaryNode sentinel = new SecondaryNode();

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "()V")
	public SecondaryLinkedList() {
		this.sentinel.secondaryNext = this.sentinel;
		this.sentinel.secondaryPrev = this.sentinel;
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)Lclient!cm;")
	public SecondaryNode removeHead() {
		@Pc(7) SecondaryNode node = this.sentinel.secondaryNext;
		if (this.sentinel == node) {
			return null;
		} else {
			node.unlinkSecondary();
			return node;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(ZLclient!cm;)V")
	public void addTail(@OriginalArg(1) SecondaryNode node) {
		if (node.secondaryPrev != null) {
			node.unlinkSecondary();
		}
		node.secondaryNext = this.sentinel;
		node.secondaryPrev = this.sentinel.secondaryPrev;
		node.secondaryPrev.secondaryNext = node;
		node.secondaryNext.secondaryPrev = node;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)I")
	public int size() {
		@Pc(5) int size = 0;
		@Pc(17) SecondaryNode node = this.sentinel.secondaryNext;
		while (this.sentinel != node) {
			node = node.secondaryNext;
			size++;
		}
		return size;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Lclient!cm;")
	public SecondaryNode next() {
		@Pc(11) SecondaryNode node = this.cursor;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)V")
	public void clear() {
		while (true) {
			@Pc(3) SecondaryNode node = this.sentinel.secondaryNext;
			if (node == this.sentinel) {
				this.cursor = null;
				return;
			}
			node.unlinkSecondary();
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lclient!cm;")
	public SecondaryNode head() {
		@Pc(18) SecondaryNode node = this.sentinel.secondaryNext;
		if (node == this.sentinel) {
			this.cursor = null;
			return null;
		} else {
			this.cursor = node.secondaryNext;
			return node;
		}
	}
}
