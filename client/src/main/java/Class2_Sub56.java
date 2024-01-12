import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class2_Sub56 extends Class2 {

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
	private final int anInt10300;

	@OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
	public final int anInt10303;

	@OriginalMember(owner = "client!vj", name = "k", descriptor = "I")
	public final int anInt10298;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
	private final int anInt10305;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	private final int anInt10308;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
	private final int anInt10299;

	@OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
	public final int anInt10294;

	@OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
	private final int anInt10302;

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "I")
	public final int anInt10293;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class2_Sub56(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt10300 = arg3;
		this.anInt10303 = arg6;
		this.anInt10298 = arg7;
		this.anInt10305 = arg4;
		this.anInt10308 = arg1;
		this.anInt10299 = arg2;
		this.anInt10294 = arg5;
		this.anInt10302 = arg0;
		this.anInt10293 = arg8;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([IIII)V")
	public void method8914(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		arg0[1] = arg1 + this.anInt10294 - this.anInt10308;
		arg0[2] = arg2 + this.anInt10303 - this.anInt10299;
		arg0[0] = 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
	public boolean method8917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt10294 && arg1 <= this.anInt10298 && arg0 >= this.anInt10303 && arg0 <= this.anInt10293;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBII)Z")
	public boolean method8919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return this.anInt10302 == arg1 && arg2 >= this.anInt10308 && arg2 <= this.anInt10300 && arg0 >= this.anInt10299 && arg0 <= this.anInt10305;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[III)V")
	public void method8920(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		arg1[2] = this.anInt10299 + arg2 - this.anInt10303;
		arg1[1] = this.anInt10308 + arg0 - this.anInt10294;
		arg1[0] = this.anInt10302;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBI)Z")
	public boolean method8921(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 >= this.anInt10308 && arg0 <= this.anInt10300 && arg1 >= this.anInt10299 && arg1 <= this.anInt10305;
	}
}
