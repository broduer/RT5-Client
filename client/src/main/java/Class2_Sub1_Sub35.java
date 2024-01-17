import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	private int anInt10261 = 0;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	private int anInt10259 = 4096;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(1) int arg1) {
		@Pc(11) int[] local11 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(21) int[] local21 = this.method9429(arg1, 0);
			for (@Pc(23) int local23 = 0; local23 < Static608.anInt9315; local23++) {
				@Pc(29) int local29 = local21[local23];
				if (local29 < this.anInt10261) {
					local11[local23] = this.anInt10261;
				} else if (this.anInt10259 < local29) {
					local11[local23] = this.anInt10259;
				} else {
					local11[local23] = local29;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt10261 = arg1.method7389();
		} else if (arg2 == 1) {
			this.anInt10259 = arg1.method7389();
		} else if (arg2 == 2) {
			super.aBoolean825 = arg1.method7403() == 1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9421(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass374_41.method8457(arg0);
		if (super.aClass374_41.aBoolean738) {
			@Pc(31) int[][] local31 = this.method9420(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			for (@Pc(57) int local57 = 0; local57 < Static608.anInt9315; local57++) {
				@Pc(63) int local63 = local35[local57];
				@Pc(67) int local67 = local39[local57];
				@Pc(71) int local71 = local43[local57];
				if (this.anInt10261 > local63) {
					local47[local57] = this.anInt10261;
				} else if (this.anInt10259 >= local63) {
					local47[local57] = local63;
				} else {
					local47[local57] = this.anInt10259;
				}
				if (this.anInt10261 > local67) {
					local51[local57] = this.anInt10261;
				} else if (local67 > this.anInt10259) {
					local51[local57] = this.anInt10259;
				} else {
					local51[local57] = local67;
				}
				if (this.anInt10261 > local71) {
					local55[local57] = this.anInt10261;
				} else if (this.anInt10259 >= local71) {
					local55[local57] = local71;
				} else {
					local55[local57] = this.anInt10259;
				}
			}
		}
		return local21;
	}
}
