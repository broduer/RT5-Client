import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class374 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	private int anInt9639 = -1;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	private int anInt9641 = 0;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!sia;")
	private Class341 aClass341_69 = new Class341();

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Z")
	public boolean aBoolean738 = false;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	private final int anInt9636;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private final int anInt9638;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "[Lclient!iia;")
	private Class2_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
	public Class374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9636 = arg0;
		this.anInt9638 = arg1;
		this.aClass2_Sub27Array1 = new Class2_Sub27[this.anInt9638];
		this.anIntArrayArrayArray20 = new int[this.anInt9636][3][arg2];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	public void method8456() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt9636; local15++) {
			this.anIntArrayArrayArray20[local15][0] = null;
			this.anIntArrayArrayArray20[local15][1] = null;
			this.anIntArrayArrayArray20[local15][2] = null;
			this.anIntArrayArrayArray20[local15] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass2_Sub27Array1 = null;
		this.aClass341_69.method7707();
		this.aClass341_69 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	public int[][] method8457(@OriginalArg(0) int arg0) {
		if (this.anInt9636 == this.anInt9638) {
			this.aBoolean738 = this.aClass2_Sub27Array1[arg0] == null;
			this.aClass2_Sub27Array1[arg0] = Static528.aClass2_Sub27_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt9636 == 1) {
			this.aBoolean738 = this.anInt9639 != arg0;
			this.anInt9639 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(78) Class2_Sub27 local78 = this.aClass2_Sub27Array1[arg0];
			if (local78 == null) {
				this.aBoolean738 = true;
				if (this.anInt9641 < this.anInt9636) {
					local78 = new Class2_Sub27(arg0, this.anInt9641);
					this.anInt9641++;
				} else {
					@Pc(111) Class2_Sub27 local111 = (Class2_Sub27) this.aClass341_69.method7715();
					local78 = new Class2_Sub27(arg0, local111.anInt4365);
					this.aClass2_Sub27Array1[local111.anInt4369] = null;
					local111.unlink();
				}
				this.aClass2_Sub27Array1[arg0] = local78;
			} else {
				this.aBoolean738 = false;
			}
			this.aClass341_69.method7704(local78);
			return this.anIntArrayArrayArray20[local78.anInt4365];
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)[[[I")
	public int[][][] method8458() {
		if (this.anInt9638 != this.anInt9636) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(20) int local20 = 0; local20 < this.anInt9636; local20++) {
			this.aClass2_Sub27Array1[local20] = Static528.aClass2_Sub27_1;
		}
		return this.anIntArrayArrayArray20;
	}
}
