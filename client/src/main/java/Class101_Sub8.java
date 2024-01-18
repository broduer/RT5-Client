import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public final class Class101_Sub8 extends Class101 {

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class101_Sub8(@OriginalArg(0) Class19_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6808(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	@Override
	public void method6806() {
		super.aClass19_Sub3_42.method4915(false);
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method6811(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub3_42.method4915(true);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method6805(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method4876(arg0);
		super.aClass19_Sub3_42.method4866(arg1);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method6810() {
		return true;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
	@Override
	public void method6807(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
