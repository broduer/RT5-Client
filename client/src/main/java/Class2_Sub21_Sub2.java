import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rka")
public final class Class2_Sub21_Sub2 extends Packet {

	@OriginalMember(owner = "client!rka", name = "Sb", descriptor = "Lclient!iv;")
	private Class186 aClass186_2;

	@OriginalMember(owner = "client!rka", name = "Rb", descriptor = "I")
	private int anInt8446;

	@OriginalMember(owner = "client!rka", name = "<init>", descriptor = "(I)V")
	public Class2_Sub21_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rka", name = "y", descriptor = "(I)V")
	public void method7418() {
		super.pos = (this.anInt8446 + 7) / 8;
	}

	@OriginalMember(owner = "client!rka", name = "c", descriptor = "(BI)I")
	public int method7419(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt8446 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt8446 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt8446 += arg0;
		while (local18 < arg0) {
			local20 += (Static659.anIntArray769[local18] & super.data[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += super.data[local10] & Static659.anIntArray769[local18];
		} else {
			local20 += super.data[local10] >> local18 - arg0 & Static659.anIntArray769[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!rka", name = "j", descriptor = "(Z)Z")
	public boolean method7420() {
		@Pc(22) int local22 = super.data[super.pos] - this.aClass186_2.method4108() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "([IB)V")
	public void method7422(@OriginalArg(0) int[] arg0) {
		this.aClass186_2 = new Class186(arg0);
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "([BIIZ)V")
	public void method7423(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.data[super.pos++] - this.aClass186_2.method4105());
		}
	}

	@OriginalMember(owner = "client!rka", name = "w", descriptor = "(I)V")
	public void method7424() {
		this.anInt8446 = super.pos * 8;
	}

	@OriginalMember(owner = "client!rka", name = "n", descriptor = "(II)V")
	public void method7425(@OriginalArg(1) int arg0) {
		super.data[super.pos++] = (byte) (arg0 + this.aClass186_2.method4105());
	}

	@OriginalMember(owner = "client!rka", name = "m", descriptor = "(II)I")
	public int method7427(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt8446;
	}

	@OriginalMember(owner = "client!rka", name = "x", descriptor = "(I)I")
	public int method7428() {
		@Pc(30) int local30 = super.data[super.pos++] - this.aClass186_2.method4105() & 0xFF;
		return local30 < 128 ? local30 : (super.data[super.pos++] - this.aClass186_2.method4105() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!rka", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method7429(@OriginalArg(0) Class186 arg0) {
		this.aClass186_2 = arg0;
	}
}
