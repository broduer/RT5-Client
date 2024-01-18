import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class296 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public int anInt7509;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "C")
	private char aChar6;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Ljava/lang/String;")
	public String aString89;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "Z")
	public boolean aBoolean570 = true;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(B)Z")
	public boolean method4689() {
		return this.aChar6 == 's';
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method4690(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5205();
			if (local3 == 0) {
				return;
			}
			this.method4691(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IILclient!ge;)V")
	private void method4691(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub21 arg1) {
		if (arg0 == 1) {
			this.aChar6 = Static346.method3566(arg1.method5186());
		} else if (arg0 == 2) {
			this.anInt7509 = arg1.method5158();
		} else if (arg0 == 4) {
			this.aBoolean570 = false;
		} else if (arg0 == 5) {
			this.aString89 = arg1.method5167();
		}
	}
}
