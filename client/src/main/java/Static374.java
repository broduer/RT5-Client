import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
	public static int anInt5926 = 2;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "[I")
	public static final int[] anIntArray457 = new int[1];

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("a1129cdb79665ed39b10d09e8dcfbc373f7e0b8097b98b1ddc4762149734ce8ea6ce59f3b9d76b1bbe10ad30ff67f87232477d7d98cacff3bd0c309e49000452947bb04d5122fd5cb113ce197393b28ef8d27841e0f3584baf9cb3848ba3be11826457c73545953ee00b3dbcd456774392055ac1382b6e4e49e6aa2bf026a28d165e4a59e907e229c5e372f3e486d2044c030f6efcdaa9d5893ab0609ecd41d56aca5af36845158031ed98a1bcb68bea4f7eaf823e00402fc05571dc1c83d9417f0489ec0f986761a793ad2bc493281b917d572400588a4634503e20ba6518c7b9367d959ef7fa6249a11f032d1707ed84bf2cda0ca8960e97295234d65cc2e1", 16);

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
	public static int anInt5927 = -1;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	public static void method5310(@OriginalArg(1) int arg0) {
		@Pc(1) SecondaryNode_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class178 local8 = Static706.aClass178Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static662.anInt9869; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static619.anInt1573; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static52.anInt1070;
							@Pc(32) int local32 = local12 << Static52.anInt1070;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class178 local41 = Static706.aClass178Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7876(local12, local15) - local41.method7876(local12, local15);
									@Pc(71) int local71 = local8.method7876(local12, local15 + 1) - local41.method7876(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7876(local12 + 1, local15 + 1) - local41.method7876(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7876(local12 + 1, local15) - local41.method7876(local12 + 1, local15);
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
