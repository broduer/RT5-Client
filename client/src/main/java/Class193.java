import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class193 {

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!sia;")
	private Class341 aClass341_27;

	@OriginalMember(owner = "client!jg", name = "j", descriptor = "Lclient!ie;")
	private Node aClass2_149;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class193() {
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lclient!sia;)V")
	public Class193(@OriginalArg(0) Class341 arg0) {
		this.aClass341_27 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lclient!ie;")
	public Node method4349() {
		@Pc(12) Node local12 = this.aClass2_149;
		if (this.aClass341_27.aClass2_271 == local12) {
			this.aClass2_149 = null;
			return null;
		} else {
			this.aClass2_149 = local12.next;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lclient!ie;")
	public Node method4350() {
		@Pc(8) Node local8 = this.aClass341_27.aClass2_271.next;
		if (this.aClass341_27.aClass2_271 == local8) {
			this.aClass2_149 = null;
			return null;
		} else {
			this.aClass2_149 = local8.next;
			return local8;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!sia;I)V")
	public void method4351(@OriginalArg(0) Class341 arg0) {
		this.aClass341_27 = arg0;
	}
}
