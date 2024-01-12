import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public final class Class247 {

	@OriginalMember(owner = "client!mka", name = "l", descriptor = "I")
	public int anInt6240;

	@OriginalMember(owner = "client!mka", name = "i", descriptor = "I")
	public int anInt6241;

	@OriginalMember(owner = "client!mka", name = "p", descriptor = "I")
	public int anInt6242;

	@OriginalMember(owner = "client!mka", name = "g", descriptor = "I")
	public int anInt6244;

	@OriginalMember(owner = "client!mka", name = "n", descriptor = "I")
	public int anInt6247;

	@OriginalMember(owner = "client!mka", name = "c", descriptor = "I")
	public int anInt6249;

	@OriginalMember(owner = "client!mka", name = "k", descriptor = "I")
	public int anInt6251;

	@OriginalMember(owner = "client!mka", name = "o", descriptor = "I")
	public int anInt6252;

	@OriginalMember(owner = "client!mka", name = "b", descriptor = "I")
	public int anInt6243 = 128;

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "I")
	public int anInt6246 = 128;

	@OriginalMember(owner = "client!mka", name = "h", descriptor = "I")
	public int anInt6245;

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(I)V")
	public Class247(@OriginalArg(0) int arg0) {
		this.anInt6245 = arg0;
	}

	@OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(IIIIII)V")
	private Class247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6242 = arg3;
		this.anInt6246 = arg2;
		this.anInt6249 = arg4;
		this.anInt6243 = arg1;
		this.anInt6245 = arg0;
		this.anInt6251 = arg5;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(Lclient!mka;I)V")
	public void method5580(@OriginalArg(0) Class247 arg0) {
		this.anInt6249 = arg0.anInt6249;
		this.anInt6242 = arg0.anInt6242;
		this.anInt6243 = arg0.anInt6243;
		this.anInt6246 = arg0.anInt6246;
		this.anInt6245 = arg0.anInt6245;
		this.anInt6251 = arg0.anInt6251;
	}

	@OriginalMember(owner = "client!mka", name = "a", descriptor = "(B)Lclient!mka;")
	public Class247 method5581() {
		return new Class247(this.anInt6245, this.anInt6243, this.anInt6246, this.anInt6242, this.anInt6249, this.anInt6251);
	}
}
