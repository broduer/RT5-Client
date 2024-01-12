import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!di", name = "i", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	private int anInt2220;

	@OriginalMember(owner = "client!di", name = "h", descriptor = "I")
	private int anInt2219 = 1;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method5603(@OriginalArg(1) long arg0) {
		if (this.aLong81 > this.aLong82) {
			this.aLong83 += this.aLong81 - this.aLong82;
			this.aLong82 += this.aLong81 - this.aLong82;
			this.aLong81 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			this.aLong81 += arg0;
			local12++;
		} while (local12 < 10 && this.aLong82 > this.aLong81);
		if (this.aLong81 < this.aLong82) {
			this.aLong81 = this.aLong82;
		}
		return local12;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(B)J")
	@Override
	protected long method5606() {
		this.aLong82 += this.method2092();
		return this.aLong82 < this.aLong81 ? (this.aLong81 - this.aLong82) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!di", name = "b", descriptor = "(I)J")
	@Override
	public long method5609() {
		return this.aLong82;
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)J")
	private long method2092() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong83;
		this.aLong83 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt2220] = local7;
			this.anInt2220 = (this.anInt2220 + 1) % 10;
			if (this.anInt2219 < 1) {
				this.anInt2219++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt2219; local56++) {
			local54 += this.aLongArray2[(this.anInt2220 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt2219;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
	@Override
	public void method5604() {
		if (this.aLong81 > this.aLong82) {
			this.aLong82 += this.aLong81 - this.aLong82;
		}
		this.aLong83 = 0L;
	}
}
