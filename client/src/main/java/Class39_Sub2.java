import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
	private final int anInt1840;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "Ljava/lang/String;")
	private final String aString15;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	private final int anInt1842;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
	private final int anInt1841;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub2(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt1840 = arg0.method7389();
		this.aString15 = arg0.method7365();
		this.anInt1842 = arg0.method7356();
		this.anInt1841 = arg0.method7389();
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static219.aClass238Array1[this.anInt1840].method5370().method9320(this.anInt1841, this.aString15, 0, this.anInt1842);
	}
}
