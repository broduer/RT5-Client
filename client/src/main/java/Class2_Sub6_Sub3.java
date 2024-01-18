import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!sia;")
	private final Class339 aClass339_35 = new Class339();

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "Lclient!sia;")
	private final Class339 aClass339_36 = new Class339();

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	private int anInt6603 = 0;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	private int anInt6604 = -1;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()I")
	@Override
	public int method6561() {
		return 0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6604 < 0) {
				this.method4176(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6603 + arg2 < this.anInt6604) {
				this.anInt6603 += arg2;
				this.method4176(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6604 - this.anInt6603;
			this.method4176(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6603 += local33;
			this.method4178();
			@Pc(60) Class2_Sub3 local60 = (Class2_Sub3) this.aClass339_36.method5453(65280);
			synchronized (local60) {
				@Pc(68) int local68 = local60.method66(this);
				if (local68 < 0) {
					local60.anInt101 = 0;
					this.method4179(local60);
				} else {
					local60.anInt101 = local68;
					this.method4177(local60.aClass2_346, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "()I")
	public synchronized int method4172() {
		return this.aClass339_35.method5455();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!dea;)V")
	public synchronized void method4173(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aClass339_35.method5451(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Lclient!dea;)V")
	public synchronized void method4174(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.a((byte) 50);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	private void method4175(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub6 local5 = (Class2_Sub6) this.aClass339_35.method5453(65280); local5 != null; local5 = (Class2_Sub6) this.aClass339_35.method5460()) {
			local5.method6559(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "([III)V")
	private void method4176(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub6 local5 = (Class2_Sub6) this.aClass339_35.method5453(65280); local5 != null; local5 = (Class2_Sub6) this.aClass339_35.method5460()) {
			local5.method6563(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method6564() {
		return (Class2_Sub6) this.aClass339_35.method5460();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ie;Lclient!ada;)V")
	private void method4177(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (arg0 != this.aClass339_36.aClass2_271 && ((Class2_Sub3) arg0).anInt101 <= arg1.anInt101) {
			arg0 = arg0.aClass2_346;
		}
		Static201.method5177(arg0, arg1);
		this.anInt6604 = ((Class2_Sub3) this.aClass339_36.aClass2_271.aClass2_346).anInt101;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method6562() {
		return (Class2_Sub6) this.aClass339_35.method5453(65280);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6559(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6604 < 0) {
				this.method4175(arg0);
				return;
			}
			if (this.anInt6603 + arg0 < this.anInt6604) {
				this.anInt6603 += arg0;
				this.method4175(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6604 - this.anInt6603;
			this.method4175(local29);
			arg0 -= local29;
			this.anInt6603 += local29;
			this.method4178();
			@Pc(50) Class2_Sub3 local50 = (Class2_Sub3) this.aClass339_36.method5453(65280);
			synchronized (local50) {
				@Pc(58) int local58 = local50.method66(this);
				if (local58 < 0) {
					local50.anInt101 = 0;
					this.method4179(local50);
				} else {
					local50.anInt101 = local58;
					this.method4177(local50.aClass2_346, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "()V")
	private void method4178() {
		if (this.anInt6603 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) this.aClass339_36.method5453(65280); local8 != null; local8 = (Class2_Sub3) this.aClass339_36.method5460()) {
			local8.anInt101 -= this.anInt6603;
		}
		this.anInt6604 -= this.anInt6603;
		this.anInt6603 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ada;)V")
	private void method4179(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.a((byte) 90);
		arg0.method65();
		@Pc(9) Class2 local9 = this.aClass339_36.aClass2_271.aClass2_346;
		if (local9 == this.aClass339_36.aClass2_271) {
			this.anInt6604 = -1;
		} else {
			this.anInt6604 = ((Class2_Sub3) local9).anInt101;
		}
	}
}
