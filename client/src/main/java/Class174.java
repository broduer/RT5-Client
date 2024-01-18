import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class174 implements Runnable {

	@OriginalMember(owner = "client!iba", name = "j", descriptor = "[I")
	public static final int[] anIntArray325 = new int[32];

	@OriginalMember(owner = "client!iba", name = "d", descriptor = "Lclient!jga;")
	private final Class192 aClass192_7 = new Class192();

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "I")
	public int anInt4243 = 0;

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
	public Class174(@OriginalArg(0) Class390 arg0) {
		@Pc(20) Class270 local20 = arg0.method6432(this, 5);
		while (local20.anInt6789 == 0) {
			Static638.method5959(10L);
		}
		if (local20.anInt6789 == 2) {
			throw new RuntimeException();
		}
		this.aThread2 = (Thread) local20.anObject13;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!af;IZ)Lclient!vp;")
	public Class2_Sub2_Sub17_Sub2 method2683(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub2_Sub17_Sub2 local7 = new Class2_Sub2_Sub17_Sub2();
		local7.anInt10352 = 1;
		@Pc(13) Class192 local13 = this.aClass192_7;
		synchronized (this.aClass192_7) {
			@Pc(21) Class2_Sub2_Sub17_Sub2 local21 = (Class2_Sub2_Sub17_Sub2) this.aClass192_7.method3017();
			while (true) {
				if (local21 == null) {
					break;
				}
				if (local21.aLong325 == (long) arg1 && local21.aClass9_4 == arg0 && local21.anInt10352 == 2) {
					local7.aBoolean778 = false;
					local7.aByteArray109 = local21.aByteArray109;
					return local7;
				}
				local21 = (Class2_Sub2_Sub17_Sub2) this.aClass192_7.method3015();
			}
		}
		local7.aByteArray109 = arg0.method74(arg1);
		local7.aBoolean777 = true;
		local7.aBoolean778 = false;
		return local7;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public void method2684() {
		this.aBoolean333 = true;
		@Pc(9) Class192 local9 = this.aClass192_7;
		synchronized (this.aClass192_7) {
			this.aClass192_7.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(25) InterruptedException local25) {
		}
		this.aThread2 = null;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!vp;)V")
	private void method2685(@OriginalArg(1) Class2_Sub2_Sub17_Sub2 arg0) {
		@Pc(6) Class192 local6 = this.aClass192_7;
		synchronized (this.aClass192_7) {
			this.aClass192_7.method3013(arg0);
			this.anInt4243++;
			this.aClass192_7.notifyAll();
		}
	}

	@OriginalMember(owner = "client!iba", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean333) {
			@Pc(10) Class192 local10 = this.aClass192_7;
			@Pc(18) Class2_Sub2_Sub17_Sub2 local18;
			synchronized (this.aClass192_7) {
				local18 = (Class2_Sub2_Sub17_Sub2) this.aClass192_7.method3011();
				if (local18 == null) {
					try {
						this.aClass192_7.wait();
					} catch (@Pc(26) InterruptedException local26) {
					}
					continue;
				}
				this.anInt4243--;
			}
			try {
				if (local18.anInt10352 == 2) {
					local18.aClass9_4.method73(local18.aByteArray109.length, local18.aByteArray109, (int) local18.aLong325);
				} else if (local18.anInt10352 == 3) {
					local18.aByteArray109 = local18.aClass9_4.method74((int) local18.aLong325);
				}
			} catch (@Pc(83) Exception local83) {
				Static240.method2529(local83, (String) null);
			}
			local18.aBoolean778 = false;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B[BILclient!af;)Lclient!vp;")
	public Class2_Sub2_Sub17_Sub2 method2687(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2) {
		@Pc(7) Class2_Sub2_Sub17_Sub2 local7 = new Class2_Sub2_Sub17_Sub2();
		local7.aLong325 = (long) arg1;
		local7.anInt10352 = 2;
		local7.aByteArray109 = arg0;
		local7.aClass9_4 = arg2;
		local7.aBoolean777 = false;
		this.method2685(local7);
		return local7;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lclient!af;II)Lclient!vp;")
	public Class2_Sub2_Sub17_Sub2 method2688(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class2_Sub2_Sub17_Sub2 local7 = new Class2_Sub2_Sub17_Sub2();
		local7.aClass9_4 = arg0;
		local7.aBoolean777 = false;
		local7.anInt10352 = 3;
		local7.aLong325 = (long) arg1;
		this.method2685(local7);
		return local7;
	}
}
