import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class356 implements Interface22 {

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "Lclient!ha;")
	private Class19 aClass19_14;

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "Z")
	private boolean aBoolean721;

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "Lclient!de;")
	private final Class76 aClass76_1;

	@OriginalMember(owner = "client!tha", name = "k", descriptor = "[Lclient!jd;")
	private final Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lclient!de;Lclient!we;)V")
	public Class356(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class400 arg1) {
		this.aClass76_1 = arg0;
		this.anInterface13Array1 = new Interface13[this.aClass76_1.anInterface10Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface13Array1.length; local15++) {
			this.anInterface13Array1[local15] = arg1.method9175(this.aClass76_1.anInterface10Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method8470(@OriginalArg(1) long arg0) {
		return Static588.currentTimeMillis() >= (long) this.aClass76_1.anInt2149 + arg0;
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)I")
	@Override
	public int method8469() {
		return this.aClass76_1.anInt2150;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)V")
	@Override
	public void method8471() {
		if (this.aClass19_14 != Static163.aClass19_17) {
			this.aClass19_14 = Static163.aClass19_17;
			this.aBoolean721 = true;
		}
		this.aClass19_14.GA(0);
		@Pc(29) Interface13[] local29 = this.anInterface13Array1;
		for (@Pc(31) int local31 = 0; local31 < local29.length; local31++) {
			@Pc(37) Interface13 local37 = local29[local31];
			if (local37 != null) {
				local37.method7755();
			}
		}
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)I")
	@Override
	public int method8467() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface13[] local10 = this.anInterface13Array1;
		for (@Pc(20) int local20 = 0; local20 < local10.length; local20++) {
			@Pc(26) Interface13 local26 = local10[local20];
			if (local26 == null || local26.method7754()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface13Array1.length;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8472(@OriginalArg(0) boolean arg0) {
		@Pc(10) Interface13[] local10 = this.anInterface13Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface13 local18 = local10[local12];
			if (local18 != null) {
				local18.method7756();
			}
		}
		this.aBoolean721 = false;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)V")
	@Override
	public void method8468() {
	}
}
