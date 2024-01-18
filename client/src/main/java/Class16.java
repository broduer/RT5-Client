import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class Class16 {

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "Lclient!jga;")
	private final Class194 aClass194_1 = new Class194();

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "I")
	private final int anInt246;

	@OriginalMember(owner = "client!aka", name = "i", descriptor = "I")
	private int anInt250;

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "Lclient!av;")
	private final Class28 aClass28_3;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		this.anInt246 = arg0;
		this.anInt250 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass28_3 = new Class28(local16);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ILclient!uq;)V")
	private void method251(@OriginalArg(1) Interface24 arg0) {
		@Pc(9) long local9 = arg0.method7440();
		for (@Pc(22) Class2_Sub2_Sub11 local22 = (Class2_Sub2_Sub11) this.aClass28_3.method738(local9); local22 != null; local22 = (Class2_Sub2_Sub11) this.aClass28_3.method744()) {
			if (local22.anInterface24_3.method7439(arg0)) {
				this.method254(local22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Z)V")
	public void method252() {
		this.aClass194_1.method4358();
		this.aClass28_3.method737();
		this.anInt250 = this.anInt246;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V")
	public void method253() {
		for (@Pc(5) Class2_Sub2_Sub11 local5 = (Class2_Sub2_Sub11) this.aClass194_1.method4359(); local5 != null; local5 = (Class2_Sub2_Sub11) this.aClass194_1.method4357()) {
			if (local5.method8321()) {
				local5.unlink();
				local5.method9267();
				this.anInt250 += local5.anInt9471;
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZLclient!pv;)V")
	private void method254(@OriginalArg(1) Class2_Sub2_Sub11 arg0) {
		if (arg0 != null) {
			arg0.unlink();
			arg0.method9267();
			this.anInt250 += arg0.anInt9471;
		}
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZI)V")
	public void method255() {
		if (Static515.aClass22_1 == null) {
			return;
		}
		for (@Pc(11) Class2_Sub2_Sub11 local11 = (Class2_Sub2_Sub11) this.aClass194_1.method4359(); local11 != null; local11 = (Class2_Sub2_Sub11) this.aClass194_1.method4357()) {
			if (local11.method8321()) {
				if (local11.method8318() == null) {
					local11.unlink();
					local11.method9267();
					this.anInt250 += local11.anInt9471;
				}
			} else if (++local11.aLong325 > (long) 5) {
				@Pc(38) Class2_Sub2_Sub11 local38 = Static515.aClass22_1.method593(local11);
				this.aClass28_3.method735(local11.key, local38);
				Static409.method5661(local11, local38);
				local11.unlink();
				local11.method9267();
			}
		}
	}

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(I)I")
	public int method256() {
		return this.anInt246;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)I")
	public int method257() {
		return this.anInt250;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(ZILjava/lang/Object;Lclient!uq;)V")
	private void method259(@OriginalArg(2) Object arg0, @OriginalArg(3) Interface24 arg1) {
		if (this.anInt246 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method251(arg1);
		this.anInt250--;
		while (this.anInt250 < 0) {
			@Pc(42) Class2_Sub2_Sub11 local42 = (Class2_Sub2_Sub11) this.aClass194_1.method4353();
			this.method254(local42);
		}
		@Pc(59) Class2_Sub2_Sub11_Sub2 local59 = new Class2_Sub2_Sub11_Sub2(arg1, arg0, 1);
		this.aClass28_3.method735(arg1.method7440(), local59);
		this.aClass194_1.method4355(local59);
		local59.aLong325 = 0L;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Lclient!uq;B)Ljava/lang/Object;")
	public Object method260(@OriginalArg(0) Interface24 arg0) {
		@Pc(18) long local18 = arg0.method7440();
		for (@Pc(25) Class2_Sub2_Sub11 local25 = (Class2_Sub2_Sub11) this.aClass28_3.method738(local18); local25 != null; local25 = (Class2_Sub2_Sub11) this.aClass28_3.method744()) {
			if (local25.anInterface24_3.method7439(arg0)) {
				@Pc(39) Object local39 = local25.method8318();
				if (local39 != null) {
					if (local25.method8321()) {
						@Pc(84) Class2_Sub2_Sub11_Sub2 local84 = new Class2_Sub2_Sub11_Sub2(arg0, local39, local25.anInt9471);
						this.aClass28_3.method735(local25.key, local84);
						this.aClass194_1.method4355(local84);
						local84.aLong325 = 0L;
						local25.unlink();
						local25.method9267();
					} else {
						this.aClass194_1.method4355(local25);
						local25.aLong325 = 0L;
					}
					return local39;
				}
				local25.unlink();
				local25.method9267();
				this.anInt250 += local25.anInt9471;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(Ljava/lang/Object;ILclient!uq;)V")
	public void method261(@OriginalArg(0) Object arg0, @OriginalArg(2) Interface24 arg1) {
		this.method259(arg0, arg1);
	}
}
