import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class UnknownLruHashTable {

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "Lclient!jga;")
	private final SecondaryLinkedList queue = new SecondaryLinkedList();

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
	private int available;

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Lclient!av;")
	private final HashTable table;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(I)V")
	public UnknownLruHashTable(@OriginalArg(0) int arg0) {
		this.capacity = arg0;
		this.available = arg0;
		@Pc(16) int bucketCount;
		for (bucketCount = 1; arg0 > bucketCount + bucketCount; bucketCount += bucketCount) {
		}
		this.table = new HashTable(bucketCount);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!uq;)V")
	private void method251(@OriginalArg(1) Interface24 arg0) {
		@Pc(9) long local9 = arg0.method7440();
		for (@Pc(22) SecondaryNode_Sub11 local22 = (SecondaryNode_Sub11) this.table.get(local9); local22 != null; local22 = (SecondaryNode_Sub11) this.table.method744()) {
			if (local22.anInterface24_3.method7439(arg0)) {
				this.method254(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)V")
	public void clear() {
		this.queue.clear();
		this.table.clear();
		this.available = this.capacity;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	public void method253() {
		for (@Pc(5) SecondaryNode_Sub11 local5 = (SecondaryNode_Sub11) this.queue.head(); local5 != null; local5 = (SecondaryNode_Sub11) this.queue.next()) {
			if (local5.method8321()) {
				local5.unlink();
				local5.unlinkSecondary();
				this.available += local5.anInt9471;
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZLclient!pv;)V")
	private void method254(@OriginalArg(1) SecondaryNode_Sub11 arg0) {
		if (arg0 != null) {
			arg0.unlink();
			arg0.unlinkSecondary();
			this.available += arg0.anInt9471;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZI)V")
	public void method255() {
		if (Static515.aClass22_1 == null) {
			return;
		}
		for (@Pc(11) SecondaryNode_Sub11 local11 = (SecondaryNode_Sub11) this.queue.head(); local11 != null; local11 = (SecondaryNode_Sub11) this.queue.next()) {
			if (local11.method8321()) {
				if (local11.method8318() == null) {
					local11.unlink();
					local11.unlinkSecondary();
					this.available += local11.anInt9471;
				}
			} else if (++local11.secondaryKey > (long) 5) {
				@Pc(38) SecondaryNode_Sub11 local38 = Static515.aClass22_1.method593(local11);
				this.table.put(local11.key, local38);
				Static409.method5661(local11, local38);
				local11.unlink();
				local11.unlinkSecondary();
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I")
	public int method256() {
		return this.capacity;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)I")
	public int method257() {
		return this.available;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZILjava/lang/Object;Lclient!uq;)V")
	private void method259(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface24 arg1) {
		if (this.capacity < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method251(arg1);
		this.available--;
		while (this.available < 0) {
			@Pc(42) SecondaryNode_Sub11 local42 = (SecondaryNode_Sub11) this.queue.removeHead();
			this.method254(local42);
		}
		@Pc(59) SecondaryNode_Sub11_Sub2 local59 = new SecondaryNode_Sub11_Sub2(arg1, arg0, 1);
		this.table.put(arg1.method7440(), local59);
		this.queue.addTail(local59);
		local59.secondaryKey = 0L;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!uq;B)Ljava/lang/Object;")
	public Object method260(@OriginalArg(0) Interface24 arg0) {
		@Pc(18) long local18 = arg0.method7440();
		for (@Pc(25) SecondaryNode_Sub11 local25 = (SecondaryNode_Sub11) this.table.get(local18); local25 != null; local25 = (SecondaryNode_Sub11) this.table.method744()) {
			if (local25.anInterface24_3.method7439(arg0)) {
				@Pc(39) Object local39 = local25.method8318();
				if (local39 != null) {
					if (local25.method8321()) {
						@Pc(84) SecondaryNode_Sub11_Sub2 local84 = new SecondaryNode_Sub11_Sub2(arg0, local39, local25.anInt9471);
						this.table.put(local25.key, local84);
						this.queue.addTail(local84);
						local84.secondaryKey = 0L;
						local25.unlink();
						local25.unlinkSecondary();
					} else {
						this.queue.addTail(local25);
						local25.secondaryKey = 0L;
					}
					return local39;
				}
				local25.unlink();
				local25.unlinkSecondary();
				this.available += local25.anInt9471;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Ljava/lang/Object;ILclient!uq;)V")
	public void method261(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface24 arg1) {
		this.method259(arg0, arg1);
	}
}
