import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class362 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public final int anInt9503;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public int anInt9504;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[I")
	public final int[] anIntArray738;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[I")
	public final int[] anIntArray739;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class362() {
		Static650.method8507(16);
		this.anInt9503 = Static650.method8516() == 0 ? 1 : Static650.method8507(4) + 1;
		if (Static650.method8516() != 0) {
			Static650.method8507(8);
		}
		Static650.method8507(2);
		if (this.anInt9503 > 1) {
			this.anInt9504 = Static650.method8507(4);
		}
		this.anIntArray738 = new int[this.anInt9503];
		this.anIntArray739 = new int[this.anInt9503];
		for (@Pc(42) int local42 = 0; local42 < this.anInt9503; local42++) {
			Static650.method8507(8);
			this.anIntArray738[local42] = Static650.method8507(8);
			this.anIntArray739[local42] = Static650.method8507(8);
		}
	}
}
