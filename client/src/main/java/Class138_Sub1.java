import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
	public final int anInt3191;

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
	public final int anInt3197;

	@OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
	public final int anInt3198;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	public final int anInt3199;

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	public final int anInt3194;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public final int anInt3192;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!wk;Lclient!ek;IIIIIIIIIIIII)V")
	public Class138_Sub1(@OriginalArg(0) Class405 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3191 = arg14;
		this.anInt3197 = arg9;
		this.anInt3198 = arg11;
		this.anInt3199 = arg10;
		this.anInt3194 = arg12;
		this.anInt3192 = arg13;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return Static535.aClass206_11;
	}
}
