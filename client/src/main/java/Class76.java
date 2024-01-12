import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class76 {

	@OriginalMember(owner = "client!de", name = "d", descriptor = "[Lclient!gja;")
	public Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	public int anInt2149;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!ge;Lclient!kda;)Lclient!gja;")
	private Interface10 method2030(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) Class206 arg1) {
		if (Static515.aClass206_10 == arg1) {
			return Static652.method8538(arg0);
		} else if (Static77.aClass206_1 == arg1) {
			return Static502.method6727(arg0);
		} else if (arg1 == Static166.aClass206_6) {
			return Static35.method935(arg0);
		} else if (Static647.aClass206_13 == arg1) {
			return Static464.method6308(arg0);
		} else if (Static541.aClass206_12 == arg1) {
			return Static515.method6810(arg0);
		} else if (arg1 == Static565.aClass206_9) {
			return Static303.method4437(arg0);
		} else if (Static535.aClass206_11 == arg1) {
			return Static715.method9353(arg0);
		} else if (arg1 == Static189.aClass206_7) {
			return Static452.method6178(arg0);
		} else if (arg1 == Static667.aClass206_15) {
			return Static112.method2106(arg0);
		} else if (arg1 == Static505.aClass206_16) {
			return Static353.method8437(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ge;B)V")
	public void method2032(@OriginalArg(0) Class2_Sub21 arg0) {
		this.anInt2149 = arg0.method7390();
		this.anInt2150 = arg0.method7389();
		this.anInterface10Array1 = new Interface10[arg0.method7403()];
		@Pc(31) Class206[] local31 = Static370.method5288();
		for (@Pc(33) int local33 = 0; local33 < this.anInterface10Array1.length; local33++) {
			this.anInterface10Array1[local33] = this.method2030(arg0, local31[arg0.method7403()]);
		}
	}
}
