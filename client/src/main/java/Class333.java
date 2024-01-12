import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sba")
public final class Class333 {

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "Lclient!av;")
	private final Class28 aClass28_41;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "Lclient!ie;")
	private Class2 aClass2_266;

	@OriginalMember(owner = "client!sba", name = "k", descriptor = "I")
	private int anInt8603 = 0;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lclient!av;)V")
	public Class333(@OriginalArg(0) Class28 arg0) {
		this.aClass28_41 = arg0;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)Lclient!ie;")
	public Class2 method7617() {
		@Pc(23) Class2 local23;
		if (this.anInt8603 > 0 && this.aClass28_41.aClass2Array1[this.anInt8603 - 1] != this.aClass2_266) {
			local23 = this.aClass2_266;
			this.aClass2_266 = local23.aClass2_346;
			return local23;
		}
		while (this.aClass28_41.anInt640 > this.anInt8603) {
			local23 = this.aClass28_41.aClass2Array1[this.anInt8603++].aClass2_346;
			if (this.aClass28_41.aClass2Array1[this.anInt8603 - 1] != local23) {
				this.aClass2_266 = local23.aClass2_346;
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(Z)Lclient!ie;")
	public Class2 method7620() {
		this.anInt8603 = 0;
		return this.method7617();
	}
}
