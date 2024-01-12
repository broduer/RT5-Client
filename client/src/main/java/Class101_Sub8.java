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
	public void method9436(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	@Override
	public void method9434() {
		super.aClass19_Sub3_42.method7047(false);
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(ZI)V")
	@Override
	public void method9439(@OriginalArg(0) boolean arg0) {
		super.aClass19_Sub3_42.method7047(true);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!kd;II)V")
	@Override
	public void method9433(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1) {
		super.aClass19_Sub3_42.method7008(arg0);
		super.aClass19_Sub3_42.method6998(arg1);
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9438() {
		return true;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
