import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class369 {

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "F")
	public float aFloat201 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "F")
	public float aFloat203 = 1.0F;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "F")
	public float aFloat200 = 0.25F;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
	public int anInt9559;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!pu;")
	public Class67 aClass67_10;

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
	public int anInt9561;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "F")
	public float aFloat202;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Lclient!gm;")
	public Class148 aClass148_5;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
	public int anInt9563;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "F")
	public float aFloat205;

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "F")
	public float aFloat204;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
	public int anInt9560;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
	public int anInt9564;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
	public int anInt9565;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class369() {
		this.anInt9559 = -60;
		this.aClass67_10 = Static226.aClass67_9;
		this.anInt9561 = -50;
		this.aFloat202 = 1.2F;
		this.aClass148_5 = Static495.aClass148_4;
		this.anInt9563 = Static68.anInt4107;
		this.aFloat205 = 0.69921875F;
		this.aFloat204 = 1.1523438F;
		this.anInt9560 = -50;
		this.anInt9564 = Static563.anInt8484;
		this.anInt9565 = 0;
	}

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class369(@OriginalArg(0) Packet arg0) {
		this.method8393(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method8391(@OriginalArg(0) Packet arg0) {
		@Pc(17) int local17 = arg0.g2();
		@Pc(21) int local21 = arg0.method7363();
		@Pc(25) int local25 = arg0.method7363();
		@Pc(29) int local29 = arg0.method7363();
		@Pc(33) int local33 = arg0.g2();
		Static436.anInt3863 = local33;
		this.aClass148_5 = Static344.method5054(local25, local17, local21, local29);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ge;Z)V")
	public void method8392(@OriginalArg(0) Packet arg0) {
		this.aFloat201 = (float) (arg0.g1() * 8) / 255.0F;
		this.aFloat200 = (float) (arg0.g1() * 8) / 255.0F;
		this.aFloat203 = (float) (arg0.g1() * 8) / 255.0F;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Lclient!ge;I)V")
	public void method8393(@OriginalArg(0) Packet arg0) {
		@Pc(7) int local7 = arg0.g1();
		if (Static400.aClass2_Sub34_28.aClass57_Sub24_1.method7089() == 1 && Static425.aClass19_13.method7962() > 0) {
			if ((local7 & 0x1) == 0) {
				this.anInt9563 = Static68.anInt4107;
			} else {
				this.anInt9563 = arg0.g4();
			}
			if ((local7 & 0x2) == 0) {
				this.aFloat204 = 1.1523438F;
			} else {
				this.aFloat204 = (float) arg0.g2() / 256.0F;
			}
			if ((local7 & 0x4) == 0) {
				this.aFloat205 = 0.69921875F;
			} else {
				this.aFloat205 = (float) arg0.g2() / 256.0F;
			}
			if ((local7 & 0x8) == 0) {
				this.aFloat202 = 1.2F;
			} else {
				this.aFloat202 = (float) arg0.g2() / 256.0F;
			}
		} else {
			if ((local7 & 0x1) != 0) {
				arg0.g4();
			}
			if ((local7 & 0x2) != 0) {
				arg0.g2();
			}
			if ((local7 & 0x4) != 0) {
				arg0.g2();
			}
			if ((local7 & 0x8) != 0) {
				arg0.g2();
			}
			this.aFloat202 = 1.2F;
			this.aFloat204 = 1.1523438F;
			this.aFloat205 = 0.69921875F;
			this.anInt9563 = Static68.anInt4107;
		}
		if ((local7 & 0x10) == 0) {
			this.anInt9561 = -50;
			this.anInt9560 = -50;
			this.anInt9559 = -60;
		} else {
			this.anInt9561 = arg0.method7363();
			this.anInt9559 = arg0.method7363();
			this.anInt9560 = arg0.method7363();
		}
		if ((local7 & 0x20) == 0) {
			this.anInt9564 = Static563.anInt8484;
		} else {
			this.anInt9564 = arg0.g4();
		}
		if ((local7 & 0x40) == 0) {
			this.anInt9565 = 0;
		} else {
			this.anInt9565 = arg0.g2();
		}
		if ((local7 & 0x80) == 0) {
			this.aClass67_10 = Static226.aClass67_9;
			return;
		}
		@Pc(251) int local251 = arg0.g2();
		@Pc(255) int local255 = arg0.g2();
		@Pc(261) int local261 = arg0.g2();
		@Pc(265) int local265 = arg0.g2();
		@Pc(271) int local271 = arg0.g2();
		@Pc(275) int local275 = arg0.g2();
		this.aClass67_10 = Static373.method5308(local271, local255, local261, local265, local275, local251);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLclient!uc;)Z")
	public boolean method8395(@OriginalArg(1) Class369 arg0) {
		return this.anInt9563 == arg0.anInt9563 && arg0.aFloat204 == this.aFloat204 && this.aFloat205 == arg0.aFloat205 && this.aFloat202 == arg0.aFloat202 && arg0.aFloat200 == this.aFloat200 && this.aFloat201 == arg0.aFloat201 && this.aFloat203 == arg0.aFloat203 && this.anInt9564 == arg0.anInt9564 && arg0.anInt9565 == this.anInt9565 && arg0.aClass67_10 == this.aClass67_10 && arg0.aClass148_5 == this.aClass148_5;
	}
}
