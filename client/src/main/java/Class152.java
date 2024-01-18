import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public class Class152 {

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "Lclient!cka;")
	public Class69 aClass69_4;

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
	private int anInt10469;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private int anInt10474;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
	public int anInt10478;

	@OriginalMember(owner = "client!gu", name = "v", descriptor = "I")
	private int anInt10485;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public int anInt10489;

	@OriginalMember(owner = "client!gu", name = "G", descriptor = "Z")
	private boolean aBoolean790 = false;

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
	private int anInt10483 = 0;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Z")
	private boolean aBoolean791 = false;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Lclient!nfa;")
	public final Class257 aClass257_8;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "Lclient!nfa;")
	private final Class257 aClass257_7;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Z)V")
	protected Class152(@OriginalArg(0) boolean arg0) {
		this.aBoolean790 = arg0;
		this.aClass257_8 = new Class257();
		if (this.aBoolean790) {
			this.aClass257_7 = new Class257();
		} else {
			this.aClass257_7 = null;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!cka;B)V")
	protected void method6520(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)I")
	public final int method6521() {
		return this.anInt10469;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!ka;I)V")
	public final void method6523(@OriginalArg(1) Class114 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass69_4 == null || !this.method6545()) {
			return;
		}
		arg0.a(this.aClass257_8.aClass2_Sub2_Sub18_1, this.anInt10478, this.aClass69_4.anIntArray157[this.anInt10489], this.aClass257_8.aClass2_Sub2_Sub18_2, this.aClass257_8.anInt6448, this.aClass257_8.anInt6450, arg1, -114, this.aClass69_4.aBoolean140);
		if (this.aBoolean790 && this.aClass69_4.anIntArray158 != null && this.aClass257_7.aBoolean481) {
			arg0.a(this.aClass257_7.aClass2_Sub2_Sub18_1, this.anInt10478, this.aClass69_4.anIntArray157[this.anInt10489], this.aClass257_7.aClass2_Sub2_Sub18_2, this.aClass257_7.anInt6448, this.aClass257_7.anInt6450, arg1, -100, this.aClass69_4.aBoolean140);
			return;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BI)Z")
	public final boolean method6524() {
		@Pc(24) int local24;
		return this.aClass69_4 == null | (local24 = 1 - this.anInt10469) <= 0 ? false : this.aClass69_4.aBoolean142 | this.anInt10478 + local24 > this.aClass69_4.anIntArray157[this.anInt10489];
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)V")
	public final void method6525(@OriginalArg(0) int arg0) {
		this.anInt10469 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIBIZ)V")
	public final void method6526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (this.method6548() == arg0) {
			return;
		}
		if (arg0 == -1) {
			this.aClass69_4 = null;
		} else {
			if (this.aClass69_4 == null || arg0 != this.aClass69_4.anInt1650) {
				this.aClass69_4 = Static692.aClass50_2.method682(arg0);
			} else if (this.aClass69_4.anInt1646 == 0) {
				return;
			}
			this.anInt10469 = arg1;
			this.anInt10483 = arg2;
			this.anInt10485 = 0;
			if (arg3) {
				this.anInt10489 = (int) ((double) this.aClass69_4.anIntArray159.length * Math.random());
				this.anInt10478 = (int) (Math.random() * (double) this.aClass69_4.anIntArray157[this.anInt10489]);
			} else {
				this.anInt10478 = 0;
				this.anInt10489 = 0;
			}
			this.anInt10474 = this.anInt10489 + 1;
			if (this.anInt10474 < 0 || this.anInt10474 >= this.aClass69_4.anIntArray159.length) {
				this.anInt10474 = -1;
			}
			if (this.anInt10469 == 0) {
				this.method6520(this.anInt10489, this.aClass69_4);
			}
			this.aBoolean791 = false;
		}
		this.method6542();
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(BI)V")
	public final void method6527(@OriginalArg(1) int arg0) {
		this.anInt10489 = 0;
		this.anInt10474 = this.aClass69_4.anIntArray159.length <= 1 ? -1 : 1;
		this.anInt10478 = 0;
		this.aBoolean791 = false;
		this.anInt10469 = arg0;
		this.anInt10485 = 0;
		if (this.aClass69_4 != null) {
			this.method6520(this.anInt10489, this.aClass69_4);
			this.method6542();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!gu;)V")
	public final void method6530(@OriginalArg(1) Class152 arg0) {
		this.aClass69_4 = arg0.aClass69_4;
		this.aBoolean790 = arg0.aBoolean790;
		this.aBoolean791 = arg0.aBoolean791;
		this.anInt10469 = arg0.anInt10469;
		this.anInt10485 = arg0.anInt10485;
		this.anInt10474 = arg0.anInt10474;
		this.anInt10489 = arg0.anInt10489;
		this.anInt10478 = arg0.anInt10478;
		this.method6542();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	public final void method6532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method6526(arg1, arg0, 0, false);
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	public final void method6533() {
		this.method6527(0);
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(B)I")
	public final int method6535() {
		if (!this.method6545()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		if (this.method6545()) {
			local18 = this.aClass257_8.anInt6452 | 0x0;
			if (this.aBoolean790 && this.aClass69_4.anIntArray158 != null) {
				local18 |= this.aClass257_7.anInt6452;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "(I)Z")
	public final boolean method6536() {
		return this.aBoolean791;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZII)V")
	public final void method6538(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 838828768) {
			this.method6538(true, 51, 15);
		}
		this.method6526(arg1, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!ka;I)V")
	public final void method6539(@OriginalArg(0) Class114 arg0) {
		if (this.method6545()) {
			arg0.a(this.aClass257_8.anInt6448, 68, this.aClass257_8.aClass2_Sub2_Sub18_1);
			if (this.aBoolean790 && this.aClass69_4.anIntArray158 != null && this.aClass257_7.aBoolean481) {
				arg0.a(this.aClass257_7.anInt6448, 37, this.aClass257_7.aClass2_Sub2_Sub18_1);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)Z")
	public final boolean method6540() {
		return this.anInt10469 != 0;
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Lclient!cka;")
	public final Class69 method6541() {
		return this.aClass69_4;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	private void method6542() {
		this.aClass257_8.method4080();
		if (this.aBoolean790) {
			this.aClass257_7.method4080();
		}
	}

	@OriginalMember(owner = "client!gu", name = "e", descriptor = "(I)Z")
	public final boolean method6543() {
		return this.aClass69_4 != null;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIZLclient!ka;)V")
	public final void method6544(@OriginalArg(0) int arg0, @OriginalArg(3) Class114 arg1) {
		if (this.method6545()) {
			arg1.a(this.anInt10478, this.aClass257_8.aClass2_Sub2_Sub18_1, this.aClass257_8.aClass2_Sub2_Sub18_2, this.aClass257_8.anInt6448, 0, (int[]) null, (byte) -83, this.aClass69_4.anIntArray157[this.anInt10489], this.aClass69_4.aBoolean140, this.aClass257_8.anInt6450, arg0);
			if (this.aBoolean790 && this.aClass69_4.anIntArray158 != null && this.aClass257_7.aBoolean481) {
				arg1.a(this.anInt10478, this.aClass257_7.aClass2_Sub2_Sub18_1, this.aClass257_7.aClass2_Sub2_Sub18_2, this.aClass257_7.anInt6448, 0, (int[]) null, (byte) -83, this.aClass69_4.anIntArray157[this.anInt10489], this.aClass69_4.aBoolean140, this.aClass257_7.anInt6450, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)Z")
	public final boolean method6545() {
		if (this.aClass69_4 == null) {
			return false;
		}
		@Pc(30) boolean local30 = this.aClass257_8.method4075(Static692.aClass50_2, this.aClass69_4, this.anInt10474, this.anInt10489, this.aClass69_4.anIntArray159);
		if (local30 && this.aBoolean790 && this.aClass69_4.anIntArray158 != null) {
			this.aClass257_7.method4075(Static692.aClass50_2, this.aClass69_4, this.anInt10474, this.anInt10489, this.aClass69_4.anIntArray158);
		}
		return local30;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z")
	public final boolean method6546(@OriginalArg(1) int arg0) {
		if (this.aClass69_4 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt10469 > 0) {
			if (this.anInt10469 >= arg0) {
				this.anInt10469 -= arg0;
				return false;
			}
			arg0 -= this.anInt10469;
			this.anInt10469 = 0;
			this.method6520(this.anInt10489, this.aClass69_4);
		}
		arg0 += this.anInt10478;
		@Pc(68) boolean local68 = Static296.aBoolean367 | this.aClass69_4.aBoolean142;
		if (arg0 > 100 && this.aClass69_4.anInt1640 > 0) {
			@Pc(89) int local89 = this.aClass69_4.anIntArray159.length - this.aClass69_4.anInt1640;
			while (this.anInt10489 < local89 && arg0 > this.aClass69_4.anIntArray157[this.anInt10489]) {
				arg0 -= this.aClass69_4.anIntArray157[this.anInt10489];
				this.anInt10489++;
			}
			if (local89 <= this.anInt10489) {
				@Pc(134) int local134 = 0;
				for (@Pc(136) int local136 = local89; local136 < this.aClass69_4.anIntArray159.length; local136++) {
					local134 += this.aClass69_4.anIntArray157[local136];
				}
				if (this.anInt10483 == 0) {
					this.anInt10485 += arg0 / local134;
				}
				arg0 %= local134;
			}
			this.anInt10474 = this.anInt10489 + 1;
			local68 = true;
			if (this.anInt10474 >= this.aClass69_4.anIntArray159.length) {
				this.anInt10474 -= this.aClass69_4.anInt1640;
				if (this.anInt10474 < 0 || this.aClass69_4.anIntArray159.length <= this.anInt10474) {
					this.anInt10474 = -1;
				}
			}
		}
		while (this.aClass69_4.anIntArray157[this.anInt10489] < arg0) {
			arg0 -= this.aClass69_4.anIntArray157[this.anInt10489++];
			local68 = true;
			if (this.aClass69_4.anIntArray159.length <= this.anInt10489) {
				if (this.aClass69_4.anInt1640 != -1 && this.anInt10483 != 2) {
					this.anInt10489 -= this.aClass69_4.anInt1640;
					if (this.anInt10483 == 0) {
						this.anInt10485++;
					}
				}
				if (this.anInt10485 >= this.aClass69_4.anInt1647 || this.anInt10489 < 0 || this.anInt10489 >= this.aClass69_4.anIntArray159.length) {
					this.aBoolean791 = true;
					break;
				}
			}
			this.method6520(this.anInt10489, this.aClass69_4);
			this.anInt10474 = this.anInt10489 + 1;
			if (this.anInt10474 >= this.aClass69_4.anIntArray159.length) {
				this.anInt10474 -= this.aClass69_4.anInt1640;
				if (this.anInt10474 < 0 || this.anInt10474 >= this.aClass69_4.anIntArray159.length) {
					this.anInt10474 = -1;
				}
			}
		}
		this.anInt10478 = arg0;
		if (local68) {
			this.method6542();
		}
		return local68;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
	public final void method6547(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (!arg0) {
			this.method6538(true, -1, 58);
		}
		this.method6526(arg1, 0, 0, false);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)I")
	public final int method6548() {
		return this.aClass69_4 == null ? -1 : this.aClass69_4.anInt1650;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
	public final void method6549() {
		this.anInt10485 = 0;
	}
}
