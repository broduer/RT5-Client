import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nla")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!nla", name = "K", descriptor = "I")
	private int anInt6590 = 4096;

	@OriginalMember(owner = "client!nla", name = "R", descriptor = "I")
	private int anInt6593 = 12288;

	@OriginalMember(owner = "client!nla", name = "I", descriptor = "I")
	private int anInt6586 = 8192;

	@OriginalMember(owner = "client!nla", name = "O", descriptor = "I")
	private int anInt6594 = 0;

	@OriginalMember(owner = "client!nla", name = "S", descriptor = "I")
	private int anInt6597 = 2048;

	@OriginalMember(owner = "client!nla", name = "N", descriptor = "I")
	private int anInt6598 = 2048;

	@OriginalMember(owner = "client!nla", name = "W", descriptor = "I")
	private int anInt6600 = 0;

	@OriginalMember(owner = "client!nla", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt6598 = arg1.g2();
		} else if (arg2 == 1) {
			this.anInt6600 = arg1.g2();
		} else if (arg2 == 2) {
			this.anInt6594 = arg1.g2();
		} else if (arg2 == 3) {
			this.anInt6597 = arg1.g2();
		} else if (arg2 == 4) {
			this.anInt6593 = arg1.g2();
		} else if (arg2 == 5) {
			this.anInt6590 = arg1.g2();
		} else if (arg2 == 6) {
			this.anInt6586 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!nla", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		Static481.method6482();
	}

	@OriginalMember(owner = "client!nla", name = "c", descriptor = "(III)Z")
	private boolean method5858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt6593 >> 12;
		@Pc(33) int local33 = Static24.anIntArray33[local13 * 255 >> 12 & 0xFF];
		@Pc(40) int local40 = (local33 << 12) / this.anInt6593;
		@Pc(47) int local47 = (local40 << 12) / this.anInt6586;
		@Pc(54) int local54 = this.anInt6590 * local47 >> 12;
		return arg0 + arg1 < local54 && -local54 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!nla", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(1) int arg1) {
		@Pc(17) int[] local17 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(27) int local27 = Static273.anIntArray341[arg1] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static608.anInt9315; local29++) {
				@Pc(37) int local37 = Static54.anIntArray92[local29] - 2048;
				@Pc(42) int local42 = this.anInt6598 + local37;
				@Pc(52) int local52 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(64) int local64 = local52 > 2048 ? local52 - 4096 : local52;
				@Pc(69) int local69 = this.anInt6600 + local27;
				@Pc(81) int local81 = local69 >= -2048 ? local69 : local69 + 4096;
				@Pc(91) int local91 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(96) int local96 = this.anInt6594 + local37;
				@Pc(108) int local108 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(120) int local120 = local108 > 2048 ? local108 - 4096 : local108;
				@Pc(126) int local126 = local27 + this.anInt6597;
				@Pc(136) int local136 = local126 < -2048 ? local126 + 4096 : local126;
				@Pc(146) int local146 = local136 <= 2048 ? local136 : local136 - 4096;
				local17[local29] = this.method5858(local91, local64) || this.method5859(local120, local146) ? 4096 : 0;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!nla", name = "d", descriptor = "(III)Z")
	private boolean method5859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt6593 * (arg0 + arg1) >> 12;
		@Pc(28) int local28 = Static24.anIntArray33[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt6593;
		@Pc(42) int local42 = (local35 << 12) / this.anInt6586;
		@Pc(49) int local49 = local42 * this.anInt6590 >> 12;
		return arg1 - arg0 < local49 && -local49 < arg1 - arg0;
	}
}
