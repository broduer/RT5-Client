import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public abstract class Class35 {

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
	private int anInt6523 = 4;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "[S")
	private final short[] aShortArray98 = new short[512];

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
	protected int anInt6525 = 4;

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "I")
	private int anInt6531 = 4;

	@OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
	private int anInt6527 = 4;

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
	private int anInt6530 = 0;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(IIIII)V")
	protected Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6527 = arg4;
		this.anInt6531 = arg3;
		this.anInt6523 = arg2;
		this.anInt6530 = arg0;
		this.anInt6525 = arg1;
		this.method5814();
		this.method5817();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IBII)V")
	protected final void method5813() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(9) int[] local9 = new int[128];
		for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
			local6[local11] = (local11 << 12) / 128;
		}
		@Pc(27) int[] local27 = new int[16];
		for (@Pc(29) int local29 = 0; local29 < 128; local29++) {
			local9[local29] = (local29 << 12) / 128;
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			local27[local48] = (local48 << 12) / 16;
		}
		this.method5819();
		for (@Pc(74) int local74 = 0; local74 < 16; local74++) {
			for (@Pc(77) int local77 = 0; local77 < 128; local77++) {
				for (@Pc(80) int local80 = 0; local80 < 128; local80++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt6525; local83++) {
						@Pc(91) int local91 = this.aShortArray97[local83] << 12;
						@Pc(99) int local99 = local27[local74] * local91 >> 12;
						@Pc(106) int local106 = this.anInt6531 * local91 >> 12;
						@Pc(114) int local114 = local9[local77] * local91 >> 12;
						@Pc(122) int local122 = local91 * local6[local80] >> 12;
						@Pc(129) int local129 = local91 * this.anInt6523 >> 12;
						@Pc(136) int local136 = this.anInt6527 * local91 >> 12;
						@Pc(141) int local141 = local99 * this.anInt6527;
						@Pc(146) int local146 = local114 * this.anInt6531;
						@Pc(151) int local151 = local122 * this.anInt6523;
						@Pc(155) int local155 = local151 >> 12;
						@Pc(159) int local159 = local155 + 1;
						@Pc(163) int local163 = local146 >> 12;
						@Pc(167) int local167 = local155 & 0xFF;
						@Pc(171) int local171 = local163 + 1;
						@Pc(175) int local175 = local141 >> 12;
						@Pc(179) int local179 = local163 & 0xFF;
						@Pc(183) int local183 = local175 + 1;
						@Pc(187) int local187 = local146 & 0xFFF;
						if (local129 <= local159) {
							local159 = 0;
						} else {
							local159 &= 0xFF;
						}
						local122 = local151 & 0xFFF;
						if (local183 >= local136) {
							local183 = 0;
						} else {
							local183 &= 0xFF;
						}
						local99 = local141 & 0xFFF;
						if (local106 <= local171) {
							local171 = 0;
						} else {
							local171 &= 0xFF;
						}
						local175 &= 0xFF;
						@Pc(237) int local237 = Class2_Sub2_Sub19.anIntArray768[local122];
						@Pc(241) int local241 = Class2_Sub2_Sub19.anIntArray768[local187];
						@Pc(245) int local245 = Class2_Sub2_Sub19.anIntArray768[local99];
						@Pc(250) short local250 = this.aShortArray98[local183];
						@Pc(255) short local255 = this.aShortArray98[local175];
						@Pc(259) int local259 = local187 - 4096;
						@Pc(263) int local263 = local122 - 4096;
						@Pc(267) int local267 = local99 - 4096;
						@Pc(274) short local274 = this.aShortArray98[local171 + local255];
						@Pc(281) short local281 = this.aShortArray98[local250 + local179];
						@Pc(288) short local288 = this.aShortArray98[local250 + local171];
						@Pc(295) short local295 = this.aShortArray98[local255 + local179];
						@Pc(307) int local307 = Static487.method6522(local99, this.aShortArray98[local167 + local295], local122, local187);
						@Pc(319) int local319 = Static487.method6522(local99, this.aShortArray98[local295 + local159], local263, local187);
						@Pc(329) int local329 = ((local319 - local307) * local237 >> 12) + local307;
						@Pc(341) int local341 = Static487.method6522(local99, this.aShortArray98[local167 + local274], local122, local259);
						@Pc(353) int local353 = Static487.method6522(local99, this.aShortArray98[local159 + local274], local263, local259);
						@Pc(364) int local364 = local341 + (local237 * (local353 - local341) >> 12);
						@Pc(377) int local377 = Static487.method6522(local267, this.aShortArray98[local167 + local281], local122, local187);
						@Pc(388) int local388 = (local241 * (local364 - local329) >> 12) + local329;
						@Pc(400) int local400 = Static487.method6522(local267, this.aShortArray98[local281 + local159], local263, local187);
						@Pc(411) int local411 = local377 + (local237 * (local400 - local377) >> 12);
						@Pc(424) int local424 = Static487.method6522(local267, this.aShortArray98[local167 + local288], local122, local259);
						@Pc(436) int local436 = Static487.method6522(local267, this.aShortArray98[local159 + local288], local263, local259);
						@Pc(447) int local447 = ((local436 - local424) * local237 >> 12) + local424;
						@Pc(458) int local458 = ((local447 - local411) * local241 >> 12) + local411;
						this.method5816((local245 * (local458 - local388) >> 12) + local388, local83);
					}
					this.method5815();
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
	private void method5814() {
		this.aShortArray97 = new short[this.anInt6525];
		for (@Pc(18) int local18 = 0; local18 < this.anInt6525; local18++) {
			this.aShortArray97[local18] = (short) (int) Math.pow(2.0D, local18);
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	protected abstract void method5815();

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(III)V")
	protected abstract void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
	private void method5817() {
		@Pc(10) Random local10 = new Random(this.anInt6530);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray98[local12] = (short) local12;
		}
		for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
			@Pc(37) int local37 = 255 - local25;
			@Pc(42) int local42 = Static623.method8333(local37, local10);
			@Pc(47) short local47 = this.aShortArray98[local42];
			this.aShortArray98[local42] = this.aShortArray98[local37];
			this.aShortArray98[local37] = this.aShortArray98[local37 + 256] = local47;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	protected abstract void method5819();
}
