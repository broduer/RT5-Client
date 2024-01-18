import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class290 implements Interface13 {

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Lclient!lv;")
	private final Class235 aClass235_1;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!tu;")
	private final Class362 aClass362_1;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!tu;Lclient!lv;)V")
	public Class290(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class235 arg1) {
		this.aClass235_1 = arg1;
		this.aClass362_1 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!da;Ljava/lang/String;III)I")
	private int method4577(@OriginalArg(1) Class14 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return arg0.a(0, (int[]) null, this.aClass235_1.anInt5971, arg1, (Class1) null, (Class23[]) null, arg3 + 5, this.aClass235_1.anInt5975, 92, 0, 0, arg2 + 5, 0, 0, this.aClass235_1.anInt5976 - 10, this.aClass235_1.anInt5970 + -10);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5493() {
		@Pc(19) Class323 local19 = this.aClass362_1.method5910(this.aClass235_1.anInt5978);
		if (local19 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass235_1.aClass403_11.method6723(Static302.anInt4851, this.aClass235_1.anInt5976) + this.aClass235_1.anInt5977;
		@Pc(49) int local49 = this.aClass235_1.aClass103_11.method1614(Static479.anInt7201, this.aClass235_1.anInt5970) + this.aClass235_1.anInt5974;
		if (this.aClass235_1.aBoolean454) {
			Static163.aClass19_17.d(local35, local49, this.aClass235_1.anInt5976, this.aClass235_1.anInt5970, this.aClass235_1.anInt5972, 0);
		}
		local49 += this.method4577(Static180.aClass14_3, local19.aString103, local35, local49) * 12;
		local49 += 8;
		if (this.aClass235_1.aBoolean454) {
			Static163.aClass19_17.a(local35, local49, this.aClass235_1.anInt5976 + local35 - 1, (int) local49, (int) this.aClass235_1.anInt5972, 0);
		}
		local49++;
		local49 += this.method4577(Static180.aClass14_3, local19.aString104, local35, local49) * 12;
		local49 += 5;
		@Pc(135) int local135 = local49 + this.method4577(Static180.aClass14_3, local19.aString102, local35, local49) * 12;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	@Override
	public void method5492() {
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5491() {
		return this.aClass362_1.method5913();
	}
}
