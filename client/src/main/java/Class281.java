import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oka")
public final class Class281 {

	@OriginalMember(owner = "client!oka", name = "i", descriptor = "Lclient!sb;")
	private final Class332 aClass332_92;

	@OriginalMember(owner = "client!oka", name = "d", descriptor = "I")
	private final int anInt7015;

	@OriginalMember(owner = "client!oka", name = "f", descriptor = "[[I")
	private final int[][] anIntArrayArray171;

	@OriginalMember(owner = "client!oka", name = "k", descriptor = "[Z")
	private final boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!oka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class281(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_92 = arg2;
		this.aClass332_92.method7615(1);
		@Pc(22) Packet local22 = new Packet(this.aClass332_92.method7602(0, 0));
		@Pc(26) int local26 = local22.g1();
		if (local26 > 3) {
			this.aBooleanArray22 = new boolean[0];
			this.anInt7015 = -1;
			this.anIntArrayArray171 = new int[0][];
		} else {
			@Pc(33) int local33 = local22.g1();
			@Pc(36) Class206[] local36 = Static370.method5288();
			@Pc(38) boolean local38 = true;
			@Pc(44) int local44;
			@Pc(50) int local50;
			if (local33 == local36.length) {
				for (local44 = 0; local44 < local36.length; local44++) {
					local50 = local22.g1();
					if (local50 != local36[local44].anInt5131) {
						local38 = false;
						break;
					}
				}
			} else {
				local38 = false;
			}
			if (local38) {
				local44 = local22.g1();
				local50 = local22.g1();
				if (local26 > 2) {
					this.anInt7015 = local22.method7363();
				} else {
					this.anInt7015 = -1;
				}
				this.anIntArrayArray171 = new int[local50 + 1][];
				this.aBooleanArray22 = new boolean[local50 + 1];
				@Pc(128) int local128;
				for (@Pc(122) int local122 = 0; local122 < local44; local122++) {
					local128 = local22.g1();
					this.aBooleanArray22[local128] = local22.g1() == 1;
					@Pc(147) int local147 = local22.g2();
					@Pc(169) int local169;
					if (this.anInt7015 == -1) {
						this.anIntArrayArray171[local128] = new int[local147];
						for (local169 = 0; local169 < local147; local169++) {
							this.anIntArrayArray171[local128][local169] = local22.g2();
						}
					} else {
						this.anIntArrayArray171[local128] = new int[local147 + 1];
						this.anIntArrayArray171[local128][0] = this.anInt7015;
						for (local169 = 0; local169 < local147; local169++) {
							this.anIntArrayArray171[local128][local169 + 1] = local22.g2();
						}
					}
				}
				for (local128 = 0; local128 < local50 + 1; local128++) {
					if (this.anIntArrayArray171[local128] == null) {
						if (this.anInt7015 == -1) {
							this.anIntArrayArray171[local128] = new int[0];
						} else {
							this.anIntArrayArray171[local128] = new int[] { this.anInt7015 };
						}
					}
				}
			} else {
				this.aBooleanArray22 = new boolean[0];
				this.anIntArrayArray171 = new int[0][];
				this.anInt7015 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IB)[I")
	public int[] method6282(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || this.anIntArrayArray171.length <= arg0) {
			return this.anInt7015 == -1 ? new int[0] : new int[] { this.anInt7015 };
		} else if (this.aBooleanArray22[arg0] && this.anIntArrayArray171[arg0].length > 1) {
			@Pc(66) int local66 = this.anInt7015 == -1 ? 0 : 1;
			@Pc(70) Random local70 = new Random();
			@Pc(77) int[] local77 = new int[this.anIntArrayArray171[arg0].length];
			Static734.method7702(this.anIntArrayArray171[arg0], 0, local77, 0, local77.length);
			for (@Pc(99) int local99 = local66; local99 < local77.length; local99++) {
				@Pc(112) int local112 = local66 + Static623.method8333(local77.length - local66, local70);
				@Pc(116) int local116 = local77[local99];
				local77[local99] = local77[local112];
				local77[local112] = local116;
			}
			return local77;
		} else {
			return this.anIntArrayArray171[arg0];
		}
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(Z)Z")
	public boolean method6283() {
		return this.anInt7015 != -1;
	}

	@OriginalMember(owner = "client!oka", name = "a", descriptor = "(IZ)Lclient!de;")
	public Class76 method6284(@OriginalArg(0) int arg0) {
		@Pc(10) byte[] local10 = this.aClass332_92.method7602(arg0, 1);
		@Pc(14) Class76 local14 = new Class76();
		local14.method2032(new Packet(local10));
		return local14;
	}
}
