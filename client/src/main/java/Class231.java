import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lja")
public final class Class231 {

	@OriginalMember(owner = "client!lja", name = "e", descriptor = "I")
	public int anInt5876;

	@OriginalMember(owner = "client!lja", name = "i", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!lja", name = "m", descriptor = "I")
	public int anInt5874 = 43594;

	@OriginalMember(owner = "client!lja", name = "k", descriptor = "I")
	public int anInt5873 = 443;

	@OriginalMember(owner = "client!lja", name = "d", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!lja", name = "f", descriptor = "Z")
	private boolean aBoolean450 = true;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
	public void method5267() {
		if (!this.aBoolean450) {
			this.aBoolean449 = true;
			this.aBoolean450 = true;
		} else if (this.aBoolean449) {
			this.aBoolean449 = false;
		} else {
			this.aBoolean450 = false;
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(BLclient!vq;)Lclient!oba;")
	public Class272 method5270(@OriginalArg(1) Class392 arg0) {
		return arg0.method8986(this.aString60, this.aBoolean449, this.aBoolean450 ? this.anInt5873 : this.anInt5874);
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILclient!lja;)Z")
	public boolean method5272(@OriginalArg(1) Class231 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return arg0.anInt5876 == this.anInt5876 && this.aString60.equals(arg0.aString60);
		}
	}
}