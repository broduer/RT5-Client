import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class LruHashTable {

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!cm;")
	private SecondaryNode aClass2_Sub2_57 = new SecondaryNode();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!av;")
	private final HashTable table;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	public LruHashTable(@OriginalArg(0) int capacity) {
		this.available = capacity;
		this.capacity = capacity;
		@Pc(19) int bucketCount;
		for (bucketCount = 1; bucketCount + bucketCount < capacity; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!cm;J)V")
	public void put(@OriginalArg(1) SecondaryNode node, @OriginalArg(2) long key) {
		if (this.available == 0) {
			@Pc(19) SecondaryNode first = this.queue.removeHead();
			first.unlink();
			first.unlinkSecondary();
			if (this.aClass2_Sub2_57 == first) {
				first = this.queue.removeHead();
				first.unlink();
				first.unlinkSecondary();
			}
		} else {
			this.available--;
		}
		this.table.put(key, node);
		this.queue.addTail(node);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)Lclient!cm;")
	public SecondaryNode get(@OriginalArg(0) long arg0) {
		@Pc(16) SecondaryNode local16 = (SecondaryNode) this.table.get(arg0);
		if (local16 != null) {
			this.queue.addTail(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)V")
	public void method8351(@OriginalArg(1) long arg0) {
		@Pc(18) SecondaryNode local18 = (SecondaryNode) this.table.get(arg0);
		if (local18 != null) {
			local18.unlink();
			local18.unlinkSecondary();
			this.available++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.aClass2_Sub2_57 = new SecondaryNode();
		this.available = this.capacity;
	}
}
