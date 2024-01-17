import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class174 implements Runnable {

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "[I")
	public static final int[] anIntArray325 = new int[32];

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Lclient!jga;")
	private final Class194 aClass194_7 = new Class194();

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
	public int anInt4255 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Z")
	private boolean aBoolean333 = false;

	@OriginalMember(owner = "client!iba", name = "g", descriptor = "Ljava/lang/Thread;")
	private Thread aThread2;

	static {
		@Pc(73) int local73 = 2;
		for (@Pc(75) int local75 = 0; local75 < 32; local75++) {
			anIntArray325[local75] = local73 - 1;
			local73 += local73;
		}
	}

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!vq;)V")
	public Class174(@OriginalArg(0) Class392 arg0) {
		@Pc(20) Class272 local20 = arg0.method8998(this, 5);
		while (local20.anInt6810 == 0) {
			Static638.method8402(10L);
		}
		if (local20.anInt6810 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject13;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!af;IZ)Lclient!vp;")
	public Class2_Sub2_Sub17_Sub2 method3825(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub2_Sub17_Sub2 local7 = new Class2_Sub2_Sub17_Sub2();
		local7.anInt10380 = 1;
		@Pc(13) Class194 local13 = this.aClass194_7;
		synchronized (this.aClass194_7) {
			@Pc(21) Class2_Sub2_Sub17_Sub2 local21 = (Class2_Sub2_Sub17_Sub2) this.aClass194_7.method4359();
			while (true) {
				if (local21 == null) {
					break;
				}
				if (local21.aLong325 == (long) arg1 && local21.aClass9_4 == arg0 && local21.anInt10380 == 2) {
					local7.aBoolean779 = false;
					local7.aByteArray109 = local21.aByteArray109;
					return local7;
				}
				local21 = (Class2_Sub2_Sub17_Sub2) this.aClass194_7.method4357();
			}
		}
		local7.aByteArray109 = arg0.method126(arg1);
		local7.aBoolean778 = true;
		local7.aBoolean779 = false;
		return local7;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public void method3826() {
		this.aBoolean333 = true;
		@Pc(9) Class194 local9 = this.aClass194_7;
		synchronized (this.aClass194_7) {
			this.aClass194_7.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!vp;)V")
	private void method3827(@OriginalArg(1) Class2_Sub2_Sub17_Sub2 arg0) {
		@Pc(6) Class194 local6 = this.aClass194_7;
		synchronized (this.aClass194_7) {
			this.aClass194_7.method4355(arg0);
			this.anInt4255++;
			this.aClass194_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean333) {
			@Pc(10) Class194 local10 = this.aClass194_7;
			@Pc(18) Class2_Sub2_Sub17_Sub2 local18;
			synchronized (this.aClass194_7) {
				local18 = (Class2_Sub2_Sub17_Sub2) this.aClass194_7.method4353();
				if (local18 == null) {
					try {
						this.aClass194_7.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt4255--;
			}
			try {
				if (local18.anInt10380 == 2) {
					local18.aClass9_4.method125(local18.aByteArray109.length, local18.aByteArray109, (int) local18.aLong325);
				} else if (local18.anInt10380 == 3) {
					local18.aByteArray109 = local18.aClass9_4.method126((int) local18.aLong325);
				}
			} catch (@Pc(83) Exception local83) {
				Static240.method3496(local83, null);
			}
			local18.aBoolean779 = false;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B[BILclient!af;)Lclient!vp;")
	public Class2_Sub2_Sub17_Sub2 method3829(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(7) Class2_Sub2_Sub17_Sub2 local7 = new Class2_Sub2_Sub17_Sub2();
		local7.aLong325 = arg1;
		local7.anInt10380 = 2;
		local7.aByteArray109 = arg0;
		local7.aClass9_4 = arg2;
		local7.aBoolean778 = false;
		this.method3827(local7);
		return local7;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!af;II)Lclient!vp;")
	public Class2_Sub2_Sub17_Sub2 method3830(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub2_Sub17_Sub2 local7 = new Class2_Sub2_Sub17_Sub2();
		local7.aClass9_4 = arg0;
		local7.aBoolean778 = false;
		local7.anInt10380 = 3;
		local7.aLong325 = arg1;
		this.method3827(local7);
		return local7;
	}
}
