import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static650 {

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[F")
	public static float[] aFloatArray72;

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "[I")
	public static int[] anIntArray756;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "[B")
	private static byte[] aByteArray101;

	@OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
	private static int anInt9703;

	@OriginalMember(owner = "client!uj", name = "N", descriptor = "[Lclient!l;")
	public static Class219[] aClass219Array1;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "[I")
	public static int[] anIntArray757;

	@OriginalMember(owner = "client!uj", name = "K", descriptor = "[F")
	public static float[] aFloatArray73;

	@OriginalMember(owner = "client!uj", name = "M", descriptor = "[F")
	public static float[] aFloatArray74;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "[F")
	public static float[] aFloatArray75;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
	public static int anInt9707;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray32;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "[F")
	public static float[] aFloatArray76;

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "[Lclient!bk;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "[Lclient!tr;")
	public static Class362[] aClass362Array1;

	@OriginalMember(owner = "client!uj", name = "J", descriptor = "[I")
	public static int[] anIntArray758;

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
	private static int anInt9708;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "[Lclient!oca;")
	public static Class273[] aClass273Array1;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "[F")
	public static float[] aFloatArray77;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
	public static int anInt9709;

	@OriginalMember(owner = "client!uj", name = "y", descriptor = "[F")
	public static float[] aFloatArray79;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "Z")
	private static boolean aBoolean747 = false;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sb;I)Lclient!uj;")
	public static Node_Sub53 method8505(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1) {
		if (method8512(arg0)) {
			@Pc(14) byte[] local14 = arg0.method7596(arg1);
			return local14 == null ? null : new Node_Sub53(local14);
		} else {
			arg0.method7588(arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)I")
	public static int method8507(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(8) int local8;
		while (arg0 >= 8 - anInt9703) {
			local8 = 8 - anInt9703;
			@Pc(14) int local14 = (0x1 << local8) - 1;
			local1 += (aByteArray101[anInt9708] >> anInt9703 & local14) << local3;
			anInt9703 = 0;
			anInt9708++;
			local3 += local8;
			arg0 -= local8;
		}
		if (arg0 > 0) {
			local8 = (0x1 << arg0) - 1;
			local1 += (aByteArray101[anInt9708] >> anInt9703 & local8) << local3;
			anInt9703 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "([B)V")
	public static void method8511(@OriginalArg(0) byte[] arg0) {
		method8515(arg0);
		anInt9707 = 0x1 << method8507(4);
		anInt9709 = 0x1 << method8507(4);
		aFloatArray74 = new float[anInt9709];
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(86) int local86;
		@Pc(138) int local138;
		@Pc(191) int local191;
		for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
			local24 = local17 == 0 ? anInt9707 : anInt9709;
			local28 = local24 >> 1;
			local32 = local24 >> 2;
			local36 = local24 >> 3;
			@Pc(39) float[] local39 = new float[local28];
			for (local41 = 0; local41 < local32; local41++) {
				local39[local41 * 2] = (float) Math.cos((double) (local41 * 4) * 3.141592653589793D / (double) local24);
				local39[local41 * 2 + 1] = -((float) Math.sin((double) (local41 * 4) * 3.141592653589793D / (double) local24));
			}
			@Pc(84) float[] local84 = new float[local28];
			for (local86 = 0; local86 < local32; local86++) {
				local84[local86 * 2] = (float) Math.cos((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
				local84[local86 * 2 + 1] = (float) Math.sin((double) (local86 * 2 + 1) * 3.141592653589793D / (double) (local24 * 2));
			}
			@Pc(136) float[] local136 = new float[local32];
			for (local138 = 0; local138 < local36; local138++) {
				local136[local138 * 2] = (float) Math.cos((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24);
				local136[local138 * 2 + 1] = -((float) Math.sin((double) (local138 * 4 + 2) * 3.141592653589793D / (double) local24));
			}
			@Pc(185) int[] local185 = new int[local36];
			local191 = Static434.method5860(local36 - 1);
			for (@Pc(193) int local193 = 0; local193 < local36; local193++) {
				local185[local193] = Static179.method2767(local191, local193);
			}
			if (local17 == 0) {
				aFloatArray75 = local39;
				aFloatArray79 = local84;
				aFloatArray76 = local136;
				anIntArray758 = local185;
			} else {
				aFloatArray73 = local39;
				aFloatArray77 = local84;
				aFloatArray72 = local136;
				anIntArray757 = local185;
			}
		}
		local24 = method8507(8) + 1;
		aClass273Array1 = new Class273[local24];
		for (local28 = 0; local28 < local24; local28++) {
			aClass273Array1[local28] = new Class273();
		}
		local32 = method8507(6) + 1;
		for (local36 = 0; local36 < local32; local36++) {
			method8507(16);
		}
		@Pc(269) int local269 = method8507(6) + 1;
		aClass44Array1 = new Class44[local269];
		for (local41 = 0; local41 < local269; local41++) {
			aClass44Array1[local41] = new Class44();
		}
		@Pc(290) int local290 = method8507(6) + 1;
		aClass219Array1 = new Class219[local290];
		for (local86 = 0; local86 < local290; local86++) {
			aClass219Array1[local86] = new Class219();
		}
		@Pc(311) int local311 = method8507(6) + 1;
		aClass362Array1 = new Class362[local311];
		for (local138 = 0; local138 < local311; local138++) {
			aClass362Array1[local138] = new Class362();
		}
		@Pc(332) int local332 = method8507(6) + 1;
		aBooleanArray32 = new boolean[local332];
		anIntArray756 = new int[local332];
		for (local191 = 0; local191 < local332; local191++) {
			aBooleanArray32[local191] = method8516() != 0;
			method8507(16);
			method8507(16);
			anIntArray756[local191] = method8507(8);
		}
		aBoolean747 = true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sb;)Z")
	public static boolean method8512(@OriginalArg(0) Js5 arg0) {
		if (!aBoolean747) {
			@Pc(7) byte[] local7 = arg0.fetchFile(0, 0);
			if (local7 == null) {
				return false;
			}
			method8511(local7);
		}
		return true;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!sb;II)Lclient!uj;")
	public static Node_Sub53 method8513(@OriginalArg(0) Js5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (method8512(arg0)) {
			@Pc(16) byte[] local16 = arg0.fetchFile(arg2, arg1);
			return local16 == null ? null : new Node_Sub53(local16);
		} else {
			arg0.method7593(arg2, arg1);
			return null;
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)F")
	public static float method8514(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, local13 - 788));
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "([BI)V")
	public static void method8515(@OriginalArg(0) byte[] arg0) {
		aByteArray101 = arg0;
		anInt9708 = 0;
		anInt9703 = 0;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "()I")
	public static int method8516() {
		@Pc(7) int local7 = aByteArray101[anInt9708] >> anInt9703 & 0x1;
		anInt9703++;
		anInt9708 += anInt9703 >> 3;
		anInt9703 &= 0x7;
		return local7;
	}
}
