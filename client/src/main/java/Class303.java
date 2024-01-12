import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public final class Class303 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public int anInt7704;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public int anInt7705;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
	public int anInt7706;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
	public Class303() {
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!qd;)V")
	public Class303(@OriginalArg(0) Class303 arg0) {
		this.anInt7705 = arg0.anInt7705;
		this.anInt7706 = arg0.anInt7706;
		this.anInt7704 = arg0.anInt7704;
	}
}
