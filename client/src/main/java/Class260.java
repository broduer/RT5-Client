import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class260 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[I")
	private static final int[] anIntArray505 = new int[32768];

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "[I")
	private static final int[] anIntArray503;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "Lclient!kl;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "Lclient!kl;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Lclient!kl;")
	private Class213 aClass213_3;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!kl;")
	private Class213 aClass213_4;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Lclient!kl;")
	private Class213 aClass213_5;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!kl;")
	private Class213 aClass213_6;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "Lclient!lj;")
	private Class230 aClass230_1;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "Lclient!kl;")
	private Class213 aClass213_7;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Lclient!kl;")
	private Class213 aClass213_8;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!kl;")
	private Class213 aClass213_9;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "[I")
	private final int[] anIntArray502 = new int[5];

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	private int anInt6476 = 0;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "[I")
	private final int[] anIntArray504 = new int[5];

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	public int anInt6475 = 0;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "[I")
	private final int[] anIntArray510 = new int[5];

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public int anInt6474 = 500;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	private int anInt6477 = 100;

	static {
		@Pc(7) Random local7 = new Random(0L);
		for (@Pc(9) int local9 = 0; local9 < 32768; local9++) {
			anIntArray505[local9] = (local7.nextInt() & 0x2) - 1;
		}
		anIntArray503 = new int[32768];
		for (@Pc(28) int local28 = 0; local28 < 32768; local28++) {
			anIntArray503[local28] = (int) (Math.sin((double) local28 / 5215.1903D) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ge;)V")
	public void method5782(@OriginalArg(0) Class2_Sub21 arg0) {
		this.aClass213_5 = new Class213();
		this.aClass213_5.method4959(arg0);
		this.aClass213_7 = new Class213();
		this.aClass213_7.method4959(arg0);
		@Pc(21) int local21 = arg0.method7403();
		if (local21 != 0) {
			arg0.anInt8412--;
			this.aClass213_6 = new Class213();
			this.aClass213_6.method4959(arg0);
			this.aClass213_1 = new Class213();
			this.aClass213_1.method4959(arg0);
		}
		local21 = arg0.method7403();
		if (local21 != 0) {
			arg0.anInt8412--;
			this.aClass213_9 = new Class213();
			this.aClass213_9.method4959(arg0);
			this.aClass213_2 = new Class213();
			this.aClass213_2.method4959(arg0);
		}
		local21 = arg0.method7403();
		if (local21 != 0) {
			arg0.anInt8412--;
			this.aClass213_3 = new Class213();
			this.aClass213_3.method4959(arg0);
			this.aClass213_4 = new Class213();
			this.aClass213_4.method4959(arg0);
		}
		for (@Pc(109) int local109 = 0; local109 < 10; local109++) {
			@Pc(114) int local114 = arg0.method7397();
			if (local114 == 0) {
				break;
			}
			this.anIntArray502[local109] = local114;
			this.anIntArray510[local109] = arg0.method7367();
			this.anIntArray504[local109] = arg0.method7397();
		}
		this.anInt6476 = arg0.method7397();
		this.anInt6477 = arg0.method7397();
		this.anInt6474 = arg0.method7389();
		this.anInt6475 = arg0.method7389();
		this.aClass230_1 = new Class230();
		this.aClass213_8 = new Class213();
		this.aClass230_1.method5264(arg0, this.aClass213_8);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)[I")
	public int[] method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static735.method7695(Static423.anIntArray506, 0, arg0);
		if (arg1 < 10) {
			return Static423.anIntArray506;
		}
		@Pc(16) double local16 = (double) arg0 / ((double) arg1 + 0.0D);
		this.aClass213_5.method4957();
		this.aClass213_7.method4957();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		if (this.aClass213_6 != null) {
			this.aClass213_6.method4957();
			this.aClass213_1.method4957();
			local24 = (int) ((double) (this.aClass213_6.anInt5495 - this.aClass213_6.anInt5494) * 32.768D / local16);
			local26 = (int) ((double) this.aClass213_6.anInt5494 * 32.768D / local16);
		}
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = 0;
		if (this.aClass213_9 != null) {
			this.aClass213_9.method4957();
			this.aClass213_2.method4957();
			local63 = (int) ((double) (this.aClass213_9.anInt5495 - this.aClass213_9.anInt5494) * 32.768D / local16);
			local65 = (int) ((double) this.aClass213_9.anInt5494 * 32.768D / local16);
		}
		for (@Pc(102) int local102 = 0; local102 < 5; local102++) {
			if (this.anIntArray502[local102] != 0) {
				Static423.anIntArray508[local102] = 0;
				Static423.anIntArray511[local102] = (int) ((double) this.anIntArray504[local102] * local16);
				Static423.anIntArray512[local102] = (this.anIntArray502[local102] << 14) / 100;
				Static423.anIntArray507[local102] = (int) ((double) (this.aClass213_5.anInt5495 - this.aClass213_5.anInt5494) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray510[local102]) / local16);
				Static423.anIntArray509[local102] = (int) ((double) this.aClass213_5.anInt5494 * 32.768D / local16);
			}
		}
		@Pc(182) int local182;
		@Pc(187) int local187;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(176) int local176 = 0; local176 < arg0; local176++) {
			local182 = this.aClass213_5.method4958(arg0);
			local187 = this.aClass213_7.method4958(arg0);
			if (this.aClass213_6 != null) {
				local195 = this.aClass213_6.method4958(arg0);
				local200 = this.aClass213_1.method4958(arg0);
				local182 += this.method5784(local28, local200, this.aClass213_6.anInt5496) >> 1;
				local28 += (local195 * local24 >> 16) + local26;
			}
			if (this.aClass213_9 != null) {
				local195 = this.aClass213_9.method4958(arg0);
				local200 = this.aClass213_2.method4958(arg0);
				local187 = local187 * ((this.method5784(local67, local200, this.aClass213_9.anInt5496) >> 1) + 32768) >> 15;
				local67 += (local195 * local63 >> 16) + local65;
			}
			for (local195 = 0; local195 < 5; local195++) {
				if (this.anIntArray502[local195] != 0) {
					local200 = local176 + Static423.anIntArray511[local195];
					if (local200 < arg0) {
						Static423.anIntArray506[local200] += this.method5784(Static423.anIntArray508[local195], local187 * Static423.anIntArray512[local195] >> 15, this.aClass213_5.anInt5496);
						Static423.anIntArray508[local195] += (local182 * Static423.anIntArray507[local195] >> 16) + Static423.anIntArray509[local195];
					}
				}
			}
		}
		@Pc(347) int local347;
		@Pc(352) int local352;
		if (this.aClass213_3 != null) {
			this.aClass213_3.method4957();
			this.aClass213_4.method4957();
			local182 = 0;
			@Pc(339) boolean local339 = true;
			for (local200 = 0; local200 < arg0; local200++) {
				local347 = this.aClass213_3.method4958(arg0);
				local352 = this.aClass213_4.method4958(arg0);
				if (local339) {
					local187 = this.aClass213_3.anInt5494 + ((this.aClass213_3.anInt5495 - this.aClass213_3.anInt5494) * local347 >> 8);
				} else {
					local187 = this.aClass213_3.anInt5494 + ((this.aClass213_3.anInt5495 - this.aClass213_3.anInt5494) * local352 >> 8);
				}
				local182 += 256;
				if (local182 >= local187) {
					local182 = 0;
					local339 = !local339;
				}
				if (local339) {
					Static423.anIntArray506[local200] = 0;
				}
			}
		}
		if (this.anInt6476 > 0 && this.anInt6477 > 0) {
			local182 = (int) ((double) this.anInt6476 * local16);
			for (local187 = local182; local187 < arg0; local187++) {
				Static423.anIntArray506[local187] += Static423.anIntArray506[local187 - local182] * this.anInt6477 / 100;
			}
		}
		if (this.aClass230_1.anIntArray452[0] > 0 || this.aClass230_1.anIntArray452[1] > 0) {
			this.aClass213_8.method4957();
			local182 = this.aClass213_8.method4958(arg0 + 1);
			local187 = this.aClass230_1.method5263(0, (float) local182 / 65536.0F);
			local195 = this.aClass230_1.method5263(1, (float) local182 / 65536.0F);
			if (arg0 >= local187 + local195) {
				local200 = 0;
				local347 = local195;
				if (local195 > arg0 - local187) {
					local347 = arg0 - local187;
				}
				@Pc(519) int local519;
				@Pc(549) int local549;
				while (local200 < local347) {
					local352 = (int) ((long) Static423.anIntArray506[local200 + local187] * (long) Static365.anInt5869 >> 16);
					for (local519 = 0; local519 < local187; local519++) {
						local352 += (int) ((long) Static423.anIntArray506[local200 + local187 - local519 - 1] * (long) Static365.anIntArrayArray144[0][local519] >> 16);
					}
					for (local549 = 0; local549 < local200; local549++) {
						local352 -= (int) ((long) Static423.anIntArray506[local200 - local549 - 1] * (long) Static365.anIntArrayArray144[1][local549] >> 16);
					}
					Static423.anIntArray506[local200] = local352;
					local182 = this.aClass213_8.method4958(arg0 + 1);
					local200++;
				}
				local347 = 128;
				while (true) {
					if (local347 > arg0 - local187) {
						local347 = arg0 - local187;
					}
					while (local200 < local347) {
						local352 = (int) ((long) Static423.anIntArray506[local200 + local187] * (long) Static365.anInt5869 >> 16);
						for (local519 = 0; local519 < local187; local519++) {
							local352 += (int) ((long) Static423.anIntArray506[local200 + local187 - local519 - 1] * (long) Static365.anIntArrayArray144[0][local519] >> 16);
						}
						for (local549 = 0; local549 < local195; local549++) {
							local352 -= (int) ((long) Static423.anIntArray506[local200 - local549 - 1] * (long) Static365.anIntArrayArray144[1][local549] >> 16);
						}
						Static423.anIntArray506[local200] = local352;
						local182 = this.aClass213_8.method4958(arg0 + 1);
						local200++;
					}
					if (local200 >= arg0 - local187) {
						while (local200 < arg0) {
							local352 = 0;
							for (local519 = local200 + local187 - arg0; local519 < local187; local519++) {
								local352 += (int) ((long) Static423.anIntArray506[local200 + local187 - local519 - 1] * (long) Static365.anIntArrayArray144[0][local519] >> 16);
							}
							for (local549 = 0; local549 < local195; local549++) {
								local352 -= (int) ((long) Static423.anIntArray506[local200 - local549 - 1] * (long) Static365.anIntArrayArray144[1][local549] >> 16);
							}
							Static423.anIntArray506[local200] = local352;
							this.aClass213_8.method4958(arg0 + 1);
							local200++;
						}
						break;
					}
					local187 = this.aClass230_1.method5263(0, (float) local182 / 65536.0F);
					local195 = this.aClass230_1.method5263(1, (float) local182 / 65536.0F);
					local347 += 128;
				}
			}
		}
		for (local182 = 0; local182 < arg0; local182++) {
			if (Static423.anIntArray506[local182] < -32768) {
				Static423.anIntArray506[local182] = -32768;
			}
			if (Static423.anIntArray506[local182] > 32767) {
				Static423.anIntArray506[local182] = 32767;
			}
		}
		return Static423.anIntArray506;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(III)I")
	private int method5784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return anIntArray503[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return anIntArray505[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}
}