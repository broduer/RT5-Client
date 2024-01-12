import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class Class138 implements Interface10 {

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public final int anInt4426;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public final int anInt4428;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Lclient!wk;")
	public final Class405 aClass405_10;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public final int anInt4429;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "Lclient!ek;")
	public final Class103 aClass103_10;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "I")
	public final int anInt4431;

	@OriginalMember(owner = "client!is", name = "n", descriptor = "I")
	public final int anInt4436;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public final int anInt4425;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public final int anInt4434;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Lclient!wk;Lclient!ek;IIIIIII)V")
	public Class138(@OriginalArg(0) Class405 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt4426 = arg5;
		this.anInt4428 = arg7;
		this.aClass405_10 = arg0;
		this.anInt4429 = arg6;
		this.aClass103_10 = arg1;
		this.anInt4431 = arg4;
		this.anInt4436 = arg2;
		this.anInt4425 = arg3;
		this.anInt4434 = arg8;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return null;
	}
}
