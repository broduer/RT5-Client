import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
	public int anInt6399;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub38(@OriginalArg(0) int arg0) {
		this.anInt6399 = arg0;
	}
}
