import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class363 {

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "[I")
	public static final int[] anIntArray740 = new int[16384];

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
	public static final int[] anIntArray741 = new int[16384];

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!cm;")
	private Class2_Sub2 aClass2_Sub2_57 = new Class2_Sub2();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!jga;")
	private final Class194 aClass194_15 = new Class194();

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private int anInt9509;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	private final int anInt9510;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Lclient!av;")
	private final Class28 aClass28_42;

	static {
		@Pc(63) double local63 = 3.834951969714103E-4D;
		for (@Pc(65) int local65 = 0; local65 < 16384; local65++) {
			anIntArray741[local65] = (int) (Math.sin((double) local65 * local63) * 16384.0D);
			anIntArray740[local65] = (int) (Math.cos(local63 * (double) local65) * 16384.0D);
		}
	}

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	public Class363(@OriginalArg(0) int arg0) {
		this.anInt9509 = arg0;
		this.anInt9510 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass28_42 = new Class28(local19);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!cm;J)V")
	public void method8348(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt9509 == 0) {
			@Pc(19) Class2_Sub2 local19 = this.aClass194_15.method4353();
			local19.unlink();
			local19.method9267();
			if (this.aClass2_Sub2_57 == local19) {
				local19 = this.aClass194_15.method4353();
				local19.unlink();
				local19.method9267();
			}
		} else {
			this.anInt9509--;
		}
		this.aClass28_42.method735(arg1, arg0);
		this.aClass194_15.method4355(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)Lclient!cm;")
	public Class2_Sub2 method8349(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass28_42.method738(arg0);
		if (local16 != null) {
			this.aClass194_15.method4355(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)V")
	public void method8351(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub2 local18 = (Class2_Sub2) this.aClass28_42.method738(arg0);
		if (local18 != null) {
			local18.unlink();
			local18.method9267();
			this.anInt9509++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void method8352() {
		this.aClass194_15.method4358();
		this.aClass28_42.method737();
		this.aClass2_Sub2_57 = new Class2_Sub2();
		this.anInt9509 = this.anInt9510;
	}
}
