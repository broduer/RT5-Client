import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class96 {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!dla;")
	private final Class82 aClass82_55 = new Class82(64);

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public int anInt2518 = 0;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!sb;")
	private final Class332 aClass332_23;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public final int anInt2515;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class96(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_23 = arg2;
		this.anInt2515 = this.aClass332_23.method7615(4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method2349() {
		@Pc(2) Class82 local2 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2157();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method2351() {
		@Pc(9) Class82 local9 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2151();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lclient!re;")
	public Class320 method2352(@OriginalArg(0) int arg0) {
		@Pc(15) Class82 local15 = this.aClass82_55;
		@Pc(25) Class320 local25;
		synchronized (this.aClass82_55) {
			local25 = (Class320) this.aClass82_55.method2156(arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class332 local39 = this.aClass332_23;
		@Pc(48) byte[] local48;
		synchronized (this.aClass332_23) {
			local48 = this.aClass332_23.method7602(arg0, 4);
		}
		local25 = new Class320();
		local25.aClass96_5 = this;
		local25.anInt8276 = arg0;
		if (local48 != null) {
			local25.method7263(new Class2_Sub21(local48));
		}
		local25.method7261();
		@Pc(81) Class82 local81 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2150(local25, arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method2355() {
		@Pc(2) Class82 local2 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2147(5);
		}
	}
}
