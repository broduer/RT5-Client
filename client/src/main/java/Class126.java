import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class126 {

	@OriginalMember(owner = "client!ffa", name = "n", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
	public void method2671() {
		this.anInt2898 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)I")
	public int method2673(@OriginalArg(0) int arg0) {
		if (arg0 != 16383) {
			this.method2676(27, -51, 39, -81);
		}
		return this.anInt2898 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BI)V")
	public void method2675(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.anInt2898 = arg1;
		if (arg0 >= 46) {
			this.anInt2900 = 0;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIII)Z")
	public boolean method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(6) int local6 = this.anInt2900;
		if (arg0 == this.anInt2898 && this.anInt2900 == 0) {
			return false;
		}
		@Pc(73) boolean local73;
		@Pc(97) int local97;
		if (this.anInt2900 == 0) {
			if (arg0 > this.anInt2898 && arg0 <= arg3 + this.anInt2898 || this.anInt2898 > arg0 && this.anInt2898 - arg3 <= arg0) {
				this.anInt2898 = arg0;
				return false;
			}
			local73 = true;
		} else {
			@Pc(102) int local102;
			if (this.anInt2900 > 0 && this.anInt2898 < arg0) {
				local97 = this.anInt2900 * this.anInt2900 / (arg3 * 2);
				local102 = local97 + this.anInt2898;
				if (arg0 > local102 && local102 >= this.anInt2898) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else if (this.anInt2900 < 0 && arg0 < this.anInt2898) {
				local97 = this.anInt2900 * this.anInt2900 / (arg3 * 2);
				local102 = this.anInt2898 - local97;
				if (arg0 < local102 && local102 <= this.anInt2898) {
					local73 = true;
				} else {
					local73 = false;
				}
			} else {
				local73 = false;
			}
		}
		if (arg2 != -21712) {
			this.method2675((byte) -95, -89);
		}
		if (local73) {
			if (arg0 > this.anInt2898) {
				this.anInt2900 += arg3;
				if (arg1 != 0 && arg1 < this.anInt2900) {
					this.anInt2900 = arg1;
				}
			} else {
				this.anInt2900 -= arg3;
				if (arg1 != 0 && -arg1 > this.anInt2900) {
					this.anInt2900 = -arg1;
				}
			}
			if (this.anInt2900 != local6) {
				local97 = this.anInt2900 * this.anInt2900 / (arg3 * 2);
				if (arg0 <= this.anInt2898) {
					if (this.anInt2898 > arg0 && this.anInt2898 - local97 < arg0) {
						this.anInt2900 = local6;
					}
				} else if (local97 + this.anInt2898 > arg0) {
					this.anInt2900 = local6;
				}
			}
		} else if (this.anInt2900 > 0) {
			this.anInt2900 -= arg3;
			if (this.anInt2900 < 0) {
				this.anInt2900 = 0;
			}
		} else {
			this.anInt2900 += arg3;
			if (this.anInt2900 > 0) {
				this.anInt2900 = 0;
			}
		}
		this.anInt2898 += this.anInt2900 + local6 >> 1;
		return local73;
	}
}
