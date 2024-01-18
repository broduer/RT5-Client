import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class112 {

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	public int anInt2682;

	@OriginalMember(owner = "client!es", name = "o", descriptor = "Lclient!dla;")
	private final Class82 aClass82_57 = new Class82(64);

	@OriginalMember(owner = "client!es", name = "b", descriptor = "Lclient!dla;")
	public final Class82 aClass82_58 = new Class82(50);

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!aka;")
	public final Class16 aClass16_1 = new Class16(250);

	@OriginalMember(owner = "client!es", name = "j", descriptor = "Lclient!rla;")
	private final Class326 aClass326_1 = new Class326();

	@OriginalMember(owner = "client!es", name = "m", descriptor = "I")
	public final int anInt2671;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "Lclient!ul;")
	private final Class379 aClass379_1;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "Lclient!sb;")
	public final Class332 aClass332_28;

	@OriginalMember(owner = "client!es", name = "q", descriptor = "Lclient!bo;")
	private final Class49 aClass49_1;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "Lclient!sb;")
	private final Class332 aClass332_29;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Z")
	private boolean aBoolean222;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "I")
	public final int anInt2679;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray11;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray10;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!ul;IZLclient!bo;Lclient!sb;Lclient!sb;)V")
	public Class112(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) Class332 arg4, @OriginalArg(5) Class332 arg5) {
		this.anInt2671 = arg1;
		this.aClass379_1 = arg0;
		this.aClass332_28 = arg5;
		this.aClass49_1 = arg3;
		this.aClass332_29 = arg4;
		this.aBoolean222 = arg2;
		if (this.aClass332_29 == null) {
			this.anInt2679 = 0;
		} else {
			@Pc(54) int local54 = this.aClass332_29.method7604() - 1;
			this.anInt2679 = this.aClass332_29.method7615(local54) + local54 * 256;
		}
		if (this.aClass379_1 == Static673.runescapeGame) {
			this.aStringArray11 = new String[] { null, null, Static32.aClass32_8.method877(this.anInt2671), null, null, Static32.aClass32_22.method877(this.anInt2671) };
		} else {
			this.aStringArray11 = new String[] { null, null, Static32.aClass32_8.method877(this.anInt2671), null, null, null };
		}
		this.aStringArray10 = new String[] { null, null, null, null, Static32.aClass32_9.method877(this.anInt2671) };
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(B)V")
	public void method2476() {
		synchronized (this.aClass82_57) {
			this.aClass82_57.method2157();
		}
		synchronized (this.aClass82_58) {
			this.aClass82_58.method2157();
		}
		synchronized (this.aClass16_1) {
			this.aClass16_1.method252();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!ha;Lclient!ha;Lclient!ju;ZIIZILclient!da;II)Lclient!st;")
	public Class23 method2478(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) Class203 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class14 arg9, @OriginalArg(10) int arg10) {
		@Pc(24) Class23 local24 = this.method2483(arg3, arg2, arg8, arg10, arg0, arg6, arg5);
		if (local24 != null) {
			return local24;
		}
		@Pc(34) Class384 local34 = this.method2486(arg10);
		if (arg6 > 1 && local34.anIntArray799 != null) {
			@Pc(44) int local44 = -1;
			for (@Pc(46) int local46 = 0; local46 < 10; local46++) {
				if (local34.anIntArray798[local46] <= arg6 && local34.anIntArray798[local46] != 0) {
					local44 = local34.anIntArray799[local46];
				}
			}
			if (local44 != -1) {
				local34 = this.method2486(local44);
			}
		}
		@Pc(101) int[] local101 = local34.method8805(arg8, arg2, arg6, arg5, arg7, arg3, arg1, arg9, arg0);
		if (local101 == null) {
			return null;
		}
		@Pc(119) Class23 local119;
		if (arg4) {
			local119 = arg1.method7953(36, 36, 32, local101);
		} else {
			local119 = arg2.method7953(36, 36, 32, local101);
		}
		if (!arg4) {
			@Pc(136) Class326 local136 = new Class326();
			local136.anInt8459 = arg8;
			local136.aBoolean642 = arg3 != null;
			local136.anInt8456 = arg2.anInt8986;
			local136.anInt8454 = arg6;
			local136.anInt8458 = arg0;
			local136.anInt8457 = arg10;
			local136.anInt8460 = arg5;
			this.aClass16_1.method261(local119, local136);
		}
		return local119;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(II)V")
	public void method2479() {
		@Pc(14) Class82 local14 = this.aClass82_57;
		synchronized (this.aClass82_57) {
			this.aClass82_57.method2147(5);
		}
		local14 = this.aClass82_58;
		synchronized (this.aClass82_58) {
			this.aClass82_58.method2147(5);
		}
		@Pc(48) Class16 local48 = this.aClass16_1;
		synchronized (this.aClass16_1) {
			this.aClass16_1.method255();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	public void method2480() {
		@Pc(6) Class82 local6 = this.aClass82_57;
		synchronized (this.aClass82_57) {
			this.aClass82_57.method2151();
		}
		local6 = this.aClass82_58;
		synchronized (this.aClass82_58) {
			this.aClass82_58.method2151();
		}
		@Pc(44) Class16 local44 = this.aClass16_1;
		synchronized (this.aClass16_1) {
			this.aClass16_1.method253();
		}
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(II)V")
	public void method2481(@OriginalArg(0) int arg0) {
		this.anInt2682 = arg0;
		@Pc(17) Class82 local17 = this.aClass82_58;
		synchronized (this.aClass82_58) {
			this.aClass82_58.method2157();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public void method2482() {
		@Pc(2) Class82 local2 = this.aClass82_58;
		synchronized (this.aClass82_58) {
			this.aClass82_58.method2157();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!ju;BLclient!ha;IIIII)Lclient!st;")
	public Class23 method2483(@OriginalArg(0) Class203 arg0, @OriginalArg(2) Class19 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass326_1.anInt8454 = arg5;
		this.aClass326_1.anInt8456 = arg1.anInt8986;
		this.aClass326_1.anInt8459 = arg2;
		this.aClass326_1.anInt8460 = arg6;
		this.aClass326_1.aBoolean642 = arg0 != null;
		this.aClass326_1.anInt8458 = arg4;
		this.aClass326_1.anInt8457 = arg3;
		return (Class23) this.aClass16_1.method260(this.aClass326_1);
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	public void method2484() {
		@Pc(6) Class16 local6 = this.aClass16_1;
		synchronized (this.aClass16_1) {
			this.aClass16_1.method252();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ)V")
	public void method2485(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean222 != arg0) {
			this.aBoolean222 = arg0;
			this.method2476();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lclient!vfa;")
	public Class384 method2486(@OriginalArg(0) int arg0) {
		@Pc(14) Class82 local14 = this.aClass82_57;
		@Pc(26) Class384 local26;
		synchronized (this.aClass82_57) {
			local26 = (Class384) this.aClass82_57.method2156(arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(40) Class332 local40 = this.aClass332_29;
		@Pc(53) byte[] local53;
		synchronized (this.aClass332_29) {
			local53 = this.aClass332_29.method7602(Static223.method9107(arg0), Static593.method7788(arg0));
		}
		local26 = new Class384();
		local26.anInt10162 = arg0;
		local26.aClass112_2 = this;
		local26.aStringArray46 = this.aStringArray11.clone();
		local26.aStringArray45 = this.aStringArray10.clone();
		if (local53 != null) {
			local26.method8798(new Packet(local53));
		}
		local26.method8814();
		if (local26.anInt10114 != -1) {
			local26.method8800(this.method2486(local26.anInt10114), this.method2486(local26.anInt10137));
		}
		if (local26.anInt10110 != -1) {
			local26.method8799(this.method2486(local26.anInt10171), this.method2486(local26.anInt10110));
		}
		if (local26.anInt10172 != -1) {
			local26.method8816(this.method2486(local26.anInt10172), this.method2486(local26.anInt10141));
		}
		if (!this.aBoolean222 && local26.aBoolean771) {
			local26.aString118 = Static32.aClass32_5.method877(this.anInt2671);
			local26.aStringArray46 = this.aStringArray11;
			local26.aStringArray45 = this.aStringArray10;
			local26.anIntArray800 = null;
			local26.anInt10149 = 0;
			local26.aBoolean772 = false;
			if (local26.aClass28_44 != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Node local200 = local26.aClass28_44.method736(); local200 != null; local200 = local26.aClass28_44.method740()) {
					@Pc(209) Class298 local209 = this.aClass49_1.method1161((int) local200.key);
					if (local209.aBoolean570) {
						local200.unlink();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local26.aClass28_44 = null;
				}
			}
		}
		@Pc(238) Class82 local238 = this.aClass82_57;
		synchronized (this.aClass82_57) {
			this.aClass82_57.method2150(local26, arg0);
			return local26;
		}
	}
}
