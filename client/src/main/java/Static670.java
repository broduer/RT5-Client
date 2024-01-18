import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static670 {

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "I")
	public static int anInt10051;

	@OriginalMember(owner = "client!vda", name = "N", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("d6808be939bbfd2ec4e96b1581ce3e1144b526e7643a72e3c64fbb902724fbfcf14ab601da6d6f8dbb57d1c369d080d9fc392abeb7886e0076d07f2aea5810e540d2817fd1967e35b39cc95cf7c9170b5fb55f5bf95524b60e938f0d64614bc365b87d66963a8cc8664e32875366099ef297180d01c7c3842162865e11d92299", 16);

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIII)I")
	public static int method8739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return arg1 < arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
	public static void method8742() {
		if (Static265.sskey != null) {
			Static619.method1512(Static470.anInt7134);
		} else if (Static129.anInt2418 == -1) {
			Static192.method2877(Static59.aString63, Static470.anInt7134, Static449.aString75);
		} else {
			Static113.method2119(Static470.anInt7134);
		}
	}
}
