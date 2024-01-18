import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public final class Class2_Sub14_Sub11 extends Class2_Sub14 {

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
	private int anInt7632;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	private int anInt7637;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method6139(@OriginalArg(0) Class164 arg0) {
		arg0.method2531(this.anInt7632, this.anInt7637);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method6137(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt7637 = arg0.method5158();
		this.anInt7632 = arg0.method5158();
	}
}
