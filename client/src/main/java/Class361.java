import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class361 {

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "[I")
	public static final int[] anIntArray740 = new int[16384];

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
	public static final int[] anIntArray741 = new int[16384];

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "Lclient!cm;")
	private Class2_Sub2 aClass2_Sub2_57 = new Class2_Sub2();

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!jga;")
	private final Class192 aClass192_15 = new Class192();

	@OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
	private int anInt9483;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
	private final int anInt9484;

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
	public Class361(@OriginalArg(0) int arg0) {
		this.anInt9483 = arg0;
		this.anInt9484 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass28_42 = new Class28(local19);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!cm;J)V")
	public void method5905(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt9483 == 0) {
			@Pc(19) Class2_Sub2 local19 = this.aClass192_15.method3011();
			local19.a((byte) 118);
			local19.method6674();
			if (this.aClass2_Sub2_57 == local19) {
				local19 = this.aClass192_15.method3011();
				local19.a((byte) 66);
				local19.method6674();
			}
		} else {
			this.anInt9483--;
		}
		this.aClass28_42.method370(arg1, arg0);
		this.aClass192_15.method3013(arg0);
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)Lclient!cm;")
	public Class2_Sub2 method5906(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass28_42.method373(arg0);
		if (local16 != null) {
			this.aClass192_15.method3013(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)V")
	public void method5908(@OriginalArg(1) long arg0) {
		@Pc(18) Class2_Sub2 local18 = (Class2_Sub2) this.aClass28_42.method373(arg0);
		if (local18 != null) {
			local18.a((byte) 37);
			local18.method6674();
			this.anInt9483++;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
	public void method5909() {
		this.aClass192_15.method3016();
		this.aClass28_42.method372();
		this.aClass2_Sub2_57 = new Class2_Sub2();
		this.anInt9483 = this.anInt9484;
	}
}
