import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class304 {

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	private volatile int anInt7724;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Lclient!bl;")
	private Class46 aClass46_1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!fla;")
	private final Class130 aClass130_10 = new Class130();

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class304(@OriginalArg(0) String arg0) {
		this.aString97 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ru;B)V")
	public void method6812(@OriginalArg(0) Class8_Sub9 arg0) {
		synchronized (this.aClass130_10) {
			this.aClass130_10.method2787(arg0);
			this.anInt7724++;
		}
		if (this.aClass46_1 != null) {
			synchronized (this.aClass46_1) {
				this.aClass46_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Lclient!ep;")
	public Class8 method6814() {
		synchronized (this.aClass130_10) {
			@Pc(21) Class8 local21 = this.aClass130_10.method2790();
			local21.method9281();
			this.anInt7724--;
			return local21;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!eo;B)V")
	public void method6816(@OriginalArg(0) Class8_Sub2 arg0) {
		arg0.aBoolean813 = true;
		synchronized (this.aClass130_10) {
			this.aClass130_10.method2787(arg0);
			this.anInt7724++;
		}
		if (this.aClass46_1 != null) {
			synchronized (this.aClass46_1) {
				this.aClass46_1.notify();
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	public boolean method6817() {
		return this.anInt7724 == 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!bl;)V")
	public void method6818(@OriginalArg(1) Class46 arg0) {
		this.aClass46_1 = arg0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!eo;I)V")
	public void method6819(@OriginalArg(0) Class8_Sub2 arg0) {
		arg0.aBoolean813 = false;
		synchronized (this.aClass130_10) {
			this.aClass130_10.method2787(arg0);
			this.anInt7724++;
		}
		if (this.aClass46_1 != null) {
			synchronized (this.aClass46_1) {
				this.aClass46_1.notify();
			}
		}
	}
}
