import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public final class Class380 {

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	public int anInt9770;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public int anInt9771;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "I")
	public int anInt9772;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public int anInt9773;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class380() {
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!um;)V")
	public Class380(@OriginalArg(0) Class380 arg0) {
		this.anInt9772 = arg0.anInt9772;
		this.anInt9773 = arg0.anInt9773;
		this.anInt9771 = arg0.anInt9771;
		this.anInt9770 = arg0.anInt9770;
	}
}
