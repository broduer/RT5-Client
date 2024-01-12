import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class Class50 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!dla;")
	private final Class82 aClass82_22 = new Class82(64);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!dla;")
	private final Class82 aClass82_23 = new Class82(100);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!sb;")
	private final Class332 aClass332_11;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;Lclient!sb;)V")
	public Class50(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) Class332 arg3, @OriginalArg(4) Class332 arg4) {
		this.aClass332_11 = arg2;
		if (this.aClass332_11 != null) {
			@Pc(26) int local26 = this.aClass332_11.method7604() - 1;
			this.aClass332_11.method7615(local26);
		}
		Static642.method8447(arg4, arg3);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)Lclient!cka;")
	public Class69 method1162(@OriginalArg(0) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_22;
		@Pc(16) Class69 local16;
		synchronized (this.aClass82_22) {
			local16 = (Class69) this.aClass82_22.method2156((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_11;
		@Pc(43) byte[] local43;
		synchronized (this.aClass332_11) {
			local43 = this.aClass332_11.method7602(Static668.method8709(arg0), Static291.method4233(arg0));
		}
		local16 = new Class69();
		local16.anInt1657 = arg0;
		if (local43 != null) {
			local16.method1585(new Class2_Sub21(local43));
		}
		local16.method1584();
		@Pc(73) Class82 local73 = this.aClass82_22;
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2150(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public void method1163() {
		@Pc(6) Class82 local6 = this.aClass82_22;
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2147(5);
		}
		local6 = this.aClass82_23;
		synchronized (this.aClass82_23) {
			this.aClass82_23.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method1164() {
		@Pc(2) Class82 local2 = this.aClass82_22;
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2151();
		}
		local2 = this.aClass82_23;
		synchronized (this.aClass82_23) {
			this.aClass82_23.method2151();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void method1165() {
		@Pc(7) Class82 local7 = this.aClass82_22;
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2157();
		}
		local7 = this.aClass82_23;
		synchronized (this.aClass82_23) {
			this.aClass82_23.method2157();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)Lclient!rw;")
	public Class2_Sub2_Sub18 method1166(@OriginalArg(0) int arg0) {
		@Pc(12) Class82 local12 = this.aClass82_23;
		synchronized (this.aClass82_23) {
			@Pc(22) Class2_Sub2_Sub18 local22 = (Class2_Sub2_Sub18) this.aClass82_23.method2156((long) arg0);
			if (local22 == null) {
				local22 = new Class2_Sub2_Sub18(arg0);
				this.aClass82_23.method2150(local22, (long) arg0);
			}
			return local22.method7572() ? local22 : null;
		}
	}
}
