import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
	public static final int anInt3311 = 52;

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
	public static int anInt3314 = 0;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "([BI)V")
	public static synchronized void method2979(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && Static697.anInt10533 < 1000) {
			Static266.aByteArrayArray27[Static697.anInt10533++] = arg0;
		} else if (arg0.length == 5000 && Static688.anInt10383 < 250) {
			Static520.aByteArrayArray28[Static688.anInt10383++] = arg0;
		} else if (arg0.length == 30000 && Static32.anInt777 < 50) {
			Static534.aByteArrayArray29[Static32.anInt777++] = arg0;
		} else if (Static203.aByteArrayArrayArray2 != null) {
			for (@Pc(77) int local77 = 0; local77 < Static3.anIntArray13.length; local77++) {
				if (Static3.anIntArray13[local77] == arg0.length && Static203.aByteArrayArrayArray2[local77].length > Static242.anIntArray311[local77]) {
					Static203.aByteArrayArrayArray2[local77][Static242.anIntArray311[local77]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Ljava/lang/String;[BBI)I")
	public static int method2980(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = arg0.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19 += 4) {
			@Pc(29) int local29 = Static204.method3081(arg0.charAt(local19));
			@Pc(48) int local48 = local19 + 1 >= local17 ? -1 : Static204.method3081(arg0.charAt(local19 + 1));
			@Pc(68) int local68 = local17 > local19 + 2 ? Static204.method3081(arg0.charAt(local19 + 2)) : -1;
			@Pc(84) int local84 = local19 + 3 >= local17 ? -1 : Static204.method3081(arg0.charAt(local19 + 3));
			arg1[arg2++] = (byte) (local48 >>> 4 | local29 << 2);
			if (local68 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local48 & 0xF) << 4 | local68 >>> 2);
			if (local84 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local68 & 0x3) << 6 | local84);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method2981(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static697.anInt10533 > 0) {
			local18 = Static266.aByteArrayArray27[--Static697.anInt10533];
			Static266.aByteArrayArray27[Static697.anInt10533] = null;
			return local18;
		} else if (arg0 == 5000 && Static688.anInt10383 > 0) {
			local18 = Static520.aByteArrayArray28[--Static688.anInt10383];
			Static520.aByteArrayArray28[Static688.anInt10383] = null;
			return local18;
		} else if (arg0 == 30000 && Static32.anInt777 > 0) {
			local18 = Static534.aByteArrayArray29[--Static32.anInt777];
			Static534.aByteArrayArray29[Static32.anInt777] = null;
			return local18;
		} else {
			if (Static203.aByteArrayArrayArray2 != null) {
				for (@Pc(82) int local82 = 0; local82 < Static3.anIntArray13.length; local82++) {
					if (arg0 == Static3.anIntArray13[local82] && Static242.anIntArray311[local82] > 0) {
						@Pc(111) byte[] local111 = Static203.aByteArrayArrayArray2[local82][--Static242.anIntArray311[local82]];
						Static203.aByteArrayArrayArray2[local82][Static242.anIntArray311[local82]] = null;
						return local111;
					}
				}
			}
			return new byte[arg0];
		}
	}
}
