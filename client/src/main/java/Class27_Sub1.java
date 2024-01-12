import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!au")
public final class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!au", name = "j", descriptor = "J")
	private long aLong18 = 0L;

	@OriginalMember(owner = "client!au", name = "h", descriptor = "I")
	private int anInt633 = 0;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	private int anInt632 = 1;

	@OriginalMember(owner = "client!au", name = "i", descriptor = "J")
	private long aLong19 = 0L;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "J")
	private long aLong20 = 0L;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	@Override
	public void method5604() {
		this.aLong20 = 0L;
		if (this.aLong19 > this.aLong18) {
			this.aLong18 += this.aLong19 - this.aLong18;
		}
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(B)J")
	@Override
	protected long method5606() {
		this.aLong18 += this.method734();
		return this.aLong18 < this.aLong19 ? (this.aLong19 - this.aLong18) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)J")
	@Override
	public long method5609() {
		return this.aLong18;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method5603(@OriginalArg(1) long arg0) {
		if (this.aLong19 > this.aLong18) {
			this.aLong20 += this.aLong19 - this.aLong18;
			this.aLong18 += this.aLong19 - this.aLong18;
			this.aLong19 += arg0;
			return 1;
		}
		@Pc(47) int local47 = 0;
		do {
			local47++;
			this.aLong19 += arg0;
		} while (local47 < 10 && this.aLong18 > this.aLong19);
		if (this.aLong18 > this.aLong19) {
			this.aLong19 = this.aLong18;
		}
		return local47;
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(B)J")
	private long method734() {
		@Pc(10) long local10 = Static588.method7722() * 1000000L;
		@Pc(16) long local16 = local10 - this.aLong20;
		this.aLong20 = local10;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray1[this.anInt633] = local16;
			this.anInt633 = (this.anInt633 + 1) % 10;
			if (this.anInt632 < 10) {
				this.anInt632++;
			}
		}
		@Pc(61) long local61 = 0L;
		for (@Pc(63) int local63 = 1; local63 <= this.anInt632; local63++) {
			local61 += this.aLongArray1[(this.anInt633 + 10 - local63) % 10];
		}
		return local61 / (long) this.anInt632;
	}
}
