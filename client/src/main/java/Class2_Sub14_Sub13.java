import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class2_Sub14_Sub13 extends Class2_Sub14 {

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
	private int anInt9864 = -1;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8622(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt9864 = arg0.method7389();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8624(@OriginalArg(0) Class164 arg0) {
		arg0.method3491(this.anInt9864);
	}
}