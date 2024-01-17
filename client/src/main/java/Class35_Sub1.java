import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!uw", name = "r", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
	private int anInt6076;

	@OriginalMember(owner = "client!uw", name = "t", descriptor = "I")
	private int anInt6080;

	@OriginalMember(owner = "client!uw", name = "p", descriptor = "[I")
	private final int[] anIntArray467 = new int[this.anInt6525];

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class35_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt6525 > local13; local13++) {
			this.anIntArray467[local13] = (short) (int) (Math.pow(arg5, local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5815() {
		this.anInt6080 = Math.abs(this.anInt6080);
		if (this.anInt6080 >= 4096) {
			this.anInt6080 = 4095;
		}
		this.method5442(this.anInt6076++, (byte) (this.anInt6080 >> 4));
		this.anInt6080 = 0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5819() {
		this.anInt6080 = 0;
		this.anInt6076 = 0;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6080 += this.anIntArray467[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BIB)V")
	protected void method5442(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray63[this.anInt6076++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
