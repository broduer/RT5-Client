import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class219 {

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	private final int anInt5723 = Static650.method8507(16);

	@OriginalMember(owner = "client!l", name = "g", descriptor = "I")
	private final int anInt5718 = Static650.method8507(24);

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	private final int anInt5719 = Static650.method8507(24);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "I")
	private final int anInt5720 = Static650.method8507(24) + 1;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	private final int anInt5722 = Static650.method8507(6) + 1;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	private final int anInt5721 = Static650.method8507(8);

	@OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
	private final int[] anIntArray427;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class219() {
		@Pc(33) int[] local33 = new int[this.anInt5722];
		@Pc(38) int local38;
		for (@Pc(35) int local35 = 0; local35 < this.anInt5722; local35++) {
			local38 = 0;
			@Pc(41) int local41 = Static650.method8507(3);
			@Pc(47) boolean local47 = Static650.method8516() != 0;
			if (local47) {
				local38 = Static650.method8507(5);
			}
			local33[local35] = local38 << 3 | local41;
		}
		this.anIntArray427 = new int[this.anInt5722 * 8];
		for (local38 = 0; local38 < this.anInt5722 * 8; local38++) {
			this.anIntArray427[local38] = (local33[local38 >> 3] & 0x1 << (local38 & 0x7)) == 0 ? -1 : Static650.method8507(8);
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([FIZ)V")
	public void method5129(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		for (@Pc(1) int local1 = 0; local1 < arg1; local1++) {
			arg0[local1] = 0.0F;
		}
		if (arg2) {
			return;
		}
		@Pc(19) int local19 = Static650.aClass273Array1[this.anInt5721].anInt6824;
		@Pc(25) int local25 = this.anInt5719 - this.anInt5718;
		@Pc(30) int local30 = local25 / this.anInt5720;
		@Pc(33) int[] local33 = new int[local30];
		for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
			@Pc(38) int local38 = 0;
			while (local38 < local30) {
				@Pc(47) int local47;
				@Pc(51) int local51;
				if (local35 == 0) {
					local47 = Static650.aClass273Array1[this.anInt5721].method6118();
					for (local51 = local19 - 1; local51 >= 0; local51--) {
						if (local38 + local51 < local30) {
							local33[local38 + local51] = local47 % this.anInt5722;
						}
						local47 /= this.anInt5722;
					}
				}
				for (local47 = 0; local47 < local19; local47++) {
					local51 = local33[local38];
					@Pc(90) int local90 = this.anIntArray427[local51 * 8 + local35];
					if (local90 >= 0) {
						@Pc(100) int local100 = this.anInt5718 + local38 * this.anInt5720;
						@Pc(104) Class273 local104 = Static650.aClass273Array1[local90];
						@Pc(113) int local113;
						if (this.anInt5723 == 0) {
							local113 = this.anInt5720 / local104.anInt6824;
							for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
								@Pc(119) float[] local119 = local104.method6119();
								for (@Pc(121) int local121 = 0; local121 < local104.anInt6824; local121++) {
									arg0[local100 + local115 + local121 * local113] += local119[local121];
								}
							}
						} else {
							local113 = 0;
							while (local113 < this.anInt5720) {
								@Pc(153) float[] local153 = local104.method6119();
								for (@Pc(155) int local155 = 0; local155 < local104.anInt6824; local155++) {
									arg0[local100 + local113] += local153[local155];
									local113++;
								}
							}
						}
					}
					local38++;
					if (local38 >= local30) {
						break;
					}
				}
			}
		}
	}
}
