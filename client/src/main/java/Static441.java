import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
	public static int anInt6709;

	@OriginalMember(owner = "client!nu", name = "d", descriptor = "[Lclient!st;")
	public static Class23[] aClass23Array10;

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
	public static int anInt6711;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "Lclient!lga;")
	public static final Class227 aClass227_168 = new Class227(20, -1);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II[I[Ljava/lang/Object;Z)V")
	public static void method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Object[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(16) int local16 = (arg1 + arg0) / 2;
		@Pc(18) int local18 = arg1;
		@Pc(22) int local22 = arg2[local16];
		arg2[local16] = arg2[arg0];
		arg2[arg0] = local22;
		@Pc(36) Object local36 = arg3[local16];
		arg3[local16] = arg3[arg0];
		arg3[arg0] = local36;
		@Pc(56) int local56 = ~local22 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg0; local58++) {
			if (local22 + (local58 & local56) > arg2[local58]) {
				@Pc(72) int local72 = arg2[local58];
				arg2[local58] = arg2[local18];
				arg2[local18] = local72;
				@Pc(86) Object local86 = arg3[local58];
				arg3[local58] = arg3[local18];
				arg3[local18++] = local86;
			}
		}
		arg2[arg0] = arg2[local18];
		arg2[local18] = local22;
		arg3[arg0] = arg3[local18];
		arg3[local18] = local36;
		method5973(local18 - 1, arg1, arg2, arg3);
		method5973(arg0, local18 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ILclient!cg;)V")
	public static void method5974(@OriginalArg(1) Class8_Sub2_Sub1_Sub2 arg0) {
		@Pc(9) int local9 = arg0.anInt10788 - client.cycle;
		@Pc(20) int local20 = arg0.anInt10779 * 512 + arg0.method9309((byte) 99) * 256;
		@Pc(32) int local32 = arg0.anInt10782 * 512 + arg0.method9309((byte) 58) * 256;
		arg0.anInt10722 += (local32 - arg0.anInt10722) / local9;
		arg0.anInt10718 += (local20 - arg0.anInt10718) / local9;
		arg0.anInt10792 = 0;
		if (arg0.anInt10783 == 0) {
			arg0.method9312(8192);
		}
		if (arg0.anInt10783 == 1) {
			arg0.method9312(12288);
		}
		if (arg0.anInt10783 == 2) {
			arg0.method9312(0);
		}
		if (arg0.anInt10783 == 3) {
			arg0.method9312(4096);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
	public static boolean method5975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static280.aByteArrayArrayArray3[1].length && arg0 < Static280.aByteArrayArrayArray3[1][arg1].length) {
			return (Static280.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
