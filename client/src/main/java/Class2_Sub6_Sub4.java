import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uka")
public final class Class2_Sub6_Sub4 extends Class2_Sub6 {

	@OriginalMember(owner = "client!uka", name = "t", descriptor = "Lclient!sia;")
	public final Class339 aClass339_72 = new Class339();

	@OriginalMember(owner = "client!uka", name = "A", descriptor = "Lclient!nn;")
	public final Class2_Sub6_Sub3 aClass2_Sub6_Sub3_2 = new Class2_Sub6_Sub3();

	@OriginalMember(owner = "client!uka", name = "D", descriptor = "Lclient!bd;")
	private final Class2_Sub6_Sub1 aClass2_Sub6_Sub1_4;

	@OriginalMember(owner = "client!uka", name = "<init>", descriptor = "(Lclient!bd;)V")
	public Class2_Sub6_Sub4(@OriginalArg(0) Class2_Sub6_Sub1 arg0) {
		this.aClass2_Sub6_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(I)V")
	@Override
	public void method6559(@OriginalArg(0) int arg0) {
		this.aClass2_Sub6_Sub3_2.method6559(arg0);
		for (@Pc(15) Class2_Sub16 local15 = (Class2_Sub16) this.aClass339_72.method5453(65280); local15 != null; local15 = (Class2_Sub16) this.aClass339_72.method5460()) {
			if (!this.aClass2_Sub6_Sub1_4.method463(local15)) {
				@Pc(27) int local27 = arg0;
				do {
					if (local27 <= local15.anInt2184) {
						this.method6074(local15, local27);
						local15.anInt2184 -= local27;
						break;
					}
					this.method6074(local15, local15.anInt2184);
					local27 -= local15.anInt2184;
				} while (!this.aClass2_Sub6_Sub1_4.method487(local15, (int[]) null, 0, local27));
			}
		}
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "(Lclient!dha;II)V")
	private void method6074(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if ((this.aClass2_Sub6_Sub1_4.anIntArray56[arg0.anInt2187] & 0x4) != 0 && arg0.anInt2202 < 0) {
			@Pc(28) int local28 = this.aClass2_Sub6_Sub1_4.anIntArray57[arg0.anInt2187] / Static686.anInt8944;
			@Pc(37) int local37 = (local28 + 1048575 - arg0.anInt2183) / local28;
			arg0.anInt2183 = arg0.anInt2183 + local28 * arg1 & 0xFFFFF;
			if (local37 <= arg1) {
				if (this.aClass2_Sub6_Sub1_4.anIntArray49[arg0.anInt2187] == 0) {
					arg0.aClass2_Sub6_Sub2_1 = Static730.method2384(arg0.aClass2_Sub49_Sub1_1, arg0.aClass2_Sub6_Sub2_1.method2378(), arg0.aClass2_Sub6_Sub2_1.method2379(), arg0.aClass2_Sub6_Sub2_1.method2386());
				} else {
					arg0.aClass2_Sub6_Sub2_1 = Static730.method2384(arg0.aClass2_Sub49_Sub1_1, arg0.aClass2_Sub6_Sub2_1.method2378(), 0, arg0.aClass2_Sub6_Sub2_1.method2386());
					this.aClass2_Sub6_Sub1_4.method485(arg0.aClass2_Sub11_1.aShortArray16[arg0.anInt2196] < 0, arg0);
				}
				if (arg0.aClass2_Sub11_1.aShortArray16[arg0.anInt2196] < 0) {
					arg0.aClass2_Sub6_Sub2_1.method2356(-1);
				}
				arg1 = arg0.anInt2183 / local28;
			}
		}
		arg0.aClass2_Sub6_Sub2_1.method6559(arg1);
	}

	@OriginalMember(owner = "client!uka", name = "b", descriptor = "()I")
	@Override
	public int method6561() {
		return 0;
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method6564() {
		@Pc(11) Class2_Sub16 local11;
		do {
			local11 = (Class2_Sub16) this.aClass339_72.method5460();
			if (local11 == null) {
				return null;
			}
		} while (local11.aClass2_Sub6_Sub2_1 == null);
		return local11.aClass2_Sub6_Sub2_1;
	}

	@OriginalMember(owner = "client!uka", name = "c", descriptor = "()Lclient!dea;")
	@Override
	public Class2_Sub6 method6562() {
		@Pc(9) Class2_Sub16 local9 = (Class2_Sub16) this.aClass339_72.method5453(65280);
		if (local9 == null) {
			return null;
		} else if (local9.aClass2_Sub6_Sub2_1 == null) {
			return this.method6564();
		} else {
			return local9.aClass2_Sub6_Sub2_1;
		}
	}

	@OriginalMember(owner = "client!uka", name = "a", descriptor = "([ILclient!dha;IIII)V")
	private void method6079(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if ((this.aClass2_Sub6_Sub1_4.anIntArray56[arg1.anInt2187] & 0x4) != 0 && arg1.anInt2202 < 0) {
			@Pc(34) int local34 = this.aClass2_Sub6_Sub1_4.anIntArray57[arg1.anInt2187] / Static686.anInt8944;
			while (true) {
				@Pc(44) int local44 = (local34 + 1048575 - arg1.anInt2183) / local34;
				if (local44 > arg3) {
					arg1.anInt2183 += arg3 * local34;
					break;
				}
				arg1.aClass2_Sub6_Sub2_1.method6560(arg0, arg4, local44);
				arg1.anInt2183 += local34 * local44 - 1048576;
				arg3 -= local44;
				arg4 += local44;
				@Pc(75) int local75 = Static686.anInt8944 / 100;
				@Pc(79) int local79 = 262144 / local34;
				if (local79 < local75) {
					local75 = local79;
				}
				@Pc(91) Class2_Sub6_Sub2 local91 = arg1.aClass2_Sub6_Sub2_1;
				if (this.aClass2_Sub6_Sub1_4.anIntArray49[arg1.anInt2187] == 0) {
					arg1.aClass2_Sub6_Sub2_1 = Static730.method2384(arg1.aClass2_Sub49_Sub1_1, local91.method2378(), local91.method2379(), local91.method2386());
				} else {
					arg1.aClass2_Sub6_Sub2_1 = Static730.method2384(arg1.aClass2_Sub49_Sub1_1, local91.method2378(), 0, local91.method2386());
					this.aClass2_Sub6_Sub1_4.method485(arg1.aClass2_Sub11_1.aShortArray16[arg1.anInt2196] < 0, arg1);
					arg1.aClass2_Sub6_Sub2_1.method2353(local75, local91.method2379());
				}
				if (arg1.aClass2_Sub11_1.aShortArray16[arg1.anInt2196] < 0) {
					arg1.aClass2_Sub6_Sub2_1.method2356(-1);
				}
				local91.method2358(local75);
				local91.method6560(arg0, arg4, arg2 - arg4);
				if (local91.method2374()) {
					this.aClass2_Sub6_Sub3_2.method4173(local91);
				}
			}
		}
		arg1.aClass2_Sub6_Sub2_1.method6560(arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!uka", name = "b", descriptor = "([III)V")
	@Override
	public void method6560(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub6_Sub3_2.method6560(arg0, arg1, arg2);
		for (@Pc(17) Class2_Sub16 local17 = (Class2_Sub16) this.aClass339_72.method5453(65280); local17 != null; local17 = (Class2_Sub16) this.aClass339_72.method5460()) {
			if (!this.aClass2_Sub6_Sub1_4.method463(local17)) {
				@Pc(29) int local29 = arg1;
				@Pc(31) int local31 = arg2;
				do {
					if (local17.anInt2184 >= local31) {
						this.method6079(arg0, local17, local29 + local31, local31, local29);
						local17.anInt2184 -= local31;
						break;
					}
					this.method6079(arg0, local17, local31 + local29, local17.anInt2184, local29);
					local29 += local17.anInt2184;
					local31 -= local17.anInt2184;
				} while (!this.aClass2_Sub6_Sub1_4.method487(local17, arg0, local29, local31));
			}
		}
	}
}
