import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class2_Sub35 extends Class2 {

	@OriginalMember(owner = "client!kw", name = "l", descriptor = "I")
	public final int anInt5712;

	@OriginalMember(owner = "client!kw", name = "p", descriptor = "I")
	public final int anInt5715;

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
	public final int anInt5711;

	@OriginalMember(owner = "client!kw", name = "o", descriptor = "I")
	public final int anInt5706;

	@OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
	public final int anInt5714;

	@OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
	public final int anInt5710;

	@OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
	public final int anInt5705;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
	public final int anInt5716;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
	public final int anInt5709;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class2_Sub35(@OriginalArg(0) Class2_Sub21 arg0) {
		@Pc(5) int local5 = arg0.method7356();
		this.anInt5712 = local5 & 0x3FFF;
		this.anInt5715 = local5 >>> 28;
		this.anInt5711 = local5 >>> 14 & 0x3FFF;
		this.anInt5706 = arg0.method7403();
		this.anInt5714 = arg0.method7403();
		this.anInt5710 = arg0.method7403();
		this.anInt5705 = arg0.method7403();
		this.anInt5716 = arg0.method7403();
		this.anInt5709 = arg0.method7403();
	}
}
