import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
	public int anInt1541;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString10;

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "Lclient!jga;")
	public final Class194 aClass194_3;

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) String arg0) {
		this.aString10 = arg0;
		this.aClass194_3 = new Class194();
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "(B)I")
	public int method1468() {
		return this.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66 == this.aClass194_3.aClass2_Sub2_36 ? -1 : ((Class2_Sub2_Sub16) this.aClass194_3.aClass2_Sub2_36.aClass2_Sub2_66).anInt7335;
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(ILclient!pg;)Z")
	public boolean method1469(@OriginalArg(1) Class2_Sub2_Sub16 arg0) {
		@Pc(15) int local15 = this.method1468();
		arg0.method9267();
		this.anInt1541--;
		if (this.anInt1541 != 0) {
			return local15 != this.method1468();
		}
		this.method9464();
		this.method9267();
		Static31.anInt770--;
		Static717.aClass82_232.method2150(this, arg0.aLong234);
		return false;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!pg;)Z")
	public boolean method1471(@OriginalArg(1) Class2_Sub2_Sub16 arg0) {
		@Pc(5) boolean local5 = true;
		arg0.method9267();
		@Pc(21) Class2_Sub2_Sub16 local21 = (Class2_Sub2_Sub16) this.aClass194_3.method4359();
		while (local21 != null) {
			if (Static546.method7257(arg0.anInt7335, local21.anInt7335)) {
				Static145.method2408(arg0, local21);
				this.anInt1541++;
				if (local5) {
					return false;
				}
				return true;
			}
			local21 = (Class2_Sub2_Sub16) this.aClass194_3.method4357();
			local5 = false;
		}
		this.aClass194_3.method4355(arg0);
		this.anInt1541++;
		return local5;
	}
}
