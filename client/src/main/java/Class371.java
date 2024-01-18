import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public final class Class371 {

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lclient!mg;")
	public Interface16 anInterface16_16;

	@OriginalMember(owner = "client!ufa", name = "f", descriptor = "Z")
	public boolean aBoolean736;

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "Lclient!mg;")
	public Interface16 anInterface16_17;

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "Z")
	public boolean aBoolean735;

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Z)V")
	public Class371(@OriginalArg(0) boolean arg0) {
		this.aBoolean735 = arg0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	public void method6000() {
		if (this.anInterface16_16 != null) {
			this.anInterface16_16.method6082();
		}
		this.aBoolean736 = false;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)Z")
	public boolean method6002() {
		return this.aBoolean736 && !this.aBoolean735;
	}
}
