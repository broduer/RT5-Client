import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class39_Sub5 extends Class39 {

	@OriginalMember(owner = "client!fka", name = "k", descriptor = "I")
	private final int anInt3009;

	@OriginalMember(owner = "client!fka", name = "m", descriptor = "I")
	private final int anInt3005;

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class39_Sub5(@OriginalArg(0) Class2_Sub21 arg0) {
		super(arg0);
		this.anInt3009 = arg0.method7389();
		this.anInt3005 = arg0.method7356();
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		Static323.anInt5137 = Static399.anInt6235;
		Static493.anInt7391 = Static186.anInt3068;
		Static582.anInt8652 = Static337.anInt5576;
		Static4.anInt84 = this.anInt3009 + client.cycle;
		Static201.anInt8431 = Static622.anInt7760;
		Static115.anInt2268 = client.cycle;
		Static622.anInt7760 = this.anInt3005 & 0xFF;
		Static337.anInt5576 = this.anInt3005 >>> 16 & 0xFF;
		Static399.anInt6235 = this.anInt3005 >>> 24;
		Static186.anInt3068 = this.anInt3005 >>> 8 & 0xFF;
	}
}
