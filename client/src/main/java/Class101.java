import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class101 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!qha;")
	protected final Class19_Sub3 aClass19_Sub3_42;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class101(@OriginalArg(0) Class19_Sub3 arg0) {
		this.aClass19_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!kd;II)V")
	public abstract void method6805(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public abstract void method6806();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public abstract void method6807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
	public abstract void method6808(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Z")
	public abstract boolean method6810();

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(ZI)V")
	public abstract void method6811(@OriginalArg(0) boolean arg0);
}
