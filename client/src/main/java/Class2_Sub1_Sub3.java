import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!be", name = "N", descriptor = "[C")
	private static final char[] aCharArray1 = new char[64];

	@OriginalMember(owner = "client!be", name = "G", descriptor = "I")
	private int anInt918 = 4096;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	private int anInt921 = 4096;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "I")
	private int anInt923 = 4096;

	static {
		for (@Pc(37) int local37 = 0; local37 < 26; local37++) {
			aCharArray1[local37] = (char) (local37 + 65);
		}
		for (@Pc(53) int local53 = 26; local53 < 52; local53++) {
			aCharArray1[local53] = (char) (local53 + 97 - 26);
		}
		for (@Pc(71) int local71 = 52; local71 < 62; local71++) {
			aCharArray1[local71] = (char) (local71 - 4);
		}
		aCharArray1[62] = '+';
		aCharArray1[63] = '/';
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9421(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass374_41.method8457(arg0);
		if (super.aClass374_41.aBoolean738) {
			@Pc(28) int[][] local28 = this.method9420(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static608.anInt9315; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local60 == local64 && local68 == local64) {
					local44[local54] = this.anInt923 * local60 >> 12;
					local48[local54] = local64 * this.anInt921 >> 12;
					local52[local54] = local68 * this.anInt918 >> 12;
				} else {
					local44[local54] = this.anInt923;
					local48[local54] = this.anInt921;
					local52[local54] = this.anInt918;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public void method9423(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub21 arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Static37.anInt922 = -61;
		}
		if (arg2 == 0) {
			this.anInt923 = arg1.method7389();
		} else if (arg2 == 1) {
			this.anInt921 = arg1.method7389();
		} else if (arg2 == 2) {
			this.anInt918 = arg1.method7389();
		}
	}
}
