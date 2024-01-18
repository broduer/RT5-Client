import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class SpotAnimTypeList {

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
	public int anInt2930;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_61 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "Lclient!dla;")
	public final SoftLruHashTable aClass82_62 = new SoftLruHashTable(60);

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!sb;")
	public final Js5 aClass332_34;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aClass332_33;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;)V")
	public SpotAnimTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3) {
		this.aClass332_34 = arg3;
		this.aClass332_33 = arg2;
		@Pc(26) int local26 = this.aClass332_33.method7604() - 1;
		this.aClass332_33.getGroupCapacity(local26);
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(II)I")
	public static int getGroupId(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)Lclient!lia;")
	public SpotAnimType method2694(@OriginalArg(1) int arg0) {
		@Pc(24) SpotAnimType local24;
		synchronized (this.aClass82_61) {
			local24 = (SpotAnimType) this.aClass82_61.get(arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(51) byte[] local51;
		synchronized (this.aClass332_33) {
			local51 = this.aClass332_33.fetchFile(Static560.method7436(arg0), getGroupId(arg0));
		}
		local24 = new SpotAnimType();
		local24.anInt5853 = arg0;
		local24.aClass128_2 = this;
		if (local51 != null) {
			local24.method5253(new Buffer(local51));
		}
		synchronized (this.aClass82_61) {
			this.aClass82_61.put(local24, arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)V")
	public void method2695(@OriginalArg(1) int arg0) {
		this.anInt2930 = arg0;
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2157();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V")
	public void method2697() {
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2151();
		}
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2151();
		}
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(II)V")
	public void method2698() {
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2147(5);
		}
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2147(5);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public void method2699() {
		synchronized (this.aClass82_61) {
			this.aClass82_61.method2157();
		}
		synchronized (this.aClass82_62) {
			this.aClass82_62.method2157();
		}
	}
}
