import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub6_Sub5 extends PcmStream {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Z")
	private boolean aBoolean795;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	private int anInt10564;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Z")
	private boolean aBoolean796;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Lclient!sia;")
	private final Class341 aClass341_80 = new Class341();

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	private int anInt10563 = 0;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt10565 = 256;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	private int anInt10562 = 256;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
	private final int anInt10549;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub6_Sub5(@OriginalArg(0) int arg0) {
		this.anInt10549 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)D")
	public synchronized double method9144(@OriginalArg(0) boolean arg0) {
		if (this.anInt10563 < 1) {
			return -1.0D;
		}
		@Pc(16) Class2_Sub2_Sub8 local16 = (Class2_Sub2_Sub8) this.aClass341_80.method7706(65280);
		if (local16 == null) {
			return -1.0D;
		} else {
			if (arg0) {
				this.skip(87);
			}
			return local16.aDouble10 - (double) ((float) local16.aShortArrayArray3[0].length / (float) AudioChannel.globalSampleRate);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public PcmStream method9142() {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	public synchronized int method9147() {
		return this.anInt10563;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	public synchronized void method9148() {
		this.aBoolean796 = true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void skip(@OriginalArg(0) int arg0) {
		if (this.aBoolean795) {
			return;
		}
		while (true) {
			@Pc(14) Class2_Sub2_Sub8 local14 = this.method9152();
			if (local14 == null) {
				if (this.aBoolean796) {
					this.method9464();
					Static341.aClass363_1.method8352();
				}
				return;
			}
			if (local14.aShortArrayArray3[0].length - this.anInt10564 > arg0) {
				this.anInt10564 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray3[0].length - this.anInt10564;
			this.method9151();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IDI)Lclient!dk;")
	public Class2_Sub2_Sub8 method9149(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = arg0 | this.anInt10549 << 0;
		@Pc(17) Class2_Sub2_Sub8 local17 = (Class2_Sub2_Sub8) Static341.aClass363_1.method8349(local11);
		if (local17 == null) {
			local17 = new Class2_Sub2_Sub8(new short[this.anInt10549][arg0], arg1);
		} else {
			local17.aDouble10 = arg1;
			Static341.aClass363_1.method8351(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dk;B)V")
	public synchronized void method9150(@OriginalArg(0) Class2_Sub2_Sub8 arg0) {
		while (this.anInt10563 >= 100) {
			this.aClass341_80.method7712();
			this.anInt10563--;
		}
		this.aClass341_80.method7718(arg0);
		if (-73 != -73) {
			this.method9144(true);
		}
		this.anInt10563++;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
	private synchronized void method9151() {
		@Pc(7) Class2_Sub2_Sub8 local7 = this.method9152();
		if (local7 != null) {
			local7.method9464();
			this.anInt10563--;
			this.anInt10564 = 0;
			Static341.aClass363_1.method8348(local7, local7.method2133());
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
	@Override
	public int method9139() {
		return 1;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public PcmStream firstSubStream() {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lclient!dk;")
	private synchronized Class2_Sub2_Sub8 method9152() {
		return (Class2_Sub2_Sub8) this.aClass341_80.method7706(65280);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public synchronized void method9153(@OriginalArg(1) boolean arg0) {
		this.aBoolean795 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public void method9154(@OriginalArg(0) int arg0) {
		this.anInt10565 = arg0;
		this.anInt10562 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void read(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean795) {
			return;
		}
		if (this.method9152() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (AudioChannel.stereo) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt10549 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(56) Class2_Sub2_Sub8 local56 = this.method9152();
				if (local56 == null) {
					return;
				}
				@Pc(62) short[][] local62 = local56.aShortArrayArray3;
				while (local32 > arg1 && this.anInt10564 < local62[0].length) {
					if (AudioChannel.stereo) {
						arg0[arg1++] = local62[0][this.anInt10564] * this.anInt10562;
						arg0[arg1++] = this.anInt10565 * local62[local42][this.anInt10564];
					} else {
						@Pc(70) int local70 = arg1++;
						arg0[local70] += this.anInt10565 * local62[local42][this.anInt10564] + local62[0][this.anInt10564] * this.anInt10562;
					}
					this.anInt10564++;
				}
				if (this.anInt10564 >= local62[0].length) {
					this.method9151();
				}
			}
		} else if (this.aBoolean796) {
			this.method9464();
			Static341.aClass363_1.method8352();
		}
	}
}
