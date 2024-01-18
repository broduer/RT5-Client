import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class67_Sub2_Sub1 extends Class67_Sub2 {

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "Lclient!fv;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
	private final int anInt10360;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private final int anInt10363;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	private final int anInt10367;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
	private final int anInt10361;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
	private final int anInt10366;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	private final int anInt10368;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "Lclient!am;")
	private final Class19_Sub1 aClass19_Sub1_22;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!am;IIIIII)V")
	public Class67_Sub2_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt10360 = arg2;
		this.anInt10363 = arg3;
		this.anInt10367 = arg6;
		this.anInt10361 = arg5;
		this.anInt10366 = arg1;
		this.anInt10368 = arg4;
		this.aClass19_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)Lclient!fv;")
	@Override
	public Interface8 method8961() {
		if (this.anInterface8_1 == null) {
			Static601.anIntArray705[4] = this.anInt10361;
			Static601.anIntArray705[5] = this.anInt10367;
			Static601.anIntArray705[1] = this.anInt10360;
			Static601.anIntArray705[0] = this.anInt10366;
			Static601.anIntArray705[2] = this.anInt10363;
			Static601.anIntArray705[3] = this.anInt10368;
			@Pc(42) TextureProvider local42 = this.aClass19_Sub1_22.anInterface4_10;
			@Pc(44) boolean local44 = false;
			@Pc(46) int local46 = 0;
			for (@Pc(48) int local48 = 0; local48 < 6; local48++) {
				if (!local42.method6821(Static601.anIntArray705[local48])) {
					return null;
				}
				@Pc(71) Material local71 = local42.method6824(Static601.anIntArray705[local48]);
				@Pc(79) int local79 = local71.aBoolean233 ? 64 : 128;
				if (local79 > local46) {
					local46 = local79;
				}
				if (local71.aByte53 > 0) {
					local44 = true;
				}
			}
			for (@Pc(102) int local102 = 0; local102 < 6; local102++) {
				Static518.anIntArrayArray262[local102] = local42.method6825(local46, false, local46, Static601.anIntArray705[local102], 1.0F);
			}
			this.anInterface8_1 = this.aClass19_Sub1_22.method8070(local46, Static518.anIntArrayArray262, local44);
		}
		return this.anInterface8_1;
	}
}
