import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	private int anInt946 = 0;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!sb;Lclient!hea;)V")
	public Class37_Sub1(@OriginalArg(0) Class330 arg0, @OriginalArg(1) Class160_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5493() {
		@Pc(17) int local17 = super.aClass160_2.aClass403_9.method6723(Static302.anInt4851, super.aClass23_7.b()) + super.aClass160_2.anInt3850;
		@Pc(32) int local32 = super.aClass160_2.aClass103_9.method1614(Static479.anInt7201, super.aClass23_7.a()) + super.aClass160_2.anInt3845;
		super.aClass23_7.a((float) (super.aClass23_7.b() / 2 + local17), (float) (super.aClass23_7.a() / 2 + local32), 4096, this.anInt946);
		this.anInt946 += ((Class160_Sub1) super.aClass160_2).anInt3853;
	}
}
