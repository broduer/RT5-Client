import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class90_Sub3 extends Class90 {

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "Lclient!st;")
	private Class23 aClass23_28;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!gha;)V")
	public Class90_Sub3(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class138_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	@Override
	public void method7755() {
		super.method7755();
		this.aClass23_28 = Static652.method8540(((Class138_Sub2) super.aClass138_5).anInt3448, super.aClass332_109);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected void method7758(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static163.aClass19_17.method7983(arg0 - 2, arg1, super.aClass138_5.anInt4431 + 4, super.aClass138_5.anInt4426 - -2, ((Class138_Sub2) super.aClass138_5).anInt3449, 0);
		Static163.aClass19_17.method7983(arg0 - 1, arg1 - -1, super.aClass138_5.anInt4431 + 2, super.aClass138_5.anInt4426, 0, 0);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		return super.method7754() ? super.aClass332_109.method7588(((Class138_Sub2) super.aClass138_5).anInt3448) : false;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZI)V")
	@Override
	protected void method7760(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(13) int local13 = this.method7759() * super.aClass138_5.anInt4431 / 10000;
		@Pc(24) int[] local24 = new int[4];
		Static163.aClass19_17.K(local24);
		Static163.aClass19_17.KA(arg0, arg1 + 2, arg0 - -local13, arg1 + super.aClass138_5.anInt4426);
		this.aClass23_28.method8205(arg0, arg1 + 2, super.aClass138_5.anInt4431, super.aClass138_5.anInt4426);
		Static163.aClass19_17.KA(local24[0], local24[1], local24[2], local24[3]);
	}
}
