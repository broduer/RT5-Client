import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class133 implements Interface13 {

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "Lclient!da;")
	private Class14 aClass14_4;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "Lclient!fea;")
	private final Class125 aClass125_1;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aClass332_36;

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Lclient!sb;")
	private final Js5 aClass332_37;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;Lclient!fea;)V")
	public Class133(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1, @OriginalArg(2) Class125 arg2) {
		this.aClass125_1 = arg2;
		this.aClass332_36 = arg1;
		this.aClass332_37 = arg0;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
	@Override
	public void method7755() {
		@Pc(24) Class383 local24 = Static238.method3468(this.aClass125_1.anInt2867, this.aClass332_36);
		this.aClass14_4 = Static163.aClass19_17.method8017(local24, Static735.method9394(this.aClass332_37, this.aClass125_1.anInt2867), true);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7756() {
		@Pc(27) int local27 = this.aClass125_1.aClass405_2.method9339(Static302.anInt4867, this.aClass125_1.anInt2874) + this.aClass125_1.anInt2877;
		@Pc(41) int local41 = this.aClass125_1.aClass103_3.method2416(Static479.anInt7222, this.aClass125_1.anInt2868) + this.aClass125_1.anInt2878;
		this.aClass14_4.method8833(0, null, this.aClass125_1.anInt2876, this.aClass125_1.aString30, null, null, local41, this.aClass125_1.anInt2871, 0, this.aClass125_1.anInt2869, local27, this.aClass125_1.anInt2879, this.aClass125_1.anInt2875, this.aClass125_1.anInt2874, this.aClass125_1.anInt2868);
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass332_37.method7588(this.aClass125_1.anInt2867)) {
			local11 = false;
		}
		if (!this.aClass332_36.method7588(this.aClass125_1.anInt2867)) {
			local11 = false;
		}
		return local11;
	}
}
