import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class375 {

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "I")
	private int anInt9649 = -1;

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "Z")
	public boolean aBoolean739 = true;

	@OriginalMember(owner = "client!uga", name = "j", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_36;

	@OriginalMember(owner = "client!uga", name = "r", descriptor = "I")
	private final int anInt9652;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "Lclient!hn;")
	private final Class170 aClass170_2;

	@OriginalMember(owner = "client!uga", name = "l", descriptor = "I")
	private final int anInt9655;

	@OriginalMember(owner = "client!uga", name = "q", descriptor = "I")
	private final int anInt9653;

	@OriginalMember(owner = "client!uga", name = "h", descriptor = "Lclient!rq;")
	private Class93_Sub2 aClass93_Sub2_6;

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "Lclient!ar;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!uga", name = "e", descriptor = "Lclient!wn;")
	private Class134_Sub2 aClass134_Sub2_2;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lclient!qha;Lclient!hn;Lclient!pn;IIIII)V")
	public Class375(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) Class170 arg1, @OriginalArg(2) Class178_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass19_Sub3_36 = arg0;
		this.anInt9652 = arg7;
		this.aClass170_2 = arg1;
		this.anInt9655 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(53) int local53;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(51) int local51 = local31 + arg2.anInt8918 * (local35 + local37);
			for (local53 = 0; local53 < local25; local53++) {
				@Pc(61) short[] local61 = arg2.aShortArrayArray6[local51++];
				if (local61 != null) {
					local27 += local61.length;
				}
			}
		}
		this.anInt9653 = local27;
		if (local27 <= 0) {
			this.aClass93_Sub2_6 = null;
		} else {
			@Pc(103) Class2_Sub21 local103 = new Class2_Sub21(local27 * 2);
			@Pc(123) int local123;
			@Pc(131) short[] local131;
			@Pc(135) int local135;
			@Pc(121) int local121;
			if (this.aClass19_Sub3_36.aBoolean619) {
				for (local53 = 0; local53 < local25; local53++) {
					local121 = local31 + arg2.anInt8918 * (local53 + local35);
					for (local123 = 0; local123 < local25; local123++) {
						local131 = arg2.aShortArrayArray6[local121++];
						if (local131 != null) {
							for (local135 = 0; local135 < local131.length; local135++) {
								local103.method7380(local131[local135] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local53 = 0; local53 < local25; local53++) {
					local121 = (local35 + local53) * arg2.anInt8918 + local31;
					for (local123 = 0; local123 < local25; local123++) {
						local131 = arg2.aShortArrayArray6[local121++];
						if (local131 != null) {
							for (local135 = 0; local135 < local131.length; local135++) {
								local103.method7361(local131[local135] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface1_5 = this.aClass19_Sub3_36.method7017(false, local103.anInt8412, local103.aByteArray93);
			this.aClass134_Sub2_2 = new Class134_Sub2(this.aClass19_Sub3_36, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZILclient!ar;)V")
	private void method8459(@OriginalArg(1) int arg0, @OriginalArg(2) Interface1 arg1) {
		if (arg0 != 0) {
			this.method8462();
			this.aClass19_Sub3_36.method7008(this.aClass93_Sub2_6);
			this.aClass19_Sub3_36.method7041(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)V")
	private void method8462() {
		if (!this.aBoolean739) {
			return;
		}
		this.aBoolean739 = false;
		@Pc(25) byte[] local25 = this.aClass170_2.aByteArray41;
		@Pc(29) byte[] local29 = this.aClass19_Sub3_36.aByteArray90;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = this.aClass170_2.anInt4033;
		@Pc(45) int local45 = this.aClass170_2.anInt4033 * this.anInt9652 + this.anInt9655;
		@Pc(58) int local58;
		for (@Pc(47) int local47 = -128; local47 < 0; local47++) {
			local31 = (local31 << 8) - local31;
			for (local58 = -128; local58 < 0; local58++) {
				if (local25[local45++] != 0) {
					local31++;
				}
			}
			local45 += local35 - 128;
		}
		if (this.aClass93_Sub2_6 != null && local31 == this.anInt9649) {
			this.aBoolean739 = false;
			return;
		}
		this.anInt9649 = local31;
		local58 = 0;
		local45 = local35 * this.anInt9652 + this.anInt9655;
		for (@Pc(120) int local120 = -128; local120 < 0; local120++) {
			for (@Pc(124) int local124 = -128; local124 < 0; local124++) {
				if (local25[local45] == 0) {
					@Pc(134) int local134 = 0;
					if (local25[local45 - 1] != 0) {
						local134++;
					}
					if (local25[local45 + 1] != 0) {
						local134++;
					}
					if (local25[local45 - local35] != 0) {
						local134++;
					}
					if (local25[local45 + local35] != 0) {
						local134++;
					}
					local29[local58++] = (byte) (local134 * 17);
				} else {
					local29[local58++] = 68;
				}
				local45++;
			}
			local45 += this.aClass170_2.anInt4033 - 128;
		}
		if (this.aClass93_Sub2_6 == null) {
			this.aClass93_Sub2_6 = new Class93_Sub2(this.aClass19_Sub3_36, 3553, 6406, 128, 128, false, this.aClass19_Sub3_36.aByteArray90, 6406, false);
			this.aClass93_Sub2_6.method2946(false, false);
			this.aClass93_Sub2_6.method9445(true);
		} else {
			this.aClass93_Sub2_6.method2945(6406, 128, 128, this.aClass19_Sub3_36.aByteArray90, false);
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
	public void method8463() {
		this.method8459(this.anInt9653, this.anInterface1_5);
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I[BBI)V")
	public void method8466(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass134_Sub2_2.method9362(arg1 * this.aClass19_Sub3_36.method7030(5123), arg0);
		this.method8459(arg1, this.aClass134_Sub2_2);
	}
}
