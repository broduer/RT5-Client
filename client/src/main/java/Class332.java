import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class332 {

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray37;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!pj;")
	private Class294 aClass294_2 = null;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "Lclient!bm;")
	private final Class47 aClass47_1;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Z")
	private final boolean aBoolean657;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
	public int anInt8579;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!bm;ZI)V")
	public Class332(@OriginalArg(0) Class47 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aClass47_1 = arg0;
		this.aBoolean657 = arg1;
		this.anInt8579 = arg2;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZBZ)V")
	public void method7582(@OriginalArg(0) boolean arg0) {
		if (!this.method7608()) {
			return;
		}
		if (arg0) {
			this.aClass294_2.aClass100_1 = null;
			this.aClass294_2.anIntArray596 = null;
		}
		this.aClass294_2.anIntArrayArray186 = null;
		this.aClass294_2.aClass100Array1 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
	public int method7583() {
		if (!this.method7608()) {
			throw new IllegalStateException("");
		}
		return this.aClass294_2.anInt7386;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z")
	public boolean method7584(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7608()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local13));
		if (local25 < 0) {
			return false;
		} else {
			@Pc(41) int local41 = this.aClass294_2.aClass100Array1[local25].method2382(Static95.method1894(local16));
			return local41 >= 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method7585(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = this.getGroupId("");
		return local14 == -1 ? this.method7611(arg0, "") : this.method7611("", arg0);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(II)V")
	private void method7586(@OriginalArg(0) int arg0) {
		if (this.aBoolean657) {
			this.anObjectArray37[arg0] = this.aClass47_1.method6648(arg0);
		} else {
			this.anObjectArray37[arg0] = Static247.method3524(this.aClass47_1.method6648(arg0));
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)I")
	private int method7587(@OriginalArg(1) int arg0) {
		if (this.method7603(arg0)) {
			return this.anObjectArray37[arg0] == null ? this.aClass47_1.method6644(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)Z")
	public boolean method7588(@OriginalArg(0) int arg0) {
		if (!this.method7608()) {
			return false;
		} else if (this.aClass294_2.anIntArray595.length == 1) {
			return this.method7593(arg0, 0);
		} else if (!this.method7603(arg0)) {
			return false;
		} else if (this.aClass294_2.anIntArray595[arg0] == 1) {
			return this.method7593(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)I")
	public int method7589() {
		if (!this.method7608()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray37.length; local22++) {
			if (this.aClass294_2.anIntArray598[local22] > 0) {
				local18 += 100;
				local20 += this.method7587(local22);
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([IIII)[B")
	public byte[] method7590(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method7591(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(33) boolean local33 = this.method7592(arg0, arg1, arg2);
			if (!local33) {
				this.method7586(arg2);
				local33 = this.method7592(arg0, arg1, arg2);
				if (!local33) {
					return null;
				}
			}
		}
		@Pc(61) byte[] local61 = Static377.method5328(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt8579 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass294_2.anIntArray595[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt8579 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local61;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIB)Z")
	private boolean method7591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method7608()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass294_2.anIntArray595.length && this.aClass294_2.anIntArray595[arg1] > arg0) {
			return true;
		} else if (Static486.aBoolean550) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[III)Z")
	private boolean method7592(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method7603(arg2)) {
			return false;
		} else if (this.anObjectArray37[arg2] == null) {
			return false;
		} else {
			@Pc(32) int local32 = this.aClass294_2.anIntArray598[arg2];
			@Pc(38) int[] local38 = this.aClass294_2.anIntArrayArray185[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass294_2.anIntArray595[arg2]];
			}
			@Pc(60) Object[] local60 = this.anObjectArrayArray1[arg2];
			@Pc(62) boolean local62 = true;
			for (@Pc(64) int local64 = 0; local64 < local32; local64++) {
				@Pc(71) int local71;
				if (local38 == null) {
					local71 = local64;
				} else {
					local71 = local38[local64];
				}
				if (local60[local71] == null) {
					local62 = false;
					break;
				}
			}
			if (local62) {
				return true;
			}
			@Pc(138) byte[] local138;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local138 = Static377.method5328(false, this.anObjectArray37[arg2]);
			} else {
				local138 = Static377.method5328(true, this.anObjectArray37[arg2]);
				@Pc(152) Packet local152 = new Packet(local138);
				local152.tinydec(arg0, local152.data.length);
			}
			@Pc(164) byte[] local164;
			try {
				local164 = Static590.method7751(local138);
			} catch (@Pc(166) RuntimeException local166) {
				throw Static231.method3380(local166, "T3 - " + (arg0 != null) + "," + arg2 + "," + local138.length + "," + Packet.getcrc(local138.length, local138) + "," + Packet.getcrc(local138.length - 2, local138) + "," + this.aClass294_2.anIntArray599[arg2] + "," + this.aClass294_2.anInt7386);
			}
			if (this.aBoolean657) {
				this.anObjectArray37[arg2] = null;
			}
			@Pc(243) int local243;
			if (local32 <= 1) {
				if (local38 == null) {
					local243 = 0;
				} else {
					local243 = local38[0];
				}
				if (this.anInt8579 == 0) {
					local60[local243] = Static247.method3524(local164);
				} else {
					local60[local243] = local164;
				}
			} else {
				@Pc(279) int local279;
				@Pc(292) Packet local292;
				@Pc(300) int local300;
				@Pc(303) int local303;
				@Pc(305) int local305;
				@Pc(363) int local363;
				@Pc(365) int local365;
				@Pc(368) int local368;
				@Pc(370) int local370;
				if (this.anInt8579 == 2) {
					local243 = local164.length;
					local243--;
					local279 = local164[local243] & 0xFF;
					local243 -= local279 * local32 * 4;
					local292 = new Packet(local164);
					@Pc(474) int local474 = 0;
					local292.pos = local243;
					local300 = 0;
					for (local303 = 0; local303 < local279; local303++) {
						local305 = 0;
						for (local363 = 0; local363 < local32; local363++) {
							local305 += local292.g4();
							if (local38 == null) {
								local365 = local363;
							} else {
								local365 = local38[local363];
							}
							if (arg1 == local365) {
								local300 = local365;
								local474 += local305;
							}
						}
					}
					if (local474 == 0) {
						return true;
					}
					@Pc(539) byte[] local539 = new byte[local474];
					local292.pos = local243;
					local474 = 0;
					local363 = 0;
					for (local365 = 0; local365 < local279; local365++) {
						local368 = 0;
						for (local370 = 0; local370 < local32; local370++) {
							local368 += local292.g4();
							@Pc(566) int local566;
							if (local38 == null) {
								local566 = local370;
							} else {
								local566 = local38[local370];
							}
							if (local566 == arg1) {
								Static734.method7701(local164, local363, local539, local474, local368);
								local474 += local368;
							}
							local363 += local368;
						}
					}
					local60[local300] = local539;
				} else {
					local243 = local164.length;
					local243--;
					local279 = local164[local243] & 0xFF;
					local243 -= local279 * local32 * 4;
					local292 = new Packet(local164);
					local292.pos = local243;
					@Pc(298) int[] local298 = new int[local32];
					for (local300 = 0; local300 < local279; local300++) {
						local303 = 0;
						for (local305 = 0; local305 < local32; local305++) {
							local303 += local292.g4();
							local298[local305] += local303;
						}
					}
					@Pc(336) byte[][] local336 = new byte[local32][];
					for (local305 = 0; local305 < local32; local305++) {
						local336[local305] = new byte[local298[local305]];
						local298[local305] = 0;
					}
					local292.pos = local243;
					local363 = 0;
					for (local365 = 0; local365 < local279; local365++) {
						local368 = 0;
						for (local370 = 0; local370 < local32; local370++) {
							local368 += local292.g4();
							Static734.method7701(local164, local363, local336[local370], local298[local370], local368);
							local298[local370] += local368;
							local363 += local368;
						}
					}
					for (local368 = 0; local368 < local32; local368++) {
						if (local38 == null) {
							local370 = local368;
						} else {
							local370 = local38[local368];
						}
						if (this.anInt8579 == 0) {
							local60[local370] = Static247.method3524(local336[local368]);
						} else {
							local60[local370] = local336[local368];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Z")
	public boolean method7593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method7591(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray37[arg1] == null) {
			this.method7586(arg1);
			return this.anObjectArray37[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7594(@OriginalArg(0) String arg0) {
		if (this.method7608()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local21));
			return local30 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)V")
	private void method7595(@OriginalArg(1) int arg0) {
		this.aClass47_1.method6643(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)[B")
	public byte[] method7596(@OriginalArg(1) int arg0) {
		if (!this.method7608()) {
			return null;
		} else if (this.aClass294_2.anIntArray595.length == 1) {
			return this.method7602(arg0, 0);
		} else if (!this.method7603(arg0)) {
			return null;
		} else if (this.aClass294_2.anIntArray595[arg0] == 1) {
			return this.method7602(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int getGroupId(@OriginalArg(0) String arg0) {
		if (this.method7608()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local19));
			return this.method7603(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Z")
	public boolean method7598() {
		if (!this.method7608()) {
			return false;
		}
		@Pc(24) boolean local24 = true;
		for (@Pc(26) int local26 = 0; local26 < this.aClass294_2.anIntArray600.length; local26++) {
			@Pc(36) int local36 = this.aClass294_2.anIntArray600[local26];
			if (this.anObjectArray37[local36] == null) {
				this.method7586(local36);
				if (this.anObjectArray37[local36] == null) {
					local24 = false;
				}
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public void method7599() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method7600(@OriginalArg(1) String arg0) {
		if (this.method7608()) {
			@Pc(24) String local24 = arg0.toLowerCase();
			@Pc(33) int local33 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local24));
			return this.method7587(local33);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public void method7601() {
		if (this.anObjectArray37 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anObjectArray37.length; local18++) {
				this.anObjectArray37[local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)[B")
	public byte[] method7602(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method7590(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(BI)Z")
	private boolean method7603(@OriginalArg(1) int arg0) {
		if (!this.method7608()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass294_2.anIntArray595.length && this.aClass294_2.anIntArray595[arg0] != 0) {
			return true;
		} else if (Static486.aBoolean550) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)I")
	public int method7604() {
		return this.method7608() ? this.aClass294_2.anIntArray595.length : -1;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7605(@OriginalArg(0) String arg0) {
		if (this.method7608()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(22) int local22 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local13));
			return this.method7614(local22);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)I")
	public int method7606(@OriginalArg(1) int arg0) {
		if (this.method7608()) {
			@Pc(17) int local17 = this.aClass294_2.aClass100_1.method2382(arg0);
			return this.method7603(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method7607(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method7608()) {
			return null;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local13));
		if (this.method7603(local25)) {
			@Pc(53) int local53 = this.aClass294_2.aClass100Array1[local25].method2382(Static95.method1894(local16));
			return this.method7602(local53, local25);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)Z")
	private boolean method7608() {
		if (this.aClass294_2 == null) {
			this.aClass294_2 = this.aClass47_1.method6649();
			if (this.aClass294_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass294_2.anInt7389][];
			this.anObjectArray37 = new Object[this.aClass294_2.anInt7389];
		}
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Ljava/lang/String;I)V")
	public void method7609(@OriginalArg(0) String arg0) {
		if (this.method7608()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local12));
			this.method7595(local29);
		}
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)[I")
	public int[] method7610(@OriginalArg(0) int arg0) {
		if (!this.method7603(arg0)) {
			return null;
		}
		@Pc(17) int[] local17 = this.aClass294_2.anIntArrayArray185[arg0];
		if (local17 == null) {
			local17 = new int[this.aClass294_2.anIntArray598[arg0]];
			@Pc(28) int local28 = 0;
			while (local28 < local17.length) {
				local17[local28] = local28++;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)Z")
	private boolean method7611(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method7608()) {
			return false;
		}
		@Pc(13) String local13 = arg0.toLowerCase();
		@Pc(16) String local16 = arg1.toLowerCase();
		@Pc(25) int local25 = this.aClass294_2.aClass100_1.method2382(Static95.method1894(local13));
		if (this.method7603(local25)) {
			@Pc(44) int local44 = this.aClass294_2.aClass100Array1[local25].method2382(Static95.method1894(local16));
			return this.method7593(local44, local25);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(BI)V")
	public void method7612(@OriginalArg(1) int arg0) {
		if (this.method7603(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)Z")
	public boolean method7614(@OriginalArg(1) int arg0) {
		if (!this.method7603(arg0)) {
			return false;
		} else if (this.anObjectArray37[arg0] == null) {
			this.method7586(arg0);
			return this.anObjectArray37[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
	public int method7615(@OriginalArg(1) int arg0) {
		return this.method7603(arg0) ? this.aClass294_2.anIntArray595[arg0] : 0;
	}
}
