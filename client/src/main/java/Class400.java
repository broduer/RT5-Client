import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class400 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!tu;")
	private Class364 aClass364_2;

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!sb;")
	private final Js5 aClass332_124;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!sb;")
	private final Js5 aClass332_125;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!sb;Lclient!sb;)V")
	public Class400(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		this.aClass332_124 = arg1;
		this.aClass332_125 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!gja;)Lclient!jd;")
	public Interface13 method9175(@OriginalArg(1) Interface10 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(18) Class206 local18 = arg0.method5364();
		if (local18 == Static515.aClass206_10) {
			return new Class5((Class146) arg0);
		} else if (local18 == Static166.aClass206_6) {
			return new Class292(this.method9177(), (Class237) arg0);
		} else if (local18 == Static541.aClass206_12) {
			return new Class37(this.aClass332_125, (Class160) arg0);
		} else if (Static647.aClass206_13 == local18) {
			return new Class37_Sub1(this.aClass332_125, (Class160_Sub1) arg0);
		} else if (Static77.aClass206_1 == local18) {
			return new Class90_Sub1(this.aClass332_125, this.aClass332_124, (Class138_Sub3) arg0);
		} else if (Static565.aClass206_9 == local18) {
			return new Class90_Sub3(this.aClass332_125, this.aClass332_124, (Class138_Sub2) arg0);
		} else if (Static535.aClass206_11 == local18) {
			return new Class90_Sub2(this.aClass332_125, this.aClass332_124, (Class138_Sub1) arg0);
		} else if (local18 == Static189.aClass206_7) {
			return new Class133(this.aClass332_125, this.aClass332_124, (Class125) arg0);
		} else if (local18 == Static667.aClass206_15) {
			return new Class109(this.aClass332_125, (Class202) arg0);
		} else if (Static505.aClass206_16 == local18) {
			return new Class90_Sub2_Sub1(this.aClass332_125, this.aClass332_124, (Class138_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)Lclient!tu;")
	private Class364 method9177() {
		if (this.aClass364_2 == null) {
			this.aClass364_2 = new Class364();
		}
		return this.aClass364_2;
	}
}
