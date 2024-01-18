import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class CursorTypeList {

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_142 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!nv", name = "g", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aClass82_143 = new SoftLruHashTable(2);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!sb;")
	public final Js5 aClass332_88;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aClass332_89;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public CursorTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass332_88 = arg3;
		this.aClass332_89 = arg2;
		this.aClass332_89.getGroupCapacity(33);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)V")
	public void method5977() {
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2147(5);
		}
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2147(5);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
	public void method5979() {
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2151();
		}
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2151();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)Lclient!vla;")
	public CursorType method5980(@OriginalArg(1) int arg0) {
		@Pc(18) CursorType local18;
		synchronized (this.aClass82_142) {
			local18 = (CursorType) this.aClass82_142.get(arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41;
		synchronized (this.aClass332_89) {
			local41 = this.aClass332_89.fetchFile(arg0, 33);
		}
		local18 = new CursorType();
		local18.aClass269_2 = this;
		if (local41 != null) {
			local18.method8942(new Buffer(local41));
		}
		synchronized (this.aClass82_142) {
			this.aClass82_142.put(local18, arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
	public void method5981() {
		synchronized (this.aClass82_142) {
			this.aClass82_142.method2157();
		}
		synchronized (this.aClass82_143) {
			this.aClass82_143.method2157();
		}
	}
}
