import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public final class Class2_Sub14_Sub4 extends Class2_Sub14 {

	@OriginalMember(owner = "client!gka", name = "l", descriptor = "Ljava/lang/String;")
	private String aString37 = null;

	@OriginalMember(owner = "client!gka", name = "s", descriptor = "J")
	private long aLong118 = -1L;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8624(@OriginalArg(0) Class164 arg0) {
		arg0.method3486(this.aString37, this.aLong118);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8622(@OriginalArg(1) Class2_Sub21 arg0) {
		if (arg0.method7403() != 255) {
			arg0.anInt8412--;
			this.aLong118 = arg0.method7405();
		}
		this.aString37 = arg0.method7410();
	}
}
