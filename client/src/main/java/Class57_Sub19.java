import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class57_Sub19 extends Class57 {

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57_Sub19(@OriginalArg(0) Class2_Sub34 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)I")
	@Override
	protected int method8361() {
		return super.aClass2_Sub34_34.method5112() == Static673.runescapeGame && super.aClass2_Sub34_34.method5118() ? 0 : 1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	@Override
	public void method8357() {
		super.anInt9515 = this.method8361();
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)I")
	public int method5967() {
		return super.anInt9515;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)I")
	@Override
	public int method8359(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8360(@OriginalArg(1) int arg0) {
		super.anInt9515 = arg0;
	}
}
