import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class2_Sub6_Sub3 extends Class2_Sub6 {

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!sia;")
	private final Class341 aClass341_35 = new Class341();

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "Lclient!sia;")
	private final Class341 aClass341_36 = new Class341();

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	private int anInt6623 = 0;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	private int anInt6624 = -1;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "()I")
	@Override
	public int method9139() {
		return 0;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9138(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt6624 < 0) {
				this.method5892(arg0, arg1, arg2);
				return;
			}
			if (this.anInt6623 + arg2 < this.anInt6624) {
				this.anInt6623 += arg2;
				this.method5892(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt6624 - this.anInt6623;
			this.method5892(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt6623 += local33;
			this.method5894();
			@Pc(60) Class2_Sub3 local60 = (Class2_Sub3) this.aClass341_36.method7706(65280);
			synchronized (local60) {
				@Pc(68) int local68 = local60.method114(this);
				if (local68 < 0) {
					local60.anInt101 = 0;
					this.method5895(local60);
				} else {
					local60.anInt101 = local68;
					this.method5893(local60.aClass2_346, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "()I")
	public synchronized int method5888() {
		return this.aClass341_35.method7708();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!dea;)V")
	public synchronized void method5889(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aClass341_35.method7704(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Lclient!dea;)V")
	public synchronized void method5890(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method9464();
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	private void method5891(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub6 local5 = (Class2_Sub6) this.aClass341_35.method7706(65280); local5 != null; local5 = (Class2_Sub6) this.aClass341_35.method7713()) {
			local5.method9137(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "([III)V")
	private void method5892(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub6 local5 = (Class2_Sub6) this.aClass341_35.method7706(65280); local5 != null; local5 = (Class2_Sub6) this.aClass341_35.method7713()) {
			local5.method9141(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method9142() {
		return (Class2_Sub6) this.aClass341_35.method7713();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ie;Lclient!ada;)V")
	private void method5893(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		while (arg0 != this.aClass341_36.aClass2_271 && ((Class2_Sub3) arg0).anInt101 <= arg1.anInt101) {
			arg0 = arg0.aClass2_346;
		}
		Static201.method7375(arg0, arg1);
		this.anInt6624 = ((Class2_Sub3) this.aClass341_36.aClass2_271.aClass2_346).anInt101;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method9140() {
		return (Class2_Sub6) this.aClass341_35.method7706(65280);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9137(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt6624 < 0) {
				this.method5891(arg0);
				return;
			}
			if (this.anInt6623 + arg0 < this.anInt6624) {
				this.anInt6623 += arg0;
				this.method5891(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt6624 - this.anInt6623;
			this.method5891(local29);
			arg0 -= local29;
			this.anInt6623 += local29;
			this.method5894();
			@Pc(50) Class2_Sub3 local50 = (Class2_Sub3) this.aClass341_36.method7706(65280);
			synchronized (local50) {
				@Pc(58) int local58 = local50.method114(this);
				if (local58 < 0) {
					local50.anInt101 = 0;
					this.method5895(local50);
				} else {
					local50.anInt101 = local58;
					this.method5893(local50.aClass2_346, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "()V")
	private void method5894() {
		if (this.anInt6623 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) this.aClass341_36.method7706(65280); local8 != null; local8 = (Class2_Sub3) this.aClass341_36.method7713()) {
			local8.anInt101 -= this.anInt6623;
		}
		this.anInt6624 -= this.anInt6623;
		this.anInt6623 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ada;)V")
	private void method5895(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.method9464();
		arg0.method113();
		@Pc(9) Class2 local9 = this.aClass341_36.aClass2_271.aClass2_346;
		if (local9 == this.aClass341_36.aClass2_271) {
			this.anInt6624 = -1;
		} else {
			this.anInt6624 = ((Class2_Sub3) local9).anInt101;
		}
	}
}