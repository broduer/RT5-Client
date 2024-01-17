import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class276 {

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Z")
	public boolean aBoolean520 = true;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
	private int anInt6948 = -1;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	private final int anInt6946;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_13;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
	private final int anInt6947;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Lclient!pk;")
	private Class295 aClass295_2;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	private int anInt6940;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	private int anInt6941;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Lclient!ri;")
	private Interface20 anInterface20_4;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	public final int anInt6949;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "Lclient!og;")
	private Interface18 anInterface18_4;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!am;Lclient!pk;Lclient!iga;IIIII)V")
	public Class276(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) Class178_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6946 = arg7;
		this.aClass19_Sub1_13 = arg0;
		this.anInt6947 = arg6;
		this.aClass295_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local50 = local31 + (local37 + local35) * arg2.anInt8918;
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				@Pc(60) short[] local60 = arg2.aShortArrayArray4[local50++];
				if (local60 != null) {
					local27 += local60.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface18_4 = null;
			this.anInt6949 = 0;
		} else {
			this.anInt6940 = Integer.MIN_VALUE;
			this.anInt6941 = Integer.MAX_VALUE;
			this.anInterface20_4 = this.aClass19_Sub1_13.method8129(false);
			this.anInterface20_4.method8550(local27);
			for (local50 = 0; local50 < 4; local50++) {
				@Pc(120) Buffer local120 = this.anInterface20_4.method8554();
				if (local120 != null) {
					@Pc(128) Stream local128 = this.aClass19_Sub1_13.method8107(local120);
					@Pc(132) int local132;
					@Pc(144) int local144;
					@Pc(146) int local146;
					@Pc(154) short[] local154;
					@Pc(158) int local158;
					@Pc(166) int local166;
					if (Stream.b()) {
						for (local132 = 0; local132 < local25; local132++) {
							local144 = arg2.anInt8918 * (local132 + local35) + local31;
							for (local146 = 0; local146 < local25; local146++) {
								local154 = arg2.aShortArrayArray4[local144++];
								if (local154 != null) {
									for (local158 = 0; local158 < local154.length; local158++) {
										local166 = local154[local158] & 0xFFFF;
										if (local166 < this.anInt6941) {
											this.anInt6941 = local166;
										}
										if (this.anInt6940 < local166) {
											this.anInt6940 = local166;
										}
										local128.b(local166);
									}
								}
							}
						}
					} else {
						for (local132 = 0; local132 < local25; local132++) {
							local144 = (local132 + local35) * arg2.anInt8918 + local31;
							for (local146 = 0; local146 < local25; local146++) {
								local154 = arg2.aShortArrayArray4[local144++];
								if (local154 != null) {
									for (local158 = 0; local158 < local154.length; local158++) {
										local166 = local154[local158] & 0xFFFF;
										if (local166 > this.anInt6940) {
											this.anInt6940 = local166;
										}
										if (local166 < this.anInt6941) {
											this.anInt6941 = local166;
										}
										local128.c(local166);
									}
								}
							}
						}
					}
					local128.c();
					if (this.anInterface20_4.method8553()) {
						break;
					}
				}
			}
			this.anInt6949 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!ri;I)V")
	public void method6233(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method6234();
			this.aClass19_Sub1_13.method8095(this.anInterface18_4);
			this.aClass19_Sub1_13.method8059(this.anInt6941, 0, arg0, this.anInt6940 + 1 - this.anInt6941, Static104.aClass131_2, arg1);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
	private void method6234() {
		if (!this.aBoolean520) {
			return;
		}
		this.aBoolean520 = false;
		@Pc(17) byte[] local17 = this.aClass295_2.aByteArray87;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = this.aClass295_2.anInt7450;
		@Pc(33) int local33 = this.anInt6947 + this.anInt6946 * this.aClass295_2.anInt7450;
		@Pc(47) int local47;
		for (@Pc(35) int local35 = -128; local35 < 0; local35++) {
			local19 = (local19 << 8) - local19;
			for (local47 = -128; local47 < 0; local47++) {
				if (local17[local33++] != 0) {
					local19++;
				}
			}
			local33 += local23 - 128;
		}
		if (this.anInterface18_4 != null && local19 == this.anInt6948) {
			this.aBoolean520 = false;
			return;
		}
		this.anInt6948 = local19;
		local47 = 0;
		local33 = this.anInt6946 * local23 + this.anInt6947;
		@Pc(142) int local142;
		@Pc(146) int local146;
		@Pc(168) int local168;
		if (!this.aClass19_Sub1_13.method8078(Static679.aClass92_15, Static702.aClass399_16)) {
			if (Static42.anIntArray69 == null) {
				Static42.anIntArray69 = new int[16384];
			}
			@Pc(140) int[] local140 = Static42.anIntArray69;
			for (local142 = -128; local142 < 0; local142++) {
				for (local146 = -128; local146 < 0; local146++) {
					if (local17[local33] == 0) {
						local168 = 0;
						if (local17[local33 - 1] != 0) {
							local168++;
						}
						if (local17[local33 + 1] != 0) {
							local168++;
						}
						if (local17[local33 - local23] != 0) {
							local168++;
						}
						if (local17[local33 + local23] != 0) {
							local168++;
						}
						local140[local47++] = local168 * 17 << 24;
					} else {
						local140[local47++] = 1140850688;
					}
					local33++;
				}
				local33 += this.aClass295_2.anInt7450 - 128;
			}
			if (this.anInterface18_4 == null) {
				this.anInterface18_4 = this.aClass19_Sub1_13.method8041(false, 128, 128, Static42.anIntArray69);
				this.anInterface18_4.method9059(false, false);
			} else {
				this.anInterface18_4.method9055(Static42.anIntArray69, 0, 0, 128, 128, 128);
			}
			return;
		}
		if (Static369.aByteArray43 == null) {
			Static369.aByteArray43 = new byte[16384];
		}
		@Pc(282) byte[] local282 = Static369.aByteArray43;
		for (local142 = -128; local142 < 0; local142++) {
			for (local146 = -128; local146 < 0; local146++) {
				if (local17[local33] == 0) {
					local168 = 0;
					if (local17[local33 - 1] != 0) {
						local168++;
					}
					if (local17[local33 + 1] != 0) {
						local168++;
					}
					if (local17[local33 - local23] != 0) {
						local168++;
					}
					if (local17[local33 + local23] != 0) {
						local168++;
					}
					local282[local47++] = (byte) (local168 * 17);
				} else {
					local282[local47++] = 68;
				}
				local33++;
			}
			local33 += this.aClass295_2.anInt7450 - 128;
		}
		if (this.anInterface18_4 == null) {
			this.anInterface18_4 = this.aClass19_Sub1_13.method8035(128, Static369.aByteArray43, Static679.aClass92_15, 128, false);
			this.anInterface18_4.method9059(false, false);
		} else {
			this.anInterface18_4.method9058(128, 128, Static369.aByteArray43, Static679.aClass92_15, 128);
		}
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public void method6236() {
		this.method6233(this.anInterface20_4, this.anInt6949);
	}
}
