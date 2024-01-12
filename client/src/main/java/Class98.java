import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class98 {

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
	private int anInt2528 = 0;

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	private int anInt2529 = 0;

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	private int anInt2531 = 0;

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!qha;")
	private final Class19_Sub3 aClass19_Sub3_5;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!sa;")
	private final Class331 aClass331_1;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "[Lclient!ua;")
	private final Class101[] aClass101Array1;

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Lclient!nia;")
	public final Class101_Sub6 aClass101_Sub6_1;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!qha;)V")
	public Class98(@OriginalArg(0) Class19_Sub3 arg0) {
		this.aClass19_Sub3_5 = arg0;
		this.aClass331_1 = new Class331(arg0);
		this.aClass101Array1 = new Class101[10];
		this.aClass101Array1[1] = new Class101_Sub1(arg0);
		this.aClass101Array1[2] = new Class101_Sub9(arg0, this.aClass331_1);
		this.aClass101Array1[4] = new Class101_Sub2(arg0, this.aClass331_1);
		this.aClass101Array1[5] = new Class101_Sub5(arg0, this.aClass331_1);
		this.aClass101Array1[6] = new Class101_Sub8(arg0);
		this.aClass101Array1[7] = new Class101_Sub3(arg0);
		this.aClass101Array1[3] = this.aClass101_Sub6_1 = new Class101_Sub6(arg0);
		this.aClass101Array1[8] = new Class101_Sub4(arg0, this.aClass331_1);
		this.aClass101Array1[9] = new Class101_Sub7(arg0, this.aClass331_1);
		if (!this.aClass101Array1[8].method9438()) {
			this.aClass101Array1[8] = this.aClass101Array1[4];
		}
		if (!this.aClass101Array1[9].method9438()) {
			this.aClass101Array1[9] = this.aClass101Array1[8];
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)Z")
	public boolean method2357() {
		return this.aClass101Array1[3].method9438();
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BILclient!kd;)Z")
	public boolean method2359(@OriginalArg(1) int arg0, @OriginalArg(2) Class93 arg1) {
		if (this.anInt2528 == 0) {
			return false;
		} else {
			this.aClass101Array1[Integer.MAX_VALUE & this.anInt2528].method9433(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZZII)V")
	public void method2360(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) boolean local9 = arg1 & this.aClass19_Sub3_5.method7997();
		if (!local9 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg0 = arg3;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg2) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (arg4 != this.anInt2528) {
			if (this.anInt2528 != 0) {
				this.aClass101Array1[this.anInt2528 & Integer.MAX_VALUE].method9434();
			}
			if (arg4 != 0) {
				this.aClass101Array1[Integer.MAX_VALUE & arg4].method9439(arg2);
				this.aClass101Array1[arg4 & Integer.MAX_VALUE].method9436(arg2);
				this.aClass101Array1[arg4 & Integer.MAX_VALUE].method9435(arg0, arg3);
			}
			this.anInt2529 = arg0;
			this.anInt2531 = arg3;
			this.anInt2528 = arg4;
		} else if (this.anInt2528 != 0) {
			this.aClass101Array1[this.anInt2528 & Integer.MAX_VALUE].method9436(arg2);
			if (this.anInt2531 != arg3 || this.anInt2529 != arg0) {
				this.aClass101Array1[this.anInt2528 & Integer.MAX_VALUE].method9435(arg0, arg3);
				this.anInt2529 = arg0;
				this.anInt2531 = arg3;
			}
			return;
		}
	}
}
