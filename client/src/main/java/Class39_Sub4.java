import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class39_Sub4 extends Class39 {

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
	private final int anInt2532;

	@OriginalMember(owner = "client!ega", name = "m", descriptor = "I")
	private final int anInt2527;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
	private final int anInt2529;

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
	private final int anInt2528;

	@OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
	private final int anInt2531;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub4(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt2532 = arg0.method5191();
		@Pc(11) int local11 = arg0.method5158();
		this.anInt2527 = local11 >>> 16;
		this.anInt2529 = local11 & 0xFFFF;
		this.anInt2528 = arg0.method5205();
		this.anInt2531 = arg0.method5169();
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V")
	@Override
	public void method6590() {
		Static219.aClass236Array1[this.anInt2532].method3806(this.anInt2531, this.anInt2528, this.anInt2527, this.anInt2529);
	}
}
