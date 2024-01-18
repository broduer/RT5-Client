import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class MixerPcmStream extends PcmStream {

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_35 = new LinkedList();

	@OriginalMember(owner = "client!nn", name = "o", descriptor = "Lclient!sia;")
	private final LinkedList aClass341_36 = new LinkedList();

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
	public synchronized void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			@Pc(60) Node_Sub3 local60 = (Node_Sub3) this.aClass341_36.head();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method114(this);
				if (local68 < 0) {
					local60.anInt101 = 0;
					this.method5895(local60);
				} else {
					local60.anInt101 = local68;
					this.method5893(local60.next, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "()I")
	public synchronized int method5888() {
		return this.aClass341_35.method7708();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!dea;)V")
	public synchronized void method5889(@OriginalArg(0) PcmStream arg0) {
		this.aClass341_35.addHead(arg0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Lclient!dea;)V")
	public synchronized void method5890(@OriginalArg(0) PcmStream arg0) {
		arg0.unlink();
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	private void method5891(@OriginalArg(0) int arg0) {
		for (@Pc(5) PcmStream local5 = (PcmStream) this.aClass341_35.head(); local5 != null; local5 = (PcmStream) this.aClass341_35.next()) {
			local5.skip(arg0);
		}
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "([III)V")
	private void method5892(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) PcmStream local5 = (PcmStream) this.aClass341_35.head(); local5 != null; local5 = (PcmStream) this.aClass341_35.next()) {
			local5.method9141(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public PcmStream method9142() {
		return (PcmStream) this.aClass341_35.next();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ie;Lclient!ada;)V")
	private void method5893(@OriginalArg(0) Node arg0, @OriginalArg(1) Node_Sub3 arg1) {
		while (arg0 != this.aClass341_36.sentinel && ((Node_Sub3) arg0).anInt101 <= arg1.anInt101) {
			arg0 = arg0.next;
		}
		Static201.method7375(arg0, arg1);
		this.anInt6624 = ((Node_Sub3) this.aClass341_36.sentinel.next).anInt101;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public PcmStream firstSubStream() {
		return (PcmStream) this.aClass341_35.head();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void skip(@OriginalArg(0) int arg0) {
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
			@Pc(50) Node_Sub3 local50 = (Node_Sub3) this.aClass341_36.head();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method114(this);
				if (local58 < 0) {
					local50.anInt101 = 0;
					this.method5895(local50);
				} else {
					local50.anInt101 = local58;
					this.method5893(local50.next, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "()V")
	private void method5894() {
		if (this.anInt6623 <= 0) {
			return;
		}
		for (@Pc(8) Node_Sub3 local8 = (Node_Sub3) this.aClass341_36.head(); local8 != null; local8 = (Node_Sub3) this.aClass341_36.next()) {
			local8.anInt101 -= this.anInt6623;
		}
		this.anInt6624 -= this.anInt6623;
		this.anInt6623 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!ada;)V")
	private void method5895(@OriginalArg(0) Node_Sub3 arg0) {
		arg0.unlink();
		arg0.method113();
		@Pc(9) Node local9 = this.aClass341_36.sentinel.next;
		if (local9 == this.aClass341_36.sentinel) {
			this.anInt6624 = -1;
		} else {
			this.anInt6624 = ((Node_Sub3) local9).anInt101;
		}
	}
}
