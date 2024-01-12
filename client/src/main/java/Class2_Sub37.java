import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public final class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
	public int anInt6207 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
	public int anInt6206 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
	public int anInt6205 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public int anInt6211 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
	public int anInt6204 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	public int anInt6210 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public int anInt6215 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
	public int anInt6212 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "Lclient!fu;")
	public final Class2_Sub20 aClass2_Sub20_1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lclient!fu;)V")
	public Class2_Sub37(@OriginalArg(0) Class2_Sub20 arg0) {
		this.aClass2_Sub20_1 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)Z")
	public boolean method5560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= this.anInt6215 && arg0 <= this.anInt6210 && arg1 >= this.anInt6206 && arg1 <= this.anInt6211) {
			return true;
		} else {
			return this.anInt6212 <= arg0 && arg0 <= this.anInt6205 && this.anInt6204 <= arg1 && arg1 <= this.anInt6207;
		}
	}
}
