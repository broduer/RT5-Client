import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public static int anInt5906 = 2;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
	public static final int[] anIntArray457 = new int[1];

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("a76cba054be8a8cb683bf47c5e5b4950b60647f74da5ea7d87f0ba7d24bb6580dec4809afa07e26db0d0c88ca41bdb697fc6ae0def8afc0bacd841bb57fb8851", 16);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public static int anInt5907 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	public static void method3755(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub2_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class178 local8 = Static706.aClass178Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static662.anInt9843; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static619.anInt1566; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static52.anInt1066;
							@Pc(32) int local32 = local12 << Static52.anInt1066;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class178 local41 = Static706.aClass178Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.a(local12, local15, (byte) -118) - local41.a(local12, local15, (byte) -118);
									@Pc(71) int local71 = local8.a(local12, local15 + 1, (byte) -118) - local41.a(local12, local15 + 1, (byte) -118);
									@Pc(91) int local91 = local8.a(local12 + 1, local15 + 1, (byte) -118) - local41.a(local12 + 1, local15 + 1, (byte) -118);
									@Pc(107) int local107 = local8.a(local12 + 1, local15, (byte) -118) - local41.a(local12 + 1, local15, (byte) -118);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
