import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bka")
public final class QuestTypeList {

	@OriginalMember(owner = "client!bka", name = "d", descriptor = "Lclient!dla;")
	private final SoftLruHashTable aClass82_17 = new SoftLruHashTable(64);

	@OriginalMember(owner = "client!bka", name = "h", descriptor = "Lclient!sb;")
	private final Js5 aClass332_9;

	@OriginalMember(owner = "client!bka", name = "<init>", descriptor = "(Lclient!ul;ILclient!sb;)V")
	public QuestTypeList(@OriginalArg(0) ModeGame arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Js5 arg2) {
		this.aClass332_9 = arg2;
		if (this.aClass332_9 != null) {
			this.aClass332_9.getGroupCapacity(35);
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(B)V")
	public void method1093() {
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2151();
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IB)Lclient!la;")
	public QuestType method1094(@OriginalArg(0) int arg0) {
		@Pc(16) QuestType local16;
		synchronized (this.aClass82_17) {
			local16 = (QuestType) this.aClass82_17.get(arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(39) byte[] local39;
		synchronized (this.aClass332_9) {
			local39 = this.aClass332_9.fetchFile(arg0, 35);
		}
		local16 = new QuestType();
		if (local39 != null) {
			local16.method5134(new Buffer(local39));
		}
		local16.method5130();
		synchronized (this.aClass82_17) {
			this.aClass82_17.put(local16, arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(II)V")
	public void method1096() {
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2147(5);
		}
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(I)V")
	public void method1098() {
		synchronized (this.aClass82_17) {
			this.aClass82_17.method2157();
		}
	}
}
