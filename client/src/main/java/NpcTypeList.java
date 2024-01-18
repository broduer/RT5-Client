import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class NpcTypeList {

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "I")
	public int anInt8111;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "Lclient!dla;")
	private final SoftLruHashTable types = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "Lclient!dla;")
	public final SoftLruHashTable bodyModels = new SoftLruHashTable(50);

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!dla;")
	public final SoftLruHashTable headModels = new SoftLruHashTable(5);

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Lclient!sb;")
	public final Js5 aClass332_102;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "Lclient!sb;")
	private final Js5 aClass332_101;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	private final int anInt8109;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!ul;")
	public final ModeGame aClass379_6;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!ul;IZLclient!sb;Lclient!sb;)V")
	public NpcTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aClass332_102 = arg4;
		this.aClass332_101 = arg3;
		this.aBoolean622 = arg2;
		this.anInt8109 = arg1;
		this.aClass379_6 = arg0;
		if (this.aClass332_101 != null) {
			@Pc(44) int local44 = this.aClass332_101.method7604() - 1;
			this.aClass332_101.getGroupCapacity(local44);
		}
		if (Static673.runescapeGame == this.aClass379_6) {
			this.aStringArray39 = new String[] { null, null, null, null, null, Static32.aClass32_22.getLocalization(this.anInt8109) };
		} else {
			this.aStringArray39 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
	public void method7092() {
		synchronized (this.types) {
			this.types.method2147(5);
		}
		synchronized (this.bodyModels) {
			this.bodyModels.method2147(5);
		}
		synchronized (this.headModels) {
			this.headModels.method2147(5);
		}
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	public void method7093() {
		synchronized (this.types) {
			this.types.method2157();
		}
		synchronized (this.bodyModels) {
			this.bodyModels.method2157();
		}
		synchronized (this.headModels) {
			this.headModels.method2157();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	public void method7096() {
		synchronized (this.types) {
			this.types.method2151();
		}
		synchronized (this.bodyModels) {
			this.bodyModels.method2151();
		}
		synchronized (this.headModels) {
			this.headModels.method2151();
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
		synchronized (this.bodyModels) {
			this.bodyModels.method2157();
		}
		synchronized (this.headModels) {
			this.headModels.method2157();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)Lclient!o;")
	public Class270 method7099(@OriginalArg(0) int arg0) {
		@Pc(24) Class270 local24;
		synchronized (this.types) {
			local24 = (Class270) this.types.get(arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(51) byte[] local51;
		synchronized (this.aClass332_101) {
			local51 = this.aClass332_101.fetchFile(Static612.method8244(arg0), Static713.method9343(arg0));
		}
		local24 = new Class270();
		local24.aClass310_1 = this;
		local24.anInt6764 = arg0;
		local24.aStringArray34 = this.aStringArray39.clone();
		if (local51 != null) {
			local24.method5993(new Buffer(local51));
		}
		local24.method5990();
		synchronized (this.types) {
			this.types.put(local24, arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZI)V")
	public void method7100(@OriginalArg(1) int arg0) {
		this.anInt8111 = arg0;
		synchronized (this.bodyModels) {
			this.bodyModels.method2157();
		}
		synchronized (this.headModels) {
			this.headModels.method2157();
		}
	}
}
