import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class Class299 {

	@OriginalMember(owner = "client!wha", name = "m", descriptor = "I")
	public int anInt7584;

	@OriginalMember(owner = "client!wha", name = "i", descriptor = "I")
	public int anInt7586;

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "I")
	public int anInt7587;

	@OriginalMember(owner = "client!wha", name = "a", descriptor = "(Z)Z")
	public final boolean method6713() {
		return (this.anInt7586 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)Z")
	public final boolean method6715() {
		return (this.anInt7586 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)Z")
	public final boolean method6716() {
		return (this.anInt7586 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wha", name = "b", descriptor = "(Z)Z")
	public final boolean method6719() {
		return (this.anInt7586 & 0x8) != 0;
	}
}
