import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
	private int anInt950 = 0;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!sb;Lclient!hea;)V")
	public Class37_Sub1(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class160_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7756() {
		@Pc(17) int local17 = super.aClass160_2.aClass405_9.method9339(Static302.anInt4867, super.aClass23_7.method8210()) + super.aClass160_2.anInt3861;
		@Pc(32) int local32 = super.aClass160_2.aClass103_9.method2416(Static479.anInt7222, super.aClass23_7.method8199()) + super.aClass160_2.anInt3856;
		super.aClass23_7.method8193((float) (super.aClass23_7.method8210() / 2 + local17), (float) (super.aClass23_7.method8199() / 2 + local32), 4096, this.anInt950);
		this.anInt950 += ((Class160_Sub1) super.aClass160_2).anInt3864;
	}
}
