import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public final class Class361 {

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!ri;")
	public Interface20 anInterface20_7;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Z")
	public boolean aBoolean730;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "Lclient!ri;")
	public Interface20 anInterface20_8;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Z")
	public boolean aBoolean729;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Z)V")
	public Class361(@OriginalArg(0) boolean arg0) {
		this.aBoolean729 = arg0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method8346() {
		if (this.anInterface20_7 != null) {
			this.anInterface20_7.method8545();
		}
		this.aBoolean730 = false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Z")
	public boolean method8347() {
		return this.aBoolean730 && !this.aBoolean729;
	}
}
