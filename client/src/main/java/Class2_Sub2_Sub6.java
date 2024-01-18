import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
	public int anInt2072 = 0;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!ge;B)V")
	private void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub21 arg1) {
		if (arg0 == 2) {
			this.anInt2072 = arg1.method5191();
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method1250(@OriginalArg(0) Class2_Sub21 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5205();
			if (local11 == 0) {
				return;
			}
			this.method1249(local11, arg0);
		}
	}
}
