import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class2_Sub1_Sub39 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
	private int anInt10921 = 1;

	@OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
	private int anInt10922 = 204;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
	private int anInt10924 = 1;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt10924 = arg1.method7403();
		} else if (arg2 == 1) {
			this.anInt10921 = arg1.method7403();
		} else if (arg2 == 2) {
			this.anInt10922 = arg1.method7389();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			for (@Pc(17) int local17 = 0; local17 < Static608.anInt9315; local17++) {
				@Pc(23) int local23 = Static54.anIntArray92[local17];
				@Pc(27) int local27 = Static273.anIntArray341[arg1];
				@Pc(34) int local34 = local23 * this.anInt10924 >> 12;
				@Pc(41) int local41 = local27 * this.anInt10921 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt10924) * this.anInt10924;
				@Pc(61) int local61 = this.anInt10921 * (local27 % (4096 / this.anInt10921));
				if (local61 < this.anInt10922) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (local51 < this.anInt10922) {
						local11[local17] = 0;
						continue;
					}
				}
				if (local51 < this.anInt10922) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
