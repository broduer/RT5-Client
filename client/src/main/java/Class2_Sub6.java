import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public abstract class Class2_Sub6 extends Class2 {

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "Lclient!dea;")
	public Class2_Sub6 aClass2_Sub6_9;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
	public int anInt10545;

	@OriginalMember(owner = "client!dea", name = "k", descriptor = "Lclient!rm;")
	public Class2_Sub49 aClass2_Sub49_6;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "Z")
	public volatile boolean aBoolean794 = true;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
	public abstract void method9137(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "([III)V")
	public abstract void method9138(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "()I")
	public abstract int method9139();

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "()Lclient!dea;")
	public abstract Class2_Sub6 method9140();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([III)V")
	protected final void method9141(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean794) {
			this.method9138(arg0, arg1, arg2);
		} else {
			this.method9137(arg2);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "()Lclient!dea;")
	public abstract Class2_Sub6 method9142();

	@OriginalMember(owner = "client!dea", name = "d", descriptor = "()I")
	public int method9143() {
		return 255;
	}
}
