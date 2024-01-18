import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class142 {

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "Lclient!dla;")
	private Class82 aClass82_73 = new Class82(64);

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "Lclient!dla;")
	public final Class82 aClass82_74 = new Class82(500);

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "Lclient!dla;")
	public final Class82 aClass82_75 = new Class82(30);

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "Lclient!dla;")
	public final Class82 aClass82_76 = new Class82(50);

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "Lclient!sb;")
	public final Class330 aClass330_44;

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "Lclient!ul;")
	private final Class377 aClass377_2;

	@OriginalMember(owner = "client!gea", name = "h", descriptor = "I")
	private final int anInt3383;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "Lclient!sb;")
	private final Class330 aClass330_43;

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "Z")
	public boolean aBoolean267;

	@OriginalMember(owner = "client!gea", name = "i", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!ul;IZLclient!sb;Lclient!sb;)V")
	public Class142(@OriginalArg(0) Class377 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class330 arg3, @OriginalArg(4) Class330 arg4) {
		this.aClass330_44 = arg4;
		this.aClass377_2 = arg0;
		this.anInt3383 = arg1;
		this.aClass330_43 = arg3;
		this.aBoolean267 = arg2;
		if (this.aClass330_43 != null) {
			@Pc(53) int local53 = this.aClass330_43.method5361() - 1;
			this.aClass330_43.method5372(local53);
		}
		if (Static673.aClass377_8 == this.aClass377_2) {
			this.aStringArray15 = new String[] { null, null, null, null, null, Static32.aClass32_22.method429(this.anInt3383) };
		} else {
			this.aStringArray15 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	public void method2153() {
		@Pc(2) Class82 local2 = this.aClass82_73;
		synchronized (this.aClass82_73) {
			this.aClass82_73.method1385();
		}
		local2 = this.aClass82_74;
		synchronized (this.aClass82_74) {
			this.aClass82_74.method1385();
		}
		local2 = this.aClass82_75;
		synchronized (this.aClass82_75) {
			this.aClass82_75.method1385();
		}
		local2 = this.aClass82_76;
		synchronized (this.aClass82_76) {
			this.aClass82_76.method1385();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V")
	public void method2154(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean267) {
			this.aBoolean267 = arg0;
			this.method2155();
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public void method2155() {
		@Pc(14) Class82 local14 = this.aClass82_73;
		synchronized (this.aClass82_73) {
			this.aClass82_73.method1391();
		}
		local14 = this.aClass82_74;
		synchronized (this.aClass82_74) {
			this.aClass82_74.method1391();
		}
		local14 = this.aClass82_75;
		synchronized (this.aClass82_75) {
			this.aClass82_75.method1391();
		}
		local14 = this.aClass82_76;
		synchronized (this.aClass82_76) {
			this.aClass82_76.method1391();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)V")
	public void method2156(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean266) {
			this.aBoolean266 = arg0;
			this.method2155();
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)V")
	public void method2157(@OriginalArg(1) int arg0) {
		this.aClass82_73 = new Class82(arg0);
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "(II)Lclient!c;")
	public Class54 method2158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 29) {
			return null;
		}
		@Pc(12) Class82 local12 = this.aClass82_73;
		@Pc(22) Class54 local22;
		synchronized (this.aClass82_73) {
			local22 = (Class54) this.aClass82_73.method1390((long) arg0);
		}
		if (local22 != null) {
			return local22;
		}
		@Pc(36) Class330 local36 = this.aClass330_43;
		@Pc(49) byte[] local49;
		synchronized (this.aClass330_43) {
			local49 = this.aClass330_43.method5359(Static570.method5320(arg0), Static705.method6626(arg0));
		}
		local22 = new Class54();
		local22.anInt1256 = arg0;
		local22.aClass142_2 = this;
		local22.aStringArray6 = (String[]) this.aStringArray15.clone();
		if (local49 != null) {
			local22.method805(new Class2_Sub21(local49));
		}
		local22.method806();
		if (local22.aBoolean97) {
			local22.anInt1242 = 0;
			local22.aBoolean99 = false;
		}
		if (!this.aBoolean267 && local22.aBoolean95) {
			local22.aStringArray6 = null;
			local22.anIntArray112 = null;
		}
		@Pc(115) Class82 local115 = this.aClass82_73;
		synchronized (this.aClass82_73) {
			this.aClass82_73.method1384(local22, (long) arg0);
			return local22;
		}
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(II)V")
	public void method2159() {
		@Pc(11) Class82 local11 = this.aClass82_73;
		synchronized (this.aClass82_73) {
			this.aClass82_73.method1381(5);
		}
		local11 = this.aClass82_74;
		synchronized (this.aClass82_74) {
			this.aClass82_74.method1381(5);
		}
		local11 = this.aClass82_75;
		synchronized (this.aClass82_75) {
			this.aClass82_75.method1381(5);
		}
		local11 = this.aClass82_76;
		synchronized (this.aClass82_76) {
			this.aClass82_76.method1381(5);
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(II)V")
	public void method2160(@OriginalArg(0) int arg0) {
		this.anInt3390 = arg0;
		@Pc(9) Class82 local9 = this.aClass82_74;
		synchronized (this.aClass82_74) {
			this.aClass82_74.method1391();
		}
		local9 = this.aClass82_75;
		synchronized (this.aClass82_75) {
			this.aClass82_75.method1391();
		}
		local9 = this.aClass82_76;
		synchronized (this.aClass82_76) {
			this.aClass82_76.method1391();
		}
	}
}
