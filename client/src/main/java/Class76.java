import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class76 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[Lclient!gja;")
	public Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public int anInt2141;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ge;Lclient!kda;)Lclient!gja;")
	private Interface10 method1291(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) Class204 arg1) {
		if (Static515.aClass204_10 == arg1) {
			return Static652.method6075(arg0);
		} else if (Static77.aClass204_1 == arg1) {
			return Static502.method4733(arg0);
		} else if (arg1 == Static166.aClass204_6) {
			return Static35.method477(arg0);
		} else if (Static647.aClass204_13 == arg1) {
			return Static464.method4400(arg0);
		} else if (Static541.aClass204_12 == arg1) {
			return Static515.method4791(arg0);
		} else if (arg1 == Static565.aClass204_9) {
			return Static303.method3085(arg0);
		} else if (Static535.aClass204_11 == arg1) {
			return Static715.method6735(arg0);
		} else if (arg1 == Static189.aClass204_7) {
			return Static452.method4280(arg0);
		} else if (arg1 == Static667.aClass204_15) {
			return Static112.method1345(arg0);
		} else if (arg1 == Static505.aClass204_16) {
			return Static353.method5984(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method1293(@OriginalArg(0) Class2_Sub21 arg0) {
		this.anInt2140 = arg0.method5192();
		this.anInt2141 = arg0.method5191();
		this.anInterface10Array1 = new Interface10[arg0.method5205()];
		@Pc(31) Class204[] local31 = Static370.method3738();
		for (@Pc(33) int local33 = 0; local33 < this.anInterface10Array1.length; local33++) {
			this.anInterface10Array1[local33] = this.method1291(arg0, local31[arg0.method5205()]);
		}
	}
}
