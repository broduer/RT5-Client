import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class39_Sub1_Sub2 extends Class39_Sub1 {

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
	private final int anInt10592;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private final int anInt10590;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private final int anInt10591;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub1_Sub2(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt10592 = arg0.method7389();
		this.anInt10590 = arg0.method7403();
		this.anInt10591 = arg0.method7389();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static219.aClass238Array1[this.anInt10592].method5370().method9316(this.anInt10590, super.anInt10584, false, super.anInt10588 << 16, this.anInt10591, super.anInt10586);
	}
}
