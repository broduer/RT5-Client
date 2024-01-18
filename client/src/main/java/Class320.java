import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class320 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!ef;")
	public Class96 aClass96_5;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public int anInt8276;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public int anInt8272 = 0;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public int anInt8273 = 512;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "Z")
	public boolean aBoolean627 = true;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public int anInt8271 = -1;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public int anInt8275 = 64;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Z")
	public boolean aBoolean628 = true;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	public int anInt8274 = 8;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public int anInt8279 = 127;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public int anInt8278 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Z")
	public boolean aBoolean629 = false;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public int anInt8283 = 1190717;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method7261() {
		this.anInt8274 = this.anInt8276 | this.anInt8274 << 8;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ge;)V")
	public void method7263(@OriginalArg(1) Packet arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.g1();
			if (local7 == 0) {
				return;
			}
			this.method7264(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ge;I)V")
	private void method7264(@OriginalArg(1) Packet arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8272 = Static579.method7640(arg0.method7390());
		} else if (arg1 == 2) {
			this.anInt8278 = arg0.g1();
		} else if (arg1 == 3) {
			this.anInt8278 = arg0.g2();
			if (this.anInt8278 == 65535) {
				this.anInt8278 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean627 = false;
		} else if (arg1 == 7) {
			this.anInt8271 = Static579.method7640(arg0.method7390());
		} else if (arg1 == 8) {
			this.aClass96_5.anInt2518 = this.anInt8276;
		} else if (arg1 == 9) {
			this.anInt8273 = arg0.g2() << 2;
		} else if (arg1 == 10) {
			this.aBoolean628 = false;
		} else if (arg1 == 11) {
			this.anInt8274 = arg0.g1();
		} else if (arg1 == 12) {
			this.aBoolean629 = true;
		} else if (arg1 == 13) {
			this.anInt8283 = arg0.method7390();
		} else if (arg1 == 14) {
			this.anInt8275 = arg0.g1() << 2;
		} else if (arg1 == 16) {
			this.anInt8279 = arg0.g1();
		}
	}
}
