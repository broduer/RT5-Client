import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class207 {

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	private int anInt5141;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	private int anInt5147;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	private int anInt5145;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	private int anInt5149;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	public int anInt5140;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public int anInt5143;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	public int anInt5148;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	public int anInt5142;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
	public int anInt5151;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5150;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5141 = arg0;
		this.anInt5147 = arg2;
		this.anInt5145 = arg1;
		this.anInt5149 = arg3 * arg3;
		this.anInt5140 = this.anInt5141 + arg4;
		this.anInt5143 = arg5 + this.anInt5141;
		this.anInt5148 = this.anInt5147 + arg8;
		this.anInt5142 = arg9 + this.anInt5147;
		this.anInt5151 = this.anInt5145 + arg7;
		this.anInt5150 = arg6 + this.anInt5145;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method4636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5147 = arg6;
		this.anInt5145 = arg2;
		this.anInt5149 = arg5 * arg5;
		this.anInt5141 = arg3;
		this.anInt5150 = arg0 + this.anInt5145;
		this.anInt5148 = arg1 + this.anInt5147;
		this.anInt5151 = this.anInt5145 + arg7;
		this.anInt5143 = arg9 + this.anInt5141;
		this.anInt5140 = arg8 + this.anInt5141;
		this.anInt5142 = arg4 + this.anInt5147;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBII)Z")
	public boolean method4638(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5140 > arg2 || this.anInt5143 < arg2) {
			return false;
		} else if (this.anInt5150 > arg0 || arg0 > this.anInt5151) {
			return false;
		} else if (arg1 >= this.anInt5148 && this.anInt5142 >= arg1) {
			@Pc(74) int local74 = arg2 - this.anInt5141;
			@Pc(79) int local79 = arg1 - this.anInt5147;
			return local79 * local79 + local74 * local74 < this.anInt5149;
		} else {
			return false;
		}
	}
}
