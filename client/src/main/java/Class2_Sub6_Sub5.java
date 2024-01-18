import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub6_Sub5 extends Class2_Sub6 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
	private boolean aBoolean794;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private int anInt10536;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
	private boolean aBoolean795;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Lclient!sia;")
	private final Class339 aClass339_80 = new Class339();

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	private int anInt10535 = 0;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt10537 = 256;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	private int anInt10534 = 256;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	private final int anInt10521;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub5(@OriginalArg(0) int arg0) {
		this.anInt10521 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)D")
	public synchronized double method6566(@OriginalArg(0) boolean arg0) {
		if (this.anInt10535 < 1) {
			return -1.0D;
		}
		@Pc(16) Class2_Sub2_Sub8 local16 = (Class2_Sub2_Sub8) this.aClass339_80.method5453(65280);
		if (local16 == null) {
			return -1.0D;
		} else {
			if (arg0) {
				this.method6559(87);
			}
			return local16.aDouble10 - (double) ((float) local16.aShortArrayArray3[0].length / (float) Static686.anInt8944);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method6564() {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	public synchronized int method6569() {
		return this.anInt10535;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public synchronized void method6570() {
		this.aBoolean795 = true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6559(@OriginalArg(0) int arg0) {
		if (this.aBoolean794) {
			return;
		}
		while (true) {
			@Pc(14) Class2_Sub2_Sub8 local14 = this.method6574();
			if (local14 == null) {
				if (this.aBoolean795) {
					this.a((byte) 46);
					Static341.aClass361_1.method5909();
				}
				return;
			}
			if (local14.aShortArrayArray3[0].length - this.anInt10536 > arg0) {
				this.anInt10536 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray3[0].length - this.anInt10536;
			this.method6573();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IDI)Lclient!dk;")
	public Class2_Sub2_Sub8 method6571(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt10521 << 0);
		@Pc(17) Class2_Sub2_Sub8 local17 = (Class2_Sub2_Sub8) Static341.aClass361_1.method5906(local11);
		if (local17 == null) {
			local17 = new Class2_Sub2_Sub8(new short[this.anInt10521][arg0], arg1);
		} else {
			local17.aDouble10 = arg1;
			Static341.aClass361_1.method5908(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dk;B)V")
	public synchronized void method6572(@OriginalArg(0) Class2_Sub2_Sub8 arg0) {
		while (this.anInt10535 >= 100) {
			this.aClass339_80.method5459();
			this.anInt10535--;
		}
		this.aClass339_80.method5465(arg0);
		if (-73 != -73) {
			this.method6566(true);
		}
		this.anInt10535++;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	private synchronized void method6573() {
		@Pc(7) Class2_Sub2_Sub8 local7 = this.method6574();
		if (local7 != null) {
			local7.a((byte) 99);
			this.anInt10535--;
			this.anInt10536 = 0;
			Static341.aClass361_1.method5905(local7, local7.method1367());
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
	@Override
	public int method6561() {
		return 1;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method6562() {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lclient!dk;")
	private synchronized Class2_Sub2_Sub8 method6574() {
		return (Class2_Sub2_Sub8) this.aClass339_80.method5453(65280);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public synchronized void method6575(@OriginalArg(1) boolean arg0) {
		this.aBoolean794 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public void method6576(@OriginalArg(0) int arg0) {
		this.anInt10537 = arg0;
		this.anInt10534 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean794) {
			return;
		}
		if (this.method6574() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (Static316.aBoolean644) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt10521 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(56) Class2_Sub2_Sub8 local56 = this.method6574();
				if (local56 == null) {
					return;
				}
				@Pc(62) short[][] local62 = local56.aShortArrayArray3;
				while (local32 > arg1 && this.anInt10536 < local62[0].length) {
					if (Static316.aBoolean644) {
						arg0[arg1++] = local62[0][this.anInt10536] * this.anInt10534;
						arg0[arg1++] = this.anInt10537 * local62[local42][this.anInt10536];
					} else {
						@Pc(70) int local70 = arg1++;
						arg0[local70] += this.anInt10537 * local62[local42][this.anInt10536] + local62[0][this.anInt10536] * this.anInt10534;
					}
					this.anInt10536++;
				}
				if (this.anInt10536 >= local62[0].length) {
					this.method6573();
				}
			}
		} else if (this.aBoolean795) {
			this.a((byte) 45);
			Static341.aClass361_1.method5909();
		}
	}
}
