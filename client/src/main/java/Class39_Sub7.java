import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class39_Sub7 extends Class39 {

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
	private final int anInt3425;

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
	private final int anInt3424;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub7(@OriginalArg(0) Packet arg0) {
		super(arg0);
		this.anInt3425 = arg0.g2();
		this.anInt3424 = arg0.method7353();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		@Pc(8) Class396 local8 = Static507.aClass396Array1[this.anInt3425];
		Static198.method2953(local8.anInt10444, local8.anInt10450, local8.anInt10443, this.anInt3424, local8.anInt10447, local8.anInt10440, Static461.anIntArray555[local8.anInt10443]);
	}
}
