import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class Class57 {

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!kv;")
	protected final Class2_Sub34 aClass2_Sub34_34;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
	protected int anInt9515;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class57(@OriginalArg(0) Class2_Sub34 arg0) {
		this.aClass2_Sub34_34 = arg0;
		this.anInt9515 = this.method8361();
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(ILclient!kv;)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub34 arg1) {
		this.anInt9515 = arg0;
		this.aClass2_Sub34_34 = arg1;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public abstract void method8357();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	public final void method8358(@OriginalArg(0) int arg0) {
		if (this.method8359(arg0) != 3) {
			this.method8360(arg0);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)I")
	public abstract int method8359(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
	protected abstract void method8360(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)I")
	protected abstract int method8361();
}
