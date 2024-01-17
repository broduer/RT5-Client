import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
	private int anInt3306 = 32768;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9421(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass374_41.method8457(arg0);
		if (super.aClass374_41.aBoolean738) {
			@Pc(29) int[] local29 = this.method9429(arg0, 1);
			@Pc(35) int[] local35 = this.method9429(arg0, 2);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			for (@Pc(49) int local49 = 0; local49 < Static608.anInt9315; local49++) {
				@Pc(61) int local61 = local29[local49] * 255 >> 12 & 0xFF;
				@Pc(70) int local70 = local35[local49] * this.anInt3306 >> 12;
				@Pc(78) int local78 = Static24.anIntArray33[local61] * local70 >> 12;
				@Pc(86) int local86 = Static222.anIntArray289[local61] * local70 >> 12;
				@Pc(95) int local95 = Static576.anInt8604 & local49 + (local78 >> 12);
				@Pc(103) int local103 = Static489.anInt7364 & (local86 >> 12) + arg0;
				@Pc(109) int[][] local109 = this.method9420(0, local103);
				local39[local49] = local109[0][local95];
				local43[local49] = local109[1][local95];
				local47[local49] = local109[2][local95];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt3306 = arg1.method7389() << 4;
		} else if (arg2 == 1) {
			super.aBoolean825 = arg1.method7403() == 1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9418(@OriginalArg(1) int arg1) {
		@Pc(19) int[] local19 = super.aClass180_41.method3935(arg1);
		if (super.aClass180_41.aBoolean338) {
			@Pc(29) int[] local29 = this.method9429(arg1, 1);
			@Pc(35) int[] local35 = this.method9429(arg1, 2);
			for (@Pc(37) int local37 = 0; local37 < Static608.anInt9315; local37++) {
				@Pc(47) int local47 = local29[local37] >> 4 & 0xFF;
				@Pc(56) int local56 = this.anInt3306 * local35[local37] >> 12;
				@Pc(64) int local64 = Static24.anIntArray33[local47] * local56 >> 12;
				@Pc(72) int local72 = Static222.anIntArray289[local47] * local56 >> 12;
				@Pc(80) int local80 = Static576.anInt8604 & local37 + (local64 >> 12);
				@Pc(88) int local88 = arg1 + (local72 >> 12) & Static489.anInt7364;
				@Pc(94) int[] local94 = this.method9429(local88, 0);
				local19[local37] = local94[local80];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
	@Override
	public void method9428() {
		Static481.method6482();
	}
}
