import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class Class2 {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "J")
	public long aLong328;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!ie;")
	public Class2 aClass2_345;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!ie;")
	public Class2 aClass2_346;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
	public final void a(@OriginalArg(0) byte arg0) {
		if (this.aClass2_345 != null) {
			this.aClass2_345.aClass2_346 = this.aClass2_346;
			this.aClass2_346.aClass2_345 = this.aClass2_345;
			this.aClass2_346 = null;
			this.aClass2_345 = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)Z")
	public final boolean e(@OriginalArg(0) int arg0) {
		return this.aClass2_345 != null;
	}
}
