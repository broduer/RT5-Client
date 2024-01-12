import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class310 {

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public int anInt8111;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "Lclient!dla;")
	private final Class82 aClass82_169 = new Class82(64);

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!dla;")
	public final Class82 aClass82_170 = new Class82(50);

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!dla;")
	public final Class82 aClass82_171 = new Class82(5);

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!sb;")
	public final Class332 aClass332_102;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!sb;")
	private final Class332 aClass332_101;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	private final int anInt8109;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!ul;")
	public final Class379 aClass379_6;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!ul;IZLclient!sb;Lclient!sb;)V")
	public Class310(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class332 arg3, @OriginalArg(4) Class332 arg4) {
		this.aClass332_102 = arg4;
		this.aClass332_101 = arg3;
		this.aBoolean622 = arg2;
		this.anInt8109 = arg1;
		this.aClass379_6 = arg0;
		if (this.aClass332_101 != null) {
			@Pc(44) int local44 = this.aClass332_101.method7604() - 1;
			this.aClass332_101.method7615(local44);
		}
		if (Static673.aClass379_8 == this.aClass379_6) {
			this.aStringArray39 = new String[] { null, null, null, null, null, Static32.aClass32_22.method877(this.anInt8109) };
		} else {
			this.aStringArray39 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public void method7092() {
		@Pc(2) Class82 local2 = this.aClass82_169;
		synchronized (this.aClass82_169) {
			this.aClass82_169.method2147(5);
		}
		local2 = this.aClass82_170;
		synchronized (this.aClass82_170) {
			this.aClass82_170.method2147(5);
		}
		local2 = this.aClass82_171;
		synchronized (this.aClass82_171) {
			this.aClass82_171.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public void method7093() {
		@Pc(2) Class82 local2 = this.aClass82_169;
		synchronized (this.aClass82_169) {
			this.aClass82_169.method2157();
		}
		local2 = this.aClass82_170;
		synchronized (this.aClass82_170) {
			this.aClass82_170.method2157();
		}
		local2 = this.aClass82_171;
		synchronized (this.aClass82_171) {
			this.aClass82_171.method2157();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method7096() {
		@Pc(2) Class82 local2 = this.aClass82_169;
		synchronized (this.aClass82_169) {
			this.aClass82_169.method2151();
		}
		local2 = this.aClass82_170;
		synchronized (this.aClass82_170) {
			this.aClass82_170.method2151();
		}
		local2 = this.aClass82_171;
		synchronized (this.aClass82_171) {
			this.aClass82_171.method2151();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BZ)V")
	public void method7097(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean622) {
			this.aBoolean622 = arg0;
			this.method7093();
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	public void method7098() {
		@Pc(2) Class82 local2 = this.aClass82_170;
		synchronized (this.aClass82_170) {
			this.aClass82_170.method2157();
		}
		local2 = this.aClass82_171;
		synchronized (this.aClass82_171) {
			this.aClass82_171.method2157();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)Lclient!o;")
	public Class270 method7099(@OriginalArg(0) int arg0) {
		@Pc(14) Class82 local14 = this.aClass82_169;
		@Pc(24) Class270 local24;
		synchronized (this.aClass82_169) {
			local24 = (Class270) this.aClass82_169.method2156((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(38) Class332 local38 = this.aClass332_101;
		@Pc(51) byte[] local51;
		synchronized (this.aClass332_101) {
			local51 = this.aClass332_101.method7602(Static612.method8244(arg0), Static713.method9343(arg0));
		}
		local24 = new Class270();
		local24.aClass310_1 = this;
		local24.anInt6764 = arg0;
		local24.aStringArray34 = (String[]) this.aStringArray39.clone();
		if (local51 != null) {
			local24.method5993(new Class2_Sub21(local51));
		}
		local24.method5990();
		@Pc(90) Class82 local90 = this.aClass82_169;
		synchronized (this.aClass82_169) {
			this.aClass82_169.method2150(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public void method7100(@OriginalArg(1) int arg0) {
		this.anInt8111 = arg0;
		@Pc(9) Class82 local9 = this.aClass82_170;
		synchronized (this.aClass82_170) {
			this.aClass82_170.method2157();
		}
		local9 = this.aClass82_171;
		synchronized (this.aClass82_171) {
			this.aClass82_171.method2157();
		}
	}
}
