import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gga")
public final class SecondaryHashTable {

	@OriginalMember(owner = "client!gga", name = "h", descriptor = "Lclient!cm;")
	private SecondaryNode searchCursor;

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "J")
	private long searchKey;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "[Lclient!cm;")
	private final SecondaryNode[] buckets;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
	private final int bucketCount;

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(I)V")
	public SecondaryHashTable(@OriginalArg(0) int arg0) {
		this.buckets = new SecondaryNode[arg0];
		this.bucketCount = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) SecondaryNode local20 = this.buckets[local10] = new SecondaryNode();
			local20.secondaryPrev = local20;
			local20.secondaryNext = local20;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(BLclient!cm;J)V")
	public void put(@OriginalArg(1) SecondaryNode arg0, @OriginalArg(2) long arg1) {
		if (arg0.secondaryPrev != null) {
			arg0.unlinkSecondary();
		}
		@Pc(28) SecondaryNode local28 = this.buckets[(int) ((long) (this.bucketCount - 1) & arg1)];
		arg0.secondaryNext = local28;
		arg0.secondaryPrev = local28.secondaryPrev;
		arg0.secondaryPrev.secondaryNext = arg0;
		arg0.secondaryNext.secondaryPrev = arg0;
		arg0.secondaryKey = arg1;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(JI)Lclient!cm;")
	public SecondaryNode get(@OriginalArg(0) long arg0) {
		this.searchKey = arg0;
		@Pc(20) SecondaryNode local20 = this.buckets[(int) (arg0 & (long) (this.bucketCount - 1))];
		for (this.searchCursor = local20.secondaryNext; this.searchCursor != local20; this.searchCursor = this.searchCursor.secondaryNext) {
			if (arg0 == this.searchCursor.secondaryKey) {
				@Pc(41) SecondaryNode local41 = this.searchCursor;
				this.searchCursor = this.searchCursor.secondaryNext;
				return local41;
			}
		}
		this.searchCursor = null;
		return null;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)Lclient!cm;")
	public SecondaryNode nextWithKey() {
		if (this.searchCursor == null) {
			return null;
		}
		@Pc(24) SecondaryNode local24 = this.buckets[(int) (this.searchKey & (long) (this.bucketCount - 1))];
		while (this.searchCursor != local24) {
			if (this.searchKey == this.searchCursor.secondaryKey) {
				@Pc(38) SecondaryNode local38 = this.searchCursor;
				this.searchCursor = this.searchCursor.secondaryNext;
				return local38;
			}
			this.searchCursor = this.searchCursor.secondaryNext;
		}
		this.searchCursor = null;
		return null;
	}
}
