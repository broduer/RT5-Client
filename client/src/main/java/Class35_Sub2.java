import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	private int anInt6536;

	@OriginalMember(owner = "client!hga", name = "D", descriptor = "I")
	private int anInt6540;

	@OriginalMember(owner = "client!hga", name = "w", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!hga", name = "z", descriptor = "I")
	private int anInt6542;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	private int anInt6543;

	@OriginalMember(owner = "client!hga", name = "B", descriptor = "I")
	private final int anInt6541;

	@OriginalMember(owner = "client!hga", name = "E", descriptor = "I")
	private final int anInt6537;

	@OriginalMember(owner = "client!hga", name = "x", descriptor = "I")
	private final int anInt6535;

	@OriginalMember(owner = "client!hga", name = "t", descriptor = "I")
	private int anInt6533;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6541 = (int) (arg6 * 4096.0F);
		this.anInt6537 = (int) (arg7 * 4096.0F);
		this.anInt6533 = this.anInt6535 = (int) (Math.pow(0.5D, -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBB)V")
	protected void method5820(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray77[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6543 = this.anInt6541 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt6542 = 4096;
			this.anInt6543 = this.anInt6543 * this.anInt6543 >> 12;
			this.anInt6536 = this.anInt6543;
			return;
		}
		this.anInt6542 = this.anInt6543 * this.anInt6537 >> 12;
		this.anInt6543 = this.anInt6541 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt6542 < 0) {
			this.anInt6542 = 0;
		} else if (this.anInt6542 > 4096) {
			this.anInt6542 = 4096;
		}
		this.anInt6543 = this.anInt6543 * this.anInt6543 >> 12;
		this.anInt6543 = this.anInt6543 * this.anInt6542 >> 12;
		this.anInt6536 += this.anInt6533 * this.anInt6543 >> 12;
		this.anInt6533 = this.anInt6535 * this.anInt6533 >> 12;
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5815() {
		this.anInt6533 = this.anInt6535;
		this.anInt6536 >>= 0x4;
		if (this.anInt6536 < 0) {
			this.anInt6536 = 0;
		} else if (this.anInt6536 > 255) {
			this.anInt6536 = 255;
		}
		this.method5820(this.anInt6540++, (byte) this.anInt6536);
		this.anInt6536 = 0;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5819() {
		this.anInt6536 = 0;
		this.anInt6540 = 0;
	}
}
