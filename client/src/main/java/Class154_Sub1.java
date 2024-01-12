import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	private final int anInt3718;

	@OriginalMember(owner = "client!hba", name = "o", descriptor = "I")
	private final int anInt3720;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "I")
	private final int anInt3722;

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "I")
	private final int anInt3716;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class154_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3718 = arg1;
		this.anInt3720 = arg0;
		this.anInt3722 = arg2;
		this.anInt3716 = arg3;
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(III)V")
	@Override
	public void method6782(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt3720 >> 12;
		@Pc(17) int local17 = this.anInt3722 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3718 >> 12;
		@Pc(36) int local36 = this.anInt3716 * arg0 >> 12;
		Static168.method2637(local36, super.anInt7678, super.anInt7679, local17, local29, local10);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt3720 * arg1 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt3722 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt3718 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt3716 >> 12;
		Static264.method9466(super.anInt7677, local22, super.anInt7678, local29, local36, local15, super.anInt7679);
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(III)V")
	@Override
	public void method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt3720 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt3722 >> 12;
		@Pc(29) int local29 = this.anInt3718 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt3716 >> 12;
		Static624.method8337(local22, local10, super.anInt7677, local36, local29);
	}
}
