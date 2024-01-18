import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class39_Sub23 extends Class39 {

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
	private final int anInt9999;

	@OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
	private final int anInt10009;

	@OriginalMember(owner = "client!vca", name = "w", descriptor = "I")
	private final int anInt10007;

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	private final int anInt10000;

	@OriginalMember(owner = "client!vca", name = "A", descriptor = "I")
	private final int anInt10012;

	@OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
	private final int anInt10016;

	@OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
	private final int anInt10010;

	@OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
	private final int anInt10003;

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	private final int anInt10001;

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "I")
	private final int anInt10015;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
	private final int anInt10005;

	@OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
	private final int anInt10004;

	@OriginalMember(owner = "client!vca", name = "y", descriptor = "I")
	private final int anInt10006;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!ge;II)V")
	public Class39_Sub23(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(10) int local10;
		if (arg1 == 0) {
			local10 = arg0.g4();
			this.anInt9999 = local10 & 0xFFFF;
			this.anInt10009 = -1;
			this.anInt10007 = local10 >>> 16;
		} else {
			this.anInt10007 = -1;
			this.anInt9999 = -1;
			this.anInt10009 = arg0.g2();
		}
		if (arg2 == 0) {
			local10 = arg0.g4();
			this.anInt10012 = local10 >>> 16;
			this.anInt10016 = -1;
			this.anInt10000 = local10 & 0xFFFF;
		} else {
			this.anInt10000 = -1;
			this.anInt10012 = -1;
			this.anInt10016 = arg0.g2();
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt10010 = arg0.g1();
		} else {
			this.anInt10010 = -1;
		}
		this.anInt10003 = arg0.g2();
		this.anInt10001 = arg0.g1();
		this.anInt10015 = arg0.g1();
		this.anInt10005 = arg0.method7390();
		this.anInt10004 = arg0.g2();
		this.anInt10006 = arg0.g1();
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	@Override
	public void method9168() {
		@Pc(24) int local24;
		@Pc(21) int local21;
		@Pc(18) int local18;
		@Pc(15) Class8_Sub2_Sub1_Sub2 local15;
		if (this.anInt10007 < 0) {
			local15 = Static219.aClass238Array1[this.anInt10009].method5370();
			local18 = local15.aByte144;
			local21 = local15.anInt10722;
			local24 = local15.anInt10718;
		} else {
			local21 = this.anInt9999 * 512 + 256;
			local24 = this.anInt10007 * 512 + 256;
			local18 = this.anInt10010;
		}
		@Pc(63) int local63;
		@Pc(56) int local56;
		if (this.anInt9999 >= 0) {
			local56 = this.anInt10000 * 512 + 256;
			local63 = this.anInt10012 * 512 + 256;
		} else {
			local15 = Static219.aClass238Array1[this.anInt10016].method5370();
			local63 = local15.anInt10718;
			local56 = local15.anInt10722;
			if (local18 < 0) {
				local18 = local15.aByte144;
			}
		}
		@Pc(91) int local91 = this.anInt10006 << 2;
		@Pc(128) Class8_Sub2_Sub1_Sub1 local128 = new Class8_Sub2_Sub1_Sub1(this.anInt10003, local18, local18, local24, local21, this.anInt10001 << 2, client.cycle, client.cycle + this.anInt10005, this.anInt10004, local91, this.anInt10009 + 1, this.anInt10016 + 1, this.anInt10015 << 2, false, 0);
		local128.method813(this.anInt10015 << 2, this.anInt10005 + client.cycle, local56, local63);
		Static505.aClass341_77.method7718(new Class2_Sub2_Sub15(local128));
	}
}
