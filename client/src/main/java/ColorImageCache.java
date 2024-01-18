import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class ColorImageCache {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	private int anInt9639 = -1;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	private int anInt9641 = 0;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Lclient!sia;")
	private LinkedList aClass341_69 = new LinkedList();

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	private final int anInt9636;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
	private final int anInt9638;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "[Lclient!iia;")
	private Node_Sub27[] aClass2_Sub27Array1;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(III)V")
	public ColorImageCache(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9636 = arg0;
		this.anInt9638 = arg1;
		this.aClass2_Sub27Array1 = new Node_Sub27[this.anInt9638];
		this.anIntArrayArrayArray20 = new int[this.anInt9636][3][arg2];
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	public void clear() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt9636; local15++) {
			this.anIntArrayArrayArray20[local15][0] = null;
			this.anIntArrayArrayArray20[local15][1] = null;
			this.anIntArrayArrayArray20[local15][2] = null;
			this.anIntArrayArrayArray20[local15] = null;
		}
		this.anIntArrayArrayArray20 = null;
		this.aClass2_Sub27Array1 = null;
		this.aClass341_69.clear();
		this.aClass341_69 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[[I")
	public int[][] get(@OriginalArg(0) int arg0) {
		if (this.anInt9636 == this.anInt9638) {
			this.invalid = this.aClass2_Sub27Array1[arg0] == null;
			this.aClass2_Sub27Array1[arg0] = Static528.aClass2_Sub27_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt9636 == 1) {
			this.invalid = this.anInt9639 != arg0;
			this.anInt9639 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(78) Node_Sub27 local78 = this.aClass2_Sub27Array1[arg0];
			if (local78 == null) {
				this.invalid = true;
				if (this.anInt9641 < this.anInt9636) {
					local78 = new Node_Sub27(arg0, this.anInt9641);
					this.anInt9641++;
				} else {
					@Pc(111) Node_Sub27 local111 = (Node_Sub27) this.aClass341_69.tail();
					local78 = new Node_Sub27(arg0, local111.anInt4365);
					this.aClass2_Sub27Array1[local111.anInt4369] = null;
					local111.unlink();
				}
				this.aClass2_Sub27Array1[arg0] = local78;
			} else {
				this.invalid = false;
			}
			this.aClass341_69.addHead(local78);
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
