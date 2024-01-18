import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public class Class152 {

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "Lclient!cka;")
	public SeqType aClass69_4;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	private int anInt10497;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private int anInt10502;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt10506;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
	private int anInt10513;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public int anInt10517;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "Z")
	private boolean aBoolean791 = false;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	private int anInt10511 = 0;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Z")
	private boolean aBoolean792 = false;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!nfa;")
	public final Class259 aClass259_8;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "Lclient!nfa;")
	private final Class259 aClass259_7;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Z)V")
	protected Class152(@OriginalArg(0) boolean arg0) {
		this.aBoolean791 = arg0;
		this.aClass259_8 = new Class259();
		if (this.aBoolean791) {
			this.aClass259_7 = new Class259();
		} else {
			this.aClass259_7 = null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!cka;B)V")
	protected void method9093(@OriginalArg(0) int arg0, @OriginalArg(1) SeqType arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	public final int method9094() {
		return this.anInt10497;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ka;I)V")
	public final void method9096(@OriginalArg(1) Class114 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass69_4 == null || !this.method9118()) {
			return;
		}
		arg0.method7494(this.aClass259_8.aClass2_Sub2_Sub18_1, this.anInt10506, this.aClass69_4.anIntArray157[this.anInt10517], this.aClass259_8.aClass2_Sub2_Sub18_2, this.aClass259_8.anInt6468, this.aClass259_8.anInt6470, arg1, this.aClass69_4.aBoolean140);
		if (this.aBoolean791 && this.aClass69_4.anIntArray158 != null && this.aClass259_7.aBoolean481) {
			arg0.method7494(this.aClass259_7.aClass2_Sub2_Sub18_1, this.anInt10506, this.aClass69_4.anIntArray157[this.anInt10517], this.aClass259_7.aClass2_Sub2_Sub18_2, this.aClass259_7.anInt6468, this.aClass259_7.anInt6470, arg1, this.aClass69_4.aBoolean140);
			return;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z")
	public final boolean method9097() {
		@Pc(24) int local24;
		return this.aClass69_4 == null | (local24 = 1 - this.anInt10497) <= 0 ? false : this.aClass69_4.aBoolean142 | this.anInt10506 + local24 > this.aClass69_4.anIntArray157[this.anInt10517];
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V")
	public final void method9098(@OriginalArg(0) int arg0) {
		this.anInt10497 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIBIZ)V")
	public final void method9099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (this.method9121() == arg0) {
			return;
		}
		if (arg0 == -1) {
			this.aClass69_4 = null;
		} else {
			if (this.aClass69_4 == null || arg0 != this.aClass69_4.anInt1657) {
				this.aClass69_4 = Static692.aClass50_2.method1162(arg0);
			} else if (this.aClass69_4.anInt1653 == 0) {
				return;
			}
			this.anInt10497 = arg1;
			this.anInt10511 = arg2;
			this.anInt10513 = 0;
			if (arg3) {
				this.anInt10517 = (int) ((double) this.aClass69_4.anIntArray159.length * Math.random());
				this.anInt10506 = (int) (Math.random() * (double) this.aClass69_4.anIntArray157[this.anInt10517]);
			} else {
				this.anInt10506 = 0;
				this.anInt10517 = 0;
			}
			this.anInt10502 = this.anInt10517 + 1;
			if (this.anInt10502 < 0 || this.anInt10502 >= this.aClass69_4.anIntArray159.length) {
				this.anInt10502 = -1;
			}
			if (this.anInt10497 == 0) {
				this.method9093(this.anInt10517, this.aClass69_4);
			}
			this.aBoolean792 = false;
		}
		this.method9115();
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(BI)V")
	public final void method9100(@OriginalArg(1) int arg0) {
		this.anInt10517 = 0;
		this.anInt10502 = this.aClass69_4.anIntArray159.length <= 1 ? -1 : 1;
		this.anInt10506 = 0;
		this.aBoolean792 = false;
		this.anInt10497 = arg0;
		this.anInt10513 = 0;
		if (this.aClass69_4 != null) {
			this.method9093(this.anInt10517, this.aClass69_4);
			this.method9115();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!gu;)V")
	public final void method9103(@OriginalArg(1) Class152 arg0) {
		this.aClass69_4 = arg0.aClass69_4;
		this.aBoolean791 = arg0.aBoolean791;
		this.aBoolean792 = arg0.aBoolean792;
		this.anInt10497 = arg0.anInt10497;
		this.anInt10513 = arg0.anInt10513;
		this.anInt10502 = arg0.anInt10502;
		this.anInt10517 = arg0.anInt10517;
		this.anInt10506 = arg0.anInt10506;
		this.method9115();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	public final void method9105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method9099(arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	public final void method9106() {
		this.method9100(0);
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I")
	public final int method9108() {
		if (!this.method9118()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		if (this.method9118()) {
			local18 = this.aClass259_8.anInt6472 | 0x0;
			if (this.aBoolean791 && this.aClass69_4.anIntArray158 != null) {
				local18 |= this.aClass259_7.anInt6472;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)Z")
	public final boolean method9109() {
		return this.aBoolean792;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)V")
	public final void method9111(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 838828768) {
			this.method9111(true, 51, 15);
		}
		this.method9099(arg1, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ka;I)V")
	public final void method9112(@OriginalArg(0) Class114 arg0) {
		if (this.method9118()) {
			arg0.method7500(this.aClass259_8.anInt6468, this.aClass259_8.aClass2_Sub2_Sub18_1);
			if (this.aBoolean791 && this.aClass69_4.anIntArray158 != null && this.aClass259_7.aBoolean481) {
				arg0.method7500(this.aClass259_7.anInt6468, this.aClass259_7.aClass2_Sub2_Sub18_1);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z")
	public final boolean method9113() {
		return this.anInt10497 != 0;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Lclient!cka;")
	public final SeqType method9114() {
		return this.aClass69_4;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	private void method9115() {
		this.aClass259_8.method5781();
		if (this.aBoolean791) {
			this.aClass259_7.method5781();
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)Z")
	public final boolean method9116() {
		return this.aClass69_4 != null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZLclient!ka;)V")
	public final void method9117(@OriginalArg(0) int arg0, @OriginalArg(3) Class114 arg1) {
		if (this.method9118()) {
			arg1.method7503(this.anInt10506, this.aClass259_8.aClass2_Sub2_Sub18_1, this.aClass259_8.aClass2_Sub2_Sub18_2, this.aClass259_8.anInt6468, null, this.aClass69_4.anIntArray157[this.anInt10517], this.aClass69_4.aBoolean140, this.aClass259_8.anInt6470, arg0);
			if (this.aBoolean791 && this.aClass69_4.anIntArray158 != null && this.aClass259_7.aBoolean481) {
				arg1.method7503(this.anInt10506, this.aClass259_7.aClass2_Sub2_Sub18_1, this.aClass259_7.aClass2_Sub2_Sub18_2, this.aClass259_7.anInt6468, null, this.aClass69_4.anIntArray157[this.anInt10517], this.aClass69_4.aBoolean140, this.aClass259_7.anInt6470, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
	public final boolean method9118() {
		if (this.aClass69_4 == null) {
			return false;
		}
		@Pc(30) boolean local30 = this.aClass259_8.method5776(Static692.aClass50_2, this.aClass69_4, this.anInt10502, this.anInt10517, this.aClass69_4.anIntArray159);
		if (local30 && this.aBoolean791 && this.aClass69_4.anIntArray158 != null) {
			this.aClass259_7.method5776(Static692.aClass50_2, this.aClass69_4, this.anInt10502, this.anInt10517, this.aClass69_4.anIntArray158);
		}
		return local30;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
	public final boolean method9119(@OriginalArg(1) int arg0) {
		if (this.aClass69_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt10497 > 0) {
			if (this.anInt10497 >= arg0) {
				this.anInt10497 -= arg0;
				return false;
			}
			arg0 -= this.anInt10497;
			this.anInt10497 = 0;
			this.method9093(this.anInt10517, this.aClass69_4);
		}
		arg0 += this.anInt10506;
		@Pc(68) boolean local68 = Static296.aBoolean367 | this.aClass69_4.aBoolean142;
		if (arg0 > 100 && this.aClass69_4.anInt1647 > 0) {
			@Pc(89) int local89 = this.aClass69_4.anIntArray159.length - this.aClass69_4.anInt1647;
			while (this.anInt10517 < local89 && arg0 > this.aClass69_4.anIntArray157[this.anInt10517]) {
				arg0 -= this.aClass69_4.anIntArray157[this.anInt10517];
				this.anInt10517++;
			}
			if (local89 <= this.anInt10517) {
				@Pc(134) int local134 = 0;
				for (@Pc(136) int local136 = local89; local136 < this.aClass69_4.anIntArray159.length; local136++) {
					local134 += this.aClass69_4.anIntArray157[local136];
				}
				if (this.anInt10511 == 0) {
					this.anInt10513 += arg0 / local134;
				}
				arg0 %= local134;
			}
			this.anInt10502 = this.anInt10517 + 1;
			local68 = true;
			if (this.anInt10502 >= this.aClass69_4.anIntArray159.length) {
				this.anInt10502 -= this.aClass69_4.anInt1647;
				if (this.anInt10502 < 0 || this.aClass69_4.anIntArray159.length <= this.anInt10502) {
					this.anInt10502 = -1;
				}
			}
		}
		while (this.aClass69_4.anIntArray157[this.anInt10517] < arg0) {
			arg0 -= this.aClass69_4.anIntArray157[this.anInt10517++];
			local68 = true;
			if (this.aClass69_4.anIntArray159.length <= this.anInt10517) {
				if (this.aClass69_4.anInt1647 != -1 && this.anInt10511 != 2) {
					this.anInt10517 -= this.aClass69_4.anInt1647;
					if (this.anInt10511 == 0) {
						this.anInt10513++;
					}
				}
				if (this.anInt10513 >= this.aClass69_4.anInt1654 || this.anInt10517 < 0 || this.anInt10517 >= this.aClass69_4.anIntArray159.length) {
					this.aBoolean792 = true;
					break;
				}
			}
			this.method9093(this.anInt10517, this.aClass69_4);
			this.anInt10502 = this.anInt10517 + 1;
			if (this.anInt10502 >= this.aClass69_4.anIntArray159.length) {
				this.anInt10502 -= this.aClass69_4.anInt1647;
				if (this.anInt10502 < 0 || this.anInt10502 >= this.aClass69_4.anIntArray159.length) {
					this.anInt10502 = -1;
				}
			}
		}
		this.anInt10506 = arg0;
		if (local68) {
			this.method9115();
		}
		return local68;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	public final void method9120(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.method9111(true, -1, 58);
		}
		this.method9099(arg1, 0, 0, false);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)I")
	public final int method9121() {
		return this.aClass69_4 == null ? -1 : this.aClass69_4.anInt1657;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
	public final void method9122() {
		this.anInt10513 = 0;
	}
}
