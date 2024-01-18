import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class FloTypeList {

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_55 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
	public int anInt2518 = 0;

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aClass332_23;

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
	public final int anInt2515;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public FloTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_23 = arg2;
		this.anInt2515 = this.aClass332_23.getGroupCapacity(4);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method2349() {
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2157();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public void method2351() {
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2151();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)Lclient!re;")
	public FloType method2352(@OriginalArg(0) int arg0) {
		@Pc(25) FloType local25;
		synchronized (this.aClass82_55) {
			local25 = (FloType) this.aClass82_55.get(arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(48) byte[] local48;
		synchronized (this.aClass332_23) {
			local48 = this.aClass332_23.fetchFile(arg0, 4);
		}
		local25 = new FloType();
		local25.aClass96_5 = this;
		local25.anInt8276 = arg0;
		if (local48 != null) {
			local25.method7263(new Buffer(local48));
		}
		local25.method7261();
		synchronized (this.aClass82_55) {
			this.aClass82_55.put(local25, arg0);
			return local25;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method2355() {
		@Pc(2) SoftLruHashTable local2 = this.aClass82_55;
		synchronized (this.aClass82_55) {
			this.aClass82_55.method2147(5);
		}
	}
}
