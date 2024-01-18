import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public final class Class39_Sub6 extends Class39 {

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	private final int anInt3034;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
	private final int anInt3029;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Ljava/lang/String;")
	private final String aString33;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	private final int anInt3035;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	private final int anInt3030;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub6(@OriginalArg(0) Buffer arg0) {
		super(arg0);
		this.anInt3034 = arg0.g2();
		this.anInt3029 = arg0.g2();
		this.aString33 = arg0.gstr();
		this.anInt3035 = arg0.g4();
		this.anInt3030 = arg0.g2();
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static540.method6546(Static394.anInt6196, this.anInt3030, this.aString33, this.anInt3035, Static102.method2025(Static394.anInt6196, -29754, this.anInt3029, this.anInt3034), this.anInt3034, this.anInt3029);
	}
}
