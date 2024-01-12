import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public final class Class388 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[S")
	public final short[] aShortArray145;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "[I")
	public final int[] anIntArray816;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "[S")
	public final short[] aShortArray146;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "J")
	public final long aLong312;

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class388(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray145 = arg3;
		this.anIntArray816 = arg1;
		this.aShortArray146 = arg2;
		this.aLong312 = arg0;
	}
}
