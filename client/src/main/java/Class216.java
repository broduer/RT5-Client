import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class216 {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "Lclient!dla;")
	private final Class82 aClass82_114 = new Class82(256);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!sb;")
	private final Class332 aClass332_70;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public Class216(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2) {
		this.aClass332_70 = arg2;
		this.aClass332_70.method7615(26);
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(Z)V")
	public void method5042() {
		@Pc(2) Class82 local2 = this.aClass82_114;
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2157();
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)V")
	public void method5044() {
		@Pc(10) Class82 local10 = this.aClass82_114;
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2147(5);
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)Lclient!ab;")
	public Class2_Sub2_Sub1 method5045(@OriginalArg(1) int arg0) {
		@Pc(6) Class82 local6 = this.aClass82_114;
		@Pc(16) Class2_Sub2_Sub1 local16;
		synchronized (this.aClass82_114) {
			local16 = (Class2_Sub2_Sub1) this.aClass82_114.method2156(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class332 local30 = this.aClass332_70;
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_70) {
			local39 = this.aClass332_70.method7602(arg0, 26);
		}
		local16 = new Class2_Sub2_Sub1();
		if (local39 != null) {
			local16.method90(new Packet(local39));
		}
		@Pc(71) Class82 local71 = this.aClass82_114;
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2150(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public void method5047() {
		@Pc(2) Class82 local2 = this.aClass82_114;
		synchronized (this.aClass82_114) {
			this.aClass82_114.method2151();
		}
	}
}
