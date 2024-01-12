import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public final class Class125 implements Interface10 {

	@OriginalMember(owner = "client!fea", name = "o", descriptor = "I")
	public final int anInt2876;

	@OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
	public final int anInt2869;

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString30;

	@OriginalMember(owner = "client!fea", name = "p", descriptor = "I")
	public final int anInt2879;

	@OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
	public final int anInt2877;

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	public final int anInt2875;

	@OriginalMember(owner = "client!fea", name = "q", descriptor = "I")
	public final int anInt2874;

	@OriginalMember(owner = "client!fea", name = "l", descriptor = "I")
	public final int anInt2868;

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "Lclient!ek;")
	public final Class103 aClass103_3;

	@OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
	public final int anInt2871;

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Lclient!wk;")
	public final Class405 aClass405_2;

	@OriginalMember(owner = "client!fea", name = "m", descriptor = "I")
	public final int anInt2867;

	@OriginalMember(owner = "client!fea", name = "n", descriptor = "I")
	public final int anInt2878;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!wk;Lclient!ek;IIIIIIIIII)V")
	public Class125(@OriginalArg(0) String arg0, @OriginalArg(1) Class405 arg1, @OriginalArg(2) Class103 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt2876 = arg11;
		this.anInt2869 = arg5;
		this.aString30 = arg0;
		this.anInt2879 = arg6;
		this.anInt2877 = arg3;
		this.anInt2875 = arg7;
		this.anInt2874 = arg8;
		this.anInt2868 = arg9;
		this.aClass103_3 = arg2;
		this.anInt2871 = arg12;
		this.aClass405_2 = arg1;
		this.anInt2867 = arg10;
		this.anInt2878 = arg4;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)Lclient!kda;")
	@Override
	public Class206 method5364() {
		return Static189.aClass206_7;
	}
}
