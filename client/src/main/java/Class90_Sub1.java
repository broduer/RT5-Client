import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!il;)V")
	public Class90_Sub1(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class138_Sub3 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method7758(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static163.aClass19_17.method7983(arg0 - 2, arg1, super.aClass138_5.anInt4431 + 4, super.aClass138_5.anInt4426 + 2, ((Class138_Sub3) super.aClass138_5).anInt4440, 0);
		Static163.aClass19_17.method7983(arg0 - 1, arg1 - -1, super.aClass138_5.anInt4431 + 2, super.aClass138_5.anInt4426, 0, 0);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7760(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(21) int local21 = this.method7759() * super.aClass138_5.anInt4431 / 10000;
		Static163.aClass19_17.aa(arg0, arg1 + 2, local21, super.aClass138_5.anInt4426 - 2, ((Class138_Sub3) super.aClass138_5).anInt4441, 0);
		Static163.aClass19_17.aa(arg0 + local21, arg1 + 2, super.aClass138_5.anInt4431 - local21, super.aClass138_5.anInt4426 + -2, 0, 0);
	}
}
