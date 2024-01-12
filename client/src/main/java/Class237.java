import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class237 implements Interface10 {

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
	public final int anInt5990;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "I")
	public final int anInt5991;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "Lclient!ek;")
	public final Class103 aClass103_11;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "I")
	public final int anInt5997;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
	public final int anInt5992;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
	public final int anInt5996;

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
	public final int anInt5994;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "Lclient!wk;")
	public final Class405 aClass405_11;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "I")
	public final int anInt5998;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "Z")
	public final boolean aBoolean454;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
	public final int anInt5995;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(ILclient!wk;Lclient!ek;IIIIIIIZ)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) Class405 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5990 = arg6;
		this.anInt5991 = arg7;
		this.aClass103_11 = arg2;
		this.anInt5997 = arg3;
		this.anInt5992 = arg9;
		this.anInt5996 = arg5;
		this.anInt5994 = arg4;
		this.aClass405_11 = arg1;
		this.anInt5998 = arg0;
		this.aBoolean454 = arg10;
		this.anInt5995 = arg8;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return Static166.aClass206_6;
	}
}
