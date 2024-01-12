import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public final class Class2_Sub14_Sub9 extends Class2_Sub14 {

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
	private int anInt6836;

	@OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
	private int anInt6837;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
	private int anInt6841;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!hi;I)V")
	@Override
	public void method8624(@OriginalArg(0) Class164 arg0) {
		arg0.method3493(this.anInt6839, this.anInt6841, this.anInt6837, this.anInt6836);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!ge;)V")
	@Override
	public void method8622(@OriginalArg(1) Class2_Sub21 arg0) {
		this.anInt6836 = arg0.method7356();
		this.anInt6837 = arg0.method7356();
		this.anInt6841 = arg0.method7403();
		this.anInt6839 = arg0.method7403();
	}
}
