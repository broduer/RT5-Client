import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class302 {

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	private volatile int anInt7701;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!bl;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!fla;")
	private final Class130 aClass130_10 = new Class130();

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class302(@OriginalArg(0) String arg0) {
		this.aString97 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ru;B)V")
	public void method4793(@OriginalArg(0) Class8_Sub9 arg0) {
		@Pc(2) Class130 local2 = this.aClass130_10;
		synchronized (this.aClass130_10) {
			this.aClass130_10.method1902(arg0);
			this.anInt7701++;
		}
		if (this.aClass46_1 != null) {
			@Pc(31) Class46 local31 = this.aClass46_1;
			synchronized (this.aClass46_1) {
				this.aClass46_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lclient!ep;")
	public Class8 method4795() {
		@Pc(14) Class130 local14 = this.aClass130_10;
		synchronized (this.aClass130_10) {
			@Pc(21) Class8 local21 = this.aClass130_10.method1905();
			local21.a();
			this.anInt7701--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!eo;B)V")
	public void method4797(@OriginalArg(0) Class8_Sub2 arg0) {
		arg0.aBoolean812 = true;
		@Pc(18) Class130 local18 = this.aClass130_10;
		synchronized (this.aClass130_10) {
			this.aClass130_10.method1902(arg0);
			this.anInt7701++;
		}
		if (this.aClass46_1 != null) {
			@Pc(43) Class46 local43 = this.aClass46_1;
			synchronized (this.aClass46_1) {
				this.aClass46_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	public boolean method4798() {
		return this.anInt7701 == 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!bl;)V")
	public void method4799(@OriginalArg(1) Class46 arg0) {
		this.aClass46_1 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!eo;I)V")
	public void method4800(@OriginalArg(0) Class8_Sub2 arg0) {
		arg0.aBoolean812 = false;
		@Pc(9) Class130 local9 = this.aClass130_10;
		synchronized (this.aClass130_10) {
			this.aClass130_10.method1902(arg0);
			this.anInt7701++;
		}
		if (this.aClass46_1 != null) {
			@Pc(39) Class46 local39 = this.aClass46_1;
			synchronized (this.aClass46_1) {
				this.aClass46_1.notify();
			}
		}
	}
}
