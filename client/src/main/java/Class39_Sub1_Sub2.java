import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class39_Sub1_Sub2 extends Class39_Sub1 {

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	private final int anInt10564;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private final int anInt10562;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private final int anInt10563;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub1_Sub2(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt10564 = arg0.method5191();
		this.anInt10562 = arg0.method5205();
		this.anInt10563 = arg0.method5191();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	@Override
	public void method6590() {
		Static219.aClass236Array1[this.anInt10564].method3805().method6700(this.anInt10562, super.anInt10556, false, super.anInt10560 << 16, this.anInt10563, super.anInt10558);
	}
}
