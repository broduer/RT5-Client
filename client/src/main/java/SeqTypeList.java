import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public final class SeqTypeList {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_22 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_23 = new SoftLruHashTable(100);

	@OriginalMember(owner = "client!bp", name = "j", descriptor = "Lclient!sb;")
	private final Js5 aClass332_11;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;Lclient!sb;Lclient!sb;)V")
	public SeqTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2, @OriginalArg(3) Js5 arg3, @OriginalArg(4) Js5 arg4) {
		this.aClass332_11 = arg2;
		if (this.aClass332_11 != null) {
			@Pc(26) int local26 = this.aClass332_11.method7604() - 1;
			this.aClass332_11.getGroupCapacity(local26);
		}
		Static642.method8447(arg4, arg3);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)Lclient!cka;")
	public SeqType method1162(@OriginalArg(0) int arg0) {
		@Pc(16) SeqType local16;
		synchronized (this.aClass82_22) {
			local16 = (SeqType) this.aClass82_22.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(43) byte[] local43;
		synchronized (this.aClass332_11) {
			local43 = this.aClass332_11.fetchFile(Static668.method8709(arg0), Static291.method4233(arg0));
		}
		local16 = new SeqType();
		local16.anInt1657 = arg0;
		if (local43 != null) {
			local16.method1585(new Buffer(local43));
		}
		local16.method1584();
		synchronized (this.aClass82_22) {
			this.aClass82_22.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public void method1163() {
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2147(5);
		}
		synchronized (this.aClass82_23) {
			this.aClass82_23.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method1164() {
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2151();
		}
		synchronized (this.aClass82_23) {
			this.aClass82_23.method2151();
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
	public void method1165() {
		synchronized (this.aClass82_22) {
			this.aClass82_22.method2157();
		}
		synchronized (this.aClass82_23) {
			this.aClass82_23.method2157();
		}
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(II)Lclient!rw;")
	public SecondaryNode_Sub18 method1166(@OriginalArg(0) int arg0) {
		synchronized (this.aClass82_23) {
			@Pc(22) SecondaryNode_Sub18 local22 = (SecondaryNode_Sub18) this.aClass82_23.get(arg0);
			if (local22 == null) {
				local22 = new SecondaryNode_Sub18(arg0);
				this.aClass82_23.put(local22, arg0);
			}
			return local22.method7572() ? local22 : null;
		}
	}
}
