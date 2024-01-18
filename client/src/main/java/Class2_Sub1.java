import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public abstract class Class2_Sub1 extends Node {

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	public int anInt10909;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Lclient!ug;")
	protected Class374 aClass374_41;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!ija;")
	protected Class180 aClass180_41;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Z")
	public boolean aBoolean825;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "[Lclient!pf;")
	public final Class2_Sub1[] aClass2_Sub1Array42;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IZ)V")
	protected Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean825 = arg1;
		this.aClass2_Sub1Array42 = new Class2_Sub1[arg0];
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[I")
	public int[] method9418(@OriginalArg(1) int arg1) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
	public int method9419() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)[[I")
	protected final int[][] method9420(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass2_Sub1Array42[arg0].aBoolean825) {
			@Pc(36) int[] local36 = this.aClass2_Sub1Array42[arg0].method9418(arg1);
			return new int[][] { local36, local36, local36 };
		} else {
			return this.aClass2_Sub1Array42[arg0].method9421(arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)[[I")
	public int[][] method9421(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLclient!ge;I)V")
	public void method9423(@OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIZ)V")
	public void method9425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt10909 == 255 ? arg0 : this.anInt10909;
		if (this.aBoolean825) {
			this.aClass180_41 = new Class180(local22, arg0, arg1);
		} else {
			this.aClass374_41 = new Class374(local22, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
	public int method9426() {
		return -1;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public void method9428() {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)[I")
	protected final int[] method9429(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.aClass2_Sub1Array42[arg1].aBoolean825 ? this.aClass2_Sub1Array42[arg1].method9418(arg0) : this.aClass2_Sub1Array42[arg1].method9421(arg0)[0];
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method9430() {
		if (this.aBoolean825) {
			this.aClass180_41.method3934();
			this.aClass180_41 = null;
		} else {
			this.aClass374_41.method8456();
			this.aClass374_41 = null;
		}
	}
}
