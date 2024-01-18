import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public final class Js5NetRequest extends Js5Request {

	@OriginalMember(owner = "client!rja", name = "H", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!rja", name = "z", descriptor = "I")
	public int anInt8354;

	@OriginalMember(owner = "client!rja", name = "A", descriptor = "Lclient!ge;")
	public Buffer aClass2_Sub21_15;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] getData() {
		if (super.incomplete || this.aClass2_Sub21_15.data.length - this.aByte129 > this.aClass2_Sub21_15.pos) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub21_15.data;
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(B)I")
	@Override
	public int getPercentageComplete() {
		return this.aClass2_Sub21_15 == null ? 0 : this.aClass2_Sub21_15.pos * 100 / (this.aClass2_Sub21_15.data.length - this.aByte129);
	}
}
