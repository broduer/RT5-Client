import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class SoftLruHashTable {

	@OriginalMember(owner = "client!dla", name = "j", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList queue;

	@OriginalMember(owner = "client!dla", name = "h", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!dla", name = "r", descriptor = "Lclient!av;")
	private final HashTable table;

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "I")
	private final int anInt2294;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(I)V")
	public SoftLruHashTable(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "(II)V")
	public SoftLruHashTable(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.queue = new SecondaryLinkedList();
		this.anInt2294 = arg0;
		this.available = arg0;
		@Pc(14) int bucketCount;
		for (bucketCount = 1; arg0 > bucketCount + bucketCount && bucketCount < arg1; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(I)I")
	public int method2144() {
		return this.available;
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method2145() {
		@Pc(19) ReferenceNode local19 = (ReferenceNode) this.table.method736();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.get();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) ReferenceNode local29 = local19;
			local19 = (ReferenceNode) this.table.method740();
			local29.unlink();
			local29.unlinkSecondary();
			this.available += local29.anInt10711;
		}
		return null;
	}

	@OriginalMember(owner = "client!dla", name = "d", descriptor = "(I)I")
	public int method2146() {
		return this.anInt2294;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(II)V")
	public void method2147(@OriginalArg(0) int arg0) {
		if (ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY == null) {
			return;
		}
		for (@Pc(15) ReferenceNode local15 = (ReferenceNode) this.queue.head(); local15 != null; local15 = (ReferenceNode) this.queue.next()) {
			if (local15.isSoft()) {
				if (local15.get() == null) {
					local15.unlink();
					local15.unlinkSecondary();
					this.available += local15.anInt10711;
				}
			} else if (++local15.secondaryKey > (long) arg0) {
				@Pc(42) ReferenceNode local42 = ReferenceNodeFactory.SOFT_REFERENCE_NODE_FACTORY.create(local15);
				this.table.put(local15.key, local42);
				Static409.method5661(local15, local42);
				local15.unlink();
				local15.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(B)I")
	public int method2148() {
		@Pc(5) int local5 = 0;
		for (@Pc(11) ReferenceNode local11 = (ReferenceNode) this.queue.head(); local11 != null; local11 = (ReferenceNode) this.queue.next()) {
			if (!local11.isSoft()) {
				local5++;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(ILclient!vw;)V")
	private void method2149(@OriginalArg(1) ReferenceNode node) {
		if (node != null) {
			node.unlink();
			node.unlinkSecondary();
			this.available += node.anInt10711;
		}
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Ljava/lang/Object;IJ)V")
	public void put(@OriginalArg(0) Object arg0, @OriginalArg(2) long arg1) {
		this.method2153(arg1, arg0, 1);
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(B)V")
	public void method2151() {
		for (@Pc(14) ReferenceNode local14 = (ReferenceNode) this.queue.head(); local14 != null; local14 = (ReferenceNode) this.queue.next()) {
			if (local14.isSoft()) {
				local14.unlink();
				local14.unlinkSecondary();
				this.available += local14.anInt10711;
			}
		}
	}

	@OriginalMember(owner = "client!dla", name = "c", descriptor = "(B)Ljava/lang/Object;")
	public Object method2152() {
		@Pc(19) ReferenceNode local19 = (ReferenceNode) this.table.method740();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.get();
			if (local25 != null) {
				return local25;
			}
			@Pc(29) ReferenceNode local29 = local19;
			local19 = (ReferenceNode) this.table.method740();
			local29.unlink();
			local29.unlinkSecondary();
			this.available += local29.anInt10711;
		}
		return null;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	public void method2153(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt2294) {
			throw new IllegalStateException("s>cs");
		}
		this.remove(arg0);
		this.available -= arg2;
		while (this.available < 0) {
			@Pc(32) ReferenceNode local32 = (ReferenceNode) this.queue.removeHead();
			this.method2149(local32);
		}
		@Pc(48) HardReferenceNode local48 = new HardReferenceNode(arg1, arg2);
		this.table.put(arg0, local48);
		this.queue.addTail(local48);
		local48.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(JI)V")
	public void remove(@OriginalArg(0) long key) {
		@Pc(15) ReferenceNode node = (ReferenceNode) this.table.get(key);
		this.method2149(node);
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(JI)Ljava/lang/Object;")
	public Object get(@OriginalArg(0) long key) {
		@Pc(12) ReferenceNode node = (ReferenceNode) this.table.get(key);
		if (node == null) {
			return null;
		}
		@Pc(26) Object value = node.get();
		if (value == null) {
			node.unlink();
			node.unlinkSecondary();
			this.available += node.anInt10711;
			return null;
		}
		if (node.isSoft()) {
			@Pc(65) HardReferenceNode local65 = new HardReferenceNode(value, node.anInt10711);
			this.table.put(node.key, local65);
			this.queue.addTail(local65);
			local65.secondaryKey = 0L;
			node.unlink();
			node.unlinkSecondary();
		} else {
			this.queue.addTail(node);
			node.secondaryKey = 0L;
		}
		return value;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(Z)V")
	public void method2157() {
		this.queue.clear();
		this.table.clear();
		this.available = this.anInt2294;
	}
}
