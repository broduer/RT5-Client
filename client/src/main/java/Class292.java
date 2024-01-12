import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class292 implements Interface13 {

	@OriginalMember(owner = "client!pga", name = "f", descriptor = "Lclient!lv;")
	private final Class237 aClass237_1;

	@OriginalMember(owner = "client!pga", name = "h", descriptor = "Lclient!tu;")
	private final Class364 aClass364_1;

	@OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lclient!tu;Lclient!lv;)V")
	public Class292(@OriginalArg(0) Class364 arg0, @OriginalArg(1) Class237 arg1) {
		this.aClass237_1 = arg1;
		this.aClass364_1 = arg0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(BLclient!da;Ljava/lang/String;III)I")
	private int method6527(@OriginalArg(1) Class14 arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return arg0.method8833(0, (int[]) null, this.aClass237_1.anInt5991, arg1, (Class1) null, (Class23[]) null, arg3 + 5, this.aClass237_1.anInt5995, 0, 0, arg2 + 5, 0, 0, this.aClass237_1.anInt5996 - 10, this.aClass237_1.anInt5990 + -10);
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7756() {
		@Pc(19) Class325 local19 = this.aClass364_1.method8353(this.aClass237_1.anInt5998);
		if (local19 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass237_1.aClass405_11.method9339(Static302.anInt4867, this.aClass237_1.anInt5996) + this.aClass237_1.anInt5997;
		@Pc(49) int local49 = this.aClass237_1.aClass103_11.method2416(Static479.anInt7222, this.aClass237_1.anInt5990) + this.aClass237_1.anInt5994;
		if (this.aClass237_1.aBoolean454) {
			Static163.aClass19_17.method7983(local35, local49, this.aClass237_1.anInt5996, this.aClass237_1.anInt5990, this.aClass237_1.anInt5992, 0);
		}
		local49 += this.method6527(Static180.aClass14_3, local19.aString103, local35, local49) * 12;
		local49 += 8;
		if (this.aClass237_1.aBoolean454) {
			Static163.aClass19_17.method7958(local35, local49, this.aClass237_1.anInt5996 + local35 - 1, local49, this.aClass237_1.anInt5992, 0);
		}
		local49++;
		local49 += this.method6527(Static180.aClass14_3, local19.aString104, local35, local49) * 12;
		local49 += 5;
		@Pc(135) int local135 = local49 + this.method6527(Static180.aClass14_3, local19.aString102, local35, local49) * 12;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V")
	@Override
	public void method7755() {
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		return this.aClass364_1.method8356();
	}
}
