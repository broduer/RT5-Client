import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class39_Sub21 extends Class39 {

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "I")
	private final int anInt8693;

	@OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
	private final int anInt8695;

	@OriginalMember(owner = "client!sha", name = "i", descriptor = "I")
	private final int anInt8692;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub21(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt8693 = arg0.method7389();
		this.anInt8695 = arg0.method7389();
		this.anInt8692 = arg0.method7403();
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		@Pc(8) Class238 local8 = Static219.aClass238Array1[this.anInt8693];
		@Pc(13) Class233 local13 = Static183.aClass233Array1[this.anInt8695];
		local13.method5278(local8, this.anInt8692);
	}
}
