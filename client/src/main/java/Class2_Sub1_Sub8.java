import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ee", name = "J", descriptor = "[I")
	protected int[] anIntArray641;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	protected int anInt8251;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "I")
	protected int anInt8254;

	@OriginalMember(owner = "client!ee", name = "I", descriptor = "I")
	private int anInt8255 = -1;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method9421(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass374_41.method8457(arg0);
		if (super.aClass374_41.aBoolean738 && this.method7245()) {
			@Pc(25) int[] local25 = local11[0];
			@Pc(29) int[] local29 = local11[1];
			@Pc(33) int[] local33 = local11[2];
			@Pc(50) int local50 = this.anInt8251 * (Static2.anInt53 == this.anInt8254 ? arg0 : arg0 * this.anInt8254 / Static2.anInt53);
			@Pc(60) int local60;
			@Pc(68) int local68;
			if (this.anInt8251 == Static608.anInt9315) {
				for (local60 = 0; local60 < Static608.anInt9315; local60++) {
					local68 = this.anIntArray641[local50++];
					local33[local60] = (local68 & 0xFF) << 4;
					local29[local60] = local68 >> 4 & 0xFF0;
					local25[local60] = local68 >> 12 & 0xFF0;
				}
			} else {
				for (local60 = 0; local60 < Static608.anInt9315; local60++) {
					local68 = this.anInt8251 * local60 / Static608.anInt9315;
					@Pc(122) int local122 = this.anIntArray641[local68 + local50];
					local33[local60] = (local122 & 0xFF) << 4;
					local29[local60] = local122 >> 4 & 0xFF0;
					local25[local60] = local122 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)Z")
	protected final boolean method7245() {
		if (this.anIntArray641 != null) {
			return true;
		} else if (this.anInt8255 >= 0) {
			@Pc(37) Class409 local37 = Static426.anInt944 >= 0 ? Static735.method9389(Static582.aClass332_108, Static426.anInt944, this.anInt8255) : Static735.method9386(Static582.aClass332_108, this.anInt8255);
			local37.method9396();
			this.anIntArray641 = local37.method9390();
			this.anInt8254 = local37.anInt10879;
			this.anInt8251 = local37.anInt10876;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	@Override
	public final void method9430() {
		super.method9430();
		this.anIntArray641 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!ge;I)V")
	@Override
	public final void method9423(@OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			this.anInt8255 = arg1.g2();
		}
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I")
	@Override
	public final int method9419() {
		return this.anInt8255;
	}
}
