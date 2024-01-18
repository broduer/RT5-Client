import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "Lclient!pj;")
	private Class292 aClass292_1;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
	private int anInt7473 = 0;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!av;")
	private final Class28 aClass28_36 = new Class28(16);

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	private int anInt7475 = 0;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "Lclient!sia;")
	private final Class339 aClass339_41 = new Class339();

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
	private final int anInt7465;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Lclient!af;")
	private final Class9 aClass9_3;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Z")
	private boolean aBoolean567;

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Lclient!sia;")
	private Class339 aClass339_42;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "Z")
	private final boolean aBoolean569;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "Lclient!pla;")
	private final Class295 aClass295_2;

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
	private final int anInt7463;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
	private final int anInt7472;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "Lclient!iba;")
	private final Class174 aClass174_3;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "[B")
	private final byte[] aByteArray89;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "Lclient!af;")
	private final Class9 aClass9_2;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "Lclient!tw;")
	private Class2_Sub2_Sub17 aClass2_Sub2_Sub17_1;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!af;Lclient!af;Lclient!pla;Lclient!iba;I[BIZ)V")
	public Class47_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) Class295 arg3, @OriginalArg(4) Class174 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt7465 = arg0;
		this.aClass9_3 = arg1;
		if (this.aClass9_3 == null) {
			this.aBoolean567 = false;
		} else {
			this.aBoolean567 = true;
			this.aClass339_42 = new Class339();
		}
		this.aBoolean569 = arg8;
		this.aClass295_2 = arg3;
		this.anInt7463 = arg5;
		this.anInt7472 = arg7;
		this.aClass174_3 = arg4;
		this.aByteArray89 = arg6;
		this.aClass9_2 = arg2;
		if (this.aClass9_2 != null) {
			this.aClass2_Sub2_Sub17_1 = this.aClass174_3.method2683(this.aClass9_2, this.anInt7465);
		}
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)I")
	public int method4673() {
		if (this.method4671() == null) {
			return this.aClass2_Sub2_Sub17_1 == null ? 0 : this.aClass2_Sub2_Sub17_1.method6413();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I")
	public int method4674() {
		return this.aClass292_1 == null ? 0 : this.aClass292_1.anInt7367;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	@Override
	public void method4665(@OriginalArg(1) int arg0) {
		if (this.aClass9_3 == null) {
			return;
		}
		for (@Pc(23) Class2 local23 = this.aClass339_41.method5453(65280); local23 != null; local23 = this.aClass339_41.method5460()) {
			if (local23.aLong328 == (long) arg0) {
				return;
			}
		}
		@Pc(50) Class2 local50 = new Class2();
		local50.aLong328 = (long) arg0;
		this.aClass339_41.method5465(local50);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)I")
	public int method4676() {
		if (this.aClass292_1 == null) {
			return 0;
		} else if (this.aBoolean567) {
			@Pc(29) Class2 local29 = this.aClass339_42.method5453(65280);
			return local29 == null ? 0 : (int) local29.aLong328;
		} else {
			return this.aClass292_1.anInt7367;
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)V")
	public void method4677() {
		if (this.aClass339_42 != null) {
			if (this.method4671() == null) {
				return;
			}
			@Pc(33) boolean local33;
			@Pc(38) Class2 local38;
			@Pc(44) int local44;
			@Pc(147) Class2 local147;
			if (this.aBoolean567) {
				local33 = true;
				for (local38 = this.aClass339_42.method5453(65280); local38 != null; local38 = this.aClass339_42.method5460()) {
					local44 = (int) local38.aLong328;
					if (this.aByteArray88[local44] == 0) {
						this.method4680(local44, 1);
					}
					if (this.aByteArray88[local44] == 0) {
						local33 = false;
					} else {
						local38.a((byte) 122);
					}
				}
				while (this.aClass292_1.anIntArray598.length > this.anInt7475) {
					if (this.aClass292_1.anIntArray598[this.anInt7475] == 0) {
						this.anInt7475++;
					} else {
						if (this.aClass174_3.anInt4243 >= 250) {
							local33 = false;
							break;
						}
						if (this.aByteArray88[this.anInt7475] == 0) {
							this.method4680(this.anInt7475, 1);
						}
						if (this.aByteArray88[this.anInt7475] == 0) {
							local147 = new Class2();
							local147.aLong328 = (long) this.anInt7475;
							local33 = false;
							this.aClass339_42.method5465(local147);
						}
						this.anInt7475++;
					}
				}
				if (local33) {
					this.anInt7475 = 0;
					this.aBoolean567 = false;
				}
			} else if (this.aBoolean568) {
				local33 = true;
				for (local38 = this.aClass339_42.method5453(65280); local38 != null; local38 = this.aClass339_42.method5460()) {
					local44 = (int) local38.aLong328;
					if (this.aByteArray88[local44] != 1) {
						this.method4680(local44, 2);
					}
					if (this.aByteArray88[local44] == 1) {
						local38.a((byte) 108);
					} else {
						local33 = false;
					}
				}
				while (this.aClass292_1.anIntArray598.length > this.anInt7475) {
					if (this.aClass292_1.anIntArray598[this.anInt7475] == 0) {
						this.anInt7475++;
					} else {
						if (this.aClass295_2.method4654()) {
							local33 = false;
							break;
						}
						if (this.aByteArray88[this.anInt7475] != 1) {
							this.method4680(this.anInt7475, 2);
						}
						if (this.aByteArray88[this.anInt7475] != 1) {
							local147 = new Class2();
							local147.aLong328 = (long) this.anInt7475;
							this.aClass339_42.method5465(local147);
							local33 = false;
						}
						this.anInt7475++;
					}
				}
				if (local33) {
					this.anInt7475 = 0;
					this.aBoolean568 = false;
				}
			} else {
				this.aClass339_42 = null;
			}
		}
		if (!this.aBoolean569 || Static588.method5469() < this.aLong239) {
			return;
		}
		for (@Pc(366) Class2_Sub2_Sub17 local366 = (Class2_Sub2_Sub17) this.aClass28_36.method371(); local366 != null; local366 = (Class2_Sub2_Sub17) this.aClass28_36.method375()) {
			if (!local366.aBoolean778) {
				if (local366.aBoolean776) {
					if (!local366.aBoolean777) {
						throw new RuntimeException();
					}
					local366.a((byte) 121);
				} else {
					local366.aBoolean776 = true;
				}
			}
		}
		this.aLong239 = Static588.method5469() + 1000L;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)I")
	public int method4678() {
		return this.anInt7473;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method4670(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub2_Sub17 local9 = this.method4680(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.method6412();
			local9.a((byte) 100);
			return local26;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)Lclient!tw;")
	private Class2_Sub2_Sub17 method4680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Class2_Sub2_Sub17 local19 = (Class2_Sub2_Sub17) this.aClass28_36.method373((long) arg0);
		if (local19 != null && arg1 == 0 && !local19.aBoolean777 && local19.aBoolean778) {
			local19.a((byte) 57);
			local19 = null;
		}
		if (local19 == null) {
			if (arg1 == 0) {
				if (this.aClass9_3 == null || this.aByteArray88[arg0] == -1) {
					if (this.aClass295_2.method4659()) {
						return null;
					}
					local19 = this.aClass295_2.method4662(this.anInt7465, arg0, true, (byte) 2);
				} else {
					local19 = this.aClass174_3.method2683(this.aClass9_3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass9_3 == null) {
					throw new RuntimeException();
				}
				local19 = this.aClass174_3.method2688(this.aClass9_3, arg0);
			} else if (arg1 == 2) {
				if (this.aClass9_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray88[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass295_2.method4654()) {
					return null;
				}
				local19 = this.aClass295_2.method4662(this.anInt7465, arg0, false, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass28_36.method370((long) arg0, local19);
		}
		if (local19.aBoolean778) {
			return null;
		}
		@Pc(194) byte[] local194 = local19.method6412();
		@Pc(224) int local224;
		@Pc(254) byte[] local254;
		@Pc(263) byte[] local263;
		@Pc(265) int local265;
		@Pc(383) Class2_Sub2_Sub17_Sub1 local383;
		if (!(local19 instanceof Class2_Sub2_Sub17_Sub2)) {
			try {
				label157: {
					if (local194 != null && local194.length > 2) {
						Static10.aCRC32_1.reset();
						Static10.aCRC32_1.update(local194, 0, local194.length - 2);
						local224 = (int) Static10.aCRC32_1.getValue();
						if (this.aClass292_1.anIntArray599[arg0] != local224) {
							throw new RuntimeException();
						}
						if (this.aClass292_1.aByteArrayArray24 == null || this.aClass292_1.aByteArrayArray24[arg0] == null) {
							break label157;
						}
						local254 = this.aClass292_1.aByteArrayArray24[arg0];
						local263 = Static607.method5770(local194, local194.length - 2, 0);
						local265 = 0;
						while (true) {
							if (local265 >= 64) {
								break label157;
							}
							if (local254[local265] != local263[local265]) {
								throw new RuntimeException();
							}
							local265++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass295_2.anInt7453 = 0;
				this.aClass295_2.anInt7452 = 0;
			} catch (@Pc(498) RuntimeException local498) {
				this.aClass295_2.method4648();
				local19.a((byte) 118);
				if (local19.aBoolean777 && !this.aClass295_2.method4659()) {
					local383 = this.aClass295_2.method4662(this.anInt7465, arg0, true, (byte) 2);
					this.aClass28_36.method370((long) arg0, local383);
				}
				return null;
			}
			local194[local194.length - 2] = (byte) (this.aClass292_1.anIntArray597[arg0] >>> 8);
			local194[local194.length - 1] = (byte) this.aClass292_1.anIntArray597[arg0];
			if (this.aClass9_3 != null) {
				this.aClass174_3.method2687(local194, arg0, this.aClass9_3);
				if (this.aByteArray88[arg0] != 1) {
					this.anInt7473++;
					this.aByteArray88[arg0] = 1;
				}
			}
			if (!local19.aBoolean777) {
				local19.a((byte) 112);
			}
			return local19;
		}
		try {
			if (local194 == null || local194.length <= 2) {
				throw new RuntimeException();
			}
			Static10.aCRC32_1.reset();
			Static10.aCRC32_1.update(local194, 0, local194.length - 2);
			local224 = (int) Static10.aCRC32_1.getValue();
			if (local224 != this.aClass292_1.anIntArray599[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass292_1.aByteArrayArray24 != null && this.aClass292_1.aByteArrayArray24[arg0] != null) {
				local254 = this.aClass292_1.aByteArrayArray24[arg0];
				local263 = Static607.method5770(local194, local194.length - 2, 0);
				for (local265 = 0; local265 < 64; local265++) {
					if (local263[local265] != local254[local265]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(307) int local307 = (local194[local194.length - 1] & 0xFF) + ((local194[local194.length - 2] & 0xFF) << 8);
			if (local307 != (this.aClass292_1.anIntArray597[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray88[arg0] != 1) {
				this.anInt7473++;
				this.aByteArray88[arg0] = 1;
			}
			if (!local19.aBoolean777) {
				local19.a((byte) 81);
			}
			return local19;
		} catch (@Pc(355) Exception local355) {
			this.aByteArray88[arg0] = -1;
			local19.a((byte) 67);
			if (local19.aBoolean777 && !this.aClass295_2.method4659()) {
				local383 = this.aClass295_2.method4662(this.anInt7465, arg0, true, (byte) 2);
				this.aClass28_36.method370((long) arg0, local383);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)I")
	@Override
	public int method4666(@OriginalArg(1) int arg0) {
		@Pc(19) Class2_Sub2_Sub17 local19 = (Class2_Sub2_Sub17) this.aClass28_36.method373((long) arg0);
		return local19 == null ? 0 : local19.method6413();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	public void method4682() {
		if (this.aClass339_42 == null || this.method4671() == null) {
			return;
		}
		for (@Pc(21) Class2 local21 = this.aClass339_41.method5453(65280); local21 != null; local21 = this.aClass339_41.method5460()) {
			@Pc(29) int local29 = (int) local21.aLong328;
			if (local29 < 0 || local29 >= this.aClass292_1.anInt7368 || this.aClass292_1.anIntArray598[local29] == 0) {
				local21.a((byte) 98);
			} else {
				if (this.aByteArray88[local29] == 0) {
					this.method4680(local29, 1);
				}
				if (this.aByteArray88[local29] == -1) {
					this.method4680(local29, 2);
				}
				if (this.aByteArray88[local29] == 1) {
					local21.a((byte) 67);
				}
			}
		}
		if (false) {
			Static498.method4679((Class8_Sub2[]) null, -92, -16);
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)Lclient!pj;")
	@Override
	public Class292 method4671() {
		if (this.aClass292_1 != null) {
			return this.aClass292_1;
		}
		if (this.aClass2_Sub2_Sub17_1 == null) {
			if (this.aClass295_2.method4659()) {
				return null;
			}
			this.aClass2_Sub2_Sub17_1 = this.aClass295_2.method4662(255, this.anInt7465, true, (byte) 0);
		}
		if (this.aClass2_Sub2_Sub17_1.aBoolean778) {
			return null;
		}
		@Pc(53) byte[] local53 = this.aClass2_Sub2_Sub17_1.method6412();
		if (this.aClass2_Sub2_Sub17_1 instanceof Class2_Sub2_Sub17_Sub2) {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass292_1 = new Class292(local53, this.anInt7463, this.aByteArray89);
				if (this.anInt7472 != this.aClass292_1.anInt7366) {
					throw new RuntimeException();
				}
			} catch (@Pc(162) RuntimeException local162) {
				this.aClass292_1 = null;
				if (this.aClass295_2.method4659()) {
					this.aClass2_Sub2_Sub17_1 = null;
				} else {
					this.aClass2_Sub2_Sub17_1 = this.aClass295_2.method4662(255, this.anInt7465, true, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local53 == null) {
					throw new RuntimeException();
				}
				this.aClass292_1 = new Class292(local53, this.anInt7463, this.aByteArray89);
			} catch (@Pc(76) RuntimeException local76) {
				this.aClass295_2.method4648();
				this.aClass292_1 = null;
				if (this.aClass295_2.method4659()) {
					this.aClass2_Sub2_Sub17_1 = null;
				} else {
					this.aClass2_Sub2_Sub17_1 = this.aClass295_2.method4662(255, this.anInt7465, true, (byte) 0);
				}
				return null;
			}
			if (this.aClass9_2 != null) {
				this.aClass174_3.method2687(local53, this.anInt7465, this.aClass9_2);
			}
		}
		if (this.aClass9_3 != null) {
			this.aByteArray88 = new byte[this.aClass292_1.anInt7368];
			this.anInt7473 = 0;
		}
		this.aClass2_Sub2_Sub17_1 = null;
		return this.aClass292_1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(B)V")
	public void method4683() {
		if (this.aClass9_3 != null) {
			this.aBoolean568 = true;
			if (this.aClass339_42 == null) {
				this.aClass339_42 = new Class339();
			}
		}
	}
}
