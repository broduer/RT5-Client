import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class287 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!ld;")
	public Class222 aClass222_1;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public int anInt7200 = -1;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Ljava/lang/String;")
	private String aString82 = "";

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	private int anInt7204 = -1;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public int anInt7205 = 0;

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
	private int anInt7208 = -1;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	private int anInt7201 = -1;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	public int anInt7212 = 0;

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
	public int anInt7211 = 16777215;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public int anInt7213 = 70;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
	public int anInt7199 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt7202 = -1;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	public int anInt7217 = -1;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
	public int anInt7216 = -1;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ha;I)Lclient!st;")
	public Class23 method6458(@OriginalArg(0) Class19 arg0) {
		if (this.anInt7202 < 0) {
			return null;
		}
		@Pc(22) Class23 local22 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7202);
		if (local22 == null) {
			this.method6462(arg0);
			local22 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7202);
		}
		return local22;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(ILclient!ha;)Lclient!st;")
	public Class23 method6459(@OriginalArg(1) Class19 arg0) {
		if (this.anInt7201 < 0) {
			return null;
		}
		@Pc(29) Class23 local29 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7201);
		if (local29 == null) {
			this.method6462(arg0);
			local29 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7201);
		}
		return local29;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ha;B)Lclient!st;")
	public Class23 method6460(@OriginalArg(0) Class19 arg0) {
		if (this.anInt7208 < 0) {
			return null;
		}
		@Pc(27) Class23 local27 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7208);
		if (local27 == null) {
			this.method6462(arg0);
			local27 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7208);
		}
		return local27;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!ha;)Lclient!st;")
	public Class23 method6461(@OriginalArg(1) Class19 arg0) {
		if (this.anInt7204 < 0) {
			return null;
		}
		@Pc(20) Class23 local20 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7204);
		if (local20 == null) {
			this.method6462(arg0);
			local20 = (Class23) this.aClass222_1.aClass82_121.method2156(this.anInt7204);
		}
		return local20;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ILclient!ha;)V")
	private void method6462(@OriginalArg(1) Class19 arg0) {
		@Pc(7) Class332 local7 = this.aClass222_1.aClass332_76;
		@Pc(34) Class409 local34;
		if (this.anInt7204 >= 0 && this.aClass222_1.aClass82_121.method2156(this.anInt7204) == null && local7.method7588(this.anInt7204)) {
			local34 = Static735.method9386(local7, this.anInt7204);
			this.aClass222_1.aClass82_121.method2150(arg0.method7955(local34, true), this.anInt7204);
		}
		if (this.anInt7202 >= 0 && this.aClass222_1.aClass82_121.method2156(this.anInt7202) == null && local7.method7588(this.anInt7202)) {
			local34 = Static735.method9386(local7, this.anInt7202);
			this.aClass222_1.aClass82_121.method2150(arg0.method7955(local34, true), this.anInt7202);
		}
		if (this.anInt7201 >= 0 && this.aClass222_1.aClass82_121.method2156(this.anInt7201) == null && local7.method7588(this.anInt7201)) {
			local34 = Static735.method9386(local7, this.anInt7201);
			this.aClass222_1.aClass82_121.method2150(arg0.method7955(local34, true), this.anInt7201);
		}
		if (this.anInt7208 >= 0 && this.aClass222_1.aClass82_121.method2156(this.anInt7208) == null && local7.method7588(this.anInt7208)) {
			local34 = Static735.method9386(local7, this.anInt7208);
			this.aClass222_1.aClass82_121.method2150(arg0.method7955(local34, true), this.anInt7208);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!ge;BI)V")
	private void method6463(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt7217 = arg0.method7389();
		} else if (arg1 == 2) {
			this.anInt7211 = arg0.method7390();
		} else if (arg1 == 3) {
			this.anInt7204 = arg0.method7389();
		} else if (arg1 == 4) {
			this.anInt7201 = arg0.method7389();
		} else if (arg1 == 5) {
			this.anInt7202 = arg0.method7389();
		} else if (arg1 == 6) {
			this.anInt7208 = arg0.method7389();
		} else if (arg1 == 7) {
			this.anInt7205 = arg0.method7363();
		} else if (arg1 == 8) {
			this.aString82 = arg0.method7350();
		} else if (arg1 == 9) {
			this.anInt7213 = arg0.method7389();
		} else if (arg1 == 10) {
			this.anInt7212 = arg0.method7363();
		} else if (arg1 == 11) {
			this.anInt7200 = 0;
		} else if (arg1 == 12) {
			this.anInt7216 = arg0.method7403();
		} else if (arg1 == 13) {
			this.anInt7199 = arg0.method7363();
		} else if (arg1 == 14) {
			this.anInt7200 = arg0.method7389();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method6464(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = this.aString82;
		while (true) {
			@Pc(14) int local14 = local8.indexOf("%1");
			if (local14 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local14) + Static593.method7787(false, arg0) + local8.substring(local14 + 2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!ge;)V")
	public void method6465(@OriginalArg(1) Class2_Sub21 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7403();
			if (local3 == 0) {
				return;
			}
			this.method6463(arg0, local3);
		}
	}
}
