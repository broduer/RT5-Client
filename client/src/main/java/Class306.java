import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class306 implements Interface23 {

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "Lclient!av;")
	private HashTable aClass28_39 = new HashTable(128);

	@OriginalMember(owner = "client!qga", name = "k", descriptor = "[I")
	private final int[] anIntArray622 = new int[client.varpTypeList.anInt6482];

	@OriginalMember(owner = "client!qga", name = "j", descriptor = "[I")
	public final int[] anIntArray621 = new int[client.varpTypeList.anInt6482];

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)V")
	public void method6873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray621[arg0] = arg1;
		@Pc(24) Node_Sub48 local24 = (Node_Sub48) this.aClass28_39.get(arg0);
		if (local24 == null) {
			local24 = new Node_Sub48(Static588.currentTimeMillis() + 500L);
			this.aClass28_39.put(arg0, local24);
		} else {
			local24.aLong264 = Static588.currentTimeMillis() + 500L;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IB)I")
	@Override
	public int method6871(@OriginalArg(0) int arg0) {
		@Pc(8) VarbitType local8 = client.varbitTypeList.method3426(arg0);
		@Pc(11) int local11 = local8.anInt2510;
		@Pc(22) int local22 = local8.anInt2506;
		@Pc(25) int local25 = local8.anInt2508;
		@Pc(32) int local32 = Js5CacheQueue.anIntArray325[local25 - local22];
		return this.anIntArray621[local11] >> local22 & local32;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
	public void method6874() {
		for (@Pc(5) int local5 = 0; local5 < client.varpTypeList.anInt6482; local5++) {
			@Pc(11) VarpType local11 = client.varpTypeList.method5789(local5);
			if (local11 != null && local11.anInt8324 == 0) {
				this.anIntArray622[local5] = 0;
				this.anIntArray621[local5] = 0;
			}
		}
		this.aClass28_39 = new HashTable(128);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(BII)V")
	public void method6875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) VarbitType local13 = client.varbitTypeList.method3426(arg1);
		@Pc(16) int local16 = local13.anInt2510;
		@Pc(19) int local19 = local13.anInt2506;
		@Pc(22) int local22 = local13.anInt2508;
		@Pc(29) int local29 = Js5CacheQueue.anIntArray325[local22 - local19];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local19;
		this.method6873(local16, ~local29 & this.anIntArray621[local16] | local29 & arg0 << local19);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)I")
	@Override
	public int method6872(@OriginalArg(0) int arg0) {
		return this.anIntArray621[arg0];
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(III)V")
	public void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) VarbitType local8 = client.varbitTypeList.method3426(arg1);
		@Pc(11) int local11 = local8.anInt2510;
		@Pc(14) int local14 = local8.anInt2506;
		@Pc(17) int local17 = local8.anInt2508;
		@Pc(31) int local31 = Js5CacheQueue.anIntArray325[local17 - local14];
		if (arg0 < 0 || arg0 > local31) {
			arg0 = 0;
		}
		local31 <<= local14;
		this.method6880(local11, arg0 << local14 & local31 | this.anIntArray622[local11] & ~local31);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZ)I")
	public int method6879(@OriginalArg(1) boolean arg0) {
		@Pc(8) long local8 = Static588.currentTimeMillis();
		for (@Pc(23) Node_Sub48 local23 = arg0 ? (Node_Sub48) this.aClass28_39.method736() : (Node_Sub48) this.aClass28_39.method740(); local23 != null; local23 = (Node_Sub48) this.aClass28_39.method740()) {
			if ((local23.aLong264 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local23.aLong264 & 0x4000000000000000L) != 0L) {
					@Pc(55) int local55 = (int) local23.key;
					this.anIntArray621[local55] = this.anIntArray622[local55];
					local23.unlink();
					return local55;
				}
				local23.unlink();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(BII)V")
	public void method6880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray622[arg0] = arg1;
		@Pc(24) Node_Sub48 local24 = (Node_Sub48) this.aClass28_39.get(arg0);
		if (local24 == null) {
			local24 = new Node_Sub48(4611686018427387905L);
			this.aClass28_39.put(arg0, local24);
		} else if (local24.aLong264 != 4611686018427387905L) {
			local24.aLong264 = Static588.currentTimeMillis() + 500L | 0x4000000000000000L;
		}
	}
}
