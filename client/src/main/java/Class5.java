import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class5 implements Interface13 {

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "Lclient!gi;")
	private final Class146 aClass146_1;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class5(@OriginalArg(0) Class146 arg0) {
		this.aClass146_1 = arg0;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)V")
	@Override
	public void method7755() {
	}

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7754() {
		return true;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7756() {
		Static163.aClass19_17.aa(0, 0, GameShell.canvasWidth, GameShell.canvasHeight, this.aClass146_1.anInt3451, 0);
	}
}
