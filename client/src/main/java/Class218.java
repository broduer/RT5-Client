import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class218 {

	@OriginalMember(owner = "client!la", name = "p", descriptor = "[I")
	private int[] anIntArray428;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "[I")
	private int[] anIntArray429;

	@OriginalMember(owner = "client!la", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray137;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!av;")
	private Class28 aClass28_30;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "[I")
	private int[] anIntArray430;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray27;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "[I")
	private int[] anIntArray431;

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray28;

	@OriginalMember(owner = "client!la", name = "t", descriptor = "Ljava/lang/String;")
	private String aString54;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "[I")
	private int[] anIntArray434;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!la", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray138;

	@OriginalMember(owner = "client!la", name = "b", descriptor = "[I")
	private int[] anIntArray436;

	@OriginalMember(owner = "client!la", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray139;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Ljava/lang/String;")
	private String aString55;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public int anInt5704 = -1;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public void method3590() {
		if (this.aString54 == null) {
			this.aString54 = this.aString55;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method3592(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.aString55 = arg1.method5152();
		} else if (arg0 == 2) {
			this.aString54 = arg1.method5152();
		} else {
			@Pc(29) int local29;
			@Pc(36) int local36;
			if (arg0 == 3) {
				local29 = arg1.method5205();
				this.anIntArrayArray138 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray138[local36][0] = arg1.method5191();
					this.anIntArrayArray138[local36][1] = arg1.method5158();
					this.anIntArrayArray138[local36][2] = arg1.method5158();
				}
			} else if (arg0 == 4) {
				local29 = arg1.method5205();
				this.anIntArrayArray137 = new int[local29][3];
				for (local36 = 0; local36 < local29; local36++) {
					this.anIntArrayArray137[local36][0] = arg1.method5191();
					this.anIntArrayArray137[local36][1] = arg1.method5158();
					this.anIntArrayArray137[local36][2] = arg1.method5158();
				}
			} else if (arg0 == 5) {
				arg1.method5191();
			} else if (arg0 == 6) {
				arg1.method5205();
			} else if (arg0 == 7) {
				arg1.method5205();
			} else if (arg0 != 8) {
				if (arg0 == 9) {
					arg1.method5205();
				} else if (arg0 == 10) {
					local29 = arg1.method5205();
					this.anIntArray436 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray436[local36] = arg1.method5158();
					}
				} else if (arg0 == 12) {
					arg1.method5158();
				} else if (arg0 == 13) {
					local29 = arg1.method5205();
					this.anIntArray435 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray435[local36] = arg1.method5191();
					}
				} else if (arg0 == 14) {
					local29 = arg1.method5205();
					this.anIntArrayArray139 = new int[local29][2];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArrayArray139[local36][0] = arg1.method5205();
						this.anIntArrayArray139[local36][1] = arg1.method5205();
					}
				} else if (arg0 == 15) {
					arg1.method5191();
				} else if (arg0 == 17) {
					this.anInt5704 = arg1.method5191();
				} else if (arg0 == 18) {
					local29 = arg1.method5205();
					this.aStringArray28 = new String[local29];
					this.anIntArray432 = new int[local29];
					this.anIntArray431 = new int[local29];
					this.anIntArray429 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray432[local36] = arg1.method5158();
						this.anIntArray429[local36] = arg1.method5158();
						this.anIntArray431[local36] = arg1.method5158();
						this.aStringArray28[local36] = arg1.method5167();
					}
				} else if (arg0 == 19) {
					local29 = arg1.method5205();
					this.anIntArray434 = new int[local29];
					this.aStringArray27 = new String[local29];
					this.anIntArray430 = new int[local29];
					this.anIntArray428 = new int[local29];
					for (local36 = 0; local36 < local29; local36++) {
						this.anIntArray434[local36] = arg1.method5158();
						this.anIntArray430[local36] = arg1.method5158();
						this.anIntArray428[local36] = arg1.method5158();
						this.aStringArray27[local36] = arg1.method5167();
					}
				} else if (arg0 == 249) {
					local29 = arg1.method5205();
					if (this.aClass28_30 == null) {
						local36 = Static440.method4203(local29);
						this.aClass28_30 = new Class28(local36);
					}
					for (local36 = 0; local36 < local29; local36++) {
						@Pc(224) boolean local224 = arg1.method5205() == 1;
						@Pc(228) int local228 = arg1.method5192();
						@Pc(237) Class2 local237;
						if (local224) {
							local237 = new Class2_Sub24(arg1.method5167());
						} else {
							local237 = new Class2_Sub38(arg1.method5158());
						}
						this.aClass28_30.method370((long) local228, local237);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method3594(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5205();
			if (local3 == 0) {
				return;
			}
			this.method3592(local3, arg0);
		}
	}
}
