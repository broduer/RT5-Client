import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class39_Sub12 extends Class39 {

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	private final int anInt5062;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	private final int anInt5057;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub12(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt5062 = arg0.g2();
		this.anInt5057 = arg0.g2();
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static219.aClass238Array1[this.anInt5062].method5370().method9305(this.anInt5057, true);
	}
}
