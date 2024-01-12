import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rja")
public final class Class2_Sub2_Sub17_Sub1 extends Class2_Sub2_Sub17 {

	@OriginalMember(owner = "client!rja", name = "H", descriptor = "B")
	public byte aByte129;

	@OriginalMember(owner = "client!rja", name = "z", descriptor = "I")
	public int anInt8354;

	@OriginalMember(owner = "client!rja", name = "A", descriptor = "Lclient!ge;")
	public Class2_Sub21 aClass2_Sub21_15;

	@OriginalMember(owner = "client!rja", name = "a", descriptor = "(I)[B")
	@Override
	public byte[] method8978() {
		if (super.aBoolean779 || this.aClass2_Sub21_15.aByteArray93.length - this.aByte129 > this.aClass2_Sub21_15.anInt8412) {
			throw new RuntimeException();
		}
		return this.aClass2_Sub21_15.aByteArray93;
	}

	@OriginalMember(owner = "client!rja", name = "c", descriptor = "(B)I")
	@Override
	public int method8979() {
		return this.aClass2_Sub21_15 == null ? 0 : this.aClass2_Sub21_15.anInt8412 * 100 / (this.aClass2_Sub21_15.aByteArray93.length - this.aByte129);
	}
}
