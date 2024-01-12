import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class339 {

	@OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
	private int anInt8667;

	@OriginalMember(owner = "client!sh", name = "G", descriptor = "Lclient!gp;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "Lclient!hv;")
	public Class8_Sub5 aClass8_Sub5_7;

	@OriginalMember(owner = "client!sh", name = "g", descriptor = "Lclient!ka;")
	private Class114 aClass114_8;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!r;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_6;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "[Z")
	private boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "Z")
	private boolean aBoolean660 = false;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	private int anInt8676 = 0;

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	private int anInt8671 = -1;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
	private boolean aBoolean663 = false;

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
	private int anInt8684 = 0;

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "Z")
	private boolean aBoolean661 = false;

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "B")
	private final byte aByte133;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
	public final int anInt8687;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "B")
	private final byte aByte132;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
	public final int anInt8673;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public final int anInt8669;

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "Lclient!eo;")
	private final Class8_Sub2 aClass8_Sub2_21;

	@OriginalMember(owner = "client!sh", name = "H", descriptor = "Z")
	private final boolean aBoolean662;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "Lclient!gu;")
	private final Class152 aClass152_9;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!ha;Lclient!c;IIIILclient!eo;ZI)V")
	public Class339(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte133 = (byte) arg5;
		this.anInt8687 = arg3;
		this.aByte132 = (byte) arg4;
		this.aBoolean660 = arg8 != -1;
		this.anInt8673 = arg1.anInt1261;
		this.anInt8669 = arg2;
		this.aClass8_Sub2_21 = arg6;
		this.aBoolean661 = arg7;
		this.aBoolean662 = arg0.method8013() && arg1.aBoolean89 && !this.aBoolean661;
		this.aClass152_9 = new Class152_Sub2(arg6, false);
		this.method7683(1, arg8, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method7675(@OriginalArg(0) Class19 arg0) {
		this.method7685(arg0, true, true, true, 262144);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;B)V")
	public void method7676(@OriginalArg(0) Class19 arg0) {
		if (this.aClass2_Sub2_Sub9_6 != null) {
			Static292.method4625(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10718, this.aClass8_Sub2_21.anInt10722, this.aBooleanArray27);
			this.aBooleanArray27 = null;
			this.aClass2_Sub2_Sub9_6 = null;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	public int method7678() {
		return this.anInt8684;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public void method7679(@OriginalArg(0) int arg0) {
		this.aBoolean660 = true;
		this.method7683(1, arg0, false);
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)Z")
	public boolean method7682(@OriginalArg(0) int arg0) {
		if (arg0 != 10) {
			this.anInt8684 = 3;
		}
		return this.aBoolean662;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBZ)V")
	private void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) int local10 = arg1;
		@Pc(12) boolean local12 = false;
		if (arg1 == -1) {
			@Pc(21) Class54 local21 = Static354.aClass142_4.method3063(this.anInt8673, 74);
			@Pc(23) Class54 local23 = local21;
			if (local21.anIntArray113 != null) {
				local21 = local21.method1301(13, Static1.anInt10827 == 3 ? Static298.anInterface23_2 : Static34.aClass306_1);
			}
			if (local21 == null) {
				return;
			}
			if (local23 == local21) {
				local23 = null;
			}
			if (local21.method1300()) {
				if (arg2 && this.aClass152_9.method9116() && local21.method1298(this.aClass152_9.method9121())) {
					return;
				}
				if (this.anInt8671 != local21.anInt1261) {
					local12 = local21.aBoolean94;
				}
				local10 = local21.method1307();
				if (local21.method1295()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			} else if (local23 != null && local23.method1300()) {
				if (arg2 && this.aClass152_9.method9116() && local23.method1298(this.aClass152_9.method9121())) {
					return;
				}
				if (this.anInt8671 != local21.anInt1261) {
					local12 = local23.aBoolean94;
				}
				local10 = local23.method1307();
				if (local23.method1295()) {
					arg0 = 0;
				} else {
					arg0 = 1;
				}
			}
		}
		if (local10 == -1) {
			this.aClass152_9.method9111(false, -1, 838828768);
		} else {
			this.aClass152_9.method9099(local10, 0, arg0, local12);
			this.aClass114_8 = null;
			this.aBoolean663 = false;
			this.anInt8667 = Static333.anInt5474;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!ha;ZZZI)Lclient!ka;")
	public Class114 method7685(@OriginalArg(0) Class19 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(11) Class54 local11 = Static354.aClass142_4.method3063(this.anInt8673, 119);
		if (local11.anIntArray113 != null) {
			local11 = local11.method1301(13, Static1.anInt10827 == 3 ? Static298.anInterface23_2 : Static34.aClass306_1);
		}
		if (local11 == null) {
			this.method7676(arg0);
			this.anInt8671 = -1;
			return null;
		}
		if (!this.aBoolean660 && this.anInt8671 != local11.anInt1261) {
			this.method7683(0, -1, true);
			this.aClass114_8 = null;
			this.aBoolean663 = false;
		}
		this.method7687(this.aClass8_Sub2_21, arg2);
		if (arg3) {
			arg3 &= this.aBoolean662 & !this.aBoolean663 & Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371() != 0;
		}
		if (arg1 && !arg3) {
			this.anInt8671 = local11.anInt1261;
			return null;
		}
		if (arg3) {
			Static292.method4625(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10718, this.aClass8_Sub2_21.anInt10722, this.aBooleanArray27);
			this.aBoolean663 = false;
		}
		@Pc(142) Class178 local142 = Static246.aClass178Array1[this.aByte133];
		@Pc(163) Class178 local163;
		if (this.aBoolean661) {
			local163 = Static706.aClass178Array3[0];
		} else {
			local163 = this.aByte133 >= 3 ? null : Static246.aClass178Array1[this.aByte133 + 1];
		}
		@Pc(171) Class114 local171 = null;
		if (this.aClass152_9.method9116()) {
			if (arg3) {
				arg4 |= 0x40000;
			}
			local171 = local11.method1311(this.anInt8669 == 11 ? this.anInt8687 + 4 : this.anInt8687, this.aClass8_Sub2_21.anInt10722, this.anInt8669 == 11 ? 10 : this.anInt8669, this.aClass8_Sub2_21.anInt10718, local163, this.aClass152_9, arg0, local142, this.aClass150_2, arg4, local142.method7885(this.aClass8_Sub2_21.anInt10722, this.aClass8_Sub2_21.anInt10718));
			if (local171 == null) {
				this.aBooleanArray27 = null;
				this.aClass2_Sub2_Sub9_6 = null;
				this.anInt8676 = 0;
				this.anInt8684 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray27 == null) {
						this.aBooleanArray27 = new boolean[4];
					}
					this.aClass2_Sub2_Sub9_6 = local171.ba(this.aClass2_Sub2_Sub9_6);
					Static630.method8364(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10718, this.aClass8_Sub2_21.anInt10722, this.aBooleanArray27);
					this.aBoolean663 = true;
				}
				this.anInt8684 = local171.fa();
				this.anInt8676 = local171.ma();
			}
			this.aClass114_8 = null;
		} else if (this.aClass114_8 != null && (arg4 & this.aClass114_8.ua()) == arg4 && local11.anInt1261 == this.anInt8671) {
			local171 = this.aClass114_8;
		} else {
			if (this.aClass114_8 != null) {
				arg4 |= this.aClass114_8.ua();
			}
			@Pc(389) Class274 local389 = local11.method1309(this.anInt8669 == 11 ? this.anInt8687 + 4 : this.anInt8687, this.aClass8_Sub2_21.anInt10722, this.aClass8_Sub2_21.anInt10718, local142, arg3, local142.method7885(this.aClass8_Sub2_21.anInt10722, this.aClass8_Sub2_21.anInt10718), this.anInt8669 == 11 ? 10 : this.anInt8669, arg0, this.aClass150_2, arg4, local163);
			if (local389 == null) {
				this.anInt8676 = 0;
				this.aBooleanArray27 = null;
				this.anInt8684 = 0;
				this.aClass2_Sub2_Sub9_6 = null;
				this.aClass114_8 = null;
			} else {
				local171 = local389.aClass114_7;
				this.aClass114_8 = local389.aClass114_7;
				if (arg3) {
					this.aClass2_Sub2_Sub9_6 = local389.aClass2_Sub2_Sub9_5;
					this.aBooleanArray27 = null;
					Static630.method8364(this.aClass2_Sub2_Sub9_6, this.aByte133, this.aClass8_Sub2_21.anInt10718, this.aClass8_Sub2_21.anInt10722, (boolean[]) null);
					this.aBoolean663 = true;
				}
				this.anInt8684 = local171.fa();
				this.anInt8676 = local171.ma();
			}
		}
		this.anInt8671 = local11.anInt1261;
		return local171;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!gp;I)V")
	public void method7686(@OriginalArg(0) Class150 arg0) {
		this.aClass150_2 = arg0;
		this.aClass114_8 = null;
	}

	@OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_7 != null) {
			this.aClass8_Sub5_7.method3644();
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!eo;Z)V")
	private void method7687(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aClass152_9.method9116()) {
			this.method7683(0, -1, false);
		} else if (this.aClass152_9.method9119(Static333.anInt5474 - this.anInt8667)) {
			if (Static400.aClass2_Sub34_28.aClass57_Sub12_1.method4371() == 2) {
				this.aBoolean663 = false;
			}
			if (this.aClass152_9.method9109()) {
				this.aClass152_9.method9120(arg1, -1);
				this.aBoolean660 = false;
				this.method7683(0, -1, false);
			}
		}
		if (arg1) {
			this.anInt8667 = Static333.anInt5474;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!ka;ZILclient!ha;IIILclient!tt;)V")
	public void method7688(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class73 arg8) {
		if (arg3 != -9827) {
			return;
		}
		@Pc(11) Class330[] local11 = arg1.method7489();
		@Pc(14) Class251[] local14 = arg1.method7487();
		if ((this.aClass8_Sub5_7 == null || this.aClass8_Sub5_7.aBoolean324) && (local11 != null || local14 != null)) {
			@Pc(37) Class54 local37 = Static354.aClass142_4.method3063(this.anInt8673, 115);
			if (local37.anIntArray113 != null) {
				local37 = local37.method1301(arg3 + 9840, Static1.anInt10827 == 3 ? Static298.anInterface23_2 : Static34.aClass306_1);
			}
			if (local37 != null) {
				this.aClass8_Sub5_7 = Static257.method3654(Static333.anInt5474, true);
			}
		}
		if (this.aClass8_Sub5_7 == null) {
			return;
		}
		arg1.method7483(arg8);
		if (arg2) {
			this.aClass8_Sub5_7.method3643(arg4, (long) Static333.anInt5474, local11, local14);
		} else {
			this.aClass8_Sub5_7.method3649((long) Static333.anInt5474);
		}
		this.aClass8_Sub5_7.method3658(this.aByte132, arg6, arg5, arg7, arg0);
	}
}
